package rk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class e extends d {
    private static final long serialVersionUID = -8219729196779211169L;

    e(Runnable runnable) {
        super(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // rk.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void h(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + g() + ", " + get() + ")";
    }
}
