package s9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f51508a;

    public final void a(int i10) {
        this.f51508a = i10 | this.f51508a;
    }

    public void b() {
        this.f51508a = 0;
    }

    public final void c(int i10) {
        this.f51508a = (~i10) & this.f51508a;
    }

    protected final boolean d(int i10) {
        return (this.f51508a & i10) == i10;
    }

    public final boolean e() {
        return d(268435456);
    }

    public final boolean f() {
        return d(Integer.MIN_VALUE);
    }

    public final boolean g() {
        return d(4);
    }

    public final boolean h() {
        return d(134217728);
    }

    public final boolean i() {
        return d(1);
    }

    public final boolean j() {
        return d(536870912);
    }

    public final void k(int i10) {
        this.f51508a = i10;
    }
}
