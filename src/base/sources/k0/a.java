package k0;

import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i.c f42770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f42771b;

    /* JADX INFO: renamed from: k0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0648a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i.c f42772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f42773b;

        RunnableC0648a(i.c cVar, Typeface typeface) {
            this.f42772a = cVar;
            this.f42773b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f42772a.b(this.f42773b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i.c f42775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f42776b;

        b(i.c cVar, int i10) {
            this.f42775a = cVar;
            this.f42776b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f42775a.a(this.f42776b);
        }
    }

    a(i.c cVar, Executor executor) {
        this.f42770a = cVar;
        this.f42771b = executor;
    }

    private void a(int i10) {
        this.f42771b.execute(new b(this.f42770a, i10));
    }

    private void c(Typeface typeface) {
        this.f42771b.execute(new RunnableC0648a(this.f42770a, typeface));
    }

    void b(h.e eVar) {
        if (eVar.a()) {
            c(eVar.f42806a);
        } else {
            a(eVar.f42807b);
        }
    }
}
