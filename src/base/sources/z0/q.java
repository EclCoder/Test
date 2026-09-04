package z0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class q extends h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f58471b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Throwable finalException) {
        super(Integer.MAX_VALUE, null);
        kotlin.jvm.internal.s.h(finalException, "finalException");
        this.f58471b = finalException;
    }

    public final Throwable b() {
        return this.f58471b;
    }
}
