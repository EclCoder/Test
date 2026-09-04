package com.googlecode.mp4parser.h264.write;

import com.googlecode.mp4parser.h264.Debug;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class BitstreamWriter {
    private int curBit;
    private int[] curByte = new int[8];
    private final OutputStream os;

    public BitstreamWriter(OutputStream outputStream) {
        this.os = outputStream;
    }

    private void writeCurByte() throws IOException {
        int[] iArr = this.curByte;
        this.os.write(iArr[7] | (iArr[0] << 7) | (iArr[1] << 6) | (iArr[2] << 5) | (iArr[3] << 4) | (iArr[4] << 3) | (iArr[5] << 2) | (iArr[6] << 1));
    }

    public void flush() throws IOException {
        for (int i10 = this.curBit; i10 < 8; i10++) {
            this.curByte[i10] = 0;
        }
        this.curBit = 0;
        writeCurByte();
    }

    public void write1Bit(int i10) throws IOException {
        Debug.print(i10);
        if (this.curBit == 8) {
            this.curBit = 0;
            writeCurByte();
        }
        int[] iArr = this.curByte;
        int i11 = this.curBit;
        this.curBit = i11 + 1;
        iArr[i11] = i10;
    }

    public void writeByte(int i10) throws IOException {
        this.os.write(i10);
    }

    public void writeNBit(long j10, int i10) throws IOException {
        for (int i11 = 0; i11 < i10; i11++) {
            write1Bit(((int) (j10 >> ((i10 - i11) - 1))) & 1);
        }
    }

    public void writeRemainingZero() throws IOException {
        writeNBit(0L, 8 - this.curBit);
    }
}
