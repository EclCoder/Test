package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Descriptor(tags = {6})
public class SLConfigDescriptor extends BaseDescriptor {
    int predefined;

    public SLConfigDescriptor() {
        this.tag = 6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.predefined == ((SLConfigDescriptor) obj).predefined;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    int getContentSize() {
        return 1;
    }

    public int getPredefined() {
        return this.predefined;
    }

    public int hashCode() {
        return this.predefined;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer) {
        this.predefined = IsoTypeReader.readUInt8(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public ByteBuffer serialize() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(getSize());
        IsoTypeWriter.writeUInt8(byteBufferAllocate, 6);
        writeSize(byteBufferAllocate, getContentSize());
        IsoTypeWriter.writeUInt8(byteBufferAllocate, this.predefined);
        return byteBufferAllocate;
    }

    public void setPredefined(int i10) {
        this.predefined = i10;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public String toString() {
        return "SLConfigDescriptor{predefined=" + this.predefined + '}';
    }
}
