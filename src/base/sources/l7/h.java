package l7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f43948a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f43949b = new AtomicBoolean(false);

    private h() {
    }

    private final void d(u.a aVar, String str) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            boolean zE = r.e();
            if (zE) {
                r.g();
            }
            if (aVar == u.a.V2_V4) {
                l.b bVar = l.f43957q;
                r.d(bVar.c(), bVar.e(), false, str, aVar, zE);
                r.d(bVar.f(), bVar.e(), true, str, aVar, zE);
                bVar.c().clear();
                bVar.f().clear();
            } else {
                o.a aVar2 = o.N;
                r.d(aVar2.c(), aVar2.e(), false, str, aVar, zE);
                r.d(aVar2.f(), aVar2.e(), true, str, aVar, zE);
                aVar2.c().clear();
                aVar2.f().clear();
            }
            if (zE) {
                r.h();
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public static final synchronized void e(final Context context, final u.a billingClientVersion) {
        if (x7.a.c(h.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(billingClientVersion, "billingClientVersion");
            AtomicBoolean atomicBoolean = f43949b;
            if (atomicBoolean.get()) {
                return;
            }
            final k0 k0Var = new k0();
            u.a aVar = u.a.V2_V4;
            if (billingClientVersion == aVar) {
                k0Var.f43597a = l.f43957q.d(context);
            } else if (billingClientVersion == u.a.V5_V7) {
                k0Var.f43597a = o.N.d(context);
            }
            if (k0Var.f43597a == null) {
                atomicBoolean.set(true);
                return;
            }
            if (!com.facebook.internal.s.g(com.facebook.internal.s.b.AndroidIAPSubscriptionAutoLogging) || (m7.e.d() && billingClientVersion != aVar)) {
                ((i) k0Var.f43597a).a(u.b.INAPP, new Runnable() { // from class: l7.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.h(billingClientVersion, context);
                    }
                });
            } else {
                ((i) k0Var.f43597a).a(u.b.INAPP, new Runnable() { // from class: l7.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.f(k0Var, billingClientVersion, context);
                    }
                });
            }
        } catch (Throwable th2) {
            x7.a.b(th2, h.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(k0 billingClientWrapper, final u.a billingClientVersion, final Context context) {
        if (x7.a.c(h.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(billingClientWrapper, "$billingClientWrapper");
            kotlin.jvm.internal.s.h(billingClientVersion, "$billingClientVersion");
            kotlin.jvm.internal.s.h(context, "$context");
            ((i) billingClientWrapper.f43597a).a(u.b.SUBS, new Runnable() { // from class: l7.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.g(billingClientVersion, context);
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, h.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(u.a billingClientVersion, Context context) {
        if (x7.a.c(h.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(billingClientVersion, "$billingClientVersion");
            kotlin.jvm.internal.s.h(context, "$context");
            h hVar = f43948a;
            String packageName = context.getPackageName();
            kotlin.jvm.internal.s.g(packageName, "context.packageName");
            hVar.d(billingClientVersion, packageName);
        } catch (Throwable th2) {
            x7.a.b(th2, h.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(u.a billingClientVersion, Context context) {
        if (x7.a.c(h.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(billingClientVersion, "$billingClientVersion");
            kotlin.jvm.internal.s.h(context, "$context");
            h hVar = f43948a;
            String packageName = context.getPackageName();
            kotlin.jvm.internal.s.g(packageName, "context.packageName");
            hVar.d(billingClientVersion, packageName);
        } catch (Throwable th2) {
            x7.a.b(th2, h.class);
        }
    }
}
