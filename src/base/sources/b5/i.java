package b5;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.l;
import androidx.work.o;
import androidx.work.r;
import androidx.work.v;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class i extends v {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f8437j = l.f("WorkManagerImpl");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static i f8438k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static i f8439l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f8440m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.work.b f8442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WorkDatabase f8443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private k5.a f8444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f8445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f8446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j5.f f8447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f8449i;

    public i(Context context, androidx.work.b bVar, k5.a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(r.f8004a));
    }

    public static void e(Context context, androidx.work.b bVar) {
        synchronized (f8440m) {
            try {
                i iVar = f8438k;
                if (iVar != null && f8439l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (iVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f8439l == null) {
                        f8439l = new i(applicationContext, bVar, new k5.b(bVar.l()));
                    }
                    f8438k = f8439l;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static i j() {
        synchronized (f8440m) {
            try {
                i iVar = f8438k;
                if (iVar != null) {
                    return iVar;
                }
                return f8439l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static i k(Context context) {
        i iVarJ;
        synchronized (f8440m) {
            try {
                iVarJ = j();
                if (iVarJ == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVarJ;
    }

    private void q(Context context, androidx.work.b bVar, k5.a aVar, WorkDatabase workDatabase, List list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f8441a = applicationContext;
        this.f8442b = bVar;
        this.f8444d = aVar;
        this.f8443c = workDatabase;
        this.f8445e = list;
        this.f8446f = dVar;
        this.f8447g = new j5.f(workDatabase);
        this.f8448h = false;
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f8444d.b(new ForceStopRunnable(applicationContext, this));
    }

    @Override // androidx.work.v
    public o a(String str) {
        j5.a aVarD = j5.a.d(str, this);
        this.f8444d.b(aVarD);
        return aVarD.e();
    }

    @Override // androidx.work.v
    public o c(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new g(this, list).a();
    }

    public o f(UUID uuid) {
        j5.a aVarB = j5.a.b(uuid, this);
        this.f8444d.b(aVarB);
        return aVarB.e();
    }

    public List g(Context context, androidx.work.b bVar, k5.a aVar) {
        return Arrays.asList(f.a(context, this), new c5.b(context, bVar, aVar, this));
    }

    public Context h() {
        return this.f8441a;
    }

    public androidx.work.b i() {
        return this.f8442b;
    }

    public j5.f l() {
        return this.f8447g;
    }

    public d m() {
        return this.f8446f;
    }

    public List n() {
        return this.f8445e;
    }

    public WorkDatabase o() {
        return this.f8443c;
    }

    public k5.a p() {
        return this.f8444d;
    }

    public void r() {
        synchronized (f8440m) {
            try {
                this.f8448h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f8449i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f8449i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s() {
        d5.b.b(h());
        o().B().k();
        f.b(i(), o(), n());
    }

    public void t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f8440m) {
            try {
                this.f8449i = pendingResult;
                if (this.f8448h) {
                    pendingResult.finish();
                    this.f8449i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void u(String str) {
        v(str, null);
    }

    public void v(String str, WorkerParameters.a aVar) {
        this.f8444d.b(new j5.i(this, str, aVar));
    }

    public void w(String str) {
        this.f8444d.b(new j5.j(this, str, true));
    }

    public void x(String str) {
        this.f8444d.b(new j5.j(this, str, false));
    }

    public i(Context context, androidx.work.b bVar, k5.a aVar, boolean z10) {
        this(context, bVar, aVar, WorkDatabase.s(context.getApplicationContext(), aVar.getBackgroundExecutor(), z10));
    }

    public i(Context context, androidx.work.b bVar, k5.a aVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        l.e(new l.a(bVar.j()));
        List listG = g(applicationContext, bVar, aVar);
        q(context, bVar, aVar, workDatabase, listG, new d(context, bVar, aVar, workDatabase, listG));
    }
}
