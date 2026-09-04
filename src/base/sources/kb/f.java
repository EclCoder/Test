package kb;

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
import ob.d0;
import ob.r0;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f43132a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f43133b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f43134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f43135d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator f43136c = new Comparator() { // from class: kb.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((f.b) obj).f43137a.f43140b, ((f.b) obj2).f43137a.f43140b);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f43137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f43138b;

        private b(c cVar, int i10) {
            this.f43137a = cVar;
            this.f43138b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f43140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f43141c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set f43142d;

        private c(String str, int i10, String str2, Set set) {
            this.f43140b = i10;
            this.f43139a = str;
            this.f43141c = str2;
            this.f43142d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String strTrim = str.trim();
            ob.a.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrY0 = r0.Y0(strTrim, "\\.");
            String str3 = strArrY0[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < strArrY0.length; i11++) {
                hashSet.add(strArrY0[i11]);
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
        public final int f43143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final kb.d f43144b;

        public d(int i10, kb.d dVar) {
            this.f43143a = i10;
            this.f43144b = dVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f43143a, dVar.f43143a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f43147c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f43145a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f43146b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f43148d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f43149e = -3.4028235E38f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f43150f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f43151g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f43152h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f43153i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f43154j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f43155k = Integer.MIN_VALUE;

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
                            u.i("WebvttCueParser", "Unknown textAlignment: " + i10);
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

        public kb.e a() {
            return new kb.e(g().a(), this.f43145a, this.f43146b);
        }

        public bb.b.C0112b g() {
            float fE = this.f43152h;
            if (fE == -3.4028235E38f) {
                fE = e(this.f43148d);
            }
            int iF = this.f43153i;
            if (iF == Integer.MIN_VALUE) {
                iF = f(this.f43148d);
            }
            bb.b.C0112b c0112bR = new bb.b.C0112b().p(c(this.f43148d)).h(b(this.f43149e, this.f43150f), this.f43150f).i(this.f43151g).k(fE).l(iF).n(Math.min(this.f43154j, d(iF, fE))).r(this.f43155k);
            CharSequence charSequence = this.f43147c;
            if (charSequence != null) {
                c0112bR.o(charSequence);
            }
            return c0112bR;
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
        f43134c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f43135d = Collections.unmodifiableMap(map2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set set, int i10, int i11) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = f43134c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i10, i11, 33);
            } else {
                Map map2 = f43135d;
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
                u.i("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List list, List list2) {
        int i10 = i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f43136c);
        int i11 = cVar.f43140b;
        int length = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if ("rt".equals(((b) arrayList.get(i12)).f43137a.f43139a)) {
                b bVar = (b) arrayList.get(i12);
                int iG = g(i(list2, str, bVar.f43137a), i10, 1);
                int i13 = bVar.f43137a.f43140b - length;
                int i14 = bVar.f43138b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i13, i14);
                spannableStringBuilder.delete(i13, i14);
                spannableStringBuilder.setSpan(new fb.c(charSequenceSubSequence.toString(), iG), i11, i13, 33);
                length += charSequenceSubSequence.length();
                i11 = i13;
            }
        }
    }

    private static void d(String str, c cVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i10 = cVar.f43140b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f43139a;
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
                a(spannableStringBuilder, cVar.f43142d, i10, length);
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
            e(spannableStringBuilder, ((d) listH.get(i11)).f43144b, i10, length);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, kb.d dVar, int i10, int i11) {
        if (dVar == null) {
            return;
        }
        if (dVar.i() != -1) {
            fb.d.a(spannableStringBuilder, new StyleSpan(dVar.i()), i10, i11, 33);
        }
        if (dVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (dVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (dVar.k()) {
            fb.d.a(spannableStringBuilder, new ForegroundColorSpan(dVar.c()), i10, i11, 33);
        }
        if (dVar.j()) {
            fb.d.a(spannableStringBuilder, new BackgroundColorSpan(dVar.a()), i10, i11, 33);
        }
        if (dVar.d() != null) {
            fb.d.a(spannableStringBuilder, new TypefaceSpan(dVar.d()), i10, i11, 33);
        }
        int iF = dVar.f();
        if (iF == 1) {
            fb.d.a(spannableStringBuilder, new AbsoluteSizeSpan((int) dVar.e(), true), i10, i11, 33);
        } else if (iF == 2) {
            fb.d.a(spannableStringBuilder, new RelativeSizeSpan(dVar.e()), i10, i11, 33);
        } else if (iF == 3) {
            fb.d.a(spannableStringBuilder, new RelativeSizeSpan(dVar.e() / 100.0f), i10, i11, 33);
        }
        if (dVar.b()) {
            spannableStringBuilder.setSpan(new fb.a(), i10, i11, 33);
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
            kb.d dVar = (kb.d) list.get(i10);
            int iH = dVar.h(str, cVar.f43139a, cVar.f43142d, cVar.f43141c);
            if (iH > 0) {
                arrayList.add(new d(iH, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int i(List list, String str, c cVar) {
        List listH = h(list, str, cVar);
        for (int i10 = 0; i10 < listH.size(); i10++) {
            kb.d dVar = ((d) listH.get(i10)).f43144b;
            if (dVar.g() != -1) {
                return dVar.g();
            }
        }
        return -1;
    }

    private static String j(String str) {
        String strTrim = str.trim();
        ob.a.a(!strTrim.isEmpty());
        return r0.Z0(strTrim, "[ \\.]")[0];
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

    static bb.b l(CharSequence charSequence) {
        e eVar = new e();
        eVar.f43147c = charSequence;
        return eVar.g().a();
    }

    private static kb.e m(String str, Matcher matcher, d0 d0Var, List list) {
        e eVar = new e();
        try {
            eVar.f43145a = i.d((String) ob.a.e(matcher.group(1)));
            eVar.f43146b = i.d((String) ob.a.e(matcher.group(2)));
            p((String) ob.a.e(matcher.group(3)), eVar);
            StringBuilder sb2 = new StringBuilder();
            String strS = d0Var.s();
            while (!TextUtils.isEmpty(strS)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strS.trim());
                strS = d0Var.s();
            }
            eVar.f43147c = q(str, sb2.toString(), list);
            return eVar.a();
        } catch (NumberFormatException unused) {
            u.i("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static kb.e n(d0 d0Var, List list) {
        String strS = d0Var.s();
        if (strS == null) {
            return null;
        }
        Pattern pattern = f43132a;
        Matcher matcher = pattern.matcher(strS);
        if (matcher.matches()) {
            return m(null, matcher, d0Var, list);
        }
        String strS2 = d0Var.s();
        if (strS2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strS2);
        if (matcher2.matches()) {
            return m(strS.trim(), matcher2, d0Var, list);
        }
        return null;
    }

    static bb.b.C0112b o(String str) {
        e eVar = new e();
        p(str, eVar);
        return eVar.g();
    }

    private static void p(String str, e eVar) {
        Matcher matcher = f43133b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) ob.a.e(matcher.group(1));
            String str3 = (String) ob.a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f43148d = v(str3);
                } else if ("position".equals(str2)) {
                    u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f43154j = i.c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f43155k = w(str3);
                } else {
                    u.i("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                u.i("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
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
                                    if (cVar.f43139a.equals(strJ)) {
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
                u.i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void s(String str, e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            eVar.f43151g = r(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            eVar.f43149e = i.c(str);
            eVar.f43150f = 0;
        } else {
            eVar.f43149e = Integer.parseInt(str);
            eVar.f43150f = 1;
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
                u.i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void u(String str, e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            eVar.f43153i = t(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        eVar.f43152h = i.c(str);
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
                u.i("WebvttCueParser", "Invalid alignment value: " + str);
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
        u.i("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
