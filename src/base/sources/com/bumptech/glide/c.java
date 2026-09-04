package com.bumptech.glide;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import f6.o;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile c f11130o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static volatile boolean f11131p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.j f11132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u5.d f11133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v5.h f11134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f11135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u5.b f11136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f11137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f6.c f11138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f11139h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f11140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f11141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f11142k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private g f11143l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private g f11144m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final m6.f.b f11145n;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        i6.f build();
    }

    c(Context context, com.bumptech.glide.load.engine.j jVar, v5.h hVar, u5.d dVar, u5.b bVar, o oVar, f6.c cVar, int i10, b bVar2, Map map, List list, List list2, g6.a aVar, f fVar) {
        g gVar = g.NORMAL;
        this.f11141j = gVar;
        this.f11142k = false;
        this.f11143l = null;
        this.f11144m = gVar;
        this.f11145n = m6.f.a(new m6.f.b() { // from class: com.bumptech.glide.b
            @Override // m6.f.b
            public final Object get() {
                return c.a(this.f11129a);
            }
        });
        this.f11132a = jVar;
        this.f11133b = dVar;
        this.f11136e = bVar;
        this.f11134c = hVar;
        this.f11137f = oVar;
        this.f11138g = cVar;
        this.f11140i = bVar2;
        fVar.a(d.C0151d.class);
        this.f11135d = new e(context, bVar, j.d(this, list2, aVar), new j6.g(), bVar2, map, list, jVar, fVar, i10);
    }

    public static l A(View view) {
        return n(view.getContext()).g(view);
    }

    public static l B(Fragment fragment) {
        return n(fragment.getContext()).h(fragment);
    }

    public static l C(s sVar) {
        return n(sVar).i(sVar);
    }

    public static /* synthetic */ C0150c a(c cVar) {
        cVar.getClass();
        return new C0150c();
    }

    static void c(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f11131p) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f11131p = true;
        try {
            o(context, generatedAppGlideModule);
        } finally {
            f11131p = false;
        }
    }

    public static c e(Context context) {
        if (f11130o == null) {
            GeneratedAppGlideModule generatedAppGlideModuleF = f(context.getApplicationContext());
            synchronized (c.class) {
                try {
                    if (f11130o == null) {
                        c(context, generatedAppGlideModuleF);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f11130o;
    }

    private static GeneratedAppGlideModule f(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e10) {
            w(e10);
            return null;
        } catch (InstantiationException e11) {
            w(e11);
            return null;
        } catch (NoSuchMethodException e12) {
            w(e12);
            return null;
        } catch (InvocationTargetException e13) {
            w(e13);
            return null;
        }
    }

    private static o n(Context context) {
        m6.k.f(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return e(context).m();
    }

    private static void o(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        p(context, new d(), generatedAppGlideModule);
    }

    private static void p(Context context, d dVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List listB = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            listB = new g6.d(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            generatedAppGlideModule.d();
            Iterator it = listB.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = listB.iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                new StringBuilder().append("Discovered GlideModule from manifest: ");
                throw null;
            }
        }
        dVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator it3 = listB.iterator();
        if (it3.hasNext()) {
            android.support.v4.media.session.b.a(it3.next());
            throw null;
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, dVar);
        }
        c cVarA = dVar.a(applicationContext, listB, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(cVarA);
        cVarA.q();
        f11130o = cVarA;
    }

    private void q() {
        if (this.f11143l != null) {
            Context applicationContext = j().getApplicationContext();
            if ((applicationContext instanceof Application) || !Log.isLoggable("Glide", 5)) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) this.f11145n.get());
                return;
            }
            Log.w("Glide", "Glide requires an Application Context. You passed: " + applicationContext + ". This will disable setting memory category in background.");
        }
    }

    private void u() {
        g gVar = this.f11143l;
        if (gVar == null || this.f11142k) {
            return;
        }
        this.f11142k = true;
        this.f11144m = t(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (this.f11143l == null || !this.f11142k) {
            return;
        }
        this.f11142k = false;
        t(this.f11144m);
    }

    private static void w(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static l z(Context context) {
        return n(context).f(context);
    }

    public void d() {
        m6.l.a();
        this.f11134c.b();
        this.f11133b.b();
        this.f11136e.b();
    }

    public u5.b g() {
        return this.f11136e;
    }

    public u5.d h() {
        return this.f11133b;
    }

    f6.c i() {
        return this.f11138g;
    }

    public Context j() {
        return this.f11135d.getBaseContext();
    }

    e k() {
        return this.f11135d;
    }

    public Registry l() {
        return this.f11135d.i();
    }

    public o m() {
        return this.f11137f;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        d();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        x(i10);
        if (i10 > 20) {
            u();
        }
    }

    void r(l lVar) {
        synchronized (this.f11139h) {
            try {
                if (this.f11139h.contains(lVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f11139h.add(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean s(j6.i iVar) {
        synchronized (this.f11139h) {
            try {
                Iterator it = this.f11139h.iterator();
                while (it.hasNext()) {
                    if (((l) it.next()).A(iVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public g t(g gVar) {
        m6.l.a();
        this.f11134c.c(gVar.g());
        this.f11133b.c(gVar.g());
        g gVar2 = this.f11141j;
        this.f11141j = gVar;
        return gVar2;
    }

    public void x(int i10) {
        m6.l.a();
        synchronized (this.f11139h) {
            try {
                Iterator it = this.f11139h.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).onTrimMemory(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f11134c.a(i10);
        this.f11133b.a(i10);
        this.f11136e.a(i10);
    }

    void y(l lVar) {
        synchronized (this.f11139h) {
            try {
                if (!this.f11139h.contains(lVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f11139h.remove(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.bumptech.glide.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class C0150c implements Application.ActivityLifecycleCallbacks {
        private C0150c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            c.this.v();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
