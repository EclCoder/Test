package um;

import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b1 extends sm.b implements kotlinx.serialization.json.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f54732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kotlinx.serialization.json.b f54733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k1 f54734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kotlinx.serialization.json.t[] f54735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vm.b f54736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final kotlinx.serialization.json.g f54737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f54738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f54739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f54740i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54741a;

        static {
            int[] iArr = new int[k1.values().length];
            try {
                iArr[k1.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k1.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k1.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f54741a = iArr;
        }
    }

    public b1(s composer, kotlinx.serialization.json.b json, k1 mode, kotlinx.serialization.json.t[] tVarArr) {
        kotlin.jvm.internal.s.h(composer, "composer");
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(mode, "mode");
        this.f54732a = composer;
        this.f54733b = json;
        this.f54734c = mode;
        this.f54735d = tVarArr;
        this.f54736e = c().a();
        this.f54737f = c().e();
        int iOrdinal = mode.ordinal();
        if (tVarArr != null) {
            kotlinx.serialization.json.t tVar = tVarArr[iOrdinal];
            if (tVar == null && tVar == this) {
                return;
            }
            tVarArr[iOrdinal] = this;
        }
    }

    private final void K(String str, String str2) {
        this.f54732a.c();
        G(str);
        this.f54732a.f(':');
        this.f54732a.p();
        G(str2);
    }

    @Override // kotlinx.serialization.json.t
    public void B(kotlinx.serialization.json.i element) {
        kotlin.jvm.internal.s.h(element, "element");
        if (this.f54739h == null || (element instanceof kotlinx.serialization.json.d0)) {
            q(kotlinx.serialization.json.r.f43683a, element);
        } else {
            v0.d(this.f54740i, element);
            throw new KotlinNothingValueException();
        }
    }

    @Override // sm.b, sm.f
    public void D(int i10) {
        if (this.f54738g) {
            G(String.valueOf(i10));
        } else {
            this.f54732a.i(i10);
        }
    }

    @Override // sm.b, sm.f
    public void E(rm.f enumDescriptor, int i10) {
        kotlin.jvm.internal.s.h(enumDescriptor, "enumDescriptor");
        G(enumDescriptor.f(i10));
    }

    @Override // sm.b, sm.f
    public void G(String value) {
        kotlin.jvm.internal.s.h(value, "value");
        this.f54732a.n(value);
    }

    @Override // sm.b
    public boolean H(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        int i11 = a.f54741a[this.f54734c.ordinal()];
        if (i11 != 1) {
            boolean z10 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (!this.f54732a.a()) {
                        this.f54732a.f(',');
                    }
                    this.f54732a.c();
                    G(i0.h(descriptor, c(), i10));
                    this.f54732a.f(':');
                    this.f54732a.p();
                } else {
                    if (i10 == 0) {
                        this.f54738g = true;
                    }
                    if (i10 == 1) {
                        this.f54732a.f(',');
                        this.f54732a.p();
                        this.f54738g = false;
                    }
                }
            } else if (this.f54732a.a()) {
                this.f54738g = true;
                this.f54732a.c();
            } else {
                if (i10 % 2 == 0) {
                    this.f54732a.f(',');
                    this.f54732a.c();
                    z10 = true;
                } else {
                    this.f54732a.f(':');
                    this.f54732a.p();
                }
                this.f54738g = z10;
            }
        } else {
            if (!this.f54732a.a()) {
                this.f54732a.f(',');
            }
            this.f54732a.c();
        }
        return true;
    }

    @Override // sm.f
    public vm.b a() {
        return this.f54736e;
    }

    @Override // sm.b, sm.f
    public sm.d b(rm.f descriptor) {
        kotlinx.serialization.json.t tVar;
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        k1 k1VarB = l1.b(c(), descriptor);
        char c10 = k1VarB.f54786a;
        if (c10 != 0) {
            this.f54732a.f(c10);
            this.f54732a.b();
        }
        String str = this.f54739h;
        if (str != null) {
            String strI = this.f54740i;
            if (strI == null) {
                strI = descriptor.i();
            }
            K(str, strI);
            this.f54739h = null;
            this.f54740i = null;
        }
        if (this.f54734c == k1VarB) {
            return this;
        }
        kotlinx.serialization.json.t[] tVarArr = this.f54735d;
        return (tVarArr == null || (tVar = tVarArr[k1VarB.ordinal()]) == null) ? new b1(this.f54732a, c(), k1VarB, this.f54735d) : tVar;
    }

    @Override // kotlinx.serialization.json.t
    public kotlinx.serialization.json.b c() {
        return this.f54733b;
    }

    @Override // sm.b, sm.d
    public void d(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        if (this.f54734c.f54787b != 0) {
            this.f54732a.q();
            this.f54732a.d();
            this.f54732a.f(this.f54734c.f54787b);
        }
    }

    @Override // sm.b, sm.f
    public void g(double d10) {
        if (this.f54738g) {
            G(String.valueOf(d10));
        } else {
            this.f54732a.g(d10);
        }
        if (this.f54737f.b()) {
            return;
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw g0.b(Double.valueOf(d10), this.f54732a.f54816a.toString());
        }
    }

    @Override // sm.b, sm.f
    public void h(byte b10) {
        if (this.f54738g) {
            G(String.valueOf((int) b10));
        } else {
            this.f54732a.e(b10);
        }
    }

    @Override // sm.b, sm.d
    public boolean k(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return this.f54737f.i();
    }

    @Override // sm.b, sm.f
    public sm.f m(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        if (c1.b(descriptor)) {
            s wVar = this.f54732a;
            if (!(wVar instanceof w)) {
                wVar = new w(wVar.f54816a, this.f54738g);
            }
            return new b1(wVar, c(), this.f54734c, (kotlinx.serialization.json.t[]) null);
        }
        if (c1.a(descriptor)) {
            s tVar = this.f54732a;
            if (!(tVar instanceof t)) {
                tVar = new t(tVar.f54816a, this.f54738g);
            }
            return new b1(tVar, c(), this.f54734c, (kotlinx.serialization.json.t[]) null);
        }
        if (this.f54739h == null) {
            return super.m(descriptor);
        }
        this.f54740i = descriptor.i();
        return this;
    }

    @Override // sm.b, sm.f
    public void o(long j10) {
        if (this.f54738g) {
            G(String.valueOf(j10));
        } else {
            this.f54732a.j(j10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    @Override // sm.b, sm.f
    public void q(pm.l serializer, Object obj) {
        String strC;
        kotlin.jvm.internal.s.h(serializer, "serializer");
        if (c().e().p()) {
            serializer.serialize(this, obj);
            return;
        }
        boolean z10 = serializer instanceof tm.b;
        if (!z10) {
            int i10 = v0.a.f54839a[c().e().f().ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                rm.m mVarD = serializer.getDescriptor().d();
                strC = (kotlin.jvm.internal.s.c(mVarD, rm.n.a.f51421a) || kotlin.jvm.internal.s.c(mVarD, rm.n.d.f51424a)) ? v0.c(serializer.getDescriptor(), c()) : null;
            }
        } else if (c().e().f() != kotlinx.serialization.json.a.NONE) {
        }
        if (z10) {
            tm.b bVar = (tm.b) serializer;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + bVar.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            pm.l lVarB = pm.i.b(bVar, this, obj);
            if (strC != null) {
                v0.e(serializer, lVarB, strC);
            }
            v0.b(lVarB.getDescriptor().d());
            kotlin.jvm.internal.s.f(lVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializer = lVarB;
        }
        if (strC != null) {
            String strI = serializer.getDescriptor().i();
            this.f54739h = strC;
            this.f54740i = strI;
        }
        serializer.serialize(this, obj);
    }

    @Override // sm.b, sm.f
    public void s() {
        this.f54732a.k("null");
    }

    @Override // sm.b, sm.f
    public void t(short s10) {
        if (this.f54738g) {
            G(String.valueOf((int) s10));
        } else {
            this.f54732a.l(s10);
        }
    }

    @Override // sm.b, sm.f
    public void u(boolean z10) {
        if (this.f54738g) {
            G(String.valueOf(z10));
        } else {
            this.f54732a.m(z10);
        }
    }

    @Override // sm.b, sm.d
    public void w(rm.f descriptor, int i10, pm.l serializer, Object obj) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        kotlin.jvm.internal.s.h(serializer, "serializer");
        if (obj != null || this.f54737f.j()) {
            super.w(descriptor, i10, serializer, obj);
        }
    }

    @Override // sm.b, sm.f
    public void x(float f10) {
        if (this.f54738g) {
            G(String.valueOf(f10));
        } else {
            this.f54732a.h(f10);
        }
        if (this.f54737f.b()) {
            return;
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw g0.b(Float.valueOf(f10), this.f54732a.f54816a.toString());
        }
    }

    @Override // sm.b, sm.f
    public void y(char c10) {
        G(String.valueOf(c10));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b1(c0 output, kotlinx.serialization.json.b json, k1 mode, kotlinx.serialization.json.t[] modeReuseCache) {
        this(y.a(output, json), json, mode, modeReuseCache);
        kotlin.jvm.internal.s.h(output, "output");
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(mode, "mode");
        kotlin.jvm.internal.s.h(modeReuseCache, "modeReuseCache");
    }
}
