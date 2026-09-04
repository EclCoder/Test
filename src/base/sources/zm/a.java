package zm;

import android.util.Log;
import wm.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f59005c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f59006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f59007b;

    /* JADX INFO: renamed from: zm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0904a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C0904a f59008a = new C0904a();

        private C0904a() {
        }

        @Override // zm.a.b
        public boolean a(String str, int i10) {
            return Log.isLoggable(str, i10);
        }

        @Override // zm.a.b
        public void b(int i10, String str, String str2) {
            Log.println(i10, str, str2);
        }

        @Override // zm.a.b
        public String c(Throwable th2) {
            return Log.getStackTraceString(th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        boolean a(String str, int i10);

        void b(int i10, String str, String str2);

        String c(Throwable th2);
    }

    a(b bVar) {
        this.f59006a = (b) d.e(bVar);
        int i10 = 7;
        while (i10 >= 2 && this.f59006a.a("AppAuth", i10)) {
            i10--;
        }
        this.f59007b = i10 + 1;
    }

    public static void a(String str, Object... objArr) {
        d().f(3, null, str, objArr);
    }

    public static void b(Throwable th2, String str, Object... objArr) {
        d().f(3, th2, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        d().f(6, null, str, objArr);
    }

    public static synchronized a d() {
        try {
            if (f59005c == null) {
                f59005c = new a(C0904a.f59008a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f59005c;
    }

    public static void e(String str, Object... objArr) {
        d().f(4, null, str, objArr);
    }

    public static void g(String str, Object... objArr) {
        d().f(5, null, str, objArr);
    }

    public void f(int i10, Throwable th2, String str, Object... objArr) {
        if (this.f59007b > i10) {
            return;
        }
        if (objArr != null && objArr.length >= 1) {
            str = String.format(str, objArr);
        }
        if (th2 != null) {
            str = str + "\n" + this.f59006a.c(th2);
        }
        this.f59006a.b(i10, "AppAuth", str);
    }
}
