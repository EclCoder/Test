package um;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class o0 extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kotlinx.serialization.json.d0 f54797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final rm.f f54798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f54799i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f54800j;

    public /* synthetic */ o0(kotlinx.serialization.json.b bVar, kotlinx.serialization.json.d0 d0Var, String str, rm.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, d0Var, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : fVar);
    }

    private final boolean C0(rm.f fVar, int i10) {
        boolean z10 = (c().e().j() || fVar.j(i10) || !fVar.h(i10).b()) ? false : true;
        this.f54800j = z10;
        return z10;
    }

    private final boolean D0(rm.f fVar, int i10, String str) {
        kotlinx.serialization.json.b bVarC = c();
        boolean zJ = fVar.j(i10);
        rm.f fVarH = fVar.h(i10);
        if (zJ && !fVarH.b() && (l0(str) instanceof kotlinx.serialization.json.a0)) {
            return true;
        }
        if (!kotlin.jvm.internal.s.c(fVarH.d(), rm.m.b.f51420a) || (fVarH.b() && (l0(str) instanceof kotlinx.serialization.json.a0))) {
            return false;
        }
        kotlinx.serialization.json.i iVarL0 = l0(str);
        kotlinx.serialization.json.g0 g0Var = iVarL0 instanceof kotlinx.serialization.json.g0 ? (kotlinx.serialization.json.g0) iVarL0 : null;
        String strF = g0Var != null ? kotlinx.serialization.json.k.f(g0Var) : null;
        if (strF == null) {
            return false;
        }
        return i0.i(fVarH, bVarC, strF) == -3 && (zJ || (!bVarC.e().j() && fVarH.b()));
    }

    @Override // um.c, sm.e
    public boolean E() {
        return !this.f54800j && super.E();
    }

    @Override // um.c
    /* JADX INFO: renamed from: E0 */
    public kotlinx.serialization.json.d0 z0() {
        return this.f54797g;
    }

    @Override // um.c, sm.e
    public sm.c b(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        if (descriptor != this.f54798h) {
            return super.b(descriptor);
        }
        kotlinx.serialization.json.b bVarC = c();
        kotlinx.serialization.json.i iVarM0 = m0();
        String strI = this.f54798h.i();
        if (iVarM0 instanceof kotlinx.serialization.json.d0) {
            return new o0(bVarC, (kotlinx.serialization.json.d0) iVarM0, y0(), this.f54798h);
        }
        throw g0.f(-1, "Expected " + kotlin.jvm.internal.l0.b(kotlinx.serialization.json.d0.class).k() + ", but had " + kotlin.jvm.internal.l0.b(iVarM0.getClass()).k() + " as the serialized body of " + strI + " at element: " + i0(), iVarM0.toString());
    }

    @Override // um.c, sm.c
    public void d(rm.f descriptor) {
        Set setJ;
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        if (this.f54745f.k() || (descriptor.d() instanceof rm.d)) {
            return;
        }
        i0.m(descriptor, c());
        if (this.f54745f.o()) {
            Set setA = tm.v0.a(descriptor);
            Map map = (Map) kotlinx.serialization.json.i0.a(c()).a(descriptor, i0.g());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = gl.s0.d();
            }
            setJ = gl.s0.j(setA, setKeySet);
        } else {
            setJ = tm.v0.a(descriptor);
        }
        for (String str : z0().keySet()) {
            if (!setJ.contains(str) && !kotlin.jvm.internal.s.c(str, y0())) {
                throw g0.g(str, z0().toString());
            }
        }
    }

    @Override // tm.m1
    protected String f0(rm.f descriptor, int i10) {
        Object next;
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        i0.m(descriptor, c());
        String strF = descriptor.f(i10);
        if (!this.f54745f.o() || z0().keySet().contains(strF)) {
            return strF;
        }
        Map mapE = i0.e(c(), descriptor);
        Iterator<T> it = z0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = (Integer) mapE.get((String) next);
            if (num != null && num.intValue() == i10) {
                break;
            }
        }
        String str = (String) next;
        return str != null ? str : strF;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // um.c
    public kotlinx.serialization.json.i l0(String tag) {
        kotlin.jvm.internal.s.h(tag, "tag");
        return (kotlinx.serialization.json.i) gl.l0.i(z0(), tag);
    }

    @Override // sm.c
    public int o(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        while (this.f54799i < descriptor.e()) {
            int i10 = this.f54799i;
            this.f54799i = i10 + 1;
            String strZ = Z(descriptor, i10);
            int i11 = this.f54799i - 1;
            this.f54800j = false;
            if (z0().containsKey(strZ) || C0(descriptor, i11)) {
                if (!this.f54745f.g() || !D0(descriptor, i11, strZ)) {
                    return i11;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(kotlinx.serialization.json.b json, kotlinx.serialization.json.d0 value, String str, rm.f fVar) {
        super(json, value, str, null);
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(value, "value");
        this.f54797g = value;
        this.f54798h = fVar;
    }
}
