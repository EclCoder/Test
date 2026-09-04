package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends g2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final rm.m f53472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fl.k f53473n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(final String name, final int i10) {
        super(name, null, i10, 2, null);
        kotlin.jvm.internal.s.h(name, "name");
        this.f53472m = rm.m.b.f51420a;
        this.f53473n = fl.l.b(new tl.a() { // from class: tm.e0
            @Override // tl.a
            public final Object invoke() {
                return f0.z(i10, name, this);
            }
        });
    }

    private final rm.f[] A() {
        return (rm.f[]) this.f53473n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rm.f[] z(int i10, String str, f0 f0Var) {
        rm.f[] fVarArr = new rm.f[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            fVarArr[i11] = rm.l.e(str + '.' + f0Var.f(i11), rm.n.d.f51424a, new rm.f[0], null, 8, null);
        }
        return fVarArr;
    }

    @Override // tm.g2, rm.f
    public rm.m d() {
        return this.f53472m;
    }

    @Override // tm.g2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof rm.f)) {
            return false;
        }
        rm.f fVar = (rm.f) obj;
        return fVar.d() == rm.m.b.f51420a && kotlin.jvm.internal.s.c(i(), fVar.i()) && kotlin.jvm.internal.s.c(a2.a(this), a2.a(fVar));
    }

    @Override // tm.g2, rm.f
    public rm.f h(int i10) {
        return A()[i10];
    }

    @Override // tm.g2
    public int hashCode() {
        int iHashCode = i().hashCode();
        int iHashCode2 = 1;
        for (String str : rm.j.b(this)) {
            int i10 = iHashCode2 * 31;
            iHashCode2 = i10 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // tm.g2
    public String toString() {
        return gl.r.l0(rm.j.b(this), ", ", i() + '(', ")", 0, null, null, 56, null);
    }
}
