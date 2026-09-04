package j5;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.u;
import com.google.common.util.concurrent.ListenableFuture;
import i5.q;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class m implements androidx.work.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f42046d = androidx.work.l.f("WMFgUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k5.a f42047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final h5.a f42048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final q f42049c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f42050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UUID f42051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.g f42052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f42053d;

        a(androidx.work.impl.utils.futures.c cVar, UUID uuid, androidx.work.g gVar, Context context) {
            this.f42050a = cVar;
            this.f42051b = uuid;
            this.f42052c = gVar;
            this.f42053d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f42050a.isCancelled()) {
                    String string = this.f42051b.toString();
                    u uVarF = m.this.f42049c.f(string);
                    if (uVarF == null || uVarF.d()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    m.this.f42048b.b(string, this.f42052c);
                    this.f42053d.startService(androidx.work.impl.foreground.a.a(this.f42053d, string, this.f42052c));
                }
                this.f42050a.o(null);
            } catch (Throwable th2) {
                this.f42050a.p(th2);
            }
        }
    }

    public m(WorkDatabase workDatabase, h5.a aVar, k5.a aVar2) {
        this.f42048b = aVar;
        this.f42047a = aVar2;
        this.f42049c = workDatabase.B();
    }

    @Override // androidx.work.h
    public ListenableFuture a(Context context, UUID uuid, androidx.work.g gVar) {
        androidx.work.impl.utils.futures.c cVarS = androidx.work.impl.utils.futures.c.s();
        this.f42047a.b(new a(cVarS, uuid, gVar, context));
        return cVarS;
    }
}
