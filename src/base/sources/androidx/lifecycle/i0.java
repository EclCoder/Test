package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends Service implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j1 f4396a = new j1(this);

    @Override // androidx.lifecycle.b0
    public s getLifecycle() {
        return this.f4396a.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        kotlin.jvm.internal.s.h(intent, "intent");
        this.f4396a.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f4396a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f4396a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        this.f4396a.e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
