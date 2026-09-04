package y3;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f57145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4.h f57146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Activity f57147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Intent f57148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g1 f57149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f57150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bundle f57151g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f57152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bundle f57153b;

        public a(int i10, Bundle bundle) {
            this.f57152a = i10;
            this.f57153b = bundle;
        }

        public final Bundle a() {
            return this.f57153b;
        }

        public final int b() {
            return this.f57152a;
        }
    }

    public a1(Context context) {
        Intent launchIntentForPackage;
        kotlin.jvm.internal.s.h(context, "context");
        this.f57145a = context;
        this.f57146b = new b4.h(context);
        Activity activity = (Activity) am.j.s(am.j.z(am.j.g(context, new Function1() { // from class: y3.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a1.c((Context) obj);
            }
        }), new Function1() { // from class: y3.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a1.d((Context) obj);
            }
        }));
        this.f57147c = activity;
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f57148d = launchIntentForPackage;
        this.f57150f = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context c(Context it) {
        kotlin.jvm.internal.s.h(it, "it");
        ContextWrapper contextWrapper = it instanceof ContextWrapper ? (ContextWrapper) it : null;
        if (contextWrapper != null) {
            return contextWrapper.getBaseContext();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Activity d(Context it) {
        kotlin.jvm.internal.s.h(it, "it");
        if (it instanceof Activity) {
            return (Activity) it;
        }
        return null;
    }

    private final void g() {
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        d1 d1Var = null;
        for (a aVar : this.f57150f) {
            int iB = aVar.b();
            Bundle bundleA = aVar.a();
            d1 d1VarH = h(iB);
            if (d1VarH == null) {
                throw new IllegalArgumentException("Navigation destination " + d1.f57171f.d(this.f57146b, iB) + " cannot be found in the navigation graph " + this.f57149e);
            }
            for (int i10 : d1VarH.f(d1Var)) {
                arrayList.add(Integer.valueOf(i10));
                arrayList2.add(bundleA);
            }
            d1Var = d1VarH;
        }
        this.f57148d.putExtra("android-support-nav:controller:deepLinkIds", gl.r.H0(arrayList));
        this.f57148d.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
    }

    private final d1 h(int i10) {
        gl.i iVar = new gl.i();
        g1 g1Var = this.f57149e;
        kotlin.jvm.internal.s.e(g1Var);
        iVar.add(g1Var);
        while (!iVar.isEmpty()) {
            d1 d1Var = (d1) iVar.removeFirst();
            if (d1Var.p() == i10) {
                return d1Var;
            }
            if (d1Var instanceof g1) {
                Iterator it = ((g1) d1Var).iterator();
                while (it.hasNext()) {
                    iVar.add((d1) it.next());
                }
            }
        }
        return null;
    }

    public static /* synthetic */ a1 k(a1 a1Var, int i10, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return a1Var.j(i10, bundle);
    }

    private final void l() {
        Iterator it = this.f57150f.iterator();
        while (it.hasNext()) {
            int iB = ((a) it.next()).b();
            if (h(iB) == null) {
                throw new IllegalArgumentException("Navigation destination " + d1.f57171f.d(this.f57146b, iB) + " cannot be found in the navigation graph " + this.f57149e);
            }
        }
    }

    public final a1 e(int i10, Bundle bundle) {
        this.f57150f.add(new a(i10, bundle));
        if (this.f57149e != null) {
            l();
        }
        return this;
    }

    public final androidx.core.app.a0 f() {
        if (this.f57149e == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        if (this.f57150f.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        g();
        androidx.core.app.a0 a0VarB = androidx.core.app.a0.f(this.f57145a).b(new Intent(this.f57148d));
        kotlin.jvm.internal.s.g(a0VarB, "addNextIntentWithParentStack(...)");
        int iH = a0VarB.h();
        for (int i10 = 0; i10 < iH; i10++) {
            Intent intentG = a0VarB.g(i10);
            if (intentG != null) {
                intentG.putExtra("android-support-nav:controller:deepLinkIntent", this.f57148d);
            }
        }
        return a0VarB;
    }

    public final a1 i(Bundle bundle) {
        this.f57151g = bundle;
        this.f57148d.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    public final a1 j(int i10, Bundle bundle) {
        this.f57150f.clear();
        this.f57150f.add(new a(i10, bundle));
        if (this.f57149e != null) {
            l();
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a1(g0 navController) {
        this(navController.r());
        kotlin.jvm.internal.s.h(navController, "navController");
        this.f57149e = navController.u();
    }
}
