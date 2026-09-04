package com.mp4parser.iso14496.part15;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class TemporalLayerSampleGroup extends GroupEntry {
    public static final String TYPE = "tscl";
    int temporalLayerId;
    int tlAvgBitRate;
    int tlAvgFrameRate;
    int tlConstantFrameRate;
    int tlMaxBitRate;
    long tlconstraint_indicator_flags;
    int tllevel_idc;
    long tlprofile_compatibility_flags;
    int tlprofile_idc;
    int tlprofile_space;
    boolean tltier_flag;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemporalLayerSampleGroup temporalLayerSampleGroup = (TemporalLayerSampleGroup) obj;
        return this.temporalLayerId == temporalLayerSampleGroup.temporalLayerId && this.tlAvgBitRate == temporalLayerSampleGroup.tlAvgBitRate && this.tlAvgFrameRate == temporalLayerSampleGroup.tlAvgFrameRate && this.tlConstantFrameRate == temporalLayerSampleGroup.tlConstantFrameRate && this.tlMaxBitRate == temporalLayerSampleGroup.tlMaxBitRate && this.tlconstraint_indicator_flags == temporalLayerSampleGroup.tlconstraint_indicator_flags && this.tllevel_idc == temporalLayerSampleGroup.tllevel_idc && this.tlprofile_compatibility_flags == temporalLayerSampleGroup.tlprofile_compatibility_flags && this.tlprofile_idc == temporalLayerSampleGroup.tlprofile_idc && this.tlprofile_space == temporalLayerSampleGroup.tlprofile_space && this.tltier_flag == temporalLayerSampleGroup.tltier_flag;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public ByteBuffer get() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        IsoTypeWriter.writeUInt8(byteBufferAllocate, this.temporalLayerId);
        IsoTypeWriter.writeUInt8(byteBufferAllocate, (this.tlprofile_space << 6) + (this.tltier_flag ? 32 : 0) + this.tlprofile_idc);
        IsoTypeWriter.writeUInt32(byteBufferAllocate, this.tlprofile_compatibility_flags);
        IsoTypeWriter.writeUInt48(byteBufferAllocate, this.tlconstraint_indicator_flags);
        IsoTypeWriter.writeUInt8(byteBufferAllocate, this.tllevel_idc);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.tlMaxBitRate);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.tlAvgBitRate);
        IsoTypeWriter.writeUInt8(byteBufferAllocate, this.tlConstantFrameRate);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.tlAvgFrameRate);
        return (ByteBuffer) byteBufferAllocate.rewind();
    }

    public int getTemporalLayerId() {
        return this.temporalLayerId;
    }

    public int getTlAvgBitRate() {
        return this.tlAvgBitRate;
    }

    public int getTlAvgFrameRate() {
        return this.tlAvgFrameRate;
    }

    public int getTlConstantFrameRate() {
        return this.tlConstantFrameRate;
    }

    public int getTlMaxBitRate() {
        return this.tlMaxBitRate;
    }

    public long getTlconstraint_indicator_flags() {
        return this.tlconstraint_indicator_flags;
    }

    public int getTllevel_idc() {
        return this.tllevel_idc;
    }

    public long getTlprofile_compatibility_flags() {
        return this.tlprofile_compatibility_flags;
    }

    public int getTlprofile_idc() {
        return this.tlprofile_idc;
    }

    public int getTlprofile_space() {
        return this.tlprofile_space;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public String getType() {
        return TYPE;
    }

    public int hashCode() {
        int i10 = ((((((this.temporalLayerId * 31) + this.tlprofile_space) * 31) + (this.tltier_flag ? 1 : 0)) * 31) + this.tlprofile_idc) * 31;
        long j10 = this.tlprofile_compatibility_flags;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.tlconstraint_indicator_flags;
        return ((((((((((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.tllevel_idc) * 31) + this.tlMaxBitRate) * 31) + this.tlAvgBitRate) * 31) + this.tlConstantFrameRate) * 31) + this.tlAvgFrameRate;
    }

    public boolean isTltier_flag() {
        return this.tltier_flag;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public void parse(ByteBuffer byteBuffer) {
        this.temporalLayerId = IsoTypeReader.readUInt8(byteBuffer);
        int uInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.tlprofile_space = (uInt8 & PsExtractor.AUDIO_STREAM) >> 6;
        this.tltier_flag = (uInt8 & 32) > 0;
        this.tlprofile_idc = uInt8 & 31;
        this.tlprofile_compatibility_flags = IsoTypeReader.readUInt32(byteBuffer);
        this.tlconstraint_indicator_flags = IsoTypeReader.readUInt48(byteBuffer);
        this.tllevel_idc = IsoTypeReader.readUInt8(byteBuffer);
        this.tlMaxBitRate = IsoTypeReader.readUInt16(byteBuffer);
        this.tlAvgBitRate = IsoTypeReader.readUInt16(byteBuffer);
        this.tlConstantFrameRate = IsoTypeReader.readUInt8(byteBuffer);
        this.tlAvgFrameRate = IsoTypeReader.readUInt16(byteBuffer);
    }

    public void setTemporalLayerId(int i10) {
        this.temporalLayerId = i10;
    }

    public void setTlAvgBitRate(int i10) {
        this.tlAvgBitRate = i10;
    }

    public void setTlAvgFrameRate(int i10) {
        this.tlAvgFrameRate = i10;
    }

    public void setTlConstantFrameRate(int i10) {
        this.tlConstantFrameRate = i10;
    }

    public void setTlMaxBitRate(int i10) {
        this.tlMaxBitRate = i10;
    }

    public void setTlconstraint_indicator_flags(long j10) {
        this.tlconstraint_indicator_flags = j10;
    }

    public void setTllevel_idc(int i10) {
        this.tllevel_idc = i10;
    }

    public void setTlprofile_compatibility_flags(long j10) {
        this.tlprofile_compatibility_flags = j10;
    }

    public void setTlprofile_idc(int i10) {
        this.tlprofile_idc = i10;
    }

    public void setTlprofile_space(int i10) {
        this.tlprofile_space = i10;
    }

    public void setTltier_flag(boolean z10) {
        this.tltier_flag = z10;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public int size() {
        return 20;
    }

    public String toString() {
        return "TemporalLayerSampleGroup{temporalLayerId=" + this.temporalLayerId + ", tlprofile_space=" + this.tlprofile_space + ", tltier_flag=" + this.tltier_flag + ", tlprofile_idc=" + this.tlprofile_idc + ", tlprofile_compatibility_flags=" + this.tlprofile_compatibility_flags + ", tlconstraint_indicator_flags=" + this.tlconstraint_indicator_flags + ", tllevel_idc=" + this.tllevel_idc + ", tlMaxBitRate=" + this.tlMaxBitRate + ", tlAvgBitRate=" + this.tlAvgBitRate + ", tlConstantFrameRate=" + this.tlConstantFrameRate + ", tlAvgFrameRate=" + this.tlAvgFrameRate + '}';
    }
}
