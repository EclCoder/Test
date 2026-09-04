package com.pgl.ssdk;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class p {
    public static o<ByteBuffer, Long> a(q qVar) {
        if (qVar.a() < 22) {
            return null;
        }
        o<ByteBuffer, Long> oVarA = a(qVar, 0);
        return oVarA != null ? oVarA : a(qVar, 65535);
    }

    private static int b(ByteBuffer byteBuffer) {
        a(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        if (iCapacity < 22) {
            return -1;
        }
        int i10 = iCapacity - 22;
        int iMin = Math.min(i10, 65535);
        for (int i11 = 0; i11 <= iMin; i11++) {
            int i12 = i10 - i11;
            if (byteBuffer.getInt(i12) == 101010256 && a(byteBuffer, i12 + 20) == i11) {
                return i12;
            }
        }
        return -1;
    }

    public static long c(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return b(byteBuffer, byteBuffer.position() + 16);
    }

    public static long d(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return b(byteBuffer, byteBuffer.position() + 12);
    }

    public static int e(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return a(byteBuffer, byteBuffer.position() + 10);
    }

    private static o<ByteBuffer, Long> a(q qVar, int i10) {
        if (i10 >= 0 && i10 <= 65535) {
            long jA = qVar.a();
            if (jA < 22) {
                return null;
            }
            int iMin = ((int) Math.min(i10, jA - 22)) + 22;
            long j10 = jA - ((long) iMin);
            ByteBuffer byteBufferA = qVar.a(j10, iMin);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferA.order(byteOrder);
            int iB = b(byteBufferA);
            if (iB == -1) {
                return null;
            }
            byteBufferA.position(iB);
            ByteBuffer byteBufferSlice = byteBufferA.slice();
            byteBufferSlice.order(byteOrder);
            return o.a(byteBufferSlice, Long.valueOf(j10 + ((long) iB)));
        }
        throw new IllegalArgumentException("maxCommentSize: ".concat(String.valueOf(i10)));
    }

    static long b(ByteBuffer byteBuffer, int i10) {
        return ((long) byteBuffer.getInt(i10)) & 4294967295L;
    }

    static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static int a(ByteBuffer byteBuffer, int i10) {
        return byteBuffer.getShort(i10) & 65535;
    }
}
