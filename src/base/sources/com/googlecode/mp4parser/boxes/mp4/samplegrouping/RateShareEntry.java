package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class RateShareEntry extends GroupEntry {
    public static final String TYPE = "rash";
    private short discardPriority;
    private List<Entry> entries = new LinkedList();
    private int maximumBitrate;
    private int minimumBitrate;
    private short operationPointCut;
    private short targetRateShare;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Entry {
        int availableBitrate;
        short targetRateShare;

        public Entry(int i10, short s10) {
            this.availableBitrate = i10;
            this.targetRateShare = s10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.availableBitrate == entry.availableBitrate && this.targetRateShare == entry.targetRateShare;
        }

        public int getAvailableBitrate() {
            return this.availableBitrate;
        }

        public short getTargetRateShare() {
            return this.targetRateShare;
        }

        public int hashCode() {
            return (this.availableBitrate * 31) + this.targetRateShare;
        }

        public void setAvailableBitrate(int i10) {
            this.availableBitrate = i10;
        }

        public void setTargetRateShare(short s10) {
            this.targetRateShare = s10;
        }

        public String toString() {
            return "{availableBitrate=" + this.availableBitrate + ", targetRateShare=" + ((int) this.targetRateShare) + '}';
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RateShareEntry rateShareEntry = (RateShareEntry) obj;
        if (this.discardPriority != rateShareEntry.discardPriority || this.maximumBitrate != rateShareEntry.maximumBitrate || this.minimumBitrate != rateShareEntry.minimumBitrate || this.operationPointCut != rateShareEntry.operationPointCut || this.targetRateShare != rateShareEntry.targetRateShare) {
            return false;
        }
        List<Entry> list = this.entries;
        List<Entry> list2 = rateShareEntry.entries;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public ByteBuffer get() {
        short s10 = this.operationPointCut;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(s10 == 1 ? 13 : (s10 * 6) + 11);
        byteBufferAllocate.putShort(this.operationPointCut);
        if (this.operationPointCut == 1) {
            byteBufferAllocate.putShort(this.targetRateShare);
        } else {
            for (Entry entry : this.entries) {
                byteBufferAllocate.putInt(entry.getAvailableBitrate());
                byteBufferAllocate.putShort(entry.getTargetRateShare());
            }
        }
        byteBufferAllocate.putInt(this.maximumBitrate);
        byteBufferAllocate.putInt(this.minimumBitrate);
        IsoTypeWriter.writeUInt8(byteBufferAllocate, this.discardPriority);
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    public short getDiscardPriority() {
        return this.discardPriority;
    }

    public List<Entry> getEntries() {
        return this.entries;
    }

    public int getMaximumBitrate() {
        return this.maximumBitrate;
    }

    public int getMinimumBitrate() {
        return this.minimumBitrate;
    }

    public short getOperationPointCut() {
        return this.operationPointCut;
    }

    public short getTargetRateShare() {
        return this.targetRateShare;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public String getType() {
        return TYPE;
    }

    public int hashCode() {
        int i10 = ((this.operationPointCut * 31) + this.targetRateShare) * 31;
        List<Entry> list = this.entries;
        return ((((((i10 + (list != null ? list.hashCode() : 0)) * 31) + this.maximumBitrate) * 31) + this.minimumBitrate) * 31) + this.discardPriority;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public void parse(ByteBuffer byteBuffer) {
        short s10 = byteBuffer.getShort();
        this.operationPointCut = s10;
        int i10 = s10;
        if (s10 == 1) {
            this.targetRateShare = byteBuffer.getShort();
        } else {
            while (true) {
                int i11 = i10 - 1;
                if (i10 <= 0) {
                    break;
                }
                this.entries.add(new Entry(CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer)), byteBuffer.getShort()));
                i10 = i11;
            }
        }
        this.maximumBitrate = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.minimumBitrate = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.discardPriority = (short) IsoTypeReader.readUInt8(byteBuffer);
    }

    public void setDiscardPriority(short s10) {
        this.discardPriority = s10;
    }

    public void setEntries(List<Entry> list) {
        this.entries = list;
    }

    public void setMaximumBitrate(int i10) {
        this.maximumBitrate = i10;
    }

    public void setMinimumBitrate(int i10) {
        this.minimumBitrate = i10;
    }

    public void setOperationPointCut(short s10) {
        this.operationPointCut = s10;
    }

    public void setTargetRateShare(short s10) {
        this.targetRateShare = s10;
    }
}
