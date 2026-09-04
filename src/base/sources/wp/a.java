package wp;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b[] f56384a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static volatile b[] f56386c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f56385b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b f56387d = new C0863a();

    /* JADX INFO: renamed from: wp.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class C0863a extends b {
        C0863a() {
        }

        @Override // wp.a.b
        public void a(String str, Object... objArr) {
            for (b bVar : a.f56386c) {
                bVar.a(str, objArr);
            }
        }

        @Override // wp.a.b
        public void b(Throwable th2) {
            for (b bVar : a.f56386c) {
                bVar.b(th2);
            }
        }

        @Override // wp.a.b
        public void c(Throwable th2, String str, Object... objArr) {
            for (b bVar : a.f56386c) {
                bVar.c(th2, str, objArr);
            }
        }

        @Override // wp.a.b
        public void d(String str, Object... objArr) {
            for (b bVar : a.f56386c) {
                bVar.d(str, objArr);
            }
        }

        @Override // wp.a.b
        public void e(Throwable th2) {
            for (b bVar : a.f56386c) {
                bVar.e(th2);
            }
        }

        @Override // wp.a.b
        public void f(Throwable th2, String str, Object... objArr) {
            for (b bVar : a.f56386c) {
                bVar.f(th2, str, objArr);
            }
        }

        @Override // wp.a.b
        public void g(String str, Object... objArr) {
            for (b bVar : a.f56386c) {
                bVar.g(str, objArr);
            }
        }

        @Override // wp.a.b
        public void h(String str, Object... objArr) {
            for (b bVar : a.f56386c) {
                bVar.h(str, objArr);
            }
        }

        @Override // wp.a.b
        public void i(String str, Object... objArr) {
            for (b bVar : a.f56386c) {
                bVar.i(str, objArr);
            }
        }

        @Override // wp.a.b
        public void j(Throwable th2, String str, Object... objArr) {
            for (b bVar : a.f56386c) {
                bVar.j(th2, str, objArr);
            }
        }

        @Override // wp.a.b
        public void k(String str, Object... objArr) {
            for (b bVar : a.f56386c) {
                bVar.k(str, objArr);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ThreadLocal f56388a = new ThreadLocal();

        public abstract void a(String str, Object... objArr);

        public abstract void b(Throwable th2);

        public abstract void c(Throwable th2, String str, Object... objArr);

        public abstract void d(String str, Object... objArr);

        public abstract void e(Throwable th2);

        public abstract void f(Throwable th2, String str, Object... objArr);

        public abstract void g(String str, Object... objArr);

        public abstract void h(String str, Object... objArr);

        public abstract void i(String str, Object... objArr);

        public abstract void j(Throwable th2, String str, Object... objArr);

        public abstract void k(String str, Object... objArr);
    }

    static {
        b[] bVarArr = new b[0];
        f56384a = bVarArr;
        f56386c = bVarArr;
    }

    public static void a(String str, Object... objArr) {
        f56387d.a(str, objArr);
    }

    public static void b(Throwable th2) {
        f56387d.b(th2);
    }

    public static void c(Throwable th2, String str, Object... objArr) {
        f56387d.c(th2, str, objArr);
    }

    public static void d(String str, Object... objArr) {
        f56387d.d(str, objArr);
    }

    public static void e(Throwable th2) {
        f56387d.e(th2);
    }

    public static void f(Throwable th2, String str, Object... objArr) {
        f56387d.f(th2, str, objArr);
    }

    public static void g(String str, Object... objArr) {
        f56387d.g(str, objArr);
    }

    public static b h(String str) {
        for (b bVar : f56386c) {
            bVar.f56388a.set(str);
        }
        return f56387d;
    }

    public static void i(String str, Object... objArr) {
        f56387d.i(str, objArr);
    }

    public static void j(Throwable th2, String str, Object... objArr) {
        f56387d.j(th2, str, objArr);
    }
}
