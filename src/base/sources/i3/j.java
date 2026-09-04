package i3;

import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import o2.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class j {
    private static c3.e a(int i10, w1.u uVar) {
        int iP = uVar.p();
        if (uVar.p() == 1684108385) {
            uVar.U(8);
            String strB = uVar.B(iP - 16);
            return new c3.e(C.LANGUAGE_UNDETERMINED, strB, strB);
        }
        w1.n.h("MetadataUtil", "Failed to parse comment attribute: " + a.a(i10));
        return null;
    }

    private static c3.a b(w1.u uVar) {
        String str;
        int iP = uVar.p();
        if (uVar.p() != 1684108385) {
            w1.n.h("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iB = a.b(uVar.p());
        if (iB == 13) {
            str = "image/jpeg";
        } else {
            str = iB == 14 ? "image/png" : null;
        }
        if (str == null) {
            w1.n.h("MetadataUtil", "Unrecognized cover art flags: " + iB);
            return null;
        }
        uVar.U(4);
        int i10 = iP - 16;
        byte[] bArr = new byte[i10];
        uVar.l(bArr, 0, i10);
        return new c3.a(str, null, 3, bArr);
    }

    public static t1.u.b c(w1.u uVar) {
        int iF = uVar.f() + uVar.p();
        int iP = uVar.p();
        int i10 = (iP >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & iP;
                if (i11 == 6516084) {
                    c3.e eVarA = a(iP, uVar);
                    uVar.T(iF);
                    return eVarA;
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    c3.n nVarJ = j(iP, "TIT2", uVar);
                    uVar.T(iF);
                    return nVarJ;
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    c3.n nVarJ2 = j(iP, "TCOM", uVar);
                    uVar.T(iF);
                    return nVarJ2;
                }
                if (i11 == 6578553) {
                    c3.n nVarJ3 = j(iP, "TDRC", uVar);
                    uVar.T(iF);
                    return nVarJ3;
                }
                if (i11 == 4280916) {
                    c3.n nVarJ4 = j(iP, "TPE1", uVar);
                    uVar.T(iF);
                    return nVarJ4;
                }
                if (i11 == 7630703) {
                    c3.n nVarJ5 = j(iP, "TSSE", uVar);
                    uVar.T(iF);
                    return nVarJ5;
                }
                if (i11 == 6384738) {
                    c3.n nVarJ6 = j(iP, "TALB", uVar);
                    uVar.T(iF);
                    return nVarJ6;
                }
                if (i11 == 7108978) {
                    c3.n nVarJ7 = j(iP, "USLT", uVar);
                    uVar.T(iF);
                    return nVarJ7;
                }
                if (i11 == 6776174) {
                    c3.n nVarJ8 = j(iP, "TCON", uVar);
                    uVar.T(iF);
                    return nVarJ8;
                }
                if (i11 == 6779504) {
                    c3.n nVarJ9 = j(iP, "TIT1", uVar);
                    uVar.T(iF);
                    return nVarJ9;
                }
            } else {
                if (iP == 1735291493) {
                    c3.n nVarI = i(uVar);
                    uVar.T(iF);
                    return nVarI;
                }
                if (iP == 1684632427) {
                    c3.n nVarD = d(iP, "TPOS", uVar);
                    uVar.T(iF);
                    return nVarD;
                }
                if (iP == 1953655662) {
                    c3.n nVarD2 = d(iP, "TRCK", uVar);
                    uVar.T(iF);
                    return nVarD2;
                }
                if (iP == 1953329263) {
                    c3.i iVarF = f(iP, "TBPM", uVar, true, false);
                    uVar.T(iF);
                    return iVarF;
                }
                if (iP == 1668311404) {
                    c3.i iVarF2 = f(iP, "TCMP", uVar, true, true);
                    uVar.T(iF);
                    return iVarF2;
                }
                if (iP == 1668249202) {
                    c3.a aVarB = b(uVar);
                    uVar.T(iF);
                    return aVarB;
                }
                if (iP == 1631670868) {
                    c3.n nVarJ10 = j(iP, "TPE2", uVar);
                    uVar.T(iF);
                    return nVarJ10;
                }
                if (iP == 1936682605) {
                    c3.n nVarJ11 = j(iP, "TSOT", uVar);
                    uVar.T(iF);
                    return nVarJ11;
                }
                if (iP == 1936679276) {
                    c3.n nVarJ12 = j(iP, "TSOA", uVar);
                    uVar.T(iF);
                    return nVarJ12;
                }
                if (iP == 1936679282) {
                    c3.n nVarJ13 = j(iP, "TSOP", uVar);
                    uVar.T(iF);
                    return nVarJ13;
                }
                if (iP == 1936679265) {
                    c3.n nVarJ14 = j(iP, "TSO2", uVar);
                    uVar.T(iF);
                    return nVarJ14;
                }
                if (iP == 1936679791) {
                    c3.n nVarJ15 = j(iP, "TSOC", uVar);
                    uVar.T(iF);
                    return nVarJ15;
                }
                if (iP == 1920233063) {
                    c3.i iVarF3 = f(iP, "ITUNESADVISORY", uVar, false, false);
                    uVar.T(iF);
                    return iVarF3;
                }
                if (iP == 1885823344) {
                    c3.i iVarF4 = f(iP, "ITUNESGAPLESS", uVar, false, true);
                    uVar.T(iF);
                    return iVarF4;
                }
                if (iP == 1936683886) {
                    c3.n nVarJ16 = j(iP, "TVSHOWSORT", uVar);
                    uVar.T(iF);
                    return nVarJ16;
                }
                if (iP == 1953919848) {
                    c3.n nVarJ17 = j(iP, "TVSHOW", uVar);
                    uVar.T(iF);
                    return nVarJ17;
                }
                if (iP == 757935405) {
                    c3.i iVarG = g(uVar, iF);
                    uVar.T(iF);
                    return iVarG;
                }
            }
            w1.n.b("MetadataUtil", "Skipped unknown metadata entry: " + a.a(iP));
            uVar.T(iF);
            return null;
        } catch (Throwable th2) {
            uVar.T(iF);
            throw th2;
        }
    }

    private static c3.n d(int i10, String str, w1.u uVar) {
        int iP = uVar.p();
        if (uVar.p() == 1684108385 && iP >= 22) {
            uVar.U(10);
            int iM = uVar.M();
            if (iM > 0) {
                String str2 = "" + iM;
                int iM2 = uVar.M();
                if (iM2 > 0) {
                    str2 = str2 + "/" + iM2;
                }
                return new c3.n(str, null, c0.D(str2));
            }
        }
        w1.n.h("MetadataUtil", "Failed to parse index/count attribute: " + a.a(i10));
        return null;
    }

    private static int e(w1.u uVar) {
        int iP = uVar.p();
        if (uVar.p() == 1684108385) {
            uVar.U(8);
            int i10 = iP - 16;
            if (i10 == 1) {
                return uVar.G();
            }
            if (i10 == 2) {
                return uVar.M();
            }
            if (i10 == 3) {
                return uVar.J();
            }
            if (i10 == 4 && (uVar.j() & 128) == 0) {
                return uVar.K();
            }
        }
        w1.n.h("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static c3.i f(int i10, String str, w1.u uVar, boolean z10, boolean z11) {
        int iE = e(uVar);
        if (z11) {
            iE = Math.min(1, iE);
        }
        if (iE >= 0) {
            return z10 ? new c3.n(str, null, c0.D(Integer.toString(iE))) : new c3.e(C.LANGUAGE_UNDETERMINED, str, Integer.toString(iE));
        }
        w1.n.h("MetadataUtil", "Failed to parse uint8 attribute: " + a.a(i10));
        return null;
    }

    private static c3.i g(w1.u uVar, int i10) {
        String strB = null;
        String strB2 = null;
        int i11 = -1;
        int i12 = -1;
        while (uVar.f() < i10) {
            int iF = uVar.f();
            int iP = uVar.p();
            int iP2 = uVar.p();
            uVar.U(4);
            if (iP2 == 1835360622) {
                strB = uVar.B(iP - 12);
            } else if (iP2 == 1851878757) {
                strB2 = uVar.B(iP - 12);
            } else {
                if (iP2 == 1684108385) {
                    i11 = iF;
                    i12 = iP;
                }
                uVar.U(iP - 12);
            }
        }
        if (strB == null || strB2 == null || i11 == -1) {
            return null;
        }
        uVar.T(i11);
        uVar.U(16);
        return new c3.k(strB, strB2, uVar.B(i12 - 16));
    }

    public static x1.a h(w1.u uVar, int i10, String str) {
        while (true) {
            int iF = uVar.f();
            if (iF >= i10) {
                return null;
            }
            int iP = uVar.p();
            if (uVar.p() == 1684108385) {
                int iP2 = uVar.p();
                int iP3 = uVar.p();
                int i11 = iP - 16;
                byte[] bArr = new byte[i11];
                uVar.l(bArr, 0, i11);
                return new x1.a(str, bArr, iP3, iP2);
            }
            uVar.T(iF + iP);
        }
    }

    private static c3.n i(w1.u uVar) {
        String strA = c3.j.a(e(uVar) - 1);
        if (strA != null) {
            return new c3.n("TCON", null, c0.D(strA));
        }
        w1.n.h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static c3.n j(int i10, String str, w1.u uVar) {
        int iP = uVar.p();
        if (uVar.p() == 1684108385) {
            uVar.U(8);
            return new c3.n(str, null, c0.D(uVar.B(iP - 16)));
        }
        w1.n.h("MetadataUtil", "Failed to parse text attribute: " + a.a(i10));
        return null;
    }

    public static void k(int i10, b0 b0Var, t1.o.b bVar) {
        if (i10 == 1 && b0Var.a()) {
            bVar.V(b0Var.f47982a).W(b0Var.f47983b);
        }
    }

    public static void l(int i10, t1.u uVar, t1.o.b bVar, t1.u... uVarArr) {
        t1.u uVar2 = new t1.u(new t1.u.b[0]);
        if (uVar != null) {
            for (int i11 = 0; i11 < uVar.f(); i11++) {
                t1.u.b bVarE = uVar.e(i11);
                if (bVarE instanceof x1.a) {
                    x1.a aVar = (x1.a) bVarE;
                    if (!aVar.f56565a.equals("com.android.capture.fps")) {
                        uVar2 = uVar2.a(aVar);
                    } else if (i10 == 2) {
                        uVar2 = uVar2.a(aVar);
                    }
                }
            }
        }
        for (t1.u uVar3 : uVarArr) {
            uVar2 = uVar2.b(uVar3);
        }
        if (uVar2.f() > 0) {
            bVar.h0(uVar2);
        }
    }
}
