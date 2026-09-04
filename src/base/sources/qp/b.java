package qp;

import java.util.Hashtable;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static Hashtable f50937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Object[] f50938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static /* synthetic */ Class f50939g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Class f50940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ClassLoader f50941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f50942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f50943d = 0;

    static {
        Hashtable hashtable = new Hashtable();
        f50937e = hashtable;
        hashtable.put("void", Void.TYPE);
        f50937e.put("boolean", Boolean.TYPE);
        f50937e.put("byte", Byte.TYPE);
        f50937e.put("char", Character.TYPE);
        f50937e.put("short", Short.TYPE);
        f50937e.put("int", Integer.TYPE);
        f50937e.put("long", Long.TYPE);
        f50937e.put("float", Float.TYPE);
        f50937e.put("double", Double.TYPE);
        f50938f = new Object[0];
    }

    public b(String str, Class cls) {
        this.f50942c = str;
        this.f50940a = cls;
        this.f50941b = cls.getClassLoader();
    }

    static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError(e10.getMessage());
        }
    }

    static Class b(String str, ClassLoader classLoader) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) f50937e.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return classLoader == null ? Class.forName(str) : Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            Class cls2 = f50939g;
            if (cls2 != null) {
                return cls2;
            }
            Class clsA = a("java.lang.ClassNotFoundException");
            f50939g = clsA;
            return clsA;
        }
    }

    public static np.a c(np.a.InterfaceC0736a interfaceC0736a, Object obj, Object obj2) {
        return new c(interfaceC0736a, obj, obj2, f50938f);
    }

    public static np.a d(np.a.InterfaceC0736a interfaceC0736a, Object obj, Object obj2, Object obj3) {
        return new c(interfaceC0736a, obj, obj2, new Object[]{obj3});
    }

    public static np.a e(np.a.InterfaceC0736a interfaceC0736a, Object obj, Object obj2, Object obj3, Object obj4) {
        return new c(interfaceC0736a, obj, obj2, new Object[]{obj3, obj4});
    }

    public static np.a f(np.a.InterfaceC0736a interfaceC0736a, Object obj, Object obj2, Object[] objArr) {
        return new c(interfaceC0736a, obj, obj2, objArr);
    }

    public op.a g(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = Integer.parseInt(str, 16);
        Class clsB = b(str3, this.f50941b);
        StringTokenizer stringTokenizer = new StringTokenizer(str4, ":");
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i11 = 0; i11 < iCountTokens; i11++) {
            clsArr[i11] = b(stringTokenizer.nextToken(), this.f50941b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str5, ":");
        int iCountTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[iCountTokens2];
        for (int i12 = 0; i12 < iCountTokens2; i12++) {
            strArr[i12] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str6, ":");
        int iCountTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[iCountTokens3];
        for (int i13 = 0; i13 < iCountTokens3; i13++) {
            clsArr2[i13] = b(stringTokenizer3.nextToken(), this.f50941b);
        }
        return new e(i10, str2, clsB, clsArr, strArr, clsArr2, b(str7, this.f50941b));
    }

    public np.a.InterfaceC0736a h(String str, np.b bVar, int i10) {
        int i11 = this.f50943d;
        this.f50943d = i11 + 1;
        return new c.a(i11, str, bVar, i(i10, -1));
    }

    public op.b i(int i10, int i11) {
        return new g(this.f50940a, this.f50942c, i10);
    }
}
