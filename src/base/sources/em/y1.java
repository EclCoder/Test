package em;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class y1 extends d2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function1 f38075e;

    public y1(Function1 function1) {
        this.f38075e = function1;
    }

    @Override // em.d2
    public boolean v() {
        return false;
    }

    @Override // em.d2
    public void w(Throwable th2) {
        this.f38075e.invoke(th2);
    }
}
