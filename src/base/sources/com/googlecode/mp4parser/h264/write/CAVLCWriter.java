package com.googlecode.mp4parser.h264.write;

import com.googlecode.mp4parser.h264.Debug;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class CAVLCWriter extends BitstreamWriter {
    public CAVLCWriter(OutputStream outputStream) {
        super(outputStream);
    }

    public void writeBool(boolean z10, String str) throws IOException {
        Debug.print(String.valueOf(str) + "\t");
        write1Bit(z10 ? 1 : 0);
        Debug.println("\t" + z10);
    }

    public void writeNBit(long j10, int i10, String str) throws IOException {
        Debug.print(String.valueOf(str) + "\t");
        for (int i11 = 0; i11 < i10; i11++) {
            write1Bit(((int) (j10 >> ((i10 - i11) - 1))) & 1);
        }
        Debug.println("\t" + j10);
    }

    public void writeSE(int i10, String str) throws IOException {
        Debug.print(String.valueOf(str) + "\t");
        writeUE(((i10 << 1) * (i10 < 0 ? -1 : 1)) + (i10 <= 0 ? 0 : 1));
        Debug.println("\t" + i10);
    }

    public void writeSliceTrailingBits() {
        throw new IllegalStateException("todo");
    }

    public void writeTrailingBits() throws IOException {
        write1Bit(1);
        writeRemainingZero();
        flush();
    }

    public void writeU(int i10, int i11, String str) throws IOException {
        Debug.print(String.valueOf(str) + "\t");
        writeNBit((long) i10, i11);
        Debug.println("\t" + i10);
    }

    public void writeUE(int i10) throws IOException {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < 15) {
            int i14 = (1 << i12) + i13;
            if (i10 < i14) {
                i11 = i12;
                break;
            } else {
                i12++;
                i13 = i14;
            }
        }
        writeNBit(0L, i11);
        write1Bit(1);
        writeNBit(i10 - i13, i11);
    }

    public void writeU(int i10, int i11) throws IOException {
        writeNBit(i10, i11);
    }

    public void writeUE(int i10, String str) throws IOException {
        Debug.print(String.valueOf(str) + "\t");
        writeUE(i10);
        Debug.println("\t" + i10);
    }
}
