package l1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f43734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f43735b;

    public b(float f10, float f11) {
        this.f43734a = f10;
        this.f43735b = f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(d c10, b this$0, float f10, float f11, float f12) {
        kotlin.jvm.internal.s.h(c10, "$c");
        kotlin.jvm.internal.s.h(this$0, "this$0");
        long jK = c10.k(f12);
        return Math.abs(y.j(y.a(p.g(jK) - this$0.f43734a, p.h(jK) - this$0.f43735b) - f10, y.h()) - f11);
    }

    @Override // l1.l
    public float a(final d c10, final float f10) {
        kotlin.jvm.internal.s.h(c10, "c");
        final float fA = y.a(c10.b() - this.f43734a, c10.c() - this.f43735b);
        return y.f(0.0f, 1.0f, 1.0E-5f, new i() { // from class: l1.a
            @Override // l1.i
            public final float a(float f11) {
                return b.d(c10, this, fA, f10, f11);
            }
        });
    }

    @Override // l1.l
    public float b(d c10) {
        kotlin.jvm.internal.s.h(c10, "c");
        float fJ = y.j(y.a(c10.d() - this.f43734a, c10.e() - this.f43735b) - y.a(c10.b() - this.f43734a, c10.c() - this.f43735b), y.h());
        if (fJ > y.h() - 1.0E-4f) {
            return 0.0f;
        }
        return fJ;
    }
}
