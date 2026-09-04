package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.l;
import b5.i;
import j5.h;
import j5.k;
import j5.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e implements b5.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f7893k = l.f("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f7894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k5.a f7895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f7896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b5.d f7897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f7898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f7899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f7900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final List f7901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Intent f7902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f7903j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.f7901h) {
                e eVar2 = e.this;
                eVar2.f7902i = (Intent) eVar2.f7901h.get(0);
            }
            Intent intent = e.this.f7902i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.f7902i.getIntExtra("KEY_START_ID", 0);
                l lVarC = l.c();
                String str = e.f7893k;
                lVarC.a(str, String.format("Processing command %s, %s", e.this.f7902i, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockB = k.b(e.this.f7894a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    l.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                    wakeLockB.acquire();
                    e eVar3 = e.this;
                    eVar3.f7899f.o(eVar3.f7902i, intExtra, eVar3);
                    l.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                    wakeLockB.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th2) {
                    try {
                        l lVarC2 = l.c();
                        String str2 = e.f7893k;
                        lVarC2.b(str2, "Unexpected error in onHandleIntent", th2);
                        l.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                        wakeLockB.release();
                        eVar = e.this;
                        dVar = new d(eVar);
                    } catch (Throwable th3) {
                        l.c().a(e.f7893k, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                        wakeLockB.release();
                        e eVar4 = e.this;
                        eVar4.k(new d(eVar4));
                        throw th3;
                    }
                }
                eVar.k(dVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f7905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Intent f7906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7907c;

        b(e eVar, Intent intent, int i10) {
            this.f7905a = eVar;
            this.f7906b = intent;
            this.f7907c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7905a.a(this.f7906b, this.f7907c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface c {
        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f7908a;

        d(e eVar) {
            this.f7908a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7908a.c();
        }
    }

    e(Context context) {
        this(context, null, null);
    }

    private void b() {
        if (this.f7900g.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        b();
        synchronized (this.f7901h) {
            try {
                Iterator it = this.f7901h.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void l() {
        b();
        PowerManager.WakeLock wakeLockB = k.b(this.f7894a, "ProcessCommand");
        try {
            wakeLockB.acquire();
            this.f7898e.p().b(new a());
        } finally {
            wakeLockB.release();
        }
    }

    public boolean a(Intent intent, int i10) {
        l lVarC = l.c();
        String str = f7893k;
        lVarC.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            l.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f7901h) {
            try {
                boolean zIsEmpty = this.f7901h.isEmpty();
                this.f7901h.add(intent);
                if (zIsEmpty) {
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    void c() {
        l lVarC = l.c();
        String str = f7893k;
        lVarC.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.f7901h) {
            try {
                if (this.f7902i != null) {
                    l.c().a(str, String.format("Removing command %s", this.f7902i), new Throwable[0]);
                    if (!((Intent) this.f7901h.remove(0)).equals(this.f7902i)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f7902i = null;
                }
                h backgroundExecutor = this.f7895b.getBackgroundExecutor();
                if (!this.f7899f.n() && this.f7901h.isEmpty() && !backgroundExecutor.a()) {
                    l.c().a(str, "No more commands & intents.", new Throwable[0]);
                    c cVar = this.f7903j;
                    if (cVar != null) {
                        cVar.b();
                    }
                } else if (!this.f7901h.isEmpty()) {
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // b5.b
    public void d(String str, boolean z10) {
        k(new b(this, androidx.work.impl.background.systemalarm.b.c(this.f7894a, str, z10), 0));
    }

    b5.d e() {
        return this.f7897d;
    }

    k5.a f() {
        return this.f7895b;
    }

    i g() {
        return this.f7898e;
    }

    o h() {
        return this.f7896c;
    }

    void j() {
        l.c().a(f7893k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f7897d.i(this);
        this.f7896c.a();
        this.f7903j = null;
    }

    void k(Runnable runnable) {
        this.f7900g.post(runnable);
    }

    void m(c cVar) {
        if (this.f7903j != null) {
            l.c().b(f7893k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f7903j = cVar;
        }
    }

    e(Context context, b5.d dVar, i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.f7894a = applicationContext;
        this.f7899f = new androidx.work.impl.background.systemalarm.b(applicationContext);
        this.f7896c = new o();
        iVar = iVar == null ? i.k(context) : iVar;
        this.f7898e = iVar;
        dVar = dVar == null ? iVar.m() : dVar;
        this.f7897d = dVar;
        this.f7895b = iVar.p();
        dVar.c(this);
        this.f7901h = new ArrayList();
        this.f7902i = null;
        this.f7900g = new Handler(Looper.getMainLooper());
    }
}
