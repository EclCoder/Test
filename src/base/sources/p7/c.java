package p7;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.h0;
import com.facebook.internal.e1;
import gl.r;
import gl.s0;
import java.util.Set;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f49562a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f49563b = s0.h("fb_mobile_purchase", "StartTrial", "Subscribe");

    private c() {
    }

    private final boolean c(com.facebook.appevents.d dVar) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            return !dVar.m() || (dVar.m() && f49563b.contains(dVar.k()));
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    public static final boolean d() {
        if (x7.a.c(c.class)) {
            return false;
        }
        try {
            return (h0.C(h0.m()) || e1.b0() || !e.b()) ? false : true;
        } catch (Throwable th2) {
            x7.a.b(th2, c.class);
            return false;
        }
    }

    public static final void e(final String applicationId, final com.facebook.appevents.d event) {
        if (x7.a.c(c.class)) {
            return;
        }
        try {
            s.h(applicationId, "applicationId");
            s.h(event, "event");
            if (f49562a.c(event)) {
                h0.v().execute(new Runnable() { // from class: p7.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.f(applicationId, event);
                    }
                });
            }
        } catch (Throwable th2) {
            x7.a.b(th2, c.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(String applicationId, com.facebook.appevents.d event) {
        if (x7.a.c(c.class)) {
            return;
        }
        try {
            s.h(applicationId, "$applicationId");
            s.h(event, "$event");
            e.c(applicationId, r.e(event));
        } catch (Throwable th2) {
            x7.a.b(th2, c.class);
        }
    }

    public static final void g(final String str, final String str2) {
        if (x7.a.c(c.class)) {
            return;
        }
        try {
            final Context contextM = h0.m();
            if (contextM == null || str == null || str2 == null) {
                return;
            }
            h0.v().execute(new Runnable() { // from class: p7.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.h(contextM, str2, str);
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, c.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Context context, String str, String str2) {
        if (x7.a.c(c.class)) {
            return;
        }
        try {
            s.h(context, "$context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            String str3 = str2 + "pingForOnDevice";
            if (sharedPreferences.getLong(str3, 0L) == 0) {
                e.e(str2);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong(str3, System.currentTimeMillis());
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            x7.a.b(th2, c.class);
        }
    }
}
