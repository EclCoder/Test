package ma;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import ob.c0;
import ob.d0;
import ob.r0;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends ha.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f45388b = new a() { // from class: ma.g
        @Override // ma.h.a
        public final boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
            return h.c(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f45389a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        boolean evaluate(int i10, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f45390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f45391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f45392c;

        public b(int i10, boolean z10, int i11) {
            this.f45390a = i10;
            this.f45391b = z10;
            this.f45392c = i11;
        }
    }

    public h() {
        this(null);
    }

    private static int A(d0 d0Var, int i10) {
        byte[] bArrE = d0Var.e();
        int iF = d0Var.f();
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
    private static boolean B(d0 d0Var, int i10, int i11, boolean z10) {
        int iK;
        long jK;
        int iN;
        int i12;
        int iF = d0Var.f();
        while (true) {
            try {
                boolean z11 = true;
                if (d0Var.a() < i11) {
                    d0Var.U(iF);
                    return true;
                }
                if (i10 >= 3) {
                    iK = d0Var.q();
                    jK = d0Var.J();
                    iN = d0Var.N();
                } else {
                    iK = d0Var.K();
                    jK = d0Var.K();
                    iN = 0;
                }
                if (iK == 0 && jK == 0 && iN == 0) {
                    d0Var.U(iF);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & jK) != 0) {
                        d0Var.U(iF);
                        return false;
                    }
                    jK = (((jK >> 24) & 255) << 21) | (jK & 255) | (((jK >> 8) & 255) << 7) | (((jK >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (iN & 64) != 0 ? 1 : 0;
                    if ((iN & 1) == 0) {
                        z11 = false;
                    }
                } else if (i10 == 3) {
                    i12 = (iN & 32) != 0 ? 1 : 0;
                    if ((iN & 128) == 0) {
                        z11 = false;
                    }
                } else {
                    i12 = 0;
                    z11 = false;
                }
                if (z11) {
                    i12 += 4;
                }
                if (jK < i12) {
                    d0Var.U(iF);
                    return false;
                }
                if (d0Var.a() < jK) {
                    d0Var.U(iF);
                    return false;
                }
                d0Var.V((int) jK);
            } catch (Throwable th2) {
                d0Var.U(iF);
                throw th2;
            }
        }
    }

    public static /* synthetic */ boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? r0.f48430f : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static ma.a f(d0 d0Var, int i10, int i11) {
        int iZ;
        String str;
        int iH = d0Var.H();
        Charset charsetW = w(iH);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        d0Var.l(bArr, 0, i12);
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
        int iY = y(bArr, i14, iH);
        return new ma.a(str, new String(bArr, i14, iY - i14, charsetW), i13, d(bArr, iY + v(iH), i12));
    }

    private static ma.b g(d0 d0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        d0Var.l(bArr, 0, i10);
        return new ma.b(str, bArr);
    }

    private static c h(d0 d0Var, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int iF = d0Var.f();
        int iZ = z(d0Var.e(), iF);
        String str = new String(d0Var.e(), iF, iZ - iF, sc.e.f52293b);
        d0Var.U(iZ + 1);
        int iQ = d0Var.q();
        int iQ2 = d0Var.q();
        long J = d0Var.J();
        if (J == 4294967295L) {
            J = -1;
        }
        long J2 = d0Var.J();
        long j10 = J2 == 4294967295L ? -1L : J2;
        ArrayList arrayList = new ArrayList();
        int i13 = iF + i10;
        while (d0Var.f() < i13) {
            i iVarK = k(i11, d0Var, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new c(str, iQ, iQ2, J, j10, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(d0 d0Var, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int iF = d0Var.f();
        int iZ = z(d0Var.e(), iF);
        String str = new String(d0Var.e(), iF, iZ - iF, sc.e.f52293b);
        d0Var.U(iZ + 1);
        int iH = d0Var.H();
        boolean z11 = (iH & 2) != 0;
        boolean z12 = (iH & 1) != 0;
        int iH2 = d0Var.H();
        String[] strArr = new String[iH2];
        for (int i13 = 0; i13 < iH2; i13++) {
            int iF2 = d0Var.f();
            int iZ2 = z(d0Var.e(), iF2);
            strArr[i13] = new String(d0Var.e(), iF2, iZ2 - iF2, sc.e.f52293b);
            d0Var.U(iZ2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iF + i10;
        while (d0Var.f() < i14) {
            i iVarK = k(i11, d0Var, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(d0 d0Var, int i10) {
        if (i10 < 4) {
            return null;
        }
        int iH = d0Var.H();
        Charset charsetW = w(iH);
        byte[] bArr = new byte[3];
        d0Var.l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        d0Var.l(bArr2, 0, i11);
        int iY = y(bArr2, 0, iH);
        String str2 = new String(bArr2, 0, iY, charsetW);
        int iV = iY + v(iH);
        return new e(str, str2, p(bArr2, iV, y(bArr2, iV, iH), charsetW));
    }

    /* JADX WARN: Code duplicated, block: B:132:0x018f  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f5 A[Catch: all -> 0x01e0, TryCatch #0 {all -> 0x01e0, blocks: (B:168:0x01ff, B:156:0x01db, B:165:0x01f0, B:166:0x01f5), top: B:175:0x0109 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x01ff A[Catch: all -> 0x01e0, TRY_LEAVE, TryCatch #0 {all -> 0x01e0, blocks: (B:168:0x01ff, B:156:0x01db, B:165:0x01f0, B:166:0x01f5), top: B:175:0x0109 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:168:0x01ff, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [ob.d0] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [ob.d0] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v9 */
    private static i k(int i10, d0 d0Var, boolean z10, int i11, a aVar) throws Throwable {
        int iL;
        ?? r10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ?? r11;
        ?? r12;
        int i12;
        int i13;
        int i14;
        d0 d0Var2;
        i iVarG;
        ?? r13;
        int i15 = i10;
        int iH = d0Var.H();
        int iH2 = d0Var.H();
        int iH3 = d0Var.H();
        boolean z15 = false;
        int iH4 = i15 >= 3 ? d0Var.H() : 0;
        if (i15 == 4) {
            iL = d0Var.L();
            if (!z10) {
                iL = (((iL >> 24) & 255) << 21) | (iL & 255) | (((iL >> 8) & 255) << 7) | (((iL >> 16) & 255) << 14);
            }
        } else {
            iL = i15 == 3 ? d0Var.L() : d0Var.K();
        }
        int iA = iL;
        int iN = i15 >= 3 ? d0Var.N() : 0;
        if (iH == 0 && iH2 == 0 && iH3 == 0 && iH4 == 0 && iA == 0 && iN == 0) {
            d0Var.U(d0Var.g());
            return null;
        }
        int iF = d0Var.f() + iA;
        if (iF > d0Var.g()) {
            u.i("Id3Decoder", "Frame size exceeds remaining tag data");
            d0Var.U(d0Var.g());
            return null;
        }
        if (aVar != null) {
            r10 = iH2;
            if (!aVar.evaluate(i15, iH, iH2, iH3, iH4)) {
                i15 = i15;
                d0Var.U(iF);
                return null;
            }
        } else {
            r10 = iH2;
        }
        i15 = i15;
        if (i15 == 3) {
            z11 = (iN & 128) != 0;
            boolean z16 = (iN & 64) != 0;
            z14 = false;
            z15 = z11;
            z12 = (iN & 32) != 0;
            z13 = z16;
        } else if (i15 == 4) {
            boolean z17 = (iN & 64) != 0;
            boolean z18 = (iN & 8) != 0;
            boolean z19 = (iN & 4) != 0;
            boolean z20 = (iN & 2) != 0;
            z15 = (iN & 1) != 0;
            z12 = z17;
            z11 = z15;
            z15 = z18;
            z13 = z19;
            z14 = z20;
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
        }
        if (z15 || z13) {
            u.i("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            d0Var.U(iF);
            return null;
        }
        if (z12) {
            iA--;
            d0Var.V(1);
        }
        if (z11) {
            iA -= 4;
            d0Var.V(4);
        }
        if (z14) {
            iA = A(d0Var, iA);
        }
        try {
            try {
                if (iH == 84 && r10 == 88 && iH3 == 88 && (i15 == 2 || iH4 == 88)) {
                    iVarG = s(d0Var, iA);
                } else if (iH == 84) {
                    iVarG = q(d0Var, iA, x(i15, iH, r10, iH3, iH4));
                } else if (iH == 87 && r10 == 88 && iH3 == 88 && (i15 == 2 || iH4 == 88)) {
                    iVarG = u(d0Var, iA);
                } else if (iH == 87) {
                    iVarG = t(d0Var, iA, x(i15, iH, r10, iH3, iH4));
                } else if (iH == 80 && r10 == 82 && iH3 == 73 && iH4 == 86) {
                    iVarG = o(d0Var, iA);
                } else {
                    if (iH != 71 || r10 != 69 || iH3 != 79 || (iH4 != 66 && i15 != 2)) {
                        if (i15 == 2) {
                            if (iH == 80 && r10 == 73 && iH3 == 67) {
                                iVarG = f(d0Var, iA, i15);
                            } else if (iH != 67 && r10 == 79 && iH3 == 77 && (iH4 == 77 || i15 == 2)) {
                                iVarG = j(d0Var, iA);
                            } else if (iH != 67 && r10 == 72 && iH3 == 65 && iH4 == 80) {
                                r13 = r10;
                                i12 = iH3;
                                i13 = iA;
                                i14 = iH4;
                                try {
                                    iVarG = h(d0Var, i13, i15, z10, i11, aVar);
                                    i15 = i10;
                                    r10 = d0Var;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r11 = d0Var;
                                    r11.U(iF);
                                    throw th;
                                }
                            } else {
                                r12 = r10;
                                i12 = iH3;
                                i13 = iA;
                                i14 = iH4;
                                if (iH != 67 && r12 == 84 && i12 == 79 && i14 == 67) {
                                    i15 = i10;
                                    d0 d0Var3 = d0Var;
                                    iVarG = i(d0Var3, i13, i15, z10, i11, aVar);
                                    r10 = d0Var3;
                                    r13 = r12;
                                } else {
                                    i15 = i10;
                                    d0Var2 = d0Var;
                                    if (iH != 77 && r12 == 76 && i12 == 76 && i14 == 84) {
                                        iVarG = n(d0Var2, i13);
                                    } else {
                                        iVarG = g(d0Var2, i13, x(i15, iH, r12 == true ? 1 : 0, i12, i14));
                                        r10 = d0Var2;
                                        r13 = r12;
                                    }
                                }
                            }
                        } else if (iH == 65 && r10 == 80 && iH3 == 73 && iH4 == 67) {
                            iVarG = f(d0Var, iA, i15);
                        } else {
                            if (iH != 67) {
                            }
                            if (iH != 67) {
                                r12 = r10;
                                i12 = iH3;
                                i13 = iA;
                                i14 = iH4;
                                if (iH != 67) {
                                    i15 = i10;
                                    d0Var2 = d0Var;
                                    if (iH != 77) {
                                        iVarG = g(d0Var2, i13, x(i15, iH, r12 == true ? 1 : 0, i12, i14));
                                        r10 = d0Var2;
                                        r13 = r12;
                                    } else {
                                        iVarG = g(d0Var2, i13, x(i15, iH, r12 == true ? 1 : 0, i12, i14));
                                        r10 = d0Var2;
                                        r13 = r12;
                                    }
                                } else {
                                    i15 = i10;
                                    d0Var2 = d0Var;
                                    if (iH != 77) {
                                        iVarG = g(d0Var2, i13, x(i15, iH, r12 == true ? 1 : 0, i12, i14));
                                        r10 = d0Var2;
                                        r13 = r12;
                                    } else {
                                        iVarG = g(d0Var2, i13, x(i15, iH, r12 == true ? 1 : 0, i12, i14));
                                        r10 = d0Var2;
                                        r13 = r12;
                                    }
                                }
                            } else {
                                r12 = r10;
                                i12 = iH3;
                                i13 = iA;
                                i14 = iH4;
                                if (iH != 67) {
                                    i15 = i10;
                                    d0Var2 = d0Var;
                                    if (iH != 77) {
                                        iVarG = g(d0Var2, i13, x(i15, iH, r12 == true ? 1 : 0, i12, i14));
                                        r10 = d0Var2;
                                        r13 = r12;
                                    } else {
                                        iVarG = g(d0Var2, i13, x(i15, iH, r12 == true ? 1 : 0, i12, i14));
                                        r10 = d0Var2;
                                        r13 = r12;
                                    }
                                } else {
                                    i15 = i10;
                                    d0Var2 = d0Var;
                                    if (iH != 77) {
                                        iVarG = g(d0Var2, i13, x(i15, iH, r12 == true ? 1 : 0, i12, i14));
                                        r10 = d0Var2;
                                        r13 = r12;
                                    } else {
                                        iVarG = g(d0Var2, i13, x(i15, iH, r12 == true ? 1 : 0, i12, i14));
                                        r10 = d0Var2;
                                        r13 = r12;
                                    }
                                }
                            }
                        }
                        if (iVarG == null) {
                            r10 = d0Var2;
                            r13 = r12;
                            u.i("Id3Decoder", "Failed to decode frame: id=" + x(i15, iH, r13, i12, i14) + ", frameSize=" + i13);
                        }
                        r10 = d0Var2;
                        r13 = r12;
                        r10.U(iF);
                        return iVarG;
                    }
                    iVarG = l(d0Var, iA);
                }
                r13 = r10;
                i12 = iH3;
                r10 = d0Var;
                i13 = iA;
                i14 = iH4;
                if (iVarG == null) {
                    r10 = d0Var2;
                    r13 = r12;
                    u.i("Id3Decoder", "Failed to decode frame: id=" + x(i15, iH, r13, i12, i14) + ", frameSize=" + i13);
                }
                r10 = d0Var2;
                r13 = r12;
                r10.U(iF);
                return iVarG;
            } catch (Throwable th3) {
                th = th3;
                r11 = r10;
            }
        } catch (Throwable th4) {
            th = th4;
            r11 = d0Var;
        }
    }

    private static f l(d0 d0Var, int i10) {
        int iH = d0Var.H();
        Charset charsetW = w(iH);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        d0Var.l(bArr, 0, i11);
        int iZ = z(bArr, 0);
        String str = new String(bArr, 0, iZ, sc.e.f52293b);
        int i12 = iZ + 1;
        int iY = y(bArr, i12, iH);
        String strP = p(bArr, i12, iY, charsetW);
        int iV = iY + v(iH);
        int iY2 = y(bArr, iV, iH);
        return new f(str, strP, p(bArr, iV, iY2, charsetW), d(bArr, iY2 + v(iH), i11));
    }

    private static k n(d0 d0Var, int i10) {
        int iN = d0Var.N();
        int iK = d0Var.K();
        int iK2 = d0Var.K();
        int iH = d0Var.H();
        int iH2 = d0Var.H();
        c0 c0Var = new c0();
        c0Var.m(d0Var);
        int i11 = ((i10 - 10) * 8) / (iH + iH2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iH3 = c0Var.h(iH);
            int iH4 = c0Var.h(iH2);
            iArr[i12] = iH3;
            iArr2[i12] = iH4;
        }
        return new k(iN, iK, iK2, iArr, iArr2);
    }

    private static l o(d0 d0Var, int i10) {
        byte[] bArr = new byte[i10];
        d0Var.l(bArr, 0, i10);
        int iZ = z(bArr, 0);
        return new l(new String(bArr, 0, iZ, sc.e.f52293b), d(bArr, iZ + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    private static m q(d0 d0Var, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int iH = d0Var.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        d0Var.l(bArr, 0, i11);
        return new m(str, null, r(bArr, iH, 0));
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

    private static m s(d0 d0Var, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iH = d0Var.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        d0Var.l(bArr, 0, i11);
        int iY = y(bArr, 0, iH);
        return new m("TXXX", new String(bArr, 0, iY, w(iH)), r(bArr, iH, iY + v(iH)));
    }

    private static n t(d0 d0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        d0Var.l(bArr, 0, i10);
        return new n(str, null, new String(bArr, 0, z(bArr, 0), sc.e.f52293b));
    }

    private static n u(d0 d0Var, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iH = d0Var.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        d0Var.l(bArr, 0, i11);
        int iY = y(bArr, 0, iH);
        String str = new String(bArr, 0, iY, w(iH));
        int iV = iY + v(iH);
        return new n("WXXX", str, p(bArr, iV, z(bArr, iV), sc.e.f52293b));
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

    @Override // ha.g
    protected ha.a b(ha.d dVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public ha.a e(byte[] bArr, int i10) throws Throwable {
        ArrayList arrayList = new ArrayList();
        d0 d0Var = new d0(bArr, i10);
        b bVarM = m(d0Var);
        if (bVarM == null) {
            return null;
        }
        int iF = d0Var.f();
        int i11 = bVarM.f45390a == 2 ? 6 : 10;
        int iA = bVarM.f45392c;
        if (bVarM.f45391b) {
            iA = A(d0Var, bVarM.f45392c);
        }
        d0Var.T(iF + iA);
        boolean z10 = false;
        if (!B(d0Var, bVarM.f45390a, i11, false)) {
            if (bVarM.f45390a != 4 || !B(d0Var, 4, i11, true)) {
                u.i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarM.f45390a);
                return null;
            }
            z10 = true;
        }
        while (d0Var.a() >= i11) {
            i iVarK = k(bVarM.f45390a, d0Var, z10, i11, this.f45389a);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new ha.a(arrayList);
    }

    public h(a aVar) {
        this.f45389a = aVar;
    }

    private static b m(d0 d0Var) {
        if (d0Var.a() < 10) {
            u.i("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iK = d0Var.K();
        if (iK != 4801587) {
            u.i("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iK)));
            return null;
        }
        int iH = d0Var.H();
        boolean z10 = true;
        d0Var.V(1);
        int iH2 = d0Var.H();
        int iG = d0Var.G();
        if (iH == 2) {
            if ((iH2 & 64) != 0) {
                u.i("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iH == 3) {
            if ((iH2 & 64) != 0) {
                int iQ = d0Var.q();
                d0Var.V(iQ);
                iG -= iQ + 4;
            }
        } else if (iH == 4) {
            if ((iH2 & 64) != 0) {
                int iG2 = d0Var.G();
                d0Var.V(iG2 - 4);
                iG -= iG2;
            }
            if ((iH2 & 16) != 0) {
                iG -= 10;
            }
        } else {
            u.i("Id3Decoder", QGbBllacZSmHKn.XSKwjGzwr + iH);
            return null;
        }
        if (iH >= 4 || (iH2 & 128) == 0) {
            z10 = false;
        }
        return new b(iH, z10, iG);
    }
}
