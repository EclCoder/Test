package jd;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f42288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.f f42289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m0 f42290c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h0 f42293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h0 f42294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f42295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private x f42296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final r0 f42297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final pd.j f42298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final id.b f42299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final hd.a f42300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final m f42301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final gd.a f42302o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final gd.k f42303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final kd.i f42304q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f42292e = System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w0 f42291d = new w0();

    public g0(com.google.firebase.f fVar, r0 r0Var, gd.a aVar, m0 m0Var, id.b bVar, hd.a aVar2, pd.j jVar, m mVar, gd.k kVar, kd.i iVar) {
        this.f42289b = fVar;
        this.f42290c = m0Var;
        this.f42288a = fVar.k();
        this.f42297j = r0Var;
        this.f42302o = aVar;
        this.f42299l = bVar;
        this.f42300m = aVar2;
        this.f42298k = jVar;
        this.f42301n = mVar;
        this.f42303p = kVar;
        this.f42304q = iVar;
    }

    private void h() {
        try {
            this.f42295h = Boolean.TRUE.equals((Boolean) this.f42304q.f43179a.c().submit(new Callable() { // from class: jd.a0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f42249a.f42296i.v());
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f42295h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(rd.j jVar) {
        kd.i.c();
        r();
        try {
            try {
                this.f42299l.a(new id.a() { // from class: jd.c0
                    @Override // id.a
                    public final void a(String str) {
                        this.f42258a.o(str);
                    }
                });
                this.f42296i.W();
                if (!jVar.b().f51284b.f51291a) {
                    gd.g.f().b("Collection of crash reports disabled in Crashlytics settings.");
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f42296i.D(jVar)) {
                    gd.g.f().k("Previous sessions could not be finalized.");
                }
                this.f42296i.Z(jVar.a());
                q();
            } catch (Exception e10) {
                gd.g.f().e("Crashlytics encountered a problem during asynchronous initialization.", e10);
                q();
            }
        } catch (Throwable th2) {
            q();
            throw th2;
        }
    }

    private void l(final rd.j jVar) {
        Future<?> futureSubmit = this.f42304q.f43179a.c().submit(new Runnable() { // from class: jd.b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f42253a.j(jVar);
            }
        });
        gd.g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            gd.g.f().e("Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            gd.g.f().e("Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            gd.g.f().e("Crashlytics timed out during initialization.", e12);
        }
    }

    public static String m() {
        return "20.1.0";
    }

    static boolean n(String str, boolean z10) {
        if (!z10) {
            gd.g.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    boolean i() {
        return this.f42293f.c();
    }

    public Task k(final rd.j jVar) {
        return this.f42304q.f43179a.e(new Runnable() { // from class: jd.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f42423a.j(jVar);
            }
        });
    }

    public void o(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.f42292e;
        this.f42304q.f43179a.f(new Callable() { // from class: jd.e0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                g0 g0Var = this.f42269a;
                return g0Var.f42304q.f43180b.e(new Runnable() { // from class: jd.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g0Var.f42296i.e0(j, str);
                    }
                });
            }
        });
    }

    public void p(final Throwable th2, final Map map) {
        this.f42304q.f43179a.e(new Runnable() { // from class: jd.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f42262a.f42296i.c0(Thread.currentThread(), th2, map);
            }
        });
    }

    void q() {
        kd.i.c();
        try {
            if (this.f42293f.d()) {
                return;
            }
            gd.g.f().k("Initialization marker file was not properly removed.");
        } catch (Exception e10) {
            gd.g.f().e("Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }

    void r() {
        kd.i.c();
        this.f42293f.a();
        gd.g.f().i("Initialization marker file was created.");
    }

    public boolean s(a aVar, rd.j jVar) {
        Context context = this.f42288a;
        if (!n(aVar.f42242b, i.i(context, "com.google.firebase.crashlytics.RequireBuildId", i.i(context, "com.crashlytics.RequireBuildId", true)))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String strC = new h().c();
        try {
            this.f42294g = new h0("crash_marker", this.f42298k);
            this.f42293f = new h0("initialization_marker", this.f42298k);
            ld.o oVar = new ld.o(strC, this.f42298k, this.f42304q);
            ld.f fVar = new ld.f(this.f42298k);
            sd.a aVar2 = new sd.a(UserVerificationMethods.USER_VERIFY_ALL, new sd.c(10));
            this.f42303p.b(oVar);
            this.f42296i = new x(this.f42288a, this.f42297j, this.f42290c, this.f42298k, this.f42294g, aVar, oVar, fVar, f1.n(this.f42288a, this.f42297j, this.f42298k, aVar, fVar, oVar, aVar2, jVar, this.f42291d, this.f42301n, this.f42304q), this.f42302o, this.f42300m, this.f42301n, this.f42304q);
            boolean zI = i();
            h();
            this.f42296i.A(strC, Thread.getDefaultUncaughtExceptionHandler(), jVar);
            if (Build.VERSION.SDK_INT >= 37) {
                this.f42296i.B(strC);
            }
            if (!zI || !i.d(this.f42288a)) {
                gd.g.f().b("Successfully configured exception handler.");
                return true;
            }
            gd.g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            l(jVar);
            return false;
        } catch (Exception e10) {
            gd.g.f().e("Crashlytics was not started due to an exception during initialization", e10);
            this.f42296i = null;
            return false;
        }
    }

    public void t(final String str, final String str2) {
        this.f42304q.f43179a.e(new Runnable() { // from class: jd.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f42429a.f42296i.X(str, str2);
            }
        });
    }
}
