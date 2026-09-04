package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.hecorat.screenrecorder.free.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class f extends o {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f58838v = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private VelocityTracker f58839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Rect f58840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f58841i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f58842j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f58843k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f58844l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f58845m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f58846n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f58847o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f58848p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f58849q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private e f58850r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f58851s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final a0 f58852t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b f58853u;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void c();

        void e();

        void f();

        void h();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class c extends FrameLayout {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f58855a;

            static {
                int[] iArr = new int[e.values().length];
                try {
                    iArr[e.DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.MOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e.INTERSECT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f58855a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(context);
            kotlin.jvm.internal.s.e(context);
        }

        private final void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                setSystemGestureExclusionRects(gl.r.l());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(c cVar) {
            cVar.h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(c cVar) {
            cVar.h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(c cVar) {
            cVar.h();
        }

        private final void h() {
            if (Build.VERSION.SDK_INT >= 29) {
                Rect rect = new Rect();
                getGlobalVisibleRect(rect);
                setSystemGestureExclusionRects(gl.r.e(rect));
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            post(new Runnable() { // from class: zg.g
                @Override // java.lang.Runnable
                public final void run() {
                    f.c.e(this.f58867a);
                }
            });
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            b bVar;
            kotlin.jvm.internal.s.h(event, "event");
            float rawX = event.getRawX();
            float rawY = event.getRawY();
            int i10 = (int) rawX;
            int i11 = (int) rawY;
            event.setLocation(rawX, rawY);
            int action = event.getAction();
            if (action == 0) {
                if (f.this.f58850r == e.IDLE) {
                    f.this.f58850r = e.DOWN;
                    f.this.V(System.currentTimeMillis());
                    f.this.O(i10);
                    f.this.P(i11);
                    f fVar = f.this;
                    fVar.T(i10 - fVar.f58878b.x);
                    f fVar2 = f.this;
                    fVar2.U(i11 - fVar2.f58878b.y);
                    if (f.this.L() == null) {
                        f.this.X(VelocityTracker.obtain());
                    } else {
                        VelocityTracker velocityTrackerL = f.this.L();
                        kotlin.jvm.internal.s.e(velocityTrackerL);
                        velocityTrackerL.clear();
                    }
                    VelocityTracker velocityTrackerL2 = f.this.L();
                    kotlin.jvm.internal.s.e(velocityTrackerL2);
                    velocityTrackerL2.addMovement(event);
                }
                post(new Runnable() { // from class: zg.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.c.f(this.f58868a);
                    }
                });
            } else if (action == 1) {
                long jCurrentTimeMillis = System.currentTimeMillis() - f.this.J();
                int i12 = a.f58855a[f.this.f58850r.ordinal()];
                if (i12 == 1) {
                    if (jCurrentTimeMillis < 1000 && (bVar = f.this.f58853u) != null) {
                        bVar.h();
                    }
                    f.this.f58850r = e.IDLE;
                } else if (i12 == 2) {
                    VelocityTracker velocityTrackerL3 = f.this.L();
                    kotlin.jvm.internal.s.e(velocityTrackerL3);
                    velocityTrackerL3.computeCurrentVelocity(10);
                    f.this.f58850r = e.DRIFTED;
                    f.this.new d().start();
                } else if (i12 == 3) {
                    f.this.y();
                }
                d();
            } else if (action == 2) {
                f fVar3 = f.this;
                Rect rect = fVar3.f58880d;
                if (i11 < rect.top && i11 > rect.bottom) {
                    return false;
                }
                int i13 = a.f58855a[fVar3.f58850r.ordinal()];
                if (i13 == 1) {
                    f fVar4 = f.this;
                    if (fVar4.A(i10, i11, fVar4.B(), f.this.C(), f.this.G())) {
                        f.this.f58850r = e.MOVING;
                        if (f.this.K()) {
                            f.this.f58852t.s();
                        }
                        b bVar2 = f.this.f58853u;
                        if (bVar2 != null) {
                            bVar2.e();
                        }
                    }
                } else if (i13 == 2) {
                    VelocityTracker velocityTrackerL4 = f.this.L();
                    kotlin.jvm.internal.s.e(velocityTrackerL4);
                    velocityTrackerL4.addMovement(event);
                    f fVar5 = f.this;
                    fVar5.f58878b.x = Math.abs(i10 - fVar5.H());
                    f fVar6 = f.this;
                    fVar6.f58878b.y = i11 - fVar6.I();
                    if (f.this.K()) {
                        f.this.w(i10, i11);
                    }
                    f fVar7 = f.this;
                    if (fVar7.f58878b.y < fVar7.D().top) {
                        f fVar8 = f.this;
                        fVar8.f58878b.y = fVar8.D().top;
                    }
                    f fVar9 = f.this;
                    if (fVar9.f58878b.y > fVar9.D().bottom) {
                        f fVar10 = f.this;
                        fVar10.f58878b.y = fVar10.D().bottom;
                    }
                    f.this.e();
                } else if (i13 == 3) {
                    f.this.x(i10, i11);
                }
                post(new Runnable() { // from class: zg.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.c.g(this.f58869a);
                    }
                });
            } else if (action == 3) {
                VelocityTracker velocityTrackerL5 = f.this.L();
                kotlin.jvm.internal.s.e(velocityTrackerL5);
                velocityTrackerL5.computeCurrentVelocity(10);
                f.this.f58850r = e.DRIFTED;
                f.this.new d().start();
                d();
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class d extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f58856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f58857b;

        public d() {
            VelocityTracker velocityTrackerL = f.this.L();
            kotlin.jvm.internal.s.e(velocityTrackerL);
            this.f58856a = velocityTrackerL.getYVelocity();
            VelocityTracker velocityTrackerL2 = f.this.L();
            kotlin.jvm.internal.s.e(velocityTrackerL2);
            this.f58857b = velocityTrackerL2.getXVelocity();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(f fVar) {
            fVar.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(f fVar) {
            fVar.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(f fVar) {
            b bVar = fVar.f58853u;
            if (bVar != null) {
                bVar.f();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(f fVar) {
            fVar.e();
        }

        public final void h() throws InterruptedException {
            final f fVar = f.this;
            fVar.f58879c.post(new Runnable() { // from class: zg.m
                @Override // java.lang.Runnable
                public final void run() {
                    f.d.i(fVar);
                }
            });
            Thread.sleep(10L);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0061 A[Catch: InterruptedException -> 0x0053, TryCatch #0 {InterruptedException -> 0x0053, blocks: (B:3:0x0002, B:4:0x0008, B:10:0x001c, B:12:0x0030, B:14:0x003e, B:16:0x004d, B:20:0x005b, B:19:0x0056, B:21:0x0061, B:23:0x006d, B:25:0x0090, B:24:0x007f, B:27:0x009f, B:29:0x00b3, B:31:0x00c1, B:34:0x00d2, B:36:0x00e0, B:38:0x00f9, B:37:0x00ed, B:39:0x0106, B:40:0x010b, B:42:0x0113, B:44:0x0127, B:45:0x0130), top: B:49:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x006d A[Catch: InterruptedException -> 0x0053, TryCatch #0 {InterruptedException -> 0x0053, blocks: (B:3:0x0002, B:4:0x0008, B:10:0x001c, B:12:0x0030, B:14:0x003e, B:16:0x004d, B:20:0x005b, B:19:0x0056, B:21:0x0061, B:23:0x006d, B:25:0x0090, B:24:0x007f, B:27:0x009f, B:29:0x00b3, B:31:0x00c1, B:34:0x00d2, B:36:0x00e0, B:38:0x00f9, B:37:0x00ed, B:39:0x0106, B:40:0x010b, B:42:0x0113, B:44:0x0127, B:45:0x0130), top: B:49:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x007f A[Catch: InterruptedException -> 0x0053, TryCatch #0 {InterruptedException -> 0x0053, blocks: (B:3:0x0002, B:4:0x0008, B:10:0x001c, B:12:0x0030, B:14:0x003e, B:16:0x004d, B:20:0x005b, B:19:0x0056, B:21:0x0061, B:23:0x006d, B:25:0x0090, B:24:0x007f, B:27:0x009f, B:29:0x00b3, B:31:0x00c1, B:34:0x00d2, B:36:0x00e0, B:38:0x00f9, B:37:0x00ed, B:39:0x0106, B:40:0x010b, B:42:0x0113, B:44:0x0127, B:45:0x0130), top: B:49:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00d2 A[Catch: InterruptedException -> 0x0053, TryCatch #0 {InterruptedException -> 0x0053, blocks: (B:3:0x0002, B:4:0x0008, B:10:0x001c, B:12:0x0030, B:14:0x003e, B:16:0x004d, B:20:0x005b, B:19:0x0056, B:21:0x0061, B:23:0x006d, B:25:0x0090, B:24:0x007f, B:27:0x009f, B:29:0x00b3, B:31:0x00c1, B:34:0x00d2, B:36:0x00e0, B:38:0x00f9, B:37:0x00ed, B:39:0x0106, B:40:0x010b, B:42:0x0113, B:44:0x0127, B:45:0x0130), top: B:49:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00e0 A[Catch: InterruptedException -> 0x0053, TryCatch #0 {InterruptedException -> 0x0053, blocks: (B:3:0x0002, B:4:0x0008, B:10:0x001c, B:12:0x0030, B:14:0x003e, B:16:0x004d, B:20:0x005b, B:19:0x0056, B:21:0x0061, B:23:0x006d, B:25:0x0090, B:24:0x007f, B:27:0x009f, B:29:0x00b3, B:31:0x00c1, B:34:0x00d2, B:36:0x00e0, B:38:0x00f9, B:37:0x00ed, B:39:0x0106, B:40:0x010b, B:42:0x0113, B:44:0x0127, B:45:0x0130), top: B:49:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00ed A[Catch: InterruptedException -> 0x0053, TryCatch #0 {InterruptedException -> 0x0053, blocks: (B:3:0x0002, B:4:0x0008, B:10:0x001c, B:12:0x0030, B:14:0x003e, B:16:0x004d, B:20:0x005b, B:19:0x0056, B:21:0x0061, B:23:0x006d, B:25:0x0090, B:24:0x007f, B:27:0x009f, B:29:0x00b3, B:31:0x00c1, B:34:0x00d2, B:36:0x00e0, B:38:0x00f9, B:37:0x00ed, B:39:0x0106, B:40:0x010b, B:42:0x0113, B:44:0x0127, B:45:0x0130), top: B:49:0x0002 }] */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            e eVar;
            f fVar;
            f fVar2;
            try {
                Thread.sleep(10L);
                boolean z10 = true;
                boolean z11 = true;
                while (true) {
                    e eVar2 = f.this.f58850r;
                    eVar = e.DRIFTED;
                    if (eVar2 != eVar || (!z10 && !z11)) {
                        break;
                    }
                    if (z10) {
                        f fVar3 = f.this;
                        WindowManager.LayoutParams layoutParams = fVar3.f58878b;
                        int i10 = layoutParams.x + ((int) this.f58857b);
                        layoutParams.x = i10;
                        if (i10 >= fVar3.D().left) {
                            f fVar4 = f.this;
                            if (fVar4.f58878b.x <= fVar4.D().right) {
                                f fVar5 = f.this;
                                if (fVar5.f58878b.x <= fVar5.E()) {
                                    this.f58857b -= 0.9f;
                                } else {
                                    this.f58857b += 0.9f;
                                }
                                this.f58857b *= 0.95f;
                            } else {
                                fVar2 = f.this;
                                if (fVar2.f58878b.x <= fVar2.E()) {
                                    f.this.S(true);
                                    f fVar6 = f.this;
                                    fVar6.f58878b.x = fVar6.D().left;
                                } else {
                                    f.this.S(false);
                                    f fVar7 = f.this;
                                    fVar7.f58878b.x = fVar7.D().right;
                                }
                                final f fVar8 = f.this;
                                fVar8.f58879c.post(new Runnable() { // from class: zg.j
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        f.d.e(fVar8);
                                    }
                                });
                                z10 = false;
                            }
                        } else {
                            fVar2 = f.this;
                            if (fVar2.f58878b.x <= fVar2.E()) {
                                f.this.S(true);
                                f fVar9 = f.this;
                                fVar9.f58878b.x = fVar9.D().left;
                            } else {
                                f.this.S(false);
                                f fVar10 = f.this;
                                fVar10.f58878b.x = fVar10.D().right;
                            }
                            final f fVar11 = f.this;
                            fVar11.f58879c.post(new Runnable() { // from class: zg.j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    f.d.e(fVar11);
                                }
                            });
                            z10 = false;
                        }
                    }
                    if (z11) {
                        f fVar12 = f.this;
                        WindowManager.LayoutParams layoutParams2 = fVar12.f58878b;
                        int i11 = layoutParams2.y + ((int) this.f58856a);
                        layoutParams2.y = i11;
                        if (i11 >= fVar12.D().top) {
                            f fVar13 = f.this;
                            if (fVar13.f58878b.y <= fVar13.D().bottom) {
                                float f10 = this.f58856a * 0.95f;
                                this.f58856a = f10;
                                if (Math.abs(f10) <= 3.0f) {
                                }
                            } else {
                                fVar = f.this;
                                if (fVar.f58878b.y < fVar.D().top) {
                                    f fVar14 = f.this;
                                    fVar14.f58878b.y = fVar14.D().top;
                                } else {
                                    f fVar15 = f.this;
                                    fVar15.f58878b.y = fVar15.D().bottom;
                                }
                                final f fVar16 = f.this;
                                fVar16.f58879c.post(new Runnable() { // from class: zg.k
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        f.d.f(fVar16);
                                    }
                                });
                            }
                            z11 = false;
                        } else {
                            fVar = f.this;
                            if (fVar.f58878b.y < fVar.D().top) {
                                f fVar17 = f.this;
                                fVar17.f58878b.y = fVar17.D().top;
                            } else {
                                f fVar18 = f.this;
                                fVar18.f58878b.y = fVar18.D().bottom;
                            }
                            final f fVar19 = f.this;
                            fVar19.f58879c.post(new Runnable() { // from class: zg.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    f.d.f(fVar19);
                                }
                            });
                            z11 = false;
                        }
                    }
                    h();
                }
                if (f.this.f58850r == eVar) {
                    final f fVar20 = f.this;
                    fVar20.f58879c.post(new Runnable() { // from class: zg.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            f.d.g(fVar20);
                        }
                    });
                    if (f.this.K()) {
                        f.this.f58852t.t();
                    }
                    f.this.f58850r = e.IDLE;
                }
            } catch (InterruptedException e10) {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum e {
        IDLE,
        MOVING,
        DOWN,
        DRIFTED,
        INTERSECT;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ ml.a f58865g = ml.b.a(d());
    }

    /* JADX INFO: renamed from: zg.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0902f extends AnimatorListenerAdapter {
        C0902f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.s.h(animation, "animation");
            b bVar = f.this.f58853u;
            kotlin.jvm.internal.s.e(bVar);
            bVar.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        kotlin.jvm.internal.s.h(context, "context");
        this.f58842j = context.getResources().getDimensionPixelSize(R.dimen.click_max_distance);
        this.f58848p = true;
        this.f58849q = -1;
        this.f58850r = e.IDLE;
        this.f58851s = true;
        this.f58840h = new Rect();
        this.f58852t = new a0(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i10 - i12;
        int i16 = i11 - i13;
        return (i15 * i15) + (i16 * i16) > i14 * i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(f fVar, ValueAnimator animation) {
        kotlin.jvm.internal.s.h(animation, "animation");
        WindowManager.LayoutParams layoutParams = fVar.f58878b;
        Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.s.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.y = ((Integer) animatedValue).intValue();
        fVar.e();
    }

    public final int B() {
        return this.f58845m;
    }

    public final int C() {
        return this.f58846n;
    }

    public final Rect D() {
        return this.f58840h;
    }

    public final int E() {
        return this.f58847o;
    }

    public abstract int F();

    public final int G() {
        return this.f58842j;
    }

    public final int H() {
        return this.f58843k;
    }

    public final int I() {
        return this.f58844l;
    }

    public final long J() {
        return this.f58841i;
    }

    public final boolean K() {
        return this.f58851s;
    }

    public final VelocityTracker L() {
        return this.f58839g;
    }

    public final boolean M() {
        return this.f58850r != e.IDLE;
    }

    public final boolean N() {
        return this.f58848p;
    }

    public final void O(int i10) {
        this.f58845m = i10;
    }

    public final void P(int i10) {
        this.f58846n = i10;
    }

    public final void Q(b bVar) {
        this.f58853u = bVar;
    }

    public abstract void R(int i10);

    public final void S(boolean z10) {
        this.f58848p = z10;
    }

    public final void T(int i10) {
        this.f58843k = i10;
    }

    public final void U(int i10) {
        this.f58844l = i10;
    }

    public final void V(long j10) {
        this.f58841i = j10;
    }

    public final void W(boolean z10) {
        this.f58851s = z10;
    }

    public final void X(VelocityTracker velocityTracker) {
        this.f58839g = velocityTracker;
    }

    public final void Y(Rect windowRect, Integer num) {
        kotlin.jvm.internal.s.h(windowRect, "windowRect");
        o(windowRect);
        int i10 = windowRect.bottom - windowRect.top;
        this.f58878b.x = this.f58848p ? windowRect.left : windowRect.right - l();
        if (num == null || num.intValue() < 0) {
            this.f58878b.y = (int) ((((F() / 100.0f) * i10) - (j() / 2)) + windowRect.top);
        } else {
            this.f58878b.y = num.intValue();
            v();
        }
    }

    @Override // zg.o
    public void d(View view) {
        kotlin.jvm.internal.s.h(view, "view");
        c cVar = new c(this.f58881e);
        cVar.addView(view);
        super.d(cVar);
    }

    @Override // zg.o
    public void n() {
        super.n();
        this.f58852t.t();
    }

    @Override // zg.o
    public void o(Rect rect) {
        kotlin.jvm.internal.s.h(rect, "rect");
        super.o(rect);
        this.f58852t.o(rect);
        Rect rect2 = this.f58840h;
        Rect rect3 = this.f58880d;
        int i10 = rect3.left;
        int i11 = rect3.top;
        int i12 = rect3.right;
        WindowManager.LayoutParams layoutParams = this.f58878b;
        rect2.set(i10, i11, i12 - layoutParams.width, rect3.bottom - layoutParams.height);
        Rect rect4 = this.f58840h;
        this.f58847o = (rect4.right + rect4.left) / 2;
        this.f58850r = e.IDLE;
    }

    public final int v() {
        WindowManager.LayoutParams layoutParams = this.f58878b;
        int i10 = layoutParams.y;
        int i11 = layoutParams.height;
        Rect rect = this.f58840h;
        int i12 = rect.top;
        R((int) ((((i10 + (i11 / 2)) - i12) * 100.0f) / ((rect.bottom - i12) + i11)));
        return F();
    }

    public final void w(int i10, int i11) {
        if (this.f58852t.f58827h.contains(i10, i11)) {
            this.f58850r = e.INTERSECT;
            nh.n nVar = nh.n.f47744a;
            Context context = this.f58881e;
            kotlin.jvm.internal.s.g(context, "context");
            nVar.b(context, nh.n.a.BUBBLE_SNAP);
        }
    }

    public final void x(int i10, int i11) {
        WindowManager.LayoutParams layoutParams = this.f58878b;
        WindowManager.LayoutParams layoutParams2 = this.f58852t.f58878b;
        layoutParams.x = (layoutParams2.x + (layoutParams2.width / 2)) - (layoutParams.width / 2);
        layoutParams.y = (layoutParams2.y + (layoutParams2.height / 2)) - (layoutParams.height / 2);
        e();
        if (this.f58852t.f58827h.contains(i10, i11)) {
            return;
        }
        this.f58850r = e.MOVING;
        WindowManager.LayoutParams layoutParams3 = this.f58878b;
        layoutParams3.x = i10 - (layoutParams3.width / 2);
        layoutParams3.y = i11 - (layoutParams3.height / 2);
        e();
    }

    public final void y() {
        this.f58852t.t();
        WindowManager.LayoutParams layoutParams = this.f58878b;
        int i10 = layoutParams.y;
        int i11 = layoutParams.height;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10 - (i11 / 2), this.f58880d.bottom - (i11 / 2));
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zg.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.z(this.f58837a, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new C0902f());
        valueAnimatorOfInt.start();
    }
}
