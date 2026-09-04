package u9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f54243a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f54244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f54246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f54247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f54249g;

    public void a(b0 b0Var, b0.a aVar) {
        if (this.f54245c > 0) {
            b0Var.f(this.f54246d, this.f54247e, this.f54248f, this.f54249g, aVar);
            this.f54245c = 0;
        }
    }

    public void b() {
        this.f54244b = false;
        this.f54245c = 0;
    }

    public void c(b0 b0Var, long j10, int i10, int i11, int i12, b0.a aVar) {
        ob.a.h(this.f54249g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f54244b) {
            int i13 = this.f54245c;
            int i14 = i13 + 1;
            this.f54245c = i14;
            if (i13 == 0) {
                this.f54246d = j10;
                this.f54247e = i10;
                this.f54248f = 0;
            }
            this.f54248f += i11;
            this.f54249g = i12;
            if (i14 >= 16) {
                a(b0Var, aVar);
            }
        }
    }

    public void d(l lVar) {
        if (this.f54244b) {
            return;
        }
        lVar.peekFully(this.f54243a, 0, 10);
        lVar.resetPeekPosition();
        if (q9.b.j(this.f54243a) == 0) {
            return;
        }
        this.f54244b = true;
    }
}
