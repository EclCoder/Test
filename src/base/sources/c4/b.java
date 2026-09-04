package c4;

import gl.l0;
import gl.r;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.s;
import pm.l;
import rm.f;
import y3.j;
import y3.p1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b extends sm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pm.d f9552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vm.b f9554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f9555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9556e;

    public b(pm.d serializer, Map typeMap) {
        s.h(serializer, "serializer");
        s.h(typeMap, "typeMap");
        this.f9552a = serializer;
        this.f9553b = typeMap;
        this.f9554c = vm.c.a();
        this.f9555d = new LinkedHashMap();
        this.f9556e = -1;
    }

    private final void L(Object obj) {
        String strF = this.f9552a.getDescriptor().f(this.f9556e);
        p1 p1Var = (p1) this.f9553b.get(strF);
        if (p1Var != null) {
            this.f9555d.put(strF, p1Var instanceof j ? ((j) p1Var).l(obj) : r.e(p1Var.i(obj)));
            return;
        }
        throw new IllegalStateException(("Cannot find NavType for argument " + strF + ". Please provide NavType through typeMap.").toString());
    }

    @Override // sm.b
    public boolean H(f descriptor, int i10) {
        s.h(descriptor, "descriptor");
        this.f9556e = i10;
        return true;
    }

    @Override // sm.b
    public void J(Object value) {
        s.h(value, "value");
        L(value);
    }

    public final Map K(Object value) {
        s.h(value, "value");
        super.q(this.f9552a, value);
        return l0.t(this.f9555d);
    }

    @Override // sm.f
    public vm.b a() {
        return this.f9554c;
    }

    @Override // sm.b, sm.f
    public sm.f m(f descriptor) {
        s.h(descriptor, "descriptor");
        if (d.f(descriptor)) {
            this.f9556e = 0;
        }
        return super.m(descriptor);
    }

    @Override // sm.b, sm.f
    public void q(l serializer, Object obj) {
        s.h(serializer, "serializer");
        L(obj);
    }

    @Override // sm.b, sm.f
    public void s() {
        L(null);
    }
}
