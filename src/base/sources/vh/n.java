package vh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.VpnService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class n implements m {
    n() {
    }

    private static Intent d(Context context) {
        Intent intentPrepare = VpnService.prepare(context);
        return !e0.a(context, intentPrepare) ? c0.b(context) : intentPrepare;
    }

    private static boolean e(Context context) {
        return VpnService.prepare(context) == null;
    }

    @Override // vh.m
    public boolean a(Context context, String str) {
        if (e0.g(str, "android.permission.BIND_VPN_SERVICE")) {
            return e(context);
        }
        return true;
    }

    @Override // vh.m
    public boolean b(Activity activity, String str) {
        return false;
    }

    @Override // vh.m
    public Intent c(Context context, String str) {
        return e0.g(str, "android.permission.BIND_VPN_SERVICE") ? d(context) : c0.b(context);
    }
}
