package com.googlecode.mp4parser.h264.read;

import com.googlecode.mp4parser.h264.CharCache;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class BitstreamReader {
    protected static int bitsRead;
    private int curByte;
    protected CharCache debugBits = new CharCache(50);
    private InputStream is;
    int nBit;
    private int nextByte;

    public BitstreamReader(InputStream inputStream) {
        this.is = inputStream;
        this.curByte = inputStream.read();
        this.nextByte = inputStream.read();
    }

    private void advance() {
        this.curByte = this.nextByte;
        this.nextByte = this.is.read();
        this.nBit = 0;
    }

    public long getBitPosition() {
        return (bitsRead * 8) + (this.nBit % 8);
    }

    public int getCurBit() {
        return this.nBit;
    }

    public boolean isByteAligned() {
        return this.nBit % 8 == 0;
    }

    public boolean moreRBSPData() {
        if (this.nBit == 8) {
            advance();
        }
        int i10 = 1 << (7 - this.nBit);
        int i11 = this.curByte;
        return (i11 == -1 || (this.nextByte == -1 && ((((i10 << 1) - 1) & i11) == i10))) ? false : true;
    }

    public int peakNextBits(int i10) {
        if (i10 > 8) {
            throw new IllegalArgumentException("N should be less then 8");
        }
        if (this.nBit == 8) {
            advance();
            if (this.curByte == -1) {
                return -1;
            }
        }
        int i11 = this.nBit;
        int[] iArr = new int[16 - i11];
        int i12 = 0;
        while (i11 < 8) {
            iArr[i12] = (this.curByte >> (7 - i11)) & 1;
            i11++;
            i12++;
        }
        int i13 = 0;
        while (i13 < 8) {
            iArr[i12] = (this.nextByte >> (7 - i13)) & 1;
            i13++;
            i12++;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < i10; i15++) {
            i14 = (i14 << 1) | iArr[i15];
        }
        return i14;
    }

    public int read1Bit() {
        if (this.nBit == 8) {
            advance();
            if (this.curByte == -1) {
                return -1;
            }
        }
        int i10 = this.curByte;
        int i11 = this.nBit;
        int i12 = (i10 >> (7 - i11)) & 1;
        this.nBit = i11 + 1;
        this.debugBits.append(i12 == 0 ? '0' : '1');
        bitsRead++;
        return i12;
    }

    public boolean readBool() {
        return read1Bit() == 1;
    }

    public int readByte() {
        if (this.nBit > 0) {
            advance();
        }
        int i10 = this.curByte;
        advance();
        return i10;
    }

    public long readNBit(int i10) {
        if (i10 > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 1) | ((long) read1Bit());
        }
        return j10;
    }

    public long readRemainingByte() {
        return readNBit(8 - this.nBit);
    }

    public void close() {
    }
}
