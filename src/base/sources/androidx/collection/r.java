package androidx.collection;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import fl.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class r extends s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1926f;

    public /* synthetic */ r(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final int h(int i10) {
        int i11 = this.f1930d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f1927a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final void j() {
        this.f1926f = t.a(c()) - this.f1931e;
    }

    private final void k(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = t.f1932a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            gl.j.w(jArr2, -9187201950435737472L, 0, 0, 6, null);
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
            jArr = jArr2;
        }
        this.f1927a = jArr;
        j();
    }

    private final void l(int i10) {
        int iMax = i10 > 0 ? Math.max(7, t.c(i10)) : 0;
        this.f1930d = iMax;
        k(iMax);
        this.f1928b = iMax == 0 ? s.a.f51436c : new Object[iMax];
        this.f1929c = iMax == 0 ? s.a.f51436c : new Object[iMax];
    }

    public final void f() {
        if (this.f1930d <= 8 || Long.compare(b0.b(b0.b(this.f1931e) * 32) ^ Long.MIN_VALUE, b0.b(b0.b(this.f1930d) * 25) ^ Long.MIN_VALUE) > 0) {
            o(t.b(this.f1930d));
        } else {
            g();
        }
    }

    public final void g() {
        long[] jArr = this.f1927a;
        int i10 = this.f1930d;
        Object[] objArr = this.f1928b;
        Object[] objArr2 = this.f1929c;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int iV = gl.j.V(jArr);
        int i14 = iV - 1;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[iV] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j11 = (jArr[i16] >> i17) & 255;
            if (j11 != 128 && j11 == 254) {
                Object obj = objArr[i15];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                int iH = h(i19);
                int i20 = i19 & i10;
                int i21 = i12;
                if (((iH - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    jArr[i16] = (((long) (i18 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[gl.j.V(jArr)] = jArr[i21];
                } else {
                    int i22 = iH >> 3;
                    long j12 = jArr[i22];
                    int i23 = (iH & 7) << 3;
                    if (((j12 >> i23) & 255) == 128) {
                        jArr[i22] = (((long) (i18 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) << i23) | (j12 & (~(255 << i23)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        objArr[iH] = objArr[i15];
                        objArr[i15] = null;
                        objArr2[iH] = objArr2[i15];
                        objArr2[i15] = null;
                    } else {
                        jArr[i22] = (((long) (i18 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) << i23) | (j12 & (~(255 << i23)));
                        Object obj2 = objArr[iH];
                        objArr[iH] = objArr[i15];
                        objArr[i15] = obj2;
                        Object obj3 = objArr2[iH];
                        objArr2[iH] = objArr2[i15];
                        objArr2[i15] = obj3;
                        i15--;
                    }
                    jArr[gl.j.V(jArr)] = jArr[i21];
                }
                i15++;
                i12 = i21;
            } else {
                i15++;
            }
        }
        j();
    }

    public final int i(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        int i13 = this.f1930d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f1927a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (kotlin.jvm.internal.s.c(this.f1928b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iH = h(i11);
                if (this.f1926f == 0 && ((this.f1927a[iH >> 3] >> ((iH & 7) << 3)) & 255) != 254) {
                    f();
                    iH = h(i11);
                }
                this.f1931e++;
                int i19 = this.f1926f;
                long[] jArr2 = this.f1927a;
                int i20 = iH >> 3;
                long j14 = jArr2[i20];
                int i21 = (iH & 7) << 3;
                this.f1926f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f1930d;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iH - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iH;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final Object m(Object obj) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        int i13 = this.f1930d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f1927a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.s.c(this.f1928b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return n(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final Object n(int i10) {
        this.f1931e--;
        long[] jArr = this.f1927a;
        int i11 = this.f1930d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f1928b[i10] = null;
        Object[] objArr = this.f1929c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void o(int i10) {
        int i11;
        long[] jArr = this.f1927a;
        Object[] objArr = this.f1928b;
        Object[] objArr2 = this.f1929c;
        int i12 = this.f1930d;
        l(i10);
        long[] jArr2 = this.f1927a;
        Object[] objArr3 = this.f1928b;
        Object[] objArr4 = this.f1929c;
        int i13 = this.f1930d;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iH = h(i15 >>> 7);
                i11 = i14;
                long j10 = i15 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                int i16 = iH >> 3;
                int i17 = (iH & 7) << 3;
                long j11 = (j10 << i17) | (jArr2[i16] & (~(255 << i17)));
                jArr2[i16] = j11;
                jArr2[(((iH - 7) & i13) + (i13 & 7)) >> 3] = j11;
                objArr3[iH] = obj;
                objArr4[iH] = objArr2[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final void p(Object obj, Object obj2) {
        int i10 = i(obj);
        if (i10 < 0) {
            i10 = ~i10;
        }
        this.f1928b[i10] = obj;
        this.f1929c[i10] = obj2;
    }

    public r(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            s.d.a("Capacity must be a positive value.");
        }
        l(t.d(i10));
    }
}
