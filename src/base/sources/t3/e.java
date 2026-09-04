package t3;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w1.c0;
import w1.n;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f53100a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f53101b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f53102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f53103d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator f53104c = new Comparator() { // from class: t3.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((e.b) obj).f53105a.f53108b, ((e.b) obj2).f53105a.f53108b);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f53105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f53106b;

        private b(c cVar, int i10) {
            this.f53105a = cVar;
            this.f53106b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f53108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f53109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set f53110d;

        private c(String str, int i10, String str2, Set set) {
            this.f53108b = i10;
            this.f53107a = str;
            this.f53109c = str2;
            this.f53110d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String strTrim = str.trim();
            w1.a.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrU0 = c0.U0(strTrim, "\\.");
            String str3 = strArrU0[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < strArrU0.length; i11++) {
                hashSet.add(strArrU0[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.EMPTY_SET);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f53111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t3.c f53112b;

        public d(int i10, t3.c cVar) {
            this.f53111a = i10;
            this.f53112b = cVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f53111a, dVar.f53111a);
        }
    }

    /* JADX INFO: renamed from: t3.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0808e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f53115c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f53113a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f53114b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f53116d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f53117e = -3.4028235E38f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f53118f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f53119g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f53120h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f53121i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f53122j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f53123k = Integer.MIN_VALUE;

        private static float b(float f10, int i10) {
            if (f10 != -3.4028235E38f && i10 == 0 && (f10 < 0.0f || f10 > 1.0f)) {
                return 1.0f;
            }
            if (f10 != -3.4028235E38f) {
                return f10;
            }
            return i10 == 0 ? 1.0f : -3.4028235E38f;
        }

        private static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            n.h("WebvttCueParser", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        private static float e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int f(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        public t3.d a() {
            return new t3.d(g().a(), this.f53113a, this.f53114b);
        }

        public v1.a.b g() {
            float fE = this.f53120h;
            if (fE == -3.4028235E38f) {
                fE = e(this.f53116d);
            }
            int iF = this.f53121i;
            if (iF == Integer.MIN_VALUE) {
                iF = f(this.f53116d);
            }
            v1.a.b bVarR = new v1.a.b().p(c(this.f53116d)).h(b(this.f53117e, this.f53118f), this.f53118f).i(this.f53119g).k(fE).l(iF).n(Math.min(this.f53122j, d(iF, fE))).r(this.f53123k);
            CharSequence charSequence = this.f53115c;
            if (charSequence != null) {
                bVarR.o(charSequence);
            }
            return bVarR;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f53102c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f53103d = Collections.unmodifiableMap(map2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set set, int i10, int i11) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = f53102c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i10, i11, 33);
            } else {
                Map map2 = f53103d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str)).intValue()), i10, i11, 33);
                }
            }
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                n.h("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List list, List list2) {
        int i10 = i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f53104c);
        int i11 = cVar.f53108b;
        int length = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if ("rt".equals(((b) arrayList.get(i12)).f53105a.f53107a)) {
                b bVar = (b) arrayList.get(i12);
                int iG = g(i(list2, str, bVar.f53105a), i10, 1);
                int i13 = bVar.f53105a.f53108b - length;
                int i14 = bVar.f53106b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i13, i14);
                spannableStringBuilder.delete(i13, i14);
                spannableStringBuilder.setSpan(new v1.e(charSequenceSubSequence.toString(), iG), i11, i13, 33);
                length += charSequenceSubSequence.length();
                i11 = i13;
            }
        }
    }

    private static void d(String str, c cVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i10 = cVar.f53108b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f53107a;
        str2.getClass();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, cVar.f53110d, i10, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case "ruby":
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List listH = h(list2, str, cVar);
        for (int i11 = 0; i11 < listH.size(); i11++) {
            e(spannableStringBuilder, ((d) listH.get(i11)).f53112b, i10, length);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, t3.c cVar, int i10, int i11) {
        if (cVar == null) {
            return;
        }
        if (cVar.i() != -1) {
            v1.f.b(spannableStringBuilder, new StyleSpan(cVar.i()), i10, i11, 33);
        }
        if (cVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (cVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (cVar.k()) {
            v1.f.b(spannableStringBuilder, new ForegroundColorSpan(cVar.c()), i10, i11, 33);
        }
        if (cVar.j()) {
            v1.f.b(spannableStringBuilder, new BackgroundColorSpan(cVar.a()), i10, i11, 33);
        }
        if (cVar.d() != null) {
            v1.f.b(spannableStringBuilder, new TypefaceSpan(cVar.d()), i10, i11, 33);
        }
        int iF = cVar.f();
        if (iF == 1) {
            v1.f.b(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar.e(), true), i10, i11, 33);
        } else if (iF == 2) {
            v1.f.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e()), i10, i11, 33);
        } else if (iF == 3) {
            v1.f.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e() / 100.0f), i10, i11, 33);
        }
        if (cVar.b()) {
            spannableStringBuilder.setSpan(new v1.d(), i10, i11, 33);
        }
    }

    private static int f(String str, int i10) {
        int iIndexOf = str.indexOf(62, i10);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static int g(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    private static List h(List list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            t3.c cVar2 = (t3.c) list.get(i10);
            int iH = cVar2.h(str, cVar.f53107a, cVar.f53110d, cVar.f53109c);
            if (iH > 0) {
                arrayList.add(new d(iH, cVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int i(List list, String str, c cVar) {
        List listH = h(list, str, cVar);
        for (int i10 = 0; i10 < listH.size(); i10++) {
            t3.c cVar2 = ((d) listH.get(i10)).f53112b;
            if (cVar2.g() != -1) {
                return cVar2.g();
            }
        }
        return -1;
    }

    private static String j(String str) {
        String strTrim = str.trim();
        w1.a.a(!strTrim.isEmpty());
        return c0.V0(strTrim, "[ \\.]")[0];
    }

    private static boolean k(String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static v1.a l(CharSequence charSequence) {
        C0808e c0808e = new C0808e();
        c0808e.f53115c = charSequence;
        return c0808e.g().a();
    }

    private static t3.d m(String str, Matcher matcher, u uVar, List list) {
        C0808e c0808e = new C0808e();
        try {
            c0808e.f53113a = h.c((String) w1.a.e(matcher.group(1)));
            c0808e.f53114b = h.c((String) w1.a.e(matcher.group(2)));
            p((String) w1.a.e(matcher.group(3)), c0808e);
            StringBuilder sb2 = new StringBuilder();
            String strR = uVar.r();
            while (!TextUtils.isEmpty(strR)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strR.trim());
                strR = uVar.r();
            }
            c0808e.f53115c = q(str, sb2.toString(), list);
            return c0808e.a();
        } catch (NumberFormatException unused) {
            n.h("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static t3.d n(u uVar, List list) {
        String strR = uVar.r();
        if (strR == null) {
            return null;
        }
        Pattern pattern = f53100a;
        Matcher matcher = pattern.matcher(strR);
        if (matcher.matches()) {
            return m(null, matcher, uVar, list);
        }
        String strR2 = uVar.r();
        if (strR2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strR2);
        if (matcher2.matches()) {
            return m(strR.trim(), matcher2, uVar, list);
        }
        return null;
    }

    static v1.a.b o(String str) {
        C0808e c0808e = new C0808e();
        p(str, c0808e);
        return c0808e.g();
    }

    private static void p(String str, C0808e c0808e) {
        Matcher matcher = f53101b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) w1.a.e(matcher.group(1));
            String str3 = (String) w1.a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    s(str3, c0808e);
                } else if ("align".equals(str2)) {
                    c0808e.f53116d = v(str3);
                } else if ("position".equals(str2)) {
                    u(str3, c0808e);
                } else if ("size".equals(str2)) {
                    c0808e.f53122j = h.b(str3);
                } else if ("vertical".equals(str2)) {
                    c0808e.f53123k = w(str3);
                } else {
                    n.h("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                n.h("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    static SpannedString q(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                i10++;
                int iIndexOf = str2.indexOf(59, i10);
                int iIndexOf2 = str2.indexOf(32, i10);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    b(str2.substring(i10, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i10++;
            } else {
                int iF = i10 + 1;
                if (iF < str2.length()) {
                    boolean z10 = str2.charAt(iF) == '/';
                    iF = f(str2, iF);
                    int i11 = iF - 2;
                    boolean z11 = str2.charAt(i11) == '/';
                    int i12 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i11 = iF - 1;
                    }
                    String strSubstring = str2.substring(i12, i11);
                    if (!strSubstring.trim().isEmpty()) {
                        String strJ = j(strSubstring);
                        if (k(strJ)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f53107a.equals(strJ)) {
                                        break;
                                    }
                                }
                            } else if (!z11) {
                                arrayDeque.push(c.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i10 = iF;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int r(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                n.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void s(String str, C0808e c0808e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c0808e.f53119g = r(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c0808e.f53117e = h.b(str);
            c0808e.f53118f = 0;
        } else {
            c0808e.f53117e = Integer.parseInt(str);
            c0808e.f53118f = 1;
        }
    }

    private static int t(String str) {
        str.getClass();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                n.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void u(String str, C0808e c0808e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c0808e.f53121i = t(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        c0808e.f53120h = h.b(str);
    }

    private static int v(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                n.h("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int w(String str) {
        str.getClass();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        n.h("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
