package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile String f33736o = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f33738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f33739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x f33740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f33741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f33742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f33743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile c f33744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile l f33745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile d f33746j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile j f33747k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile s f33748l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f33749m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile o f33750n;

    k(String str, m mVar) {
        this.f33737a = str;
        this.f33738b = mVar;
    }

    void a(Context context) {
        this.f33739c = context;
    }

    x b() {
        x xVar = this.f33740d;
        if (xVar != null) {
            return xVar;
        }
        x xVarA = new x.b().a();
        this.f33740d = xVarA;
        return xVarA;
    }

    Context c() {
        return this.f33739c;
    }

    c d() {
        if (y.b(this.f33744h)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f33744h)) {
                        String strT = t();
                        this.f33744h = new c(new b(c(), e(), strT), strT);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f33744h;
    }

    String e() {
        return TextUtils.isEmpty(v()) ? String.format("track_manager_%s.db", "default") : String.format("track_manager_%s.db", v());
    }

    d f() {
        if (y.b(this.f33746j)) {
            this.f33746j = b().f33954h;
        }
        return this.f33746j;
    }

    l g() {
        if (y.b(this.f33745i)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f33745i)) {
                        this.f33745i = new q(new g(d(), p()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f33745i;
    }

    j h() {
        if (y.b(this.f33747k)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f33747k)) {
                        this.f33747k = new j();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f33747k;
    }

    int i() {
        if (b().f33947a < 0) {
            return 50;
        }
        return b().f33947a;
    }

    int j() {
        return Math.max(b().f33951e, 0);
    }

    int k() {
        if (b().f33950d <= 0) {
            return 2;
        }
        return b().f33950d;
    }

    int l() {
        return Math.max(b().f33948b, 0);
    }

    o m() {
        if (y.b(this.f33750n)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f33750n)) {
                        this.f33750n = new o(k(), n(), r(), q());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f33750n;
    }

    p n() {
        return b().f33953g;
    }

    JSONObject o() {
        JSONObject jSONObject = this.f33741e;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f33741e = jSONObject2;
        return jSONObject2;
    }

    s p() {
        if (y.b(this.f33748l)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f33748l)) {
                        this.f33748l = new s(this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f33748l;
    }

    int q() {
        return b().f33949c;
    }

    w r() {
        return b().f33955i;
    }

    String s() {
        if (!TextUtils.isEmpty(f33736o)) {
            return f33736o;
        }
        String string = UUID.randomUUID().toString();
        f33736o = string;
        return string;
    }

    String t() {
        return "event_table";
    }

    m u() {
        return this.f33738b;
    }

    String v() {
        return this.f33737a;
    }

    boolean w() {
        return this.f33749m;
    }

    String x() {
        if (!y.b(this.f33739c) && !y.b(this.f33740d)) {
            try {
                p().j();
                this.f33749m = false;
                if (TextUtils.isEmpty(f33736o)) {
                    f33736o = UUID.randomUUID().toString();
                }
                return f33736o;
            } catch (Exception e10) {
                if (a.f33703a) {
                    Log.e("TrackManager", "start error", e10);
                }
                this.f33749m = true;
            }
        }
        return "";
    }

    void a(x xVar) {
        this.f33740d = xVar;
    }

    void a(JSONObject jSONObject) {
        this.f33741e = jSONObject;
    }

    boolean a(e eVar) {
        if (y.b(eVar)) {
            return false;
        }
        f fVar = b().f33956j;
        if (y.a(fVar)) {
            try {
                return fVar.a(eVar);
            } catch (Exception e10) {
                if (a.f33703a) {
                    Log.e("TrackManager", "event filter apply exception", e10);
                }
            }
        }
        String strG = eVar.g();
        if (TextUtils.isEmpty(strG)) {
            return false;
        }
        List<String> list = this.f33743g;
        if (list != null) {
            try {
                return !list.contains(strG);
            } catch (Exception e11) {
                if (a.f33703a) {
                    Log.e("TrackManager", "disallowTrackEventNames contains exception", e11);
                }
            }
        }
        List<String> list2 = this.f33742f;
        if (list2 != null) {
            try {
                return list2.contains(strG);
            } catch (Exception e12) {
                if (a.f33703a) {
                    Log.e("TrackManager", "allowTrackEventNames contains exception", e12);
                }
            }
        }
        return true;
    }

    boolean a() {
        if (!y.b(b())) {
            if (!y.b(f())) {
                if (!y.b(r())) {
                    if (!y.b(n()) && !y.b(n().b())) {
                        if (TextUtils.isEmpty(n().c())) {
                            throw new IllegalStateException("report url is null");
                        }
                        return true;
                    }
                    throw new IllegalStateException("networkStackConfig or stack can not be null");
                }
                throw new IllegalStateException("responseHandler can not be null");
            }
            throw new IllegalStateException("decorate can not be null");
        }
        throw new IllegalStateException("config can not be null");
    }
}
