package j5;

import android.content.Context;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import i5.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class l implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f42035g = androidx.work.l.f("WorkForegroundRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.work.impl.utils.futures.c f42036a = androidx.work.impl.utils.futures.c.s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Context f42037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final p f42038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ListenableWorker f42039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final androidx.work.h f42040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final k5.a f42041f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f42042a;

        a(androidx.work.impl.utils.futures.c cVar) {
            this.f42042a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f42042a.q(l.this.f42039d.getForegroundInfoAsync());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f42044a;

        b(androidx.work.impl.utils.futures.c cVar) {
            this.f42044a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.work.g gVar = (androidx.work.g) this.f42044a.get();
                if (gVar == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", l.this.f42038c.f41042c));
                }
                androidx.work.l.c().a(l.f42035g, String.format("Updating notification for %s", l.this.f42038c.f41042c), new Throwable[0]);
                l.this.f42039d.setRunInForeground(true);
                l lVar = l.this;
                lVar.f42036a.q(lVar.f42040e.a(lVar.f42037b, lVar.f42039d.getId(), gVar));
            } catch (Throwable th2) {
                l.this.f42036a.p(th2);
            }
        }
    }

    public l(Context context, p pVar, ListenableWorker listenableWorker, androidx.work.h hVar, k5.a aVar) {
        this.f42037b = context;
        this.f42038c = pVar;
        this.f42039d = listenableWorker;
        this.f42040e = hVar;
        this.f42041f = aVar;
    }

    public ListenableFuture a() {
        return this.f42036a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f42038c.f41056q || j0.c.d()) {
            this.f42036a.o(null);
            return;
        }
        androidx.work.impl.utils.futures.c cVarS = androidx.work.impl.utils.futures.c.s();
        this.f42041f.a().execute(new a(cVarS));
        cVarS.addListener(new b(cVarS), this.f42041f.a());
    }
}
