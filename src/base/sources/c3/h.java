package c3;

import android.os.Parcelable;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import t1.v;
import w1.c0;
import w1.t;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h extends x2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9521b = new a() { // from class: c3.g
        @Override // c3.h.a
        public final boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
            return h.c(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f9522a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        boolean evaluate(int i10, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f9524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f9525c;

        public b(int i10, boolean z10, int i11) {
            this.f9523a = i10;
            this.f9524b = z10;
            this.f9525c = i11;
        }
    }

    public h() {
        this(null);
    }

    private static int A(u uVar, int i10) {
        byte[] bArrE = uVar.e();
        int iF = uVar.f();
        int i11 = iF;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iF + i10) {
                return i10;
            }
            if ((bArrE[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255 && bArrE[i12] == 0) {
                System.arraycopy(bArrE, i11 + 2, bArrE, i12, (i10 - (i11 - iF)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c A[PHI: r3
      0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean B(u uVar, int i10, int i11, boolean z10) {
        int iJ;
        long J;
        int iM;
        int i12;
        int iF = uVar.f();
        while (true) {
            try {
                boolean z11 = true;
                if (uVar.a() < i11) {
                    uVar.T(iF);
                    return true;
                }
                if (i10 >= 3) {
                    iJ = uVar.p();
                    J = uVar.I();
                    iM = uVar.M();
                } else {
                    iJ = uVar.J();
                    J = uVar.J();
                    iM = 0;
                }
                if (iJ == 0 && J == 0 && iM == 0) {
                    uVar.T(iF);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & J) != 0) {
                        uVar.T(iF);
                        return false;
                    }
                    J = (((J >> 24) & 255) << 21) | (J & 255) | (((J >> 8) & 255) << 7) | (((J >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (iM & 64) != 0 ? 1 : 0;
                    if ((iM & 1) == 0) {
                        z11 = false;
                    }
                } else if (i10 == 3) {
                    i12 = (iM & 32) != 0 ? 1 : 0;
                    if ((iM & 128) == 0) {
                        z11 = false;
                    }
                } else {
                    i12 = 0;
                    z11 = false;
                }
                if (z11) {
                    i12 += 4;
                }
                if (J < i12) {
                    uVar.T(iF);
                    return false;
                }
                if (uVar.a() < J) {
                    uVar.T(iF);
                    return false;
                }
                uVar.U((int) J);
            } catch (Throwable th2) {
                uVar.T(iF);
                throw th2;
            }
        }
    }

    public static /* synthetic */ boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? c0.f55774f : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static c3.a f(u uVar, int i10, int i11) {
        int iZ;
        String str;
        int iG = uVar.G();
        Charset charsetW = w(iG);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        uVar.l(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + sc.c.e(new String(bArr, 0, 3, sc.e.f52293b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iZ = 2;
        } else {
            iZ = z(bArr, 0);
            String strE = sc.c.e(new String(bArr, 0, iZ, sc.e.f52293b));
            if (strE.indexOf(47) == -1) {
                str = "image/" + strE;
            } else {
                str = strE;
            }
        }
        int i13 = bArr[iZ + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i14 = iZ + 2;
        int iY = y(bArr, i14, iG);
        return new c3.a(str, new String(bArr, i14, iY - i14, charsetW), i13, d(bArr, iY + v(iG), i12));
    }

    private static c3.b g(u uVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        uVar.l(bArr, 0, i10);
        return new c3.b(str, bArr);
    }

    private static c h(u uVar, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int iF = uVar.f();
        int iZ = z(uVar.e(), iF);
        String str = new String(uVar.e(), iF, iZ - iF, sc.e.f52293b);
        uVar.T(iZ + 1);
        int iP = uVar.p();
        int iP2 = uVar.p();
        long jI = uVar.I();
        if (jI == 4294967295L) {
            jI = -1;
        }
        long jI2 = uVar.I();
        long j10 = jI2 == 4294967295L ? -1L : jI2;
        ArrayList arrayList = new ArrayList();
        int i13 = iF + i10;
        while (uVar.f() < i13) {
            i iVarK = k(i11, uVar, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new c(str, iP, iP2, jI, j10, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(u uVar, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int iF = uVar.f();
        int iZ = z(uVar.e(), iF);
        String str = new String(uVar.e(), iF, iZ - iF, sc.e.f52293b);
        uVar.T(iZ + 1);
        int iG = uVar.G();
        boolean z11 = (iG & 2) != 0;
        boolean z12 = (iG & 1) != 0;
        int iG2 = uVar.G();
        String[] strArr = new String[iG2];
        for (int i13 = 0; i13 < iG2; i13++) {
            int iF2 = uVar.f();
            int iZ2 = z(uVar.e(), iF2);
            strArr[i13] = new String(uVar.e(), iF2, iZ2 - iF2, sc.e.f52293b);
            uVar.T(iZ2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iF + i10;
        while (uVar.f() < i14) {
            i iVarK = k(i11, uVar, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(u uVar, int i10) {
        if (i10 < 4) {
            return null;
        }
        int iG = uVar.G();
        Charset charsetW = w(iG);
        byte[] bArr = new byte[3];
        uVar.l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        uVar.l(bArr2, 0, i11);
        int iY = y(bArr2, 0, iG);
        String str2 = new String(bArr2, 0, iY, charsetW);
        int iV = iY + v(iG);
        return new e(str, str2, p(bArr2, iV, y(bArr2, iV, iG), charsetW));
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0240  */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x0240, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [c3.i] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [w1.u] */
    /* JADX WARN: Type inference failed for: r1v11, types: [w1.u] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [w1.u] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [int] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v9 */
    private static i k(int i10, u uVar, boolean z10, int i11, a aVar) throws Throwable {
        int iK;
        ?? r10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ?? r11;
        Throwable th2;
        ?? r12;
        int i12;
        ?? r13;
        ?? r14;
        ?? r15;
        ?? r16;
        Parcelable parcelableG;
        int i13 = i10;
        u uVar2 = uVar;
        int iG = uVar2.G();
        int iG2 = uVar2.G();
        int iG3 = uVar2.G();
        boolean z15 = false;
        int iG4 = i13 >= 3 ? uVar2.G() : 0;
        if (i13 == 4) {
            iK = uVar2.K();
            if (!z10) {
                iK = (((iK >> 24) & 255) << 21) | (iK & 255) | (((iK >> 8) & 255) << 7) | (((iK >> 16) & 255) << 14);
            }
        } else {
            iK = i13 == 3 ? uVar2.K() : uVar2.J();
        }
        int iA = iK;
        int iM = i13 >= 3 ? uVar2.M() : 0;
        if (iG == 0 && iG2 == 0 && iG3 == 0 && iG4 == 0 && iA == 0 && iM == 0) {
            uVar2.T(uVar2.g());
            return null;
        }
        int iF = uVar2.f() + iA;
        if (iF > uVar2.g()) {
            w1.n.h("Id3Decoder", "Frame size exceeds remaining tag data");
            uVar2.T(uVar2.g());
            return null;
        }
        if (aVar != null) {
            boolean zEvaluate = aVar.evaluate(i13, iG, iG2, iG3, iG4);
            r10 = iG;
            iA = iG2;
            if (!zEvaluate) {
                i13 = i13;
                uVar2.T(iF);
                return null;
            }
        } else {
            iA = iG2;
            r10 = iG;
        }
        i13 = i13;
        if (i13 == 3) {
            z11 = (iM & 128) != 0;
            z13 = (iM & 64) != 0;
            z12 = (iM & 32) != 0;
            z14 = false;
            z15 = z11;
        } else if (i13 == 4) {
            boolean z16 = (iM & 64) != 0;
            boolean z17 = (iM & 8) != 0;
            boolean z18 = (iM & 4) != 0;
            z14 = (iM & 2) != 0;
            z15 = (iM & 1) != 0;
            z12 = z16;
            z11 = z15;
            z15 = z17;
            z13 = z18;
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
        }
        if (z15 || z13) {
            w1.n.h("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            uVar2.T(iF);
            return null;
        }
        if (z12) {
            iA--;
            uVar2.U(1);
        }
        if (z11) {
            iA -= 4;
            uVar2.U(4);
        }
        if (z14) {
            iA = A(uVar2, iA);
        }
        try {
            try {
                if (r10 == 84 && iA == 88 && iG3 == 88 && (i13 == 2 || iG4 == 88)) {
                    parcelableG = s(uVar2, iA);
                } else if (r10 == 84) {
                    parcelableG = q(uVar2, iA, x(i13, r10, iA, iG3, iG4));
                } else if (r10 == 87 && iA == 88 && iG3 == 88 && (i13 == 2 || iG4 == 88)) {
                    parcelableG = u(uVar2, iA);
                } else if (r10 == 87) {
                    parcelableG = t(uVar2, iA, x(i13, r10, iA, iG3, iG4));
                } else {
                    if (r10 != 80 || iA != 82 || iG3 != 73 || iG4 != 86) {
                        if (r10 == 71 && iA == 69 && iG3 == 79 && (iG4 == 66 || i13 == 2)) {
                            parcelableG = l(uVar2, iA);
                        } else {
                            th2 = null;
                            try {
                                if (i13 != 2 ? r10 == 65 && iA == 80 && iG3 == 73 && iG4 == 67 : r10 == 80 && iA == 73 && iG3 == 67) {
                                    parcelableG = f(uVar2, iA, i13);
                                } else {
                                    if (r10 != 67 || iA != 79 || iG3 != 77 || (iG4 != 77 && i13 != 2)) {
                                        if (r10 == 67 && iA == 72 && iG3 == 65 && iG4 == 80) {
                                            r10 = r10;
                                            iA = iA;
                                            iG4 = iG4;
                                            iA = iA;
                                            i12 = iG3;
                                            try {
                                                parcelableG = h(uVar2, iA, i13, z10, i11, aVar);
                                                i13 = i10;
                                                r10 = uVar;
                                            } catch (Exception e10) {
                                                e = e10;
                                                i13 = i10;
                                                r14 = uVar;
                                                r13 = r10;
                                                r14.T(iF);
                                                r15 = th2;
                                                r16 = r13;
                                            } catch (OutOfMemoryError e11) {
                                                e = e11;
                                                i13 = i10;
                                                r14 = uVar;
                                                r13 = r10;
                                                r14.T(iF);
                                                r15 = th2;
                                                r16 = r13;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r12 = uVar;
                                                r12.T(iF);
                                                throw th;
                                            }
                                        } else {
                                            r10 = r10;
                                            iA = iA;
                                            iG4 = iG4;
                                            iA = iA;
                                            i12 = iG3;
                                            try {
                                                if (r10 == 67 && iA == 84 && i12 == 79 && iG4 == 67) {
                                                    i13 = i10;
                                                    u uVar3 = uVar;
                                                    parcelableG = i(uVar3, iA, i13, z10, i11, aVar);
                                                    r10 = uVar3;
                                                } else {
                                                    i13 = i10;
                                                    u uVar4 = uVar;
                                                    if (r10 == 77 && iA == 76 && i12 == 76 && iG4 == 84) {
                                                        parcelableG = n(uVar4, iA);
                                                        r10 = uVar4;
                                                    } else {
                                                        parcelableG = g(uVar4, iA, x(i13, r10, iA, i12, iG4));
                                                        r10 = uVar4;
                                                    }
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                r14 = r10;
                                                r13 = r10;
                                                r14.T(iF);
                                                r15 = th2;
                                                r16 = r13;
                                            } catch (OutOfMemoryError e13) {
                                                e = e13;
                                                r14 = r10;
                                                r13 = r10;
                                                r14.T(iF);
                                                r15 = th2;
                                                r16 = r13;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                r12 = r10;
                                                r12.T(iF);
                                                throw th;
                                            }
                                        }
                                        if (r15 == 0) {
                                            w1.n.i("Id3Decoder", "Failed to decode frame: id=" + x(i13, r16, iA, i12, iG4) + ", frameSize=" + iA, e);
                                        }
                                        return r15;
                                    }
                                    parcelableG = j(uVar2, iA);
                                }
                                r10 = uVar2;
                                iA = iA;
                                r10 = r10;
                                i12 = iG3;
                            } catch (Exception e14) {
                                e = e14;
                                r11 = r10;
                                iA = iA;
                                i12 = iG3;
                                r14 = uVar2;
                                r13 = r11;
                                r14.T(iF);
                                r15 = th2;
                                r16 = r13;
                                if (r15 == 0) {
                                    w1.n.i("Id3Decoder", "Failed to decode frame: id=" + x(i13, r16, iA, i12, iG4) + ", frameSize=" + iA, e);
                                }
                                return r15;
                            } catch (OutOfMemoryError e15) {
                                e = e15;
                                r11 = r10;
                                iA = iA;
                                i12 = iG3;
                                r14 = uVar2;
                                r13 = r11;
                                r14.T(iF);
                                r15 = th2;
                                r16 = r13;
                                if (r15 == 0) {
                                    w1.n.i("Id3Decoder", "Failed to decode frame: id=" + x(i13, r16, iA, i12, iG4) + ", frameSize=" + iA, e);
                                }
                                return r15;
                            }
                        }
                        r10.T(iF);
                        r15 = parcelableG;
                        e = th2;
                        r16 = r10;
                        if (r15 == 0) {
                            w1.n.i("Id3Decoder", "Failed to decode frame: id=" + x(i13, r16, iA, i12, iG4) + ", frameSize=" + iA, e);
                        }
                        return r15;
                    }
                    parcelableG = o(uVar2, iA);
                }
                r10 = uVar2;
                iA = iA;
                th2 = null;
                r10 = r10;
                i12 = iG3;
                r10.T(iF);
                r15 = parcelableG;
                e = th2;
                r16 = r10;
            } catch (Throwable th5) {
                th = th5;
                r12 = uVar2;
            }
        } catch (Exception e16) {
            e = e16;
            r11 = r10;
            iA = iA;
            th2 = null;
            i12 = iG3;
            r14 = uVar2;
            r13 = r11;
            r14.T(iF);
            r15 = th2;
            r16 = r13;
            if (r15 == 0) {
                w1.n.i("Id3Decoder", "Failed to decode frame: id=" + x(i13, r16, iA, i12, iG4) + ", frameSize=" + iA, e);
            }
            return r15;
        } catch (OutOfMemoryError e17) {
            e = e17;
            r11 = r10;
            iA = iA;
            th2 = null;
            i12 = iG3;
            r14 = uVar2;
            r13 = r11;
            r14.T(iF);
            r15 = th2;
            r16 = r13;
            if (r15 == 0) {
                w1.n.i("Id3Decoder", "Failed to decode frame: id=" + x(i13, r16, iA, i12, iG4) + ", frameSize=" + iA, e);
            }
            return r15;
        }
        if (r15 == 0) {
            w1.n.i("Id3Decoder", "Failed to decode frame: id=" + x(i13, r16, iA, i12, iG4) + ", frameSize=" + iA, e);
        }
        return r15;
    }

    private static f l(u uVar, int i10) {
        int iG = uVar.G();
        Charset charsetW = w(iG);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        uVar.l(bArr, 0, i11);
        int iZ = z(bArr, 0);
        String strL = v.l(new String(bArr, 0, iZ, sc.e.f52293b));
        int i12 = iZ + 1;
        int iY = y(bArr, i12, iG);
        String strP = p(bArr, i12, iY, charsetW);
        int iV = iY + v(iG);
        int iY2 = y(bArr, iV, iG);
        return new f(strL, strP, p(bArr, iV, iY2, charsetW), d(bArr, iY2 + v(iG), i11));
    }

    private static b m(u uVar) {
        if (uVar.a() < 10) {
            w1.n.h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iJ = uVar.J();
        if (iJ != 4801587) {
            w1.n.h("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iJ)));
            return null;
        }
        int iG = uVar.G();
        uVar.U(1);
        int iG2 = uVar.G();
        int iF = uVar.F();
        if (iG == 2) {
            if ((iG2 & 64) != 0) {
                w1.n.h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iG == 3) {
            if ((iG2 & 64) != 0) {
                int iP = uVar.p();
                uVar.U(iP);
                iF -= iP + 4;
            }
        } else {
            if (iG != 4) {
                w1.n.h("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iG);
                return null;
            }
            if ((iG2 & 64) != 0) {
                int iF2 = uVar.F();
                uVar.U(iF2 - 4);
                iF -= iF2;
            }
            if ((iG2 & 16) != 0) {
                iF -= 10;
            }
        }
        return new b(iG, iG < 4 && (iG2 & 128) != 0, iF);
    }

    private static l n(u uVar, int i10) {
        int iM = uVar.M();
        int iJ = uVar.J();
        int iJ2 = uVar.J();
        int iG = uVar.G();
        int iG2 = uVar.G();
        t tVar = new t();
        tVar.m(uVar);
        int i11 = ((i10 - 10) * 8) / (iG + iG2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iH = tVar.h(iG);
            int iH2 = tVar.h(iG2);
            iArr[i12] = iH;
            iArr2[i12] = iH2;
        }
        return new l(iM, iJ, iJ2, iArr, iArr2);
    }

    private static m o(u uVar, int i10) {
        byte[] bArr = new byte[i10];
        uVar.l(bArr, 0, i10);
        int iZ = z(bArr, 0);
        return new m(new String(bArr, 0, iZ, sc.e.f52293b), d(bArr, iZ + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    private static n q(u uVar, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int iG = uVar.G();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        uVar.l(bArr, 0, i11);
        return new n(str, null, r(bArr, iG, 0));
    }

    private static com.google.common.collect.c0 r(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return com.google.common.collect.c0.D("");
        }
        com.google.common.collect.c0.a aVarR = com.google.common.collect.c0.r();
        int iY = y(bArr, i11, i10);
        while (i11 < iY) {
            aVarR.a(new String(bArr, i11, iY - i11, w(i10)));
            i11 = v(i10) + iY;
            iY = y(bArr, i11, i10);
        }
        com.google.common.collect.c0 c0VarM = aVarR.m();
        return c0VarM.isEmpty() ? com.google.common.collect.c0.D("") : c0VarM;
    }

    private static n s(u uVar, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iG = uVar.G();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        uVar.l(bArr, 0, i11);
        int iY = y(bArr, 0, iG);
        return new n("TXXX", new String(bArr, 0, iY, w(iG)), r(bArr, iG, iY + v(iG)));
    }

    private static o t(u uVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        uVar.l(bArr, 0, i10);
        return new o(str, null, new String(bArr, 0, z(bArr, 0), sc.e.f52293b));
    }

    private static o u(u uVar, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iG = uVar.G();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        uVar.l(bArr, 0, i11);
        int iY = y(bArr, 0, iG);
        String str = new String(bArr, 0, iY, w(iG));
        int iV = iY + v(iG);
        return new o("WXXX", str, p(bArr, iV, z(bArr, iV), sc.e.f52293b));
    }

    private static int v(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static Charset w(int i10) {
        if (i10 == 1) {
            return sc.e.f52297f;
        }
        if (i10 != 2) {
            return i10 != 3 ? sc.e.f52293b : sc.e.f52294c;
        }
        return sc.e.f52295d;
    }

    private static String x(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int y(byte[] bArr, int i10, int i11) {
        int iZ = z(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iZ;
        }
        while (iZ < bArr.length - 1) {
            if ((iZ - i10) % 2 == 0 && bArr[iZ + 1] == 0) {
                return iZ;
            }
            iZ = z(bArr, iZ + 1);
        }
        return bArr.length;
    }

    private static int z(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    @Override // x2.c
    protected t1.u b(x2.b bVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public t1.u e(byte[] bArr, int i10) throws Throwable {
        ArrayList arrayList = new ArrayList();
        u uVar = new u(bArr, i10);
        b bVarM = m(uVar);
        if (bVarM == null) {
            return null;
        }
        int iF = uVar.f();
        int i11 = bVarM.f9523a == 2 ? 6 : 10;
        int iA = bVarM.f9525c;
        if (bVarM.f9524b) {
            iA = A(uVar, bVarM.f9525c);
        }
        uVar.S(iF + iA);
        boolean z10 = false;
        if (!B(uVar, bVarM.f9523a, i11, false)) {
            if (bVarM.f9523a != 4 || !B(uVar, 4, i11, true)) {
                w1.n.h("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarM.f9523a);
                return null;
            }
            z10 = true;
        }
        while (uVar.a() >= i11) {
            i iVarK = k(bVarM.f9523a, uVar, z10, i11, this.f9522a);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new t1.u(arrayList);
    }

    public h(a aVar) {
        this.f9522a = aVar;
    }
}
