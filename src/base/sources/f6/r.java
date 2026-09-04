package f6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile r f38275d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f38276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f38277b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38278c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements m6.f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f38279a;

        a(Context context) {
            this.f38279a = context;
        }

        @Override // m6.f.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f38279a.getSystemService("connectivity");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements f6.b.a {
        b() {
        }

        @Override // f6.b.a
        public void a(boolean z10) {
            ArrayList arrayList;
            m6.l.a();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.f38277b);
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((f6.b.a) obj).a(z10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface c {
        void a();

        boolean b();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f38282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final f6.b.a f38283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final m6.f.b f38284c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f38285d = new a();

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: f6.r$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            class RunnableC0574a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f38287a;

                RunnableC0574a(boolean z10) {
                    this.f38287a = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f38287a);
                }
            }

            a() {
            }

            private void b(boolean z10) {
                m6.l.v(new RunnableC0574a(z10));
            }

            void a(boolean z10) {
                m6.l.a();
                d dVar = d.this;
                boolean z11 = dVar.f38282a;
                dVar.f38282a = z10;
                if (z11 != z10) {
                    dVar.f38283b.a(z10);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                b(false);
            }
        }

        d(m6.f.b bVar, f6.b.a aVar) {
            this.f38284c = bVar;
            this.f38283b = aVar;
        }

        @Override // f6.r.c
        public void a() {
            ((ConnectivityManager) this.f38284c.get()).unregisterNetworkCallback(this.f38285d);
        }

        @Override // f6.r.c
        public boolean b() {
            this.f38282a = ((ConnectivityManager) this.f38284c.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f38284c.get()).registerDefaultNetworkCallback(this.f38285d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }
    }

    private r(Context context) {
        this.f38276a = new d(m6.f.a(new a(context)), new b());
    }

    static r a(Context context) {
        if (f38275d == null) {
            synchronized (r.class) {
                try {
                    if (f38275d == null) {
                        f38275d = new r(context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f38275d;
    }

    private void b() {
        if (this.f38278c || this.f38277b.isEmpty()) {
            return;
        }
        this.f38278c = this.f38276a.b();
    }

    private void c() {
        if (this.f38278c && this.f38277b.isEmpty()) {
            this.f38276a.a();
            this.f38278c = false;
        }
    }

    synchronized void d(f6.b.a aVar) {
        this.f38277b.add(aVar);
        b();
    }

    synchronized void e(f6.b.a aVar) {
        this.f38277b.remove(aVar);
        c();
    }
}
