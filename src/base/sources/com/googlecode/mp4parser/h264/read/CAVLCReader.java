package com.googlecode.mp4parser.h264.read;

import com.googlecode.mp4parser.h264.BTree;
import com.googlecode.mp4parser.h264.Debug;
import com.mbridge.msdk.MBridgeConstans;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class CAVLCReader extends BitstreamReader {
    public CAVLCReader(InputStream inputStream) {
        super(inputStream);
    }

    private int readUE() {
        int i10 = 0;
        while (read1Bit() == 0) {
            i10++;
        }
        if (i10 <= 0) {
            return 0;
        }
        return (int) (((long) ((1 << i10) - 1)) + readNBit(i10));
    }

    private void trace(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        String strValueOf = String.valueOf(BitstreamReader.bitsRead - this.debugBits.length());
        int length = 8 - strValueOf.length();
        sb2.append("@" + strValueOf);
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(' ');
        }
        sb2.append(str);
        int length2 = (100 - sb2.length()) - this.debugBits.length();
        for (int i11 = 0; i11 < length2; i11++) {
            sb2.append(' ');
        }
        sb2.append(this.debugBits);
        sb2.append(" (" + str2 + ")");
        this.debugBits.clear();
        Debug.println(sb2.toString());
    }

    public byte[] read(int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) readByte();
        }
        return bArr;
    }

    public boolean readAE() {
        throw new UnsupportedOperationException("Stan");
    }

    public int readAEI() {
        throw new UnsupportedOperationException("Stan");
    }

    public boolean readBool(String str) {
        boolean z10 = read1Bit() != 0;
        trace(str, z10 ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
        return z10;
    }

    public Object readCE(BTree bTree, String str) {
        Object value;
        do {
            bTree = bTree.down(read1Bit());
            if (bTree == null) {
                throw new RuntimeException("Illegal code");
            }
            value = bTree.getValue();
        } while (value == null);
        trace(str, value.toString());
        return value;
    }

    public int readME(String str) {
        return readUE(str);
    }

    public long readNBit(int i10, String str) {
        long nBit = readNBit(i10);
        trace(str, String.valueOf(nBit));
        return nBit;
    }

    public int readSE(String str) {
        int ue2 = readUE();
        int i10 = ue2 & 1;
        int i11 = ((ue2 >> 1) + i10) * ((i10 << 1) - 1);
        trace(str, String.valueOf(i11));
        return i11;
    }

    public int readTE(int i10) {
        return i10 > 1 ? readUE() : (~read1Bit()) & 1;
    }

    public void readTrailingBits() {
        read1Bit();
        readRemainingByte();
    }

    public int readU(int i10, String str) {
        return (int) readNBit(i10, str);
    }

    public int readZeroBitCount(String str) {
        int i10 = 0;
        while (read1Bit() == 0) {
            i10++;
        }
        trace(str, String.valueOf(i10));
        return i10;
    }

    public int readUE(String str) {
        int ue2 = readUE();
        trace(str, String.valueOf(ue2));
        return ue2;
    }
}
