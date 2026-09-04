package j5;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.q;
import androidx.work.u;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import i5.p;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class n implements q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f42055c = androidx.work.l.f("WorkProgressUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WorkDatabase f42056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final k5.a f42057b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ UUID f42058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.e f42059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f42060c;

        a(UUID uuid, androidx.work.e eVar, androidx.work.impl.utils.futures.c cVar) {
            this.f42058a = uuid;
            this.f42059b = eVar;
            this.f42060c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String string = this.f42058a.toString();
            androidx.work.l lVarC = androidx.work.l.c();
            String str = n.f42055c;
            lVarC.a(str, String.format("Updating progress for %s (%s)", this.f42058a, this.f42059b), new Throwable[0]);
            n.this.f42056a.c();
            try {
                p pVarG = n.this.f42056a.B().g(string);
                if (pVarG == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (pVarG.f41041b == u.RUNNING) {
                    n.this.f42056a.A().a(new i5.m(string, this.f42059b));
                } else {
                    androidx.work.l.c().h(str, String.format(jyeoXJ.TyEA, string), new Throwable[0]);
                }
                this.f42060c.o(null);
                n.this.f42056a.r();
            } catch (Throwable th2) {
                try {
                    androidx.work.l.c().b(n.f42055c, "Error updating Worker progress", th2);
                    this.f42060c.p(th2);
                } finally {
                    n.this.f42056a.g();
                }
            }
        }
    }

    public n(WorkDatabase workDatabase, k5.a aVar) {
        this.f42056a = workDatabase;
        this.f42057b = aVar;
    }

    @Override // androidx.work.q
    public ListenableFuture a(Context context, UUID uuid, androidx.work.e eVar) {
        androidx.work.impl.utils.futures.c cVarS = androidx.work.impl.utils.futures.c.s();
        this.f42057b.b(new a(uuid, eVar, cVarS));
        return cVarS;
    }
}
