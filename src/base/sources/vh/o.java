package vh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class o extends n {
    o() {
    }

    @Override // vh.n, vh.m
    public boolean a(Context context, String str) {
        return e0.g(str, "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE") ? f.b(context) : super.a(context, str);
    }

    @Override // vh.n, vh.m
    public boolean b(Activity activity, String str) {
        if (e0.g(str, "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE")) {
            return false;
        }
        return super.b(activity, str);
    }

    @Override // vh.n, vh.m
    public Intent c(Context context, String str) {
        return e0.g(str, "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE") ? f.a(context) : super.c(context, str);
    }
}
