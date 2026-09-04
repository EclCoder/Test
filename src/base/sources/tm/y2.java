package tm;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y2 implements sm.e, sm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f53615a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f53616b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K(y2 y2Var, pm.c cVar, Object obj) {
        return (cVar.getDescriptor().b() || y2Var.E()) ? y2Var.M(cVar, obj) : y2Var.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object L(y2 y2Var, pm.c cVar, Object obj) {
        return y2Var.M(cVar, obj);
    }

    private final Object d0(Object obj, tl.a aVar) {
        c0(obj);
        Object objInvoke = aVar.invoke();
        if (!this.f53616b) {
            b0();
        }
        this.f53616b = false;
        return objInvoke;
    }

    @Override // sm.c
    public final float A(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return S(Z(descriptor, i10));
    }

    @Override // sm.c
    public final char B(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return P(Z(descriptor, i10));
    }

    @Override // sm.e
    public final String C() {
        return X(b0());
    }

    @Override // sm.e
    public abstract Object D(pm.c cVar);

    @Override // sm.e
    public final byte F() {
        return O(b0());
    }

    @Override // sm.e
    public final int G(rm.f enumDescriptor) {
        kotlin.jvm.internal.s.h(enumDescriptor, "enumDescriptor");
        return R(b0(), enumDescriptor);
    }

    @Override // sm.c
    public final String H(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return X(Z(descriptor, i10));
    }

    protected Object M(pm.c deserializer, Object obj) {
        kotlin.jvm.internal.s.h(deserializer, "deserializer");
        return D(deserializer);
    }

    protected abstract boolean N(Object obj);

    protected abstract byte O(Object obj);

    protected abstract char P(Object obj);

    protected abstract double Q(Object obj);

    protected abstract int R(Object obj, rm.f fVar);

    protected abstract float S(Object obj);

    protected sm.e T(Object obj, rm.f inlineDescriptor) {
        kotlin.jvm.internal.s.h(inlineDescriptor, "inlineDescriptor");
        c0(obj);
        return this;
    }

    protected abstract int U(Object obj);

    protected abstract long V(Object obj);

    protected abstract short W(Object obj);

    protected abstract String X(Object obj);

    protected final Object Y() {
        return gl.r.o0(this.f53615a);
    }

    protected abstract Object Z(rm.f fVar, int i10);

    public final ArrayList a0() {
        return this.f53615a;
    }

    protected final Object b0() {
        ArrayList arrayList = this.f53615a;
        Object objRemove = arrayList.remove(gl.r.n(arrayList));
        this.f53616b = true;
        return objRemove;
    }

    protected final void c0(Object obj) {
        this.f53615a.add(obj);
    }

    @Override // sm.c
    public final Object e(rm.f descriptor, int i10, final pm.c deserializer, final Object obj) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        kotlin.jvm.internal.s.h(deserializer, "deserializer");
        return d0(Z(descriptor, i10), new tl.a() { // from class: tm.x2
            @Override // tl.a
            public final Object invoke() {
                return y2.K(this.f53610a, deserializer, obj);
            }
        });
    }

    @Override // sm.e
    public final int g() {
        return U(b0());
    }

    @Override // sm.c
    public final short h(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return W(Z(descriptor, i10));
    }

    @Override // sm.c
    public final double i(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return Q(Z(descriptor, i10));
    }

    @Override // sm.e
    public final Void j() {
        return null;
    }

    @Override // sm.e
    public final long k() {
        return V(b0());
    }

    @Override // sm.c
    public boolean l() {
        return sm.c.a.b(this);
    }

    @Override // sm.c
    public int m(rm.f fVar) {
        return sm.c.a.a(this, fVar);
    }

    @Override // sm.c
    public final Object n(rm.f descriptor, int i10, final pm.c deserializer, final Object obj) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        kotlin.jvm.internal.s.h(deserializer, "deserializer");
        return d0(Z(descriptor, i10), new tl.a() { // from class: tm.w2
            @Override // tl.a
            public final Object invoke() {
                return y2.L(this.f53602a, deserializer, obj);
            }
        });
    }

    @Override // sm.e
    public final short p() {
        return W(b0());
    }

    @Override // sm.e
    public final float q() {
        return S(b0());
    }

    @Override // sm.e
    public sm.e r(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return T(b0(), descriptor);
    }

    @Override // sm.c
    public final int s(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return U(Z(descriptor, i10));
    }

    @Override // sm.e
    public final double t() {
        return Q(b0());
    }

    @Override // sm.e
    public final boolean u() {
        return N(b0());
    }

    @Override // sm.e
    public final char v() {
        return P(b0());
    }

    @Override // sm.c
    public final byte w(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return O(Z(descriptor, i10));
    }

    @Override // sm.c
    public final boolean x(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return N(Z(descriptor, i10));
    }

    @Override // sm.c
    public final sm.e y(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return T(Z(descriptor, i10), descriptor.h(i10));
    }

    @Override // sm.c
    public final long z(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return V(Z(descriptor, i10));
    }
}
