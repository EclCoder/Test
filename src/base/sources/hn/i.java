package hn;

import bm.r;
import gn.x;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class i {
    public static final gn.d a(gn.d.a aVar) {
        s.h(aVar, "<this>");
        return new gn.d(aVar.f(), aVar.g(), aVar.c(), -1, false, false, false, aVar.d(), aVar.e(), aVar.i(), aVar.h(), aVar.b(), null);
    }

    public static final int b(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    public static final gn.d c(gn.d.b bVar) {
        s.h(bVar, "<this>");
        gn.d.a aVarM = new gn.d.a().m();
        cm.a.C0139a c0139a = cm.a.f10121b;
        return aVarM.j(cm.c.s(Integer.MAX_VALUE, cm.d.SECONDS)).a();
    }

    public static final gn.d d(gn.d.b bVar) {
        s.h(bVar, "<this>");
        return new gn.d.a().k().a();
    }

    public static final gn.d.a e(gn.d.a aVar) {
        s.h(aVar, "<this>");
        aVar.n(true);
        return aVar;
    }

    public static final gn.d.a f(gn.d.a aVar) {
        s.h(aVar, "<this>");
        aVar.o(true);
        return aVar;
    }

    public static final gn.d.a g(gn.d.a aVar) {
        s.h(aVar, "<this>");
        aVar.p(true);
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:39:0x0100  */
    /* JADX WARN: Code duplicated, block: B:41:0x010a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0112  */
    /* JADX WARN: Code duplicated, block: B:44:0x0118  */
    /* JADX WARN: Code duplicated, block: B:46:0x0120  */
    /* JADX WARN: Code duplicated, block: B:47:0x0126  */
    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0134  */
    /* JADX WARN: Code duplicated, block: B:52:0x013c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0142  */
    /* JADX WARN: Code duplicated, block: B:55:0x014a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0152  */
    /* JADX WARN: Code duplicated, block: B:58:0x015a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0160  */
    /* JADX WARN: Code duplicated, block: B:61:0x0169  */
    /* JADX WARN: Code duplicated, block: B:62:0x0171  */
    /* JADX WARN: Code duplicated, block: B:64:0x0179  */
    /* JADX WARN: Code duplicated, block: B:65:0x0181  */
    /* JADX WARN: Code duplicated, block: B:67:0x0189  */
    public static final gn.d h(gn.d.b bVar, x xVar) {
        int iJ;
        int iJ2;
        boolean z10;
        String string;
        int i10;
        String str;
        String string2;
        x headers = xVar;
        s.h(bVar, "<this>");
        s.h(headers, "headers");
        int size = headers.size();
        boolean z11 = true;
        boolean z12 = true;
        int i11 = 0;
        String str2 = null;
        boolean z13 = false;
        boolean z14 = false;
        int iD = -1;
        int iD2 = -1;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        int iD3 = -1;
        int iD4 = -1;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        while (i11 < size) {
            String strD = headers.d(i11);
            String strH = headers.h(i11);
            if (r.A(strD, "Cache-Control", z11)) {
                if (str2 == null) {
                    str2 = strH;
                }
                iJ = 0;
                while (iJ < strH.length()) {
                    iJ2 = j(strH, "=,;", iJ);
                    String strSubstring = strH.substring(iJ, iJ2);
                    z10 = z11;
                    s.g(strSubstring, "substring(...)");
                    string = r.V0(strSubstring).toString();
                    if (iJ2 != strH.length()) {
                        i10 = size;
                        if (strH.charAt(iJ2) == ',' && strH.charAt(iJ2) != ';') {
                            int iU = m.u(strH, iJ2 + 1);
                            if (iU >= strH.length() || strH.charAt(iU) != '\"') {
                                str = strH;
                                iJ = j(str, ",;", iU);
                                String strSubstring2 = str.substring(iU, iJ);
                                s.g(strSubstring2, "substring(...)");
                                string2 = r.V0(strSubstring2).toString();
                            } else {
                                int i12 = iU + 1;
                                String str3 = strH;
                                int iE0 = r.e0(str3, '\"', i12, false, 4, null);
                                str = str3;
                                String strSubstring3 = str.substring(i12, iE0);
                                s.g(strSubstring3, "substring(...)");
                                iJ = iE0 + 1;
                                string2 = strSubstring3;
                            }
                        }
                        if (r.A("no-cache", string, z10)) {
                            z11 = z10;
                            z13 = z11;
                        } else if (r.A("no-store", string, z10)) {
                            z11 = z10;
                            z14 = z11;
                        } else {
                            if (r.A("max-age", string, z10)) {
                                iD = m.D(string2, -1);
                            } else if (r.A("s-maxage", string, z10)) {
                                iD2 = m.D(string2, -1);
                            } else if (r.A("private", string, z10)) {
                                z11 = z10;
                                z15 = z11;
                            } else if (r.A("public", string, z10)) {
                                z11 = z10;
                                z16 = z11;
                            } else if (r.A("must-revalidate", string, z10)) {
                                z11 = z10;
                                z17 = z11;
                            } else if (r.A("max-stale", string, z10)) {
                                iD3 = m.D(string2, Integer.MAX_VALUE);
                            } else if (r.A("min-fresh", string, z10)) {
                                iD4 = m.D(string2, -1);
                            } else if (r.A("only-if-cached", string, z10)) {
                                z11 = z10;
                                z18 = z11;
                            } else if (r.A("no-transform", string, z10)) {
                                z11 = z10;
                                z19 = z11;
                            } else if (r.A("immutable", string, z10)) {
                                z11 = z10;
                                z20 = z11;
                            }
                            z11 = z10;
                        }
                        strH = str;
                        size = i10;
                    } else {
                        i10 = size;
                    }
                    str = strH;
                    iJ = iJ2 + 1;
                    string2 = null;
                    if (r.A("no-cache", string, z10)) {
                        z11 = z10;
                        z13 = z11;
                    } else if (r.A("no-store", string, z10)) {
                        z11 = z10;
                        z14 = z11;
                    } else {
                        if (r.A("max-age", string, z10)) {
                            iD = m.D(string2, -1);
                        } else if (r.A("s-maxage", string, z10)) {
                            iD2 = m.D(string2, -1);
                        } else if (r.A("private", string, z10)) {
                            z11 = z10;
                            z15 = z11;
                        } else if (r.A("public", string, z10)) {
                            z11 = z10;
                            z16 = z11;
                        } else if (r.A("must-revalidate", string, z10)) {
                            z11 = z10;
                            z17 = z11;
                        } else if (r.A("max-stale", string, z10)) {
                            iD3 = m.D(string2, Integer.MAX_VALUE);
                        } else if (r.A("min-fresh", string, z10)) {
                            iD4 = m.D(string2, -1);
                        } else if (r.A("only-if-cached", string, z10)) {
                            z11 = z10;
                            z18 = z11;
                        } else if (r.A("no-transform", string, z10)) {
                            z11 = z10;
                            z19 = z11;
                        } else if (r.A("immutable", string, z10)) {
                            z11 = z10;
                            z20 = z11;
                        }
                        z11 = z10;
                    }
                    strH = str;
                    size = i10;
                }
                i11++;
                headers = xVar;
                z11 = z11;
                size = size;
            } else {
                if (r.A(strD, "Pragma", z11)) {
                }
                i11++;
                headers = xVar;
                z11 = z11;
                size = size;
            }
            z12 = false;
            iJ = 0;
            while (iJ < strH.length()) {
                iJ2 = j(strH, "=,;", iJ);
                String strSubstring4 = strH.substring(iJ, iJ2);
                z10 = z11;
                s.g(strSubstring4, "substring(...)");
                string = r.V0(strSubstring4).toString();
                if (iJ2 != strH.length()) {
                    i10 = size;
                    if (strH.charAt(iJ2) == ',') {
                    }
                    if (r.A("no-cache", string, z10)) {
                        z11 = z10;
                        z13 = z11;
                    } else if (r.A("no-store", string, z10)) {
                        z11 = z10;
                        z14 = z11;
                    } else {
                        if (r.A("max-age", string, z10)) {
                            iD = m.D(string2, -1);
                        } else if (r.A("s-maxage", string, z10)) {
                            iD2 = m.D(string2, -1);
                        } else if (r.A("private", string, z10)) {
                            z11 = z10;
                            z15 = z11;
                        } else if (r.A("public", string, z10)) {
                            z11 = z10;
                            z16 = z11;
                        } else if (r.A("must-revalidate", string, z10)) {
                            z11 = z10;
                            z17 = z11;
                        } else if (r.A("max-stale", string, z10)) {
                            iD3 = m.D(string2, Integer.MAX_VALUE);
                        } else if (r.A("min-fresh", string, z10)) {
                            iD4 = m.D(string2, -1);
                        } else if (r.A("only-if-cached", string, z10)) {
                            z11 = z10;
                            z18 = z11;
                        } else if (r.A("no-transform", string, z10)) {
                            z11 = z10;
                            z19 = z11;
                        } else if (r.A("immutable", string, z10)) {
                            z11 = z10;
                            z20 = z11;
                        }
                        z11 = z10;
                    }
                    strH = str;
                    size = i10;
                } else {
                    i10 = size;
                }
                str = strH;
                iJ = iJ2 + 1;
                string2 = null;
                if (r.A("no-cache", string, z10)) {
                    z11 = z10;
                    z13 = z11;
                } else if (r.A("no-store", string, z10)) {
                    z11 = z10;
                    z14 = z11;
                } else {
                    if (r.A("max-age", string, z10)) {
                        iD = m.D(string2, -1);
                    } else if (r.A("s-maxage", string, z10)) {
                        iD2 = m.D(string2, -1);
                    } else if (r.A("private", string, z10)) {
                        z11 = z10;
                        z15 = z11;
                    } else if (r.A("public", string, z10)) {
                        z11 = z10;
                        z16 = z11;
                    } else if (r.A("must-revalidate", string, z10)) {
                        z11 = z10;
                        z17 = z11;
                    } else if (r.A("max-stale", string, z10)) {
                        iD3 = m.D(string2, Integer.MAX_VALUE);
                    } else if (r.A("min-fresh", string, z10)) {
                        iD4 = m.D(string2, -1);
                    } else if (r.A("only-if-cached", string, z10)) {
                        z11 = z10;
                        z18 = z11;
                    } else if (r.A("no-transform", string, z10)) {
                        z11 = z10;
                        z19 = z11;
                    } else if (r.A("immutable", string, z10)) {
                        z11 = z10;
                        z20 = z11;
                    }
                    z11 = z10;
                }
                strH = str;
                size = i10;
            }
            i11++;
            headers = xVar;
            z11 = z11;
            size = size;
        }
        return new gn.d(z13, z14, iD, iD2, z15, z16, z17, iD3, iD4, z18, z19, z20, !z12 ? null : str2);
    }

    public static final String i(gn.d dVar) {
        s.h(dVar, "<this>");
        String strA = dVar.a();
        if (strA != null) {
            return strA;
        }
        StringBuilder sb2 = new StringBuilder();
        if (dVar.i()) {
            sb2.append("no-cache, ");
        }
        if (dVar.j()) {
            sb2.append("no-store, ");
        }
        if (dVar.e() != -1) {
            sb2.append("max-age=");
            sb2.append(dVar.e());
            sb2.append(", ");
        }
        if (dVar.m() != -1) {
            sb2.append("s-maxage=");
            sb2.append(dVar.m());
            sb2.append(", ");
        }
        if (dVar.c()) {
            sb2.append("private, ");
        }
        if (dVar.d()) {
            sb2.append("public, ");
        }
        if (dVar.h()) {
            sb2.append("must-revalidate, ");
        }
        if (dVar.f() != -1) {
            sb2.append("max-stale=");
            sb2.append(dVar.f());
            sb2.append(", ");
        }
        if (dVar.g() != -1) {
            sb2.append("min-fresh=");
            sb2.append(dVar.g());
            sb2.append(", ");
        }
        if (dVar.l()) {
            sb2.append("only-if-cached, ");
        }
        if (dVar.k()) {
            sb2.append("no-transform, ");
        }
        if (dVar.b()) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        s.g(sb2.delete(sb2.length() - 2, sb2.length()), "delete(...)");
        String string = sb2.toString();
        dVar.n(string);
        return string;
    }

    private static final int j(String str, String str2, int i10) {
        int length = str.length();
        while (i10 < length) {
            if (r.S(str2, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return str.length();
    }
}
