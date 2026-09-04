package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.inmobi.media.Xf;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Xf implements Application.ActivityLifecycleCallbacks {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Activity activity, kotlin.coroutines.jvm.internal.d dVar) {
        Vf vf2;
        nm.a aVar;
        WeakReference weakReference;
        if (dVar instanceof Vf) {
            vf2 = (Vf) dVar;
            int i10 = vf2.f25899e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vf2.f25899e = i10 - Integer.MIN_VALUE;
            } else {
                vf2 = new Vf(this, dVar);
            }
        } else {
            vf2 = new Vf(this, dVar);
        }
        Object obj = vf2.f25897c;
        Object objF = ll.b.f();
        int i11 = vf2.f25899e;
        if (i11 == 0) {
            fl.s.b(obj);
            aVar = Yf.f26083b;
            vf2.f25895a = activity;
            vf2.f25896b = aVar;
            vf2.f25899e = 1;
            if (aVar.e(null, vf2) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm.a aVar2 = vf2.f25896b;
            Activity activity2 = vf2.f25895a;
            fl.s.b(obj);
            aVar = aVar2;
            activity = activity2;
        }
        try {
            if (Yf.f26082a != null) {
                int size = Yf.f26084c.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        weakReference = null;
                        break;
                    }
                    ArrayList arrayList = Yf.f26084c;
                    if (kotlin.jvm.internal.s.c((Context) ((WeakReference) arrayList.get(i12)).get(), activity)) {
                        weakReference = (WeakReference) arrayList.get(i12);
                        break;
                    }
                    i12++;
                }
                if (weakReference != null) {
                    kotlin.coroutines.jvm.internal.b.a(Yf.f26084c.remove(weakReference));
                }
                ArrayList arrayList2 = Yf.f26084c;
                gl.r.F(arrayList2, new Function1() { // from class: yh.j6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(Xf.a((WeakReference) obj2));
                    }
                });
                if (arrayList2.isEmpty()) {
                    a(activity);
                }
                fl.g0 g0Var = fl.g0.f38750a;
            }
            return fl.g0.f38750a;
        } finally {
            aVar.f(null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.s.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        em.k.d(H9.f24930c, null, null, new Wf(this, activity, null), 3, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.s.h(activity, "activity");
        kotlin.jvm.internal.s.h(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
    }

    public static final boolean a(WeakReference it) {
        kotlin.jvm.internal.s.h(it, "it");
        return it.get() == null;
    }

    public final void a(Activity activity) {
        Picasso picasso = Yf.f26082a;
        kotlin.jvm.internal.s.g("Yf", "access$getTAG$p(...)");
        Objects.toString(Yf.f26082a);
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        Picasso picasso2 = Yf.f26082a;
        if (picasso2 != null) {
            picasso2.shutdown();
        }
        Yf.f26082a = null;
    }
}
