package com.googlecode.mp4parser.boxes.threegpp26244;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import com.hecorat.screenrecorder.free.models.Ke.Lykgign;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class SegmentIndexBox extends AbstractFullBox {
    public static final String TYPE = "sidx";
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
    long earliestPresentationTime;
    List<Entry> entries;
    long firstOffset;
    long referenceId;
    int reserved;
    long timeScale;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Entry {
        byte referenceType;
        int referencedSize;
        int sapDeltaTime;
        byte sapType;
        byte startsWithSap;
        long subsegmentDuration;

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
            return this.referenceType == entry.referenceType && this.referencedSize == entry.referencedSize && this.sapDeltaTime == entry.sapDeltaTime && this.sapType == entry.sapType && this.startsWithSap == entry.startsWithSap && this.subsegmentDuration == entry.subsegmentDuration;
        }

        public byte getReferenceType() {
            return this.referenceType;
        }

        public int getReferencedSize() {
            return this.referencedSize;
        }

        public int getSapDeltaTime() {
            return this.sapDeltaTime;
        }

        public byte getSapType() {
            return this.sapType;
        }

        public byte getStartsWithSap() {
            return this.startsWithSap;
        }

        public long getSubsegmentDuration() {
            return this.subsegmentDuration;
        }

        public int hashCode() {
            int i10 = ((this.referenceType * 31) + this.referencedSize) * 31;
            long j10 = this.subsegmentDuration;
            return ((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.startsWithSap) * 31) + this.sapType) * 31) + this.sapDeltaTime;
        }

        public void setReferenceType(byte b10) {
            this.referenceType = b10;
        }

        public void setReferencedSize(int i10) {
            this.referencedSize = i10;
        }

        public void setSapDeltaTime(int i10) {
            this.sapDeltaTime = i10;
        }

        public void setSapType(byte b10) {
            this.sapType = b10;
        }

        public void setStartsWithSap(byte b10) {
            this.startsWithSap = b10;
        }

        public void setSubsegmentDuration(long j10) {
            this.subsegmentDuration = j10;
        }

        public String toString() {
            return "Entry{referenceType=" + ((int) this.referenceType) + ", referencedSize=" + this.referencedSize + ", subsegmentDuration=" + this.subsegmentDuration + ", startsWithSap=" + ((int) this.startsWithSap) + ", sapType=" + ((int) this.sapType) + ", sapDeltaTime=" + this.sapDeltaTime + '}';
        }

        public Entry(int i10, int i11, long j10, boolean z10, int i12, int i13) {
            this.referenceType = (byte) i10;
            this.referencedSize = i11;
            this.subsegmentDuration = j10;
            this.startsWithSap = z10 ? (byte) 1 : (byte) 0;
            this.sapType = (byte) i12;
            this.sapDeltaTime = i13;
        }
    }

    static {
        ajc$preClinit();
    }

    public SegmentIndexBox() {
        super(TYPE);
        this.entries = new ArrayList();
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.referenceId = IsoTypeReader.readUInt32(byteBuffer);
        this.timeScale = IsoTypeReader.readUInt32(byteBuffer);
        if (getVersion() == 0) {
            this.earliestPresentationTime = IsoTypeReader.readUInt32(byteBuffer);
            this.firstOffset = IsoTypeReader.readUInt32(byteBuffer);
        } else {
            this.earliestPresentationTime = IsoTypeReader.readUInt64(byteBuffer);
            this.firstOffset = IsoTypeReader.readUInt64(byteBuffer);
        }
        this.reserved = IsoTypeReader.readUInt16(byteBuffer);
        int uInt16 = IsoTypeReader.readUInt16(byteBuffer);
        for (int i10 = 0; i10 < uInt16; i10++) {
            BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
            Entry entry = new Entry();
            entry.setReferenceType((byte) bitReaderBuffer.readBits(1));
            entry.setReferencedSize(bitReaderBuffer.readBits(31));
            entry.setSubsegmentDuration(IsoTypeReader.readUInt32(byteBuffer));
            BitReaderBuffer bitReaderBuffer2 = new BitReaderBuffer(byteBuffer);
            entry.setStartsWithSap((byte) bitReaderBuffer2.readBits(1));
            entry.setSapType((byte) bitReaderBuffer2.readBits(3));
            entry.setSapDeltaTime(bitReaderBuffer2.readBits(28));
            this.entries.add(entry);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.referenceId);
        IsoTypeWriter.writeUInt32(byteBuffer, this.timeScale);
        if (getVersion() == 0) {
            IsoTypeWriter.writeUInt32(byteBuffer, this.earliestPresentationTime);
            IsoTypeWriter.writeUInt32(byteBuffer, this.firstOffset);
        } else {
            IsoTypeWriter.writeUInt64(byteBuffer, this.earliestPresentationTime);
            IsoTypeWriter.writeUInt64(byteBuffer, this.firstOffset);
        }
        IsoTypeWriter.writeUInt16(byteBuffer, this.reserved);
        IsoTypeWriter.writeUInt16(byteBuffer, this.entries.size());
        for (Entry entry : this.entries) {
            BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
            bitWriterBuffer.writeBits(entry.getReferenceType(), 1);
            bitWriterBuffer.writeBits(entry.getReferencedSize(), 31);
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getSubsegmentDuration());
            BitWriterBuffer bitWriterBuffer2 = new BitWriterBuffer(byteBuffer);
            bitWriterBuffer2.writeBits(entry.getStartsWithSap(), 1);
            bitWriterBuffer2.writeBits(entry.getSapType(), 3);
            bitWriterBuffer2.writeBits(entry.getSapDeltaTime(), 28);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return ((long) (getVersion() == 0 ? 8 : 16)) + 16 + ((long) (this.entries.size() * 12));
    }

    public long getEarliestPresentationTime() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_6, this, this));
        return this.earliestPresentationTime;
    }

    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return this.entries;
    }

    public long getFirstOffset() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_8, this, this));
        return this.firstOffset;
    }

    public long getReferenceId() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_2, this, this));
        return this.referenceId;
    }

    public int getReserved() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_10, this, this));
        return this.reserved;
    }

    public long getTimeScale() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_4, this, this));
        return this.timeScale;
    }

    public void setEarliestPresentationTime(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_7, this, this, pp.a.f(j10)));
        this.earliestPresentationTime = j10;
    }

    public void setEntries(List<Entry> list) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public void setFirstOffset(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_9, this, this, pp.a.f(j10)));
        this.firstOffset = j10;
    }

    public void setReferenceId(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_3, this, this, pp.a.f(j10)));
        this.referenceId = j10;
    }

    public void setReserved(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_11, this, this, pp.a.e(i10)));
        this.reserved = i10;
    }

    public void setTimeScale(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_5, this, this, pp.a.f(j10)));
        this.timeScale = j10;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_12, this, this));
        return "SegmentIndexBox{entries=" + this.entries + ", referenceId=" + this.referenceId + ", timeScale=" + this.timeScale + ", earliestPresentationTime=" + this.earliestPresentationTime + ", firstOffset=" + this.firstOffset + ", reserved=" + this.reserved + '}';
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("SegmentIndexBox.java", SegmentIndexBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getEntries", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "java.util.List"), 128);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "setEntries", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "java.util.List", "entries", "", "void"), Sdk$SDKError.b.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
        ajc$tjp_10 = bVar.h("method-execution", bVar.g("1", "getReserved", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "int"), 168);
        ajc$tjp_11 = bVar.h("method-execution", bVar.g("1", "setReserved", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "int", "reserved", "", "void"), 172);
        ajc$tjp_12 = bVar.h("method-execution", bVar.g(Lykgign.vxLSjPnllPl, "toString", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "java.lang.String"), 298);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "getReferenceId", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), Sdk$SDKError.b.PRIVACY_URL_ERROR_VALUE);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "setReferenceId", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "referenceId", "", "void"), 140);
        ajc$tjp_4 = bVar.h("method-execution", bVar.g("1", "getTimeScale", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), 144);
        ajc$tjp_5 = bVar.h("method-execution", bVar.g("1", "setTimeScale", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "timeScale", "", "void"), 148);
        ajc$tjp_6 = bVar.h("method-execution", bVar.g("1", "getEarliestPresentationTime", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), 152);
        ajc$tjp_7 = bVar.h("method-execution", bVar.g("1", "setEarliestPresentationTime", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "earliestPresentationTime", "", "void"), 156);
        ajc$tjp_8 = bVar.h("method-execution", bVar.g("1", "getFirstOffset", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), 160);
        ajc$tjp_9 = bVar.h("method-execution", bVar.g("1", "setFirstOffset", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "firstOffset", "", "void"), 164);
    }
}
