package c7;

import android.app.Activity;
import com.facebook.h0;
import com.facebook.internal.a0;
import com.facebook.internal.e1;
import com.facebook.internal.w;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f9574a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f9575b = b.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f9576c;

    private b() {
    }

    public static final void b() {
        try {
            if (x7.a.c(b.class)) {
                return;
            }
            try {
                h0.v().execute(new Runnable() { // from class: c7.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.c();
                    }
                });
            } catch (Exception e10) {
                e1.k0(f9575b, e10);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c() {
        if (x7.a.c(b.class)) {
            return;
        }
        try {
            if (com.facebook.internal.b.f15130f.h(h0.m())) {
                return;
            }
            f9574a.e();
            f9576c = true;
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
        }
    }

    public static final void d(Activity activity) {
        if (x7.a.c(b.class)) {
            return;
        }
        try {
            s.h(activity, "activity");
            try {
                if (f9576c && !d.f9578d.c().isEmpty()) {
                    f.f9585e.e(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
        }
    }

    private final void e() {
        String strQ;
        if (x7.a.c(this)) {
            return;
        }
        try {
            w wVarV = a0.v(h0.n(), false);
            if (wVarV == null || (strQ = wVarV.q()) == null) {
                return;
            }
            d.f9578d.d(strQ);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }
}
