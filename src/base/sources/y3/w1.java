package y3;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w1 f57315a = new w1();

    private w1() {
    }

    public static final g0 c(Activity activity, int i10) {
        kotlin.jvm.internal.s.h(activity, "activity");
        View viewG = androidx.core.app.b.g(activity, i10);
        kotlin.jvm.internal.s.g(viewG, "requireViewById(...)");
        g0 g0VarE = f57315a.e(viewG);
        if (g0VarE != null) {
            return g0VarE;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i10);
    }

    public static final g0 d(View view) {
        kotlin.jvm.internal.s.h(view, "view");
        g0 g0VarE = f57315a.e(view);
        if (g0VarE != null) {
            return g0VarE;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    private final g0 e(View view) {
        return (g0) am.j.s(am.j.z(am.j.g(view, new Function1() { // from class: y3.u1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w1.f((View) obj);
            }
        }), new Function1() { // from class: y3.v1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w1.g((View) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View f(View it) {
        kotlin.jvm.internal.s.h(it, "it");
        Object parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 g(View it) {
        kotlin.jvm.internal.s.h(it, "it");
        return f57315a.h(it);
    }

    private final g0 h(View view) {
        Object tag = view.getTag(d2.f57184a);
        if (tag instanceof WeakReference) {
            return (g0) ((WeakReference) tag).get();
        }
        if (tag instanceof g0) {
            return (g0) tag;
        }
        return null;
    }

    public static final void i(View view, g0 g0Var) {
        kotlin.jvm.internal.s.h(view, "view");
        view.setTag(d2.f57184a, g0Var);
    }
}
