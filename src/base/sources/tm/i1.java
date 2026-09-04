package tm;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i1 implements rm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rm.f f53512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rm.f f53513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f53514d;

    public /* synthetic */ i1(String str, rm.f fVar, rm.f fVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fVar, fVar2);
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // rm.f
    public rm.m d() {
        return rm.n.c.f51423a;
    }

    @Override // rm.f
    public int e() {
        return this.f53514d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return kotlin.jvm.internal.s.c(i(), i1Var.i()) && kotlin.jvm.internal.s.c(this.f53512b, i1Var.f53512b) && kotlin.jvm.internal.s.c(this.f53513c, i1Var.f53513c);
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
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f53512b;
            }
            if (i11 == 1) {
                return this.f53513c;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (((i().hashCode() * 31) + this.f53512b.hashCode()) * 31) + this.f53513c.hashCode();
    }

    @Override // rm.f
    public String i() {
        return this.f53511a;
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
        return i() + '(' + this.f53512b + ", " + this.f53513c + ')';
    }

    private i1(String str, rm.f fVar, rm.f fVar2) {
        this.f53511a = str;
        this.f53512b = fVar;
        this.f53513c = fVar2;
        this.f53514d = 2;
    }
}
