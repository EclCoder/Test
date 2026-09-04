package p3;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import com.google.common.primitives.g;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ud.qoRq.WwUgngZLNA;
import w1.c0;
import w1.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f49480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f49481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f49482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f49483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f49484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f49485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f49486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f49487j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f49490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f49491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f49492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f49493f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f49494g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f49495h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f49496i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f49497j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f49498k;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f49488a = i10;
            this.f49489b = i11;
            this.f49490c = i12;
            this.f49491d = i13;
            this.f49492e = i14;
            this.f49493f = i15;
            this.f49494g = i16;
            this.f49495h = i17;
            this.f49496i = i18;
            this.f49497j = i19;
            this.f49498k = i20;
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
        private static final Pattern f49499c = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Pattern f49500d = Pattern.compile(c0.F("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Pattern f49501e = Pattern.compile(c0.F("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Pattern f49502f = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PointF f49504b;

        private b(int i10, PointF pointF) {
            this.f49503a = i10;
            this.f49504b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f49502f.matcher(str);
            if (matcher.find()) {
                return c.e((String) w1.a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f49499c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) w1.a.e(matcher.group(1));
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
            Matcher matcher = f49500d.matcher(str);
            Matcher matcher2 = f49501e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    n.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
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
            return new PointF(Float.parseFloat(((String) w1.a.e(strGroup)).trim()), Float.parseFloat(((String) w1.a.e(strGroup2)).trim()));
        }

        public static String d(String str) {
            return f49499c.matcher(str).replaceAll(vHmGJpUTWNVV.URTi);
        }
    }

    private c(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f49478a = str;
        this.f49479b = i10;
        this.f49480c = num;
        this.f49481d = num2;
        this.f49482e = f10;
        this.f49483f = z10;
        this.f49484g = z11;
        this.f49485h = z12;
        this.f49486i = z13;
        this.f49487j = i11;
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
        n.h("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean f(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            n.i("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
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
        n.h("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            w1.a.a(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(g.d(((j10 >> 24) & 255) ^ 255), g.d(j10 & 255), g.d((j10 >> 8) & 255), g.d((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            n.i("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    private static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            n.i("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }

    public static c b(String str, a aVar) {
        w1.a.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i10 = aVar.f49498k;
        if (length != i10) {
            n.h("SsaStyle", c0.F("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f49488a].trim();
            int i11 = aVar.f49489b;
            int iE = i11 != -1 ? e(strArrSplit[i11].trim()) : -1;
            int i12 = aVar.f49490c;
            Integer numH = i12 != -1 ? h(strArrSplit[i12].trim()) : null;
            int i13 = aVar.f49491d;
            Integer numH2 = i13 != -1 ? h(strArrSplit[i13].trim()) : null;
            int i14 = aVar.f49492e;
            float fI = i14 != -1 ? i(strArrSplit[i14].trim()) : -3.4028235E38f;
            int i15 = aVar.f49493f;
            boolean z10 = false;
            boolean z11 = true;
            if (i15 != -1 && f(strArrSplit[i15].trim())) {
                z10 = true;
            }
            int i16 = aVar.f49494g;
            if (i16 == -1 || !f(strArrSplit[i16].trim())) {
                z11 = false;
            }
            int i17 = aVar.f49495h;
            if (i17 == -1 || !f(strArrSplit[i17].trim())) {
                z11 = false;
            }
            int i18 = aVar.f49496i;
            boolean z12 = i18 != -1 && f(strArrSplit[i18].trim());
            int i19 = aVar.f49497j;
            return new c(strTrim, iE, numH, numH2, fI, z10, z11, z11, z12, i19 != -1 ? g(strArrSplit[i19].trim()) : -1);
        } catch (RuntimeException e10) {
            n.i("SsaStyle", "Skipping malformed 'Style:' line: '" + str + WwUgngZLNA.eFwWhu, e10);
            return null;
        }
    }
}
