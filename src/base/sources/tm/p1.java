package tm;

import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p1 implements rm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1 f53554a = new p1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.m f53555b = rm.n.d.f51424a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f53556c = "kotlin.Nothing";

    private p1() {
    }

    private final Void a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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
    public rm.m d() {
        return f53555b;
    }

    @Override // rm.f
    public int e() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj;
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
        return f53556c;
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

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
