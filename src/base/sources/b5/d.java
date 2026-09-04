package b5;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import com.google.common.util.concurrent.ListenableFuture;
import j5.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d implements b, h5.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f8409l = l.f("Processor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f8411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.work.b f8412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private k5.a f8413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WorkDatabase f8414e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f8417h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f8416g = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f8415f = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Set f8418i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f8419j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PowerManager.WakeLock f8410a = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f8420k = new Object();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f8421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f8422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ListenableFuture f8423c;

        a(b bVar, String str, ListenableFuture listenableFuture) {
            this.f8421a = bVar;
            this.f8422b = str;
            this.f8423c = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((Boolean) this.f8423c.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f8421a.d(this.f8422b, zBooleanValue);
        }
    }

    public d(Context context, androidx.work.b bVar, k5.a aVar, WorkDatabase workDatabase, List list) {
        this.f8411b = context;
        this.f8412c = bVar;
        this.f8413d = aVar;
        this.f8414e = workDatabase;
        this.f8417h = list;
    }

    private static boolean e(String str, j jVar) {
        if (jVar == null) {
            l.c().a(f8409l, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        jVar.d();
        l.c().a(f8409l, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    private void m() {
        synchronized (this.f8420k) {
            try {
                if (this.f8415f.isEmpty()) {
                    try {
                        this.f8411b.startService(androidx.work.impl.foreground.a.e(this.f8411b));
                    } catch (Throwable th2) {
                        l.c().b(f8409l, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f8410a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f8410a = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // h5.a
    public void a(String str) {
        synchronized (this.f8420k) {
            this.f8415f.remove(str);
            m();
        }
    }

    @Override // h5.a
    public void b(String str, androidx.work.g gVar) {
        synchronized (this.f8420k) {
            try {
                l.c().d(f8409l, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
                j jVar = (j) this.f8416g.remove(str);
                if (jVar != null) {
                    if (this.f8410a == null) {
                        PowerManager.WakeLock wakeLockB = k.b(this.f8411b, "ProcessorForegroundLck");
                        this.f8410a = wakeLockB;
                        wakeLockB.acquire();
                    }
                    this.f8415f.put(str, jVar);
                    androidx.core.content.a.startForegroundService(this.f8411b, androidx.work.impl.foreground.a.c(this.f8411b, str, gVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(b bVar) {
        synchronized (this.f8420k) {
            this.f8419j.add(bVar);
        }
    }

    @Override // b5.b
    public void d(String str, boolean z10) {
        synchronized (this.f8420k) {
            try {
                this.f8416g.remove(str);
                l.c().a(f8409l, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z10)), new Throwable[0]);
                Iterator it = this.f8419j.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).d(str, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean f(String str) {
        boolean zContains;
        synchronized (this.f8420k) {
            zContains = this.f8418i.contains(str);
        }
        return zContains;
    }

    public boolean g(String str) {
        boolean z10;
        synchronized (this.f8420k) {
            try {
                z10 = this.f8416g.containsKey(str) || this.f8415f.containsKey(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean h(String str) {
        boolean zContainsKey;
        synchronized (this.f8420k) {
            zContainsKey = this.f8415f.containsKey(str);
        }
        return zContainsKey;
    }

    public void i(b bVar) {
        synchronized (this.f8420k) {
            this.f8419j.remove(bVar);
        }
    }

    public boolean j(String str) {
        return k(str, null);
    }

    public boolean k(String str, WorkerParameters.a aVar) throws Throwable {
        Throwable th2;
        synchronized (this.f8420k) {
            try {
                try {
                    if (!g(str)) {
                        j jVarA = new j.c(this.f8411b, this.f8412c, this.f8413d, this, this.f8414e, str).c(this.f8417h).b(aVar).a();
                        ListenableFuture listenableFutureB = jVarA.b();
                        listenableFutureB.addListener(new a(this, str, listenableFutureB), this.f8413d.a());
                        this.f8416g.put(str, jVarA);
                        this.f8413d.getBackgroundExecutor().execute(jVarA);
                        l.c().a(f8409l, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
                        return true;
                    }
                    try {
                        l.c().a(f8409l, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                        return false;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
            }
            throw th2;
        }
    }

    public boolean l(String str) {
        boolean zE;
        synchronized (this.f8420k) {
            try {
                l.c().a(f8409l, String.format("Processor cancelling %s", str), new Throwable[0]);
                this.f8418i.add(str);
                j jVar = (j) this.f8415f.remove(str);
                boolean z10 = jVar != null;
                if (jVar == null) {
                    jVar = (j) this.f8416g.remove(str);
                }
                zE = e(str, jVar);
                if (z10) {
                    m();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zE;
    }

    public boolean n(String str) {
        boolean zE;
        synchronized (this.f8420k) {
            l.c().a(f8409l, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zE = e(str, (j) this.f8415f.remove(str));
        }
        return zE;
    }

    public boolean o(String str) {
        boolean zE;
        synchronized (this.f8420k) {
            l.c().a(f8409l, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zE = e(str, (j) this.f8416g.remove(str));
        }
        return zE;
    }
}
