package j0;

import android.os.OutcomeReceiver;
import fl.r;
import fl.s;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class h extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kl.f f41885a;

    public h(kl.f fVar) {
        super(false);
        this.f41885a = fVar;
    }

    public void onError(Throwable th2) {
        if (compareAndSet(false, true)) {
            kl.f fVar = this.f41885a;
            r.a aVar = r.f38769b;
            fVar.resumeWith(r.b(s.a(th2)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f41885a.resumeWith(r.b(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
