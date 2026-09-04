package wg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f56265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f56266b;

    public a(Object obj) {
        this.f56265a = obj;
    }

    public final Object a() {
        if (this.f56266b) {
            return null;
        }
        this.f56266b = true;
        return this.f56265a;
    }
}
