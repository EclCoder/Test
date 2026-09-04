package ef;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f37720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f37721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f37722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f37723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f37724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f37725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f37726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f37727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile AtomicBoolean f37728i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f37729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f37730k;

    public static final long a() {
        return f37722c;
    }

    public static final long b() {
        return f37726g;
    }

    public static final boolean c() {
        return f37730k;
    }

    public static final boolean d() {
        return f37723d;
    }

    public static final boolean e() {
        return f37725f;
    }

    public static final boolean f() {
        return f37724e;
    }

    public static final boolean g() {
        return f37720a;
    }

    public static final boolean h() {
        return f37721b;
    }

    public static final boolean i() {
        return f37727h;
    }

    public static final AtomicBoolean j() {
        return f37728i;
    }

    public static final void k(boolean z10) {
        f37723d = z10;
        if (z10) {
            f37722c = SystemClock.elapsedRealtime();
        }
    }

    public static final void l(boolean z10) {
        f37725f = z10;
    }

    public static final void m(boolean z10) {
        f37724e = z10;
    }

    public static final void n(boolean z10) {
        f37721b = z10;
    }

    public static final void o(boolean z10) {
        f37727h = z10;
        if (z10) {
            f37726g = SystemClock.elapsedRealtime();
        }
    }

    public static final void p(boolean z10) {
        f37729j = z10;
    }

    public static final void q(boolean z10) {
        f37730k = z10;
    }
}
