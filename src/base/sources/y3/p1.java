package y3;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class p1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f57270c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p1 f57271d = new q();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p1 f57272e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p1 f57273f = new o();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p1 f57274g = new p();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p1 f57275h = new t();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p1 f57276i = new r();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p1 f57277j = new s();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p1 f57278k = new m();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p1 f57279l = new k();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p1 f57280m = new l();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p1 f57281n = new i();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p1 f57282o = new y3.g();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p1 f57283p = new h();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p1 f57284q = new h2();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p1 f57285r = new f2();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p1 f57286s = new g2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f57287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f57288b = "nav_type";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends p1 {
        a() {
            super(false);
        }

        @Override // y3.p1
        public String b() {
            return "reference";
        }

        @Override // y3.p1
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            m(bundle, str, ((Number) obj).intValue());
        }

        @Override // y3.p1
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(key, "key");
            return Integer.valueOf(n4.c.j(n4.c.a(bundle), key));
        }

        @Override // y3.p1
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer l(String value) {
            int i10;
            kotlin.jvm.internal.s.h(value, "value");
            if (bm.r.N(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
                i10 = Integer.parseInt(strSubstring, bm.a.a(16));
            } else {
                i10 = Integer.parseInt(value);
            }
            return Integer.valueOf(i10);
        }

        public void m(Bundle bundle, String key, int i10) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(key, "key");
            n4.k.g(n4.k.a(bundle), key, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public p1 a(String str, String str2) {
            String strSubstring;
            p1 p1VarA = q1.a(str);
            if (p1VarA != null) {
                return p1VarA;
            }
            p1 p1Var = p1.f57272e;
            if (kotlin.jvm.internal.s.c(p1Var.b(), str)) {
                return p1Var;
            }
            if (str == null || str.length() == 0) {
                return p1.f57284q;
            }
            try {
                if (!bm.r.N(str, ".", false, 2, null) || str2 == null) {
                    strSubstring = str;
                } else {
                    strSubstring = str2 + str;
                }
                boolean z10 = bm.r.z(str, "[]", false, 2, null);
                if (z10) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                    kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
                }
                Class<?> cls = Class.forName(strSubstring);
                kotlin.jvm.internal.s.e(cls);
                p1 p1VarD = d(cls, z10);
                if (p1VarD != null) {
                    return p1VarD;
                }
                throw new IllegalArgumentException((strSubstring + " is not Serializable or Parcelable.").toString());
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        public final p1 b(String value) {
            kotlin.jvm.internal.s.h(value, "value");
            return q1.b(value);
        }

        public final p1 c(Object obj) {
            p1 p1VarC = q1.c(obj);
            if (p1VarC != null) {
                return p1VarC;
            }
            if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                p1 p1Var = p1.f57285r;
                kotlin.jvm.internal.s.f(p1Var, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return p1Var;
            }
            kotlin.jvm.internal.s.e(obj);
            if (obj.getClass().isArray()) {
                Class<?> componentType = obj.getClass().getComponentType();
                kotlin.jvm.internal.s.e(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    kotlin.jvm.internal.s.f(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    return new d(componentType2);
                }
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType3 = obj.getClass().getComponentType();
                kotlin.jvm.internal.s.e(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = obj.getClass().getComponentType();
                    kotlin.jvm.internal.s.f(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    return new f(componentType4);
                }
            }
            if (obj instanceof Parcelable) {
                return new e(obj.getClass());
            }
            if (obj instanceof Enum) {
                return new c(obj.getClass());
            }
            if (obj instanceof Serializable) {
                return new g(obj.getClass());
            }
            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
        }

        public final p1 d(Class clazz, boolean z10) {
            kotlin.jvm.internal.s.h(clazz, "clazz");
            if (Parcelable.class.isAssignableFrom(clazz)) {
                return z10 ? new d(clazz) : new e(clazz);
            }
            if (Enum.class.isAssignableFrom(clazz) && !z10) {
                return new c(clazz);
            }
            if (Serializable.class.isAssignableFrom(clazz)) {
                return z10 ? new f(clazz) : new g(clazz);
            }
            return null;
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends g {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final Class f57289u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Class type) {
            super(false, type);
            kotlin.jvm.internal.s.h(type, "type");
            if (type.isEnum()) {
                this.f57289u = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // y3.p1.g, y3.p1
        public String b() {
            String name = this.f57289u.getName();
            kotlin.jvm.internal.s.g(name, "getName(...)");
            return name;
        }

        @Override // y3.p1.g
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Enum l(String value) {
            Object obj;
            kotlin.jvm.internal.s.h(value, "value");
            Object[] enumConstants = this.f57289u.getEnumConstants();
            kotlin.jvm.internal.s.g(enumConstants, "getEnumConstants(...)");
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    obj = null;
                    break;
                }
                obj = enumConstants[i10];
                if (bm.r.A(((Enum) obj).name(), value, true)) {
                    break;
                }
                i10++;
            }
            Enum r10 = (Enum) obj;
            if (r10 != null) {
                return r10;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.f57289u.getName() + '.');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends p1 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Class f57290t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Class type) {
            super(true);
            kotlin.jvm.internal.s.h(type, "type");
            if (!Parcelable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
            }
            try {
                Class<?> cls = Class.forName("[L" + type.getName() + ';');
                kotlin.jvm.internal.s.f(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                this.f57290t = cls;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // y3.p1
        public String b() {
            String name = this.f57290t.getName();
            kotlin.jvm.internal.s.g(name, "getName(...)");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !kotlin.jvm.internal.s.c(d.class, obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.s.c(this.f57290t, ((d) obj).f57290t);
        }

        public int hashCode() {
            return this.f57290t.hashCode();
        }

        @Override // y3.p1
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Parcelable[] a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(key, "key");
            return (Parcelable[]) bundle.get(key);
        }

        @Override // y3.p1
        public Parcelable[] l(String value) {
            kotlin.jvm.internal.s.h(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // y3.p1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, Parcelable[] parcelableArr) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(key, "key");
            this.f57290t.cast(parcelableArr);
            bundle.putParcelableArray(key, parcelableArr);
        }

        @Override // y3.p1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean j(Parcelable[] parcelableArr, Parcelable[] parcelableArr2) {
            return gl.j.d(parcelableArr, parcelableArr2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends p1 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Class f57291t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Class type) {
            super(true);
            kotlin.jvm.internal.s.h(type, "type");
            if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
                this.f57291t = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // y3.p1
        public Object a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(key, "key");
            return bundle.get(key);
        }

        @Override // y3.p1
        public String b() {
            String name = this.f57291t.getName();
            kotlin.jvm.internal.s.g(name, "getName(...)");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !kotlin.jvm.internal.s.c(e.class, obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.s.c(this.f57291t, ((e) obj).f57291t);
        }

        @Override // y3.p1
        /* JADX INFO: renamed from: f */
        public Object l(String value) {
            kotlin.jvm.internal.s.h(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // y3.p1
        public void h(Bundle bundle, String key, Object obj) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(key, "key");
            this.f57291t.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) obj);
            }
        }

        public int hashCode() {
            return this.f57291t.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f extends p1 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Class f57292t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Class type) {
            super(true);
            kotlin.jvm.internal.s.h(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            try {
                Class<?> cls = Class.forName("[L" + type.getName() + ';');
                kotlin.jvm.internal.s.f(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                this.f57292t = cls;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // y3.p1
        public String b() {
            String name = this.f57292t.getName();
            kotlin.jvm.internal.s.g(name, "getName(...)");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !kotlin.jvm.internal.s.c(f.class, obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.s.c(this.f57292t, ((f) obj).f57292t);
        }

        public int hashCode() {
            return this.f57292t.hashCode();
        }

        @Override // y3.p1
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Serializable[] a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(key, "key");
            return (Serializable[]) bundle.get(key);
        }

        @Override // y3.p1
        public Serializable[] l(String value) {
            kotlin.jvm.internal.s.h(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // y3.p1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, Serializable[] serializableArr) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(key, "key");
            this.f57292t.cast(serializableArr);
            bundle.putSerializable(key, serializableArr);
        }

        @Override // y3.p1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean j(Serializable[] serializableArr, Serializable[] serializableArr2) {
            return gl.j.d(serializableArr, serializableArr2);
        }
    }

    public p1(boolean z10) {
        this.f57287a = z10;
    }

    public abstract Object a(Bundle bundle, String str);

    public abstract String b();

    public boolean c() {
        return this.f57287a;
    }

    public final Object d(Bundle bundle, String key, String value) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(value, "value");
        return q1.d(this, bundle, key, value);
    }

    public final Object e(Bundle bundle, String key, String str, Object obj) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        return q1.e(this, bundle, key, str, obj);
    }

    /* JADX INFO: renamed from: f */
    public abstract Object l(String str);

    public Object g(String value, Object obj) {
        kotlin.jvm.internal.s.h(value, "value");
        return l(value);
    }

    public abstract void h(Bundle bundle, String str, Object obj);

    public String i(Object obj) {
        return String.valueOf(obj);
    }

    public boolean j(Object obj, Object obj2) {
        return kotlin.jvm.internal.s.c(obj, obj2);
    }

    public String toString() {
        return b();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class g extends p1 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Class f57293t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Class type) {
            super(true);
            kotlin.jvm.internal.s.h(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            if (!type.isEnum()) {
                this.f57293t = type;
                return;
            }
            throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // y3.p1
        public String b() {
            String name = this.f57293t.getName();
            kotlin.jvm.internal.s.g(name, "getName(...)");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                return kotlin.jvm.internal.s.c(this.f57293t, ((g) obj).f57293t);
            }
            return false;
        }

        public int hashCode() {
            return this.f57293t.hashCode();
        }

        @Override // y3.p1
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Serializable a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(key, "key");
            return (Serializable) bundle.get(key);
        }

        @Override // y3.p1
        public Serializable l(String value) {
            kotlin.jvm.internal.s.h(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // y3.p1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, Serializable value) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(key, "key");
            kotlin.jvm.internal.s.h(value, "value");
            this.f57293t.cast(value);
            bundle.putSerializable(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z10, Class type) {
            super(z10);
            kotlin.jvm.internal.s.h(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.f57293t = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }
}
