package sm;

import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements e, c {
    @Override // sm.c
    public final float A(rm.f descriptor, int i10) {
        s.h(descriptor, "descriptor");
        return q();
    }

    @Override // sm.c
    public final char B(rm.f descriptor, int i10) {
        s.h(descriptor, "descriptor");
        return v();
    }

    @Override // sm.e
    public String C() {
        Object objJ = J();
        s.f(objJ, "null cannot be cast to non-null type kotlin.String");
        return (String) objJ;
    }

    @Override // sm.e
    public Object D(pm.c cVar) {
        return e.a.a(this, cVar);
    }

    @Override // sm.e
    public boolean E() {
        return true;
    }

    @Override // sm.e
    public abstract byte F();

    @Override // sm.e
    public int G(rm.f enumDescriptor) {
        s.h(enumDescriptor, "enumDescriptor");
        Object objJ = J();
        s.f(objJ, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objJ).intValue();
    }

    @Override // sm.c
    public final String H(rm.f descriptor, int i10) {
        s.h(descriptor, "descriptor");
        return C();
    }

    public Object I(pm.c deserializer, Object obj) {
        s.h(deserializer, "deserializer");
        return D(deserializer);
    }

    public Object J() {
        throw new SerializationException(l0.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // sm.e
    public c b(rm.f descriptor) {
        s.h(descriptor, "descriptor");
        return this;
    }

    @Override // sm.c
    public void d(rm.f descriptor) {
        s.h(descriptor, "descriptor");
    }

    @Override // sm.c
    public final Object e(rm.f descriptor, int i10, pm.c deserializer, Object obj) {
        s.h(descriptor, "descriptor");
        s.h(deserializer, "deserializer");
        return (deserializer.getDescriptor().b() || E()) ? I(deserializer, obj) : j();
    }

    @Override // sm.e
    public abstract int g();

    @Override // sm.c
    public final short h(rm.f descriptor, int i10) {
        s.h(descriptor, "descriptor");
        return p();
    }

    @Override // sm.c
    public final double i(rm.f descriptor, int i10) {
        s.h(descriptor, "descriptor");
        return t();
    }

    @Override // sm.e
    public Void j() {
        return null;
    }

    @Override // sm.e
    public abstract long k();

    @Override // sm.c
    public boolean l() {
        return c.a.b(this);
    }

    @Override // sm.c
    public int m(rm.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // sm.c
    public Object n(rm.f descriptor, int i10, pm.c deserializer, Object obj) {
        s.h(descriptor, "descriptor");
        s.h(deserializer, "deserializer");
        return I(deserializer, obj);
    }

    @Override // sm.e
    public abstract short p();

    @Override // sm.e
    public float q() {
        Object objJ = J();
        s.f(objJ, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objJ).floatValue();
    }

    @Override // sm.e
    public e r(rm.f descriptor) {
        s.h(descriptor, "descriptor");
        return this;
    }

    @Override // sm.c
    public final int s(rm.f descriptor, int i10) {
        s.h(descriptor, "descriptor");
        return g();
    }

    @Override // sm.e
    public double t() {
        Object objJ = J();
        s.f(objJ, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objJ).doubleValue();
    }

    @Override // sm.e
    public boolean u() {
        Object objJ = J();
        s.f(objJ, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objJ).booleanValue();
    }

    @Override // sm.e
    public char v() {
        Object objJ = J();
        s.f(objJ, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objJ).charValue();
    }

    @Override // sm.c
    public final byte w(rm.f descriptor, int i10) {
        s.h(descriptor, "descriptor");
        return F();
    }

    @Override // sm.c
    public final boolean x(rm.f descriptor, int i10) {
        s.h(descriptor, "descriptor");
        return u();
    }

    @Override // sm.c
    public e y(rm.f descriptor, int i10) {
        s.h(descriptor, "descriptor");
        return r(descriptor.h(i10));
    }

    @Override // sm.c
    public final long z(rm.f descriptor, int i10) {
        s.h(descriptor, "descriptor");
        return k();
    }
}
