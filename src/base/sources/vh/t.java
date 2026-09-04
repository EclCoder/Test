package vh;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class t extends s {
    t() {
    }

    @Override // vh.s, vh.r, vh.q, vh.p, vh.o, vh.n, vh.m
    public boolean a(Context context, String str) {
        return e0.g(str, "android.permission.ACCEPT_HANDOVER") ? e0.e(context, str) : super.a(context, str);
    }

    @Override // vh.s, vh.r, vh.q, vh.p, vh.o, vh.n, vh.m
    public boolean b(Activity activity, String str) {
        if (e0.g(str, "android.permission.ACCEPT_HANDOVER")) {
            return (e0.e(activity, str) || e0.u(activity, str)) ? false : true;
        }
        return super.b(activity, str);
    }
}
