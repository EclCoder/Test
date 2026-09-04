package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class BitWriterBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private ByteBuffer buffer;
    int initialPos;
    int position = 0;

    public BitWriterBuffer(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        this.initialPos = byteBuffer.position();
    }

    public void writeBits(int i10, int i11) {
        int i12 = this.position;
        int i13 = 8 - (i12 % 8);
        if (i11 <= i13) {
            int i14 = this.buffer.get(this.initialPos + (i12 / 8));
            if (i14 < 0) {
                i14 += 256;
            }
            int i15 = i14 + (i10 << (i13 - i11));
            ByteBuffer byteBuffer = this.buffer;
            int i16 = this.initialPos + (this.position / 8);
            if (i15 > 127) {
                i15 -= 256;
            }
            byteBuffer.put(i16, (byte) i15);
            this.position += i11;
        } else {
            int i17 = i11 - i13;
            writeBits(i10 >> i17, i13);
            writeBits(i10 & ((1 << i17) - 1), i17);
        }
        ByteBuffer byteBuffer2 = this.buffer;
        int i18 = this.initialPos;
        int i19 = this.position;
        byteBuffer2.position(i18 + (i19 / 8) + (i19 % 8 <= 0 ? 0 : 1));
    }

    public void writeBool(boolean z10) {
        writeBits(z10 ? 1 : 0, 1);
    }
}
