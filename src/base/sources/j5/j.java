package j5;

import androidx.work.impl.WorkDatabase;
import androidx.work.u;
import i5.q;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class j implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f42029d = androidx.work.l.f("StopWorkRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b5.i f42030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f42032c;

    public j(b5.i iVar, String str, boolean z10) {
        this.f42030a = iVar;
        this.f42031b = str;
        this.f42032c = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zO;
        WorkDatabase workDatabaseO = this.f42030a.o();
        b5.d dVarM = this.f42030a.m();
        q qVarB = workDatabaseO.B();
        workDatabaseO.c();
        try {
            boolean zH = dVarM.h(this.f42031b);
            if (this.f42032c) {
                zO = this.f42030a.m().n(this.f42031b);
            } else {
                if (!zH && qVarB.f(this.f42031b) == u.RUNNING) {
                    qVarB.a(u.ENQUEUED, this.f42031b);
                }
                zO = this.f42030a.m().o(this.f42031b);
            }
            androidx.work.l.c().a(f42029d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f42031b, Boolean.valueOf(zO)), new Throwable[0]);
            workDatabaseO.r();
        } finally {
            workDatabaseO.g();
        }
    }
}
