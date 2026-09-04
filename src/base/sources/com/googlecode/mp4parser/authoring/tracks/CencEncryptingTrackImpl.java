package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReaderVariable;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.OriginalFormatBox;
import com.coremedia.iso.boxes.ProtectionSchemeInformationBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SchemeInformationBox;
import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.MemoryDataSourceImpl;
import com.googlecode.mp4parser.authoring.Edit;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl;
import com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImpl;
import com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.RangeStartMap;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import com.mp4parser.iso14496.part15.HevcConfigurationBox;
import hi.a;
import hi.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class CencEncryptingTrackImpl implements CencEncryptedTrack {
    List<a> cencSampleAuxiliaryData;
    Object configurationBox;
    UUID defaultKeyId;
    boolean dummyIvs;
    private final String encryptionAlgo;
    RangeStartMap<Integer, SecretKey> indexToKey;
    Map<UUID, SecretKey> keys;
    Map<GroupEntry, long[]> sampleGroups;
    List<Sample> samples;
    Track source;
    SampleDescriptionBox stsd;
    boolean subSampleEncryption;

    public CencEncryptingTrackImpl(Track track, UUID uuid, SecretKey secretKey, boolean z10) {
        this(track, uuid, Collections.singletonMap(uuid, secretKey), null, C.CENC_TYPE_cenc, z10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return this.source.getCompositionTimeEntries();
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack
    public UUID getDefaultKeyId() {
        return this.defaultKeyId;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long getDuration() {
        return this.source.getDuration();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<Edit> getEdits() {
        return this.source.getEdits();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public String getHandler() {
        return this.source.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public String getName() {
        return "enc(" + this.source.getName() + ")";
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return this.source.getSampleDependencies();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public synchronized SampleDescriptionBox getSampleDescriptionBox() {
        try {
            if (this.stsd == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    this.source.getSampleDescriptionBox().getBox(Channels.newChannel(byteArrayOutputStream));
                    int i10 = 0;
                    this.stsd = (SampleDescriptionBox) new IsoFile(new MemoryDataSourceImpl(byteArrayOutputStream.toByteArray())).getBoxes().get(0);
                    OriginalFormatBox originalFormatBox = new OriginalFormatBox();
                    originalFormatBox.setDataFormat(this.stsd.getSampleEntry().getType());
                    if (this.stsd.getSampleEntry() instanceof AudioSampleEntry) {
                        ((AudioSampleEntry) this.stsd.getSampleEntry()).setType(AudioSampleEntry.TYPE_ENCRYPTED);
                    } else {
                        if (!(this.stsd.getSampleEntry() instanceof VisualSampleEntry)) {
                            throw new RuntimeException("I don't know how to cenc " + this.stsd.getSampleEntry().getType());
                        }
                        ((VisualSampleEntry) this.stsd.getSampleEntry()).setType(VisualSampleEntry.TYPE_ENCRYPTED);
                    }
                    ProtectionSchemeInformationBox protectionSchemeInformationBox = new ProtectionSchemeInformationBox();
                    protectionSchemeInformationBox.addBox(originalFormatBox);
                    SchemeTypeBox schemeTypeBox = new SchemeTypeBox();
                    schemeTypeBox.setSchemeType(this.encryptionAlgo);
                    schemeTypeBox.setSchemeVersion(C.DEFAULT_BUFFER_SEGMENT_SIZE);
                    protectionSchemeInformationBox.addBox(schemeTypeBox);
                    SchemeInformationBox schemeInformationBox = new SchemeInformationBox();
                    b bVar = new b();
                    bVar.setDefaultIvSize(this.defaultKeyId == null ? 0 : 8);
                    if (this.defaultKeyId != null) {
                        i10 = 1;
                    }
                    bVar.setDefaultAlgorithmId(i10);
                    UUID uuid = this.defaultKeyId;
                    if (uuid == null) {
                        uuid = new UUID(0L, 0L);
                    }
                    bVar.setDefault_KID(uuid);
                    schemeInformationBox.addBox(bVar);
                    protectionSchemeInformationBox.addBox(schemeInformationBox);
                    this.stsd.getSampleEntry().addBox(protectionSchemeInformationBox);
                } catch (IOException unused) {
                    throw new RuntimeException("Dumping stsd to memory failed");
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.stsd;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
        return this.source.getSampleDurations();
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack
    public List<a> getSampleEncryptionEntries() {
        return this.cencSampleAuxiliaryData;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public Map<GroupEntry, long[]> getSampleGroups() {
        return this.sampleGroups;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<Sample> getSamples() {
        return new CencEncryptingSampleList(this.indexToKey, this.source.getSamples(), this.cencSampleAuxiliaryData, this.encryptionAlgo);
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.source.getSubsampleInformationBox();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
        return this.source.getSyncSamples();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public TrackMetaData getTrackMetaData() {
        return this.source.getTrackMetaData();
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack
    public boolean hasSubSampleEncryption() {
        return this.subSampleEncryption;
    }

    public boolean isClearNal(ByteBuffer byteBuffer) {
        Object obj = this.configurationBox;
        if (obj instanceof HevcConfigurationBox) {
            int i10 = H265TrackImpl.getNalUnitHeader(byteBuffer.slice()).nalUnitType;
            return (i10 < 0 || i10 > 9) && (i10 < 16 || i10 > 21) && (i10 < 16 || i10 > 21);
        }
        if (!(obj instanceof AvcConfigurationBox)) {
            throw new RuntimeException("Subsample encryption is activated but the CencEncryptingTrackImpl can't say if this sample is to be encrypted or not!");
        }
        int i11 = H264TrackImpl.getNalUnitHeader(byteBuffer.slice()).nal_unit_type;
        return (i11 == 19 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 20 || i11 == 5 || i11 == 1) ? false : true;
    }

    public CencEncryptingTrackImpl(Track track, UUID uuid, Map<UUID, SecretKey> map, Map<CencSampleEncryptionInformationGroupEntry, long[]> map2, String str, boolean z10) {
        this(track, uuid, map, map2, str, z10, false);
    }

    public CencEncryptingTrackImpl(Track track, UUID uuid, Map<UUID, SecretKey> map, Map<CencSampleEncryptionInformationGroupEntry, long[]> map2, String str, boolean z10, boolean z11) {
        new HashMap();
        int i10 = 0;
        this.subSampleEncryption = false;
        SecretKey secretKey = null;
        this.stsd = null;
        this.source = track;
        this.keys = map;
        this.defaultKeyId = uuid;
        this.dummyIvs = z10;
        this.encryptionAlgo = str;
        this.sampleGroups = new HashMap();
        for (Map.Entry<GroupEntry, long[]> entry : track.getSampleGroups().entrySet()) {
            if (!(entry.getKey() instanceof CencSampleEncryptionInformationGroupEntry)) {
                this.sampleGroups.put(entry.getKey(), entry.getValue());
            }
            i10 = 0;
            secretKey = null;
        }
        if (map2 != null) {
            for (Map.Entry<CencSampleEncryptionInformationGroupEntry, long[]> entry2 : map2.entrySet()) {
                this.sampleGroups.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.sampleGroups = new HashMap<GroupEntry, long[]>(this.sampleGroups) { // from class: com.googlecode.mp4parser.authoring.tracks.CencEncryptingTrackImpl.1
            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public long[] put(GroupEntry groupEntry, long[] jArr) {
                if (groupEntry instanceof CencSampleEncryptionInformationGroupEntry) {
                    throw new RuntimeException("Please supply CencSampleEncryptionInformationGroupEntries in the constructor");
                }
                return (long[]) super.put(groupEntry, jArr);
            }
        };
        this.samples = track.getSamples();
        this.cencSampleAuxiliaryData = new ArrayList();
        BigInteger bigInteger = new BigInteger("1");
        int i11 = 8;
        byte[] bArr = new byte[8];
        if (!z10) {
            new SecureRandom().nextBytes(bArr);
        }
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        ArrayList arrayList = new ArrayList();
        if (map2 != null) {
            arrayList.addAll(map2.keySet());
        }
        this.indexToKey = new RangeStartMap<>();
        int lengthSizeMinusOne = -1;
        int i12 = i10;
        int i13 = -1;
        while (i12 < track.getSamples().size()) {
            int i14 = i10;
            int i15 = i14;
            while (i14 < arrayList.size()) {
                BigInteger bigInteger3 = bigInteger2;
                if (Arrays.binarySearch(getSampleGroups().get((GroupEntry) arrayList.get(i14)), i12) >= 0) {
                    i15 = i14 + 1;
                }
                i14++;
                bigInteger2 = bigInteger3;
                secretKey = null;
                i11 = 8;
            }
            if (i13 != i15) {
                if (i15 == 0) {
                    this.indexToKey.put(Integer.valueOf(i12), map.get(uuid));
                } else {
                    int i16 = i15 - 1;
                    if (((CencSampleEncryptionInformationGroupEntry) arrayList.get(i16)).getKid() != null) {
                        SecretKey secretKey2 = map.get(((CencSampleEncryptionInformationGroupEntry) arrayList.get(i16)).getKid());
                        if (secretKey2 != null) {
                            this.indexToKey.put(Integer.valueOf(i12), secretKey2);
                        } else {
                            throw new RuntimeException("Key " + ((CencSampleEncryptionInformationGroupEntry) arrayList.get(i16)).getKid() + " was not supplied for decryption");
                        }
                    } else {
                        this.indexToKey.put(Integer.valueOf(i12), secretKey);
                    }
                }
                i13 = i15;
            }
            i12++;
            i10 = 0;
        }
        for (Box box : track.getSampleDescriptionBox().getSampleEntry().getBoxes()) {
            if (box instanceof AvcConfigurationBox) {
                this.configurationBox = box;
                this.subSampleEncryption = true;
                lengthSizeMinusOne = ((AvcConfigurationBox) box).getLengthSizeMinusOne() + 1;
            }
            if (box instanceof HevcConfigurationBox) {
                this.configurationBox = box;
                this.subSampleEncryption = true;
                lengthSizeMinusOne = ((HevcConfigurationBox) box).getLengthSizeMinusOne() + 1;
            }
        }
        for (int i17 = i10; i17 < this.samples.size(); i17++) {
            Sample sample = this.samples.get(i17);
            a aVar = new a();
            this.cencSampleAuxiliaryData.add(aVar);
            if (this.indexToKey.get(Integer.valueOf(i17)) != null) {
                byte[] byteArray = bigInteger2.toByteArray();
                byte[] bArr2 = new byte[i11];
                System.arraycopy(byteArray, byteArray.length - i11 > 0 ? byteArray.length - i11 : i10, bArr2, 8 - byteArray.length < 0 ? i10 : 8 - byteArray.length, byteArray.length > i11 ? i11 : byteArray.length);
                aVar.f40373a = bArr2;
                ByteBuffer byteBuffer = (ByteBuffer) sample.asByteBuffer().rewind();
                if (this.subSampleEncryption) {
                    if (z11) {
                        a.j[] jVarArr = new a.j[1];
                        jVarArr[i10] = aVar.a(byteBuffer.remaining(), 0L);
                        aVar.f40374b = jVarArr;
                    } else {
                        ArrayList arrayList2 = new ArrayList(5);
                        while (byteBuffer.remaining() > 0) {
                            int iL2i = CastUtils.l2i(IsoTypeReaderVariable.read(byteBuffer, lengthSizeMinusOne));
                            int i18 = iL2i + lengthSizeMinusOne;
                            int i19 = (i18 < 112 || isClearNal(byteBuffer.duplicate())) ? i18 : (i18 % 16) + 96;
                            arrayList2.add(aVar.a(i19, i18 - i19));
                            byteBuffer.position(byteBuffer.position() + iL2i);
                        }
                        aVar.f40374b = (a.j[]) arrayList2.toArray(new a.j[arrayList2.size()]);
                    }
                }
                bigInteger2 = bigInteger2.add(bigInteger);
            }
        }
    }
}
