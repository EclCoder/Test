package ob;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f48457b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f48458c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f48456a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f48459d = a.f48460a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48460a = new C0746a();

        /* JADX INFO: renamed from: ob.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0746a implements a {
            C0746a() {
            }

            @Override // ob.u.a
            public void a(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // ob.u.a
            public void b(String str, String str2) {
                Log.d(str, str2);
            }

            @Override // ob.u.a
            public void c(String str, String str2) {
                Log.i(str, str2);
            }

            @Override // ob.u.a
            public void w(String str, String str2) {
                Log.w(str, str2);
            }
        }

        void a(String str, String str2);

        void b(String str, String str2);

        void c(String str, String str2);

        void w(String str, String str2);
    }

    private static String a(String str, Throwable th2) {
        String strE = e(th2);
        if (TextUtils.isEmpty(strE)) {
            return str;
        }
        return str + "\n  " + strE.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f48456a) {
            try {
                if (f48457b == 0) {
                    f48459d.b(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f48456a) {
            try {
                if (f48457b <= 3) {
                    f48459d.a(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        c(str, a(str2, th2));
    }

    public static String e(Throwable th2) {
        synchronized (f48456a) {
            try {
                if (th2 == null) {
                    return null;
                }
                if (h(th2)) {
                    return "UnknownHostException (no network)";
                }
                if (f48458c) {
                    return Log.getStackTraceString(th2).trim().replace("\t", "    ");
                }
                return th2.getMessage();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void f(String str, String str2) {
        synchronized (f48456a) {
            try {
                if (f48457b <= 1) {
                    f48459d.c(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void g(String str, String str2, Throwable th2) {
        f(str, a(str2, th2));
    }

    private static boolean h(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void i(String str, String str2) {
        synchronized (f48456a) {
            try {
                if (f48457b <= 2) {
                    f48459d.w(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void j(String str, String str2, Throwable th2) {
        i(str, a(str2, th2));
    }
}
