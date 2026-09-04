package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class BitReaderBuffer {
    private ByteBuffer buffer;
    int initialPos;
    int position;

    public BitReaderBuffer(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        this.initialPos = byteBuffer.position();
    }

    public int byteSync() {
        int i10 = 8 - (this.position % 8);
        if (i10 == 8) {
            i10 = 0;
        }
        readBits(i10);
        return i10;
    }

    public int getPosition() {
        return this.position;
    }

    public int readBits(int i10) {
        int bits;
        int i11 = this.buffer.get(this.initialPos + (this.position / 8));
        if (i11 < 0) {
            i11 += 256;
        }
        int i12 = this.position;
        int i13 = 8 - (i12 % 8);
        if (i10 <= i13) {
            bits = ((i11 << (i12 % 8)) & 255) >> ((i12 % 8) + (i13 - i10));
            this.position = i12 + i10;
        } else {
            int i14 = i10 - i13;
            bits = (readBits(i13) << i14) + readBits(i14);
        }
        this.buffer.position(this.initialPos + ((int) Math.ceil(((double) this.position) / 8.0d)));
        return bits;
    }

    public boolean readBool() {
        return readBits(1) == 1;
    }

    public int remainingBits() {
        return (this.buffer.limit() * 8) - this.position;
    }
}
