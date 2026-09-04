package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f7125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f7126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f7127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final androidx.room.e f7128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final androidx.room.e.c f7129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.room.c f7130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Executor f7131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final androidx.room.b f7132h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final AtomicBoolean f7133i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ServiceConnection f7134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Runnable f7135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Runnable f7136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f7137m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends androidx.room.b.a {

        /* JADX INFO: renamed from: androidx.room.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0084a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String[] f7139a;

            RunnableC0084a(String[] strArr) {
                this.f7139a = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.f7128d.e(this.f7139a);
            }
        }

        a() {
        }

        @Override // androidx.room.b
        public void d(String[] strArr) {
            f.this.f7131g.execute(new RunnableC0084a(strArr));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            f.this.f7130f = androidx.room.c.a.B(iBinder);
            f fVar = f.this;
            fVar.f7131g.execute(fVar.f7135k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            f fVar = f.this;
            fVar.f7131g.execute(fVar.f7136l);
            f.this.f7130f = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f fVar = f.this;
                androidx.room.c cVar = fVar.f7130f;
                if (cVar != null) {
                    fVar.f7127c = cVar.o(fVar.f7132h, fVar.f7126b);
                    f fVar2 = f.this;
                    fVar2.f7128d.a(fVar2.f7129e);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", QGbBllacZSmHKn.WJdSRVPxl, e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f7128d.g(fVar.f7129e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f7128d.g(fVar.f7129e);
            try {
                f fVar2 = f.this;
                androidx.room.c cVar = fVar2.f7130f;
                if (cVar != null) {
                    cVar.A(fVar2.f7132h, fVar2.f7127c);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            f fVar3 = f.this;
            fVar3.f7125a.unbindService(fVar3.f7134j);
        }
    }

    /* JADX INFO: renamed from: androidx.room.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0085f extends androidx.room.e.c {
        C0085f(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.e.c
        boolean a() {
            return true;
        }

        @Override // androidx.room.e.c
        public void b(Set set) {
            if (f.this.f7133i.get()) {
                return;
            }
            try {
                f fVar = f.this;
                androidx.room.c cVar = fVar.f7130f;
                if (cVar != null) {
                    cVar.m(fVar.f7127c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    f(Context context, String str, androidx.room.e eVar, Executor executor) {
        b bVar = new b();
        this.f7134j = bVar;
        this.f7135k = new c();
        this.f7136l = new d();
        this.f7137m = new e();
        Context applicationContext = context.getApplicationContext();
        this.f7125a = applicationContext;
        this.f7126b = str;
        this.f7128d = eVar;
        this.f7131g = executor;
        this.f7129e = new C0085f((String[]) eVar.f7102a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, (Class<?>) MultiInstanceInvalidationService.class), bVar, 1);
    }
}
