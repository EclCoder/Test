package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f4482b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q1.a.c f4483c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r1.h f4484a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ s1 c(b bVar, t1 t1Var, c cVar, q1.a aVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = r1.d.f50998b;
            }
            if ((i10 & 4) != 0) {
                aVar = q1.a.b.f50288c;
            }
            return bVar.a(t1Var, cVar, aVar);
        }

        public static /* synthetic */ s1 d(b bVar, u1 u1Var, c cVar, q1.a aVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = v1.b(u1Var);
            }
            if ((i10 & 4) != 0) {
                aVar = v1.a(u1Var);
            }
            return bVar.b(u1Var, cVar, aVar);
        }

        public final s1 a(t1 store, c factory, q1.a extras) {
            kotlin.jvm.internal.s.h(store, "store");
            kotlin.jvm.internal.s.h(factory, "factory");
            kotlin.jvm.internal.s.h(extras, "extras");
            return new s1(store, factory, extras);
        }

        public final s1 b(u1 owner, c factory, q1.a extras) {
            kotlin.jvm.internal.s.h(owner, "owner");
            kotlin.jvm.internal.s.h(factory, "factory");
            kotlin.jvm.internal.s.h(extras, "extras");
            return new s1(owner.getViewModelStore(), factory, extras);
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4489a = a.f4490a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f4490a = new a();

            private a() {
            }
        }

        default p1 a(Class modelClass) {
            kotlin.jvm.internal.s.h(modelClass, "modelClass");
            return r1.j.f51008a.d();
        }

        default p1 b(Class modelClass, q1.a extras) {
            kotlin.jvm.internal.s.h(modelClass, "modelClass");
            kotlin.jvm.internal.s.h(extras, "extras");
            return a(modelClass);
        }

        default p1 c(zl.c modelClass, q1.a extras) {
            kotlin.jvm.internal.s.h(modelClass, "modelClass");
            kotlin.jvm.internal.s.h(extras, "extras");
            return b(sl.a.a(modelClass), extras);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class d implements c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static d f4492c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f4491b = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final q1.a.c f4493d = s1.f4483c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a() {
                if (d.f4492c == null) {
                    d.f4492c = new d();
                }
                d dVar = d.f4492c;
                kotlin.jvm.internal.s.e(dVar);
                return dVar;
            }

            private a() {
            }
        }

        @Override // androidx.lifecycle.s1.c
        public p1 a(Class modelClass) {
            kotlin.jvm.internal.s.h(modelClass, "modelClass");
            return r1.e.f50999a.a(modelClass);
        }

        @Override // androidx.lifecycle.s1.c
        public p1 b(Class modelClass, q1.a extras) {
            kotlin.jvm.internal.s.h(modelClass, "modelClass");
            kotlin.jvm.internal.s.h(extras, "extras");
            return a(modelClass);
        }

        @Override // androidx.lifecycle.s1.c
        public p1 c(zl.c modelClass, q1.a extras) {
            kotlin.jvm.internal.s.h(modelClass, "modelClass");
            kotlin.jvm.internal.s.h(extras, "extras");
            return b(sl.a.a(modelClass), extras);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class e {
        public abstract void d(p1 p1Var);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f implements q1.a.c {
        public String toString() {
            String string = Integer.toString(hashCode(), bm.a.a(16));
            kotlin.jvm.internal.s.g(string, "toString(...)");
            return "CreationExtras.Key@" + string + "<" + kotlin.jvm.internal.l0.b(String.class).k() + ">";
        }
    }

    static {
        q1.a.C0771a c0771a = q1.a.f50286b;
        f4483c = new f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s1(t1 store, c factory) {
        this(store, factory, null, 4, null);
        kotlin.jvm.internal.s.h(store, "store");
        kotlin.jvm.internal.s.h(factory, "factory");
    }

    public p1 a(Class modelClass) {
        kotlin.jvm.internal.s.h(modelClass, "modelClass");
        return c(sl.a.c(modelClass));
    }

    public final p1 b(String key, zl.c modelClass) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(modelClass, "modelClass");
        return this.f4484a.d(modelClass, key);
    }

    public final p1 c(zl.c modelClass) {
        kotlin.jvm.internal.s.h(modelClass, "modelClass");
        return r1.h.e(this.f4484a, modelClass, null, 2, null);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C0044a f4485f = new C0044a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static a f4486g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final q1.a.c f4487h;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Application f4488e;

        /* JADX INFO: renamed from: androidx.lifecycle.s1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0044a {
            public /* synthetic */ C0044a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Application application) {
                kotlin.jvm.internal.s.h(application, "application");
                if (a.f4486g == null) {
                    a.f4486g = new a(application);
                }
                a aVar = a.f4486g;
                kotlin.jvm.internal.s.e(aVar);
                return aVar;
            }

            private C0044a() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class b implements q1.a.c {
            public String toString() {
                String string = Integer.toString(hashCode(), bm.a.a(16));
                kotlin.jvm.internal.s.g(string, "toString(...)");
                return "CreationExtras.Key@" + string + "<" + kotlin.jvm.internal.l0.b(Application.class).k() + ">";
            }
        }

        static {
            q1.a.C0771a c0771a = q1.a.f50286b;
            f4487h = new b();
        }

        private a(Application application, int i10) {
            this.f4488e = application;
        }

        private final p1 h(Class cls, Application application) {
            if (!androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                p1 p1Var = (p1) cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.s.e(p1Var);
                return p1Var;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        @Override // androidx.lifecycle.s1.d, androidx.lifecycle.s1.c
        public p1 a(Class modelClass) {
            kotlin.jvm.internal.s.h(modelClass, "modelClass");
            Application application = this.f4488e;
            if (application != null) {
                return h(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.s1.d, androidx.lifecycle.s1.c
        public p1 b(Class modelClass, q1.a extras) {
            kotlin.jvm.internal.s.h(modelClass, "modelClass");
            kotlin.jvm.internal.s.h(extras, "extras");
            if (this.f4488e != null) {
                return a(modelClass);
            }
            Application application = (Application) extras.a(f4487h);
            if (application != null) {
                return h(modelClass, application);
            }
            if (androidx.lifecycle.a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(modelClass);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            kotlin.jvm.internal.s.h(application, "application");
        }
    }

    private s1(r1.h hVar) {
        this.f4484a = hVar;
    }

    public /* synthetic */ s1(t1 t1Var, c cVar, q1.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(t1Var, cVar, (i10 & 4) != 0 ? q1.a.b.f50288c : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s1(t1 store, c factory, q1.a defaultCreationExtras) {
        this(new r1.h(store, factory, defaultCreationExtras));
        kotlin.jvm.internal.s.h(store, "store");
        kotlin.jvm.internal.s.h(factory, "factory");
        kotlin.jvm.internal.s.h(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s1(u1 owner) {
        this(owner.getViewModelStore(), v1.b(owner), v1.a(owner));
        kotlin.jvm.internal.s.h(owner, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s1(u1 owner, c factory) {
        this(owner.getViewModelStore(), factory, v1.a(owner));
        kotlin.jvm.internal.s.h(owner, "owner");
        kotlin.jvm.internal.s.h(factory, "factory");
    }
}
