package com.squareup.moshi;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
abstract class b {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f35441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f35442b;

        a(Constructor constructor, Class cls) {
            this.f35441a = constructor;
            this.f35442b = cls;
        }

        @Override // com.squareup.moshi.b
        public Object b() {
            return this.f35441a.newInstance(null);
        }

        public String toString() {
            return this.f35442b.getName();
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0487b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f35443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f35444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f35445c;

        C0487b(Method method, Object obj, Class cls) {
            this.f35443a = method;
            this.f35444b = obj;
            this.f35445c = cls;
        }

        @Override // com.squareup.moshi.b
        public Object b() {
            return this.f35443a.invoke(this.f35444b, this.f35445c);
        }

        public String toString() {
            return this.f35445c.getName();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f35446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f35447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35448c;

        c(Method method, Class cls, int i10) {
            this.f35446a = method;
            this.f35447b = cls;
            this.f35448c = i10;
        }

        @Override // com.squareup.moshi.b
        public Object b() {
            return this.f35446a.invoke(null, this.f35447b, Integer.valueOf(this.f35448c));
        }

        public String toString() {
            return this.f35447b.getName();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f35449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f35450b;

        d(Method method, Class cls) {
            this.f35449a = method;
            this.f35450b = cls;
        }

        @Override // com.squareup.moshi.b
        public Object b() {
            return this.f35449a.invoke(null, this.f35450b, Object.class);
        }

        public String toString() {
            return this.f35450b.getName();
        }
    }

    b() {
    }

    public static b a(Class cls) {
        try {
            try {
                try {
                    try {
                        Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        return new a(declaredConstructor, cls);
                    } catch (Exception unused) {
                        throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                    }
                } catch (NoSuchMethodException unused2) {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new C0487b(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new c(declaredMethod2, cls, iIntValue);
            } catch (IllegalAccessException unused4) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused5) {
            throw new AssertionError();
        } catch (NoSuchMethodException unused6) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            return new d(declaredMethod3, cls);
        } catch (InvocationTargetException e10) {
            throw vj.c.s(e10);
        }
    }

    abstract Object b();
}
