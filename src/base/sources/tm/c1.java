package tm;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c1 implements rm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rm.f f53450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f53451b;

    public /* synthetic */ c1(rm.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    @Override // rm.f
    public boolean b() {
        return rm.f.a.c(this);
    }

    @Override // rm.f
    public int c(String name) {
        kotlin.jvm.internal.s.h(name, "name");
        Integer numQ = bm.r.q(name);
        if (numQ != null) {
            return numQ.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // rm.f
    public rm.m d() {
        return rm.n.b.f51422a;
    }

    @Override // rm.f
    public int e() {
        return this.f53451b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return kotlin.jvm.internal.s.c(this.f53450a, c1Var.f53450a) && kotlin.jvm.internal.s.c(i(), c1Var.i());
    }

    @Override // rm.f
    public String f(int i10) {
        return String.valueOf(i10);
    }

    @Override // rm.f
    public List g(int i10) {
        if (i10 >= 0) {
            return gl.r.l();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    @Override // rm.f
    public List getAnnotations() {
        return rm.f.a.a(this);
    }

    @Override // rm.f
    public rm.f h(int i10) {
        if (i10 >= 0) {
            return this.f53450a;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.f53450a.hashCode() * 31) + i().hashCode();
    }

    @Override // rm.f
    public boolean isInline() {
        return rm.f.a.b(this);
    }

    @Override // rm.f
    public boolean j(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return i() + '(' + this.f53450a + ')';
    }

    private c1(rm.f fVar) {
        this.f53450a = fVar;
        this.f53451b = 1;
    }
}
