package x7;

import android.os.Handler;
import android.os.Looper;
import com.facebook.h0;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.s;
import u7.b;
import u7.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f56750a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f56751b = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f56752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f56753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f56754e;

    /* JADX INFO: renamed from: x7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class RunnableC0871a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f56755a;

        RunnableC0871a(Throwable th2) {
            this.f56755a = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.c(this)) {
                return;
            }
            try {
                throw new RuntimeException(this.f56755a);
            } catch (Throwable th2) {
                a.b(th2, this);
            }
        }
    }

    private a() {
    }

    public static final void a() {
        f56752c = true;
    }

    public static final void b(Throwable th2, Object o10) {
        s.h(o10, "o");
        if (f56752c) {
            f56751b.add(o10);
            if (h0.q()) {
                b.c(th2);
                c.a.b(th2, c.EnumC0815c.CrashShield).g();
            }
            d(th2);
        }
    }

    public static final boolean c(Object o10) {
        s.h(o10, "o");
        return f56751b.contains(o10);
    }

    public static final void d(Throwable th2) {
        if (!f56754e || f56753d) {
            return;
        }
        f56753d = true;
        new Handler(Looper.getMainLooper()).post(new RunnableC0871a(th2));
    }
}
