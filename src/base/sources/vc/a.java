package vc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import sc.p;
import wc.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final OutputStream f55399a = new C0837a();

    /* JADX INFO: renamed from: vc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0837a extends OutputStream {
        C0837a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            p.o(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            p.o(bArr);
            p.u(i10, i11 + i10, bArr.length);
        }
    }

    private static byte[] a(Queue queue, int i10) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i10 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        p.o(inputStream);
        p.o(outputStream);
        byte[] bArrC = c();
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArrC);
            if (i10 == -1) {
                return j10;
            }
            outputStream.write(bArrC, 0, i10);
            j10 += (long) i10;
        }
    }

    static byte[] c() {
        return new byte[8192];
    }

    public static long d(InputStream inputStream) {
        byte[] bArrC = c();
        long j10 = 0;
        while (true) {
            long j11 = inputStream.read(bArrC);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    public static byte[] e(InputStream inputStream) {
        p.o(inputStream);
        return f(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] f(InputStream inputStream, Queue queue, int i10) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i10) * 2));
        while (i10 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i10);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i11 = 0;
            while (i11 < iMin2) {
                int i12 = inputStream.read(bArr, i11, iMin2 - i11);
                if (i12 == -1) {
                    return a(queue, i10);
                }
                i11 += i12;
                i10 += i12;
            }
            iMin = d.g(iMin, iMin < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
