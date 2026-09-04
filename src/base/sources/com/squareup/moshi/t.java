package com.squareup.moshi;

import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.squareup.moshi.f.e f35569a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final com.squareup.moshi.f f35570b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final com.squareup.moshi.f f35571c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final com.squareup.moshi.f f35572d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final com.squareup.moshi.f f35573e = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final com.squareup.moshi.f f35574f = new h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final com.squareup.moshi.f f35575g = new i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final com.squareup.moshi.f f35576h = new j();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final com.squareup.moshi.f f35577i = new k();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final com.squareup.moshi.f f35578j = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends com.squareup.moshi.f {
        a() {
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String fromJson(com.squareup.moshi.i iVar) {
            return iVar.i0();
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, String str) {
            oVar.W0(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35579a;

        static {
            int[] iArr = new int[com.squareup.moshi.i.b.values().length];
            f35579a = iArr;
            try {
                iArr[com.squareup.moshi.i.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35579a[com.squareup.moshi.i.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35579a[com.squareup.moshi.i.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35579a[com.squareup.moshi.i.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35579a[com.squareup.moshi.i.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35579a[com.squareup.moshi.i.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements com.squareup.moshi.f.e {
        c() {
        }

        @Override // com.squareup.moshi.f.e
        public com.squareup.moshi.f a(Type type, Set set, r rVar) throws NoSuchMethodException {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return t.f35570b;
            }
            if (type == Byte.TYPE) {
                return t.f35571c;
            }
            if (type == Character.TYPE) {
                return t.f35572d;
            }
            if (type == Double.TYPE) {
                return t.f35573e;
            }
            if (type == Float.TYPE) {
                return t.f35574f;
            }
            if (type == Integer.TYPE) {
                return t.f35575g;
            }
            if (type == Long.TYPE) {
                return t.f35576h;
            }
            if (type == Short.TYPE) {
                return t.f35577i;
            }
            if (type == Boolean.class) {
                return t.f35570b.nullSafe();
            }
            if (type == Byte.class) {
                return t.f35571c.nullSafe();
            }
            if (type == Character.class) {
                return t.f35572d.nullSafe();
            }
            if (type == Double.class) {
                return t.f35573e.nullSafe();
            }
            if (type == Float.class) {
                return t.f35574f.nullSafe();
            }
            if (type == Integer.class) {
                return t.f35575g.nullSafe();
            }
            if (type == Long.class) {
                return t.f35576h.nullSafe();
            }
            if (type == Short.class) {
                return t.f35577i.nullSafe();
            }
            if (type == String.class) {
                return t.f35578j.nullSafe();
            }
            if (type == Object.class) {
                return new m(rVar).nullSafe();
            }
            Class clsG = u.g(type);
            com.squareup.moshi.f fVarD = vj.c.d(rVar, type, clsG);
            if (fVarD != null) {
                return fVarD;
            }
            if (clsG.isEnum()) {
                return new l(clsG).nullSafe();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends com.squareup.moshi.f {
        d() {
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean fromJson(com.squareup.moshi.i iVar) {
            return Boolean.valueOf(iVar.s());
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, Boolean bool) {
            oVar.X0(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends com.squareup.moshi.f {
        e() {
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte fromJson(com.squareup.moshi.i iVar) {
            return Byte.valueOf((byte) t.a(iVar, "a byte", -128, 255));
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, Byte b10) {
            oVar.U0(b10.intValue() & 255);
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends com.squareup.moshi.f {
        f() {
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character fromJson(com.squareup.moshi.i iVar) {
            String strI0 = iVar.i0();
            if (strI0.length() <= 1) {
                return Character.valueOf(strI0.charAt(0));
            }
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", "a char", '\"' + strI0 + '\"', iVar.w()));
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, Character ch2) {
            oVar.W0(ch2.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g extends com.squareup.moshi.f {
        g() {
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double fromJson(com.squareup.moshi.i iVar) {
            return Double.valueOf(iVar.t());
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, Double d10) {
            oVar.T0(d10.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h extends com.squareup.moshi.f {
        h() {
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float fromJson(com.squareup.moshi.i iVar) {
            float fT = (float) iVar.t();
            if (iVar.r() || !Float.isInfinite(fT)) {
                return Float.valueOf(fT);
            }
            throw new JsonDataException("JSON forbids NaN and infinities: " + fT + " at path " + iVar.w());
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, Float f10) {
            f10.getClass();
            oVar.V0(f10);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i extends com.squareup.moshi.f {
        i() {
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer fromJson(com.squareup.moshi.i iVar) {
            return Integer.valueOf(iVar.c0());
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, Integer num) {
            oVar.U0(num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class j extends com.squareup.moshi.f {
        j() {
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long fromJson(com.squareup.moshi.i iVar) {
            return Long.valueOf(iVar.d0());
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, Long l10) {
            oVar.U0(l10.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class k extends com.squareup.moshi.f {
        k() {
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Short fromJson(com.squareup.moshi.i iVar) {
            return Short.valueOf((short) t.a(iVar, "a short", -32768, 32767));
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, Short sh2) {
            oVar.U0(sh2.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    static final class l extends com.squareup.moshi.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f35580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f35581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Enum[] f35582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.squareup.moshi.i.a f35583d;

        l(Class cls) {
            this.f35580a = cls;
            try {
                Enum[] enumArr = (Enum[]) cls.getEnumConstants();
                this.f35582c = enumArr;
                this.f35581b = new String[enumArr.length];
                int i10 = 0;
                while (true) {
                    Enum[] enumArr2 = this.f35582c;
                    if (i10 >= enumArr2.length) {
                        this.f35583d = com.squareup.moshi.i.a.a(this.f35581b);
                        return;
                    } else {
                        String strName = enumArr2[i10].name();
                        this.f35581b[i10] = vj.c.m(strName, cls.getField(strName));
                        i10++;
                    }
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError("Missing field in " + cls.getName(), e10);
            }
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, Enum r10) {
            oVar.W0(this.f35581b[r10.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f35580a.getName() + ")";
        }

        @Override // com.squareup.moshi.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Enum fromJson(com.squareup.moshi.i iVar) {
            int iT0 = iVar.T0(this.f35583d);
            if (iT0 != -1) {
                return this.f35582c[iT0];
            }
            String strW = iVar.w();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.f35581b) + " but was " + iVar.i0() + UHbHibBvYxKnPE.hQedOMRzZTNrzzu + strW);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class m extends com.squareup.moshi.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f35584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.squareup.moshi.f f35585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.squareup.moshi.f f35586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.squareup.moshi.f f35587d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.squareup.moshi.f f35588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.squareup.moshi.f f35589f;

        m(r rVar) {
            this.f35584a = rVar;
            this.f35585b = rVar.c(List.class);
            this.f35586c = rVar.c(Map.class);
            this.f35587d = rVar.c(String.class);
            this.f35588e = rVar.c(Double.class);
            this.f35589f = rVar.c(Boolean.class);
        }

        private Class a(Class cls) {
            if (Map.class.isAssignableFrom(cls)) {
                return Map.class;
            }
            return Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // com.squareup.moshi.f
        public Object fromJson(com.squareup.moshi.i iVar) {
            switch (b.f35579a[iVar.p0().ordinal()]) {
                case 1:
                    return this.f35585b.fromJson(iVar);
                case 2:
                    return this.f35586c.fromJson(iVar);
                case 3:
                    return this.f35587d.fromJson(iVar);
                case 4:
                    return this.f35588e.fromJson(iVar);
                case 5:
                    return this.f35589f.fromJson(iVar);
                case 6:
                    return iVar.g0();
                default:
                    throw new IllegalStateException("Expected a value but was " + iVar.p0() + " at path " + iVar.w());
            }
        }

        @Override // com.squareup.moshi.f
        public void toJson(o oVar, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls != Object.class) {
                this.f35584a.e(a(cls), vj.c.f55651a).toJson(oVar, obj);
            } else {
                oVar.h();
                oVar.m();
            }
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    static int a(com.squareup.moshi.i iVar, String str, int i10, int i11) {
        int iC0 = iVar.c0();
        if (iC0 < i10 || iC0 > i11) {
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(iC0), iVar.w()));
        }
        return iC0;
    }
}
