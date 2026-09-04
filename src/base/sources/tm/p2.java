package tm;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p2 implements rm.f, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rm.f f53557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f53559c;

    public p2(rm.f original) {
        kotlin.jvm.internal.s.h(original, "original");
        this.f53557a = original;
        this.f53558b = original.i() + '?';
        this.f53559c = a2.a(original);
    }

    @Override // tm.n
    public Set a() {
        return this.f53559c;
    }

    @Override // rm.f
    public boolean b() {
        return true;
    }

    @Override // rm.f
    public int c(String name) {
        kotlin.jvm.internal.s.h(name, "name");
        return this.f53557a.c(name);
    }

    @Override // rm.f
    public rm.m d() {
        return this.f53557a.d();
    }

    @Override // rm.f
    public int e() {
        return this.f53557a.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2) && kotlin.jvm.internal.s.c(this.f53557a, ((p2) obj).f53557a);
    }

    @Override // rm.f
    public String f(int i10) {
        return this.f53557a.f(i10);
    }

    @Override // rm.f
    public List g(int i10) {
        return this.f53557a.g(i10);
    }

    @Override // rm.f
    public List getAnnotations() {
        return this.f53557a.getAnnotations();
    }

    @Override // rm.f
    public rm.f h(int i10) {
        return this.f53557a.h(i10);
    }

    public int hashCode() {
        return this.f53557a.hashCode() * 31;
    }

    @Override // rm.f
    public String i() {
        return this.f53558b;
    }

    @Override // rm.f
    public boolean isInline() {
        return this.f53557a.isInline();
    }

    @Override // rm.f
    public boolean j(int i10) {
        return this.f53557a.j(i10);
    }

    public final rm.f k() {
        return this.f53557a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f53557a);
        sb2.append('?');
        return sb2.toString();
    }
}
