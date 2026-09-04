package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.i0;
import androidx.work.l;
import j5.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends i0 implements e.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f7870d = l.f("SystemAlarmService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f7871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7872c;

    private void e() {
        e eVar = new e(this);
        this.f7871b = eVar;
        eVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void b() {
        this.f7872c = true;
        l.c().a(f7870d, "All commands completed in dispatcher", new Throwable[0]);
        k.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.i0, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f7872c = false;
    }

    @Override // androidx.lifecycle.i0, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f7872c = true;
        this.f7871b.j();
    }

    @Override // androidx.lifecycle.i0, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f7872c) {
            l.c().d(f7870d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f7871b.j();
            e();
            this.f7872c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f7871b.a(intent, i11);
        return 3;
    }
}
