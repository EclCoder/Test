package w1;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f55817b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f55818c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f55816a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f55819d = a.f55820a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f55820a = new C0849a();

        /* JADX INFO: renamed from: w1.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0849a implements a {
            C0849a() {
            }

            @Override // w1.n.a
            public void a(String str, String str2, Throwable th2) {
                Log.d(str, n.a(str2, th2));
            }

            @Override // w1.n.a
            public void b(String str, String str2, Throwable th2) {
                Log.i(str, n.a(str2, th2));
            }

            @Override // w1.n.a
            public void e(String str, String str2, Throwable th2) {
                Log.e(str, n.a(str2, th2));
            }

            @Override // w1.n.a
            public void w(String str, String str2, Throwable th2) {
                Log.w(str, n.a(str2, th2));
            }
        }

        void a(String str, String str2, Throwable th2);

        void b(String str, String str2, Throwable th2);

        void e(String str, String str2, Throwable th2);

        void w(String str, String str2, Throwable th2);
    }

    public static String a(String str, Throwable th2) {
        String strE = e(th2);
        if (TextUtils.isEmpty(strE)) {
            return str;
        }
        return str + "\n  " + strE.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f55816a) {
            try {
                if (f55817b == 0) {
                    f55819d.a(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f55816a) {
            try {
                if (f55817b <= 3) {
                    f55819d.e(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        synchronized (f55816a) {
            try {
                if (f55817b <= 3) {
                    f55819d.e(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static String e(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        synchronized (f55816a) {
            try {
                if (g(th2)) {
                    return "UnknownHostException (no network)";
                }
                if (f55818c) {
                    return Log.getStackTraceString(th2).trim().replace("\t", "    ");
                }
                return th2.getMessage();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void f(String str, String str2) {
        synchronized (f55816a) {
            try {
                if (f55817b <= 1) {
                    f55819d.b(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean g(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
        synchronized (f55816a) {
            try {
                if (f55817b <= 2) {
                    f55819d.w(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void i(String str, String str2, Throwable th2) {
        synchronized (f55816a) {
            try {
                if (f55817b <= 2) {
                    f55819d.w(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
