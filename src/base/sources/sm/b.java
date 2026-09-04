package sm;

import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.SerializationException;
import pm.l;
import tm.o1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements f, d {
    @Override // sm.d
    public void A(rm.f descriptor, int i10, l serializer, Object obj) {
        s.h(descriptor, "descriptor");
        s.h(serializer, "serializer");
        if (H(descriptor, i10)) {
            q(serializer, obj);
        }
    }

    @Override // sm.d
    public final f C(rm.f descriptor, int i10) {
        s.h(descriptor, "descriptor");
        return H(descriptor, i10) ? m(descriptor.h(i10)) : o1.f53545a;
    }

    @Override // sm.f
    public void D(int i10) {
        J(Integer.valueOf(i10));
    }

    @Override // sm.f
    public void E(rm.f enumDescriptor, int i10) {
        s.h(enumDescriptor, "enumDescriptor");
        J(Integer.valueOf(i10));
    }

    @Override // sm.d
    public final void F(rm.f descriptor, int i10, String value) {
        s.h(descriptor, "descriptor");
        s.h(value, "value");
        if (H(descriptor, i10)) {
            G(value);
        }
    }

    @Override // sm.f
    public void G(String value) {
        s.h(value, "value");
        J(value);
    }

    public boolean H(rm.f descriptor, int i10) {
        s.h(descriptor, "descriptor");
        return true;
    }

    public void I(l lVar, Object obj) {
        f.a.c(this, lVar, obj);
    }

    public void J(Object value) {
        s.h(value, "value");
        throw new SerializationException("Non-serializable " + l0.b(value.getClass()) + " is not supported by " + l0.b(getClass()) + " encoder");
    }

    @Override // sm.f
    public d b(rm.f descriptor) {
        s.h(descriptor, "descriptor");
        return this;
    }

    @Override // sm.d
    public void d(rm.f descriptor) {
        s.h(descriptor, "descriptor");
    }

    @Override // sm.d
    public final void e(rm.f descriptor, int i10, long j10) {
        s.h(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            o(j10);
        }
    }

    @Override // sm.d
    public final void f(rm.f descriptor, int i10, boolean z10) {
        s.h(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            u(z10);
        }
    }

    @Override // sm.f
    public void g(double d10) {
        J(Double.valueOf(d10));
    }

    @Override // sm.f
    public void h(byte b10) {
        J(Byte.valueOf(b10));
    }

    @Override // sm.d
    public final void i(rm.f descriptor, int i10, int i11) {
        s.h(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            D(i11);
        }
    }

    @Override // sm.d
    public final void j(rm.f descriptor, int i10, double d10) {
        s.h(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            g(d10);
        }
    }

    @Override // sm.d
    public boolean k(rm.f fVar, int i10) {
        return d.a.a(this, fVar, i10);
    }

    @Override // sm.d
    public final void l(rm.f descriptor, int i10, char c10) {
        s.h(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            y(c10);
        }
    }

    @Override // sm.f
    public f m(rm.f descriptor) {
        s.h(descriptor, "descriptor");
        return this;
    }

    @Override // sm.d
    public final void n(rm.f descriptor, int i10, float f10) {
        s.h(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            x(f10);
        }
    }

    @Override // sm.f
    public void o(long j10) {
        J(Long.valueOf(j10));
    }

    @Override // sm.d
    public final void p(rm.f descriptor, int i10, byte b10) {
        s.h(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            h(b10);
        }
    }

    @Override // sm.f
    public void q(l lVar, Object obj) {
        f.a.d(this, lVar, obj);
    }

    @Override // sm.f
    public d r(rm.f fVar, int i10) {
        return f.a.a(this, fVar, i10);
    }

    @Override // sm.f
    public void s() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // sm.f
    public void t(short s10) {
        J(Short.valueOf(s10));
    }

    @Override // sm.f
    public void u(boolean z10) {
        J(Boolean.valueOf(z10));
    }

    @Override // sm.d
    public final void v(rm.f descriptor, int i10, short s10) {
        s.h(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            t(s10);
        }
    }

    @Override // sm.d
    public void w(rm.f descriptor, int i10, l serializer, Object obj) {
        s.h(descriptor, "descriptor");
        s.h(serializer, "serializer");
        if (H(descriptor, i10)) {
            I(serializer, obj);
        }
    }

    @Override // sm.f
    public void x(float f10) {
        J(Float.valueOf(f10));
    }

    @Override // sm.f
    public void y(char c10) {
        J(Character.valueOf(c10));
    }

    @Override // sm.f
    public void z() {
        f.a.b(this);
    }
}
