package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import dd.t;
import j0.p;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f22161k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Map f22162l = new androidx.collection.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f22165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dd.n f22166d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t f22169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ce.b f22170h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f22167e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f22168f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f22171i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f22172j = new CopyOnWriteArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void onBackgroundStateChanged(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static AtomicReference f22173a = new AtomicReference();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f22173a.get() == null) {
                    b bVar = new b();
                    if (androidx.lifecycle.b.a(f22173a, null, bVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z10) {
            synchronized (f.f22161k) {
                try {
                    ArrayList arrayList = new ArrayList(f.f22162l.values());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = (f) obj;
                        if (fVar.f22167e.get()) {
                            fVar.w(z10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static AtomicReference f22174b = new AtomicReference();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f22175a;

        public c(Context context) {
            this.f22175a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f22174b.get() == null) {
                c cVar = new c(context);
                if (androidx.lifecycle.b.a(f22174b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f22175a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (f.f22161k) {
                try {
                    Iterator it = f.f22162l.values().iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).p();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c();
        }
    }

    protected f(final Context context, String str, m mVar) {
        this.f22163a = (Context) Preconditions.checkNotNull(context);
        this.f22164b = Preconditions.checkNotEmpty(str);
        this.f22165c = (m) Preconditions.checkNotNull(mVar);
        n nVarB = FirebaseInitProvider.b();
        re.c.b("Firebase");
        re.c.b("ComponentDiscovery");
        List listB = dd.f.c(context, ComponentDiscoveryService.class).b();
        re.c.a();
        re.c.b("Runtime");
        dd.n.b bVarF = dd.n.m(ed.k.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(dd.c.q(context, Context.class, new Class[0])).b(dd.c.q(this, f.class, new Class[0])).b(dd.c.q(mVar, m.class, new Class[0])).f(new re.b());
        if (p.a(context) && FirebaseInitProvider.c()) {
            bVarF.b(dd.c.q(nVarB, n.class, new Class[0]));
        }
        dd.n nVarE = bVarF.e();
        this.f22166d = nVarE;
        re.c.a();
        this.f22169g = new t(new ce.b() { // from class: com.google.firebase.d
            @Override // ce.b
            public final Object get() {
                return f.b(this.f22158a, context);
            }
        });
        this.f22170h = nVarE.f(be.f.class);
        g(new a() { // from class: com.google.firebase.e
            @Override // com.google.firebase.f.a
            public final void onBackgroundStateChanged(boolean z10) {
                f.a(this.f22160a, z10);
            }
        });
        re.c.a();
    }

    public static /* synthetic */ void a(f fVar, boolean z10) {
        if (z10) {
            fVar.getClass();
        } else {
            ((be.f) fVar.f22170h.get()).g();
        }
    }

    public static /* synthetic */ he.a b(f fVar, Context context) {
        return new he.a(context, fVar.o(), (ae.c) fVar.f22166d.a(ae.c.class));
    }

    private void i() {
        Preconditions.checkState(!this.f22168f.get(), "FirebaseApp was deleted");
    }

    public static f l() {
        f fVar;
        synchronized (f22161k) {
            try {
                fVar = (f) f22162l.get("[DEFAULT]");
                if (fVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((be.f) fVar.f22170h.get()).g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (!p.a(this.f22163a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m());
            c.b(this.f22163a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m());
        this.f22166d.p(u());
        ((be.f) this.f22170h.get()).g();
    }

    public static f q(Context context) {
        synchronized (f22161k) {
            try {
                if (f22162l.containsKey("[DEFAULT]")) {
                    return l();
                }
                m mVarA = m.a(context);
                if (mVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return r(context, mVarA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static f r(Context context, m mVar) {
        return s(context, mVar, "[DEFAULT]");
    }

    public static f s(Context context, m mVar, String str) {
        f fVar;
        b.b(context);
        String strV = v(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f22161k) {
            Map map = f22162l;
            Preconditions.checkState(!map.containsKey(strV), "FirebaseApp name " + strV + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            fVar = new f(context, strV, mVar);
            map.put(strV, fVar);
        }
        fVar.p();
        return fVar;
    }

    private static String v(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f22171i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onBackgroundStateChanged(z10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f22164b.equals(((f) obj).m());
        }
        return false;
    }

    public void g(a aVar) {
        i();
        if (this.f22167e.get() && BackgroundDetector.getInstance().isInBackground()) {
            aVar.onBackgroundStateChanged(true);
        }
        this.f22171i.add(aVar);
    }

    public void h(g gVar) {
        i();
        Preconditions.checkNotNull(gVar);
        this.f22172j.add(gVar);
    }

    public int hashCode() {
        return this.f22164b.hashCode();
    }

    public Object j(Class cls) {
        i();
        return this.f22166d.a(cls);
    }

    public Context k() {
        i();
        return this.f22163a;
    }

    public String m() {
        i();
        return this.f22164b;
    }

    public m n() {
        i();
        return this.f22165c;
    }

    public String o() {
        return Base64Utils.encodeUrlSafeNoPadding(m().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(n().c().getBytes(Charset.defaultCharset()));
    }

    public boolean t() {
        i();
        return ((he.a) this.f22169g.get()).b();
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.f22164b).add("options", this.f22165c).toString();
    }

    public boolean u() {
        return "[DEFAULT]".equals(m());
    }
}
