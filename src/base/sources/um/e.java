package um;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tm.n1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class e extends n1 implements kotlinx.serialization.json.t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kotlinx.serialization.json.b f54750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f54751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final kotlinx.serialization.json.g f54752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f54753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f54754f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends sm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f54756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ rm.f f54757c;

        a(String str, rm.f fVar) {
            this.f54756b = str;
            this.f54757c = fVar;
        }

        @Override // sm.b, sm.f
        public void G(String value) {
            kotlin.jvm.internal.s.h(value, "value");
            e.this.w0(this.f54756b, new kotlinx.serialization.json.w(value, false, this.f54757c));
        }

        @Override // sm.f
        public vm.b a() {
            return e.this.c().a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends sm.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final vm.b f54758a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f54760c;

        b(String str) {
            this.f54760c = str;
            this.f54758a = e.this.c().a();
        }

        @Override // sm.b, sm.f
        public void D(int i10) {
            K(Long.toString(((long) fl.z.b(i10)) & 4294967295L, 10));
        }

        public final void K(String s10) {
            kotlin.jvm.internal.s.h(s10, "s");
            e.this.w0(this.f54760c, new kotlinx.serialization.json.w(s10, false, null, 4, null));
        }

        @Override // sm.f
        public vm.b a() {
            return this.f54758a;
        }

        @Override // sm.b, sm.f
        public void h(byte b10) {
            K(fl.x.e(fl.x.b(b10)));
        }

        @Override // sm.b, sm.f
        public void o(long j10) {
            K(h.a(fl.b0.b(j10), 10));
        }

        @Override // sm.b, sm.f
        public void t(short s10) {
            K(fl.e0.e(fl.e0.b(s10)));
        }
    }

    public /* synthetic */ e(kotlinx.serialization.json.b bVar, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 f0(e eVar, kotlinx.serialization.json.i node) {
        kotlin.jvm.internal.s.h(node, "node");
        eVar.w0((String) eVar.V(), node);
        return fl.g0.f38750a;
    }

    private final a u0(String str, rm.f fVar) {
        return new a(str, fVar);
    }

    private final b v0(String str) {
        return new b(str);
    }

    @Override // kotlinx.serialization.json.t
    public void B(kotlinx.serialization.json.i element) {
        kotlin.jvm.internal.s.h(element, "element");
        if (this.f54753e == null || (element instanceof kotlinx.serialization.json.d0)) {
            q(kotlinx.serialization.json.r.f43683a, element);
        } else {
            v0.d(this.f54754f, element);
            throw new KotlinNothingValueException();
        }
    }

    @Override // tm.z2
    protected void U(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        this.f54751c.invoke(s0());
    }

    @Override // sm.f
    public final vm.b a() {
        return this.f54750b.a();
    }

    @Override // tm.n1
    protected String a0(String parentName, String childName) {
        kotlin.jvm.internal.s.h(parentName, "parentName");
        kotlin.jvm.internal.s.h(childName, "childName");
        return childName;
    }

    @Override // sm.f
    public sm.d b(rm.f descriptor) {
        e r0Var;
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        Function1 function1 = W() == null ? this.f54751c : new Function1() { // from class: um.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.f0(this.f54747a, (kotlinx.serialization.json.i) obj);
            }
        };
        rm.m mVarD = descriptor.d();
        if (kotlin.jvm.internal.s.c(mVarD, rm.n.b.f51422a) || (mVarD instanceof rm.d)) {
            r0Var = new r0(this.f54750b, function1);
        } else if (kotlin.jvm.internal.s.c(mVarD, rm.n.c.f51423a)) {
            kotlinx.serialization.json.b bVar = this.f54750b;
            rm.f fVarA = l1.a(descriptor.h(0), bVar.a());
            rm.m mVarD2 = fVarA.d();
            if ((mVarD2 instanceof rm.e) || kotlin.jvm.internal.s.c(mVarD2, rm.m.b.f51420a)) {
                r0Var = new t0(this.f54750b, function1);
            } else {
                if (!bVar.e().c()) {
                    throw g0.d(fVarA);
                }
                r0Var = new r0(this.f54750b, function1);
            }
        } else {
            r0Var = new p0(this.f54750b, function1);
        }
        String str = this.f54753e;
        if (str != null) {
            if (r0Var instanceof t0) {
                t0 t0Var = (t0) r0Var;
                t0Var.w0("key", kotlinx.serialization.json.k.c(str));
                String strI = this.f54754f;
                if (strI == null) {
                    strI = descriptor.i();
                }
                t0Var.w0(AppMeasurementSdk.ConditionalUserProperty.VALUE, kotlinx.serialization.json.k.c(strI));
            } else {
                String strI2 = this.f54754f;
                if (strI2 == null) {
                    strI2 = descriptor.i();
                }
                r0Var.w0(str, kotlinx.serialization.json.k.c(strI2));
            }
            this.f54753e = null;
            this.f54754f = null;
        }
        return r0Var;
    }

    @Override // tm.n1
    protected String b0(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return i0.h(descriptor, this.f54750b, i10);
    }

    @Override // kotlinx.serialization.json.t
    public final kotlinx.serialization.json.b c() {
        return this.f54750b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.z2
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void J(String tag, boolean z10) {
        kotlin.jvm.internal.s.h(tag, "tag");
        w0(tag, kotlinx.serialization.json.k.a(Boolean.valueOf(z10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.z2
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void K(String tag, byte b10) {
        kotlin.jvm.internal.s.h(tag, "tag");
        w0(tag, kotlinx.serialization.json.k.b(Byte.valueOf(b10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.z2
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void L(String tag, char c10) {
        kotlin.jvm.internal.s.h(tag, "tag");
        w0(tag, kotlinx.serialization.json.k.c(String.valueOf(c10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.z2
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void M(String tag, double d10) {
        kotlin.jvm.internal.s.h(tag, "tag");
        w0(tag, kotlinx.serialization.json.k.b(Double.valueOf(d10)));
        if (this.f54752d.b()) {
            return;
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw g0.c(Double.valueOf(d10), tag, s0().toString());
        }
    }

    @Override // sm.d
    public boolean k(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return this.f54752d.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.z2
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void N(String tag, rm.f enumDescriptor, int i10) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlin.jvm.internal.s.h(enumDescriptor, "enumDescriptor");
        w0(tag, kotlinx.serialization.json.k.c(enumDescriptor.f(i10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.z2
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void O(String tag, float f10) {
        kotlin.jvm.internal.s.h(tag, "tag");
        w0(tag, kotlinx.serialization.json.k.b(Float.valueOf(f10)));
        if (this.f54752d.b()) {
            return;
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw g0.c(Float.valueOf(f10), tag, s0().toString());
        }
    }

    @Override // tm.z2, sm.f
    public sm.f m(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        if (W() == null) {
            return new l0(this.f54750b, this.f54751c).m(descriptor);
        }
        if (this.f54753e != null) {
            this.f54754f = descriptor.i();
        }
        return super.m(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.z2
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public sm.f P(String tag, rm.f inlineDescriptor) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlin.jvm.internal.s.h(inlineDescriptor, "inlineDescriptor");
        if (c1.b(inlineDescriptor)) {
            return v0(tag);
        }
        return c1.a(inlineDescriptor) ? u0(tag, inlineDescriptor) : super.P(tag, inlineDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.z2
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void Q(String tag, int i10) {
        kotlin.jvm.internal.s.h(tag, "tag");
        w0(tag, kotlinx.serialization.json.k.b(Integer.valueOf(i10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.z2
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void R(String tag, long j10) {
        kotlin.jvm.internal.s.h(tag, "tag");
        w0(tag, kotlinx.serialization.json.k.b(Long.valueOf(j10)));
    }

    protected void p0(String tag) {
        kotlin.jvm.internal.s.h(tag, "tag");
        w0(tag, kotlinx.serialization.json.a0.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    @Override // tm.z2, sm.f
    public void q(pm.l serializer, Object obj) {
        String strC;
        kotlin.jvm.internal.s.h(serializer, "serializer");
        if (W() == null && j1.c(l1.a(serializer.getDescriptor(), a()))) {
            new l0(this.f54750b, this.f54751c).q(serializer, obj);
            return;
        }
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
            this.f54753e = strC;
            this.f54754f = strI;
        }
        serializer.serialize(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.z2
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void S(String tag, short s10) {
        kotlin.jvm.internal.s.h(tag, "tag");
        w0(tag, kotlinx.serialization.json.k.b(Short.valueOf(s10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.z2
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void T(String tag, String value) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlin.jvm.internal.s.h(value, "value");
        w0(tag, kotlinx.serialization.json.k.c(value));
    }

    @Override // sm.f
    public void s() {
        String str = (String) W();
        if (str == null) {
            this.f54751c.invoke(kotlinx.serialization.json.a0.INSTANCE);
        } else {
            p0(str);
        }
    }

    public abstract kotlinx.serialization.json.i s0();

    protected final Function1 t0() {
        return this.f54751c;
    }

    public abstract void w0(String str, kotlinx.serialization.json.i iVar);

    private e(kotlinx.serialization.json.b bVar, Function1 function1) {
        this.f54750b = bVar;
        this.f54751c = function1;
        this.f54752d = bVar.e();
    }

    @Override // sm.f
    public void z() {
    }
}
