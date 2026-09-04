package c5;

import androidx.work.l;
import androidx.work.s;
import i5.p;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f9559d = l.f("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f9560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f9561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f9562c = new HashMap();

    /* JADX INFO: renamed from: c5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0127a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f9563a;

        RunnableC0127a(p pVar) {
            this.f9563a = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l.c().a(a.f9559d, String.format("Scheduling work %s", this.f9563a.f41040a), new Throwable[0]);
            a.this.f9560a.e(this.f9563a);
        }
    }

    public a(b bVar, s sVar) {
        this.f9560a = bVar;
        this.f9561b = sVar;
    }

    public void a(p pVar) {
        Runnable runnable = (Runnable) this.f9562c.remove(pVar.f41040a);
        if (runnable != null) {
            this.f9561b.a(runnable);
        }
        RunnableC0127a runnableC0127a = new RunnableC0127a(pVar);
        this.f9562c.put(pVar.f41040a, runnableC0127a);
        this.f9561b.b(pVar.a() - System.currentTimeMillis(), runnableC0127a);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.f9562c.remove(str);
        if (runnable != null) {
            this.f9561b.a(runnable);
        }
    }
}
