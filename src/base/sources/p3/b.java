package p3;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l3.r;
import sc.e;
import w1.c0;
import w1.h;
import w1.n;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f49471g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f49472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f49473b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f49475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f49476e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f49477f = -3.4028235E38f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f49474c = new u();

    public b(List list) {
        if (list == null || list.isEmpty()) {
            this.f49472a = false;
            this.f49473b = null;
            return;
        }
        this.f49472a = true;
        String strG = c0.G((byte[]) list.get(0));
        w1.a.a(strG.startsWith("Format:"));
        this.f49473b = (a) w1.a.e(a.a(strG));
        j(new u((byte[]) list.get(1)), e.f52294c);
    }

    private static int d(long j10, List list, List list2) {
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

    private static float e(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static v1.a f(String str, c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        v1.a.b bVarO = new v1.a.b().o(spannableString);
        if (cVar != null) {
            if (cVar.f49480c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f49480c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f49487j == 3 && cVar.f49481d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f49481d.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f49482e;
            if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                bVarO.q(f12 / f11, 1);
            }
            boolean z10 = cVar.f49483f;
            if (z10 && cVar.f49484g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f49484g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f49485h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f49486i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f49503a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f49479b : -1;
        }
        bVarO.p(p(i10)).l(o(i10)).i(n(i10));
        PointF pointF = bVar.f49504b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            bVarO.k(e(bVarO.d()));
            bVarO.h(e(bVarO.c()), 0);
        } else {
            bVarO.k(pointF.x / f10);
            bVarO.h(bVar.f49504b.y / f11, 0);
        }
        return bVarO.a();
    }

    private Charset g(u uVar) {
        Charset charsetO = uVar.O();
        return charsetO != null ? charsetO : e.f52294c;
    }

    private void h(String str, a aVar, List list, List list2) {
        int i10;
        w1.a.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", aVar.f49470e);
        if (strArrSplit.length != aVar.f49470e) {
            n.h("SsaParser", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jM = m(strArrSplit[aVar.f49466a]);
        if (jM == C.TIME_UNSET) {
            n.h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        long jM2 = m(strArrSplit[aVar.f49467b]);
        if (jM2 == C.TIME_UNSET) {
            n.h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        Map map = this.f49475d;
        c cVar = (map == null || (i10 = aVar.f49468c) == -1) ? null : (c) map.get(strArrSplit[i10].trim());
        String str2 = strArrSplit[aVar.f49469d];
        v1.a aVarF = f(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f49476e, this.f49477f);
        int iD = d(jM2, list2, list);
        for (int iD2 = d(jM, list2, list); iD2 < iD; iD2++) {
            ((List) list.get(iD2)).add(aVarF);
        }
    }

    private void i(u uVar, List list, List list2, Charset charset) {
        a aVarA = this.f49472a ? this.f49473b : null;
        while (true) {
            String strS = uVar.s(charset);
            if (strS == null) {
                return;
            }
            if (strS.startsWith("Format:")) {
                aVarA = a.a(strS);
            } else if (strS.startsWith("Dialogue:")) {
                if (aVarA == null) {
                    n.h("SsaParser", "Skipping dialogue line before complete format: " + strS);
                } else {
                    h(strS, aVarA, list, list2);
                }
            }
        }
    }

    private void j(u uVar, Charset charset) {
        while (true) {
            String strS = uVar.s(charset);
            if (strS == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strS)) {
                k(uVar, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strS)) {
                this.f49475d = l(uVar, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strS)) {
                n.f("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strS)) {
                return;
            }
        }
    }

    private void k(u uVar, Charset charset) {
        while (true) {
            String strS = uVar.s(charset);
            if (strS == null) {
                return;
            }
            if (uVar.a() != 0 && uVar.h(charset) == '[') {
                return;
            }
            String[] strArrSplit = strS.split(":");
            if (strArrSplit.length == 2) {
                String strE = sc.c.e(strArrSplit[0].trim());
                strE.getClass();
                if (strE.equals("playresx")) {
                    this.f49476e = Float.parseFloat(strArrSplit[1].trim());
                } else if (strE.equals("playresy")) {
                    try {
                        this.f49477f = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map l(u uVar, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strS = uVar.s(charset);
            if (strS == null || (uVar.a() != 0 && uVar.h(charset) == '[')) {
                break;
            }
            if (strS.startsWith("Format:")) {
                aVarA = c.a.a(strS);
            } else if (strS.startsWith("Style:")) {
                if (aVarA == null) {
                    n.h("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + strS);
                } else {
                    c cVarB = c.b(strS, aVarA);
                    if (cVarB != null) {
                        linkedHashMap.put(cVarB.f49478a, cVarB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long m(String str) {
        Matcher matcher = f49471g.matcher(str.trim());
        return !matcher.matches() ? C.TIME_UNSET : (Long.parseLong((String) c0.h(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) c0.h(matcher.group(2))) * 60000000) + (Long.parseLong((String) c0.h(matcher.group(3))) * 1000000) + (Long.parseLong((String) c0.h(matcher.group(4))) * 10000);
    }

    private static int n(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                n.h("SsaParser", "Unknown alignment: " + i10);
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

    private static int o(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                n.h("SsaParser", "Unknown alignment: " + i10);
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

    private static Layout.Alignment p(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                n.h("SsaParser", "Unknown alignment: " + i10);
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

    @Override // l3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, h hVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f49474c.R(bArr, i10 + i11);
        this.f49474c.T(i10);
        Charset charsetG = g(this.f49474c);
        if (!this.f49472a) {
            j(this.f49474c, charsetG);
        }
        i(this.f49474c, arrayList, arrayList2, charsetG);
        ArrayList arrayList3 = (bVar.f43875a == C.TIME_UNSET || !bVar.f43876b) ? null : new ArrayList();
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            List list = (List) arrayList.get(i13);
            if (!list.isEmpty() || i13 == 0) {
                if (i13 == arrayList.size() - 1) {
                    throw new IllegalStateException();
                }
                long jLongValue = ((Long) arrayList2.get(i13)).longValue();
                long jLongValue2 = ((Long) arrayList2.get(i13 + 1)).longValue() - ((Long) arrayList2.get(i13)).longValue();
                long j10 = bVar.f43875a;
                if (j10 == C.TIME_UNSET || jLongValue >= j10) {
                    hVar.accept(new l3.e(list, jLongValue, jLongValue2));
                } else if (arrayList3 != null) {
                    arrayList3.add(new l3.e(list, jLongValue, jLongValue2));
                }
            }
        }
        if (arrayList3 != null) {
            int size = arrayList3.size();
            while (i12 < size) {
                Object obj = arrayList3.get(i12);
                i12++;
                hVar.accept((l3.e) obj);
            }
        }
    }

    @Override // l3.r
    public int c() {
        return 1;
    }
}
