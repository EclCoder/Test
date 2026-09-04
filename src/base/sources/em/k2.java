package em;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k2 extends kl.a implements z1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k2 f38026b = new k2();

    private k2() {
        super(z1.f38078x2);
    }

    @Override // em.z1
    public v K0(x xVar) {
        return l2.f38029a;
    }

    @Override // em.z1
    public Object c(kl.f fVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // em.z1
    public boolean h() {
        return false;
    }

    @Override // em.z1
    public boolean isActive() {
        return true;
    }

    @Override // em.z1
    public boolean isCancelled() {
        return false;
    }

    @Override // em.z1
    public e1 j(boolean z10, boolean z11, Function1 function1) {
        return l2.f38029a;
    }

    @Override // em.z1
    public CancellationException l() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // em.z1
    public e1 q(Function1 function1) {
        return l2.f38029a;
    }

    @Override // em.z1
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // em.z1
    public void a(CancellationException cancellationException) {
    }
}
