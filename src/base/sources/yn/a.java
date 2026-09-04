package yn;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.EOFException;
import xn.f0;
import xn.l0;
import xn.u0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f58100a = u0.a("0123456789abcdef");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long[] f58101b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    public static final long b(xn.e eVar, xn.h bytes, long j10, long j11, int i10, int i11) {
        l0 l0Var;
        int i12;
        long j12 = j10;
        long size = j11;
        kotlin.jvm.internal.s.h(eVar, "<this>");
        kotlin.jvm.internal.s.h(bytes, "bytes");
        long j13 = i11;
        xn.b.b(bytes.D(), i10, j13);
        if (i11 <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long size2 = 0;
        if (j12 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j12).toString());
        }
        if (j12 > size) {
            throw new IllegalArgumentException(("fromIndex > toIndex: " + j12 + " > " + size).toString());
        }
        if (size > eVar.size()) {
            size = eVar.size();
        }
        long j14 = -1;
        if (j12 == size || (l0Var = eVar.f56903a) == null) {
            return -1L;
        }
        if (eVar.size() - j12 >= j12) {
            while (true) {
                long j15 = ((long) (l0Var.f56954c - l0Var.f56953b)) + size2;
                if (j15 > j12) {
                    break;
                }
                l0Var = l0Var.f56957f;
                kotlin.jvm.internal.s.e(l0Var);
                size2 = j15;
            }
            byte[] bArrS = bytes.s();
            byte b10 = bArrS[i10];
            long jMin = Math.min(size, (eVar.size() - j13) + 1);
            while (size2 < jMin) {
                byte[] bArr = l0Var.f56952a;
                int iMin = (int) Math.min(l0Var.f56954c, (((long) l0Var.f56953b) + jMin) - size2);
                i12 = (int) ((((long) l0Var.f56953b) + j12) - size2);
                while (i12 < iMin) {
                    if (bArr[i12] != b10 || !f(l0Var, i12 + 1, bArrS, i10 + 1, i11)) {
                        i12++;
                    }
                }
                size2 += (long) (l0Var.f56954c - l0Var.f56953b);
                l0Var = l0Var.f56957f;
                kotlin.jvm.internal.s.e(l0Var);
                j12 = size2;
            }
            return -1L;
        }
        size2 = eVar.size();
        while (size2 > j12) {
            l0Var = l0Var.f56958g;
            kotlin.jvm.internal.s.e(l0Var);
            size2 -= (long) (l0Var.f56954c - l0Var.f56953b);
            j14 = j14;
        }
        long j16 = j14;
        byte[] bArrS2 = bytes.s();
        byte b11 = bArrS2[i10];
        long jMin2 = Math.min(size, (eVar.size() - j13) + 1);
        while (size2 < jMin2) {
            byte[] bArr2 = l0Var.f56952a;
            int iMin2 = (int) Math.min(l0Var.f56954c, (((long) l0Var.f56953b) + jMin2) - size2);
            i12 = (int) ((((long) l0Var.f56953b) + j12) - size2);
            while (i12 < iMin2) {
                if (bArr2[i12] != b11 || !f(l0Var, i12 + 1, bArrS2, i10 + 1, i11)) {
                    i12++;
                }
            }
            size2 += (long) (l0Var.f56954c - l0Var.f56953b);
            l0Var = l0Var.f56957f;
            kotlin.jvm.internal.s.e(l0Var);
            j12 = size2;
        }
        return j16;
        return ((long) (i12 - l0Var.f56953b)) + size2;
    }

    public static /* synthetic */ long c(xn.e eVar, xn.h hVar, long j10, long j11, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return b(eVar, hVar, j10, j11, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? hVar.D() : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(long j10) {
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j10)) * 10) >>> 5;
        return iNumberOfLeadingZeros + (j10 > f58101b[iNumberOfLeadingZeros] ? 1 : 0);
    }

    public static final byte[] e() {
        return f58100a;
    }

    public static final boolean f(l0 segment, int i10, byte[] bytes, int i11, int i12) {
        kotlin.jvm.internal.s.h(segment, "segment");
        kotlin.jvm.internal.s.h(bytes, "bytes");
        int i13 = segment.f56954c;
        byte[] bArr = segment.f56952a;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.f56957f;
                kotlin.jvm.internal.s.e(segment);
                byte[] bArr2 = segment.f56952a;
                bArr = bArr2;
                i10 = segment.f56953b;
                i13 = segment.f56954c;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String g(xn.e eVar, long j10) throws EOFException {
        kotlin.jvm.internal.s.h(eVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (eVar.c0(j11) == 13) {
                String strE0 = eVar.e0(j11);
                eVar.skip(2L);
                return strE0;
            }
        }
        String strE1 = eVar.e0(j10);
        eVar.skip(1L);
        return strE1;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4 A[SYNTHETIC] */
    public static final int h(xn.e eVar, f0 options, boolean z10) {
        int i10;
        int i11;
        l0 l0Var;
        int i12;
        int i13;
        kotlin.jvm.internal.s.h(eVar, "<this>");
        kotlin.jvm.internal.s.h(options, "options");
        l0 l0Var2 = eVar.f56903a;
        if (l0Var2 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = l0Var2.f56952a;
        int i14 = l0Var2.f56953b;
        int i15 = l0Var2.f56954c;
        int[] iArrN = options.n();
        l0 l0Var3 = l0Var2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = iArrN[i17];
            int i20 = i17 + 2;
            int i21 = iArrN[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (l0Var3 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == iArrN[i20]) {
                        i11 = iArrN[i20 + i19];
                        if (i10 == i15) {
                            l0Var3 = l0Var3.f56957f;
                            kotlin.jvm.internal.s.e(l0Var3);
                            i10 = l0Var3.f56953b;
                            bArr = l0Var3.f56952a;
                            i15 = l0Var3.f56954c;
                            if (l0Var3 == l0Var2) {
                                l0Var3 = null;
                            }
                        }
                        if (i11 >= 0) {
                            return i11;
                        }
                        i17 = -i11;
                        i14 = i10;
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i24 = i20 + (i19 * (-1));
            while (true) {
                int i25 = i14 + 1;
                int i26 = i20 + 1;
                if ((bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == iArrN[i20]) {
                    boolean z11 = i26 == i24;
                    if (i25 == i15) {
                        kotlin.jvm.internal.s.e(l0Var3);
                        l0 l0Var4 = l0Var3.f56957f;
                        kotlin.jvm.internal.s.e(l0Var4);
                        i13 = l0Var4.f56953b;
                        byte[] bArr2 = l0Var4.f56952a;
                        i12 = l0Var4.f56954c;
                        if (l0Var4 != l0Var2) {
                            l0Var = l0Var4;
                            bArr = bArr2;
                        } else {
                            if (!z11) {
                                break loop0;
                            }
                            bArr = bArr2;
                            l0Var = null;
                        }
                    } else {
                        l0Var = l0Var3;
                        i12 = i15;
                        i13 = i25;
                    }
                    if (z11) {
                        i11 = iArrN[i26];
                        i10 = i13;
                        i15 = i12;
                        l0Var3 = l0Var;
                        break;
                    }
                    i14 = i13;
                    i15 = i12;
                    l0Var3 = l0Var;
                    i20 = i26;
                }
                return i16;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (z10) {
            return -2;
        }
        return i16;
    }

    public static /* synthetic */ int i(xn.e eVar, f0 f0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return h(eVar, f0Var, z10);
    }
}
