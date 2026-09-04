package b4;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8349a;

    public h(Context context) {
        this.f8349a = context;
    }

    public final Object a() {
        Context context = this.f8349a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }

    public final Context b() {
        return this.f8349a;
    }

    public final String c(int i10) {
        try {
            Context context = this.f8349a;
            kotlin.jvm.internal.s.e(context);
            String resourceName = context.getResources().getResourceName(i10);
            kotlin.jvm.internal.s.e(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i10);
        }
    }
}
