package ug;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.app.y;
import bm.r;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.google.android.gms.ads.internal.util.d;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.HomeActivity;
import com.hecorat.screenrecorder.free.activities.MainActivity;
import com.hecorat.screenrecorder.free.activities.NotificationClickActivity;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import nh.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0819a f54443f = new C0819a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f54444g = {R.layout.small_recorder_noti_layout, R.layout.big_recorder_noti_layout, R.drawable.ic_bubble_record, R.drawable.ic_home_top_left, R.drawable.ic_toolbox, R.drawable.ic_live, R.drawable.ic_close_circle, R.drawable.ic_bubble_stop, R.drawable.ic_bubble_pause, R.drawable.ic_bubble_resume};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f54445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotificationManager f54446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lg.a f54447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f54448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f54449e;

    /* JADX INFO: renamed from: ug.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class C0819a {
        public /* synthetic */ C0819a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0819a() {
        }
    }

    public a(Context context, NotificationManager notificationManager, lg.a preferenceManager) {
        s.h(context, "context");
        s.h(notificationManager, "notificationManager");
        s.h(preferenceManager, "preferenceManager");
        this.f54445a = context;
        this.f54446b = notificationManager;
        this.f54447c = preferenceManager;
        this.f54448d = Build.VERSION.SDK_INT >= 34 ? 1073741824 : 0;
    }

    private final RemoteViews e(Context context, int i10, int i11, PendingIntent pendingIntent) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.notification_action_btn_layout);
        remoteViews.setImageViewResource(R.id.action_iv, i10);
        remoteViews.setTextViewText(R.id.action_tv, context.getText(i11));
        remoteViews.setOnClickPendingIntent(R.id.action_layout, pendingIntent);
        return remoteViews;
    }

    private final PendingIntent f(Context context) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(268468224);
        intent.putExtra("exit_app", true);
        PendingIntent activity = PendingIntent.getActivity(context, 1102, intent, h());
        s.g(activity, "getActivity(...)");
        return activity;
    }

    private final PendingIntent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) HomeActivity.class);
        intent.addFlags(268468224);
        intent.putExtra("fragment_code", 0);
        intent.putExtra("show_open_app_ads", true);
        PendingIntent activity = PendingIntent.getActivity(context, 244, intent, h());
        s.g(activity, "getActivity(...)");
        return activity;
    }

    private final int h() {
        return Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
    }

    private final PendingIntent i(Context context, String str, int i10) {
        Intent intent = new Intent(context, (Class<?>) NotificationClickActivity.class);
        intent.setFlags(268435456);
        intent.setAction(str);
        PendingIntent activity = PendingIntent.getActivity(context, i10, intent, h());
        s.g(activity, "getActivity(...)");
        return activity;
    }

    private final void k(Service service) {
        RemoteViews remoteViews = new RemoteViews(this.f54445a.getPackageName(), R.layout.notification_live_small);
        PendingIntent pendingIntentI = i(this.f54445a, "action_stop_live", 1007);
        Context context = this.f54445a;
        int[] iArr = f54444g;
        RemoteViews remoteViewsE = e(context, iArr[7], R.string.stop, pendingIntentI);
        Context context2 = this.f54445a;
        RemoteViews remoteViewsE2 = e(context2, iArr[4], R.string.tools, i(context2, "action_open_tool", 255));
        NotificationCompat.l lVar = new NotificationCompat.l(this.f54445a, "Az Screen Recorder");
        lVar.k(remoteViews);
        lVar.j(remoteViews);
        lVar.r(R.drawable.ic_record);
        if (Build.VERSION.SDK_INT < 26) {
            lVar.q(2);
        }
        lVar.p(true);
        remoteViews.addView(R.id.buttons_ll, remoteViewsE);
        remoteViews.addView(R.id.buttons_ll, remoteViewsE2);
        y.a(service, Sdk$SDKError.b.INVALID_WATERFALL_PLACEMENT_ID_VALUE, lVar.b(), this.f54448d);
    }

    private final void n(Service service, int i10) {
        String message;
        String message2;
        String message3;
        String packageName = this.f54445a.getPackageName();
        int[] iArr = f54444g;
        RemoteViews remoteViews = new RemoteViews(packageName, iArr[0]);
        RemoteViews remoteViews2 = new RemoteViews(this.f54445a.getPackageName(), iArr[1]);
        remoteViews.removeAllViews(R.id.buttons_ll);
        remoteViews2.removeAllViews(R.id.buttons_ll);
        NotificationCompat.l lVar = new NotificationCompat.l(this.f54445a, "Az Screen Recorder");
        lVar.k(remoteViews);
        lVar.j(remoteViews2);
        lVar.r(R.drawable.ic_record);
        if (Build.VERSION.SDK_INT < 26) {
            lVar.q(2);
        }
        lVar.p(true);
        Context context = this.f54445a;
        RemoteViews remoteViewsE = e(context, iArr[4], R.string.tools, i(context, "action_open_tool", 255));
        PendingIntent pendingIntentI = i(this.f54445a, "action_stop_record", 1001);
        RemoteViews remoteViewsE2 = e(this.f54445a, iArr[7], R.string.stop, pendingIntentI);
        if (i10 == 0) {
            PendingIntent pendingIntentI2 = i(this.f54445a, "action_start_record", 200);
            RemoteViews remoteViewsE3 = e(this.f54445a, iArr[2], R.string.record, pendingIntentI2);
            Context context2 = this.f54445a;
            RemoteViews remoteViewsE4 = e(context2, iArr[3], R.string.videos, g(context2));
            Context context3 = this.f54445a;
            RemoteViews remoteViewsE5 = e(context3, iArr[5], R.string.live, i(context3, "action_open_live", 254));
            Context context4 = this.f54445a;
            RemoteViews remoteViewsE6 = e(context4, iArr[6], R.string.exit, f(context4));
            remoteViews.addView(R.id.buttons_ll, remoteViewsE3);
            remoteViews2.addView(R.id.buttons_ll, remoteViewsE3);
            remoteViews.addView(R.id.buttons_ll, remoteViewsE4);
            remoteViews2.addView(R.id.buttons_ll, remoteViewsE4);
            remoteViews.addView(R.id.buttons_ll, remoteViewsE);
            remoteViews2.addView(R.id.buttons_ll, remoteViewsE);
            remoteViews.addView(R.id.buttons_ll, remoteViewsE5);
            remoteViews2.addView(R.id.buttons_ll, remoteViewsE5);
            remoteViews.addView(R.id.buttons_ll, remoteViewsE6);
            remoteViews2.addView(R.id.buttons_ll, remoteViewsE6);
            remoteViews.setOnClickPendingIntent(R.id.header_ll, pendingIntentI2);
            remoteViews2.setOnClickPendingIntent(R.id.header_ll, pendingIntentI2);
            remoteViews2.setTextViewText(R.id.header_title_tv, this.f54445a.getString(R.string.notification_idle_title));
            remoteViews2.setTextViewText(R.id.header_content_tv, this.f54445a.getString(R.string.notification_idle_content));
        } else if (i10 == 1) {
            Context context5 = this.f54445a;
            RemoteViews remoteViewsE7 = e(context5, iArr[8], R.string.pause, i(context5, "action_pause_or_resume", 66));
            remoteViews.addView(R.id.buttons_ll, remoteViewsE7);
            remoteViews2.addView(R.id.buttons_ll, remoteViewsE7);
            remoteViews.addView(R.id.buttons_ll, remoteViewsE2);
            remoteViews2.addView(R.id.buttons_ll, remoteViewsE2);
            remoteViews.addView(R.id.buttons_ll, remoteViewsE);
            remoteViews2.addView(R.id.buttons_ll, remoteViewsE);
            remoteViews.setOnClickPendingIntent(R.id.header_ll, pendingIntentI);
            remoteViews2.setOnClickPendingIntent(R.id.header_ll, pendingIntentI);
            remoteViews2.setTextViewText(R.id.header_title_tv, this.f54445a.getString(R.string.notification_recording_title));
            remoteViews2.setTextViewText(R.id.header_content_tv, this.f54445a.getString(R.string.notification_recording_content));
        } else if (i10 == 2) {
            PendingIntent pendingIntentI3 = i(this.f54445a, "action_pause_or_resume", 77);
            RemoteViews remoteViewsE8 = e(this.f54445a, iArr[9], R.string.resume, pendingIntentI3);
            remoteViews.addView(R.id.buttons_ll, remoteViewsE8);
            remoteViews2.addView(R.id.buttons_ll, remoteViewsE8);
            remoteViews.addView(R.id.buttons_ll, remoteViewsE2);
            remoteViews2.addView(R.id.buttons_ll, remoteViewsE2);
            remoteViews.addView(R.id.buttons_ll, remoteViewsE);
            remoteViews2.addView(R.id.buttons_ll, remoteViewsE);
            remoteViews.setOnClickPendingIntent(R.id.header_ll, pendingIntentI3);
            remoteViews2.setOnClickPendingIntent(R.id.header_ll, pendingIntentI3);
            remoteViews2.setTextViewText(R.id.header_title_tv, this.f54445a.getString(R.string.notification_pausing_title));
            remoteViews2.setTextViewText(R.id.header_content_tv, this.f54445a.getString(R.string.notification_pausing_content));
        }
        try {
            y.a(service, Sdk$SDKError.b.INVALID_WATERFALL_PLACEMENT_ID_VALUE, lVar.b(), this.f54448d);
        } catch (Exception e10) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29 && (message3 = e10.getMessage()) != null && r.T(message3, "android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION", false, 2, null)) {
                this.f54448d = c.a(this.f54448d, 32);
            }
            if (i11 >= 30 && (message2 = e10.getMessage()) != null && r.T(message2, "android.permission.FOREGROUND_SERVICE_CAMERA", false, 2, null)) {
                this.f54447c.j(R.string.pref_show_camera, false);
                this.f54448d = c.a(this.f54448d, 64);
            }
            if (i11 >= 30 && (message = e10.getMessage()) != null && r.T(message, "android.permission.FOREGROUND_SERVICE_MICROPHONE", false, 2, null)) {
                this.f54448d = c.a(this.f54448d, 128);
            }
            y.a(service, Sdk$SDKError.b.INVALID_WATERFALL_PLACEMENT_ID_VALUE, lVar.b(), this.f54448d);
            wp.a.a("Exception: " + e10.getMessage(), new Object[0]);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    public final void a(Service service) {
        s.h(service, "service");
        if (Build.VERSION.SDK_INT >= 30) {
            this.f54448d |= 64;
            l(service, this.f54449e);
        }
    }

    public final void c(Service service) {
        s.h(service, "service");
        int i10 = this.f54449e;
        if (i10 == 0) {
            this.f54448d |= 32;
        }
        l(service, i10);
    }

    public final void d() {
        this.f54446b.cancel(Sdk$SDKError.b.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
    }

    public final void j(Service service) {
        s.h(service, "service");
        if (Build.VERSION.SDK_INT >= 30) {
            this.f54448d = c.a(this.f54448d, 64);
            l(service, this.f54449e);
        }
    }

    public final void l(Service service, int i10) {
        s.h(service, "service");
        this.f54449e = i10;
        if (Build.VERSION.SDK_INT >= 26) {
            d.a();
            NotificationChannel notificationChannelA = com.google.android.gms.ads.internal.util.c.a("Az Screen Recorder", "Record Notification", 3);
            notificationChannelA.enableLights(false);
            notificationChannelA.enableVibration(false);
            notificationChannelA.setSound(null, null);
            this.f54446b.createNotificationChannel(notificationChannelA);
        }
        if (i10 != 3) {
            n(service, i10);
        } else {
            k(service);
        }
    }

    public final void m(Service service) {
        s.h(service, "service");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                d.a();
                NotificationChannel notificationChannelA = com.google.android.gms.ads.internal.util.c.a("Az Screen Recorder", "Record Notification", 3);
                notificationChannelA.enableLights(false);
                notificationChannelA.enableVibration(false);
                notificationChannelA.setSound(null, null);
                this.f54446b.createNotificationChannel(notificationChannelA);
            }
            Notification notificationB = new NotificationCompat.l(this.f54445a, "Az Screen Recorder").r(R.drawable.ic_record).p(true).b();
            s.g(notificationB, "build(...)");
            y.a(service, Sdk$SDKError.b.INVALID_WATERFALL_PLACEMENT_ID_VALUE, notificationB, this.f54448d);
        } catch (Exception e10) {
            wp.a.f(e10, "Failed to show placeholder notification", new Object[0]);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    public final void o(Service service) {
        s.h(service, "service");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.f54448d = c.a(this.f54448d, 32);
        }
        if (i10 >= 30) {
            this.f54448d = c.a(this.f54448d, 128);
        }
        l(service, 0);
    }

    public final void p(Service service) {
        s.h(service, "service");
        this.f54448d = c.a(this.f54448d, 32);
        l(service, 0);
    }

    public final void b(Service service) {
        s.h(service, "service");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.f54448d |= 32;
        }
        if (lg.c.e() && i10 >= 30) {
            wp.a.a(giNWGaNAgVQoO.uVbgzpXyfW, new Object[0]);
            this.f54448d |= 128;
        }
        l(service, this.f54449e);
    }
}
