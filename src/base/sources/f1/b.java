package f1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.u;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ThreadLocal f38163j = new ThreadLocal();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f38168e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f38172i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f38164a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f38165b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0568b f38166c = new C0568b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f38167d = new Runnable() { // from class: f1.a
        @Override // java.lang.Runnable
        public final void run() {
            this.f38162a.f38166c.a();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f38169f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f38170g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f38171h = 1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0568b {
        private C0568b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            b.this.f38169f = SystemClock.uptimeMillis();
            b bVar = b.this;
            bVar.f(bVar.f38169f);
            if (b.this.f38165b.size() > 0) {
                b.this.f38168e.a(b.this.f38167d);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface c {
        boolean a(long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ValueAnimator.DurationScaleChangeListener f38174a;

        public d() {
        }

        @Override // f1.b.e
        public boolean a() {
            boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.f38174a);
            this.f38174a = null;
            return zUnregisterDurationScaleChangeListener;
        }

        @Override // f1.b.e
        public boolean b() {
            if (this.f38174a != null) {
                return true;
            }
            ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() { // from class: f1.c
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f10) {
                    b.this.f38171h = f10;
                }
            };
            this.f38174a = durationScaleChangeListener;
            return ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {
        boolean a();

        boolean b();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Choreographer f38176a = Choreographer.getInstance();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Looper f38177b = Looper.myLooper();

        f() {
        }

        @Override // f1.g
        public void a(final Runnable runnable) {
            this.f38176a.postFrameCallback(new Choreographer.FrameCallback() { // from class: f1.d
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j10) {
                    runnable.run();
                }
            });
        }

        @Override // f1.g
        public boolean b() {
            return Thread.currentThread() == this.f38177b.getThread();
        }
    }

    public b(g gVar) {
        this.f38168e = gVar;
    }

    private void e() {
        if (this.f38170g) {
            for (int size = this.f38165b.size() - 1; size >= 0; size--) {
                if (this.f38165b.get(size) == null) {
                    this.f38165b.remove(size);
                }
            }
            if (this.f38165b.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                this.f38172i.a();
            }
            this.f38170g = false;
        }
    }

    static b h() {
        ThreadLocal threadLocal = f38163j;
        if (threadLocal.get() == null) {
            threadLocal.set(new b(new f()));
        }
        return (b) threadLocal.get();
    }

    private boolean i(c cVar, long j10) {
        Long l10 = (Long) this.f38164a.get(cVar);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f38164a.remove(cVar);
        return true;
    }

    void d(c cVar, long j10) {
        if (this.f38165b.size() == 0) {
            this.f38168e.a(this.f38167d);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f38171h = ValueAnimator.getDurationScale();
                if (this.f38172i == null) {
                    this.f38172i = new d();
                }
                this.f38172i.b();
            }
        }
        if (!this.f38165b.contains(cVar)) {
            this.f38165b.add(cVar);
        }
        if (j10 > 0) {
            this.f38164a.put(cVar, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    void f(long j10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f38165b.size(); i10++) {
            c cVar = (c) this.f38165b.get(i10);
            if (cVar != null && i(cVar, jUptimeMillis)) {
                cVar.a(j10);
            }
        }
        e();
    }

    public float g() {
        return this.f38171h;
    }

    boolean j() {
        return this.f38168e.b();
    }

    void k(c cVar) {
        this.f38164a.remove(cVar);
        int iIndexOf = this.f38165b.indexOf(cVar);
        if (iIndexOf >= 0) {
            this.f38165b.set(iIndexOf, null);
            this.f38170g = true;
        }
    }
}
