package um;

import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.SerializationException;
import r7.pgx.XTkUEXuiK;
import tm.m1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class c extends m1 implements kotlinx.serialization.json.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kotlinx.serialization.json.b f54742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kotlinx.serialization.json.i f54743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f54744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final kotlinx.serialization.json.g f54745f;

    public /* synthetic */ c(kotlinx.serialization.json.b bVar, kotlinx.serialization.json.i iVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, iVar, str);
    }

    private final Void B0(kotlinx.serialization.json.g0 g0Var, String str, String str2) {
        StringBuilder sb2;
        String str3;
        if (bm.r.N(str, XTkUEXuiK.lHo, false, 2, null)) {
            sb2 = new StringBuilder();
            str3 = "an ";
        } else {
            sb2 = new StringBuilder();
            str3 = "a ";
        }
        sb2.append(str3);
        sb2.append(str);
        throw g0.f(-1, "Failed to parse literal '" + g0Var + "' as " + sb2.toString() + " value at element: " + A0(str2), m0().toString());
    }

    public final String A0(String currentTag) {
        kotlin.jvm.internal.s.h(currentTag, "currentTag");
        return i0() + '.' + currentTag;
    }

    @Override // tm.y2, sm.e
    public Object D(pm.c deserializer) {
        kotlinx.serialization.json.g0 g0VarK;
        kotlin.jvm.internal.s.h(deserializer, "deserializer");
        if (!(deserializer instanceof tm.b) || c().e().p()) {
            return deserializer.deserialize(this);
        }
        tm.b bVar = (tm.b) deserializer;
        String strC = v0.c(bVar.getDescriptor(), c());
        kotlinx.serialization.json.i iVarF = f();
        String strI = bVar.getDescriptor().i();
        if (iVarF instanceof kotlinx.serialization.json.d0) {
            kotlinx.serialization.json.d0 d0Var = (kotlinx.serialization.json.d0) iVarF;
            kotlinx.serialization.json.i iVar = (kotlinx.serialization.json.i) d0Var.get(strC);
            try {
                pm.c cVarA = pm.i.a((tm.b) deserializer, this, (iVar == null || (g0VarK = kotlinx.serialization.json.k.k(iVar)) == null) ? null : kotlinx.serialization.json.k.f(g0VarK));
                kotlin.jvm.internal.s.f(cVarA, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return h1.b(c(), strC, d0Var, cVarA);
            } catch (SerializationException e10) {
                String message = e10.getMessage();
                kotlin.jvm.internal.s.e(message);
                throw g0.f(-1, message, d0Var.toString());
            }
        }
        throw g0.f(-1, "Expected " + kotlin.jvm.internal.l0.b(kotlinx.serialization.json.d0.class).k() + ", but had " + kotlin.jvm.internal.l0.b(iVarF.getClass()).k() + " as the serialized body of " + strI + " at element: " + i0(), iVarF.toString());
    }

    @Override // sm.e
    public boolean E() {
        return !(m0() instanceof kotlinx.serialization.json.a0);
    }

    @Override // sm.e, sm.c
    public vm.b a() {
        return c().a();
    }

    @Override // sm.e
    public sm.c b(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        kotlinx.serialization.json.i iVarM0 = m0();
        rm.m mVarD = descriptor.d();
        if (kotlin.jvm.internal.s.c(mVarD, rm.n.b.f51422a) || (mVarD instanceof rm.d)) {
            kotlinx.serialization.json.b bVarC = c();
            String strI = descriptor.i();
            if (iVarM0 instanceof kotlinx.serialization.json.c) {
                return new q0(bVarC, (kotlinx.serialization.json.c) iVarM0);
            }
            throw g0.f(-1, "Expected " + kotlin.jvm.internal.l0.b(kotlinx.serialization.json.c.class).k() + ", but had " + kotlin.jvm.internal.l0.b(iVarM0.getClass()).k() + " as the serialized body of " + strI + " at element: " + i0(), iVarM0.toString());
        }
        if (!kotlin.jvm.internal.s.c(mVarD, rm.n.c.f51423a)) {
            kotlinx.serialization.json.b bVarC2 = c();
            String strI2 = descriptor.i();
            if (iVarM0 instanceof kotlinx.serialization.json.d0) {
                return new o0(bVarC2, (kotlinx.serialization.json.d0) iVarM0, this.f54744e, null, 8, null);
            }
            throw g0.f(-1, "Expected " + kotlin.jvm.internal.l0.b(kotlinx.serialization.json.d0.class).k() + ", but had " + kotlin.jvm.internal.l0.b(iVarM0.getClass()).k() + " as the serialized body of " + strI2 + " at element: " + i0(), iVarM0.toString());
        }
        kotlinx.serialization.json.b bVarC3 = c();
        rm.f fVarA = l1.a(descriptor.h(0), bVarC3.a());
        rm.m mVarD2 = fVarA.d();
        if ((mVarD2 instanceof rm.e) || kotlin.jvm.internal.s.c(mVarD2, rm.m.b.f51420a)) {
            kotlinx.serialization.json.b bVarC4 = c();
            String strI3 = descriptor.i();
            if (iVarM0 instanceof kotlinx.serialization.json.d0) {
                return new s0(bVarC4, (kotlinx.serialization.json.d0) iVarM0);
            }
            throw g0.f(-1, "Expected " + kotlin.jvm.internal.l0.b(kotlinx.serialization.json.d0.class).k() + ", but had " + kotlin.jvm.internal.l0.b(iVarM0.getClass()).k() + " as the serialized body of " + strI3 + " at element: " + i0(), iVarM0.toString());
        }
        if (!bVarC3.e().c()) {
            throw g0.d(fVarA);
        }
        kotlinx.serialization.json.b bVarC5 = c();
        String strI4 = descriptor.i();
        if (iVarM0 instanceof kotlinx.serialization.json.c) {
            return new q0(bVarC5, (kotlinx.serialization.json.c) iVarM0);
        }
        throw g0.f(-1, "Expected " + kotlin.jvm.internal.l0.b(kotlinx.serialization.json.c.class).k() + ", but had " + kotlin.jvm.internal.l0.b(iVarM0.getClass()).k() + " as the serialized body of " + strI4 + " at element: " + i0(), iVarM0.toString());
    }

    @Override // kotlinx.serialization.json.h
    public kotlinx.serialization.json.b c() {
        return this.f54742c;
    }

    @Override // sm.c
    public void d(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
    }

    @Override // tm.m1
    protected String e0(String parentName, String childName) {
        kotlin.jvm.internal.s.h(parentName, "parentName");
        kotlin.jvm.internal.s.h(childName, "childName");
        return childName;
    }

    @Override // kotlinx.serialization.json.h
    public kotlinx.serialization.json.i f() {
        return m0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract kotlinx.serialization.json.i l0(String str);

    protected final kotlinx.serialization.json.i m0() {
        kotlinx.serialization.json.i iVarL0;
        String str = (String) Y();
        return (str == null || (iVarL0 = l0(str)) == null) ? z0() : iVarL0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.y2
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public boolean N(String tag) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        if (iVarL0 instanceof kotlinx.serialization.json.g0) {
            kotlinx.serialization.json.g0 g0Var = (kotlinx.serialization.json.g0) iVarL0;
            try {
                Boolean boolE = kotlinx.serialization.json.k.e(g0Var);
                if (boolE != null) {
                    return boolE.booleanValue();
                }
                B0(g0Var, "boolean", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                B0(g0Var, "boolean", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw g0.f(-1, "Expected " + kotlin.jvm.internal.l0.b(kotlinx.serialization.json.g0.class).k() + ", but had " + kotlin.jvm.internal.l0.b(iVarL0.getClass()).k() + " as the serialized body of boolean at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.y2
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public byte O(String tag) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        if (iVarL0 instanceof kotlinx.serialization.json.g0) {
            kotlinx.serialization.json.g0 g0Var = (kotlinx.serialization.json.g0) iVarL0;
            try {
                int i10 = kotlinx.serialization.json.k.i(g0Var);
                Byte bValueOf = (-128 > i10 || i10 > 127) ? null : Byte.valueOf((byte) i10);
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                B0(g0Var, "byte", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                B0(g0Var, "byte", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw g0.f(-1, "Expected " + kotlin.jvm.internal.l0.b(kotlinx.serialization.json.g0.class).k() + ", but had " + kotlin.jvm.internal.l0.b(iVarL0.getClass()).k() + " as the serialized body of byte at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.y2
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public char P(String tag) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        if (iVarL0 instanceof kotlinx.serialization.json.g0) {
            kotlinx.serialization.json.g0 g0Var = (kotlinx.serialization.json.g0) iVarL0;
            try {
                return bm.r.d1(g0Var.a());
            } catch (IllegalArgumentException unused) {
                B0(g0Var, "char", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw g0.f(-1, "Expected " + kotlin.jvm.internal.l0.b(kotlinx.serialization.json.g0.class).k() + ", but had " + kotlin.jvm.internal.l0.b(iVarL0.getClass()).k() + " as the serialized body of char at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.y2
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public double Q(String tag) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        if (iVarL0 instanceof kotlinx.serialization.json.g0) {
            kotlinx.serialization.json.g0 g0Var = (kotlinx.serialization.json.g0) iVarL0;
            try {
                double dG = kotlinx.serialization.json.k.g(g0Var);
                if (c().e().b()) {
                    return dG;
                }
                if (Double.isInfinite(dG) || Double.isNaN(dG)) {
                    throw g0.a(Double.valueOf(dG), tag, m0().toString());
                }
                return dG;
            } catch (IllegalArgumentException unused) {
                B0(g0Var, "double", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw g0.f(-1, "Expected " + kotlin.jvm.internal.l0.b(kotlinx.serialization.json.g0.class).k() + ", but had " + kotlin.jvm.internal.l0.b(iVarL0.getClass()).k() + " as the serialized body of double at element: " + A0(tag), iVarL0.toString());
    }

    @Override // tm.y2, sm.e
    public sm.e r(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return Y() != null ? super.r(descriptor) : new k0(c(), z0(), this.f54744e).r(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.y2
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public int R(String tag, rm.f enumDescriptor) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlin.jvm.internal.s.h(enumDescriptor, "enumDescriptor");
        kotlinx.serialization.json.b bVarC = c();
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        String strI = enumDescriptor.i();
        if (iVarL0 instanceof kotlinx.serialization.json.g0) {
            return i0.k(enumDescriptor, bVarC, ((kotlinx.serialization.json.g0) iVarL0).a(), null, 4, null);
        }
        throw g0.f(-1, "Expected " + kotlin.jvm.internal.l0.b(kotlinx.serialization.json.g0.class).k() + ", but had " + kotlin.jvm.internal.l0.b(iVarL0.getClass()).k() + " as the serialized body of " + strI + " at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.y2
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public sm.e T(String tag, rm.f inlineDescriptor) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlin.jvm.internal.s.h(inlineDescriptor, "inlineDescriptor");
        if (!c1.b(inlineDescriptor)) {
            return super.T(tag, inlineDescriptor);
        }
        kotlinx.serialization.json.b bVarC = c();
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        String strI = inlineDescriptor.i();
        if (iVarL0 instanceof kotlinx.serialization.json.g0) {
            return new e0(e1.a(bVarC, ((kotlinx.serialization.json.g0) iVarL0).a()), c());
        }
        throw g0.f(-1, "Expected " + kotlin.jvm.internal.l0.b(kotlinx.serialization.json.g0.class).k() + ", but had " + kotlin.jvm.internal.l0.b(iVarL0.getClass()).k() + " as the serialized body of " + strI + " at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.y2
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public int U(String tag) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        if (iVarL0 instanceof kotlinx.serialization.json.g0) {
            kotlinx.serialization.json.g0 g0Var = (kotlinx.serialization.json.g0) iVarL0;
            try {
                return kotlinx.serialization.json.k.i(g0Var);
            } catch (IllegalArgumentException unused) {
                B0(g0Var, "int", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw g0.f(-1, "Expected " + kotlin.jvm.internal.l0.b(kotlinx.serialization.json.g0.class).k() + ", but had " + kotlin.jvm.internal.l0.b(iVarL0.getClass()).k() + " as the serialized body of int at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.y2
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public long V(String tag) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        if (iVarL0 instanceof kotlinx.serialization.json.g0) {
            kotlinx.serialization.json.g0 g0Var = (kotlinx.serialization.json.g0) iVarL0;
            try {
                return kotlinx.serialization.json.k.m(g0Var);
            } catch (IllegalArgumentException unused) {
                B0(g0Var, "long", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw g0.f(-1, "Expected " + kotlin.jvm.internal.l0.b(kotlinx.serialization.json.g0.class).k() + ", but had " + kotlin.jvm.internal.l0.b(iVarL0.getClass()).k() + " as the serialized body of long at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.y2
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public short W(String tag) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        if (iVarL0 instanceof kotlinx.serialization.json.g0) {
            kotlinx.serialization.json.g0 g0Var = (kotlinx.serialization.json.g0) iVarL0;
            try {
                int i10 = kotlinx.serialization.json.k.i(g0Var);
                Short shValueOf = (-32768 > i10 || i10 > 32767) ? null : Short.valueOf((short) i10);
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                B0(g0Var, "short", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                B0(g0Var, "short", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw g0.f(-1, "Expected " + kotlin.jvm.internal.l0.b(kotlinx.serialization.json.g0.class).k() + ", but had " + kotlin.jvm.internal.l0.b(iVarL0.getClass()).k() + " as the serialized body of short at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.y2
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public String X(String tag) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        if (!(iVarL0 instanceof kotlinx.serialization.json.g0)) {
            throw g0.f(-1, "Expected " + kotlin.jvm.internal.l0.b(kotlinx.serialization.json.g0.class).k() + ", but had " + kotlin.jvm.internal.l0.b(iVarL0.getClass()).k() + " as the serialized body of string at element: " + A0(tag), iVarL0.toString());
        }
        kotlinx.serialization.json.g0 g0Var = (kotlinx.serialization.json.g0) iVarL0;
        if (!(g0Var instanceof kotlinx.serialization.json.w)) {
            throw g0.f(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + A0(tag), m0().toString());
        }
        kotlinx.serialization.json.w wVar = (kotlinx.serialization.json.w) g0Var;
        if (wVar.g() || c().e().q()) {
            return wVar.a();
        }
        throw g0.f(-1, "String literal for key '" + tag + "' should be quoted at element: " + A0(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", m0().toString());
    }

    protected final String y0() {
        return this.f54744e;
    }

    public abstract kotlinx.serialization.json.i z0();

    public /* synthetic */ c(kotlinx.serialization.json.b bVar, kotlinx.serialization.json.i iVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, iVar, (i10 & 4) != 0 ? null : str, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.y2
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public float S(String tag) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        if (iVarL0 instanceof kotlinx.serialization.json.g0) {
            kotlinx.serialization.json.g0 g0Var = (kotlinx.serialization.json.g0) iVarL0;
            try {
                float fH = kotlinx.serialization.json.k.h(g0Var);
                if (c().e().b()) {
                    return fH;
                }
                if (Float.isInfinite(fH) || Float.isNaN(fH)) {
                    throw g0.a(Float.valueOf(fH), tag, m0().toString());
                }
                return fH;
            } catch (IllegalArgumentException unused) {
                B0(g0Var, "float", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw g0.f(-1, "Expected " + kotlin.jvm.internal.l0.b(kotlinx.serialization.json.g0.class).k() + ", but had " + kotlin.jvm.internal.l0.b(iVarL0.getClass()).k() + dOIDCKnIR.xNUWep + "float at element: " + A0(tag), iVarL0.toString());
    }

    private c(kotlinx.serialization.json.b bVar, kotlinx.serialization.json.i iVar, String str) {
        this.f54742c = bVar;
        this.f54743d = iVar;
        this.f54744e = str;
        this.f54745f = c().e();
    }
}
