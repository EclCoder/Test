package j5;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f42017a = androidx.work.l.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z10) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            androidx.work.l.c().a(f42017a, String.format("%s %s", cls.getName(), z10 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e10) {
            androidx.work.l.c().a(f42017a, String.format("%s could not be %s", cls.getName(), z10 ? "enabled" : "disabled"), e10);
        }
    }
}
