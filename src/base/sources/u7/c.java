package u7;

import android.os.Build;
import bm.r;
import com.facebook.internal.e1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f54187h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f54188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EnumC0815c f54189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONArray f54190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f54191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f54192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f54193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f54194g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54195a = new a();

        private a() {
        }

        public static final c a(String str, String str2) {
            return new c(str, str2, (DefaultConstructorMarker) null);
        }

        public static final c b(Throwable th2, EnumC0815c t10) {
            s.h(t10, "t");
            return new c(th2, t10, (DefaultConstructorMarker) null);
        }

        public static final c c(JSONArray features) {
            s.h(features, "features");
            return new c(features, (DefaultConstructorMarker) null);
        }

        public static final c d(File file) {
            s.h(file, "file");
            return new c(file, (DefaultConstructorMarker) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EnumC0815c b(String str) {
            if (r.N(str, "crash_log_", false, 2, null)) {
                return EnumC0815c.CrashReport;
            }
            if (r.N(str, "shield_log_", false, 2, null)) {
                return EnumC0815c.CrashShield;
            }
            if (r.N(str, "thread_check_log_", false, 2, null)) {
                return EnumC0815c.ThreadCheck;
            }
            if (r.N(str, "analysis_log_", false, 2, null)) {
                return EnumC0815c.Analysis;
            }
            return r.N(str, "anr_log_", false, 2, null) ? EnumC0815c.AnrReport : EnumC0815c.Unknown;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: u7.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum EnumC0815c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* JADX INFO: renamed from: u7.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f54203a;

            static {
                int[] iArr = new int[EnumC0815c.values().length];
                try {
                    iArr[EnumC0815c.Analysis.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0815c.AnrReport.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC0815c.CrashReport.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC0815c.CrashShield.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC0815c.ThreadCheck.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f54203a = iArr;
            }
        }

        public final String g() {
            int i10 = a.f54203a[ordinal()];
            if (i10 == 1) {
                return "analysis_log_";
            }
            if (i10 == 2) {
                return "anr_log_";
            }
            if (i10 == 3) {
                return "crash_log_";
            }
            if (i10 != 4) {
                return i10 != 5 ? "Unknown" : "thread_check_log_";
            }
            return "shield_log_";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f54203a[ordinal()];
            if (i10 == 1) {
                return "Analysis";
            }
            if (i10 == 2) {
                return "AnrReport";
            }
            if (i10 == 3) {
                return "CrashReport";
            }
            if (i10 != 4) {
                return i10 != 5 ? "Unknown" : "ThreadCheck";
            }
            return "CrashShield";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54204a;

        static {
            int[] iArr = new int[EnumC0815c.values().length];
            try {
                iArr[EnumC0815c.Analysis.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0815c.AnrReport.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0815c.CrashReport.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0815c.CrashShield.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC0815c.ThreadCheck.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f54204a = iArr;
        }
    }

    public /* synthetic */ c(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    private final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f54190c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l10 = this.f54194g;
            if (l10 != null) {
                jSONObject.put(CampaignEx.JSON_KEY_TIMESTAMP, l10);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f54191d;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l10 = this.f54194g;
            if (l10 != null) {
                jSONObject.put(CampaignEx.JSON_KEY_TIMESTAMP, l10);
            }
            String str2 = this.f54192e;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f54193f;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            EnumC0815c enumC0815c = this.f54189b;
            if (enumC0815c != null) {
                jSONObject.put("type", enumC0815c);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject e() {
        EnumC0815c enumC0815c = this.f54189b;
        int i10 = enumC0815c == null ? -1 : d.f54204a[enumC0815c.ordinal()];
        if (i10 == 1) {
            return c();
        }
        if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            return d();
        }
        return null;
    }

    public final void a() {
        k.d(this.f54188a);
    }

    public final int b(c data) {
        s.h(data, "data");
        Long l10 = this.f54194g;
        if (l10 == null) {
            return -1;
        }
        long jLongValue = l10.longValue();
        Long l11 = data.f54194g;
        if (l11 != null) {
            return s.j(l11.longValue(), jLongValue);
        }
        return 1;
    }

    public final boolean f() {
        EnumC0815c enumC0815c = this.f54189b;
        int i10 = enumC0815c == null ? -1 : d.f54204a[enumC0815c.ordinal()];
        if (i10 == 1) {
            return (this.f54190c == null || this.f54194g == null) ? false : true;
        }
        if (i10 != 2) {
            return ((i10 != 3 && i10 != 4 && i10 != 5) || this.f54193f == null || this.f54194g == null) ? false : true;
        }
        return (this.f54193f == null || this.f54192e == null || this.f54194g == null) ? false : true;
    }

    public final void g() {
        if (f()) {
            k.t(this.f54188a, toString());
        }
    }

    public String toString() {
        JSONObject jSONObjectE = e();
        if (jSONObjectE == null) {
            String string = new JSONObject().toString();
            s.g(string, "JSONObject().toString()");
            return string;
        }
        String string2 = jSONObjectE.toString();
        s.g(string2, "params.toString()");
        return string2;
    }

    public /* synthetic */ c(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ c(Throwable th2, EnumC0815c enumC0815c, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, enumC0815c);
    }

    public /* synthetic */ c(JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONArray);
    }

    private c(JSONArray jSONArray) {
        this.f54189b = EnumC0815c.Analysis;
        this.f54194g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f54190c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.f54194g));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        s.g(string, "StringBuffer()\n         …)\n            .toString()");
        this.f54188a = string;
    }

    private c(Throwable th2, EnumC0815c enumC0815c) {
        this.f54189b = enumC0815c;
        this.f54191d = e1.w();
        this.f54192e = k.e(th2);
        this.f54193f = k.h(th2);
        this.f54194g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(enumC0815c.g());
        stringBuffer.append(String.valueOf(this.f54194g));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        s.g(string, "StringBuffer().append(t.…ppend(\".json\").toString()");
        this.f54188a = string;
    }

    private c(String str, String str2) {
        this.f54189b = EnumC0815c.AnrReport;
        this.f54191d = e1.w();
        this.f54192e = str;
        this.f54193f = str2;
        this.f54194g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.f54194g));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        s.g(string, "StringBuffer()\n         …)\n            .toString()");
        this.f54188a = string;
    }

    private c(File file) {
        String name = file.getName();
        s.g(name, "file.name");
        this.f54188a = name;
        this.f54189b = f54187h.b(name);
        JSONObject jSONObjectR = k.r(this.f54188a, true);
        if (jSONObjectR != null) {
            this.f54194g = Long.valueOf(jSONObjectR.optLong(CampaignEx.JSON_KEY_TIMESTAMP, 0L));
            this.f54191d = jSONObjectR.optString("app_version", null);
            this.f54192e = jSONObjectR.optString("reason", null);
            this.f54193f = jSONObjectR.optString("callstack", null);
            this.f54190c = jSONObjectR.optJSONArray("feature_names");
        }
    }
}
