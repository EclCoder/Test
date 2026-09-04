package um;

import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a1 extends sm.a implements kotlinx.serialization.json.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kotlinx.serialization.json.b f54722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k1 f54723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final um.a f54724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vm.b f54725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f54726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f54727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kotlinx.serialization.json.g f54728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f0 f54729h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f54730a;

        public a(String str) {
            this.f54730a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54731a;

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
            try {
                iArr[k1.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f54731a = iArr;
        }
    }

    public a1(kotlinx.serialization.json.b json, k1 mode, um.a lexer, rm.f descriptor, a aVar) {
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(mode, "mode");
        kotlin.jvm.internal.s.h(lexer, "lexer");
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        this.f54722a = json;
        this.f54723b = mode;
        this.f54724c = lexer;
        this.f54725d = json.a();
        this.f54726e = -1;
        this.f54727f = aVar;
        kotlinx.serialization.json.g gVarE = json.e();
        this.f54728g = gVarE;
        this.f54729h = gVarE.j() ? null : new f0(descriptor);
    }

    private final void K() {
        if (this.f54724c.G() != 4) {
            return;
        }
        um.a.x(this.f54724c, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean L(rm.f fVar, int i10) {
        String strH;
        kotlinx.serialization.json.b bVar = this.f54722a;
        boolean zJ = fVar.j(i10);
        rm.f fVarH = fVar.h(i10);
        if (zJ && !fVarH.b() && this.f54724c.O(true)) {
            return true;
        }
        if (!kotlin.jvm.internal.s.c(fVarH.d(), rm.m.b.f51420a) || ((fVarH.b() && this.f54724c.O(false)) || (strH = this.f54724c.H(this.f54728g.q())) == null)) {
            return false;
        }
        int i11 = i0.i(fVarH, bVar, strH);
        boolean z10 = !bVar.e().j() && fVarH.b();
        if (i11 == -3 && (zJ || z10)) {
            this.f54724c.o();
            return true;
        }
        return false;
    }

    private final int M() {
        boolean zN = this.f54724c.N();
        if (!this.f54724c.e()) {
            if (!zN || this.f54722a.e().d()) {
                return -1;
            }
            g0.h(this.f54724c, "array");
            throw new KotlinNothingValueException();
        }
        int i10 = this.f54726e;
        if (i10 != -1 && !zN) {
            um.a.x(this.f54724c, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = i10 + 1;
        this.f54726e = i11;
        return i11;
    }

    private final int N() {
        int i10 = this.f54726e;
        boolean zN = false;
        boolean z10 = i10 % 2 != 0;
        if (!z10) {
            this.f54724c.l(':');
        } else if (i10 != -1) {
            zN = this.f54724c.N();
        }
        if (!this.f54724c.e()) {
            if (!zN || this.f54722a.e().d()) {
                return -1;
            }
            g0.i(this.f54724c, null, 1, null);
            throw new KotlinNothingValueException();
        }
        if (z10) {
            if (this.f54726e == -1) {
                um.a aVar = this.f54724c;
                int i11 = aVar.f54717a;
                if (zN) {
                    um.a.x(aVar, "Unexpected leading comma", i11, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                um.a aVar2 = this.f54724c;
                boolean z11 = zN;
                int i12 = aVar2.f54717a;
                if (!z11) {
                    um.a.x(aVar2, "Expected comma after the key-value pair", i12, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i13 = this.f54726e + 1;
        this.f54726e = i13;
        return i13;
    }

    private final int O(rm.f fVar) {
        boolean zN;
        boolean zN2 = this.f54724c.N();
        while (true) {
            boolean z10 = true;
            if (!this.f54724c.e()) {
                if (zN2 && !this.f54722a.e().d()) {
                    g0.i(this.f54724c, null, 1, null);
                    throw new KotlinNothingValueException();
                }
                f0 f0Var = this.f54729h;
                if (f0Var != null) {
                    return f0Var.d();
                }
                return -1;
            }
            String strP = P();
            this.f54724c.l(':');
            int i10 = i0.i(fVar, this.f54722a, strP);
            if (i10 == -3) {
                zN = false;
            } else {
                if (!this.f54728g.g() || !L(fVar, i10)) {
                    f0 f0Var2 = this.f54729h;
                    if (f0Var2 != null) {
                        f0Var2.c(i10);
                    }
                    return i10;
                }
                zN = this.f54724c.N();
                z10 = false;
            }
            zN2 = z10 ? Q(strP) : zN;
        }
    }

    private final String P() {
        return this.f54728g.q() ? this.f54724c.r() : this.f54724c.i();
    }

    private final boolean Q(String str) {
        if (this.f54728g.k() || S(this.f54727f, str)) {
            this.f54724c.J(this.f54728g.q());
        } else {
            this.f54724c.A(str);
        }
        return this.f54724c.N();
    }

    private final void R(rm.f fVar) {
        while (o(fVar) != -1) {
        }
    }

    private final boolean S(a aVar, String str) {
        if (aVar == null || !kotlin.jvm.internal.s.c(aVar.f54730a, str)) {
            return false;
        }
        aVar.f54730a = null;
        return true;
    }

    @Override // sm.a, sm.e
    public String C() {
        return this.f54728g.q() ? this.f54724c.r() : this.f54724c.o();
    }

    @Override // sm.a, sm.e
    public boolean E() {
        f0 f0Var = this.f54729h;
        return ((f0Var != null ? f0Var.b() : false) || um.a.P(this.f54724c, false, 1, null)) ? false : true;
    }

    @Override // sm.a, sm.e
    public byte F() {
        long jM = this.f54724c.m();
        byte b10 = (byte) jM;
        if (jM == b10) {
            return b10;
        }
        um.a.x(this.f54724c, "Failed to parse byte for input '" + jM + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // sm.a, sm.e
    public int G(rm.f enumDescriptor) {
        kotlin.jvm.internal.s.h(enumDescriptor, "enumDescriptor");
        return i0.j(enumDescriptor, this.f54722a, C(), " at path " + this.f54724c.f54718b.a());
    }

    @Override // sm.e, sm.c
    public vm.b a() {
        return this.f54725d;
    }

    @Override // sm.a, sm.e
    public sm.c b(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        k1 k1VarB = l1.b(this.f54722a, descriptor);
        this.f54724c.f54718b.c(descriptor);
        this.f54724c.l(k1VarB.f54786a);
        K();
        int i10 = b.f54731a[k1VarB.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return new a1(this.f54722a, k1VarB, this.f54724c, descriptor, this.f54727f);
        }
        return (this.f54723b == k1VarB && this.f54722a.e().j()) ? this : new a1(this.f54722a, k1VarB, this.f54724c, descriptor, this.f54727f);
    }

    @Override // kotlinx.serialization.json.h
    public final kotlinx.serialization.json.b c() {
        return this.f54722a;
    }

    @Override // sm.a, sm.c
    public void d(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        if (this.f54722a.e().k() && descriptor.e() == 0) {
            R(descriptor);
        }
        if (this.f54724c.N() && !this.f54722a.e().d()) {
            g0.h(this.f54724c, "");
            throw new KotlinNothingValueException();
        }
        this.f54724c.l(this.f54723b.f54787b);
        this.f54724c.f54718b.b();
    }

    @Override // kotlinx.serialization.json.h
    public kotlinx.serialization.json.i f() {
        return new u0(this.f54722a.e(), this.f54724c).e();
    }

    @Override // sm.a, sm.e
    public int g() {
        long jM = this.f54724c.m();
        int i10 = (int) jM;
        if (jM == i10) {
            return i10;
        }
        um.a.x(this.f54724c, "Failed to parse int for input '" + jM + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // sm.a, sm.e
    public Void j() {
        return null;
    }

    @Override // sm.a, sm.e
    public long k() {
        return this.f54724c.m();
    }

    @Override // sm.a, sm.c
    public Object n(rm.f descriptor, int i10, pm.c deserializer, Object obj) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        kotlin.jvm.internal.s.h(deserializer, "deserializer");
        boolean z10 = this.f54723b == k1.MAP && (i10 & 1) == 0;
        if (z10) {
            this.f54724c.f54718b.d();
        }
        Object objN = super.n(descriptor, i10, deserializer, obj);
        if (z10) {
            this.f54724c.f54718b.f(objN);
        }
        return objN;
    }

    @Override // sm.c
    public int o(rm.f descriptor) {
        int iN;
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        int i10 = b.f54731a[this.f54723b.ordinal()];
        if (i10 != 2) {
            iN = i10 != 4 ? M() : O(descriptor);
        } else {
            iN = N();
        }
        if (this.f54723b != k1.MAP) {
            this.f54724c.f54718b.g(iN);
        }
        return iN;
    }

    @Override // sm.a, sm.e
    public short p() {
        long jM = this.f54724c.m();
        short s10 = (short) jM;
        if (jM == s10) {
            return s10;
        }
        um.a.x(this.f54724c, "Failed to parse short for input '" + jM + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // sm.a, sm.e
    public float q() {
        um.a aVar = this.f54724c;
        String strQ = aVar.q();
        try {
            float f10 = Float.parseFloat(strQ);
            if (this.f54722a.e().b()) {
                return f10;
            }
            if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
                return f10;
            }
            g0.l(this.f54724c, Float.valueOf(f10));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            um.a.x(aVar, "Failed to parse type 'float' for input '" + strQ + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // sm.a, sm.e
    public sm.e r(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return c1.b(descriptor) ? new e0(this.f54724c, this.f54722a) : super.r(descriptor);
    }

    @Override // sm.a, sm.e
    public double t() {
        um.a aVar = this.f54724c;
        String strQ = aVar.q();
        try {
            double d10 = Double.parseDouble(strQ);
            if (this.f54722a.e().b()) {
                return d10;
            }
            if (!Double.isInfinite(d10) && !Double.isNaN(d10)) {
                return d10;
            }
            g0.l(this.f54724c, Double.valueOf(d10));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            um.a.x(aVar, "Failed to parse type 'double' for input '" + strQ + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // sm.a, sm.e
    public boolean u() {
        return this.f54724c.g();
    }

    @Override // sm.a, sm.e
    public char v() {
        String strQ = this.f54724c.q();
        if (strQ.length() == 1) {
            return strQ.charAt(0);
        }
        um.a.x(this.f54724c, "Expected single char, but got '" + strQ + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0156  */
    /* JADX WARN: Code duplicated, block: B:44:0x0157  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x0157, please report this as an issue */
    @Override // sm.a, sm.e
    public Object D(pm.c deserializer) {
        String message;
        kotlinx.serialization.json.g0 g0VarK;
        kotlin.jvm.internal.s.h(deserializer, "deserializer");
        try {
            if ((deserializer instanceof tm.b) && !this.f54722a.e().p()) {
                String strC = v0.c(((tm.b) deserializer).getDescriptor(), this.f54722a);
                String strF = this.f54724c.F(strC, this.f54728g.q());
                if (strF != null) {
                    try {
                        pm.c cVarA = pm.i.a((tm.b) deserializer, this, strF);
                        kotlin.jvm.internal.s.f(cVarA, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                        this.f54727f = new a(strC);
                        return cVarA.deserialize(this);
                    } catch (SerializationException e10) {
                        String message2 = e10.getMessage();
                        kotlin.jvm.internal.s.e(message2);
                        String strZ0 = bm.r.z0(bm.r.R0(message2, '\n', null, 2, null), ".");
                        String message3 = e10.getMessage();
                        kotlin.jvm.internal.s.e(message3);
                        um.a.x(this.f54724c, strZ0, 0, bm.r.L0(message3, '\n', ""), 2, null);
                        throw new KotlinNothingValueException();
                    }
                }
                if (c().e().p()) {
                    return deserializer.deserialize(this);
                }
                String strC2 = v0.c(((tm.b) deserializer).getDescriptor(), c());
                kotlinx.serialization.json.i iVarF = f();
                String strI = ((tm.b) deserializer).getDescriptor().i();
                if (iVarF instanceof kotlinx.serialization.json.d0) {
                    kotlinx.serialization.json.d0 d0Var = (kotlinx.serialization.json.d0) iVarF;
                    kotlinx.serialization.json.i iVar = (kotlinx.serialization.json.i) d0Var.get(strC2);
                    try {
                        pm.c cVarA2 = pm.i.a((tm.b) deserializer, this, (iVar == null || (g0VarK = kotlinx.serialization.json.k.k(iVar)) == null) ? null : kotlinx.serialization.json.k.f(g0VarK));
                        kotlin.jvm.internal.s.f(cVarA2, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                        return h1.b(c(), strC2, d0Var, cVarA2);
                    } catch (SerializationException e11) {
                        String message4 = e11.getMessage();
                        kotlin.jvm.internal.s.e(message4);
                        throw g0.f(-1, message4, d0Var.toString());
                    }
                }
                throw g0.f(-1, "Expected " + kotlin.jvm.internal.l0.b(kotlinx.serialization.json.d0.class).k() + ", but had " + kotlin.jvm.internal.l0.b(iVarF.getClass()).k() + " as the serialized body of " + strI + " at element: " + this.f54724c.f54718b.a(), iVarF.toString());
                message = e.getMessage();
                kotlin.jvm.internal.s.e(message);
                if (bm.r.T(message, "at path", false, 2, null)) {
                    throw e;
                }
                throw new MissingFieldException(e.getMissingFields(), e.getMessage() + NhHRaDJCHtCTJR.FyzeblvgFeSXKf + this.f54724c.f54718b.a(), e);
            }
            return deserializer.deserialize(this);
        } catch (MissingFieldException e12) {
            message = e12.getMessage();
            kotlin.jvm.internal.s.e(message);
            if (bm.r.T(message, "at path", false, 2, null)) {
                throw e12;
            }
            throw new MissingFieldException(e12.getMissingFields(), e12.getMessage() + NhHRaDJCHtCTJR.FyzeblvgFeSXKf + this.f54724c.f54718b.a(), e12);
        }
    }
}
