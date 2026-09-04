package androidx.fragment.app;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f4235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f4236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f4237c;

    static {
        p0 p0Var = new p0();
        f4235a = p0Var;
        f4236b = new q0();
        f4237c = p0Var.b();
    }

    private p0() {
    }

    public static final void a(Fragment inFragment, Fragment outFragment, boolean z10, androidx.collection.a sharedElements, boolean z11) {
        kotlin.jvm.internal.s.h(inFragment, "inFragment");
        kotlin.jvm.internal.s.h(outFragment, "outFragment");
        kotlin.jvm.internal.s.h(sharedElements, "sharedElements");
        if (z10) {
            outFragment.getEnterTransitionCallback();
        } else {
            inFragment.getEnterTransitionCallback();
        }
    }

    private final r0 b() {
        try {
            kotlin.jvm.internal.s.f(androidx.transition.e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (r0) androidx.transition.e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void c(androidx.collection.a aVar, androidx.collection.a namedViews) {
        kotlin.jvm.internal.s.h(aVar, "<this>");
        kotlin.jvm.internal.s.h(namedViews, "namedViews");
        int size = aVar.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey((String) aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    public static final void d(List views, int i10) {
        kotlin.jvm.internal.s.h(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}
