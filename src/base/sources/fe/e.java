package fe;

import com.google.firebase.installations.h;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f38490d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f38491e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f38492a = h.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f38493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38494c;

    e() {
    }

    private synchronized long a(int i10) {
        if (c(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f38494c) + this.f38492a.e(), f38491e);
        }
        return f38490d;
    }

    private static boolean c(int i10) {
        if (i10 != 429) {
            return i10 >= 500 && i10 < 600;
        }
        return true;
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void e() {
        this.f38494c = 0;
    }

    public synchronized boolean b() {
        return this.f38494c == 0 || this.f38492a.a() > this.f38493b;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f38494c++;
        this.f38493b = this.f38492a.a() + a(i10);
    }
}
