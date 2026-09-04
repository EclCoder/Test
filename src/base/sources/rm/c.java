package rm;

import java.util.List;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f51385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zl.c f51386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f51387c;

    public c(f original, zl.c kClass) {
        s.h(original, "original");
        s.h(kClass, "kClass");
        this.f51385a = original;
        this.f51386b = kClass;
        this.f51387c = original.i() + '<' + kClass.k() + '>';
    }

    @Override // rm.f
    public boolean b() {
        return this.f51385a.b();
    }

    @Override // rm.f
    public int c(String name) {
        s.h(name, "name");
        return this.f51385a.c(name);
    }

    @Override // rm.f
    public m d() {
        return this.f51385a.d();
    }

    @Override // rm.f
    public int e() {
        return this.f51385a.e();
    }

    public boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && s.c(this.f51385a, cVar.f51385a) && s.c(cVar.f51386b, this.f51386b);
    }

    @Override // rm.f
    public String f(int i10) {
        return this.f51385a.f(i10);
    }

    @Override // rm.f
    public List g(int i10) {
        return this.f51385a.g(i10);
    }

    @Override // rm.f
    public List getAnnotations() {
        return this.f51385a.getAnnotations();
    }

    @Override // rm.f
    public f h(int i10) {
        return this.f51385a.h(i10);
    }

    public int hashCode() {
        return (this.f51386b.hashCode() * 31) + i().hashCode();
    }

    @Override // rm.f
    public String i() {
        return this.f51387c;
    }

    @Override // rm.f
    public boolean isInline() {
        return this.f51385a.isInline();
    }

    @Override // rm.f
    public boolean j(int i10) {
        return this.f51385a.j(i10);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f51386b + ", original: " + this.f51385a + ')';
    }
}
