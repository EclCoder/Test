package uc;

import com.google.common.primitives.j;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class i extends uc.a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final e f54405b = new i(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final e f54406c = new i(g.f54404a);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54407a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f54408d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f54409e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f54410f;

        a(int i10) {
            super(16);
            long j10 = i10;
            this.f54408d = j10;
            this.f54409e = j10;
            this.f54410f = 0;
        }

        private void k(long j10, long j11) {
            long jM = m(j10) ^ this.f54408d;
            this.f54408d = jM;
            long jRotateLeft = Long.rotateLeft(jM, 27);
            long j12 = this.f54409e;
            this.f54408d = ((jRotateLeft + j12) * 5) + 1390208809;
            long jN = n(j11) ^ j12;
            this.f54409e = jN;
            this.f54409e = ((Long.rotateLeft(jN, 31) + this.f54408d) * 5) + 944331445;
        }

        private static long l(long j10) {
            long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
            long j12 = (j11 ^ (j11 >>> 33)) * (-4265267296055464877L);
            return j12 ^ (j12 >>> 33);
        }

        private static long m(long j10) {
            return Long.rotateLeft(j10 * (-8663945395140668459L), 31) * 5545529020109919103L;
        }

        private static long n(long j10) {
            return Long.rotateLeft(j10 * 5545529020109919103L, 33) * (-8663945395140668459L);
        }

        @Override // uc.c
        protected d e() {
            long j10 = this.f54408d;
            int i10 = this.f54410f;
            long j11 = j10 ^ ((long) i10);
            long j12 = this.f54409e ^ ((long) i10);
            long j13 = j11 + j12;
            this.f54408d = j13;
            this.f54409e = j12 + j13;
            this.f54408d = l(j13);
            long jL = l(this.f54409e);
            long j14 = this.f54408d + jL;
            this.f54408d = j14;
            this.f54409e = jL + j14;
            return d.j(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f54408d).putLong(this.f54409e).array());
        }

        @Override // uc.c
        protected void h(ByteBuffer byteBuffer) {
            k(byteBuffer.getLong(), byteBuffer.getLong());
            this.f54410f += 16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // uc.c
        protected void i(ByteBuffer byteBuffer) {
            long jB;
            long jB2;
            long jB3;
            long jB4;
            long jB5;
            long jB6;
            long jB7;
            this.f54410f += byteBuffer.remaining();
            long jB8 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    jB = 0;
                    jB7 = jB ^ ((long) j.b(byteBuffer.get(0)));
                    this.f54408d = m(jB7) ^ this.f54408d;
                    this.f54409e ^= n(jB8);
                    return;
                case 2:
                    jB2 = 0;
                    jB = jB2 ^ (((long) j.b(byteBuffer.get(1))) << 8);
                    jB7 = jB ^ ((long) j.b(byteBuffer.get(0)));
                    this.f54408d = m(jB7) ^ this.f54408d;
                    this.f54409e ^= n(jB8);
                    return;
                case 3:
                    jB3 = 0;
                    jB2 = (((long) j.b(byteBuffer.get(2))) << 16) ^ jB3;
                    jB = jB2 ^ (((long) j.b(byteBuffer.get(1))) << 8);
                    jB7 = jB ^ ((long) j.b(byteBuffer.get(0)));
                    this.f54408d = m(jB7) ^ this.f54408d;
                    this.f54409e ^= n(jB8);
                    return;
                case 4:
                    jB4 = 0;
                    jB3 = jB4 ^ (((long) j.b(byteBuffer.get(3))) << 24);
                    jB2 = (((long) j.b(byteBuffer.get(2))) << 16) ^ jB3;
                    jB = jB2 ^ (((long) j.b(byteBuffer.get(1))) << 8);
                    jB7 = jB ^ ((long) j.b(byteBuffer.get(0)));
                    this.f54408d = m(jB7) ^ this.f54408d;
                    this.f54409e ^= n(jB8);
                    return;
                case 5:
                    jB5 = 0;
                    jB4 = jB5 ^ (((long) j.b(byteBuffer.get(4))) << 32);
                    jB3 = jB4 ^ (((long) j.b(byteBuffer.get(3))) << 24);
                    jB2 = (((long) j.b(byteBuffer.get(2))) << 16) ^ jB3;
                    jB = jB2 ^ (((long) j.b(byteBuffer.get(1))) << 8);
                    jB7 = jB ^ ((long) j.b(byteBuffer.get(0)));
                    this.f54408d = m(jB7) ^ this.f54408d;
                    this.f54409e ^= n(jB8);
                    return;
                case 6:
                    jB6 = 0;
                    jB5 = (((long) j.b(byteBuffer.get(5))) << 40) ^ jB6;
                    jB4 = jB5 ^ (((long) j.b(byteBuffer.get(4))) << 32);
                    jB3 = jB4 ^ (((long) j.b(byteBuffer.get(3))) << 24);
                    jB2 = (((long) j.b(byteBuffer.get(2))) << 16) ^ jB3;
                    jB = jB2 ^ (((long) j.b(byteBuffer.get(1))) << 8);
                    jB7 = jB ^ ((long) j.b(byteBuffer.get(0)));
                    this.f54408d = m(jB7) ^ this.f54408d;
                    this.f54409e ^= n(jB8);
                    return;
                case 7:
                    jB6 = ((long) j.b(byteBuffer.get(6))) << 48;
                    jB5 = (((long) j.b(byteBuffer.get(5))) << 40) ^ jB6;
                    jB4 = jB5 ^ (((long) j.b(byteBuffer.get(4))) << 32);
                    jB3 = jB4 ^ (((long) j.b(byteBuffer.get(3))) << 24);
                    jB2 = (((long) j.b(byteBuffer.get(2))) << 16) ^ jB3;
                    jB = jB2 ^ (((long) j.b(byteBuffer.get(1))) << 8);
                    jB7 = jB ^ ((long) j.b(byteBuffer.get(0)));
                    this.f54408d = m(jB7) ^ this.f54408d;
                    this.f54409e ^= n(jB8);
                    return;
                case 8:
                    jB7 = byteBuffer.getLong();
                    this.f54408d = m(jB7) ^ this.f54408d;
                    this.f54409e ^= n(jB8);
                    return;
                case 9:
                    jB8 ^= (long) j.b(byteBuffer.get(8));
                    jB7 = byteBuffer.getLong();
                    this.f54408d = m(jB7) ^ this.f54408d;
                    this.f54409e ^= n(jB8);
                    return;
                case 10:
                    jB8 ^= ((long) j.b(byteBuffer.get(9))) << 8;
                    jB8 ^= (long) j.b(byteBuffer.get(8));
                    jB7 = byteBuffer.getLong();
                    this.f54408d = m(jB7) ^ this.f54408d;
                    this.f54409e ^= n(jB8);
                    return;
                case 11:
                    jB8 ^= ((long) j.b(byteBuffer.get(10))) << 16;
                    jB8 ^= ((long) j.b(byteBuffer.get(9))) << 8;
                    jB8 ^= (long) j.b(byteBuffer.get(8));
                    jB7 = byteBuffer.getLong();
                    this.f54408d = m(jB7) ^ this.f54408d;
                    this.f54409e ^= n(jB8);
                    return;
                case 12:
                    jB8 ^= ((long) j.b(byteBuffer.get(11))) << 24;
                    jB8 ^= ((long) j.b(byteBuffer.get(10))) << 16;
                    jB8 ^= ((long) j.b(byteBuffer.get(9))) << 8;
                    jB8 ^= (long) j.b(byteBuffer.get(8));
                    jB7 = byteBuffer.getLong();
                    this.f54408d = m(jB7) ^ this.f54408d;
                    this.f54409e ^= n(jB8);
                    return;
                case 13:
                    jB8 ^= ((long) j.b(byteBuffer.get(12))) << 32;
                    jB8 ^= ((long) j.b(byteBuffer.get(11))) << 24;
                    jB8 ^= ((long) j.b(byteBuffer.get(10))) << 16;
                    jB8 ^= ((long) j.b(byteBuffer.get(9))) << 8;
                    jB8 ^= (long) j.b(byteBuffer.get(8));
                    jB7 = byteBuffer.getLong();
                    this.f54408d = m(jB7) ^ this.f54408d;
                    this.f54409e ^= n(jB8);
                    return;
                case 14:
                    jB8 ^= ((long) j.b(byteBuffer.get(13))) << 40;
                    jB8 ^= ((long) j.b(byteBuffer.get(12))) << 32;
                    jB8 ^= ((long) j.b(byteBuffer.get(11))) << 24;
                    jB8 ^= ((long) j.b(byteBuffer.get(10))) << 16;
                    jB8 ^= ((long) j.b(byteBuffer.get(9))) << 8;
                    jB8 ^= (long) j.b(byteBuffer.get(8));
                    jB7 = byteBuffer.getLong();
                    this.f54408d = m(jB7) ^ this.f54408d;
                    this.f54409e ^= n(jB8);
                    return;
                case 15:
                    jB8 = ((long) j.b(byteBuffer.get(14))) << 48;
                    jB8 ^= ((long) j.b(byteBuffer.get(13))) << 40;
                    jB8 ^= ((long) j.b(byteBuffer.get(12))) << 32;
                    jB8 ^= ((long) j.b(byteBuffer.get(11))) << 24;
                    jB8 ^= ((long) j.b(byteBuffer.get(10))) << 16;
                    jB8 ^= ((long) j.b(byteBuffer.get(9))) << 8;
                    jB8 ^= (long) j.b(byteBuffer.get(8));
                    jB7 = byteBuffer.getLong();
                    this.f54408d = m(jB7) ^ this.f54408d;
                    this.f54409e ^= n(jB8);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }
    }

    i(int i10) {
        this.f54407a = i10;
    }

    @Override // uc.e
    public f d() {
        return new a(this.f54407a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f54407a == ((i) obj).f54407a;
    }

    public int hashCode() {
        return i.class.hashCode() ^ this.f54407a;
    }

    public String toString() {
        return "Hashing.murmur3_128(" + this.f54407a + ")";
    }
}
