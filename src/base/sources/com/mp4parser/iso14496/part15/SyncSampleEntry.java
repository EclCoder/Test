package com.mp4parser.iso14496.part15;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class SyncSampleEntry extends GroupEntry {
    public static final String TYPE = "sync";
    int nalUnitType;
    int reserved;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SyncSampleEntry syncSampleEntry = (SyncSampleEntry) obj;
        return this.nalUnitType == syncSampleEntry.nalUnitType && this.reserved == syncSampleEntry.reserved;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public ByteBuffer get() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1);
        IsoTypeWriter.writeUInt8(byteBufferAllocate, this.nalUnitType + (this.reserved << 6));
        return (ByteBuffer) byteBufferAllocate.rewind();
    }

    public int getNalUnitType() {
        return this.nalUnitType;
    }

    public int getReserved() {
        return this.reserved;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public String getType() {
        return TYPE;
    }

    public int hashCode() {
        return (this.reserved * 31) + this.nalUnitType;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public void parse(ByteBuffer byteBuffer) {
        int uInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.reserved = (uInt8 & PsExtractor.AUDIO_STREAM) >> 6;
        this.nalUnitType = uInt8 & 63;
    }

    public void setNalUnitType(int i10) {
        this.nalUnitType = i10;
    }

    public void setReserved(int i10) {
        this.reserved = i10;
    }

    public String toString() {
        return "SyncSampleEntry{reserved=" + this.reserved + ", nalUnitType=" + this.nalUnitType + '}';
    }
}
