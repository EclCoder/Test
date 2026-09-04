package androidx.datastore.preferences.protobuf;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile int f3552f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f3553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f3554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f3555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    i f3556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3557e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends h {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f3558g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f3559h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f3560i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f3561j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f3562k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f3563l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f3564m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f3565n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f3566o;

        private void O() {
            int i10 = this.f3560i + this.f3561j;
            this.f3560i = i10;
            int i11 = i10 - this.f3563l;
            int i12 = this.f3566o;
            if (i11 <= i12) {
                this.f3561j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f3561j = i13;
            this.f3560i = i10 - i13;
        }

        private void Q() throws InvalidProtocolBufferException {
            if (this.f3560i - this.f3562k >= 10) {
                R();
            } else {
                S();
            }
        }

        private void R() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f3558g;
                int i11 = this.f3562k;
                this.f3562k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        private void S() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String A() throws InvalidProtocolBufferException {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f3560i;
                int i11 = this.f3562k;
                if (iL <= i10 - i11) {
                    String str = new String(this.f3558g, i11, iL, x.f3752b);
                    this.f3562k += iL;
                    return str;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.r();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String B() throws InvalidProtocolBufferException {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f3560i;
                int i11 = this.f3562k;
                if (iL <= i10 - i11) {
                    String strA = m1.a(this.f3558g, i11, iL);
                    this.f3562k += iL;
                    return strA;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL <= 0) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.r();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int C() throws InvalidProtocolBufferException {
            if (f()) {
                this.f3564m = 0;
                return 0;
            }
            int iL = L();
            this.f3564m = iL;
            if (n1.a(iL) != 0) {
                return this.f3564m;
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int D() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long E() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean F(int i10) throws InvalidProtocolBufferException {
            int iB = n1.b(i10);
            if (iB == 0) {
                Q();
                return true;
            }
            if (iB == 1) {
                P(8);
                return true;
            }
            if (iB == 2) {
                P(L());
                return true;
            }
            if (iB == 3) {
                G();
                a(n1.c(n1.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.j();
            }
            P(4);
            return true;
        }

        public byte H() throws InvalidProtocolBufferException {
            int i10 = this.f3562k;
            if (i10 == this.f3560i) {
                throw InvalidProtocolBufferException.r();
            }
            byte[] bArr = this.f3558g;
            this.f3562k = i10 + 1;
            return bArr[i10];
        }

        public byte[] I(int i10) throws InvalidProtocolBufferException {
            if (i10 > 0) {
                int i11 = this.f3560i;
                int i12 = this.f3562k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f3562k = i13;
                    return Arrays.copyOfRange(this.f3558g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.r();
            }
            if (i10 == 0) {
                return x.f3754d;
            }
            throw InvalidProtocolBufferException.l();
        }

        public int J() throws InvalidProtocolBufferException {
            int i10 = this.f3562k;
            if (this.f3560i - i10 < 4) {
                throw InvalidProtocolBufferException.r();
            }
            byte[] bArr = this.f3558g;
            this.f3562k = i10 + 4;
            return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        public long K() throws InvalidProtocolBufferException {
            int i10 = this.f3562k;
            if (this.f3560i - i10 < 8) {
                throw InvalidProtocolBufferException.r();
            }
            byte[] bArr = this.f3558g;
            this.f3562k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int L() {
            int i10;
            int i11 = this.f3562k;
            int i12 = this.f3560i;
            if (i12 != i11) {
                byte[] bArr = this.f3558g;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f3562k = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f3562k = i14;
                    return i10;
                }
            }
            return (int) N();
        }

        public long M() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f3562k;
            int i11 = this.f3560i;
            if (i11 != i10) {
                byte[] bArr = this.f3558g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f3562k = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i19]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f3562k = i13;
                    return j10;
                }
            }
            return N();
        }

        long N() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bH = H();
                j10 |= ((long) (bH & 127)) << i10;
                if ((bH & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        public void P(int i10) throws InvalidProtocolBufferException {
            if (i10 >= 0) {
                int i11 = this.f3560i;
                int i12 = this.f3562k;
                if (i10 <= i11 - i12) {
                    this.f3562k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.r();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f3564m != i10) {
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int e() {
            return this.f3562k - this.f3563l;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean f() {
            return this.f3562k == this.f3560i;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void l(int i10) {
            this.f3566o = i10;
            O();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int m(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            int iE = i10 + e();
            if (iE < 0) {
                throw InvalidProtocolBufferException.m();
            }
            int i11 = this.f3566o;
            if (iE > i11) {
                throw InvalidProtocolBufferException.r();
            }
            this.f3566o = iE;
            O();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean n() {
            return M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public g o() {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f3560i;
                int i11 = this.f3562k;
                if (iL <= i10 - i11) {
                    g gVarZ = (this.f3559h && this.f3565n) ? g.z(this.f3558g, i11, iL) : g.h(this.f3558g, i11, iL);
                    this.f3562k += iL;
                    return gVarZ;
                }
            }
            return iL == 0 ? g.f3535b : g.y(I(iL));
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public double p() {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int q() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int r() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long s() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public float t() {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int u() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long v() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int w() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long x() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int y() {
            return h.c(L());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long z() {
            return h.d(M());
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f3566o = Integer.MAX_VALUE;
            this.f3558g = bArr;
            this.f3560i = i11 + i10;
            this.f3562k = i10;
            this.f3563l = i10;
            this.f3559h = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c extends h {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final InputStream f3567g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final byte[] f3568h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f3569i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f3570j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f3571k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f3572l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f3573m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f3574n;

        private static int H(InputStream inputStream) throws InvalidProtocolBufferException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e10) {
                e10.o();
                throw e10;
            }
        }

        private static int I(InputStream inputStream, byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (InvalidProtocolBufferException e10) {
                e10.o();
                throw e10;
            }
        }

        private g J(int i10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return g.g(bArrM);
            }
            int i11 = this.f3571k;
            int i12 = this.f3569i;
            int length = i12 - i11;
            this.f3573m += i12;
            this.f3571k = 0;
            this.f3569i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f3568h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return g.y(bArr);
        }

        private byte[] L(int i10, boolean z10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return z10 ? (byte[]) bArrM.clone() : bArrM;
            }
            int i11 = this.f3571k;
            int i12 = this.f3569i;
            int length = i12 - i11;
            this.f3573m += i12;
            this.f3571k = 0;
            this.f3569i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f3568h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] M(int i10) throws InvalidProtocolBufferException {
            if (i10 == 0) {
                return x.f3754d;
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            int i11 = this.f3573m;
            int i12 = this.f3571k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f3555c > 0) {
                throw InvalidProtocolBufferException.q();
            }
            int i14 = this.f3574n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw InvalidProtocolBufferException.r();
            }
            int i15 = this.f3569i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > H(this.f3567g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f3568h, this.f3571k, bArr, 0, i15);
            this.f3573m += this.f3569i;
            this.f3571k = 0;
            this.f3569i = 0;
            while (i15 < i10) {
                int I = I(this.f3567g, bArr, i15, i10 - i15);
                if (I == -1) {
                    throw InvalidProtocolBufferException.r();
                }
                this.f3573m += I;
                i15 += I;
            }
            return bArr;
        }

        private List N(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f3567g.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw InvalidProtocolBufferException.r();
                    }
                    this.f3573m += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void T() {
            int i10 = this.f3569i + this.f3570j;
            this.f3569i = i10;
            int i11 = this.f3573m + i10;
            int i12 = this.f3574n;
            if (i11 <= i12) {
                this.f3570j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f3570j = i13;
            this.f3569i = i10 - i13;
        }

        private void U(int i10) throws InvalidProtocolBufferException {
            if (b0(i10)) {
                return;
            }
            if (i10 <= (this.f3555c - this.f3573m) - this.f3571k) {
                throw InvalidProtocolBufferException.r();
            }
            throw InvalidProtocolBufferException.q();
        }

        private static long V(InputStream inputStream, long j10) throws InvalidProtocolBufferException {
            try {
                return inputStream.skip(j10);
            } catch (InvalidProtocolBufferException e10) {
                e10.o();
                throw e10;
            }
        }

        private void X(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            int i11 = this.f3573m;
            int i12 = this.f3571k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f3574n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw InvalidProtocolBufferException.r();
            }
            this.f3573m = i11 + i12;
            int i15 = this.f3569i - i12;
            this.f3569i = 0;
            this.f3571k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jV = V(this.f3567g, j10);
                    if (jV < 0 || jV > j10) {
                        throw new IllegalStateException(this.f3567g.getClass() + "#skip returned invalid result: " + jV + "\nThe InputStream implementation is buggy.");
                    }
                    if (jV == 0) {
                        break;
                    } else {
                        i15 += (int) jV;
                    }
                } catch (Throwable th2) {
                    this.f3573m += i15;
                    T();
                    throw th2;
                }
            }
            this.f3573m += i15;
            T();
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f3569i;
            int i17 = i16 - this.f3571k;
            this.f3571k = i16;
            U(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f3569i;
                if (i18 <= i19) {
                    this.f3571k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f3571k = i19;
                    U(1);
                }
            }
        }

        private void Y() throws InvalidProtocolBufferException {
            if (this.f3569i - this.f3571k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f3568h;
                int i11 = this.f3571k;
                this.f3571k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        private void a0() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        private boolean b0(int i10) throws InvalidProtocolBufferException {
            int i11 = this.f3571k;
            int i12 = i11 + i10;
            int i13 = this.f3569i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f3555c;
            int i15 = this.f3573m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f3574n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f3568h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f3573m += i11;
                this.f3569i -= i11;
                this.f3571k = 0;
            }
            InputStream inputStream = this.f3567g;
            byte[] bArr2 = this.f3568h;
            int i16 = this.f3569i;
            int I = I(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f3555c - this.f3573m) - i16));
            if (I == 0 || I < -1 || I > this.f3568h.length) {
                throw new IllegalStateException(this.f3567g.getClass() + "#read(byte[]) returned invalid result: " + I + "\nThe InputStream implementation is buggy.");
            }
            if (I <= 0) {
                return false;
            }
            this.f3569i += I;
            T();
            if (this.f3569i >= i10) {
                return true;
            }
            return b0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String A() throws InvalidProtocolBufferException {
            int iQ = Q();
            if (iQ > 0) {
                int i10 = this.f3569i;
                int i11 = this.f3571k;
                if (iQ <= i10 - i11) {
                    String str = new String(this.f3568h, i11, iQ, x.f3752b);
                    this.f3571k += iQ;
                    return str;
                }
            }
            if (iQ == 0) {
                return "";
            }
            if (iQ < 0) {
                throw InvalidProtocolBufferException.l();
            }
            if (iQ > this.f3569i) {
                return new String(L(iQ, false), x.f3752b);
            }
            U(iQ);
            String str2 = new String(this.f3568h, this.f3571k, iQ, x.f3752b);
            this.f3571k += iQ;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String B() throws IOException {
            byte[] bArrL;
            int iQ = Q();
            int i10 = this.f3571k;
            int i11 = this.f3569i;
            if (iQ <= i11 - i10 && iQ > 0) {
                bArrL = this.f3568h;
                this.f3571k = i10 + iQ;
            } else {
                if (iQ == 0) {
                    return "";
                }
                if (iQ < 0) {
                    throw InvalidProtocolBufferException.l();
                }
                i10 = 0;
                if (iQ <= i11) {
                    U(iQ);
                    bArrL = this.f3568h;
                    this.f3571k = iQ;
                } else {
                    bArrL = L(iQ, false);
                }
            }
            return m1.a(bArrL, i10, iQ);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int C() throws InvalidProtocolBufferException {
            if (f()) {
                this.f3572l = 0;
                return 0;
            }
            int iQ = Q();
            this.f3572l = iQ;
            if (n1.a(iQ) != 0) {
                return this.f3572l;
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int D() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long E() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean F(int i10) throws InvalidProtocolBufferException {
            int iB = n1.b(i10);
            if (iB == 0) {
                Y();
                return true;
            }
            if (iB == 1) {
                W(8);
                return true;
            }
            if (iB == 2) {
                W(Q());
                return true;
            }
            if (iB == 3) {
                G();
                a(n1.c(n1.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.j();
            }
            W(4);
            return true;
        }

        public byte K() throws InvalidProtocolBufferException {
            if (this.f3571k == this.f3569i) {
                U(1);
            }
            byte[] bArr = this.f3568h;
            int i10 = this.f3571k;
            this.f3571k = i10 + 1;
            return bArr[i10];
        }

        public int O() throws InvalidProtocolBufferException {
            int i10 = this.f3571k;
            if (this.f3569i - i10 < 4) {
                U(4);
                i10 = this.f3571k;
            }
            byte[] bArr = this.f3568h;
            this.f3571k = i10 + 4;
            return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        public long P() throws InvalidProtocolBufferException {
            int i10 = this.f3571k;
            if (this.f3569i - i10 < 8) {
                U(8);
                i10 = this.f3571k;
            }
            byte[] bArr = this.f3568h;
            this.f3571k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int Q() {
            int i10;
            int i11 = this.f3571k;
            int i12 = this.f3569i;
            if (i12 != i11) {
                byte[] bArr = this.f3568h;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f3571k = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f3571k = i14;
                    return i10;
                }
            }
            return (int) S();
        }

        public long R() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f3571k;
            int i11 = this.f3569i;
            if (i11 != i10) {
                byte[] bArr = this.f3568h;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f3571k = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i19]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f3571k = i13;
                    return j10;
                }
            }
            return S();
        }

        long S() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bK = K();
                j10 |= ((long) (bK & 127)) << i10;
                if ((bK & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        public void W(int i10) throws InvalidProtocolBufferException {
            int i11 = this.f3569i;
            int i12 = this.f3571k;
            if (i10 > i11 - i12 || i10 < 0) {
                X(i10);
            } else {
                this.f3571k = i12 + i10;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f3572l != i10) {
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int e() {
            return this.f3573m + this.f3571k;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean f() {
            return this.f3571k == this.f3569i && !b0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void l(int i10) {
            this.f3574n = i10;
            T();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int m(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            int i11 = i10 + this.f3573m + this.f3571k;
            if (i11 < 0) {
                throw InvalidProtocolBufferException.m();
            }
            int i12 = this.f3574n;
            if (i11 > i12) {
                throw InvalidProtocolBufferException.r();
            }
            this.f3574n = i11;
            T();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean n() {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public g o() throws InvalidProtocolBufferException {
            int iQ = Q();
            int i10 = this.f3569i;
            int i11 = this.f3571k;
            if (iQ <= i10 - i11 && iQ > 0) {
                g gVarH = g.h(this.f3568h, i11, iQ);
                this.f3571k += iQ;
                return gVarH;
            }
            if (iQ == 0) {
                return g.f3535b;
            }
            if (iQ >= 0) {
                return J(iQ);
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public double p() {
            return Double.longBitsToDouble(P());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int q() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int r() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long s() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public float t() {
            return Float.intBitsToFloat(O());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int u() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long v() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int w() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long x() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int y() {
            return h.c(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long z() {
            return h.d(R());
        }

        private c(InputStream inputStream, int i10) {
            super();
            this.f3574n = Integer.MAX_VALUE;
            x.b(inputStream, "input");
            this.f3567g = inputStream;
            this.f3568h = new byte[i10];
            this.f3569i = 0;
            this.f3571k = 0;
            this.f3573m = 0;
        }
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static h g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static h h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? i(x.f3754d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static h i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static h j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10, i11, false);
    }

    static h k(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.m(i11);
            return bVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i10);

    public void G() throws InvalidProtocolBufferException {
        boolean zF;
        do {
            int iC = C();
            if (iC == 0) {
                return;
            }
            b();
            this.f3553a++;
            zF = F(iC);
            this.f3553a--;
        } while (zF);
    }

    public abstract void a(int i10);

    public void b() throws InvalidProtocolBufferException {
        if (this.f3553a >= this.f3554b) {
            throw InvalidProtocolBufferException.n();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void l(int i10);

    public abstract int m(int i10);

    public abstract boolean n();

    public abstract g o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();

    private h() {
        this.f3554b = f3552f;
        this.f3555c = Integer.MAX_VALUE;
        this.f3557e = false;
    }
}
