package tm;

import java.util.ArrayList;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z2 implements sm.f, sm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f53620a = new ArrayList();

    private final boolean H(rm.f fVar, int i10) {
        Z(X(fVar, i10));
        return true;
    }

    @Override // sm.d
    public void A(rm.f descriptor, int i10, pm.l serializer, Object obj) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        kotlin.jvm.internal.s.h(serializer, "serializer");
        if (H(descriptor, i10)) {
            q(serializer, obj);
        }
    }

    @Override // sm.d
    public final sm.f C(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return P(X(descriptor, i10), descriptor.h(i10));
    }

    @Override // sm.f
    public final void D(int i10) {
        Q(Y(), i10);
    }

    @Override // sm.f
    public final void E(rm.f enumDescriptor, int i10) {
        kotlin.jvm.internal.s.h(enumDescriptor, "enumDescriptor");
        N(Y(), enumDescriptor, i10);
    }

    @Override // sm.d
    public final void F(rm.f descriptor, int i10, String value) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        kotlin.jvm.internal.s.h(value, "value");
        T(X(descriptor, i10), value);
    }

    @Override // sm.f
    public final void G(String value) {
        kotlin.jvm.internal.s.h(value, "value");
        T(Y(), value);
    }

    public void I(pm.l lVar, Object obj) {
        sm.f.a.c(this, lVar, obj);
    }

    protected abstract void J(Object obj, boolean z10);

    protected abstract void K(Object obj, byte b10);

    protected abstract void L(Object obj, char c10);

    protected abstract void M(Object obj, double d10);

    protected abstract void N(Object obj, rm.f fVar, int i10);

    protected abstract void O(Object obj, float f10);

    protected sm.f P(Object obj, rm.f inlineDescriptor) {
        kotlin.jvm.internal.s.h(inlineDescriptor, "inlineDescriptor");
        Z(obj);
        return this;
    }

    protected abstract void Q(Object obj, int i10);

    protected abstract void R(Object obj, long j10);

    protected abstract void S(Object obj, short s10);

    protected abstract void T(Object obj, String str);

    protected abstract void U(rm.f fVar);

    protected final Object V() {
        return gl.r.n0(this.f53620a);
    }

    protected final Object W() {
        return gl.r.o0(this.f53620a);
    }

    protected abstract Object X(rm.f fVar, int i10);

    protected final Object Y() {
        if (this.f53620a.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        ArrayList arrayList = this.f53620a;
        return arrayList.remove(gl.r.n(arrayList));
    }

    protected final void Z(Object obj) {
        this.f53620a.add(obj);
    }

    @Override // sm.d
    public final void d(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        if (!this.f53620a.isEmpty()) {
            Y();
        }
        U(descriptor);
    }

    @Override // sm.d
    public final void e(rm.f descriptor, int i10, long j10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        R(X(descriptor, i10), j10);
    }

    @Override // sm.d
    public final void f(rm.f descriptor, int i10, boolean z10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        J(X(descriptor, i10), z10);
    }

    @Override // sm.f
    public final void g(double d10) {
        M(Y(), d10);
    }

    @Override // sm.f
    public final void h(byte b10) {
        K(Y(), b10);
    }

    @Override // sm.d
    public final void i(rm.f descriptor, int i10, int i11) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        Q(X(descriptor, i10), i11);
    }

    @Override // sm.d
    public final void j(rm.f descriptor, int i10, double d10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        M(X(descriptor, i10), d10);
    }

    @Override // sm.d
    public final void l(rm.f descriptor, int i10, char c10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        L(X(descriptor, i10), c10);
    }

    @Override // sm.f
    public sm.f m(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return P(Y(), descriptor);
    }

    @Override // sm.d
    public final void n(rm.f descriptor, int i10, float f10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        O(X(descriptor, i10), f10);
    }

    @Override // sm.f
    public final void o(long j10) {
        R(Y(), j10);
    }

    @Override // sm.d
    public final void p(rm.f descriptor, int i10, byte b10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        K(X(descriptor, i10), b10);
    }

    @Override // sm.f
    public abstract void q(pm.l lVar, Object obj);

    @Override // sm.f
    public sm.d r(rm.f fVar, int i10) {
        return sm.f.a.a(this, fVar, i10);
    }

    @Override // sm.f
    public final void t(short s10) {
        S(Y(), s10);
    }

    @Override // sm.f
    public final void u(boolean z10) {
        J(Y(), z10);
    }

    @Override // sm.d
    public final void v(rm.f descriptor, int i10, short s10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        S(X(descriptor, i10), s10);
    }

    @Override // sm.d
    public void w(rm.f descriptor, int i10, pm.l serializer, Object obj) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        kotlin.jvm.internal.s.h(serializer, "serializer");
        if (H(descriptor, i10)) {
            I(serializer, obj);
        }
    }

    @Override // sm.f
    public final void x(float f10) {
        O(Y(), f10);
    }

    @Override // sm.f
    public final void y(char c10) {
        L(Y(), c10);
    }
}
