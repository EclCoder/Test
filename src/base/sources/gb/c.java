package gb;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.google.common.primitives.g;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ob.r0;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f39051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f39052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f39054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f39055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f39056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f39057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f39058j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f39061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f39062d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f39063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f39064f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f39065g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f39066h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f39067i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f39068j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f39069k;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f39059a = i10;
            this.f39060b = i11;
            this.f39061c = i12;
            this.f39062d = i13;
            this.f39063e = i14;
            this.f39064f = i15;
            this.f39065g = i16;
            this.f39066h = i17;
            this.f39067i = i18;
            this.f39068j = i19;
            this.f39069k = i20;
        }

        public static a a(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            for (int i20 = 0; i20 < strArrSplit.length; i20++) {
                String strE = sc.c.e(strArrSplit[i20].trim());
                strE.getClass();
                switch (strE) {
                    case "italic":
                        i16 = i20;
                        break;
                    case "underline":
                        i17 = i20;
                        break;
                    case "strikeout":
                        i18 = i20;
                        break;
                    case "primarycolour":
                        i12 = i20;
                        break;
                    case "bold":
                        i15 = i20;
                        break;
                    case "name":
                        i10 = i20;
                        break;
                    case "fontsize":
                        i14 = i20;
                        break;
                    case "borderstyle":
                        i19 = i20;
                        break;
                    case "alignment":
                        i11 = i20;
                        break;
                    case "outlinecolour":
                        i13 = i20;
                        break;
                }
            }
            if (i10 != -1) {
                return new a(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, strArrSplit.length);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Pattern f39070c = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Pattern f39071d = Pattern.compile(r0.D("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Pattern f39072e = Pattern.compile(r0.D("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Pattern f39073f = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PointF f39075b;

        private b(int i10, PointF pointF) {
            this.f39074a = i10;
            this.f39075b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f39073f.matcher(str);
            if (matcher.find()) {
                return c.e((String) ob.a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f39070c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) ob.a.e(matcher.group(1));
                try {
                    PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(str2);
                    if (iA != -1) {
                        i10 = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        private static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f39071d.matcher(str);
            Matcher matcher2 = f39072e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    u.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) ob.a.e(strGroup)).trim()), Float.parseFloat(((String) ob.a.e(strGroup2)).trim()));
        }

        public static String d(String str) {
            return f39070c.matcher(str).replaceAll("");
        }
    }

    private c(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f39049a = str;
        this.f39050b = i10;
        this.f39051c = num;
        this.f39052d = num2;
        this.f39053e = f10;
        this.f39054f = z10;
        this.f39055g = z11;
        this.f39056h = z12;
        this.f39057i = z13;
        this.f39058j = i11;
    }

    public static c b(String str, a aVar) {
        ob.a.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i10 = aVar.f39069k;
        if (length != i10) {
            u.i("SsaStyle", r0.D("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f39059a].trim();
            int i11 = aVar.f39060b;
            int iE = i11 != -1 ? e(strArrSplit[i11].trim()) : -1;
            int i12 = aVar.f39061c;
            Integer numH = i12 != -1 ? h(strArrSplit[i12].trim()) : null;
            int i13 = aVar.f39062d;
            Integer numH2 = i13 != -1 ? h(strArrSplit[i13].trim()) : null;
            int i14 = aVar.f39063e;
            float fI = i14 != -1 ? i(strArrSplit[i14].trim()) : -3.4028235E38f;
            int i15 = aVar.f39064f;
            boolean z10 = false;
            boolean z11 = true;
            if (i15 != -1 && f(strArrSplit[i15].trim())) {
                z10 = true;
            }
            int i16 = aVar.f39065g;
            if (i16 == -1 || !f(strArrSplit[i16].trim())) {
                z11 = false;
            }
            int i17 = aVar.f39066h;
            if (i17 == -1 || !f(strArrSplit[i17].trim())) {
                z11 = false;
            }
            int i18 = aVar.f39067i;
            boolean z12 = i18 != -1 && f(strArrSplit[i18].trim());
            int i19 = aVar.f39068j;
            return new c(strTrim, iE, numH, numH2, fI, z10, z11, z11, z12, i19 != -1 ? g(strArrSplit[i19].trim()) : -1);
        } catch (RuntimeException e10) {
            u.j("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    private static boolean c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean d(int i10) {
        return i10 == 1 || i10 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (c(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        u.i("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean f(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            u.j("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    private static int g(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (d(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        u.i("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            ob.a.a(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(g.d(((j10 >> 24) & 255) ^ 255), g.d(j10 & 255), g.d((j10 >> 8) & 255), g.d((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            u.j("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    private static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            u.j("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }
}
