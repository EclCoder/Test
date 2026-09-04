package o2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f48138a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f48139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f48141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f48143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f48144g;

    public void a(o0 o0Var, o0.a aVar) {
        if (this.f48140c > 0) {
            o0Var.e(this.f48141d, this.f48142e, this.f48143f, this.f48144g, aVar);
            this.f48140c = 0;
        }
    }

    public void b() {
        this.f48139b = false;
        this.f48140c = 0;
    }

    public void c(o0 o0Var, long j10, int i10, int i11, int i12, o0.a aVar) {
        w1.a.h(this.f48144g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f48139b) {
            int i13 = this.f48140c;
            int i14 = i13 + 1;
            this.f48140c = i14;
            if (i13 == 0) {
                this.f48141d = j10;
                this.f48142e = i10;
                this.f48143f = 0;
            }
            this.f48143f += i11;
            this.f48144g = i12;
            if (i14 >= 16) {
                a(o0Var, aVar);
            }
        }
    }

    public void d(q qVar) {
        if (this.f48139b) {
            return;
        }
        qVar.peekFully(this.f48138a, 0, 10);
        qVar.resetPeekPosition();
        if (b.j(this.f48138a) == 0) {
            return;
        }
        this.f48139b = true;
    }
}
