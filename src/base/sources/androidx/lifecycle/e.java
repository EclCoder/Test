package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static e f4358c = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f4359a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f4360b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f4361a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f4362b;

        a(Map map) {
            this.f4362b = map;
            for (Map.Entry entry : map.entrySet()) {
                s.a aVar = (s.a) entry.getValue();
                List arrayList = (List) this.f4361a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f4361a.put(aVar, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        private static void b(List list, b0 b0Var, s.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).a(b0Var, aVar, obj);
                }
            }
        }

        void a(b0 b0Var, s.a aVar, Object obj) {
            b((List) this.f4361a.get(aVar), b0Var, aVar, obj);
            b((List) this.f4361a.get(s.a.ON_ANY), b0Var, aVar, obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f4363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Method f4364b;

        b(int i10, Method method) {
            this.f4363a = i10;
            this.f4364b = method;
            method.setAccessible(true);
        }

        void a(b0 b0Var, s.a aVar, Object obj) {
            try {
                int i10 = this.f4363a;
                if (i10 == 0) {
                    this.f4364b.invoke(obj, null);
                } else if (i10 == 1) {
                    this.f4364b.invoke(obj, b0Var);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f4364b.invoke(obj, b0Var, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4363a == bVar.f4363a && this.f4364b.getName().equals(bVar.f4364b.getName());
        }

        public int hashCode() {
            return (this.f4363a * 31) + this.f4364b.getName().hashCode();
        }
    }

    e() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i10;
        a aVarC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f4362b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f4362b.entrySet()) {
                e(map, (b) entry.getKey(), (s.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            r0 r0Var = (r0) method.getAnnotation(r0.class);
            if (r0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!b0.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                s.a aVarValue = r0Var.value();
                if (parameterTypes.length > 1) {
                    if (!s.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != s.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i10, method), aVarValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        this.f4359a.put(cls, aVar);
        this.f4360b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map map, b bVar, s.a aVar, Class cls) {
        s.a aVar2 = (s.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f4364b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + String.valueOf(aVar2) + ", new value " + String.valueOf(aVar));
    }

    a c(Class cls) {
        a aVar = (a) this.f4359a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = (Boolean) this.f4360b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((r0) method.getAnnotation(r0.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f4360b.put(cls, Boolean.FALSE);
        return false;
    }
}
