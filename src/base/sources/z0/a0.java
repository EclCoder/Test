package z0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f58212b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Throwable readException, int i10) {
        super(i10, null);
        kotlin.jvm.internal.s.h(readException, "readException");
        this.f58212b = readException;
    }

    public final Throwable b() {
        return this.f58212b;
    }
}
