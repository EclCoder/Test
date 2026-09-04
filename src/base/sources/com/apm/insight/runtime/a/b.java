package com.apm.insight.runtime.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f10915a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f10916b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f10917c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10918d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f10919e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f10920f = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static volatile b f10921z;
    private int B;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Application f10922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f10923h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f10929n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f10930o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f10931p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f10932q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f10933r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f10934s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f10935t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f10936u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f10937v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f10938w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f10924i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<Long> f10925j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<String> f10926k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<Long> f10927l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private LinkedList<a> f10928m = new LinkedList<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f10939x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f10940y = -1;
    private int A = 50;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f10942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f10943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f10944c;

        a(String str, String str2, long j10) {
            this.f10943b = str2;
            this.f10944c = j10;
            this.f10942a = str;
        }

        public final String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.f10944c)) + " : " + this.f10942a + ' ' + this.f10943b;
        }
    }

    private b(Application application) {
        this.f10923h = application;
        this.f10922g = application;
        if (application != null) {
            try {
                this.f10922g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        b.this.f10929n = activity.getClass().getName();
                        b.this.f10930o = System.currentTimeMillis();
                        boolean unused = b.f10916b = bundle != null;
                        boolean unused2 = b.f10917c = true;
                        b.this.f10924i.add(b.this.f10929n);
                        b.this.f10925j.add(Long.valueOf(b.this.f10930o));
                        b bVar = b.this;
                        b.a(bVar, bVar.f10929n, b.this.f10930o, "onCreate");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        String name = activity.getClass().getName();
                        int iIndexOf = b.this.f10924i.indexOf(name);
                        if (iIndexOf >= 0 && iIndexOf < b.this.f10924i.size()) {
                            b.this.f10924i.remove(iIndexOf);
                            b.this.f10925j.remove(iIndexOf);
                        }
                        b.this.f10926k.add(name);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        b.this.f10927l.add(Long.valueOf(jCurrentTimeMillis));
                        b.a(b.this, name, jCurrentTimeMillis, "onDestroy");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        b.this.f10935t = activity.getClass().getName();
                        b.this.f10936u = System.currentTimeMillis();
                        b.l(b.this);
                        if (b.this.B == 0) {
                            b.this.f10939x = false;
                            boolean unused = b.f10917c = false;
                            b.this.f10940y = SystemClock.uptimeMillis();
                        } else if (b.this.B < 0) {
                            b.n(b.this);
                            b.this.f10939x = false;
                            boolean unused2 = b.f10917c = false;
                            b.this.f10940y = SystemClock.uptimeMillis();
                        }
                        b bVar = b.this;
                        b.a(bVar, bVar.f10935t, b.this.f10936u, "onPause");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        b.this.f10933r = activity.getClass().getName();
                        b.this.f10934s = System.currentTimeMillis();
                        b.g(b.this);
                        if (!b.this.f10939x) {
                            if (b.f10915a) {
                                b.k();
                                int unused = b.f10918d = 1;
                                long unused2 = b.f10920f = b.this.f10934s;
                            }
                            if (!b.this.f10933r.equals(b.this.f10935t)) {
                                return;
                            }
                            if (b.f10917c && !b.f10916b) {
                                int unused3 = b.f10918d = 4;
                                long unused4 = b.f10920f = b.this.f10934s;
                                return;
                            } else if (!b.f10917c) {
                                int unused5 = b.f10918d = 3;
                                long unused6 = b.f10920f = b.this.f10934s;
                                return;
                            }
                        }
                        b.this.f10939x = true;
                        b bVar = b.this;
                        b.a(bVar, bVar.f10933r, b.this.f10934s, "onResume");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        b.this.f10931p = activity.getClass().getName();
                        b.this.f10932q = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f10931p, b.this.f10932q, "onStart");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        b.this.f10937v = activity.getClass().getName();
                        b.this.f10938w = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f10937v, b.this.f10938w, "onStop");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    static /* synthetic */ int g(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 + 1;
        return i10;
    }

    static /* synthetic */ int l(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 - 1;
        return i10;
    }

    static /* synthetic */ int n(b bVar) {
        bVar.B = 0;
        return 0;
    }

    static /* synthetic */ boolean k() {
        f10915a = false;
        return false;
    }

    private JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f10924i;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f10924i.size(); i10++) {
                try {
                    jSONArray.put(a(this.f10924i.get(i10), this.f10925j.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f10926k;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f10926k.size(); i10++) {
                try {
                    jSONArray.put(a(this.f10926k.get(i10), this.f10927l.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public final JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        if (com.apm.insight.e.w()) {
            try {
                jSONObject.put("last_create_activity", a(this.f10929n, this.f10930o));
                jSONObject.put("last_start_activity", a(this.f10931p, this.f10932q));
                jSONObject.put("last_resume_activity", a(this.f10933r, this.f10934s));
                jSONObject.put("last_pause_activity", a(this.f10935t, this.f10936u));
                jSONObject.put("last_stop_activity", a(this.f10937v, this.f10938w));
                jSONObject.put("alive_activities", n());
                jSONObject.put("finish_activities", o());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final String h() {
        return String.valueOf(this.f10933r);
    }

    public final JSONArray i() {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList(this.f10928m);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            jSONArray.put(((a) obj).toString());
        }
        return jSONArray;
    }

    public final boolean f() {
        return this.f10939x;
    }

    public static long c() {
        return f10920f;
    }

    public static b d() {
        if (f10921z == null) {
            synchronized (b.class) {
                try {
                    if (f10921z == null) {
                        f10921z = new b(com.apm.insight.e.h());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f10921z;
    }

    public final long e() {
        return SystemClock.uptimeMillis() - this.f10940y;
    }

    public static int b() {
        int i10 = f10918d;
        if (i10 == 1) {
            return f10919e ? 2 : 1;
        }
        return i10;
    }

    public static void a() {
        f10919e = true;
    }

    private static JSONObject a(String str, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j10);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    static /* synthetic */ void a(b bVar, String str, long j10, String str2) {
        a aVar;
        if (com.apm.insight.e.w()) {
            try {
                if (bVar.f10928m.size() >= bVar.A) {
                    aVar = bVar.f10928m.poll();
                    if (aVar != null) {
                        bVar.f10928m.add(aVar);
                    }
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    aVar = new a(str, str2, j10);
                    bVar.f10928m.add(aVar);
                }
                aVar.f10943b = str2;
                aVar.f10942a = str;
                aVar.f10944c = j10;
            } catch (Throwable unused) {
            }
        }
    }
}
