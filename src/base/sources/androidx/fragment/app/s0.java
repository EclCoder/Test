package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.c1;
import androidx.lifecycle.h1;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class s0 implements androidx.lifecycle.q, n4.j, u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fragment f4263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t1 f4264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f4265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s1.c f4266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.lifecycle.f0 f4267e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private n4.i f4268f = null;

    s0(Fragment fragment, t1 t1Var, Runnable runnable) {
        this.f4263a = fragment;
        this.f4264b = t1Var;
        this.f4265c = runnable;
    }

    void a(androidx.lifecycle.s.a aVar) {
        this.f4267e.m(aVar);
    }

    void b() {
        if (this.f4267e == null) {
            this.f4267e = new androidx.lifecycle.f0(this);
            n4.i iVarA = n4.i.a(this);
            this.f4268f = iVarA;
            iVarA.c();
            this.f4265c.run();
        }
    }

    boolean c() {
        return this.f4267e != null;
    }

    void d(Bundle bundle) {
        this.f4268f.d(bundle);
    }

    void e(Bundle bundle) {
        this.f4268f.e(bundle);
    }

    void f(androidx.lifecycle.s.b bVar) {
        this.f4267e.p(bVar);
    }

    @Override // androidx.lifecycle.q
    public q1.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f4263a.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        q1.d dVar = new q1.d();
        if (application != null) {
            dVar.c(s1.a.f4487h, application);
        }
        dVar.c(c1.f4341a, this.f4263a);
        dVar.c(c1.f4342b, this);
        if (this.f4263a.getArguments() != null) {
            dVar.c(c1.f4343c, this.f4263a.getArguments());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.q
    public s1.c getDefaultViewModelProviderFactory() {
        Application application;
        s1.c defaultViewModelProviderFactory = this.f4263a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f4263a.mDefaultFactory)) {
            this.f4266d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f4266d == null) {
            Context applicationContext = this.f4263a.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            Fragment fragment = this.f4263a;
            this.f4266d = new h1(application, fragment, fragment.getArguments());
        }
        return this.f4266d;
    }

    @Override // androidx.lifecycle.b0
    public androidx.lifecycle.s getLifecycle() {
        b();
        return this.f4267e;
    }

    @Override // n4.j
    public n4.g getSavedStateRegistry() {
        b();
        return this.f4268f.b();
    }

    @Override // androidx.lifecycle.u1
    public t1 getViewModelStore() {
        b();
        return this.f4264b;
    }
}
