package ug;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.d;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.VideoReviewActivity;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f54450a = new b();

    private b() {
    }

    public final void a(Context context) {
        s.h(context, "context");
        Object systemService = context.getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            notificationManager.cancel(224);
        }
    }

    public final void b(Context context) {
        s.h(context, "context");
        Object systemService = context.getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            d.a();
            notificationManager.createNotificationChannel(c.a("az_saved", context.getString(R.string.notification_channel_saved), 4));
        }
        Intent intentAddFlags = new Intent(context, (Class<?>) VideoReviewActivity.class).addFlags(268435456);
        s.g(intentAddFlags, "addFlags(...)");
        Notification notificationB = new NotificationCompat.l(context, "az_saved").r(R.drawable.ic_record).i(context.getString(R.string.toast_video_saved)).h(context.getString(R.string.notification_saved_tap_to_view)).q(1).e(true).g(PendingIntent.getActivity(context, 0, intentAddFlags, 201326592)).b();
        s.g(notificationB, "build(...)");
        notificationManager.notify(224, notificationB);
    }
}
