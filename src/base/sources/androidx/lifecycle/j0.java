package androidx.lifecycle;

import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f4399a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f4400b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f4401c = new HashMap();

    private j0() {
    }

    private final p a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            kotlin.jvm.internal.s.e(objNewInstance);
            android.support.v4.media.session.b.a(objNewInstance);
            return null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static final String c(String className) {
        kotlin.jvm.internal.s.h(className, "className");
        return bm.r.I(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class cls) {
        Map map = f4400b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(Class cls) {
        return cls != null && a0.class.isAssignableFrom(cls);
    }

    public static final y f(Object object) {
        kotlin.jvm.internal.s.h(object, "object");
        boolean z10 = object instanceof y;
        boolean z11 = object instanceof j;
        if (z10 && z11) {
            return new k((j) object, (y) object);
        }
        if (z11) {
            return new k((j) object, null);
        }
        if (z10) {
            return (y) object;
        }
        Class<?> cls = object.getClass();
        j0 j0Var = f4399a;
        if (j0Var.d(cls) != 2) {
            return new w0(object);
        }
        Object obj = f4401c.get(cls);
        kotlin.jvm.internal.s.e(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            j0Var.a((Constructor) list.get(0), object);
            return new k1(null);
        }
        int size = list.size();
        p[] pVarArr = new p[size];
        for (int i10 = 0; i10 < size; i10++) {
            f4399a.a((Constructor) list.get(i10), object);
            pVarArr[i10] = null;
        }
        return new f(pVarArr);
    }

    private final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorB = b(cls);
        if (constructorB != null) {
            f4401c.put(cls, gl.r.e(constructorB));
            return 2;
        }
        if (e.f4358c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            kotlin.jvm.internal.s.e(superclass);
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = f4401c.get(superclass);
            kotlin.jvm.internal.s.e(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.s.g(interfaces, "getInterfaces(...)");
        for (Class<?> cls2 : interfaces) {
            if (e(cls2)) {
                kotlin.jvm.internal.s.e(cls2);
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f4401c.get(cls2);
                kotlin.jvm.internal.s.e(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f4401c.put(cls, arrayList);
        return 2;
    }

    private final Constructor b(Class cls) {
        String name;
        try {
            Package r10 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (r10 != null) {
                name = r10.getName();
            } else {
                name = "";
            }
            kotlin.jvm.internal.s.e(name);
            if (name.length() != 0) {
                kotlin.jvm.internal.s.e(canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                kotlin.jvm.internal.s.g(canonicalName, "substring(...)");
            }
            kotlin.jvm.internal.s.e(canonicalName);
            String strC = c(canonicalName);
            if (name.length() != 0) {
                strC = name + mTFeqtajA.NRx + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            kotlin.jvm.internal.s.f(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }
}
