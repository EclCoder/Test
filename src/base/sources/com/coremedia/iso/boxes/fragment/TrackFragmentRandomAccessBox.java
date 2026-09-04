package com.coremedia.iso.boxes.fragment;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeReaderVariable;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeWriterVariable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class TrackFragmentRandomAccessBox extends AbstractFullBox {
    public static final String TYPE = "tfra";
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_10 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_11 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_12 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_2 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_4 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_5 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_6 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_7 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_8 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_9 = null;
    private List<Entry> entries;
    private int lengthSizeOfSampleNum;
    private int lengthSizeOfTrafNum;
    private int lengthSizeOfTrunNum;
    private int reserved;
    private long trackId;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Entry {
        private long moofOffset;
        private long sampleNumber;
        private long time;
        private long trafNumber;
        private long trunNumber;

        public Entry() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.moofOffset == entry.moofOffset && this.sampleNumber == entry.sampleNumber && this.time == entry.time && this.trafNumber == entry.trafNumber && this.trunNumber == entry.trunNumber;
        }

        public long getMoofOffset() {
            return this.moofOffset;
        }

        public long getSampleNumber() {
            return this.sampleNumber;
        }

        public long getTime() {
            return this.time;
        }

        public long getTrafNumber() {
            return this.trafNumber;
        }

        public long getTrunNumber() {
            return this.trunNumber;
        }

        public int hashCode() {
            long j10 = this.time;
            long j11 = this.moofOffset;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.trafNumber;
            int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.trunNumber;
            int i12 = (i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.sampleNumber;
            return i12 + ((int) ((j14 >>> 32) ^ j14));
        }

        public void setMoofOffset(long j10) {
            this.moofOffset = j10;
        }

        public void setSampleNumber(long j10) {
            this.sampleNumber = j10;
        }

        public void setTime(long j10) {
            this.time = j10;
        }

        public void setTrafNumber(long j10) {
            this.trafNumber = j10;
        }

        public void setTrunNumber(long j10) {
            this.trunNumber = j10;
        }

        public String toString() {
            return "Entry{time=" + this.time + ", moofOffset=" + this.moofOffset + ", trafNumber=" + this.trafNumber + ", trunNumber=" + this.trunNumber + ", sampleNumber=" + this.sampleNumber + '}';
        }

        public Entry(long j10, long j11, long j12, long j13, long j14) {
            this.moofOffset = j11;
            this.sampleNumber = j14;
            this.time = j10;
            this.trafNumber = j12;
            this.trunNumber = j13;
        }
    }

    static {
        ajc$preClinit();
    }

    public TrackFragmentRandomAccessBox() {
        super(TYPE);
        this.lengthSizeOfTrafNum = 2;
        this.lengthSizeOfTrunNum = 2;
        this.lengthSizeOfSampleNum = 2;
        this.entries = Collections.EMPTY_LIST;
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("TrackFragmentRandomAccessBox.java", TrackFragmentRandomAccessBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "long", "trackId", "", "void"), 145);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "setLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrafNum", "", "void"), 149);
        ajc$tjp_10 = bVar.h("method-execution", bVar.g("1", "getEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.util.List"), ModuleDescriptor.MODULE_VERSION);
        ajc$tjp_11 = bVar.h("method-execution", bVar.g("1", "setEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "java.util.List", "entries", "", "void"), PsExtractor.PRIVATE_STREAM_1);
        ajc$tjp_12 = bVar.h("method-execution", bVar.g("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.lang.String"), 290);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "setLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrunNum", "", "void"), 153);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "setLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfSampleNum", "", "void"), 157);
        ajc$tjp_4 = bVar.h("method-execution", bVar.g("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "long"), 161);
        ajc$tjp_5 = bVar.h("method-execution", bVar.g("1", "getReserved", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 165);
        ajc$tjp_6 = bVar.h("method-execution", bVar.g("1", "getLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 169);
        ajc$tjp_7 = bVar.h("method-execution", bVar.g("1", "getLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173);
        ajc$tjp_8 = bVar.h("method-execution", bVar.g("1", "getLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 177);
        ajc$tjp_9 = bVar.h("method-execution", bVar.g("1", "getNumberOfEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "long"), 181);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = IsoTypeReader.readUInt32(byteBuffer);
        long uInt32 = IsoTypeReader.readUInt32(byteBuffer);
        this.reserved = (int) (uInt32 >> 6);
        this.lengthSizeOfTrafNum = (((int) (63 & uInt32)) >> 4) + 1;
        this.lengthSizeOfTrunNum = (((int) (12 & uInt32)) >> 2) + 1;
        this.lengthSizeOfSampleNum = ((int) (uInt32 & 3)) + 1;
        long uInt33 = IsoTypeReader.readUInt32(byteBuffer);
        this.entries = new ArrayList();
        for (int i10 = 0; i10 < uInt33; i10++) {
            Entry entry = new Entry();
            if (getVersion() == 1) {
                entry.time = IsoTypeReader.readUInt64(byteBuffer);
                entry.moofOffset = IsoTypeReader.readUInt64(byteBuffer);
            } else {
                entry.time = IsoTypeReader.readUInt32(byteBuffer);
                entry.moofOffset = IsoTypeReader.readUInt32(byteBuffer);
            }
            entry.trafNumber = IsoTypeReaderVariable.read(byteBuffer, this.lengthSizeOfTrafNum);
            entry.trunNumber = IsoTypeReaderVariable.read(byteBuffer, this.lengthSizeOfTrunNum);
            entry.sampleNumber = IsoTypeReaderVariable.read(byteBuffer, this.lengthSizeOfSampleNum);
            this.entries.add(entry);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.trackId);
        IsoTypeWriter.writeUInt32(byteBuffer, ((long) (this.reserved << 6)) | ((long) (((this.lengthSizeOfTrafNum - 1) & 3) << 4)) | ((long) (((this.lengthSizeOfTrunNum - 1) & 3) << 2)) | ((long) ((this.lengthSizeOfSampleNum - 1) & 3)));
        IsoTypeWriter.writeUInt32(byteBuffer, this.entries.size());
        for (Entry entry : this.entries) {
            if (getVersion() == 1) {
                IsoTypeWriter.writeUInt64(byteBuffer, entry.time);
                IsoTypeWriter.writeUInt64(byteBuffer, entry.moofOffset);
            } else {
                IsoTypeWriter.writeUInt32(byteBuffer, entry.time);
                IsoTypeWriter.writeUInt32(byteBuffer, entry.moofOffset);
            }
            IsoTypeWriterVariable.write(entry.trafNumber, byteBuffer, this.lengthSizeOfTrafNum);
            IsoTypeWriterVariable.write(entry.trunNumber, byteBuffer, this.lengthSizeOfTrunNum);
            IsoTypeWriterVariable.write(entry.sampleNumber, byteBuffer, this.lengthSizeOfSampleNum);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 16 + ((long) (getVersion() == 1 ? this.entries.size() * 16 : this.entries.size() * 8)) + ((long) (this.lengthSizeOfTrafNum * this.entries.size())) + ((long) (this.lengthSizeOfTrunNum * this.entries.size())) + ((long) (this.lengthSizeOfSampleNum * this.entries.size()));
    }

    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_10, this, this));
        return Collections.unmodifiableList(this.entries);
    }

    public int getLengthSizeOfSampleNum() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_8, this, this));
        return this.lengthSizeOfSampleNum;
    }

    public int getLengthSizeOfTrafNum() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_6, this, this));
        return this.lengthSizeOfTrafNum;
    }

    public int getLengthSizeOfTrunNum() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_7, this, this));
        return this.lengthSizeOfTrunNum;
    }

    public long getNumberOfEntries() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_9, this, this));
        return this.entries.size();
    }

    public int getReserved() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_5, this, this));
        return this.reserved;
    }

    public long getTrackId() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_4, this, this));
        return this.trackId;
    }

    public void setEntries(List<Entry> list) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_11, this, this, list));
        this.entries = list;
    }

    public void setLengthSizeOfSampleNum(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_3, this, this, pp.a.e(i10)));
        this.lengthSizeOfSampleNum = i10;
    }

    public void setLengthSizeOfTrafNum(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_1, this, this, pp.a.e(i10)));
        this.lengthSizeOfTrafNum = i10;
    }

    public void setLengthSizeOfTrunNum(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_2, this, this, pp.a.e(i10)));
        this.lengthSizeOfTrunNum = i10;
    }

    public void setTrackId(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_0, this, this, pp.a.f(j10)));
        this.trackId = j10;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_12, this, this));
        return "TrackFragmentRandomAccessBox{trackId=" + this.trackId + ", entries=" + this.entries + '}';
    }
}
