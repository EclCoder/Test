package com.mp4parser.iso14496.part15;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class HevcDecoderConfigurationRecord {
    int avgFrameRate;
    int bitDepthChromaMinus8;
    int bitDepthLumaMinus8;
    int chromaFormat;
    int configurationVersion;
    int constantFrameRate;
    boolean frame_only_constraint_flag;
    long general_constraint_indicator_flags;
    int general_level_idc;
    long general_profile_compatibility_flags;
    int general_profile_idc;
    int general_profile_space;
    boolean general_tier_flag;
    boolean interlaced_source_flag;
    int lengthSizeMinusOne;
    int min_spatial_segmentation_idc;
    boolean non_packed_constraint_flag;
    int numTemporalLayers;
    int parallelismType;
    boolean progressive_source_flag;
    boolean temporalIdNested;
    int reserved1 = 15;
    int reserved2 = 63;
    int reserved3 = 63;
    int reserved4 = 31;
    int reserved5 = 31;
    List<Array> arrays = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Array {
        public boolean array_completeness;
        public List<byte[]> nalUnits;
        public int nal_unit_type;
        public boolean reserved;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Array array = (Array) obj;
                if (this.array_completeness != array.array_completeness || this.nal_unit_type != array.nal_unit_type || this.reserved != array.reserved) {
                    return false;
                }
                ListIterator<byte[]> listIterator = this.nalUnits.listIterator();
                ListIterator<byte[]> listIterator2 = array.nalUnits.listIterator();
                while (listIterator.hasNext() && listIterator2.hasNext()) {
                    byte[] next = listIterator.next();
                    byte[] next2 = listIterator2.next();
                    if (next == null) {
                        if (next2 != null) {
                            return false;
                        }
                    } else if (!Arrays.equals(next, next2)) {
                        return false;
                    }
                }
                if (!listIterator.hasNext() && !listIterator2.hasNext()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = (((((this.array_completeness ? 1 : 0) * 31) + (this.reserved ? 1 : 0)) * 31) + this.nal_unit_type) * 31;
            List<byte[]> list = this.nalUnits;
            return i10 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Array{nal_unit_type=" + this.nal_unit_type + ", reserved=" + this.reserved + ", array_completeness=" + this.array_completeness + ", num_nals=" + this.nalUnits.size() + '}';
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HevcDecoderConfigurationRecord hevcDecoderConfigurationRecord = (HevcDecoderConfigurationRecord) obj;
        if (this.avgFrameRate != hevcDecoderConfigurationRecord.avgFrameRate || this.bitDepthChromaMinus8 != hevcDecoderConfigurationRecord.bitDepthChromaMinus8 || this.bitDepthLumaMinus8 != hevcDecoderConfigurationRecord.bitDepthLumaMinus8 || this.chromaFormat != hevcDecoderConfigurationRecord.chromaFormat || this.configurationVersion != hevcDecoderConfigurationRecord.configurationVersion || this.constantFrameRate != hevcDecoderConfigurationRecord.constantFrameRate || this.general_constraint_indicator_flags != hevcDecoderConfigurationRecord.general_constraint_indicator_flags || this.general_level_idc != hevcDecoderConfigurationRecord.general_level_idc || this.general_profile_compatibility_flags != hevcDecoderConfigurationRecord.general_profile_compatibility_flags || this.general_profile_idc != hevcDecoderConfigurationRecord.general_profile_idc || this.general_profile_space != hevcDecoderConfigurationRecord.general_profile_space || this.general_tier_flag != hevcDecoderConfigurationRecord.general_tier_flag || this.lengthSizeMinusOne != hevcDecoderConfigurationRecord.lengthSizeMinusOne || this.min_spatial_segmentation_idc != hevcDecoderConfigurationRecord.min_spatial_segmentation_idc || this.numTemporalLayers != hevcDecoderConfigurationRecord.numTemporalLayers || this.parallelismType != hevcDecoderConfigurationRecord.parallelismType || this.reserved1 != hevcDecoderConfigurationRecord.reserved1 || this.reserved2 != hevcDecoderConfigurationRecord.reserved2 || this.reserved3 != hevcDecoderConfigurationRecord.reserved3 || this.reserved4 != hevcDecoderConfigurationRecord.reserved4 || this.reserved5 != hevcDecoderConfigurationRecord.reserved5 || this.temporalIdNested != hevcDecoderConfigurationRecord.temporalIdNested) {
            return false;
        }
        List<Array> list = this.arrays;
        List<Array> list2 = hevcDecoderConfigurationRecord.arrays;
        return list == null ? list2 == null : list.equals(list2);
    }

    public List<Array> getArrays() {
        return this.arrays;
    }

    public int getAvgFrameRate() {
        return this.avgFrameRate;
    }

    public int getBitDepthChromaMinus8() {
        return this.bitDepthChromaMinus8;
    }

    public int getBitDepthLumaMinus8() {
        return this.bitDepthLumaMinus8;
    }

    public int getChromaFormat() {
        return this.chromaFormat;
    }

    public int getConfigurationVersion() {
        return this.configurationVersion;
    }

    public int getConstantFrameRate() {
        return this.constantFrameRate;
    }

    public long getGeneral_constraint_indicator_flags() {
        return this.general_constraint_indicator_flags;
    }

    public int getGeneral_level_idc() {
        return this.general_level_idc;
    }

    public long getGeneral_profile_compatibility_flags() {
        return this.general_profile_compatibility_flags;
    }

    public int getGeneral_profile_idc() {
        return this.general_profile_idc;
    }

    public int getGeneral_profile_space() {
        return this.general_profile_space;
    }

    public int getLengthSizeMinusOne() {
        return this.lengthSizeMinusOne;
    }

    public int getMin_spatial_segmentation_idc() {
        return this.min_spatial_segmentation_idc;
    }

    public int getNumTemporalLayers() {
        return this.numTemporalLayers;
    }

    public int getParallelismType() {
        return this.parallelismType;
    }

    public int getSize() {
        Iterator<Array> it = this.arrays.iterator();
        int length = 23;
        while (it.hasNext()) {
            length += 3;
            Iterator<byte[]> it2 = it.next().nalUnits.iterator();
            while (it2.hasNext()) {
                length = length + 2 + it2.next().length;
            }
        }
        return length;
    }

    public int hashCode() {
        int i10 = ((((((this.configurationVersion * 31) + this.general_profile_space) * 31) + (this.general_tier_flag ? 1 : 0)) * 31) + this.general_profile_idc) * 31;
        long j10 = this.general_profile_compatibility_flags;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.general_constraint_indicator_flags;
        int i12 = (((((((((((((((((((((((((((((((((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.general_level_idc) * 31) + this.reserved1) * 31) + this.min_spatial_segmentation_idc) * 31) + this.reserved2) * 31) + this.parallelismType) * 31) + this.reserved3) * 31) + this.chromaFormat) * 31) + this.reserved4) * 31) + this.bitDepthLumaMinus8) * 31) + this.reserved5) * 31) + this.bitDepthChromaMinus8) * 31) + this.avgFrameRate) * 31) + this.constantFrameRate) * 31) + this.numTemporalLayers) * 31) + (this.temporalIdNested ? 1 : 0)) * 31) + this.lengthSizeMinusOne) * 31;
        List<Array> list = this.arrays;
        return i12 + (list != null ? list.hashCode() : 0);
    }

    public boolean isFrame_only_constraint_flag() {
        return this.frame_only_constraint_flag;
    }

    public boolean isGeneral_tier_flag() {
        return this.general_tier_flag;
    }

    public boolean isInterlaced_source_flag() {
        return this.interlaced_source_flag;
    }

    public boolean isNon_packed_constraint_flag() {
        return this.non_packed_constraint_flag;
    }

    public boolean isProgressive_source_flag() {
        return this.progressive_source_flag;
    }

    public boolean isTemporalIdNested() {
        return this.temporalIdNested;
    }

    public void parse(ByteBuffer byteBuffer) {
        this.configurationVersion = IsoTypeReader.readUInt8(byteBuffer);
        int uInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.general_profile_space = (uInt8 & PsExtractor.AUDIO_STREAM) >> 6;
        this.general_tier_flag = (uInt8 & 32) > 0;
        this.general_profile_idc = uInt8 & 31;
        this.general_profile_compatibility_flags = IsoTypeReader.readUInt32(byteBuffer);
        long uInt48 = IsoTypeReader.readUInt48(byteBuffer);
        this.general_constraint_indicator_flags = uInt48;
        this.frame_only_constraint_flag = ((uInt48 >> 44) & 8) > 0;
        this.non_packed_constraint_flag = ((uInt48 >> 44) & 4) > 0;
        this.interlaced_source_flag = ((uInt48 >> 44) & 2) > 0;
        this.progressive_source_flag = ((uInt48 >> 44) & 1) > 0;
        this.general_constraint_indicator_flags = uInt48 & 140737488355327L;
        this.general_level_idc = IsoTypeReader.readUInt8(byteBuffer);
        int uInt16 = IsoTypeReader.readUInt16(byteBuffer);
        this.reserved1 = (61440 & uInt16) >> 12;
        this.min_spatial_segmentation_idc = uInt16 & 4095;
        int uInt9 = IsoTypeReader.readUInt8(byteBuffer);
        this.reserved2 = (uInt9 & 252) >> 2;
        this.parallelismType = uInt9 & 3;
        int uInt10 = IsoTypeReader.readUInt8(byteBuffer);
        this.reserved3 = (uInt10 & 252) >> 2;
        this.chromaFormat = uInt10 & 3;
        int uInt11 = IsoTypeReader.readUInt8(byteBuffer);
        this.reserved4 = (uInt11 & 248) >> 3;
        this.bitDepthLumaMinus8 = uInt11 & 7;
        int uInt12 = IsoTypeReader.readUInt8(byteBuffer);
        this.reserved5 = (uInt12 & 248) >> 3;
        this.bitDepthChromaMinus8 = uInt12 & 7;
        this.avgFrameRate = IsoTypeReader.readUInt16(byteBuffer);
        int uInt13 = IsoTypeReader.readUInt8(byteBuffer);
        this.constantFrameRate = (uInt13 & PsExtractor.AUDIO_STREAM) >> 6;
        this.numTemporalLayers = (uInt13 & 56) >> 3;
        this.temporalIdNested = (uInt13 & 4) > 0;
        this.lengthSizeMinusOne = uInt13 & 3;
        int uInt14 = IsoTypeReader.readUInt8(byteBuffer);
        this.arrays = new ArrayList();
        for (int i10 = 0; i10 < uInt14; i10++) {
            Array array = new Array();
            int uInt15 = IsoTypeReader.readUInt8(byteBuffer);
            array.array_completeness = (uInt15 & 128) > 0;
            array.reserved = (uInt15 & 64) > 0;
            array.nal_unit_type = uInt15 & 63;
            int uInt17 = IsoTypeReader.readUInt16(byteBuffer);
            array.nalUnits = new ArrayList();
            for (int i11 = 0; i11 < uInt17; i11++) {
                byte[] bArr = new byte[IsoTypeReader.readUInt16(byteBuffer)];
                byteBuffer.get(bArr);
                array.nalUnits.add(bArr);
            }
            this.arrays.add(array);
        }
    }

    public void setArrays(List<Array> list) {
        this.arrays = list;
    }

    public void setAvgFrameRate(int i10) {
        this.avgFrameRate = i10;
    }

    public void setBitDepthChromaMinus8(int i10) {
        this.bitDepthChromaMinus8 = i10;
    }

    public void setBitDepthLumaMinus8(int i10) {
        this.bitDepthLumaMinus8 = i10;
    }

    public void setChromaFormat(int i10) {
        this.chromaFormat = i10;
    }

    public void setConfigurationVersion(int i10) {
        this.configurationVersion = i10;
    }

    public void setConstantFrameRate(int i10) {
        this.constantFrameRate = i10;
    }

    public void setFrame_only_constraint_flag(boolean z10) {
        this.frame_only_constraint_flag = z10;
    }

    public void setGeneral_constraint_indicator_flags(long j10) {
        this.general_constraint_indicator_flags = j10;
    }

    public void setGeneral_level_idc(int i10) {
        this.general_level_idc = i10;
    }

    public void setGeneral_profile_compatibility_flags(long j10) {
        this.general_profile_compatibility_flags = j10;
    }

    public void setGeneral_profile_idc(int i10) {
        this.general_profile_idc = i10;
    }

    public void setGeneral_profile_space(int i10) {
        this.general_profile_space = i10;
    }

    public void setGeneral_tier_flag(boolean z10) {
        this.general_tier_flag = z10;
    }

    public void setInterlaced_source_flag(boolean z10) {
        this.interlaced_source_flag = z10;
    }

    public void setLengthSizeMinusOne(int i10) {
        this.lengthSizeMinusOne = i10;
    }

    public void setMin_spatial_segmentation_idc(int i10) {
        this.min_spatial_segmentation_idc = i10;
    }

    public void setNon_packed_constraint_flag(boolean z10) {
        this.non_packed_constraint_flag = z10;
    }

    public void setNumTemporalLayers(int i10) {
        this.numTemporalLayers = i10;
    }

    public void setParallelismType(int i10) {
        this.parallelismType = i10;
    }

    public void setProgressive_source_flag(boolean z10) {
        this.progressive_source_flag = z10;
    }

    public void setTemporalIdNested(boolean z10) {
        this.temporalIdNested = z10;
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb2 = new StringBuilder("HEVCDecoderConfigurationRecord{configurationVersion=");
        sb2.append(this.configurationVersion);
        sb2.append(", general_profile_space=");
        sb2.append(this.general_profile_space);
        sb2.append(", general_tier_flag=");
        sb2.append(this.general_tier_flag);
        sb2.append(", general_profile_idc=");
        sb2.append(this.general_profile_idc);
        sb2.append(", general_profile_compatibility_flags=");
        sb2.append(this.general_profile_compatibility_flags);
        sb2.append(", general_constraint_indicator_flags=");
        sb2.append(this.general_constraint_indicator_flags);
        sb2.append(", general_level_idc=");
        sb2.append(this.general_level_idc);
        String str5 = "";
        if (this.reserved1 != 15) {
            str = ", reserved1=" + this.reserved1;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(", min_spatial_segmentation_idc=");
        sb2.append(this.min_spatial_segmentation_idc);
        if (this.reserved2 != 63) {
            str2 = ", reserved2=" + this.reserved2;
        } else {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append(", parallelismType=");
        sb2.append(this.parallelismType);
        if (this.reserved3 != 63) {
            str3 = ", reserved3=" + this.reserved3;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", chromaFormat=");
        sb2.append(this.chromaFormat);
        if (this.reserved4 != 31) {
            str4 = ", reserved4=" + this.reserved4;
        } else {
            str4 = "";
        }
        sb2.append(str4);
        sb2.append(", bitDepthLumaMinus8=");
        sb2.append(this.bitDepthLumaMinus8);
        if (this.reserved5 != 31) {
            str5 = ", reserved5=" + this.reserved5;
        }
        sb2.append(str5);
        sb2.append(", bitDepthChromaMinus8=");
        sb2.append(this.bitDepthChromaMinus8);
        sb2.append(", avgFrameRate=");
        sb2.append(this.avgFrameRate);
        sb2.append(", constantFrameRate=");
        sb2.append(this.constantFrameRate);
        sb2.append(", numTemporalLayers=");
        sb2.append(this.numTemporalLayers);
        sb2.append(", temporalIdNested=");
        sb2.append(this.temporalIdNested);
        sb2.append(", lengthSizeMinusOne=");
        sb2.append(this.lengthSizeMinusOne);
        sb2.append(", arrays=");
        sb2.append(this.arrays);
        sb2.append('}');
        return sb2.toString();
    }

    public void write(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt8(byteBuffer, this.configurationVersion);
        IsoTypeWriter.writeUInt8(byteBuffer, (this.general_profile_space << 6) + (this.general_tier_flag ? 32 : 0) + this.general_profile_idc);
        IsoTypeWriter.writeUInt32(byteBuffer, this.general_profile_compatibility_flags);
        long j10 = this.general_constraint_indicator_flags;
        if (this.frame_only_constraint_flag) {
            j10 |= 140737488355328L;
        }
        if (this.non_packed_constraint_flag) {
            j10 |= 70368744177664L;
        }
        if (this.interlaced_source_flag) {
            j10 |= 35184372088832L;
        }
        if (this.progressive_source_flag) {
            j10 |= 17592186044416L;
        }
        IsoTypeWriter.writeUInt48(byteBuffer, j10);
        IsoTypeWriter.writeUInt8(byteBuffer, this.general_level_idc);
        IsoTypeWriter.writeUInt16(byteBuffer, (this.reserved1 << 12) + this.min_spatial_segmentation_idc);
        IsoTypeWriter.writeUInt8(byteBuffer, (this.reserved2 << 2) + this.parallelismType);
        IsoTypeWriter.writeUInt8(byteBuffer, (this.reserved3 << 2) + this.chromaFormat);
        IsoTypeWriter.writeUInt8(byteBuffer, (this.reserved4 << 3) + this.bitDepthLumaMinus8);
        IsoTypeWriter.writeUInt8(byteBuffer, (this.reserved5 << 3) + this.bitDepthChromaMinus8);
        IsoTypeWriter.writeUInt16(byteBuffer, this.avgFrameRate);
        IsoTypeWriter.writeUInt8(byteBuffer, (this.constantFrameRate << 6) + (this.numTemporalLayers << 3) + (this.temporalIdNested ? 4 : 0) + this.lengthSizeMinusOne);
        IsoTypeWriter.writeUInt8(byteBuffer, this.arrays.size());
        for (Array array : this.arrays) {
            IsoTypeWriter.writeUInt8(byteBuffer, (array.array_completeness ? 128 : 0) + (array.reserved ? 64 : 0) + array.nal_unit_type);
            IsoTypeWriter.writeUInt16(byteBuffer, array.nalUnits.size());
            for (byte[] bArr : array.nalUnits) {
                IsoTypeWriter.writeUInt16(byteBuffer, bArr.length);
                byteBuffer.put(bArr);
            }
        }
    }
}
