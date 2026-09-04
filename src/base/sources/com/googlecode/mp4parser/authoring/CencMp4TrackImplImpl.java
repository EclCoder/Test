package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.ChunkOffsetBox;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack;
import com.googlecode.mp4parser.util.Path;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox;
import hi.a;
import hi.b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class CencMp4TrackImplImpl extends Mp4TrackImpl implements CencEncryptedTrack {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private UUID defaultKeyId;
    private List<a> sampleEncryptionEntries;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class FindSaioSaizPair {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Container container;
        private SampleAuxiliaryInformationOffsetsBox saio;
        private SampleAuxiliaryInformationSizesBox saiz;

        public FindSaioSaizPair(Container container) {
            this.container = container;
        }

        public SampleAuxiliaryInformationOffsetsBox getSaio() {
            return this.saio;
        }

        public SampleAuxiliaryInformationSizesBox getSaiz() {
            return this.saiz;
        }

        public FindSaioSaizPair invoke() {
            List boxes = this.container.getBoxes(SampleAuxiliaryInformationSizesBox.class);
            List boxes2 = this.container.getBoxes(SampleAuxiliaryInformationOffsetsBox.class);
            this.saiz = null;
            this.saio = null;
            for (int i10 = 0; i10 < boxes.size(); i10++) {
                if ((this.saiz == null && ((SampleAuxiliaryInformationSizesBox) boxes.get(i10)).getAuxInfoType() == null) || C.CENC_TYPE_cenc.equals(((SampleAuxiliaryInformationSizesBox) boxes.get(i10)).getAuxInfoType())) {
                    this.saiz = (SampleAuxiliaryInformationSizesBox) boxes.get(i10);
                } else {
                    SampleAuxiliaryInformationSizesBox sampleAuxiliaryInformationSizesBox = this.saiz;
                    if (sampleAuxiliaryInformationSizesBox == null || sampleAuxiliaryInformationSizesBox.getAuxInfoType() != null || !C.CENC_TYPE_cenc.equals(((SampleAuxiliaryInformationSizesBox) boxes.get(i10)).getAuxInfoType())) {
                        throw new RuntimeException("Are there two cenc labeled saiz?");
                    }
                    this.saiz = (SampleAuxiliaryInformationSizesBox) boxes.get(i10);
                }
                if ((this.saio == null && ((SampleAuxiliaryInformationOffsetsBox) boxes2.get(i10)).getAuxInfoType() == null) || C.CENC_TYPE_cenc.equals(((SampleAuxiliaryInformationOffsetsBox) boxes2.get(i10)).getAuxInfoType())) {
                    this.saio = (SampleAuxiliaryInformationOffsetsBox) boxes2.get(i10);
                } else {
                    SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox = this.saio;
                    if (sampleAuxiliaryInformationOffsetsBox == null || sampleAuxiliaryInformationOffsetsBox.getAuxInfoType() != null || !C.CENC_TYPE_cenc.equals(((SampleAuxiliaryInformationOffsetsBox) boxes2.get(i10)).getAuxInfoType())) {
                        throw new RuntimeException("Are there two cenc labeled saio?");
                    }
                    this.saio = (SampleAuxiliaryInformationOffsetsBox) boxes2.get(i10);
                }
            }
            return this;
        }
    }

    public CencMp4TrackImplImpl(String str, TrackBox trackBox, IsoFile... isoFileArr) {
        long size;
        long j10;
        int sampleCount;
        Container parent;
        long baseDataOffset;
        int i10;
        super(str, trackBox, isoFileArr);
        this.sampleEncryptionEntries = new ArrayList();
        long trackId = trackBox.getTrackHeaderBox().getTrackId();
        if (trackBox.getParent().getBoxes(MovieExtendsBox.class).size() <= 0) {
            b bVar = (b) Path.getPath((AbstractContainerBox) trackBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
            this.defaultKeyId = bVar.getDefault_KID();
            ChunkOffsetBox chunkOffsetBox = (ChunkOffsetBox) Path.getPath((AbstractContainerBox) trackBox, "mdia[0]/minf[0]/stbl[0]/stco[0]");
            long[] jArrBlowup = trackBox.getSampleTableBox().getSampleToChunkBox().blowup((chunkOffsetBox == null ? (ChunkOffsetBox) Path.getPath((AbstractContainerBox) trackBox, "mdia[0]/minf[0]/stbl[0]/co64[0]") : chunkOffsetBox).getChunkOffsets().length);
            FindSaioSaizPair findSaioSaizPairInvoke = new FindSaioSaizPair((Container) Path.getPath((AbstractContainerBox) trackBox, "mdia[0]/minf[0]/stbl[0]")).invoke();
            SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox = findSaioSaizPairInvoke.saio;
            SampleAuxiliaryInformationSizesBox sampleAuxiliaryInformationSizesBox = findSaioSaizPairInvoke.saiz;
            Container parent2 = ((MovieBox) trackBox.getParent()).getParent();
            if (sampleAuxiliaryInformationOffsetsBox.getOffsets().length == 1) {
                long j11 = sampleAuxiliaryInformationOffsetsBox.getOffsets()[0];
                if (sampleAuxiliaryInformationSizesBox.getDefaultSampleInfoSize() > 0) {
                    sampleCount = sampleAuxiliaryInformationSizesBox.getSampleCount() * sampleAuxiliaryInformationSizesBox.getDefaultSampleInfoSize();
                } else {
                    sampleCount = 0;
                    for (int i11 = 0; i11 < sampleAuxiliaryInformationSizesBox.getSampleCount(); i11++) {
                        sampleCount += sampleAuxiliaryInformationSizesBox.getSampleInfoSizes()[i11];
                    }
                }
                ByteBuffer byteBuffer = parent2.getByteBuffer(j11, sampleCount);
                for (int i12 = 0; i12 < sampleAuxiliaryInformationSizesBox.getSampleCount(); i12++) {
                    this.sampleEncryptionEntries.add(parseCencAuxDataFormat(bVar.getDefaultIvSize(), byteBuffer, sampleAuxiliaryInformationSizesBox.getSize(i12)));
                }
                return;
            }
            if (sampleAuxiliaryInformationOffsetsBox.getOffsets().length != jArrBlowup.length) {
                throw new RuntimeException("Number of saio offsets must be either 1 or number of chunks");
            }
            int i13 = 0;
            for (int i14 = 0; i14 < jArrBlowup.length; i14++) {
                long j12 = sampleAuxiliaryInformationOffsetsBox.getOffsets()[i14];
                if (sampleAuxiliaryInformationSizesBox.getDefaultSampleInfoSize() > 0) {
                    size = ((long) sampleAuxiliaryInformationSizesBox.getSampleCount()) * jArrBlowup[i14];
                } else {
                    size = 0;
                    for (int i15 = 0; i15 < jArrBlowup[i14]; i15++) {
                        size += (long) sampleAuxiliaryInformationSizesBox.getSize(i13 + i15);
                    }
                }
                ByteBuffer byteBuffer2 = parent2.getByteBuffer(j12, size);
                int i16 = 0;
                while (true) {
                    long j13 = i16;
                    j10 = jArrBlowup[i14];
                    if (j13 >= j10) {
                        break;
                    }
                    this.sampleEncryptionEntries.add(parseCencAuxDataFormat(bVar.getDefaultIvSize(), byteBuffer2, sampleAuxiliaryInformationSizesBox.getSize(i13 + i16)));
                    i16++;
                }
                i13 = (int) (((long) i13) + j10);
            }
            return;
        }
        Iterator it = ((Box) trackBox.getParent()).getParent().getBoxes(MovieFragmentBox.class).iterator();
        while (it.hasNext()) {
            MovieFragmentBox movieFragmentBox = (MovieFragmentBox) it.next();
            Iterator it2 = movieFragmentBox.getBoxes(TrackFragmentBox.class).iterator();
            while (it2.hasNext()) {
                TrackFragmentBox trackFragmentBox = (TrackFragmentBox) it2.next();
                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackId) {
                    b bVar2 = (b) Path.getPath((AbstractContainerBox) trackBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
                    this.defaultKeyId = bVar2.getDefault_KID();
                    if (trackFragmentBox.getTrackFragmentHeaderBox().hasBaseDataOffset()) {
                        parent = ((Box) trackBox.getParent()).getParent();
                        baseDataOffset = trackFragmentBox.getTrackFragmentHeaderBox().getBaseDataOffset();
                    } else {
                        parent = movieFragmentBox;
                        baseDataOffset = 0;
                    }
                    FindSaioSaizPair findSaioSaizPairInvoke2 = new FindSaioSaizPair(trackFragmentBox).invoke();
                    SampleAuxiliaryInformationOffsetsBox saio = findSaioSaizPairInvoke2.getSaio();
                    SampleAuxiliaryInformationSizesBox saiz = findSaioSaizPairInvoke2.getSaiz();
                    long[] offsets = saio.getOffsets();
                    List boxes = trackFragmentBox.getBoxes(TrackRunBox.class);
                    int i17 = 0;
                    int i18 = 0;
                    long j14 = trackId;
                    while (i17 < offsets.length) {
                        int size2 = ((TrackRunBox) boxes.get(i17)).getEntries().size();
                        long j15 = offsets[i17];
                        long[] jArr = offsets;
                        List list = boxes;
                        int i19 = i18;
                        long size3 = 0;
                        while (true) {
                            i10 = i18 + size2;
                            if (i19 >= i10) {
                                break;
                            }
                            size3 += (long) saiz.getSize(i19);
                            i19++;
                            movieFragmentBox = movieFragmentBox;
                            it2 = it2;
                        }
                        Iterator it3 = it;
                        ByteBuffer byteBuffer3 = parent.getByteBuffer(baseDataOffset + j15, size3);
                        int i20 = i18;
                        while (i20 < i10) {
                            this.sampleEncryptionEntries.add(parseCencAuxDataFormat(bVar2.getDefaultIvSize(), byteBuffer3, saiz.getSize(i20)));
                            i20++;
                            i10 = i10;
                            movieFragmentBox = movieFragmentBox;
                            it2 = it2;
                        }
                        i17++;
                        offsets = jArr;
                        i18 = i10;
                        boxes = list;
                        it = it3;
                    }
                    trackId = j14;
                }
            }
        }
    }

    private a parseCencAuxDataFormat(int i10, ByteBuffer byteBuffer, long j10) {
        a aVar = new a();
        if (j10 > 0) {
            byte[] bArr = new byte[i10];
            aVar.f40373a = bArr;
            byteBuffer.get(bArr);
            if (j10 > i10) {
                aVar.f40374b = new a.j[IsoTypeReader.readUInt16(byteBuffer)];
                int i11 = 0;
                while (true) {
                    a.j[] jVarArr = aVar.f40374b;
                    if (i11 >= jVarArr.length) {
                        break;
                    }
                    jVarArr[i11] = aVar.a(IsoTypeReader.readUInt16(byteBuffer), IsoTypeReader.readUInt32(byteBuffer));
                    i11++;
                }
            }
        }
        return aVar;
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack
    public UUID getDefaultKeyId() {
        return this.defaultKeyId;
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public String getName() {
        return "enc(" + super.getName() + ")";
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack
    public List<a> getSampleEncryptionEntries() {
        return this.sampleEncryptionEntries;
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack
    public boolean hasSubSampleEncryption() {
        return false;
    }

    public String toString() {
        return "CencMp4TrackImpl{handler='" + getHandler() + "'}";
    }
}
