package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.OriginalFormatBox;
import com.coremedia.iso.boxes.ProtectionSchemeInformationBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.MemoryDataSourceImpl;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.cenc.CencDecryptingSampleList;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.googlecode.mp4parser.util.Path;
import com.googlecode.mp4parser.util.RangeStartMap;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class CencDecryptingTrackImpl extends AbstractTrack {
    RangeStartMap<Integer, SecretKey> indexToKey;
    Track original;
    CencDecryptingSampleList samples;

    public CencDecryptingTrackImpl(CencEncryptedTrack cencEncryptedTrack, SecretKey secretKey) {
        this(cencEncryptedTrack, (Map<UUID, SecretKey>) Collections.singletonMap(cencEncryptedTrack.getDefaultKeyId(), secretKey));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.original.close();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public String getHandler() {
        return this.original.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public SampleDescriptionBox getSampleDescriptionBox() {
        OriginalFormatBox originalFormatBox = (OriginalFormatBox) Path.getPath((AbstractContainerBox) this.original.getSampleDescriptionBox(), "enc./sinf/frma");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.original.getSampleDescriptionBox().getBox(Channels.newChannel(byteArrayOutputStream));
            SampleDescriptionBox sampleDescriptionBox = (SampleDescriptionBox) new IsoFile(new MemoryDataSourceImpl(byteArrayOutputStream.toByteArray())).getBoxes().get(0);
            if (sampleDescriptionBox.getSampleEntry() instanceof AudioSampleEntry) {
                ((AudioSampleEntry) sampleDescriptionBox.getSampleEntry()).setType(originalFormatBox.getDataFormat());
            } else {
                if (!(sampleDescriptionBox.getSampleEntry() instanceof VisualSampleEntry)) {
                    throw new RuntimeException("I don't know " + sampleDescriptionBox.getSampleEntry().getType());
                }
                ((VisualSampleEntry) sampleDescriptionBox.getSampleEntry()).setType(originalFormatBox.getDataFormat());
            }
            LinkedList linkedList = new LinkedList();
            for (Box box : sampleDescriptionBox.getSampleEntry().getBoxes()) {
                if (!box.getType().equals(ProtectionSchemeInformationBox.TYPE)) {
                    linkedList.add(box);
                }
            }
            sampleDescriptionBox.getSampleEntry().setBoxes(linkedList);
            return sampleDescriptionBox;
        } catch (IOException unused) {
            throw new RuntimeException("Dumping stsd to memory failed");
        }
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
        return this.original.getSampleDurations();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<Sample> getSamples() {
        return this.samples;
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
        return this.original.getSyncSamples();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public TrackMetaData getTrackMetaData() {
        return this.original.getTrackMetaData();
    }

    public CencDecryptingTrackImpl(CencEncryptedTrack cencEncryptedTrack, Map<UUID, SecretKey> map) {
        super("dec(" + cencEncryptedTrack.getName() + ")");
        this.indexToKey = new RangeStartMap<>();
        this.original = cencEncryptedTrack;
        SchemeTypeBox schemeTypeBox = (SchemeTypeBox) Path.getPath((AbstractContainerBox) cencEncryptedTrack.getSampleDescriptionBox(), "enc./sinf/schm");
        if (!C.CENC_TYPE_cenc.equals(schemeTypeBox.getSchemeType()) && !C.CENC_TYPE_cbc1.equals(schemeTypeBox.getSchemeType())) {
            throw new RuntimeException("You can only use the CencDecryptingTrackImpl with CENC (cenc or cbc1) encrypted tracks");
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<GroupEntry, long[]> entry : cencEncryptedTrack.getSampleGroups().entrySet()) {
            if (entry.getKey() instanceof CencSampleEncryptionInformationGroupEntry) {
                arrayList.add((CencSampleEncryptionInformationGroupEntry) entry.getKey());
            } else {
                getSampleGroups().put(entry.getKey(), entry.getValue());
            }
        }
        int i10 = -1;
        for (int i11 = 0; i11 < cencEncryptedTrack.getSamples().size(); i11++) {
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                if (Arrays.binarySearch(cencEncryptedTrack.getSampleGroups().get((GroupEntry) arrayList.get(i13)), i11) >= 0) {
                    i12 = i13 + 1;
                }
            }
            if (i10 != i12) {
                if (i12 == 0) {
                    this.indexToKey.put(Integer.valueOf(i11), map.get(cencEncryptedTrack.getDefaultKeyId()));
                } else {
                    int i14 = i12 - 1;
                    if (((CencSampleEncryptionInformationGroupEntry) arrayList.get(i14)).isEncrypted()) {
                        SecretKey secretKey = map.get(((CencSampleEncryptionInformationGroupEntry) arrayList.get(i14)).getKid());
                        if (secretKey == null) {
                            throw new RuntimeException("Key " + ((CencSampleEncryptionInformationGroupEntry) arrayList.get(i14)).getKid() + " was not supplied for decryption");
                        }
                        this.indexToKey.put(Integer.valueOf(i11), secretKey);
                    } else {
                        this.indexToKey.put(Integer.valueOf(i11), (SecretKey) null);
                    }
                }
                i10 = i12;
            }
        }
        this.samples = new CencDecryptingSampleList(this.indexToKey, cencEncryptedTrack.getSamples(), cencEncryptedTrack.getSampleEncryptionEntries(), schemeTypeBox.getSchemeType());
    }
}
