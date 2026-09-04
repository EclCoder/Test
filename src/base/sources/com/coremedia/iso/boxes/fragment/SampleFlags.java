package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class SampleFlags {
    private byte isLeading;
    private byte reserved;
    private int sampleDegradationPriority;
    private byte sampleDependsOn;
    private byte sampleHasRedundancy;
    private byte sampleIsDependedOn;
    private boolean sampleIsDifferenceSample;
    private byte samplePaddingValue;

    public SampleFlags() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SampleFlags sampleFlags = (SampleFlags) obj;
        return this.isLeading == sampleFlags.isLeading && this.reserved == sampleFlags.reserved && this.sampleDegradationPriority == sampleFlags.sampleDegradationPriority && this.sampleDependsOn == sampleFlags.sampleDependsOn && this.sampleHasRedundancy == sampleFlags.sampleHasRedundancy && this.sampleIsDependedOn == sampleFlags.sampleIsDependedOn && this.sampleIsDifferenceSample == sampleFlags.sampleIsDifferenceSample && this.samplePaddingValue == sampleFlags.samplePaddingValue;
    }

    public void getContent(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt32(byteBuffer, ((long) (this.reserved << 28)) | ((long) (this.isLeading << 26)) | ((long) (this.sampleDependsOn << 24)) | ((long) (this.sampleIsDependedOn << 22)) | ((long) (this.sampleHasRedundancy << 20)) | ((long) (this.samplePaddingValue << 17)) | ((long) ((this.sampleIsDifferenceSample ? 1 : 0) << 16)) | ((long) this.sampleDegradationPriority));
    }

    public byte getIsLeading() {
        return this.isLeading;
    }

    public int getReserved() {
        return this.reserved;
    }

    public int getSampleDegradationPriority() {
        return this.sampleDegradationPriority;
    }

    public int getSampleDependsOn() {
        return this.sampleDependsOn;
    }

    public int getSampleHasRedundancy() {
        return this.sampleHasRedundancy;
    }

    public int getSampleIsDependedOn() {
        return this.sampleIsDependedOn;
    }

    public int getSamplePaddingValue() {
        return this.samplePaddingValue;
    }

    public int hashCode() {
        return (((((((((((((this.reserved * 31) + this.isLeading) * 31) + this.sampleDependsOn) * 31) + this.sampleIsDependedOn) * 31) + this.sampleHasRedundancy) * 31) + this.samplePaddingValue) * 31) + (this.sampleIsDifferenceSample ? 1 : 0)) * 31) + this.sampleDegradationPriority;
    }

    public boolean isSampleIsDifferenceSample() {
        return this.sampleIsDifferenceSample;
    }

    public void setIsLeading(byte b10) {
        this.isLeading = b10;
    }

    public void setReserved(int i10) {
        this.reserved = (byte) i10;
    }

    public void setSampleDegradationPriority(int i10) {
        this.sampleDegradationPriority = i10;
    }

    public void setSampleDependsOn(int i10) {
        this.sampleDependsOn = (byte) i10;
    }

    public void setSampleHasRedundancy(int i10) {
        this.sampleHasRedundancy = (byte) i10;
    }

    public void setSampleIsDependedOn(int i10) {
        this.sampleIsDependedOn = (byte) i10;
    }

    public void setSampleIsDifferenceSample(boolean z10) {
        this.sampleIsDifferenceSample = z10;
    }

    public void setSamplePaddingValue(int i10) {
        this.samplePaddingValue = (byte) i10;
    }

    public String toString() {
        return "SampleFlags{reserved=" + ((int) this.reserved) + ", isLeading=" + ((int) this.isLeading) + ", depOn=" + ((int) this.sampleDependsOn) + ", isDepOn=" + ((int) this.sampleIsDependedOn) + ", hasRedundancy=" + ((int) this.sampleHasRedundancy) + ", padValue=" + ((int) this.samplePaddingValue) + ", isDiffSample=" + this.sampleIsDifferenceSample + ", degradPrio=" + this.sampleDegradationPriority + '}';
    }

    public SampleFlags(ByteBuffer byteBuffer) {
        long uInt32 = IsoTypeReader.readUInt32(byteBuffer);
        this.reserved = (byte) (((-268435456) & uInt32) >> 28);
        this.isLeading = (byte) ((201326592 & uInt32) >> 26);
        this.sampleDependsOn = (byte) ((50331648 & uInt32) >> 24);
        this.sampleIsDependedOn = (byte) ((12582912 & uInt32) >> 22);
        this.sampleHasRedundancy = (byte) ((3145728 & uInt32) >> 20);
        this.samplePaddingValue = (byte) ((917504 & uInt32) >> 17);
        this.sampleIsDifferenceSample = ((65536 & uInt32) >> 16) > 0;
        this.sampleDegradationPriority = (int) (uInt32 & 65535);
    }
}
