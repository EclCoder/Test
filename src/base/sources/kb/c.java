package kb;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ob.d0;
import ob.r0;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f43108c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f43109d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f43110a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f43111b = new StringBuilder();

    private void a(d dVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f43108c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                dVar.z((String) ob.a.e(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrY0 = r0.Y0(str, "\\.");
        String str2 = strArrY0[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            dVar.y(str2.substring(0, iIndexOf2));
            dVar.x(str2.substring(iIndexOf2 + 1));
        } else {
            dVar.y(str2);
        }
        if (strArrY0.length > 1) {
            dVar.w((String[]) r0.N0(strArrY0, 1, strArrY0.length));
        }
    }

    private static boolean b(d0 d0Var) {
        int iF = d0Var.f();
        int iG = d0Var.g();
        byte[] bArrE = d0Var.e();
        if (iF + 2 > iG) {
            return false;
        }
        int i10 = iF + 1;
        if (bArrE[iF] != 47) {
            return false;
        }
        int i11 = iF + 2;
        if (bArrE[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iG) {
                d0Var.V(iG - d0Var.f());
                return true;
            }
            if (((char) bArrE[i11]) == '*' && ((char) bArrE[i12]) == '/') {
                i11 += 2;
                iG = i11;
            } else {
                i11 = i12;
            }
        }
    }

    private static boolean c(d0 d0Var) {
        char cK = k(d0Var, d0Var.f());
        if (cK != '\t' && cK != '\n' && cK != '\f' && cK != '\r' && cK != ' ') {
            return false;
        }
        d0Var.V(1);
        return true;
    }

    private static void e(String str, d dVar) {
        Matcher matcher = f43109d.matcher(sc.c.e(str));
        if (!matcher.matches()) {
            u.i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) ob.a.e(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                dVar.t(3);
                break;
            case "em":
                dVar.t(2);
                break;
            case "px":
                dVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        dVar.s(Float.parseFloat((String) ob.a.e(matcher.group(1))));
    }

    private static String f(d0 d0Var, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int iF = d0Var.f();
        int iG = d0Var.g();
        while (iF < iG && !z10) {
            char c10 = (char) d0Var.e()[iF];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                iF++;
                sb2.append(c10);
            }
        }
        d0Var.V(iF - d0Var.f());
        return sb2.toString();
    }

    static String g(d0 d0Var, StringBuilder sb2) {
        n(d0Var);
        if (d0Var.a() == 0) {
            return null;
        }
        String strF = f(d0Var, sb2);
        if (!"".equals(strF)) {
            return strF;
        }
        return "" + ((char) d0Var.H());
    }

    private static String h(d0 d0Var, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int iF = d0Var.f();
            String strG = g(d0Var, sb2);
            if (strG == null) {
                return null;
            }
            if ("}".equals(strG) || ";".equals(strG)) {
                d0Var.U(iF);
                z10 = true;
            } else {
                sb3.append(strG);
            }
        }
        return sb3.toString();
    }

    private static String i(d0 d0Var, StringBuilder sb2) {
        n(d0Var);
        if (d0Var.a() < 5 || !"::cue".equals(d0Var.E(5))) {
            return null;
        }
        int iF = d0Var.f();
        String strG = g(d0Var, sb2);
        if (strG == null) {
            return null;
        }
        if ("{".equals(strG)) {
            d0Var.U(iF);
            return "";
        }
        String strL = "(".equals(strG) ? l(d0Var) : null;
        if (")".equals(g(d0Var, sb2))) {
            return strL;
        }
        return null;
    }

    private static void j(d0 d0Var, d dVar, StringBuilder sb2) {
        n(d0Var);
        String strF = f(d0Var, sb2);
        if (!"".equals(strF) && ":".equals(g(d0Var, sb2))) {
            n(d0Var);
            String strH = h(d0Var, sb2);
            if (strH == null || "".equals(strH)) {
                return;
            }
            int iF = d0Var.f();
            String strG = g(d0Var, sb2);
            if (!";".equals(strG)) {
                if (!"}".equals(strG)) {
                    return;
                } else {
                    d0Var.U(iF);
                }
            }
            if (TtmlNode.ATTR_TTS_COLOR.equals(strF)) {
                dVar.q(ob.f.b(strH));
                return;
            }
            if ("background-color".equals(strF)) {
                dVar.n(ob.f.b(strH));
                return;
            }
            boolean z10 = true;
            if ("ruby-position".equals(strF)) {
                if ("over".equals(strH)) {
                    dVar.v(1);
                    return;
                } else {
                    if ("under".equals(strH)) {
                        dVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strF)) {
                if (!"all".equals(strH) && !strH.startsWith("digits")) {
                    z10 = false;
                }
                dVar.p(z10);
                return;
            }
            if ("text-decoration".equals(strF)) {
                if (TtmlNode.UNDERLINE.equals(strH)) {
                    dVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strF)) {
                dVar.r(strH);
                return;
            }
            if ("font-weight".equals(strF)) {
                if (TtmlNode.BOLD.equals(strH)) {
                    dVar.o(true);
                }
            } else if ("font-style".equals(strF)) {
                if (TtmlNode.ITALIC.equals(strH)) {
                    dVar.u(true);
                }
            } else if ("font-size".equals(strF)) {
                e(strH, dVar);
            }
        }
    }

    private static char k(d0 d0Var, int i10) {
        return (char) d0Var.e()[i10];
    }

    private static String l(d0 d0Var) {
        int iF = d0Var.f();
        int iG = d0Var.g();
        boolean z10 = false;
        while (iF < iG && !z10) {
            int i10 = iF + 1;
            z10 = ((char) d0Var.e()[iF]) == ')';
            iF = i10;
        }
        return d0Var.E((iF - 1) - d0Var.f()).trim();
    }

    static void m(d0 d0Var) {
        while (!TextUtils.isEmpty(d0Var.s())) {
        }
    }

    static void n(d0 d0Var) {
        while (true) {
            for (boolean z10 = true; d0Var.a() > 0 && z10; z10 = false) {
                if (!c(d0Var) && !b(d0Var)) {
                }
            }
            return;
        }
    }

    public List d(d0 d0Var) {
        this.f43111b.setLength(0);
        int iF = d0Var.f();
        m(d0Var);
        this.f43110a.S(d0Var.e(), d0Var.f());
        this.f43110a.U(iF);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strI = i(this.f43110a, this.f43111b);
            if (strI == null || !"{".equals(g(this.f43110a, this.f43111b))) {
                break;
            }
            d dVar = new d();
            a(dVar, strI);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int iF2 = this.f43110a.f();
                String strG = g(this.f43110a, this.f43111b);
                boolean z11 = strG == null || "}".equals(strG);
                if (!z11) {
                    this.f43110a.U(iF2);
                    j(this.f43110a, dVar, this.f43111b);
                }
                str = strG;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }
}
