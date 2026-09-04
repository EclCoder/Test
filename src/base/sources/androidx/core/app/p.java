package androidx.core.app;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f3302c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Set f3303d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f3304e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotificationManager f3306b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    private p(Context context) {
        this.f3305a = context;
        this.f3306b = (NotificationManager) context.getSystemService("notification");
    }

    public static p b(Context context) {
        return new p(context);
    }

    public boolean a() {
        return a.a(this.f3306b);
    }
}
