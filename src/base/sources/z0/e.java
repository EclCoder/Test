package z0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f58221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f58222c;

    public e(Object obj, int i10, int i11) {
        super(i11, null);
        this.f58221b = obj;
        this.f58222c = i10;
    }

    public final void b() {
        Object obj = this.f58221b;
        if ((obj != null ? obj.hashCode() : 0) != this.f58222c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object c() {
        return this.f58221b;
    }
}
