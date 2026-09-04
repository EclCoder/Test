package gb;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import bb.h;
import bb.i;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ob.d0;
import ob.r0;
import ob.u;
import sc.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f39038t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f39039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final b f39040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map f39041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f39042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f39043s;

    public a(List list) {
        super("SsaDecoder");
        this.f39042r = -3.4028235E38f;
        this.f39043s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f39039o = false;
            this.f39040p = null;
            return;
        }
        this.f39039o = true;
        String strE = r0.E((byte[]) list.get(0));
        ob.a.a(strE.startsWith("Format:"));
        this.f39040p = (b) ob.a.e(b.a(strE));
        D(new d0((byte[]) list.get(1)), e.f52294c);
    }

    private Charset A(d0 d0Var) {
        Charset charsetP = d0Var.P();
        return charsetP != null ? charsetP : e.f52294c;
    }

    private void B(String str, b bVar, List list, List list2) {
        int i10;
        ob.a.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", bVar.f39048e);
        if (strArrSplit.length != bVar.f39048e) {
            u.i("SsaDecoder", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jG = G(strArrSplit[bVar.f39044a]);
        if (jG == C.TIME_UNSET) {
            u.i("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        long jG2 = G(strArrSplit[bVar.f39045b]);
        if (jG2 == C.TIME_UNSET) {
            u.i("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        Map map = this.f39041q;
        c cVar = (map == null || (i10 = bVar.f39046c) == -1) ? null : (c) map.get(strArrSplit[i10].trim());
        String str2 = strArrSplit[bVar.f39047d];
        bb.b bVarZ = z(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f39042r, this.f39043s);
        int iX = x(jG2, list2, list);
        for (int iX2 = x(jG, list2, list); iX2 < iX; iX2++) {
            ((List) list.get(iX2)).add(bVarZ);
        }
    }

    private void C(d0 d0Var, List list, List list2, Charset charset) {
        b bVarA = this.f39039o ? this.f39040p : null;
        while (true) {
            String strT = d0Var.t(charset);
            if (strT == null) {
                return;
            }
            if (strT.startsWith("Format:")) {
                bVarA = b.a(strT);
            } else if (strT.startsWith("Dialogue:")) {
                if (bVarA == null) {
                    u.i("SsaDecoder", "Skipping dialogue line before complete format: " + strT);
                } else {
                    B(strT, bVarA, list, list2);
                }
            }
        }
    }

    private void D(d0 d0Var, Charset charset) {
        while (true) {
            String strT = d0Var.t(charset);
            if (strT == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strT)) {
                E(d0Var, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strT)) {
                this.f39041q = F(d0Var, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strT)) {
                u.f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strT)) {
                return;
            }
        }
    }

    private void E(d0 d0Var, Charset charset) {
        while (true) {
            String strT = d0Var.t(charset);
            if (strT == null) {
                return;
            }
            if (d0Var.a() != 0 && d0Var.h(charset) == '[') {
                return;
            }
            String[] strArrSplit = strT.split(":");
            if (strArrSplit.length == 2) {
                String strE = sc.c.e(strArrSplit[0].trim());
                strE.getClass();
                if (strE.equals("playresx")) {
                    this.f39042r = Float.parseFloat(strArrSplit[1].trim());
                } else if (strE.equals("playresy")) {
                    try {
                        this.f39043s = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map F(d0 d0Var, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strT = d0Var.t(charset);
            if (strT == null || (d0Var.a() != 0 && d0Var.h(charset) == '[')) {
                break;
            }
            if (strT.startsWith("Format:")) {
                aVarA = c.a.a(strT);
            } else if (strT.startsWith("Style:")) {
                if (aVarA == null) {
                    u.i("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + strT);
                } else {
                    c cVarB = c.b(strT, aVarA);
                    if (cVarB != null) {
                        linkedHashMap.put(cVarB.f39049a, cVarB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long G(String str) {
        Matcher matcher = f39038t.matcher(str.trim());
        return !matcher.matches() ? C.TIME_UNSET : (Long.parseLong((String) r0.j(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) r0.j(matcher.group(2))) * 60000000) + (Long.parseLong((String) r0.j(matcher.group(3))) * 1000000) + (Long.parseLong((String) r0.j(matcher.group(4))) * 10000);
    }

    private static int H(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                u.i("SsaDecoder", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int I(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                u.i("SsaDecoder", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    private static Layout.Alignment J(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                u.i("SsaDecoder", "Unknown alignment: " + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    private static int x(long j10, List list, List list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i10 - 1)));
        return i10;
    }

    private static float y(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static bb.b z(String str, c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        bb.b.C0112b c0112bO = new bb.b.C0112b().o(spannableString);
        if (cVar != null) {
            if (cVar.f39051c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f39051c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f39058j == 3 && cVar.f39052d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f39052d.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f39053e;
            if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                c0112bO.q(f12 / f11, 1);
            }
            boolean z10 = cVar.f39054f;
            if (z10 && cVar.f39055g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f39055g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f39056h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f39057i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f39074a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f39050b : -1;
        }
        c0112bO.p(J(i10)).l(I(i10)).i(H(i10));
        PointF pointF = bVar.f39075b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            c0112bO.k(y(c0112bO.d()));
            c0112bO.h(y(c0112bO.c()), 0);
        } else {
            c0112bO.k(pointF.x / f10);
            c0112bO.h(bVar.f39075b.y / f11, 0);
        }
        return c0112bO.a();
    }

    @Override // bb.h
    protected i v(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        d0 d0Var = new d0(bArr, i10);
        Charset charsetA = A(d0Var);
        if (!this.f39039o) {
            D(d0Var, charsetA);
        }
        C(d0Var, arrayList, arrayList2, charsetA);
        return new d(arrayList, arrayList2);
    }
}
