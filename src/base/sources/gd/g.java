package gd;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final g f39123c = new g("FirebaseCrashlytics");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39125b = 4;

    public g(String str) {
        this.f39124a = str;
    }

    private boolean a(int i10) {
        return this.f39125b <= i10 || Log.isLoggable(this.f39124a, i10);
    }

    public static g f() {
        return f39123c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th2) {
        if (a(3)) {
            Log.d(this.f39124a, str, th2);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th2) {
        if (a(6)) {
            Log.e(this.f39124a, str, th2);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th2) {
        if (a(4)) {
            Log.i(this.f39124a, str, th2);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th2) {
        if (a(2)) {
            Log.v(this.f39124a, str, th2);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th2) {
        if (a(5)) {
            Log.w(this.f39124a, str, th2);
        }
    }
}
