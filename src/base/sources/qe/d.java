package qe;

import android.os.Build;
import android.util.Log;
import fl.g0;
import fl.q;
import fl.s;
import fl.w;
import gl.l0;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ne.t;
import ne.x0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f50644g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f50645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final bm.o f50646i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x0 f50647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final de.e f50648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ne.b f50649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qe.a f50650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f50651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nm.a f50652f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.f50645h;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f50653r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f50654s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f50656u;

        b(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f50654s = obj;
            this.f50656u |= Integer.MIN_VALUE;
            return d.this.c(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f50657r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f50658s;

        c(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, kl.f fVar) {
            return ((c) create(jSONObject, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            c cVar = d.this.new c(fVar);
            cVar.f50658s = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:48:0x00f0 A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            Boolean bool;
            Double d10;
            Integer num;
            l lVar;
            int iA;
            SessionConfigs sessionConfigs;
            Integer num2;
            Double d11;
            Object obj2;
            Object objF = ll.b.f();
            int i10 = this.f50657r;
            if (i10 == 0) {
                s.b(obj);
                JSONObject jSONObject = (JSONObject) this.f50658s;
                Log.d("FirebaseSessions", "Fetched settings: " + jSONObject);
                Integer num3 = 0;
                Integer num4 = null;
                Boolean bool2 = null;
                if (jSONObject.has("app_quality")) {
                    Object obj3 = jSONObject.get("app_quality");
                    kotlin.jvm.internal.s.f(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject2 = (JSONObject) obj3;
                    try {
                        Boolean bool3 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                        try {
                            d11 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                            try {
                                num2 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                                try {
                                    num4 = jSONObject2.has("cache_duration") ? (Integer) jSONObject2.get("cache_duration") : null;
                                    g0 g0Var = g0.f38750a;
                                    num = num2;
                                    d10 = d11;
                                    bool = bool3;
                                    num3 = num4;
                                } catch (JSONException e10) {
                                    e = e10;
                                    Integer num5 = num4;
                                    bool2 = bool3;
                                    obj2 = num5;
                                    kotlin.coroutines.jvm.internal.b.d(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                                    num = num2;
                                    d10 = d11;
                                    bool = bool2;
                                    num3 = obj2;
                                }
                            } catch (JSONException e11) {
                                e = e11;
                                num2 = null;
                                bool2 = bool3;
                                obj2 = null;
                            }
                        } catch (JSONException e12) {
                            e = e12;
                            num2 = null;
                            d11 = null;
                            bool2 = bool3;
                            obj2 = d11;
                            kotlin.coroutines.jvm.internal.b.d(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                            num = num2;
                            d10 = d11;
                            bool = bool2;
                            num3 = obj2;
                            lVar = d.this.f50651e;
                            if (num3 != 0) {
                                iA = num3.intValue();
                            } else {
                                iA = d.f50644g.a();
                            }
                            sessionConfigs = new SessionConfigs(bool, d10, num, kotlin.coroutines.jvm.internal.b.d(iA), kotlin.coroutines.jvm.internal.b.e(d.this.f50647a.a().getSeconds()));
                            this.f50657r = 1;
                            if (lVar.d(sessionConfigs, this) == objF) {
                                return objF;
                            }
                            return g0.f38750a;
                        }
                    } catch (JSONException e13) {
                        e = e13;
                        num2 = null;
                        d11 = null;
                    }
                } else {
                    bool = null;
                    d10 = null;
                    num = null;
                }
                lVar = d.this.f50651e;
                if (num3 != 0) {
                    iA = num3.intValue();
                } else {
                    iA = d.f50644g.a();
                }
                sessionConfigs = new SessionConfigs(bool, d10, num, kotlin.coroutines.jvm.internal.b.d(iA), kotlin.coroutines.jvm.internal.b.e(d.this.f50647a.a().getSeconds()));
                this.f50657r = 1;
                if (lVar.d(sessionConfigs, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return g0.f38750a;
        }
    }

    /* JADX INFO: renamed from: qe.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0781d extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f50660r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f50661s;

        C0781d(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, kl.f fVar) {
            return ((C0781d) create(str, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            C0781d c0781d = new C0781d(fVar);
            c0781d.f50661s = obj;
            return c0781d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f50660r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f50661s));
            return g0.f38750a;
        }
    }

    static {
        cm.a.C0139a c0139a = cm.a.f10121b;
        f50645h = (int) cm.a.o(cm.c.s(24, cm.d.HOURS));
        f50646i = new bm.o("com/google/firebase/sessions//");
    }

    public d(x0 timeProvider, de.e firebaseInstallationsApi, ne.b appInfo, qe.a configsFetcher, l settingsCache) {
        kotlin.jvm.internal.s.h(timeProvider, "timeProvider");
        kotlin.jvm.internal.s.h(firebaseInstallationsApi, "firebaseInstallationsApi");
        kotlin.jvm.internal.s.h(appInfo, "appInfo");
        kotlin.jvm.internal.s.h(configsFetcher, "configsFetcher");
        kotlin.jvm.internal.s.h(settingsCache, "settingsCache");
        this.f50647a = timeProvider;
        this.f50648b = firebaseInstallationsApi;
        this.f50649c = appInfo;
        this.f50650d = configsFetcher;
        this.f50651e = settingsCache;
        this.f50652f = nm.g.b(false, 1, null);
    }

    private final String i(String str) {
        return f50646i.i(str, "");
    }

    @Override // qe.o
    public Boolean a() {
        return this.f50651e.c();
    }

    @Override // qe.o
    public cm.a b() {
        Integer numE = this.f50651e.e();
        if (numE == null) {
            return null;
        }
        cm.a.C0139a c0139a = cm.a.f10121b;
        return cm.a.e(cm.c.s(numE.intValue(), cm.d.SECONDS));
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b5 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #1 {all -> 0x004a, blocks: (B:21:0x0046, B:46:0x00a7, B:48:0x00b5, B:51:0x00c0), top: B:62:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c0 A[Catch: all -> 0x004a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x004a, blocks: (B:21:0x0046, B:46:0x00a7, B:48:0x00b5, B:51:0x00c0), top: B:62:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0135  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00c0, please report this as an issue */
    @Override // qe.o
    public Object c(kl.f fVar) throws Throwable {
        b bVar;
        nm.a aVar;
        nm.a aVar2;
        Throwable th2;
        nm.a aVar3;
        String strB;
        Map mapL;
        qe.a aVar4;
        c cVar;
        C0781d c0781d;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f50656u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f50656u = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar);
            }
        } else {
            bVar = new b(fVar);
        }
        Object obj = bVar.f50654s;
        Object objF = ll.b.f();
        int i11 = bVar.f50656u;
        try {
            if (i11 == 0) {
                s.b(obj);
                if (!this.f50652f.d() && !this.f50651e.b()) {
                    return g0.f38750a;
                }
                aVar = this.f50652f;
                bVar.f50653r = aVar;
                bVar.f50656u = 1;
                if (aVar.e(null, bVar) != objF) {
                }
                return objF;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (nm.a) bVar.f50653r;
                    try {
                        s.b(obj);
                        g0 g0Var = g0.f38750a;
                        aVar2.f(null);
                        return g0.f38750a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar2.f(null);
                        throw th2;
                    }
                }
                aVar3 = (nm.a) bVar.f50653r;
                try {
                    s.b(obj);
                    strB = ((t) obj).b();
                    if (kotlin.jvm.internal.s.c(strB, "")) {
                        Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                        g0 g0Var2 = g0.f38750a;
                        aVar3.f(null);
                        return g0Var2;
                    }
                    q qVarA = w.a("X-Crashlytics-Installation-ID", strB);
                    q qVarA2 = w.a("X-Crashlytics-Device-Model", i(Build.MANUFACTURER + Build.MODEL));
                    String INCREMENTAL = Build.VERSION.INCREMENTAL;
                    kotlin.jvm.internal.s.g(INCREMENTAL, "INCREMENTAL");
                    q qVarA3 = w.a("X-Crashlytics-OS-Build-Version", i(INCREMENTAL));
                    String RELEASE = Build.VERSION.RELEASE;
                    kotlin.jvm.internal.s.g(RELEASE, "RELEASE");
                    mapL = l0.l(qVarA, qVarA2, qVarA3, w.a("X-Crashlytics-OS-Display-Version", i(RELEASE)), w.a("X-Crashlytics-API-Client-Version", this.f50649c.f()));
                    Log.d("FirebaseSessions", "Fetching settings from server.");
                    aVar4 = this.f50650d;
                    cVar = new c(null);
                    c0781d = new C0781d(null);
                    bVar.f50653r = aVar3;
                    bVar.f50656u = 3;
                    if (aVar4.a(mapL, cVar, c0781d, bVar) != objF) {
                        aVar2 = aVar3;
                        g0 g0Var3 = g0.f38750a;
                        aVar2.f(null);
                        return g0.f38750a;
                    }
                    return objF;
                } catch (Throwable th4) {
                    th2 = th4;
                    aVar2 = aVar3;
                    aVar2.f(null);
                    throw th2;
                }
            }
            nm.a aVar5 = (nm.a) bVar.f50653r;
            s.b(obj);
            aVar = aVar5;
            if (!this.f50651e.b()) {
                Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                g0 g0Var4 = g0.f38750a;
                aVar.f(null);
                return g0Var4;
            }
            t.a aVar6 = t.f47238c;
            de.e eVar = this.f50648b;
            bVar.f50653r = aVar;
            bVar.f50656u = 2;
            Object objA = aVar6.a(eVar, bVar);
            if (objA != objF) {
                aVar3 = aVar;
                obj = objA;
                strB = ((t) obj).b();
                if (kotlin.jvm.internal.s.c(strB, "")) {
                    Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    g0 g0Var5 = g0.f38750a;
                    aVar3.f(null);
                    return g0Var5;
                }
                q qVarA4 = w.a("X-Crashlytics-Installation-ID", strB);
                q qVarA5 = w.a("X-Crashlytics-Device-Model", i(Build.MANUFACTURER + Build.MODEL));
                String INCREMENTAL2 = Build.VERSION.INCREMENTAL;
                kotlin.jvm.internal.s.g(INCREMENTAL2, "INCREMENTAL");
                q qVarA6 = w.a("X-Crashlytics-OS-Build-Version", i(INCREMENTAL2));
                String RELEASE2 = Build.VERSION.RELEASE;
                kotlin.jvm.internal.s.g(RELEASE2, "RELEASE");
                mapL = l0.l(qVarA4, qVarA5, qVarA6, w.a("X-Crashlytics-OS-Display-Version", i(RELEASE2)), w.a("X-Crashlytics-API-Client-Version", this.f50649c.f()));
                Log.d("FirebaseSessions", "Fetching settings from server.");
                aVar4 = this.f50650d;
                cVar = new c(null);
                c0781d = new C0781d(null);
                bVar.f50653r = aVar3;
                bVar.f50656u = 3;
                if (aVar4.a(mapL, cVar, c0781d, bVar) != objF) {
                    aVar2 = aVar3;
                    g0 g0Var6 = g0.f38750a;
                    aVar2.f(null);
                    return g0.f38750a;
                }
            }
            return objF;
        } catch (Throwable th5) {
            aVar2 = aVar;
            th2 = th5;
            aVar2.f(null);
            throw th2;
        }
    }

    @Override // qe.o
    public Double d() {
        return this.f50651e.a();
    }
}
