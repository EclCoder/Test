package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.pgl.ssdk.a5;
import com.pgl.ssdk.aa;
import com.pgl.ssdk.ab;
import com.pgl.ssdk.ac;
import com.pgl.ssdk.ad;
import com.pgl.ssdk.ae;
import com.pgl.ssdk.af;
import com.pgl.ssdk.ag;
import com.pgl.ssdk.ah;
import com.pgl.ssdk.ai;
import com.pgl.ssdk.aj;
import com.pgl.ssdk.ak;
import com.pgl.ssdk.al;
import com.pgl.ssdk.am;
import com.pgl.ssdk.an;
import com.pgl.ssdk.ao;
import com.pgl.ssdk.ar;
import com.pgl.ssdk.aw;
import com.pgl.ssdk.ax;
import com.pgl.ssdk.ay;
import com.pgl.ssdk.az;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.f;
import com.pgl.ssdk.u;
import com.pgl.ssdk.v;
import com.pgl.ssdk.w;
import com.pgl.ssdk.x;
import com.pgl.ssdk.y;
import com.pgl.ssdk.z;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f35354a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f35355b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, Object> f35356c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f35357d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static aw.a f35358e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f35360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f35361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f35363j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f35366m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35359f = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f35364k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f35365l = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f35367n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35368o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35369p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f35370q = true;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.c();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.pgl.ssdk.ces.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0485b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35372a;

        RunnableC0485b(String str) {
            this.f35372a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!TextUtils.isEmpty(this.f35372a) && this.f35372a.equals("AdShow")) {
                ab.b(b.this.f35360g);
            }
            al.a(b.this.f35360g).a();
            aa.b(b.this.f35360g);
        }
    }

    private b(Context context, String str) {
        this.f35360g = context;
        this.f35361h = str;
    }

    public static b a(Context context, String str, int i10, int i11, String str2) {
        if (f35354a == null) {
            synchronized (b.class) {
                try {
                    if (f35354a == null) {
                        if (context == null) {
                            context = ab.a().getApplicationContext();
                        }
                        if (context == null) {
                            f35357d = 4;
                            return null;
                        }
                        a(i10);
                        aw.a aVarB = aw.b(context, "nms");
                        if (aVarB != null) {
                            f35357d = aVarB.f35351a;
                            f35358e = aVarB;
                            return null;
                        }
                        b bVar = new b(context, str);
                        f35354a = bVar;
                        bVar.f35362i = i11;
                        f35354a.f35363j = str2;
                        f35354a.b(context);
                        f35354a.e(a(context));
                        z.a(context);
                        f35357d = 0;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f35354a;
    }

    public static String b() {
        if (e() != null) {
            return e().f35364k;
        }
        return null;
    }

    public static String c() {
        b bVarE = e();
        if (bVarE == null || TextUtils.isEmpty(bVarE.f35365l)) {
            return null;
        }
        return bVarE.f35365l;
    }

    public static int d() {
        return f35357d;
    }

    public static b e() {
        return f35354a;
    }

    public static aw.a f() {
        return f35358e;
    }

    public String g() {
        return a5.a();
    }

    public void h() {
        this.f35367n = true;
        a5.a(this.f35360g, this.f35361h);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (az.a(ax.a(this.f35360g, "pgl_init_report", 0L), jCurrentTimeMillis)) {
            int i10 = f35354a.f35369p;
            if ((i10 > 0 && i10 < 100 && Math.random() * 100.0d < i10) || i10 == 100) {
                a("Start", (Map<String, Object>) null);
            }
        } else {
            a("Start", (Map<String, Object>) null);
            ax.b(this.f35360g, "pgl_init_report", jCurrentTimeMillis);
        }
        a("Start");
        if (this.f35370q) {
            ar.a(new a(), 20000L);
        }
    }

    private void b(Context context) {
        if (context == null || f35355b) {
            return;
        }
        try {
            com.pgl.ssdk.ces.a.meta(101, null, "1");
            com.pgl.ssdk.ces.a.meta(102, null, this.f35361h);
            com.pgl.ssdk.ces.a.meta(Sdk$SDKError.b.ASSET_WRITE_ERROR_VALUE, null, Integer.valueOf(this.f35362i));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ab.h(context));
            com.pgl.ssdk.ces.a.meta(105, null, sb2.toString());
            com.pgl.ssdk.ces.a.meta(152, null, ab.i(context));
            com.pgl.ssdk.ces.a.meta(153, null, ab.d(context));
            com.pgl.ssdk.ces.a.meta(106, null, ab.f(context));
            com.pgl.ssdk.ces.a.meta(107, null, ab.e(context));
            com.pgl.ssdk.ces.a.meta(108, null, ab.c(context));
            com.pgl.ssdk.ces.a.meta(109, null, ab.d());
            com.pgl.ssdk.ces.a.meta(110, null, ab.c());
            com.pgl.ssdk.ces.a.meta(Sdk$SDKError.b.INVALID_INDEX_URL_VALUE, null, this.f35363j);
            f35355b = true;
        } catch (Throwable unused) {
        }
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f35366m = str;
        com.pgl.ssdk.ces.a.meta(104, null, str);
    }

    public synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f35365l)) {
            com.pgl.ssdk.ces.a.meta(111, null, str);
            this.f35365l = str;
            a5.b();
        }
    }

    public synchronized void c(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f35364k)) {
            this.f35364k = str;
            com.pgl.ssdk.ces.a.meta(103, null, str);
            a5.b();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void b(String str) {
        int iIntValue;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                switch (next.hashCode()) {
                    case -417749689:
                        if (next.equals("touch_trace_enabled") && (obj instanceof Boolean)) {
                            y.f35431g = ((Boolean) obj).booleanValue();
                        }
                        break;
                    case -257777372:
                        if (next.equals("init_prob") && (obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue()) >= 0 && iIntValue <= 100) {
                            this.f35369p = iIntValue;
                        }
                        break;
                    case -93508180:
                        if (next.equals("autoctl_detect_enable") && (obj instanceof Boolean)) {
                            ak.f35302b = ((Boolean) obj).booleanValue();
                        }
                        break;
                    case 449342513:
                        if (next.equals("craw_ratio") && (obj instanceof Integer) && ((Integer) obj).intValue() > 0) {
                            f.f35394b = ((Integer) obj).intValue();
                        }
                        break;
                    case 944591168:
                        if (next.equals("report_ratio") && (obj instanceof Integer) && ((Integer) obj).intValue() > 0) {
                            this.f35368o = ((Integer) obj).intValue();
                        }
                        break;
                    case 1286849298:
                        if (next.equals("app_switch") && (obj instanceof Boolean)) {
                            this.f35370q = ((Boolean) obj).booleanValue();
                        }
                        break;
                }
            }
        } catch (JSONException unused) {
        }
    }

    private static String a(Context context) {
        String strA = ax.a(context, "iid");
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String string = UUID.randomUUID().toString();
        ax.b(context, "iid", string);
        return string;
    }

    public static void a(int i10) {
        an.a(i10);
    }

    public static String a() {
        if (e() != null) {
            return e().f35361h;
        }
        return null;
    }

    public void a(String str, String str2, String str3, String str4) {
        c(str2);
        d(str4);
        try {
            h();
        } catch (Throwable unused) {
        }
    }

    public Map<String, String> a(String str, byte[] bArr) {
        HashMap map = new HashMap();
        if (str == null) {
            str = "";
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        String str2 = (String) com.pgl.ssdk.ces.a.meta(224, this.f35360g, new Object[]{str, bArr});
        if (!TextUtils.isEmpty(str2)) {
            map.put("X-Armors", str2);
        }
        return map;
    }

    public void a(String str, Map<String, Object> map) {
        try {
            ar.a(new ao(this.f35360g, Sdk$SDKError.b.INVALID_WATERFALL_PLACEMENT_ID_VALUE, new Object[]{str, map}), "Start".equals(str) ? 10000L : 0L);
        } catch (Throwable unused) {
        }
    }

    public Object a(int i10, Object obj) {
        if (i10 == 123) {
            return af.a(this.f35360g);
        }
        if (i10 == 121) {
            return ad.a();
        }
        if (i10 == 122) {
            return ad.b();
        }
        if (i10 == 126) {
            return ad.b(this.f35360g);
        }
        if (i10 == 128) {
            return ad.c(this.f35360g);
        }
        if (i10 == 120) {
            return ac.c();
        }
        if (i10 == 124) {
            return ag.c(this.f35360g);
        }
        if (i10 == 130) {
            return ag.a(this.f35360g);
        }
        if (i10 == 145) {
            return ah.c(this.f35360g);
        }
        if (i10 == 125) {
            return ag.b(this.f35360g);
        }
        if (i10 == 129) {
            return ae.f(this.f35360g);
        }
        if (i10 == 141) {
            return ae.e(this.f35360g);
        }
        if (i10 == 134) {
            return ak.a(this.f35360g).b();
        }
        if (i10 == 140) {
            return al.a(this.f35360g).e();
        }
        if (i10 == 144) {
            return al.a(this.f35360g).d();
        }
        if (i10 == 133) {
            return a(obj);
        }
        if (i10 == 135) {
            return v.e();
        }
        if (i10 == 201) {
            return ad.a(this.f35360g);
        }
        if (i10 == 202) {
            return ad.c();
        }
        if (i10 == 236) {
            return ay.a((String) obj);
        }
        if (i10 == 142) {
            return ab.g(this.f35360g);
        }
        if (i10 == 143) {
            return ah.a(this.f35360g);
        }
        if (i10 == 146) {
            try {
                return v.b();
            } catch (Throwable unused) {
                return null;
            }
        }
        if (i10 == 147) {
            return Boolean.valueOf(ab.j(this.f35360g));
        }
        if (i10 == 148) {
            return u.b(this.f35360g);
        }
        if (i10 == 149) {
            return w.a(this.f35360g);
        }
        if (i10 == 150) {
            return Integer.valueOf(x.a());
        }
        if (i10 == 151) {
            return w.c();
        }
        if (i10 == 161) {
            return Boolean.valueOf(v.f());
        }
        if (i10 == 163) {
            return aj.a();
        }
        if (i10 == 169) {
            return Boolean.valueOf(aa.a(this.f35360g));
        }
        if (i10 == 170) {
            return Integer.valueOf(y.b((String) obj));
        }
        if (i10 == 203) {
            return ab.b();
        }
        if (i10 == 205) {
            return Integer.valueOf(ab.k(this.f35360g));
        }
        if (i10 == 204) {
            return Integer.valueOf(ae.a(this.f35360g));
        }
        if (i10 == 206) {
            return ah.b(this.f35360g);
        }
        return null;
    }

    public void a(MotionEvent motionEvent) {
        y.a(motionEvent, this.f35360g);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    try {
                        for (String str : map.keySet()) {
                            Object obj = map.get(str);
                            if (obj != null) {
                                switch (str.hashCode()) {
                                    case -2021683300:
                                        if (!str.equals(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST)) {
                                            continue;
                                        } else if (obj instanceof String) {
                                            an.a((String) obj);
                                        }
                                        break;
                                    case -1195280656:
                                        if (!str.equals(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR)) {
                                            continue;
                                        } else if (obj instanceof String) {
                                            b((String) obj);
                                        }
                                        break;
                                    case 156851746:
                                        if (!str.equals(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS)) {
                                            continue;
                                        } else if (obj instanceof Set) {
                                            Set set = (Set) obj;
                                            com.pgl.ssdk.ces.a.meta(165, null, Boolean.valueOf(set.contains("boot")));
                                            com.pgl.ssdk.ces.a.meta(166, null, Boolean.valueOf(set.contains("mnc")));
                                            com.pgl.ssdk.ces.a.meta(167, null, Boolean.valueOf(set.contains("mcc")));
                                        }
                                        break;
                                    case 398905722:
                                        if (!str.equals(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ)) {
                                            continue;
                                        } else if (obj instanceof String) {
                                            String strA = ai.a((String) obj);
                                            if (!TextUtils.isEmpty(strA)) {
                                                com.pgl.ssdk.ces.a.meta(159, null, strA);
                                            }
                                        }
                                        break;
                                    case 485444716:
                                        if (!str.equals(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC)) {
                                            continue;
                                        } else if (obj instanceof String) {
                                            an.b((String) obj);
                                        }
                                        break;
                                    case 500804551:
                                        if (!str.equals(PglSSConfig.CUSTOMINFO_KEY_IPV6)) {
                                            continue;
                                        } else if (obj instanceof String) {
                                            String str2 = (String) obj;
                                            if (!TextUtils.isEmpty(str2)) {
                                                am.a(str2);
                                            }
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                throw th;
                            }
                        }
                        if (f35356c == null) {
                            f35356c = new HashMap();
                        }
                        f35356c.putAll(map);
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private String a(Object obj) {
        Map<String, Object> map;
        if (!(obj instanceof String) || !"Start".equals((String) obj) || (map = f35356c) == null || map.isEmpty()) {
            return "{}";
        }
        try {
            return new JSONObject(f35356c).toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public void a(String str) {
        ar.b(new RunnableC0485b(str));
    }
}
