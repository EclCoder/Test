package b2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8275a;

    public final void a(int i10) {
        this.f8275a = i10 | this.f8275a;
    }

    public void b() {
        this.f8275a = 0;
    }

    protected final boolean c(int i10) {
        return (this.f8275a & i10) == i10;
    }

    public final boolean d() {
        return c(268435456);
    }

    public final boolean e() {
        return c(4);
    }

    public final boolean f() {
        return c(134217728);
    }

    public final boolean g() {
        return c(1);
    }

    public final boolean h() {
        return c(536870912);
    }

    public final void i(int i10) {
        this.f8275a = i10;
    }
}
