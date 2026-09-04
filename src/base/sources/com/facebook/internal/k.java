package com.facebook.internal;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.util.Log;
import com.facebook.FacebookException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f15287f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f15288g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f15289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0 f15290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f15291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.facebook.r f15293e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f15294a = k.f15288g;

        public b() {
        }

        public abstract boolean a(Object obj, boolean z10);

        public abstract com.facebook.internal.a b(Object obj);

        public Object c() {
            return this.f15294a;
        }
    }

    protected k(Activity activity, int i10) {
        kotlin.jvm.internal.s.h(activity, "activity");
        this.f15289a = activity;
        this.f15290b = null;
        this.f15292d = i10;
        this.f15293e = null;
    }

    private final List a() {
        if (this.f15291c == null) {
            this.f15291c = g();
        }
        List list = this.f15291c;
        kotlin.jvm.internal.s.f(list, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>");
        return list;
    }

    private final com.facebook.internal.a d(Object obj, Object obj2) {
        com.facebook.internal.a aVarB;
        boolean z10 = obj2 == f15288g;
        Iterator it = a().iterator();
        while (true) {
            if (!it.hasNext()) {
                aVarB = null;
                break;
            }
            b bVar = (b) it.next();
            if (z10 || e1.e(bVar.c(), obj2)) {
                if (bVar.a(obj, true)) {
                    try {
                        aVarB = bVar.b(obj);
                        break;
                    } catch (FacebookException e10) {
                        com.facebook.internal.a aVarE = e();
                        j.k(aVarE, e10);
                        aVarB = aVarE;
                    }
                }
            }
        }
        if (aVarB != null) {
            return aVarB;
        }
        com.facebook.internal.a aVarE2 = e();
        j.h(aVarE2);
        return aVarE2;
    }

    public boolean b(Object obj) {
        return c(obj, f15288g);
    }

    protected boolean c(Object obj, Object mode) {
        kotlin.jvm.internal.s.h(mode, "mode");
        boolean z10 = mode == f15288g;
        for (b bVar : a()) {
            if (z10 || e1.e(bVar.c(), mode)) {
                if (bVar.a(obj, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected abstract com.facebook.internal.a e();

    protected final Activity f() {
        Activity activity = this.f15289a;
        if (activity != null) {
            return activity;
        }
        f0 f0Var = this.f15290b;
        if (f0Var != null) {
            return f0Var.a();
        }
        return null;
    }

    protected abstract List g();

    public final int h() {
        return this.f15292d;
    }

    public final void i(com.facebook.r rVar) {
        this.f15293e = rVar;
    }

    public void j(Object obj) {
        k(obj, f15288g);
    }

    protected void k(Object obj, Object mode) {
        kotlin.jvm.internal.s.h(mode, "mode");
        com.facebook.internal.a aVarD = d(obj, mode);
        if (aVarD == null) {
            Log.e("FacebookDialog", "No code path should ever result in a null appCall");
            if (com.facebook.h0.H()) {
                throw new IllegalStateException("No code path should ever result in a null appCall");
            }
            return;
        }
        if (f() instanceof f.g) {
            ComponentCallbacks2 componentCallbacks2F = f();
            kotlin.jvm.internal.s.f(componentCallbacks2F, "null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
            f.f activityResultRegistry = ((f.g) componentCallbacks2F).getActivityResultRegistry();
            kotlin.jvm.internal.s.g(activityResultRegistry, "registryOwner.activityResultRegistry");
            j.g(aVarD, activityResultRegistry, this.f15293e);
            aVarD.f();
            return;
        }
        f0 f0Var = this.f15290b;
        if (f0Var != null) {
            j.f(aVarD, f0Var);
            return;
        }
        Activity activity = this.f15289a;
        if (activity != null) {
            j.e(aVarD, activity);
        }
    }

    protected k(f0 fragmentWrapper, int i10) {
        kotlin.jvm.internal.s.h(fragmentWrapper, "fragmentWrapper");
        this.f15290b = fragmentWrapper;
        this.f15289a = null;
        this.f15292d = i10;
        if (fragmentWrapper.a() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
        }
    }
}
