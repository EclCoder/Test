package t3;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w1.c0;
import w1.n;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f53076c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f53077d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f53078a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f53079b = new StringBuilder();

    private void a(c cVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f53076c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                cVar.z((String) w1.a.e(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrU0 = c0.U0(str, "\\.");
        String str2 = strArrU0[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            cVar.y(str2.substring(0, iIndexOf2));
            cVar.x(str2.substring(iIndexOf2 + 1));
        } else {
            cVar.y(str2);
        }
        if (strArrU0.length > 1) {
            cVar.w((String[]) c0.J0(strArrU0, 1, strArrU0.length));
        }
    }

    private static boolean b(u uVar) {
        int iF = uVar.f();
        int iG = uVar.g();
        byte[] bArrE = uVar.e();
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
                uVar.U(iG - uVar.f());
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

    private static boolean c(u uVar) {
        char cK = k(uVar, uVar.f());
        if (cK != '\t' && cK != '\n' && cK != '\f' && cK != '\r' && cK != ' ') {
            return false;
        }
        uVar.U(1);
        return true;
    }

    private static void e(String str, c cVar) {
        Matcher matcher = f53077d.matcher(sc.c.e(str));
        if (!matcher.matches()) {
            n.h("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) w1.a.e(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                cVar.t(3);
                break;
            case "em":
                cVar.t(2);
                break;
            case "px":
                cVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        cVar.s(Float.parseFloat((String) w1.a.e(matcher.group(1))));
    }

    private static String f(u uVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int iF = uVar.f();
        int iG = uVar.g();
        while (iF < iG && !z10) {
            char c10 = (char) uVar.e()[iF];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                iF++;
                sb2.append(c10);
            }
        }
        uVar.U(iF - uVar.f());
        return sb2.toString();
    }

    static String g(u uVar, StringBuilder sb2) {
        n(uVar);
        if (uVar.a() == 0) {
            return null;
        }
        String strF = f(uVar, sb2);
        if (!"".equals(strF)) {
            return strF;
        }
        return "" + ((char) uVar.G());
    }

    private static String h(u uVar, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int iF = uVar.f();
            String strG = g(uVar, sb2);
            if (strG == null) {
                return null;
            }
            if ("}".equals(strG) || ";".equals(strG)) {
                uVar.T(iF);
                z10 = true;
            } else {
                sb3.append(strG);
            }
        }
        return sb3.toString();
    }

    private static String i(u uVar, StringBuilder sb2) {
        n(uVar);
        if (uVar.a() < 5 || !"::cue".equals(uVar.D(5))) {
            return null;
        }
        int iF = uVar.f();
        String strG = g(uVar, sb2);
        if (strG == null) {
            return null;
        }
        if ("{".equals(strG)) {
            uVar.T(iF);
            return "";
        }
        String strL = "(".equals(strG) ? l(uVar) : null;
        if (")".equals(g(uVar, sb2))) {
            return strL;
        }
        return null;
    }

    private static void j(u uVar, c cVar, StringBuilder sb2) {
        n(uVar);
        String strF = f(uVar, sb2);
        if (!"".equals(strF) && ":".equals(g(uVar, sb2))) {
            n(uVar);
            String strH = h(uVar, sb2);
            if (strH == null || "".equals(strH)) {
                return;
            }
            int iF = uVar.f();
            String strG = g(uVar, sb2);
            if (!";".equals(strG)) {
                if (!"}".equals(strG)) {
                    return;
                } else {
                    uVar.T(iF);
                }
            }
            if (TtmlNode.ATTR_TTS_COLOR.equals(strF)) {
                cVar.q(w1.f.b(strH));
                return;
            }
            if ("background-color".equals(strF)) {
                cVar.n(w1.f.b(strH));
                return;
            }
            boolean z10 = true;
            if ("ruby-position".equals(strF)) {
                if ("over".equals(strH)) {
                    cVar.v(1);
                    return;
                } else {
                    if ("under".equals(strH)) {
                        cVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strF)) {
                if (!"all".equals(strH) && !strH.startsWith("digits")) {
                    z10 = false;
                }
                cVar.p(z10);
                return;
            }
            if ("text-decoration".equals(strF)) {
                if (TtmlNode.UNDERLINE.equals(strH)) {
                    cVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strF)) {
                cVar.r(strH);
                return;
            }
            if ("font-weight".equals(strF)) {
                if (TtmlNode.BOLD.equals(strH)) {
                    cVar.o(true);
                }
            } else if ("font-style".equals(strF)) {
                if (TtmlNode.ITALIC.equals(strH)) {
                    cVar.u(true);
                }
            } else if ("font-size".equals(strF)) {
                e(strH, cVar);
            }
        }
    }

    private static char k(u uVar, int i10) {
        return (char) uVar.e()[i10];
    }

    private static String l(u uVar) {
        int iF = uVar.f();
        int iG = uVar.g();
        boolean z10 = false;
        while (iF < iG && !z10) {
            int i10 = iF + 1;
            z10 = ((char) uVar.e()[iF]) == ')';
            iF = i10;
        }
        return uVar.D((iF - 1) - uVar.f()).trim();
    }

    static void m(u uVar) {
        while (!TextUtils.isEmpty(uVar.r())) {
        }
    }

    static void n(u uVar) {
        while (true) {
            for (boolean z10 = true; uVar.a() > 0 && z10; z10 = false) {
                if (!c(uVar) && !b(uVar)) {
                }
            }
            return;
        }
    }

    public List d(u uVar) {
        this.f53079b.setLength(0);
        int iF = uVar.f();
        m(uVar);
        this.f53078a.R(uVar.e(), uVar.f());
        this.f53078a.T(iF);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strI = i(this.f53078a, this.f53079b);
            if (strI == null || !"{".equals(g(this.f53078a, this.f53079b))) {
                break;
            }
            c cVar = new c();
            a(cVar, strI);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int iF2 = this.f53078a.f();
                String strG = g(this.f53078a, this.f53079b);
                boolean z11 = strG == null || "}".equals(strG);
                if (!z11) {
                    this.f53078a.T(iF2);
                    j(this.f53078a, cVar, this.f53079b);
                }
                str = strG;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
