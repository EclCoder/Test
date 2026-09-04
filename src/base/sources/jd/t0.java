package jd;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42384a;

    t0() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized String a(Context context) {
        try {
            if (this.f42384a == null) {
                this.f42384a = b(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return "".equals(this.f42384a) ? null : this.f42384a;
    }
}
