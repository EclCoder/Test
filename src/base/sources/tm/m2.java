package tm;

import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m2 implements rm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rm.e f53538b;

    public m2(String serialName, rm.e kind) {
        kotlin.jvm.internal.s.h(serialName, "serialName");
        kotlin.jvm.internal.s.h(kind, "kind");
        this.f53537a = serialName;
        this.f53538b = kind;
    }

    private final Void a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // rm.f
    public boolean b() {
        return rm.f.a.c(this);
    }

    @Override // rm.f
    public int c(String name) {
        kotlin.jvm.internal.s.h(name, "name");
        a();
        throw new KotlinNothingValueException();
    }

    @Override // rm.f
    public int e() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return kotlin.jvm.internal.s.c(i(), m2Var.i()) && kotlin.jvm.internal.s.c(d(), m2Var.d());
    }

    @Override // rm.f
    public String f(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // rm.f
    public List g(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // rm.f
    public List getAnnotations() {
        return rm.f.a.a(this);
    }

    @Override // rm.f
    public rm.f h(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    public int hashCode() {
        return i().hashCode() + (d().hashCode() * 31);
    }

    @Override // rm.f
    public String i() {
        return this.f53537a;
    }

    @Override // rm.f
    public boolean isInline() {
        return rm.f.a.b(this);
    }

    @Override // rm.f
    public boolean j(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // rm.f
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public rm.e d() {
        return this.f53538b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + i() + ')';
    }
}
