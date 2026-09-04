package com.pgl.ssdk;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f35389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f35390b;

        public a(long j10, q qVar) {
            this.f35389a = j10;
            this.f35390b = qVar;
        }

        public q a() {
            return this.f35390b;
        }

        public long b() {
            return this.f35389a;
        }
    }

    public static t a(q qVar) throws s {
        o<ByteBuffer, Long> oVarA = p.a(qVar);
        if (oVarA == null) {
            throw new s("ZIP End of Central Directory record not found");
        }
        ByteBuffer byteBufferA = oVarA.a();
        long jLongValue = oVarA.b().longValue();
        byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
        long jC = p.c(byteBufferA);
        if (jC > jLongValue) {
            throw new s("ZIP Central Directory start offset out of range: " + jC + ". ZIP End of Central Directory offset: " + jLongValue);
        }
        long jD = p.d(byteBufferA);
        long j10 = jC + jD;
        if (j10 <= jLongValue) {
            return new t(jC, jD, p.e(byteBufferA), jLongValue, byteBufferA);
        }
        throw new s("ZIP Central Directory overlaps with End of Central Directory. CD end: " + j10 + ", EoCD start: " + jLongValue);
    }

    public static a a(q qVar, t tVar) throws b {
        long jA = tVar.a();
        long jC = tVar.c() + jA;
        long jE = tVar.e();
        if (jC != jE) {
            throw new b("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: " + jC + ", EoCD start: " + jE);
        }
        if (jA >= 32) {
            ByteBuffer byteBufferA = qVar.a(jA - 24, 24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferA.order(byteOrder);
            if (byteBufferA.getLong(8) == 2334950737559900225L && byteBufferA.getLong(16) == 3617552046287187010L) {
                long j10 = byteBufferA.getLong(0);
                if (j10 < byteBufferA.capacity() || j10 > 2147483639) {
                    throw new b("APK Signing Block size out of range: ".concat(String.valueOf(j10)));
                }
                long j11 = (int) (8 + j10);
                long j12 = jA - j11;
                if (j12 >= 0) {
                    ByteBuffer byteBufferA2 = qVar.a(j12, 8);
                    byteBufferA2.order(byteOrder);
                    long j13 = byteBufferA2.getLong(0);
                    if (j13 == j10) {
                        return new a(j12, qVar.a(j12, j11));
                    }
                    throw new b("APK Signing Block sizes in header and footer do not match: " + j13 + " vs " + j10);
                }
                throw new b("APK Signing Block offset out of range: ".concat(String.valueOf(j12)));
            }
            throw new b("No APK Signing Block before ZIP Central Directory");
        }
        throw new b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(jA)));
    }
}
