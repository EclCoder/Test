package tm;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z1 {
    private static final Object a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final pm.d b(zl.c cVar) {
        kotlin.jvm.internal.s.h(cVar, "<this>");
        return d(cVar, new pm.d[0]);
    }

    public static final pm.d c(Class cls, pm.d... args) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.s.h(cls, "<this>");
        kotlin.jvm.internal.s.h(args, "args");
        if (cls.isEnum() && m(cls)) {
            return e(cls);
        }
        pm.d dVarK = k(cls, (pm.d[]) Arrays.copyOf(args, args.length));
        if (dVarK != null) {
            return dVarK;
        }
        pm.d dVarH = h(cls);
        if (dVarH != null) {
            return dVarH;
        }
        pm.d dVarF = f(cls, (pm.d[]) Arrays.copyOf(args, args.length));
        if (dVarF != null) {
            return dVarF;
        }
        if (n(cls)) {
            return new pm.h(sl.a.c(cls));
        }
        return null;
    }

    public static final pm.d d(zl.c cVar, pm.d... args) {
        kotlin.jvm.internal.s.h(cVar, "<this>");
        kotlin.jvm.internal.s.h(args, "args");
        return c(sl.a.a(cVar), (pm.d[]) Arrays.copyOf(args, args.length));
    }

    private static final pm.d e(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        kotlin.jvm.internal.s.g(canonicalName, "getCanonicalName(...)");
        kotlin.jvm.internal.s.f(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new h0(canonicalName, (Enum[]) enumConstants);
    }

    private static final pm.d f(Class cls, pm.d... dVarArr) {
        Field field;
        pm.d dVarJ;
        Object objG = g(cls);
        if (objG != null && (dVarJ = j(objG, (pm.d[]) Arrays.copyOf(dVarArr, dVarArr.length))) != null) {
            return dVarJ;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            kotlin.jvm.internal.s.g(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i10 = 0;
            Class<?> cls2 = null;
            boolean z10 = false;
            while (true) {
                if (i10 >= length) {
                    if (z10) {
                        break;
                    }
                } else {
                    Class<?> cls3 = declaredClasses[i10];
                    if (kotlin.jvm.internal.s.c(cls3.getSimpleName(), "$serializer")) {
                        if (!z10) {
                            z10 = true;
                            cls2 = cls3;
                        }
                    }
                    i10++;
                }
                cls2 = null;
                break;
            }
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof pm.d) {
                return (pm.d) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    private static final Object g(Class cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        kotlin.jvm.internal.s.g(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i10];
            if (cls2.getAnnotation(l1.class) != null) {
                break;
            }
            i10++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        kotlin.jvm.internal.s.g(simpleName, "getSimpleName(...)");
        return a(cls, simpleName);
    }

    private static final pm.d h(Class cls) throws IllegalAccessException, InvocationTargetException {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            int i10 = 0;
            if (!bm.r.N(canonicalName, "java.", false, 2, null) && !bm.r.N(canonicalName, "kotlin.", false, 2, null)) {
                Field[] declaredFields = cls.getDeclaredFields();
                kotlin.jvm.internal.s.g(declaredFields, "getDeclaredFields(...)");
                int length = declaredFields.length;
                Field field = null;
                int i11 = 0;
                boolean z10 = false;
                while (true) {
                    if (i11 >= length) {
                        if (!z10) {
                            break;
                        }
                        break;
                    }
                    Field field2 = declaredFields[i11];
                    if (kotlin.jvm.internal.s.c(field2.getName(), "INSTANCE") && kotlin.jvm.internal.s.c(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                        if (!z10) {
                            z10 = true;
                            field = field2;
                        }
                    }
                    i11++;
                    field = null;
                    break;
                }
                if (field == null) {
                    return null;
                }
                Object obj = field.get(null);
                Method[] methods = cls.getMethods();
                kotlin.jvm.internal.s.g(methods, "getMethods(...)");
                int length2 = methods.length;
                Method method = null;
                boolean z11 = false;
                while (true) {
                    if (i10 >= length2) {
                        if (!z11) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i10];
                    if (kotlin.jvm.internal.s.c(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        kotlin.jvm.internal.s.g(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && kotlin.jvm.internal.s.c(method2.getReturnType(), pm.d.class)) {
                            if (!z11) {
                                method = method2;
                                z11 = true;
                            }
                        }
                    }
                    i10++;
                    method = null;
                    break;
                }
                if (method == null) {
                    return null;
                }
                Object objInvoke = method.invoke(obj, null);
                if (objInvoke instanceof pm.d) {
                    return (pm.d) objInvoke;
                }
            }
        }
        return null;
    }

    public static final Map i() {
        Map mapC = gl.l0.c();
        mapC.put(kotlin.jvm.internal.l0.b(String.class), qm.a.J(kotlin.jvm.internal.o0.f43602a));
        mapC.put(kotlin.jvm.internal.l0.b(Character.TYPE), qm.a.D(kotlin.jvm.internal.g.f43587a));
        mapC.put(kotlin.jvm.internal.l0.b(char[].class), qm.a.d());
        mapC.put(kotlin.jvm.internal.l0.b(Double.TYPE), qm.a.E(kotlin.jvm.internal.k.f43596a));
        mapC.put(kotlin.jvm.internal.l0.b(double[].class), qm.a.e());
        mapC.put(kotlin.jvm.internal.l0.b(Float.TYPE), qm.a.F(kotlin.jvm.internal.l.f43598a));
        mapC.put(kotlin.jvm.internal.l0.b(float[].class), qm.a.f());
        mapC.put(kotlin.jvm.internal.l0.b(Long.TYPE), qm.a.H(kotlin.jvm.internal.u.f43611a));
        mapC.put(kotlin.jvm.internal.l0.b(long[].class), qm.a.i());
        mapC.put(kotlin.jvm.internal.l0.b(fl.b0.class), qm.a.y(fl.b0.f38735b));
        mapC.put(kotlin.jvm.internal.l0.b(Integer.TYPE), qm.a.G(kotlin.jvm.internal.r.f43604a));
        mapC.put(kotlin.jvm.internal.l0.b(int[].class), qm.a.g());
        mapC.put(kotlin.jvm.internal.l0.b(fl.z.class), qm.a.x(fl.z.f38788b));
        mapC.put(kotlin.jvm.internal.l0.b(Short.TYPE), qm.a.I(kotlin.jvm.internal.n0.f43601a));
        mapC.put(kotlin.jvm.internal.l0.b(short[].class), qm.a.n());
        mapC.put(kotlin.jvm.internal.l0.b(fl.e0.class), qm.a.z(fl.e0.f38745b));
        mapC.put(kotlin.jvm.internal.l0.b(Byte.TYPE), qm.a.C(kotlin.jvm.internal.e.f43584a));
        mapC.put(kotlin.jvm.internal.l0.b(byte[].class), qm.a.c());
        mapC.put(kotlin.jvm.internal.l0.b(fl.x.class), qm.a.w(fl.x.f38783b));
        mapC.put(kotlin.jvm.internal.l0.b(Boolean.TYPE), qm.a.B(kotlin.jvm.internal.d.f43583a));
        mapC.put(kotlin.jvm.internal.l0.b(boolean[].class), qm.a.b());
        mapC.put(kotlin.jvm.internal.l0.b(fl.g0.class), qm.a.A(fl.g0.f38750a));
        mapC.put(kotlin.jvm.internal.l0.b(Void.class), qm.a.l());
        try {
            mapC.put(kotlin.jvm.internal.l0.b(cm.a.class), qm.a.u(cm.a.f10121b));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapC.put(kotlin.jvm.internal.l0.b(fl.c0.class), qm.a.r());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapC.put(kotlin.jvm.internal.l0.b(fl.a0.class), qm.a.q());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapC.put(kotlin.jvm.internal.l0.b(fl.f0.class), qm.a.s());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapC.put(kotlin.jvm.internal.l0.b(fl.y.class), qm.a.p());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapC.put(kotlin.jvm.internal.l0.b(dm.a.class), qm.a.v(dm.a.f36989c));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return gl.l0.b(mapC);
    }

    private static final pm.d j(Object obj, pm.d... dVarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (dVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = dVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = pm.d.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(dVarArr, dVarArr.length));
            if (objInvoke instanceof pm.d) {
                return (pm.d) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final pm.d k(Class cls, pm.d... dVarArr) {
        Object objA = a(cls, "Companion");
        if (objA == null) {
            return null;
        }
        return j(objA, (pm.d[]) Arrays.copyOf(dVarArr, dVarArr.length));
    }

    public static final boolean l(zl.c cVar) {
        kotlin.jvm.internal.s.h(cVar, "<this>");
        return sl.a.a(cVar).isInterface();
    }

    private static final boolean m(Class cls) {
        return cls.getAnnotation(pm.k.class) == null && cls.getAnnotation(pm.e.class) == null;
    }

    private static final boolean n(Class cls) {
        if (cls.getAnnotation(pm.e.class) != null) {
            return true;
        }
        pm.k kVar = (pm.k) cls.getAnnotation(pm.k.class);
        return kVar != null && kotlin.jvm.internal.s.c(kotlin.jvm.internal.l0.b(kVar.with()), kotlin.jvm.internal.l0.b(pm.h.class));
    }

    public static final boolean o(zl.c rootClass) {
        kotlin.jvm.internal.s.h(rootClass, "rootClass");
        return sl.a.a(rootClass).isArray();
    }

    public static final Void p(zl.c cVar) {
        kotlin.jvm.internal.s.h(cVar, "<this>");
        a2.f(cVar);
        throw new KotlinNothingValueException();
    }

    public static final Object[] q(ArrayList arrayList, zl.c eClass) {
        kotlin.jvm.internal.s.h(arrayList, "<this>");
        kotlin.jvm.internal.s.h(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) sl.a.a(eClass), arrayList.size());
        kotlin.jvm.internal.s.f(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        kotlin.jvm.internal.s.g(array, "toArray(...)");
        return array;
    }
}
