package vh;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
abstract class h0 {
    static Intent a(Context context) {
        if (c.l()) {
            if (c.d() && f0.m() && f0.n()) {
                return g0.a(c0.f(context), c0.b(context));
            }
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.setData(e0.k(context));
            return e0.a(context, intent) ? intent : c0.b(context);
        }
        if (f0.j()) {
            return g0.a(c0.d(context), c0.b(context));
        }
        if (f0.m()) {
            return g0.a(f0.n() ? c0.g(context) : null, c0.b(context));
        }
        if (f0.i()) {
            return g0.a(c0.c(context), c0.b(context));
        }
        if (f0.p()) {
            return g0.a(c0.k(context), c0.b(context));
        }
        return f0.o() ? g0.a(c0.i(context), c0.b(context)) : c0.b(context);
    }

    static boolean b(Context context) {
        if (c.l()) {
            return Settings.canDrawOverlays(context);
        }
        if (c.i()) {
            return e0.d(context, "OP_SYSTEM_ALERT_WINDOW", 24);
        }
        return true;
    }
}
