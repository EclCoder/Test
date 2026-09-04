package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends s1.e implements s1.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Application f4391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s1.c f4392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f4393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s f4394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private n4.g f4395f;

    public h1() {
        this.f4392c = new s1.a();
    }

    @Override // androidx.lifecycle.s1.c
    public p1 a(Class modelClass) {
        kotlin.jvm.internal.s.h(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return e(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.s1.c
    public p1 b(Class modelClass, q1.a extras) {
        kotlin.jvm.internal.s.h(modelClass, "modelClass");
        kotlin.jvm.internal.s.h(extras, "extras");
        String str = (String) extras.a(s1.f4483c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(c1.f4341a) == null || extras.a(c1.f4342b) == null) {
            if (this.f4394e != null) {
                return e(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(s1.a.f4487h);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? i1.c(modelClass, i1.f4398b) : i1.c(modelClass, i1.f4397a);
        if (constructorC == null) {
            return this.f4392c.b(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? i1.d(modelClass, constructorC, c1.b(extras)) : i1.d(modelClass, constructorC, application, c1.b(extras));
    }

    @Override // androidx.lifecycle.s1.c
    public p1 c(zl.c modelClass, q1.a extras) {
        kotlin.jvm.internal.s.h(modelClass, "modelClass");
        kotlin.jvm.internal.s.h(extras, "extras");
        return b(sl.a.a(modelClass), extras);
    }

    @Override // androidx.lifecycle.s1.e
    public void d(p1 viewModel) {
        kotlin.jvm.internal.s.h(viewModel, "viewModel");
        if (this.f4394e != null) {
            n4.g gVar = this.f4395f;
            kotlin.jvm.internal.s.e(gVar);
            s sVar = this.f4394e;
            kotlin.jvm.internal.s.e(sVar);
            r.a(viewModel, gVar, sVar);
        }
    }

    public final p1 e(String key, Class modelClass) {
        p1 p1VarD;
        Application application;
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(modelClass, "modelClass");
        s sVar = this.f4394e;
        if (sVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || this.f4391b == null) ? i1.c(modelClass, i1.f4398b) : i1.c(modelClass, i1.f4397a);
        if (constructorC == null) {
            return this.f4391b != null ? this.f4392c.a(modelClass) : s1.d.f4491b.a().a(modelClass);
        }
        n4.g gVar = this.f4395f;
        kotlin.jvm.internal.s.e(gVar);
        b1 b1VarB = r.b(gVar, sVar, key, this.f4393d);
        if (!zIsAssignableFrom || (application = this.f4391b) == null) {
            p1VarD = i1.d(modelClass, constructorC, b1VarB.k());
        } else {
            kotlin.jvm.internal.s.e(application);
            p1VarD = i1.d(modelClass, constructorC, application, b1VarB.k());
        }
        p1VarD.d("androidx.lifecycle.savedstate.vm.tag", b1VarB);
        return p1VarD;
    }

    public h1(Application application, n4.j owner, Bundle bundle) {
        s1.a aVar;
        kotlin.jvm.internal.s.h(owner, "owner");
        this.f4395f = owner.getSavedStateRegistry();
        this.f4394e = owner.getLifecycle();
        this.f4393d = bundle;
        this.f4391b = application;
        if (application != null) {
            aVar = s1.a.f4485f.a(application);
        } else {
            aVar = new s1.a();
        }
        this.f4392c = aVar;
    }
}
