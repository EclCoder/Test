package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Descriptor(tags = {19})
public class ExtensionProfileLevelDescriptor extends BaseDescriptor {
    byte[] bytes;

    public ExtensionProfileLevelDescriptor() {
        this.tag = 19;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    int getContentSize() {
        throw new RuntimeException("Not Implemented");
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer) {
        if (getSize() > 0) {
            byte[] bArr = new byte[getSize()];
            this.bytes = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public ByteBuffer serialize() {
        throw new RuntimeException("Not Implemented");
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExtensionDescriptor");
        sb2.append("{bytes=");
        byte[] bArr = this.bytes;
        sb2.append(bArr == null ? "null" : Hex.encodeHex(bArr));
        sb2.append('}');
        return sb2.toString();
    }
}
