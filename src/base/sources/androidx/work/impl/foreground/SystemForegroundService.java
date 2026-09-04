package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i0;
import androidx.work.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends i0 implements androidx.work.impl.foreground.a.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f7913f = l.f("SystemFgService");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static SystemForegroundService f7914g = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f7915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.work.impl.foreground.a f7917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    NotificationManager f7918e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Notification f7920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7921c;

        a(int i10, Notification notification, int i11) {
            this.f7919a = i10;
            this.f7920b = notification;
            this.f7921c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f7919a, this.f7920b, this.f7921c);
            } else {
                SystemForegroundService.this.startForeground(this.f7919a, this.f7920b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Notification f7924b;

        b(int i10, Notification notification) {
            this.f7923a = i10;
            this.f7924b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f7918e.notify(this.f7923a, this.f7924b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7926a;

        c(int i10) {
            this.f7926a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f7918e.cancel(this.f7926a);
        }
    }

    private void e() {
        this.f7915b = new Handler(Looper.getMainLooper());
        this.f7918e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f7917d = aVar;
        aVar.m(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void a(int i10, Notification notification) {
        this.f7915b.post(new b(i10, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i10, int i11, Notification notification) {
        this.f7915b.post(new a(i10, notification, i11));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i10) {
        this.f7915b.post(new c(i10));
    }

    @Override // androidx.lifecycle.i0, android.app.Service
    public void onCreate() {
        super.onCreate();
        f7914g = this;
        e();
    }

    @Override // androidx.lifecycle.i0, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f7917d.k();
    }

    @Override // androidx.lifecycle.i0, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f7916c) {
            l.c().d(f7913f, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f7917d.k();
            e();
            this.f7916c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f7917d.l(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f7916c = true;
        l.c().a(f7913f, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f7914g = null;
        stopSelf();
    }
}
