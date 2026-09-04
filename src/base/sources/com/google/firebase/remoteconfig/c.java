package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.f;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.t;
import com.google.firebase.remoteconfig.internal.u;
import com.google.firebase.remoteconfig.internal.w;
import de.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c implements le.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Clock f22247j = DefaultClock.getInstance();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Random f22248k = new Random();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Map f22249l = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f22250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f22251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f22252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f22253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f22254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final yc.b f22255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ce.b f22256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f22258i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final AtomicReference f22259a = new AtomicReference();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference = f22259a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (androidx.lifecycle.b.a(atomicReference, null, aVar)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(aVar);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z10) {
            c.q(z10);
        }
    }

    c(Context context, ScheduledExecutorService scheduledExecutorService, f fVar, e eVar, yc.b bVar, ce.b bVar2) {
        this(context, scheduledExecutorService, fVar, eVar, bVar, bVar2, true);
    }

    public static /* synthetic */ bd.a b() {
        return null;
    }

    private com.google.firebase.remoteconfig.internal.f f(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.f.h(this.f22252c, u.c(this.f22251b, String.format("%s_%s_%s_%s.json", "frc", this.f22257h, str, str2)));
    }

    private o j(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return new o(this.f22252c, fVar, fVar2);
    }

    private static w k(f fVar, String str, ce.b bVar) {
        if (p(fVar) && str.equals("firebase")) {
            return new w(bVar);
        }
        return null;
    }

    private ke.e m(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return new ke.e(fVar, ke.a.a(fVar, fVar2), this.f22252c);
    }

    static t n(Context context, String str, String str2) {
        return new t(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static boolean o(f fVar, String str) {
        return str.equals("firebase") && p(fVar);
    }

    private static boolean p(f fVar) {
        return fVar.m().equals("[DEFAULT]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void q(boolean z10) {
        Iterator it = f22249l.values().iterator();
        while (it.hasNext()) {
            ((com.google.firebase.remoteconfig.a) it.next()).o(z10);
        }
    }

    @Override // le.a
    public void a(String str, me.f fVar) {
        e(str).j().e(fVar);
    }

    synchronized com.google.firebase.remoteconfig.a d(f fVar, String str, e eVar, yc.b bVar, Executor executor, com.google.firebase.remoteconfig.internal.f fVar2, com.google.firebase.remoteconfig.internal.f fVar3, com.google.firebase.remoteconfig.internal.f fVar4, m mVar, o oVar, t tVar, ke.e eVar2) throws Throwable {
        c cVar;
        String str2;
        try {
            try {
                if (this.f22250a.containsKey(str)) {
                    cVar = this;
                    str2 = str;
                } else {
                    cVar = this;
                    str2 = str;
                    com.google.firebase.remoteconfig.a aVar = new com.google.firebase.remoteconfig.a(this.f22251b, fVar, eVar, o(fVar, str) ? bVar : null, executor, fVar2, fVar3, fVar4, mVar, oVar, tVar, l(fVar, eVar, mVar, fVar3, this.f22251b, str, tVar), eVar2);
                    aVar.r();
                    cVar.f22250a.put(str2, aVar);
                    f22249l.put(str2, aVar);
                }
                return (com.google.firebase.remoteconfig.a) cVar.f22250a.get(str2);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized com.google.firebase.remoteconfig.a e(String str) throws Throwable {
        Throwable th2;
        try {
            try {
                com.google.firebase.remoteconfig.internal.f fVarF = f(str, "fetch");
                com.google.firebase.remoteconfig.internal.f fVarF2 = f(str, "activate");
                com.google.firebase.remoteconfig.internal.f fVarF3 = f(str, "defaults");
                t tVarN = n(this.f22251b, this.f22257h, str);
                o oVarJ = j(fVarF2, fVarF3);
                final w wVarK = k(this.f22253d, str, this.f22256g);
                if (wVarK != null) {
                    try {
                        oVarJ.b(new BiConsumer() { // from class: je.j
                            @Override // com.google.android.gms.common.util.BiConsumer
                            public final void accept(Object obj, Object obj2) {
                                wVarK.a((String) obj, (com.google.firebase.remoteconfig.internal.g) obj2);
                            }
                        });
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                return d(this.f22253d, str, this.f22254e, this.f22255f, this.f22252c, fVarF, fVarF2, fVarF3, h(str, fVarF, tVarN), oVarJ, tVarN, m(fVarF2, fVarF3));
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    com.google.firebase.remoteconfig.a g() {
        return e("firebase");
    }

    synchronized m h(String str, com.google.firebase.remoteconfig.internal.f fVar, t tVar) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return new m(this.f22254e, p(this.f22253d) ? this.f22256g : new ce.b() { // from class: je.k
            @Override // ce.b
            public final Object get() {
                return com.google.firebase.remoteconfig.c.b();
            }
        }, this.f22252c, f22247j, f22248k, fVar, i(this.f22253d.n().b(), str, tVar), tVar, this.f22258i);
    }

    ConfigFetchHttpClient i(String str, String str2, t tVar) {
        return new ConfigFetchHttpClient(this.f22251b, this.f22253d.n().c(), str, str2, tVar.c(), tVar.c());
    }

    synchronized p l(f fVar, e eVar, m mVar, com.google.firebase.remoteconfig.internal.f fVar2, Context context, String str, t tVar) {
        return new p(fVar, eVar, mVar, fVar2, context, str, tVar, this.f22252c);
    }

    protected c(Context context, ScheduledExecutorService scheduledExecutorService, f fVar, e eVar, yc.b bVar, ce.b bVar2, boolean z10) {
        this.f22250a = new HashMap();
        this.f22258i = new HashMap();
        this.f22251b = context;
        this.f22252c = scheduledExecutorService;
        this.f22253d = fVar;
        this.f22254e = eVar;
        this.f22255f = bVar;
        this.f22256g = bVar2;
        this.f22257h = fVar.n().c();
        a.b(context);
        if (z10) {
            Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.remoteconfig.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f22246a.g();
                }
            });
        }
    }
}
