package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import n0.i0;
import n0.q0;
import n0.t0;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class RecyclerView extends ViewGroup implements i0, n0.w {
    static boolean E0;
    static boolean F0;
    private static final int[] G0 = {R.attr.nestedScrollingEnabled};
    private static final float H0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean I0 = false;
    static final boolean J0 = true;
    static final boolean K0 = true;
    private static final Class[] L0;
    static final Interpolator M0;
    static final d0 N0;
    private int A;
    boolean A0;
    boolean B;
    private final androidx.recyclerview.widget.a0.b B0;
    private final AccessibilityManager C;
    private final n0.i C0;
    private List D;
    n0.h D0;
    boolean E;
    boolean F;
    private int G;
    private int H;
    private m I;
    private EdgeEffect J;
    private EdgeEffect K;
    private EdgeEffect L;
    private EdgeEffect M;
    n N;
    private int O;
    private int P;
    private VelocityTracker Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private t W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f6634a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final int f6635a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f6636b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final int f6637b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final x f6638c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    float f6639c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    a0 f6640d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    float f6641d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    androidx.recyclerview.widget.a f6642e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f6643e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.recyclerview.widget.f f6644f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    final f0 f6645f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final androidx.recyclerview.widget.a0 f6646g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    androidx.recyclerview.widget.l f6647g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f6648h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    androidx.recyclerview.widget.l.b f6649h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Runnable f6650i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    final c0 f6651i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Rect f6652j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private v f6653j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f6654k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private List f6655k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final RectF f6656l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    boolean f6657l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    h f6658m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    boolean f6659m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    q f6660n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private n.a f6661n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final List f6662o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    boolean f6663o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final ArrayList f6664p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    androidx.recyclerview.widget.u f6665p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ArrayList f6666q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final int[] f6667q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private u f6668r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private n0.x f6669r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f6670s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private final int[] f6671s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f6672t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private final int[] f6673t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f6674u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    final int[] f6675u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f6676v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    final List f6677v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f6678w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private Runnable f6679w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f6680x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f6681x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f6682y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f6683y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f6684z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f6685z0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f6676v || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f6670s) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f6682y) {
                recyclerView2.f6680x = true;
            } else {
                recyclerView2.B();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n nVar = RecyclerView.this.N;
            if (nVar != null) {
                nVar.u();
            }
            RecyclerView.this.f6663o0 = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static abstract class b0 {
        private q mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final a mRecyclingAction = new a(0, 0);

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f6689a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f6690b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f6691c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f6692d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Interpolator f6693e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f6694f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f6695g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            private void e() {
                if (this.f6693e != null && this.f6691c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f6691c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f6692d >= 0;
            }

            public void b(int i10) {
                this.f6692d = i10;
            }

            void c(RecyclerView recyclerView) {
                int i10 = this.f6692d;
                if (i10 >= 0) {
                    this.f6692d = -1;
                    recyclerView.H0(i10);
                    this.f6694f = false;
                } else {
                    if (!this.f6694f) {
                        this.f6695g = 0;
                        return;
                    }
                    e();
                    recyclerView.f6645f0.e(this.f6689a, this.f6690b, this.f6691c, this.f6693e);
                    int i11 = this.f6695g + 1;
                    this.f6695g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f6694f = false;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f6689a = i10;
                this.f6690b = i11;
                this.f6691c = i12;
                this.f6693e = interpolator;
                this.f6694f = true;
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f6692d = -1;
                this.f6694f = false;
                this.f6695g = 0;
                this.f6689a = i10;
                this.f6690b = i11;
                this.f6691c = i12;
                this.f6693e = interpolator;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public interface b {
            PointF computeScrollVectorForPosition(int i10);
        }

        public PointF computeScrollVectorForPosition(int i10) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof b) {
                return ((b) layoutManager).computeScrollVectorForPosition(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i10) {
            return this.mRecyclerView.f6660n.findViewByPosition(i10);
        }

        public int getChildCount() {
            return this.mRecyclerView.f6660n.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.n0(view);
        }

        public q getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i10) {
            this.mRecyclerView.v1(i10);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        protected void normalize(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void onAnimation(int i10, int i11) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f10 = pointFComputeScrollVectorForPosition.x;
                if (f10 != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.u1((int) Math.signum(f10), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.f6651i0, this.mRecyclingAction);
                    this.mRecyclingAction.c(recyclerView);
                    stop();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i10, i11, recyclerView.f6651i0, this.mRecyclingAction);
                boolean zA = this.mRecyclingAction.a();
                this.mRecyclingAction.c(recyclerView);
                if (zA && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.f6645f0.d();
                }
            }
        }

        protected void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
                if (RecyclerView.F0) {
                    Log.d("RecyclerView", "smooth scroll target view has been attached");
                }
            }
        }

        protected abstract void onSeekTargetStep(int i10, int i11, c0 c0Var, a aVar);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(View view, c0 c0Var, a aVar);

        public void setTargetPosition(int i10) {
            this.mTargetPosition = i10;
        }

        void start(RecyclerView recyclerView, q qVar) {
            recyclerView.f6645f0.f();
            if (this.mStarted) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = qVar;
            int i10 = this.mTargetPosition;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f6651i0.f6696a = i10;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.f6645f0.d();
            this.mStarted = true;
        }

        protected final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.f6651i0.f6696a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class c0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray f6697b;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f6708m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f6709n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f6710o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f6711p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f6712q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6696a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f6698c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f6699d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6700e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f6701f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f6702g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f6703h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f6704i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f6705j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f6706k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f6707l = false;

        void a(int i10) {
            if ((this.f6700e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f6700e));
        }

        public int b() {
            return this.f6703h ? this.f6698c - this.f6699d : this.f6701f;
        }

        public int c() {
            return this.f6696a;
        }

        public boolean d() {
            return this.f6696a != -1;
        }

        public boolean e() {
            return this.f6703h;
        }

        void f(h hVar) {
            this.f6700e = 1;
            this.f6701f = hVar.getItemCount();
            this.f6703h = false;
            this.f6704i = false;
            this.f6705j = false;
        }

        public boolean g() {
            return this.f6707l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f6696a + ", mData=" + this.f6697b + ", mItemCount=" + this.f6701f + ", mIsMeasuring=" + this.f6705j + ", mPreviousLayoutItemCount=" + this.f6698c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f6699d + ", mStructureChanged=" + this.f6702g + ", mInPreLayout=" + this.f6703h + ", mRunSimpleAnimations=" + this.f6706k + ", mRunPredictiveAnimations=" + this.f6707l + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class d implements androidx.recyclerview.widget.a0.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.a0.b
        public void a(g0 g0Var, n.b bVar, n.b bVar2) {
            RecyclerView.this.o(g0Var, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.a0.b
        public void b(g0 g0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f6660n.removeAndRecycleView(g0Var.itemView, recyclerView.f6638c);
        }

        @Override // androidx.recyclerview.widget.a0.b
        public void c(g0 g0Var, n.b bVar, n.b bVar2) {
            RecyclerView.this.f6638c.O(g0Var);
            RecyclerView.this.q(g0Var, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.a0.b
        public void d(g0 g0Var, n.b bVar, n.b bVar2) {
            g0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.E) {
                if (recyclerView.N.b(g0Var, g0Var, bVar, bVar2)) {
                    RecyclerView.this.Y0();
                }
            } else if (recyclerView.N.d(g0Var, bVar, bVar2)) {
                RecyclerView.this.Y0();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class d0 extends m {
        d0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class e implements n0.i {
        e() {
        }

        @Override // n0.i
        public boolean a(float f10) {
            int i10;
            int i11;
            if (RecyclerView.this.f6660n.canScrollVertically()) {
                i11 = (int) f10;
                i10 = 0;
            } else if (RecyclerView.this.f6660n.canScrollHorizontally()) {
                i10 = (int) f10;
                i11 = 0;
            } else {
                i10 = 0;
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            RecyclerView.this.L1();
            return RecyclerView.this.j0(i10, i11);
        }

        @Override // n0.i
        public float b() {
            float f10;
            if (RecyclerView.this.f6660n.canScrollVertically()) {
                f10 = RecyclerView.this.f6641d0;
            } else {
                if (!RecyclerView.this.f6660n.canScrollHorizontally()) {
                    return 0.0f;
                }
                f10 = RecyclerView.this.f6639c0;
            }
            return -f10;
        }

        @Override // n0.i
        public void c() {
            RecyclerView.this.L1();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static abstract class e0 {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class f implements androidx.recyclerview.widget.f.b {
        f() {
        }

        @Override // androidx.recyclerview.widget.f.b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void addView(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.F(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void b(View view) {
            g0 g0VarP0 = RecyclerView.p0(view);
            if (g0VarP0 != null) {
                g0VarP0.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.f.b
        public g0 d(View view) {
            return RecyclerView.p0(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void e(int i10) {
            View viewA = a(i10);
            if (viewA != null) {
                g0 g0VarP0 = RecyclerView.p0(viewA);
                if (g0VarP0 != null) {
                    if (g0VarP0.isTmpDetached() && !g0VarP0.shouldIgnore()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + g0VarP0 + RecyclerView.this.W());
                    }
                    if (RecyclerView.F0) {
                        Log.d("RecyclerView", "tmpDetach " + g0VarP0);
                    }
                    g0VarP0.addFlags(256);
                }
            } else if (RecyclerView.E0) {
                throw new IllegalArgumentException("No view at offset " + i10 + RecyclerView.this.W());
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void f() {
            int iC = c();
            for (int i10 = 0; i10 < iC; i10++) {
                View viewA = a(i10);
                RecyclerView.this.G(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.f.b
        public int g(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void h(View view) {
            g0 g0VarP0 = RecyclerView.p0(view);
            if (g0VarP0 != null) {
                g0VarP0.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f.b
        public void i(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.G(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void j(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            g0 g0VarP0 = RecyclerView.p0(view);
            if (g0VarP0 != null) {
                if (!g0VarP0.isTmpDetached() && !g0VarP0.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + g0VarP0 + RecyclerView.this.W());
                }
                if (RecyclerView.F0) {
                    Log.d("RecyclerView", "reAttach " + g0VarP0);
                }
                g0VarP0.clearTmpDetachFlag();
            } else if (RecyclerView.E0) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i10 + RecyclerView.this.W());
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class f0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f6716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        OverScroller f6718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Interpolator f6719d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f6720e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f6721f;

        f0() {
            Interpolator interpolator = RecyclerView.M0;
            this.f6719d = interpolator;
            this.f6720e = false;
            this.f6721f = false;
            this.f6718c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            q0.e0(RecyclerView.this, this);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f6717b = 0;
            this.f6716a = 0;
            Interpolator interpolator = this.f6719d;
            Interpolator interpolator2 = RecyclerView.M0;
            if (interpolator != interpolator2) {
                this.f6719d = interpolator2;
                this.f6718c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f6718c.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        void d() {
            if (this.f6720e) {
                this.f6721f = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.M0;
            }
            if (this.f6719d != interpolator) {
                this.f6719d = interpolator;
                this.f6718c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f6717b = 0;
            this.f6716a = 0;
            RecyclerView.this.setScrollState(2);
            this.f6718c.startScroll(0, 0, i10, i11, i13);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f6718c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            int i12;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f6660n == null) {
                f();
                return;
            }
            this.f6721f = false;
            this.f6720e = true;
            recyclerView.B();
            OverScroller overScroller = this.f6718c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f6716a;
                int i14 = currY - this.f6717b;
                this.f6716a = currX;
                this.f6717b = currY;
                int iY = RecyclerView.this.y(i13);
                int iA = RecyclerView.this.A(i14);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f6675u0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.M(iY, iA, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f6675u0;
                    iY -= iArr2[0];
                    iA -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.x(iY, iA);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f6658m != null) {
                    int[] iArr3 = recyclerView3.f6675u0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.u1(iY, iA, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f6675u0;
                    int i15 = iArr4[0];
                    int i16 = iArr4[1];
                    iY -= i15;
                    iA -= i16;
                    b0 b0Var = recyclerView4.f6660n.mSmoothScroller;
                    if (b0Var != null && !b0Var.isPendingInitialRun() && b0Var.isRunning()) {
                        int iB = RecyclerView.this.f6651i0.b();
                        if (iB == 0) {
                            b0Var.stop();
                        } else if (b0Var.getTargetPosition() >= iB) {
                            b0Var.setTargetPosition(iB - 1);
                            b0Var.onAnimation(i15, i16);
                        } else {
                            b0Var.onAnimation(i15, i16);
                        }
                    }
                    i11 = i16;
                    i10 = i15;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int i17 = iY;
                int i18 = iA;
                if (!RecyclerView.this.f6664p.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f6675u0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.N(i10, i11, i17, i18, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f6675u0;
                int i19 = i17 - iArr6[0];
                int i20 = i18 - iArr6[1];
                if (i10 != 0 || i11 != 0) {
                    recyclerView6.P(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i19 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i20 != 0));
                b0 b0Var2 = RecyclerView.this.f6660n.mSmoothScroller;
                if ((b0Var2 == null || !b0Var2.isPendingInitialRun()) && z10) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i19 < 0) {
                            i12 = -currVelocity;
                        } else {
                            i12 = i19 > 0 ? currVelocity : 0;
                        }
                        if (i20 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i20 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.b(i12, currVelocity);
                    }
                    if (RecyclerView.K0) {
                        RecyclerView.this.f6649h0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.l lVar = recyclerView7.f6647g0;
                    if (lVar != null) {
                        lVar.f(recyclerView7, i10, i11);
                    }
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    k.a(RecyclerView.this, Math.abs(overScroller.getCurrVelocity()));
                }
            }
            b0 b0Var3 = RecyclerView.this.f6660n.mSmoothScroller;
            if (b0Var3 != null && b0Var3.isPendingInitialRun()) {
                b0Var3.onAnimation(0, 0);
            }
            this.f6720e = false;
            if (this.f6721f) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.K1(1);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class g implements androidx.recyclerview.widget.a.InterfaceC0076a {
        g() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0076a
        public void a(int i10, int i11) {
            RecyclerView.this.O0(i10, i11);
            RecyclerView.this.f6657l0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0076a
        public void b(androidx.recyclerview.widget.a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0076a
        public void c(androidx.recyclerview.widget.a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0076a
        public void d(int i10, int i11) {
            RecyclerView.this.P0(i10, i11, false);
            RecyclerView.this.f6657l0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0076a
        public void e(int i10, int i11, Object obj) {
            RecyclerView.this.N1(i10, i11, obj);
            RecyclerView.this.f6659m0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0076a
        public g0 f(int i10) {
            g0 g0VarG0 = RecyclerView.this.g0(i10, true);
            if (g0VarG0 == null) {
                return null;
            }
            if (!RecyclerView.this.f6644f.n(g0VarG0.itemView)) {
                return g0VarG0;
            }
            if (RecyclerView.F0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0076a
        public void g(int i10, int i11) {
            RecyclerView.this.N0(i10, i11);
            RecyclerView.this.f6657l0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0076a
        public void h(int i10, int i11) {
            RecyclerView.this.P0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f6657l0 = true;
            recyclerView.f6651i0.f6699d += i11;
        }

        void i(androidx.recyclerview.widget.a.b bVar) {
            int i10 = bVar.f6830a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f6660n.onItemsAdded(recyclerView, bVar.f6831b, bVar.f6833d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f6660n.onItemsRemoved(recyclerView2, bVar.f6831b, bVar.f6833d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f6660n.onItemsUpdated(recyclerView3, bVar.f6831b, bVar.f6833d, bVar.f6832c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f6660n.onItemsMoved(recyclerView4, bVar.f6831b, bVar.f6833d, 1);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static abstract class g0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f6724a = 0;
        public final View itemView;
        h mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        g0 mShadowedHolder = null;
        g0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        x mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public g0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void a() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                a();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && q0.Q(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.k0(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final h getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int iK0;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (iK0 = this.mOwnerRecyclerView.k0(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, iK0);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        boolean hasAnyOfTheFlags(int i10) {
            return (i10 & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !q0.Q(this.itemView);
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((r) this.itemView.getLayoutParams()).f6748c = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = this.itemView.getImportantForAccessibility();
            }
            recyclerView.x1(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.x1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            if (RecyclerView.E0 && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.v(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10 = this.mIsRecyclableCount;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.mIsRecyclableCount = i11;
            if (i11 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.E0) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i11 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i11 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.F0) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z10 + ":" + this);
            }
        }

        void setScrapContainer(x xVar, boolean z10) {
            this.mScrapContainer = xVar;
            this.mInChangeScrap = z10;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        void unScrap() {
            this.mScrapContainer.O(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static abstract class h {
        private final i mObservable = new i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes2.dex */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            f6727c
        }

        public final void bindViewHolder(g0 g0Var, int i10) {
            boolean z10 = g0Var.mBindingAdapter == null;
            if (z10) {
                g0Var.mPosition = i10;
                if (hasStableIds()) {
                    g0Var.mItemId = getItemId(i10);
                }
                g0Var.setFlags(1, 519);
                if (j0.o.c()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(g0Var.mItemViewType)));
                }
            }
            g0Var.mBindingAdapter = this;
            if (RecyclerView.E0) {
                if (g0Var.itemView.getParent() == null && g0Var.itemView.isAttachedToWindow() != g0Var.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + g0Var.isTmpDetached() + ", attached to window: " + g0Var.itemView.isAttachedToWindow() + ", holder: " + g0Var);
                }
                if (g0Var.itemView.getParent() == null && g0Var.itemView.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + g0Var);
                }
            }
            onBindViewHolder(g0Var, i10, g0Var.getUnmodifiedPayloads());
            if (z10) {
                g0Var.clearPayload();
                ViewGroup.LayoutParams layoutParams = g0Var.itemView.getLayoutParams();
                if (layoutParams instanceof r) {
                    ((r) layoutParams).f6748c = true;
                }
                Trace.endSection();
            }
        }

        boolean canRestoreState() {
            int iOrdinal = this.mStateRestorationPolicy.ordinal();
            if (iOrdinal != 1) {
                return iOrdinal != 2;
            }
            return getItemCount() > 0;
        }

        public final g0 createViewHolder(ViewGroup viewGroup, int i10) {
            try {
                if (j0.o.c()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i10)));
                }
                g0 g0VarOnCreateViewHolder = onCreateViewHolder(viewGroup, i10);
                if (g0VarOnCreateViewHolder.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                g0VarOnCreateViewHolder.mItemViewType = i10;
                Trace.endSection();
                return g0VarOnCreateViewHolder;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }

        public int findRelativeAdapterPositionIn(h hVar, g0 g0Var, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1L;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.d(i10, 1);
        }

        public final void notifyItemInserted(int i10) {
            this.mObservable.f(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.c(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.d(i10, i11);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.f(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.g(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.g(i10, 1);
        }

        public abstract void onBindViewHolder(g0 g0Var, int i10);

        public void onBindViewHolder(g0 g0Var, int i10, List<Object> list) {
            onBindViewHolder(g0Var, i10);
        }

        public abstract g0 onCreateViewHolder(ViewGroup viewGroup, int i10);

        public boolean onFailedToRecycleView(g0 g0Var) {
            return false;
        }

        public void registerAdapterDataObserver(j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z10) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z10;
        }

        public void setStateRestorationPolicy(a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.h();
        }

        public void unregisterAdapterDataObserver(j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i10, Object obj) {
            this.mObservable.e(i10, 1, obj);
        }

        public final void notifyItemRangeChanged(int i10, int i11, Object obj) {
            this.mObservable.e(i10, i11, obj);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public void onViewAttachedToWindow(g0 g0Var) {
        }

        public void onViewDetachedFromWindow(g0 g0Var) {
        }

        public void onViewRecycled(g0 g0Var) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class i extends Observable {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i10, i11, 1);
            }
        }

        public void d(int i10, int i11) {
            e(i10, i11, null);
        }

        public void e(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).b(i10, i11, obj);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i10, i11);
            }
        }

        public void g(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i10, i11);
            }
        }

        public void h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).f();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static final class k {
        public static void a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public interface l {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class m {
        protected abstract EdgeEffect a(RecyclerView recyclerView, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private class o implements n.a {
        o() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n.a
        public void a(g0 g0Var) {
            g0Var.setIsRecyclable(true);
            if (g0Var.mShadowedHolder != null && g0Var.mShadowingHolder == null) {
                g0Var.mShadowedHolder = null;
            }
            g0Var.mShadowingHolder = null;
            if (g0Var.shouldBeKeptAsChild() || RecyclerView.this.j1(g0Var.itemView) || !g0Var.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(g0Var.itemView, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static abstract class p {
        @Deprecated
        public void getItemOffsets(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, c0 c0Var) {
            getItemOffsets(rect, ((r) view.getLayoutParams()).a(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, c0 c0Var) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, c0 c0Var) {
            onDrawOver(canvas, recyclerView);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static abstract class q {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.f mChildHelper;
        private int mHeight;
        private int mHeightMode;
        androidx.recyclerview.widget.z mHorizontalBoundCheck;
        private final androidx.recyclerview.widget.z.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        b0 mSmoothScroller;
        androidx.recyclerview.widget.z mVerticalBoundCheck;
        private final androidx.recyclerview.widget.z.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements androidx.recyclerview.widget.z.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.z.b
            public View a(int i10) {
                return q.this.getChildAt(i10);
            }

            @Override // androidx.recyclerview.widget.z.b
            public int b(View view) {
                return q.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.z.b
            public int c() {
                return q.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.z.b
            public int d() {
                return q.this.getWidth() - q.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.z.b
            public int e(View view) {
                return q.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).rightMargin;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class b implements androidx.recyclerview.widget.z.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.z.b
            public View a(int i10) {
                return q.this.getChildAt(i10);
            }

            @Override // androidx.recyclerview.widget.z.b
            public int b(View view) {
                return q.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.z.b
            public int c() {
                return q.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.z.b
            public int d() {
                return q.this.getHeight() - q.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.z.b
            public int e(View view) {
                return q.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).bottomMargin;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public interface c {
            void a(int i10, int i11);
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f6742a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f6743b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f6744c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f6745d;
        }

        public q() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new androidx.recyclerview.widget.z(aVar);
            this.mVerticalBoundCheck = new androidx.recyclerview.widget.z(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        public static int chooseSize(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        private void e(View view, int i10, boolean z10) {
            g0 g0VarP0 = RecyclerView.p0(view);
            if (z10 || g0VarP0.isRemoved()) {
                this.mRecyclerView.f6646g.b(g0VarP0);
            } else {
                this.mRecyclerView.f6646g.p(g0VarP0);
            }
            r rVar = (r) view.getLayoutParams();
            if (g0VarP0.wasReturnedFromScrap() || g0VarP0.isScrap()) {
                if (g0VarP0.isScrap()) {
                    g0VarP0.unScrap();
                } else {
                    g0VarP0.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int iM = this.mChildHelper.m(view);
                if (i10 == -1) {
                    i10 = this.mChildHelper.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.W());
                }
                if (iM != i10) {
                    this.mRecyclerView.f6660n.moveView(iM, i10);
                }
            } else {
                this.mChildHelper.a(view, i10, false);
                rVar.f6748c = true;
                b0 b0Var = this.mSmoothScroller;
                if (b0Var != null && b0Var.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (rVar.f6749d) {
                if (RecyclerView.F0) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + rVar.f6746a);
                }
                g0VarP0.itemView.invalidate();
                rVar.f6749d = false;
            }
        }

        private void f(int i10, View view) {
            this.mChildHelper.d(i10);
        }

        private int[] g(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - paddingLeft;
            int iMin = Math.min(0, i10);
            int i11 = top - paddingTop;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - width;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        /* JADX WARN: Code duplicated, block: B:5:0x000c A[PHI: r3
          0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:6:0x000e  */
        @Deprecated
        public static int getChildMeasureSpec(int i10, int i11, int i12, boolean z10) {
            int i13 = i10 - i11;
            int i14 = 0;
            int iMax = Math.max(0, i13);
            if (z10) {
                if (i12 >= 0) {
                    i14 = 1073741824;
                } else {
                    i12 = 0;
                }
            } else if (i12 >= 0) {
                i14 = 1073741824;
            } else if (i12 == -1) {
                i12 = iMax;
                i14 = 1073741824;
            } else if (i12 == -2) {
                i14 = Integer.MIN_VALUE;
                i12 = iMax;
            } else {
                i12 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i12, i14);
        }

        public static d getProperties(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i10, i11);
            dVar.f6742a = typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_orientation, 1);
            dVar.f6743b = typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_spanCount, 1);
            dVar.f6744c = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_reverseLayout, false);
            dVar.f6745d = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_stackFromEnd, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        private boolean h(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.f6652j;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i10 < width && rect.right - i10 > paddingLeft && rect.top - i11 < height && rect.bottom - i11 > paddingTop;
        }

        private static boolean i(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        private void j(x xVar, int i10, View view) {
            g0 g0VarP0 = RecyclerView.p0(view);
            if (g0VarP0.shouldIgnore()) {
                if (RecyclerView.F0) {
                    Log.d("RecyclerView", "ignoring view " + g0VarP0);
                    return;
                }
                return;
            }
            if (g0VarP0.isInvalid() && !g0VarP0.isRemoved() && !this.mRecyclerView.f6658m.hasStableIds()) {
                removeViewAt(i10);
                xVar.H(g0VarP0);
            } else {
                detachViewAt(i10);
                xVar.I(view);
                this.mRecyclerView.f6646g.k(g0VarP0);
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.r(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.s(str);
            }
        }

        public void attachView(View view, int i10, r rVar) {
            g0 g0VarP0 = RecyclerView.p0(view);
            if (g0VarP0.isRemoved()) {
                this.mRecyclerView.f6646g.b(g0VarP0);
            } else {
                this.mRecyclerView.f6646g.p(g0VarP0);
            }
            this.mChildHelper.c(view, i10, rVar, g0VarP0.isRemoved());
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.t0(view));
            }
        }

        public abstract boolean canScrollHorizontally();

        public abstract boolean canScrollVertically();

        public boolean checkLayoutParams(r rVar) {
            return rVar != null;
        }

        public abstract int computeHorizontalScrollExtent(c0 c0Var);

        public abstract int computeHorizontalScrollOffset(c0 c0Var);

        public abstract int computeHorizontalScrollRange(c0 c0Var);

        public abstract int computeVerticalScrollExtent(c0 c0Var);

        public abstract int computeVerticalScrollOffset(c0 c0Var);

        public abstract int computeVerticalScrollRange(c0 c0Var);

        public void detachAndScrapAttachedViews(x xVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                j(xVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(View view, x xVar) {
            j(xVar, this.mChildHelper.m(view), view);
        }

        public void detachAndScrapViewAt(int i10, x xVar) {
            j(xVar, i10, getChildAt(i10));
        }

        public void detachView(View view) {
            int iM = this.mChildHelper.m(view);
            if (iM >= 0) {
                f(iM, view);
            }
        }

        public void detachViewAt(int i10) {
            f(i10, getChildAt(i10));
        }

        void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        void dispatchDetachedFromWindow(RecyclerView recyclerView, x xVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, xVar);
        }

        public void endAnimation(View view) {
            n nVar = this.mRecyclerView.N;
            if (nVar != null) {
                nVar.j(RecyclerView.p0(view));
            }
        }

        public View findContainingItemView(View view) {
            View viewY;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewY = recyclerView.Y(view)) == null || this.mChildHelper.n(viewY)) {
                return null;
            }
            return viewY;
        }

        public View findViewByPosition(int i10) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g0 g0VarP0 = RecyclerView.p0(childAt);
                if (g0VarP0 != null && g0VarP0.getLayoutPosition() == i10 && !g0VarP0.shouldIgnore() && (this.mRecyclerView.f6651i0.e() || !g0VarP0.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract r generateDefaultLayoutParams();

        public r generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof r) {
                return new r((r) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new r((ViewGroup.MarginLayoutParams) layoutParams) : new r(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view) {
            return ((r) view.getLayoutParams()).f6747b.bottom;
        }

        public View getChildAt(int i10) {
            androidx.recyclerview.widget.f fVar = this.mChildHelper;
            if (fVar != null) {
                return fVar.f(i10);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.f fVar = this.mChildHelper;
            if (fVar != null) {
                return fVar.g();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.f6648h;
        }

        public int getColumnCountForAccessibility(x xVar, c0 c0Var) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.f6658m == null || !canScrollHorizontally()) {
                return 1;
            }
            return this.mRecyclerView.f6658m.getItemCount();
        }

        public int getDecoratedBottom(View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.q0(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((r) view.getLayoutParams()).f6747b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((r) view.getLayoutParams()).f6747b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(View view) {
            return RecyclerView.p0(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return this.mRecyclerView.getLayoutDirection();
        }

        public int getLeftDecorationWidth(View view) {
            return ((r) view.getLayoutParams()).f6747b.left;
        }

        public int getMinimumHeight() {
            return q0.C(this.mRecyclerView);
        }

        public int getMinimumWidth() {
            return q0.D(this.mRecyclerView);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return q0.F(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return q0.G(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view) {
            return ((r) view.getLayoutParams()).a();
        }

        public int getRightDecorationWidth(View view) {
            return ((r) view.getLayoutParams()).f6747b.right;
        }

        public int getRowCountForAccessibility(x xVar, c0 c0Var) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.f6658m == null || !canScrollVertically()) {
                return 1;
            }
            return this.mRecyclerView.f6658m.getItemCount();
        }

        public int getSelectionModeForAccessibility(x xVar, c0 c0Var) {
            return 0;
        }

        public int getTopDecorationHeight(View view) {
            return ((r) view.getLayoutParams()).f6747b.top;
        }

        public void getTransformedBoundingBox(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((r) view.getLayoutParams()).f6747b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.f6656l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.W());
            }
            g0 g0VarP0 = RecyclerView.p0(view);
            g0VarP0.addFlags(128);
            this.mRecyclerView.f6646g.q(g0VarP0);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public abstract boolean isAutoMeasureEnabled();

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(x xVar, c0 c0Var) {
            return false;
        }

        public boolean isLayoutReversed() {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            b0 b0Var = this.mSmoothScroller;
            return b0Var != null && b0Var.isRunning();
        }

        public boolean isViewPartiallyVisible(View view, boolean z10, boolean z11) {
            boolean z12 = this.mHorizontalBoundCheck.b(view, 24579) && this.mVerticalBoundCheck.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public void layoutDecorated(View view, int i10, int i11, int i12, int i13) {
            Rect rect = ((r) view.getLayoutParams()).f6747b;
            view.layout(i10 + rect.left, i11 + rect.top, i12 - rect.right, i13 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i10, int i11, int i12, int i13) {
            r rVar = (r) view.getLayoutParams();
            Rect rect = rVar.f6747b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) rVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) rVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) rVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) rVar).bottomMargin);
        }

        public void measureChild(View view, int i10, int i11) {
            r rVar = (r) view.getLayoutParams();
            Rect rectT0 = this.mRecyclerView.t0(view);
            int i12 = i10 + rectT0.left + rectT0.right;
            int i13 = i11 + rectT0.top + rectT0.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i12, ((ViewGroup.MarginLayoutParams) rVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i13, ((ViewGroup.MarginLayoutParams) rVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, rVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view, int i10, int i11) {
            r rVar = (r) view.getLayoutParams();
            Rect rectT0 = this.mRecyclerView.t0(view);
            int i12 = i10 + rectT0.left + rectT0.right;
            int i13 = i11 + rectT0.top + rectT0.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) rVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) rVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, rVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i10, int i11) {
            View childAt = getChildAt(i10);
            if (childAt != null) {
                detachViewAt(i10);
                attachView(childAt, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(int i10) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.L0(i10);
            }
        }

        public void offsetChildrenVertical(int i10) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.M0(i10);
            }
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public abstract View onFocusSearchFailed(View view, int i10, x xVar, c0 c0Var);

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.f6638c, recyclerView.f6651i0, accessibilityEvent);
        }

        void onInitializeAccessibilityNodeInfo(o0.p pVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.f6638c, recyclerView.f6651i0, pVar);
        }

        void onInitializeAccessibilityNodeInfoForItem(View view, o0.p pVar) {
            g0 g0VarP0 = RecyclerView.p0(view);
            if (g0VarP0 == null || g0VarP0.isRemoved() || this.mChildHelper.n(g0VarP0.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.f6638c, recyclerView.f6651i0, view, pVar);
        }

        public View onInterceptFocusSearch(View view, int i10) {
            return null;
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11) {
        }

        public abstract void onLayoutChildren(x xVar, c0 c0Var);

        public void onMeasure(x xVar, c0 c0Var, int i10, int i11) {
            this.mRecyclerView.D(i10, i11);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.F0();
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        void onSmoothScrollerStopped(b0 b0Var) {
            if (this.mSmoothScroller == b0Var) {
                this.mSmoothScroller = null;
            }
        }

        boolean performAccessibilityAction(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.f6638c, recyclerView.f6651i0, i10, bundle);
        }

        public boolean performAccessibilityActionForItem(x xVar, c0 c0Var, View view, int i10, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                q0.e0(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.q(childCount);
            }
        }

        public void removeAndRecycleAllViews(x xVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.p0(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, xVar);
                }
            }
        }

        void removeAndRecycleScrapInt(x xVar) {
            int iJ = xVar.j();
            for (int i10 = iJ - 1; i10 >= 0; i10--) {
                View viewN = xVar.n(i10);
                g0 g0VarP0 = RecyclerView.p0(viewN);
                if (!g0VarP0.shouldIgnore()) {
                    g0VarP0.setIsRecyclable(false);
                    if (g0VarP0.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(viewN, false);
                    }
                    n nVar = this.mRecyclerView.N;
                    if (nVar != null) {
                        nVar.j(g0VarP0);
                    }
                    g0VarP0.setIsRecyclable(true);
                    xVar.D(viewN);
                }
            }
            xVar.e();
            if (iJ > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, x xVar) {
            removeView(view);
            xVar.G(view);
        }

        public void removeAndRecycleViewAt(int i10, x xVar) {
            View childAt = getChildAt(i10);
            removeViewAt(i10);
            xVar.G(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            this.mChildHelper.p(view);
        }

        public void removeViewAt(int i10) {
            if (getChildAt(i10) != null) {
                this.mChildHelper.q(i10);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z10, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public abstract int scrollHorizontallyBy(int i10, x xVar, c0 c0Var);

        public abstract void scrollToPosition(int i10);

        public abstract int scrollVerticallyBy(int i10, x xVar, c0 c0Var);

        @Deprecated
        public void setAutoMeasureEnabled(boolean z10) {
            this.mAutoMeasure = z10;
        }

        void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z10) {
            if (z10 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z10;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.f6638c.P();
                }
            }
        }

        void setMeasureSpecs(int i10, int i11) {
            this.mWidth = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.J0) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.J0) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i10, int i11) {
            setMeasuredDimension(chooseSize(i10, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i11, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        void setMeasuredDimensionFromChildren(int i10, int i11) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.D(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                Rect rect = this.mRecyclerView.f6652j;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.mRecyclerView.f6652j.set(i15, i13, i12, i14);
            setMeasuredDimension(this.mRecyclerView.f6652j, i10, i11);
        }

        public void setMeasurementCacheEnabled(boolean z10) {
            this.mMeasurementCacheEnabled = z10;
        }

        void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.f6644f;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        boolean shouldMeasureChild(View view, int i10, int i11, r rVar) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && i(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) rVar).width) && i(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) rVar).height)) ? false : true;
        }

        boolean shouldMeasureTwice() {
            return false;
        }

        boolean shouldReMeasureChild(View view, int i10, int i11, r rVar) {
            return (this.mMeasurementCacheEnabled && i(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) rVar).width) && i(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) rVar).height)) ? false : true;
        }

        public abstract void smoothScrollToPosition(RecyclerView recyclerView, c0 c0Var, int i10);

        public void startSmoothScroll(b0 b0Var) {
            b0 b0Var2 = this.mSmoothScroller;
            if (b0Var2 != null && b0Var != b0Var2 && b0Var2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = b0Var;
            b0Var.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(View view) {
            g0 g0VarP0 = RecyclerView.p0(view);
            g0VarP0.stopIgnoring();
            g0VarP0.resetInternal();
            g0VarP0.addFlags(4);
        }

        void stopSmoothScroller() {
            b0 b0Var = this.mSmoothScroller;
            if (b0Var != null) {
                b0Var.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public void addDisappearingView(View view, int i10) {
            e(view, i10, true);
        }

        public void addView(View view, int i10) {
            e(view, i10, false);
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, x xVar) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(x xVar, c0 c0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            h hVar = this.mRecyclerView.f6658m;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(x xVar, c0 c0Var, o0.p pVar) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                pVar.a(8192);
                pVar.S0(true);
                pVar.E0(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                pVar.a(4096);
                pVar.S0(true);
                pVar.E0(true);
            }
            pVar.w0(o0.p.g.b(getRowCountForAccessibility(xVar, c0Var), getColumnCountForAccessibility(xVar, c0Var), isLayoutHierarchical(xVar, c0Var), getSelectionModeForAccessibility(xVar, c0Var)));
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
            onItemsUpdated(recyclerView, i10, i11);
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, c0 c0Var, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0065 A[PHI: r11
          0x0065: PHI (r11v8 int) = (r11v5 int), (r11v18 int) binds: [B:27:0x0081, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean performAccessibilityAction(x xVar, c0 c0Var, int i10, Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            float f10;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i10 == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                } else {
                    paddingLeft = 0;
                }
            } else if (i10 != 8192) {
                paddingTop = 0;
                paddingLeft = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                } else {
                    paddingLeft = 0;
                }
            }
            if (paddingTop == 0 && paddingLeft == 0) {
                return false;
            }
            if (bundle != null) {
                f10 = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f10 < 0.0f) {
                    if (!RecyclerView.E0) {
                        return false;
                    }
                    throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f10 + ")");
                }
            } else {
                f10 = 1.0f;
            }
            if (Float.compare(f10, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f10) != 0 && Float.compare(0.0f, f10) != 0) {
                    paddingLeft = (int) (paddingLeft * f10);
                    paddingTop = (int) (paddingTop * f10);
                }
                this.mRecyclerView.D1(paddingLeft, paddingTop, null, Integer.MIN_VALUE, true);
                return true;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            h hVar = recyclerView.f6658m;
            if (hVar == null) {
                return false;
            }
            if (i10 == 4096) {
                recyclerView.E1(hVar.getItemCount() - 1);
            } else if (i10 == 8192) {
                recyclerView.E1(0);
            }
            return true;
        }

        boolean performAccessibilityActionForItem(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.f6638c, recyclerView.f6651i0, view, i10, bundle);
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] iArrG = g(view, rect);
            int i10 = iArrG[0];
            int i11 = iArrG[1];
            if ((z11 && !h(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.A1(i10, i11);
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int getChildMeasureSpec(int i10, int i11, int i12, int i13, boolean z10) {
            int iMax = Math.max(0, i10 - i12);
            if (z10) {
                if (i13 >= 0) {
                    i11 = 1073741824;
                } else if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                    i11 = 0;
                    i13 = 0;
                } else {
                    i13 = iMax;
                }
            } else if (i13 >= 0) {
                i11 = 1073741824;
            } else if (i13 == -1) {
                i13 = iMax;
            } else if (i13 != -2) {
                i11 = 0;
                i13 = 0;
            } else if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
                i13 = iMax;
                i11 = Integer.MIN_VALUE;
            } else {
                i13 = iMax;
                i11 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i13, i11);
        }

        public void onInitializeAccessibilityNodeInfoForItem(x xVar, c0 c0Var, View view, o0.p pVar) {
            pVar.x0(o0.p.h.a(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false, false));
        }

        public void attachView(View view, int i10) {
            attachView(view, i10, (r) view.getLayoutParams());
        }

        public r generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new r(context, attributeSet);
        }

        public void setMeasuredDimension(int i10, int i11) {
            this.mRecyclerView.setMeasuredDimension(i10, i11);
        }

        public void attachView(View view) {
            attachView(view, -1);
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onLayoutCompleted(c0 c0Var) {
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public void onScrollStateChanged(int i10) {
        }

        public void collectInitialPrefetchPositions(int i10, c cVar) {
        }

        public void onAdapterChanged(h hVar, h hVar2) {
        }

        public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        }

        public void collectAdjacentPrefetchPositions(int i10, int i11, c0 c0Var, c cVar) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public interface s {
        void a(View view);

        void b(View view);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static abstract class t {
        public abstract boolean onFling(int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public interface u {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SparseArray f6750a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6751b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Set f6752c = Collections.newSetFromMap(new IdentityHashMap());

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ArrayList f6753a = new ArrayList();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f6754b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            long f6755c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f6756d = 0;

            a() {
            }
        }

        private a i(int i10) {
            a aVar = (a) this.f6750a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f6750a.put(i10, aVar2);
            return aVar2;
        }

        void a() {
            this.f6751b++;
        }

        void b(h hVar) {
            this.f6752c.add(hVar);
        }

        public void c() {
            for (int i10 = 0; i10 < this.f6750a.size(); i10++) {
                a aVar = (a) this.f6750a.valueAt(i10);
                ArrayList arrayList = aVar.f6753a;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    t0.a.a(((g0) obj).itemView);
                }
                aVar.f6753a.clear();
            }
        }

        void d() {
            this.f6751b--;
        }

        void e(h hVar, boolean z10) {
            this.f6752c.remove(hVar);
            if (this.f6752c.size() != 0 || z10) {
                return;
            }
            for (int i10 = 0; i10 < this.f6750a.size(); i10++) {
                SparseArray sparseArray = this.f6750a;
                ArrayList arrayList = ((a) sparseArray.get(sparseArray.keyAt(i10))).f6753a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    t0.a.a(((g0) arrayList.get(i11)).itemView);
                }
            }
        }

        void f(int i10, long j10) {
            a aVarI = i(i10);
            aVarI.f6756d = l(aVarI.f6756d, j10);
        }

        void g(int i10, long j10) {
            a aVarI = i(i10);
            aVarI.f6755c = l(aVarI.f6755c, j10);
        }

        public g0 h(int i10) {
            a aVar = (a) this.f6750a.get(i10);
            if (aVar == null || aVar.f6753a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f6753a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((g0) arrayList.get(size)).isAttachedToTransitionOverlay()) {
                    return (g0) arrayList.remove(size);
                }
            }
            return null;
        }

        void j(h hVar, h hVar2, boolean z10) {
            if (hVar != null) {
                d();
            }
            if (!z10 && this.f6751b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void k(g0 g0Var) {
            int itemViewType = g0Var.getItemViewType();
            ArrayList arrayList = i(itemViewType).f6753a;
            if (((a) this.f6750a.get(itemViewType)).f6754b <= arrayList.size()) {
                t0.a.a(g0Var.itemView);
            } else {
                if (RecyclerView.E0 && arrayList.contains(g0Var)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                g0Var.resetInternal();
                arrayList.add(g0Var);
            }
        }

        long l(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        boolean m(int i10, long j10, long j11) {
            long j12 = i(i10).f6756d;
            return j12 == 0 || j10 + j12 < j11;
        }

        boolean n(int i10, long j10, long j11) {
            long j12 = i(i10).f6755c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public interface y {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private class z extends j {
        z() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.s(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f6651i0.f6702g = true;
            recyclerView.b1(true);
            if (RecyclerView.this.f6642e.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i10, int i11, Object obj) {
            RecyclerView.this.s(null);
            if (RecyclerView.this.f6642e.r(i10, i11, obj)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11) {
            RecyclerView.this.s(null);
            if (RecyclerView.this.f6642e.s(i10, i11)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11, int i12) {
            RecyclerView.this.s(null);
            if (RecyclerView.this.f6642e.t(i10, i11, i12)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11) {
            RecyclerView.this.s(null);
            if (RecyclerView.this.f6642e.u(i10, i11)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f6640d == null || (hVar = recyclerView.f6658m) == null || !hVar.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        void g() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f6672t && recyclerView.f6670s) {
                q0.e0(recyclerView, recyclerView.f6650i);
            } else {
                recyclerView.B = true;
                recyclerView.requestLayout();
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        L0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        M0 = new c();
        N0 = new d0();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void A0() {
        this.f6644f = new androidx.recyclerview.widget.f(new f());
    }

    private void C(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strS0 = s0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strS0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(q.class);
                try {
                    constructor = clsAsSubclass.getConstructor(L0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strS0, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((q) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strS0, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strS0, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strS0, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strS0, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strS0, e16);
            }
        }
    }

    private boolean E(int i10, int i11) {
        b0(this.f6667q0);
        int[] iArr = this.f6667q0;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    private boolean G0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || Y(view2) == null) {
            return false;
        }
        if (view == null || Y(view) == null) {
            return true;
        }
        this.f6652j.set(0, 0, view.getWidth(), view.getHeight());
        this.f6654k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f6652j);
        offsetDescendantRectToMyCoords(view2, this.f6654k);
        byte b10 = -1;
        int i12 = this.f6660n.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.f6652j;
        int i13 = rect.left;
        Rect rect2 = this.f6654k;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            b10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                b10 = 0;
            }
        }
        if (i10 == 1) {
            return b10 < 0 || (b10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return b10 > 0 || (b10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return b10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return b10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + W());
    }

    private void H() {
        int i10 = this.A;
        this.A = 0;
        if (i10 == 0 || !E0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        o0.b.b(accessibilityEventObtain, i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void H1(int i10) {
        boolean zCanScrollHorizontally = this.f6660n.canScrollHorizontally();
        int i11 = zCanScrollHorizontally;
        if (this.f6660n.canScrollVertically()) {
            i11 = (zCanScrollHorizontally ? 1 : 0) | 2;
        }
        G1(i11, i10);
    }

    private boolean I1(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            androidx.core.widget.d.d(this.J, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            androidx.core.widget.d.d(this.L, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null && androidx.core.widget.d.b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            androidx.core.widget.d.d(this.K, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.M;
        if (edgeEffect4 == null || androidx.core.widget.d.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z10;
        }
        androidx.core.widget.d.d(this.M, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void J() {
        this.f6651i0.a(1);
        X(this.f6651i0);
        this.f6651i0.f6705j = false;
        F1();
        this.f6646g.f();
        S0();
        a1();
        r1();
        c0 c0Var = this.f6651i0;
        c0Var.f6704i = c0Var.f6706k && this.f6659m0;
        this.f6659m0 = false;
        this.f6657l0 = false;
        c0Var.f6703h = c0Var.f6707l;
        c0Var.f6701f = this.f6658m.getItemCount();
        b0(this.f6667q0);
        if (this.f6651i0.f6706k) {
            int iG = this.f6644f.g();
            for (int i10 = 0; i10 < iG; i10++) {
                g0 g0VarP0 = p0(this.f6644f.f(i10));
                if (!g0VarP0.shouldIgnore() && (!g0VarP0.isInvalid() || this.f6658m.hasStableIds())) {
                    this.f6646g.e(g0VarP0, this.N.t(this.f6651i0, g0VarP0, n.e(g0VarP0), g0VarP0.getUnmodifiedPayloads()));
                    if (this.f6651i0.f6704i && g0VarP0.isUpdated() && !g0VarP0.isRemoved() && !g0VarP0.shouldIgnore() && !g0VarP0.isInvalid()) {
                        this.f6646g.c(l0(g0VarP0), g0VarP0);
                    }
                }
            }
        }
        if (this.f6651i0.f6707l) {
            s1();
            c0 c0Var2 = this.f6651i0;
            boolean z10 = c0Var2.f6702g;
            c0Var2.f6702g = false;
            this.f6660n.onLayoutChildren(this.f6638c, c0Var2);
            this.f6651i0.f6702g = z10;
            for (int i11 = 0; i11 < this.f6644f.g(); i11++) {
                g0 g0VarP1 = p0(this.f6644f.f(i11));
                if (!g0VarP1.shouldIgnore() && !this.f6646g.i(g0VarP1)) {
                    int iE = n.e(g0VarP1);
                    boolean zHasAnyOfTheFlags = g0VarP1.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iE |= 4096;
                    }
                    n.b bVarT = this.N.t(this.f6651i0, g0VarP1, iE, g0VarP1.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        d1(g0VarP1, bVarT);
                    } else {
                        this.f6646g.a(g0VarP1, bVarT);
                    }
                }
            }
            w();
        } else {
            w();
        }
        T0();
        J1(false);
        this.f6651i0.f6700e = 2;
    }

    private void K() {
        F1();
        S0();
        this.f6651i0.a(6);
        this.f6642e.j();
        this.f6651i0.f6701f = this.f6658m.getItemCount();
        this.f6651i0.f6699d = 0;
        if (this.f6640d != null && this.f6658m.canRestoreState()) {
            Parcelable parcelable = this.f6640d.f6687c;
            if (parcelable != null) {
                this.f6660n.onRestoreInstanceState(parcelable);
            }
            this.f6640d = null;
        }
        c0 c0Var = this.f6651i0;
        c0Var.f6703h = false;
        this.f6660n.onLayoutChildren(this.f6638c, c0Var);
        c0 c0Var2 = this.f6651i0;
        c0Var2.f6702g = false;
        c0Var2.f6706k = c0Var2.f6706k && this.N != null;
        c0Var2.f6700e = 4;
        T0();
        J1(false);
    }

    private void K0(int i10, int i11, MotionEvent motionEvent, int i12) {
        q qVar = this.f6660n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f6682y) {
            return;
        }
        int[] iArr = this.f6675u0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = qVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.f6660n.canScrollVertically();
        int i13 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iG1 = i10 - g1(i10, height);
        int iH1 = i11 - h1(i11, width);
        G1(i13, i12);
        if (M(zCanScrollHorizontally ? iG1 : 0, zCanScrollVertically ? iH1 : 0, this.f6675u0, this.f6671s0, i12)) {
            int[] iArr2 = this.f6675u0;
            iG1 -= iArr2[0];
            iH1 -= iArr2[1];
        }
        t1(zCanScrollHorizontally ? iG1 : 0, zCanScrollVertically ? iH1 : 0, motionEvent, i12);
        androidx.recyclerview.widget.l lVar = this.f6647g0;
        if (lVar != null && (iG1 != 0 || iH1 != 0)) {
            lVar.f(this, iG1, iH1);
        }
        K1(i12);
    }

    private void L() {
        RecyclerView recyclerView;
        this.f6651i0.a(4);
        F1();
        S0();
        c0 c0Var = this.f6651i0;
        c0Var.f6700e = 1;
        if (c0Var.f6706k) {
            for (int iG = this.f6644f.g() - 1; iG >= 0; iG--) {
                g0 g0VarP0 = p0(this.f6644f.f(iG));
                if (!g0VarP0.shouldIgnore()) {
                    long jL0 = l0(g0VarP0);
                    n.b bVarS = this.N.s(this.f6651i0, g0VarP0);
                    g0 g0VarG = this.f6646g.g(jL0);
                    if (g0VarG == null || g0VarG.shouldIgnore()) {
                        this.f6646g.d(g0VarP0, bVarS);
                    } else {
                        boolean zH = this.f6646g.h(g0VarG);
                        boolean zH2 = this.f6646g.h(g0VarP0);
                        if (zH && g0VarG == g0VarP0) {
                            this.f6646g.d(g0VarP0, bVarS);
                        } else {
                            n.b bVarN = this.f6646g.n(g0VarG);
                            this.f6646g.d(g0VarP0, bVarS);
                            n.b bVarM = this.f6646g.m(g0VarP0);
                            if (bVarN == null) {
                                v0(jL0, g0VarP0, g0VarG);
                            } else {
                                p(g0VarG, g0VarP0, bVarN, bVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.f6646g.o(recyclerView.B0);
        } else {
            recyclerView = this;
        }
        recyclerView.f6660n.removeAndRecycleScrapInt(recyclerView.f6638c);
        c0 c0Var2 = recyclerView.f6651i0;
        c0Var2.f6698c = c0Var2.f6701f;
        recyclerView.E = false;
        recyclerView.F = false;
        c0Var2.f6706k = false;
        c0Var2.f6707l = false;
        recyclerView.f6660n.mRequestedSimpleAnimations = false;
        ArrayList arrayList = recyclerView.f6638c.f6758b;
        if (arrayList != null) {
            arrayList.clear();
        }
        q qVar = recyclerView.f6660n;
        if (qVar.mPrefetchMaxObservedInInitialPrefetch) {
            qVar.mPrefetchMaxCountObserved = 0;
            qVar.mPrefetchMaxObservedInInitialPrefetch = false;
            recyclerView.f6638c.P();
        }
        recyclerView.f6660n.onLayoutCompleted(recyclerView.f6651i0);
        T0();
        J1(false);
        recyclerView.f6646g.f();
        int[] iArr = recyclerView.f6667q0;
        if (E(iArr[0], iArr[1])) {
            P(0, 0);
        }
        e1();
        p1();
    }

    private void M1() {
        this.f6645f0.f();
        q qVar = this.f6660n;
        if (qVar != null) {
            qVar.stopSmoothScroller();
        }
    }

    private boolean R(MotionEvent motionEvent) {
        u uVar = this.f6668r;
        if (uVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return a0(motionEvent);
        }
        uVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f6668r = null;
        }
        return true;
    }

    private void V0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.P) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.P = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.T = x10;
            this.R = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.U = y10;
            this.S = y10;
        }
    }

    private boolean Z0() {
        return this.N != null && this.f6660n.supportsPredictiveItemAnimations();
    }

    private boolean a0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f6666q.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = (u) this.f6666q.get(i10);
            if (uVar.b(this, motionEvent) && action != 3) {
                this.f6668r = uVar;
                return true;
            }
        }
        return false;
    }

    private void a1() {
        boolean z10;
        if (this.E) {
            this.f6642e.y();
            if (this.F) {
                this.f6660n.onItemsChanged(this);
            }
        }
        if (Z0()) {
            this.f6642e.w();
        } else {
            this.f6642e.j();
        }
        boolean z11 = this.f6657l0 || this.f6659m0;
        this.f6651i0.f6706k = this.f6676v && this.N != null && ((z10 = this.E) || z11 || this.f6660n.mRequestedSimpleAnimations) && (!z10 || this.f6658m.hasStableIds());
        c0 c0Var = this.f6651i0;
        c0Var.f6707l = c0Var.f6706k && z11 && !this.E && Z0();
    }

    private void b0(int[] iArr) {
        int iG = this.f6644f.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iG; i12++) {
            g0 g0VarP0 = p0(this.f6644f.f(i12));
            if (!g0VarP0.shouldIgnore()) {
                int layoutPosition = g0VarP0.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    static RecyclerView c0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewC0 = c0(viewGroup.getChildAt(i10));
            if (recyclerViewC0 != null) {
                return recyclerViewC0;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    private void c1(float f10, float f11, float f12, float f13) {
        boolean z10;
        boolean z11 = true;
        if (f11 >= 0.0f) {
            if (f11 > 0.0f) {
                U();
                androidx.core.widget.d.d(this.L, f11 / getWidth(), f12 / getHeight());
            } else {
                z10 = false;
            }
            if (f13 < 0.0f) {
                V();
                androidx.core.widget.d.d(this.K, (-f13) / getHeight(), f10 / getWidth());
            } else if (f13 > 0.0f) {
                S();
                androidx.core.widget.d.d(this.M, f13 / getHeight(), 1.0f - (f10 / getWidth()));
            } else {
                z11 = z10;
            }
            if (z11 && f11 == 0.0f && f13 == 0.0f) {
                return;
            }
            postInvalidateOnAnimation();
        }
        T();
        androidx.core.widget.d.d(this.J, (-f11) / getWidth(), 1.0f - (f12 / getHeight()));
        z10 = true;
        if (f13 < 0.0f) {
            V();
            androidx.core.widget.d.d(this.K, (-f13) / getHeight(), f10 / getWidth());
        } else if (f13 > 0.0f) {
            S();
            androidx.core.widget.d.d(this.M, f13 / getHeight(), 1.0f - (f10 / getWidth()));
        } else {
            z11 = z10;
        }
        if (z11) {
        }
        postInvalidateOnAnimation();
    }

    private View d0() {
        g0 g0VarE0;
        c0 c0Var = this.f6651i0;
        int i10 = c0Var.f6708m;
        if (i10 == -1) {
            i10 = 0;
        }
        int iB = c0Var.b();
        for (int i11 = i10; i11 < iB; i11++) {
            g0 g0VarE1 = e0(i11);
            if (g0VarE1 == null) {
                break;
            }
            if (g0VarE1.itemView.hasFocusable()) {
                return g0VarE1.itemView;
            }
        }
        int iMin = Math.min(iB, i10);
        do {
            iMin--;
            if (iMin < 0 || (g0VarE0 = e0(iMin)) == null) {
                return null;
            }
        } while (!g0VarE0.itemView.hasFocusable());
        return g0VarE0.itemView;
    }

    private void e1() {
        View viewFindViewById;
        if (!this.f6643e0 || this.f6658m == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            if (!this.f6644f.n(getFocusedChild())) {
                return;
            }
        }
        View viewD0 = null;
        g0 g0VarF0 = (this.f6651i0.f6709n == -1 || !this.f6658m.hasStableIds()) ? null : f0(this.f6651i0.f6709n);
        if (g0VarF0 != null && !this.f6644f.n(g0VarF0.itemView) && g0VarF0.itemView.hasFocusable()) {
            viewD0 = g0VarF0.itemView;
        } else if (this.f6644f.g() > 0) {
            viewD0 = d0();
        }
        if (viewD0 != null) {
            int i10 = this.f6651i0.f6710o;
            if (i10 != -1 && (viewFindViewById = viewD0.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                viewD0 = viewFindViewById;
            }
            viewD0.requestFocus();
        }
    }

    private void f1() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.J.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    private int g1(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.J;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.L;
            if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.L.onRelease();
                } else {
                    float fD = androidx.core.widget.d.d(this.L, width, height);
                    if (androidx.core.widget.d.b(this.L) == 0.0f) {
                        this.L.onRelease();
                    }
                    f11 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.J.onRelease();
            } else {
                float f12 = -androidx.core.widget.d.d(this.J, -width, 1.0f - height);
                if (androidx.core.widget.d.b(this.J) == 0.0f) {
                    this.J.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    private n0.x getScrollingChildHelper() {
        if (this.f6669r0 == null) {
            this.f6669r0 = new n0.x(this);
        }
        return this.f6669r0;
    }

    private int h1(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.K;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.M;
            if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.M.onRelease();
                } else {
                    float fD = androidx.core.widget.d.d(this.M, height, 1.0f - width);
                    if (androidx.core.widget.d.b(this.M) == 0.0f) {
                        this.M.onRelease();
                    }
                    f11 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.K.onRelease();
            } else {
                float f12 = -androidx.core.widget.d.d(this.K, -height, width);
                if (androidx.core.widget.d.b(this.K) == 0.0f) {
                    this.K.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    private void i(g0 g0Var) {
        View view = g0Var.itemView;
        boolean z10 = view.getParent() == this;
        this.f6638c.O(o0(view));
        if (g0Var.isTmpDetached()) {
            this.f6644f.c(view, -1, view.getLayoutParams(), true);
        } else if (z10) {
            this.f6644f.k(view);
        } else {
            this.f6644f.b(view, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    private boolean i0(int i10, int i11, int i12, int i13) {
        int iMax;
        int i14;
        q qVar = this.f6660n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f6682y) {
            return false;
        }
        boolean zCanScrollHorizontally = qVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.f6660n.canScrollVertically();
        if (!zCanScrollHorizontally || Math.abs(i10) < i12) {
            i10 = 0;
        }
        if (!zCanScrollVertically || Math.abs(i11) < i12) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        if (i10 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.J;
            if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.L;
                if (edgeEffect2 == null || androidx.core.widget.d.b(edgeEffect2) == 0.0f) {
                    iMax = 0;
                } else if (y1(this.L, i10, getWidth())) {
                    this.L.onAbsorb(i10);
                    i10 = 0;
                }
            } else {
                int i15 = -i10;
                if (y1(this.J, i15, getWidth())) {
                    this.J.onAbsorb(i15);
                    i10 = 0;
                }
            }
            iMax = i10;
            i10 = 0;
        }
        if (i11 == 0) {
            i14 = i11;
            i11 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.K;
            if (edgeEffect3 == null || androidx.core.widget.d.b(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.M;
                if (edgeEffect4 == null || androidx.core.widget.d.b(edgeEffect4) == 0.0f) {
                    i14 = i11;
                    i11 = 0;
                } else if (y1(this.M, i11, getHeight())) {
                    this.M.onAbsorb(i11);
                    i11 = 0;
                }
            } else {
                int i16 = -i11;
                if (y1(this.K, i16, getHeight())) {
                    this.K.onAbsorb(i16);
                    i11 = 0;
                }
            }
            i14 = 0;
        }
        if (iMax != 0 || i11 != 0) {
            int i17 = -i13;
            iMax = Math.max(i17, Math.min(iMax, i13));
            i11 = Math.max(i17, Math.min(i11, i13));
            H1(1);
            this.f6645f0.b(iMax, i11);
        }
        if (i10 == 0 && i14 == 0) {
            return (iMax == 0 && i11 == 0) ? false : true;
        }
        float f10 = i10;
        float f11 = i14;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = zCanScrollHorizontally || zCanScrollVertically;
            dispatchNestedFling(f10, f11, z10);
            t tVar = this.W;
            if (tVar != null && tVar.onFling(i10, i14)) {
                return true;
            }
            if (z10) {
                H1(1);
                int i18 = -i13;
                this.f6645f0.b(Math.max(i18, Math.min(i10, i13)), Math.max(i18, Math.min(i14, i13)));
                return true;
            }
        }
        return false;
    }

    private void o1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f6652j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof r) {
            r rVar = (r) layoutParams;
            if (!rVar.f6748c) {
                Rect rect = rVar.f6747b;
                Rect rect2 = this.f6652j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f6652j);
            offsetRectIntoDescendantCoords(view, this.f6652j);
        }
        this.f6660n.requestChildRectangleOnScreen(this, view, this.f6652j, !this.f6676v, view2 == null);
    }

    private void p(g0 g0Var, g0 g0Var2, n.b bVar, n.b bVar2, boolean z10, boolean z11) {
        g0Var.setIsRecyclable(false);
        if (z10) {
            i(g0Var);
        }
        if (g0Var != g0Var2) {
            if (z11) {
                i(g0Var2);
            }
            g0Var.mShadowedHolder = g0Var2;
            i(g0Var);
            this.f6638c.O(g0Var);
            g0Var2.setIsRecyclable(false);
            g0Var2.mShadowingHolder = g0Var;
        }
        if (this.N.b(g0Var, g0Var2, bVar, bVar2)) {
            Y0();
        }
    }

    static g0 p0(View view) {
        if (view == null) {
            return null;
        }
        return ((r) view.getLayoutParams()).f6746a;
    }

    private void p1() {
        c0 c0Var = this.f6651i0;
        c0Var.f6709n = -1L;
        c0Var.f6708m = -1;
        c0Var.f6710o = -1;
    }

    static void q0(View view, Rect rect) {
        r rVar = (r) view.getLayoutParams();
        Rect rect2 = rVar.f6747b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) rVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) rVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin);
    }

    private void q1() {
        VelocityTracker velocityTracker = this.Q;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        K1(0);
        f1();
    }

    private int r0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private void r1() {
        int absoluteAdapterPosition;
        View focusedChild = (this.f6643e0 && hasFocus() && this.f6658m != null) ? getFocusedChild() : null;
        g0 g0VarZ = focusedChild != null ? Z(focusedChild) : null;
        if (g0VarZ == null) {
            p1();
            return;
        }
        this.f6651i0.f6709n = this.f6658m.hasStableIds() ? g0VarZ.getItemId() : -1L;
        c0 c0Var = this.f6651i0;
        if (this.E) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = g0VarZ.isRemoved() ? g0VarZ.mOldPosition : g0VarZ.getAbsoluteAdapterPosition();
        }
        c0Var.f6708m = absoluteAdapterPosition;
        this.f6651i0.f6710o = r0(g0VarZ.itemView);
    }

    private String s0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        E0 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        F0 = z10;
    }

    private void u() {
        q1();
        setScrollState(0);
    }

    private float u0(int i10) {
        double dLog = Math.log((Math.abs(i10) * 0.35f) / (this.f6634a * 0.015f));
        float f10 = H0;
        return (float) (((double) (this.f6634a * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * dLog));
    }

    static void v(g0 g0Var) {
        WeakReference<RecyclerView> weakReference = g0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == g0Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            g0Var.mNestedRecyclerView = null;
        }
    }

    private void v0(long j10, g0 g0Var, g0 g0Var2) {
        int iG = this.f6644f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            g0 g0VarP0 = p0(this.f6644f.f(i10));
            if (g0VarP0 != g0Var && l0(g0VarP0) == j10) {
                h hVar = this.f6658m;
                if (hVar == null || !hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + g0VarP0 + " \n View Holder 2:" + g0Var + W());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + g0VarP0 + " \n View Holder 2:" + g0Var + W());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + g0Var2 + " cannot be found but it is necessary for " + g0Var + W());
    }

    private void w1(h hVar, boolean z10, boolean z11) {
        h hVar2 = this.f6658m;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.f6636b);
            this.f6658m.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            i1();
        }
        this.f6642e.y();
        h hVar3 = this.f6658m;
        this.f6658m = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f6636b);
            hVar.onAttachedToRecyclerView(this);
        }
        q qVar = this.f6660n;
        if (qVar != null) {
            qVar.onAdapterChanged(hVar3, this.f6658m);
        }
        this.f6638c.y(hVar3, this.f6658m, z10);
        this.f6651i0.f6702g = true;
    }

    private boolean x0() {
        int iG = this.f6644f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            g0 g0VarP0 = p0(this.f6644f.f(i10));
            if (g0VarP0 != null && !g0VarP0.shouldIgnore() && g0VarP0.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private boolean y1(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        return u0(-i10) < androidx.core.widget.d.b(edgeEffect) * ((float) i11);
    }

    private int z(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && androidx.core.widget.d.b(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i11) / 4.0f) * androidx.core.widget.d.d(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || androidx.core.widget.d.b(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round((f10 / 4.0f) * androidx.core.widget.d.d(edgeEffect2, (i10 * 4.0f) / f10, 0.5f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    private void z0() {
        if (q0.A(this) == 0) {
            q0.v0(this, 8);
        }
    }

    int A(int i10) {
        return z(i10, this.K, this.M, getHeight());
    }

    public void A1(int i10, int i11) {
        B1(i10, i11, null);
    }

    void B() {
        if (!this.f6676v || this.E) {
            Trace.beginSection("RV FullInvalidate");
            I();
            Trace.endSection();
            return;
        }
        if (this.f6642e.p()) {
            if (!this.f6642e.o(4) || this.f6642e.o(11)) {
                if (this.f6642e.p()) {
                    Trace.beginSection("RV FullInvalidate");
                    I();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            F1();
            S0();
            this.f6642e.w();
            if (!this.f6680x) {
                if (x0()) {
                    I();
                } else {
                    this.f6642e.i();
                }
            }
            J1(true);
            T0();
            Trace.endSection();
        }
    }

    void B0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.k(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(androidx.recyclerview.R.dimen.fastscroll_margin));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + W());
        }
    }

    public void B1(int i10, int i11, Interpolator interpolator) {
        C1(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    void C0() {
        this.M = null;
        this.K = null;
        this.L = null;
        this.J = null;
    }

    public void C1(int i10, int i11, Interpolator interpolator, int i12) {
        D1(i10, i11, interpolator, i12, false);
    }

    void D(int i10, int i11) {
        setMeasuredDimension(q.chooseSize(i10, getPaddingLeft() + getPaddingRight(), q0.D(this)), q.chooseSize(i11, getPaddingTop() + getPaddingBottom(), q0.C(this)));
    }

    public void D0() {
        if (this.f6664p.size() == 0) {
            return;
        }
        q qVar = this.f6660n;
        if (qVar != null) {
            qVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        I0();
        requestLayout();
    }

    void D1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        q qVar = this.f6660n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f6682y) {
            return;
        }
        if (!qVar.canScrollHorizontally()) {
            i10 = 0;
        }
        if (!this.f6660n.canScrollVertically()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            G1(i13, 1);
        }
        this.f6645f0.e(i10, i11, i12, interpolator);
    }

    boolean E0() {
        AccessibilityManager accessibilityManager = this.C;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void E1(int i10) {
        if (this.f6682y) {
            return;
        }
        q qVar = this.f6660n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            qVar.smoothScrollToPosition(this, this.f6651i0, i10);
        }
    }

    void F(View view) {
        g0 g0VarP0 = p0(view);
        Q0(view);
        h hVar = this.f6658m;
        if (hVar != null && g0VarP0 != null) {
            hVar.onViewAttachedToWindow(g0VarP0);
        }
        List list = this.D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.D.get(size)).b(view);
            }
        }
    }

    public boolean F0() {
        return this.G > 0;
    }

    void F1() {
        int i10 = this.f6678w + 1;
        this.f6678w = i10;
        if (i10 != 1 || this.f6682y) {
            return;
        }
        this.f6680x = false;
    }

    void G(View view) {
        g0 g0VarP0 = p0(view);
        R0(view);
        h hVar = this.f6658m;
        if (hVar != null && g0VarP0 != null) {
            hVar.onViewDetachedFromWindow(g0VarP0);
        }
        List list = this.D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.D.get(size)).a(view);
            }
        }
    }

    public boolean G1(int i10, int i11) {
        return getScrollingChildHelper().p(i10, i11);
    }

    void H0(int i10) {
        if (this.f6660n == null) {
            return;
        }
        setScrollState(2);
        this.f6660n.scrollToPosition(i10);
        awakenScrollBars();
    }

    void I() {
        if (this.f6658m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f6660n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f6651i0.f6705j = false;
        boolean z10 = this.f6681x0 && !(this.f6683y0 == getWidth() && this.f6685z0 == getHeight());
        this.f6683y0 = 0;
        this.f6685z0 = 0;
        this.f6681x0 = false;
        if (this.f6651i0.f6700e == 1) {
            J();
            this.f6660n.setExactMeasureSpecsFrom(this);
            K();
        } else if (this.f6642e.q() || z10 || this.f6660n.getWidth() != getWidth() || this.f6660n.getHeight() != getHeight()) {
            this.f6660n.setExactMeasureSpecsFrom(this);
            K();
        } else {
            this.f6660n.setExactMeasureSpecsFrom(this);
        }
        L();
    }

    void I0() {
        int iJ = this.f6644f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            ((r) this.f6644f.i(i10).getLayoutParams()).f6748c = true;
        }
        this.f6638c.s();
    }

    void J0() {
        int iJ = this.f6644f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            g0 g0VarP0 = p0(this.f6644f.i(i10));
            if (g0VarP0 != null && !g0VarP0.shouldIgnore()) {
                g0VarP0.addFlags(6);
            }
        }
        I0();
        this.f6638c.t();
    }

    void J1(boolean z10) {
        if (this.f6678w < 1) {
            if (E0) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + W());
            }
            this.f6678w = 1;
        }
        if (!z10 && !this.f6682y) {
            this.f6680x = false;
        }
        if (this.f6678w == 1) {
            if (z10 && this.f6680x && !this.f6682y && this.f6660n != null && this.f6658m != null) {
                I();
            }
            if (!this.f6682y) {
                this.f6680x = false;
            }
        }
        this.f6678w--;
    }

    public void K1(int i10) {
        getScrollingChildHelper().r(i10);
    }

    public void L0(int i10) {
        int iG = this.f6644f.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f6644f.f(i11).offsetLeftAndRight(i10);
        }
    }

    public void L1() {
        setScrollState(0);
        M1();
    }

    public boolean M(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public void M0(int i10) {
        int iG = this.f6644f.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f6644f.f(i11).offsetTopAndBottom(i10);
        }
    }

    public final void N(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    void N0(int i10, int i11) {
        int iJ = this.f6644f.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            g0 g0VarP0 = p0(this.f6644f.i(i12));
            if (g0VarP0 != null && !g0VarP0.shouldIgnore() && g0VarP0.mPosition >= i10) {
                if (F0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i12 + " holder " + g0VarP0 + " now at position " + (g0VarP0.mPosition + i11));
                }
                g0VarP0.offsetPosition(i11, false);
                this.f6651i0.f6702g = true;
            }
        }
        this.f6638c.v(i10, i11);
        requestLayout();
    }

    void N1(int i10, int i11, Object obj) {
        int i12;
        int iJ = this.f6644f.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < iJ; i14++) {
            View viewI = this.f6644f.i(i14);
            g0 g0VarP0 = p0(viewI);
            if (g0VarP0 != null && !g0VarP0.shouldIgnore() && (i12 = g0VarP0.mPosition) >= i10 && i12 < i13) {
                g0VarP0.addFlags(2);
                g0VarP0.addChangePayload(obj);
                ((r) viewI.getLayoutParams()).f6748c = true;
            }
        }
        this.f6638c.R(i10, i11);
    }

    void O(int i10) {
        q qVar = this.f6660n;
        if (qVar != null) {
            qVar.onScrollStateChanged(i10);
        }
        W0(i10);
        v vVar = this.f6653j0;
        if (vVar != null) {
            vVar.onScrollStateChanged(this, i10);
        }
        List list = this.f6655k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((v) this.f6655k0.get(size)).onScrollStateChanged(this, i10);
            }
        }
    }

    void O0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iJ = this.f6644f.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < iJ; i16++) {
            g0 g0VarP0 = p0(this.f6644f.i(i16));
            if (g0VarP0 != null && (i15 = g0VarP0.mPosition) >= i13 && i15 <= i12) {
                if (F0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i16 + " holder " + g0VarP0);
                }
                if (g0VarP0.mPosition == i10) {
                    g0VarP0.offsetPosition(i11 - i10, false);
                } else {
                    g0VarP0.offsetPosition(i14, false);
                }
                this.f6651i0.f6702g = true;
            }
        }
        this.f6638c.w(i10, i11);
        requestLayout();
    }

    void P(int i10, int i11) {
        this.H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        X0(i10, i11);
        v vVar = this.f6653j0;
        if (vVar != null) {
            vVar.onScrolled(this, i10, i11);
        }
        List list = this.f6655k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((v) this.f6655k0.get(size)).onScrolled(this, i10, i11);
            }
        }
        this.H--;
    }

    void P0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iJ = this.f6644f.j();
        for (int i13 = 0; i13 < iJ; i13++) {
            g0 g0VarP0 = p0(this.f6644f.i(i13));
            if (g0VarP0 != null && !g0VarP0.shouldIgnore()) {
                int i14 = g0VarP0.mPosition;
                if (i14 >= i12) {
                    if (F0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + g0VarP0 + " now at position " + (g0VarP0.mPosition - i11));
                    }
                    g0VarP0.offsetPosition(-i11, z10);
                    this.f6651i0.f6702g = true;
                } else if (i14 >= i10) {
                    if (F0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + g0VarP0 + " now REMOVED");
                    }
                    g0VarP0.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.f6651i0.f6702g = true;
                }
            }
        }
        this.f6638c.x(i10, i11, z10);
        requestLayout();
    }

    void Q() {
        int i10;
        for (int size = this.f6677v0.size() - 1; size >= 0; size--) {
            g0 g0Var = (g0) this.f6677v0.get(size);
            if (g0Var.itemView.getParent() == this && !g0Var.shouldIgnore() && (i10 = g0Var.mPendingAccessibilityState) != -1) {
                g0Var.itemView.setImportantForAccessibility(i10);
                g0Var.mPendingAccessibilityState = -1;
            }
        }
        this.f6677v0.clear();
    }

    public void Q0(View view) {
    }

    public void R0(View view) {
    }

    void S() {
        if (this.M != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.I.a(this, 3);
        this.M = edgeEffectA;
        if (this.f6648h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void S0() {
        this.G++;
    }

    void T() {
        if (this.J != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.I.a(this, 0);
        this.J = edgeEffectA;
        if (this.f6648h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void T0() {
        U0(true);
    }

    void U() {
        if (this.L != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.I.a(this, 2);
        this.L = edgeEffectA;
        if (this.f6648h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void U0(boolean z10) {
        int i10 = this.G - 1;
        this.G = i10;
        if (i10 < 1) {
            if (E0 && i10 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + W());
            }
            this.G = 0;
            if (z10) {
                H();
                Q();
            }
        }
    }

    void V() {
        if (this.K != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.I.a(this, 1);
        this.K = edgeEffectA;
        if (this.f6648h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void W0(int i10) {
    }

    final void X(c0 c0Var) {
        if (getScrollState() != 2) {
            c0Var.f6711p = 0;
            c0Var.f6712q = 0;
        } else {
            OverScroller overScroller = this.f6645f0.f6718c;
            c0Var.f6711p = overScroller.getFinalX() - overScroller.getCurrX();
            c0Var.f6712q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public void X0(int i10, int i11) {
    }

    public View Y(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    void Y0() {
        if (this.f6663o0 || !this.f6670s) {
            return;
        }
        q0.e0(this, this.f6679w0);
        this.f6663o0 = true;
    }

    public g0 Z(View view) {
        View viewY = Y(view);
        if (viewY == null) {
            return null;
        }
        return o0(viewY);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        q qVar = this.f6660n;
        if (qVar == null || !qVar.onAddFocusables(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    void b(int i10, int i11) {
        if (i10 < 0) {
            T();
            if (this.J.isFinished()) {
                this.J.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            U();
            if (this.L.isFinished()) {
                this.L.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            V();
            if (this.K.isFinished()) {
                this.K.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            S();
            if (this.M.isFinished()) {
                this.M.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        postInvalidateOnAnimation();
    }

    void b1(boolean z10) {
        this.F = z10 | this.F;
        this.E = true;
        J0();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof r) && this.f6660n.checkLayoutParams((r) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        q qVar = this.f6660n;
        if (qVar != null && qVar.canScrollHorizontally()) {
            return this.f6660n.computeHorizontalScrollExtent(this.f6651i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        q qVar = this.f6660n;
        if (qVar != null && qVar.canScrollHorizontally()) {
            return this.f6660n.computeHorizontalScrollOffset(this.f6651i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        q qVar = this.f6660n;
        if (qVar != null && qVar.canScrollHorizontally()) {
            return this.f6660n.computeHorizontalScrollRange(this.f6651i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        q qVar = this.f6660n;
        if (qVar != null && qVar.canScrollVertically()) {
            return this.f6660n.computeVerticalScrollExtent(this.f6651i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        q qVar = this.f6660n;
        if (qVar != null && qVar.canScrollVertically()) {
            return this.f6660n.computeVerticalScrollOffset(this.f6651i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        q qVar = this.f6660n;
        if (qVar != null && qVar.canScrollVertically()) {
            return this.f6660n.computeVerticalScrollRange(this.f6651i0);
        }
        return 0;
    }

    void d1(g0 g0Var, n.b bVar) {
        g0Var.setFlags(0, 8192);
        if (this.f6651i0.f6704i && g0Var.isUpdated() && !g0Var.isRemoved() && !g0Var.shouldIgnore()) {
            this.f6646g.c(l0(g0Var), g0Var);
        }
        this.f6646g.e(g0Var, bVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        q layoutManager = getLayoutManager();
        int itemCount = 0;
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.canScrollVertically()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    C1(0, measuredHeight, null, Integer.MIN_VALUE);
                } else {
                    C1(0, -measuredHeight, null, Integer.MIN_VALUE);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean zIsLayoutReversed = layoutManager.isLayoutReversed();
                if (keyCode == 122) {
                    if (zIsLayoutReversed) {
                        itemCount = getAdapter().getItemCount();
                    }
                } else if (!zIsLayoutReversed) {
                    itemCount = getAdapter().getItemCount();
                }
                E1(itemCount);
                return true;
            }
        } else if (layoutManager.canScrollHorizontally()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    C1(measuredWidth, 0, null, Integer.MIN_VALUE);
                } else {
                    C1(-measuredWidth, 0, null, Integer.MIN_VALUE);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean zIsLayoutReversed2 = layoutManager.isLayoutReversed();
                if (keyCode2 == 122) {
                    if (zIsLayoutReversed2) {
                        itemCount = getAdapter().getItemCount();
                    }
                } else if (!zIsLayoutReversed2) {
                    itemCount = getAdapter().getItemCount();
                }
                E1(itemCount);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.f6664p.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f6664p.get(i10)).onDrawOver(canvas, this, this.f6651i0);
        }
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f6648h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.J;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f6648h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.K;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f6648h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.L;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f6648h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.M;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.N == null || this.f6664p.size() <= 0 || !this.N.p()) ? z10 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public g0 e0(int i10) {
        g0 g0Var = null;
        if (this.E) {
            return null;
        }
        int iJ = this.f6644f.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            g0 g0VarP0 = p0(this.f6644f.i(i11));
            if (g0VarP0 != null && !g0VarP0.isRemoved() && k0(g0VarP0) == i10) {
                if (!this.f6644f.n(g0VarP0.itemView)) {
                    return g0VarP0;
                }
                g0Var = g0VarP0;
            }
        }
        return g0Var;
    }

    public g0 f0(long j10) {
        h hVar = this.f6658m;
        g0 g0Var = null;
        if (hVar != null && hVar.hasStableIds()) {
            int iJ = this.f6644f.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                g0 g0VarP0 = p0(this.f6644f.i(i10));
                if (g0VarP0 != null && !g0VarP0.isRemoved() && g0VarP0.getItemId() == j10) {
                    if (!this.f6644f.n(g0VarP0.itemView)) {
                        return g0VarP0;
                    }
                    g0Var = g0VarP0;
                }
            }
        }
        return g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0043  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewOnFocusSearchFailed;
        boolean z10;
        View viewOnInterceptFocusSearch = this.f6660n.onInterceptFocusSearch(view, i10);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z11 = (this.f6658m == null || this.f6660n == null || F0() || this.f6682y) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.f6660n.canScrollVertically()) {
                if (focusFinder.findNextFocus(this, view, i10 == 2 ? 130 : 33) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.f6660n.canScrollHorizontally()) {
                z10 = focusFinder.findNextFocus(this, view, (this.f6660n.getLayoutDirection() == 1) ^ (i10 == 2) ? 66 : 17) == null;
            }
            if (z10) {
                B();
                if (Y(view) == null) {
                    return null;
                }
                F1();
                this.f6660n.onFocusSearchFailed(view, i10, this.f6638c, this.f6651i0);
                J1(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z11) {
                B();
                if (Y(view) == null) {
                    return null;
                }
                F1();
                viewOnFocusSearchFailed = this.f6660n.onFocusSearchFailed(view, i10, this.f6638c, this.f6651i0);
                J1(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed == null || viewOnFocusSearchFailed.hasFocusable()) {
            return G0(view, viewOnFocusSearchFailed, i10) ? viewOnFocusSearchFailed : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        o1(viewOnFocusSearchFailed, null);
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    g0 g0(int i10, boolean z10) {
        int iJ = this.f6644f.j();
        g0 g0Var = null;
        for (int i11 = 0; i11 < iJ; i11++) {
            g0 g0VarP0 = p0(this.f6644f.i(i11));
            if (g0VarP0 != null && !g0VarP0.isRemoved()) {
                if (z10) {
                    if (g0VarP0.mPosition != i10) {
                        continue;
                    } else {
                        if (this.f6644f.n(g0VarP0.itemView)) {
                            return g0VarP0;
                        }
                        g0Var = g0VarP0;
                    }
                } else if (g0VarP0.getLayoutPosition() != i10) {
                    continue;
                } else {
                    if (this.f6644f.n(g0VarP0.itemView)) {
                        return g0VarP0;
                    }
                    g0Var = g0VarP0;
                }
            }
        }
        return g0Var;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        q qVar = this.f6660n;
        if (qVar != null) {
            return qVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + W());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        q qVar = this.f6660n;
        if (qVar != null) {
            return qVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + W());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f6658m;
    }

    @Override // android.view.View
    public int getBaseline() {
        q qVar = this.f6660n;
        return qVar != null ? qVar.getBaseline() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f6648h;
    }

    public androidx.recyclerview.widget.u getCompatAccessibilityDelegate() {
        return this.f6665p0;
    }

    public m getEdgeEffectFactory() {
        return this.I;
    }

    public n getItemAnimator() {
        return this.N;
    }

    public int getItemDecorationCount() {
        return this.f6664p.size();
    }

    public q getLayoutManager() {
        return this.f6660n;
    }

    public int getMaxFlingVelocity() {
        return this.f6637b0;
    }

    public int getMinFlingVelocity() {
        return this.f6635a0;
    }

    long getNanoTime() {
        if (K0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public t getOnFlingListener() {
        return this.W;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f6643e0;
    }

    public w getRecycledViewPool() {
        return this.f6638c.i();
    }

    public int getScrollState() {
        return this.O;
    }

    public boolean h0(int i10, int i11) {
        return i0(i10, i11, this.f6635a0, this.f6637b0);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    void i1() {
        n nVar = this.N;
        if (nVar != null) {
            nVar.k();
        }
        q qVar = this.f6660n;
        if (qVar != null) {
            qVar.removeAndRecycleAllViews(this.f6638c);
            this.f6660n.removeAndRecycleScrapInt(this.f6638c);
        }
        this.f6638c.c();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f6670s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f6682y;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(p pVar) {
        k(pVar, -1);
    }

    boolean j0(int i10, int i11) {
        return i0(i10, i11, 0, Integer.MAX_VALUE);
    }

    boolean j1(View view) {
        F1();
        boolean zR = this.f6644f.r(view);
        if (zR) {
            g0 g0VarP0 = p0(view);
            this.f6638c.O(g0VarP0);
            this.f6638c.H(g0VarP0);
            if (F0) {
                Log.d("RecyclerView", "after removing animated view: " + view + ", " + this);
            }
        }
        J1(!zR);
        return zR;
    }

    public void k(p pVar, int i10) {
        q qVar = this.f6660n;
        if (qVar != null) {
            qVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f6664p.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f6664p.add(pVar);
        } else {
            this.f6664p.add(i10, pVar);
        }
        I0();
        requestLayout();
    }

    int k0(g0 g0Var) {
        if (g0Var.hasAnyOfTheFlags(524) || !g0Var.isBound()) {
            return -1;
        }
        return this.f6642e.e(g0Var.mPosition);
    }

    public void k1(p pVar) {
        q qVar = this.f6660n;
        if (qVar != null) {
            qVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.f6664p.remove(pVar);
        if (this.f6664p.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        I0();
        requestLayout();
    }

    public void l(s sVar) {
        if (this.D == null) {
            this.D = new ArrayList();
        }
        this.D.add(sVar);
    }

    long l0(g0 g0Var) {
        return this.f6658m.hasStableIds() ? g0Var.getItemId() : g0Var.mPosition;
    }

    public void l1(u uVar) {
        this.f6666q.remove(uVar);
        if (this.f6668r == uVar) {
            this.f6668r = null;
        }
    }

    public void m(u uVar) {
        this.f6666q.add(uVar);
    }

    public int m0(View view) {
        g0 g0VarP0 = p0(view);
        if (g0VarP0 != null) {
            return g0VarP0.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public void m1(v vVar) {
        List list = this.f6655k0;
        if (list != null) {
            list.remove(vVar);
        }
    }

    public void n(v vVar) {
        if (this.f6655k0 == null) {
            this.f6655k0 = new ArrayList();
        }
        this.f6655k0.add(vVar);
    }

    public int n0(View view) {
        g0 g0VarP0 = p0(view);
        if (g0VarP0 != null) {
            return g0VarP0.getLayoutPosition();
        }
        return -1;
    }

    void n1() {
        g0 g0Var;
        int iG = this.f6644f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            View viewF = this.f6644f.f(i10);
            g0 g0VarO0 = o0(viewF);
            if (g0VarO0 != null && (g0Var = g0VarO0.mShadowingHolder) != null) {
                View view = g0Var.itemView;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    void o(g0 g0Var, n.b bVar, n.b bVar2) {
        g0Var.setIsRecyclable(false);
        if (this.N.a(g0Var, bVar, bVar2)) {
            Y0();
        }
    }

    public g0 o0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return p0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.G = 0;
        this.f6670s = true;
        this.f6676v = this.f6676v && !isLayoutRequested();
        this.f6638c.z();
        q qVar = this.f6660n;
        if (qVar != null) {
            qVar.dispatchAttachedToWindow(this);
        }
        this.f6663o0 = false;
        if (K0) {
            ThreadLocal threadLocal = androidx.recyclerview.widget.l.f7013e;
            androidx.recyclerview.widget.l lVar = (androidx.recyclerview.widget.l) threadLocal.get();
            this.f6647g0 = lVar;
            if (lVar == null) {
                this.f6647g0 = new androidx.recyclerview.widget.l();
                Display displayV = q0.v(this);
                if (isInEditMode() || displayV == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = displayV.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                androidx.recyclerview.widget.l lVar2 = this.f6647g0;
                lVar2.f7017c = (long) (1.0E9f / refreshRate);
                threadLocal.set(lVar2);
            }
            this.f6647g0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.l lVar;
        super.onDetachedFromWindow();
        n nVar = this.N;
        if (nVar != null) {
            nVar.k();
        }
        L1();
        this.f6670s = false;
        q qVar = this.f6660n;
        if (qVar != null) {
            qVar.dispatchDetachedFromWindow(this, this.f6638c);
        }
        this.f6677v0.clear();
        removeCallbacks(this.f6679w0);
        this.f6646g.j();
        this.f6638c.A();
        t0.a.b(this);
        if (!K0 || (lVar = this.f6647g0) == null) {
            return;
        }
        lVar.j(this);
        this.f6647g0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f6664p.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f6664p.get(i10)).onDraw(canvas, this, this.f6651i0);
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        float axisValue;
        RecyclerView recyclerView;
        if (this.f6660n != null && !this.f6682y && motionEvent.getAction() == 8) {
            float f10 = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f11 = this.f6660n.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                z10 = false;
                axisValue = this.f6660n.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
                f10 = f11;
                i10 = 0;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i10 = 26;
                axisValue = motionEvent.getAxisValue(26);
                if (this.f6660n.canScrollVertically()) {
                    float f12 = -axisValue;
                    axisValue = 0.0f;
                    f10 = f12;
                } else if (!this.f6660n.canScrollHorizontally()) {
                    axisValue = 0.0f;
                }
                z10 = this.A0;
            } else {
                i10 = 0;
                z10 = false;
                axisValue = 0.0f;
            }
            int i11 = (int) (f10 * this.f6641d0);
            int i12 = (int) (axisValue * this.f6639c0);
            if (z10) {
                OverScroller overScroller = this.f6645f0.f6718c;
                recyclerView = this;
                recyclerView.D1(i12 + (overScroller.getFinalX() - overScroller.getCurrX()), i11 + (overScroller.getFinalY() - overScroller.getCurrY()), null, Integer.MIN_VALUE, true);
            } else {
                recyclerView = this;
                K0(i12, i11, motionEvent, 1);
            }
            if (i10 != 0 && !z10) {
                recyclerView.D0.g(motionEvent, i10);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f6682y) {
            return false;
        }
        this.f6668r = null;
        if (a0(motionEvent)) {
            u();
            return true;
        }
        q qVar = this.f6660n;
        if (qVar == null) {
            return false;
        }
        boolean zCanScrollHorizontally = qVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.f6660n.canScrollVertically();
        if (this.Q == null) {
            this.Q = VelocityTracker.obtain();
        }
        this.Q.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f6684z) {
                this.f6684z = false;
            }
            this.P = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.T = x10;
            this.R = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.U = y10;
            this.S = y10;
            if (I1(motionEvent) || this.O == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                K1(1);
            }
            int[] iArr = this.f6673t0;
            iArr[1] = 0;
            iArr[0] = 0;
            H1(0);
        } else if (actionMasked == 1) {
            this.Q.clear();
            K1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.P);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.P + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.O != 1) {
                int i10 = x11 - this.R;
                int i11 = y11 - this.S;
                if (!zCanScrollHorizontally || Math.abs(i10) <= this.V) {
                    z10 = false;
                } else {
                    this.T = x11;
                    z10 = true;
                }
                if (zCanScrollVertically && Math.abs(i11) > this.V) {
                    this.U = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            u();
        } else if (actionMasked == 5) {
            this.P = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.T = x12;
            this.R = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.U = y12;
            this.S = y12;
        } else if (actionMasked == 6) {
            V0(motionEvent);
        }
        return this.O == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Trace.beginSection("RV OnLayout");
        I();
        Trace.endSection();
        this.f6676v = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        q qVar = this.f6660n;
        if (qVar == null) {
            D(i10, i11);
            return;
        }
        boolean z10 = false;
        if (qVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f6660n.onMeasure(this.f6638c, this.f6651i0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f6681x0 = z10;
            if (z10 || this.f6658m == null) {
                return;
            }
            if (this.f6651i0.f6700e == 1) {
                J();
            }
            this.f6660n.setMeasureSpecs(i10, i11);
            this.f6651i0.f6705j = true;
            K();
            this.f6660n.setMeasuredDimensionFromChildren(i10, i11);
            if (this.f6660n.shouldMeasureTwice()) {
                this.f6660n.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f6651i0.f6705j = true;
                K();
                this.f6660n.setMeasuredDimensionFromChildren(i10, i11);
            }
            this.f6683y0 = getMeasuredWidth();
            this.f6685z0 = getMeasuredHeight();
            return;
        }
        if (this.f6672t) {
            this.f6660n.onMeasure(this.f6638c, this.f6651i0, i10, i11);
            return;
        }
        if (this.B) {
            F1();
            S0();
            a1();
            T0();
            c0 c0Var = this.f6651i0;
            if (c0Var.f6707l) {
                c0Var.f6703h = true;
            } else {
                this.f6642e.j();
                this.f6651i0.f6703h = false;
            }
            this.B = false;
            J1(false);
        } else if (this.f6651i0.f6707l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f6658m;
        if (hVar != null) {
            this.f6651i0.f6701f = hVar.getItemCount();
        } else {
            this.f6651i0.f6701f = 0;
        }
        F1();
        this.f6660n.onMeasure(this.f6638c, this.f6651i0, i10, i11);
        J1(false);
        this.f6651i0.f6703h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (F0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a0 a0Var = (a0) parcelable;
        this.f6640d = a0Var;
        super.onRestoreInstanceState(a0Var.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        a0 a0Var = new a0(super.onSaveInstanceState());
        a0 a0Var2 = this.f6640d;
        if (a0Var2 != null) {
            a0Var.b(a0Var2);
            return a0Var;
        }
        q qVar = this.f6660n;
        if (qVar != null) {
            a0Var.f6687c = qVar.onSaveInstanceState();
            return a0Var;
        }
        a0Var.f6687c = null;
        return a0Var;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        C0();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00df A[PHI: r1
      0x00df: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f6682y || this.f6684z) {
            return false;
        }
        if (R(motionEvent)) {
            u();
            return true;
        }
        q qVar = this.f6660n;
        if (qVar == null) {
            return false;
        }
        boolean zCanScrollHorizontally = qVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.f6660n.canScrollVertically();
        if (this.Q == null) {
            this.Q = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f6673t0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.f6673t0;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.Q.addMovement(motionEventObtain);
                this.Q.computeCurrentVelocity(1000, this.f6637b0);
                float f10 = zCanScrollHorizontally ? -this.Q.getXVelocity(this.P) : 0.0f;
                float f11 = zCanScrollVertically ? -this.Q.getYVelocity(this.P) : 0.0f;
                if ((f10 == 0.0f && f11 == 0.0f) || !h0((int) f10, (int) f11)) {
                    setScrollState(0);
                }
                q1();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.P);
                if (iFindPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.P + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.T - x10;
                int iMax2 = this.U - y10;
                if (this.O != 1) {
                    if (zCanScrollHorizontally) {
                        iMax = iMax > 0 ? Math.max(0, iMax - this.V) : Math.min(0, iMax + this.V);
                        if (iMax != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    if (zCanScrollVertically) {
                        iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.V) : Math.min(0, iMax2 + this.V);
                        if (iMax2 != 0) {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        setScrollState(1);
                    }
                }
                if (this.O == 1) {
                    int[] iArr3 = this.f6675u0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int iG1 = iMax - g1(iMax, motionEvent.getY());
                    int iH1 = iMax2 - h1(iMax2, motionEvent.getX());
                    if (M(zCanScrollHorizontally ? iG1 : 0, zCanScrollVertically ? iH1 : 0, this.f6675u0, this.f6671s0, 0)) {
                        int[] iArr4 = this.f6675u0;
                        iG1 -= iArr4[0];
                        iH1 -= iArr4[1];
                        int[] iArr5 = this.f6673t0;
                        int i10 = iArr5[0];
                        int[] iArr6 = this.f6671s0;
                        iArr5[0] = i10 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.f6671s0;
                    this.T = x10 - iArr7[0];
                    this.U = y10 - iArr7[1];
                    if (t1(zCanScrollHorizontally ? iG1 : 0, zCanScrollVertically ? iH1 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    androidx.recyclerview.widget.l lVar = this.f6647g0;
                    if (lVar != null && (iG1 != 0 || iH1 != 0)) {
                        lVar.f(this, iG1, iH1);
                    }
                }
            } else if (actionMasked == 3) {
                u();
            } else if (actionMasked == 5) {
                this.P = motionEvent.getPointerId(actionIndex);
                int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.T = x11;
                this.R = x11;
                int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.U = y11;
                this.S = y11;
            } else if (actionMasked == 6) {
                V0(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.P = motionEvent.getPointerId(0);
        int x12 = (int) (motionEvent.getX() + 0.5f);
        this.T = x12;
        this.R = x12;
        int y12 = (int) (motionEvent.getY() + 0.5f);
        this.U = y12;
        this.S = y12;
        H1(0);
        this.Q.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    void q(g0 g0Var, n.b bVar, n.b bVar2) {
        i(g0Var);
        g0Var.setIsRecyclable(false);
        if (this.N.c(g0Var, bVar, bVar2)) {
            Y0();
        }
    }

    void r(String str) {
        if (F0()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + W());
        }
        throw new IllegalStateException(str + W());
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        g0 g0VarP0 = p0(view);
        if (g0VarP0 != null) {
            if (g0VarP0.isTmpDetached()) {
                g0VarP0.clearTmpDetachFlag();
            } else if (!g0VarP0.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + g0VarP0 + W());
            }
        } else if (E0) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + W());
        }
        view.clearAnimation();
        G(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f6660n.onRequestChildFocus(this, this.f6651i0, view, view2) && view2 != null) {
            o1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f6660n.requestChildRectangleOnScreen(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f6666q.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((u) this.f6666q.get(i10)).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f6678w != 0 || this.f6682y) {
            this.f6680x = true;
        } else {
            super.requestLayout();
        }
    }

    void s(String str) {
        if (F0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + W());
        }
        if (this.H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + W()));
        }
    }

    void s1() {
        int iJ = this.f6644f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            g0 g0VarP0 = p0(this.f6644f.i(i10));
            if (E0 && g0VarP0.mPosition == -1 && !g0VarP0.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + W());
            }
            if (!g0VarP0.shouldIgnore()) {
                g0VarP0.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        q qVar = this.f6660n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f6682y) {
            return;
        }
        boolean zCanScrollHorizontally = qVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.f6660n.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i10 = 0;
            }
            if (!zCanScrollVertically) {
                i11 = 0;
            }
            t1(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (z1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.u uVar) {
        this.f6665p0 = uVar;
        q0.m0(this, uVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        w1(hVar, false, true);
        b1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(l lVar) {
        if (lVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f6648h) {
            C0();
        }
        this.f6648h = z10;
        super.setClipToPadding(z10);
        if (this.f6676v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(m mVar) {
        m0.g.g(mVar);
        this.I = mVar;
        C0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f6672t = z10;
    }

    public void setItemAnimator(n nVar) {
        n nVar2 = this.N;
        if (nVar2 != null) {
            nVar2.k();
            this.N.v(null);
        }
        this.N = nVar;
        if (nVar != null) {
            nVar.v(this.f6661n0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f6638c.L(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(q qVar) {
        if (qVar == this.f6660n) {
            return;
        }
        L1();
        if (this.f6660n != null) {
            n nVar = this.N;
            if (nVar != null) {
                nVar.k();
            }
            this.f6660n.removeAndRecycleAllViews(this.f6638c);
            this.f6660n.removeAndRecycleScrapInt(this.f6638c);
            this.f6638c.c();
            if (this.f6670s) {
                this.f6660n.dispatchDetachedFromWindow(this, this.f6638c);
            }
            this.f6660n.setRecyclerView(null);
            this.f6660n = null;
        } else {
            this.f6638c.c();
        }
        this.f6644f.o();
        this.f6660n = qVar;
        if (qVar != null) {
            if (qVar.mRecyclerView != null) {
                throw new IllegalArgumentException("LayoutManager " + qVar + " is already attached to a RecyclerView:" + qVar.mRecyclerView.W());
            }
            qVar.setRecyclerView(this);
            if (this.f6670s) {
                this.f6660n.dispatchAttachedToWindow(this);
            }
        }
        this.f6638c.P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m(z10);
    }

    public void setOnFlingListener(t tVar) {
        this.W = tVar;
    }

    @Deprecated
    public void setOnScrollListener(v vVar) {
        this.f6653j0 = vVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f6643e0 = z10;
    }

    public void setRecycledViewPool(w wVar) {
        this.f6638c.J(wVar);
    }

    @Deprecated
    public void setRecyclerListener(y yVar) {
    }

    void setScrollState(int i10) {
        if (i10 == this.O) {
            return;
        }
        if (F0) {
            Log.d("RecyclerView", "setting scroll state to " + i10 + " from " + this.O, new Exception());
        }
        this.O = i10;
        if (i10 != 2) {
            M1();
        }
        O(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.V = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.V = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(e0 e0Var) {
        this.f6638c.K(e0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f6682y) {
            s("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f6682y = true;
                this.f6684z = true;
                L1();
                return;
            }
            this.f6682y = false;
            if (this.f6680x && this.f6660n != null && this.f6658m != null) {
                requestLayout();
            }
            this.f6680x = false;
        }
    }

    boolean t(g0 g0Var) {
        n nVar = this.N;
        return nVar == null || nVar.g(g0Var, g0Var.getUnmodifiedPayloads());
    }

    Rect t0(View view) {
        r rVar = (r) view.getLayoutParams();
        if (!rVar.f6748c) {
            return rVar.f6747b;
        }
        if (this.f6651i0.e() && (rVar.b() || rVar.d())) {
            return rVar.f6747b;
        }
        Rect rect = rVar.f6747b;
        rect.set(0, 0, 0, 0);
        int size = this.f6664p.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6652j.set(0, 0, 0, 0);
            ((p) this.f6664p.get(i10)).getItemOffsets(this.f6652j, view, this, this.f6651i0);
            int i11 = rect.left;
            Rect rect2 = this.f6652j;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        rVar.f6748c = false;
        return rect;
    }

    boolean t1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        B();
        if (this.f6658m != null) {
            int[] iArr = this.f6675u0;
            iArr[0] = 0;
            iArr[1] = 0;
            u1(i10, i11, iArr);
            int[] iArr2 = this.f6675u0;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i15 = i10 - i17;
            i16 = i11 - i18;
            i14 = i18;
            i13 = i17;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f6664p.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f6675u0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        N(i13, i14, i15, i16, this.f6671s0, i12, iArr3);
        int[] iArr4 = this.f6675u0;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        boolean z10 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.T;
        int[] iArr5 = this.f6671s0;
        int i24 = iArr5[0];
        this.T = i23 - i24;
        int i25 = this.U;
        int i26 = iArr5[1];
        this.U = i25 - i26;
        int[] iArr6 = this.f6673t0;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !n0.v.b(motionEvent, 8194)) {
                c1(motionEvent.getX(), i20, motionEvent.getY(), i22);
                if (Build.VERSION.SDK_INT >= 31 && n0.v.b(motionEvent, 4194304)) {
                    f1();
                }
            }
            x(i10, i11);
        }
        if (i13 != 0 || i14 != 0) {
            P(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i14 == 0) ? false : true;
    }

    void u1(int i10, int i11, int[] iArr) {
        F1();
        S0();
        Trace.beginSection("RV Scroll");
        X(this.f6651i0);
        int iScrollHorizontallyBy = i10 != 0 ? this.f6660n.scrollHorizontallyBy(i10, this.f6638c, this.f6651i0) : 0;
        int iScrollVerticallyBy = i11 != 0 ? this.f6660n.scrollVerticallyBy(i11, this.f6638c, this.f6651i0) : 0;
        Trace.endSection();
        n1();
        T0();
        J1(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    public void v1(int i10) {
        if (this.f6682y) {
            return;
        }
        L1();
        q qVar = this.f6660n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            qVar.scrollToPosition(i10);
            awakenScrollBars();
        }
    }

    void w() {
        int iJ = this.f6644f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            g0 g0VarP0 = p0(this.f6644f.i(i10));
            if (!g0VarP0.shouldIgnore()) {
                g0VarP0.clearOldPosition();
            }
        }
        this.f6638c.d();
    }

    public boolean w0() {
        return !this.f6676v || this.E || this.f6642e.p();
    }

    void x(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.J.onRelease();
            zIsFinished = this.J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.L.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.K.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.M.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    boolean x1(g0 g0Var, int i10) {
        if (!F0()) {
            g0Var.itemView.setImportantForAccessibility(i10);
            return true;
        }
        g0Var.mPendingAccessibilityState = i10;
        this.f6677v0.add(g0Var);
        return false;
    }

    int y(int i10) {
        return z(i10, this.J, this.L, getWidth());
    }

    void y0() {
        this.f6642e = new androidx.recyclerview.widget.a(new g());
    }

    boolean z1(AccessibilityEvent accessibilityEvent) {
        if (!F0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? o0.b.a(accessibilityEvent) : 0;
        this.A |= iA != 0 ? iA : 0;
        return true;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.recyclerview.R.attr.recyclerViewStyle);
    }

    String W() {
        return " " + super.toString() + CIdIVqKnNZ.DkRbUflfQiKoF + this.f6658m + ", layout:" + this.f6660n + ", context:" + getContext();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class a0 extends u0.a {
        public static final Parcelable.Creator<a0> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Parcelable f6687c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a0 createFromParcel(Parcel parcel) {
                return new a0(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a0 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a0(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public a0[] newArray(int i10) {
                return new a0[i10];
            }
        }

        a0(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6687c = parcel.readParcelable(classLoader == null ? q.class.getClassLoader() : classLoader);
        }

        void b(a0 a0Var) {
            this.f6687c = a0Var.f6687c;
        }

        @Override // u0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f6687c, 0);
        }

        a0(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6636b = new z();
        this.f6638c = new x();
        this.f6646g = new androidx.recyclerview.widget.a0();
        this.f6650i = new a();
        this.f6652j = new Rect();
        this.f6654k = new Rect();
        this.f6656l = new RectF();
        this.f6662o = new ArrayList();
        this.f6664p = new ArrayList();
        this.f6666q = new ArrayList();
        this.f6678w = 0;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        this.I = N0;
        this.N = new androidx.recyclerview.widget.i();
        this.O = 0;
        this.P = -1;
        this.f6639c0 = Float.MIN_VALUE;
        this.f6641d0 = Float.MIN_VALUE;
        this.f6643e0 = true;
        this.f6645f0 = new f0();
        this.f6649h0 = K0 ? new androidx.recyclerview.widget.l.b() : null;
        this.f6651i0 = new c0();
        this.f6657l0 = false;
        this.f6659m0 = false;
        this.f6661n0 = new o();
        this.f6663o0 = false;
        this.f6667q0 = new int[2];
        this.f6671s0 = new int[2];
        this.f6673t0 = new int[2];
        this.f6675u0 = new int[2];
        this.f6677v0 = new ArrayList();
        this.f6679w0 = new b();
        this.f6683y0 = 0;
        this.f6685z0 = 0;
        this.B0 = new d();
        e eVar = new e();
        this.C0 = eVar;
        this.D0 = new n0.h(getContext(), eVar);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.V = viewConfiguration.getScaledTouchSlop();
        this.f6639c0 = t0.f(viewConfiguration, context);
        this.f6641d0 = t0.j(viewConfiguration, context);
        this.f6635a0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6637b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f6634a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.N.v(this.f6661n0);
        y0();
        A0();
        z0();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.u(this));
        int[] iArr = androidx.recyclerview.R.styleable.RecyclerView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        q0.k0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(androidx.recyclerview.R.styleable.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(MediaHttpUploader.MINIMUM_CHUNK_SIZE);
        }
        this.f6648h = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_android_clipToPadding, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_fastScrollEnabled, false);
        this.f6674u = z10;
        if (z10) {
            B0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.A0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        C(context, string, attributeSet, i10, 0);
        int[] iArr2 = G0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        q0.k0(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        t0.a.d(this, true);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class r extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g0 f6746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Rect f6747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f6748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f6749d;

        public r(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6747b = new Rect();
            this.f6748c = true;
            this.f6749d = false;
        }

        public int a() {
            return this.f6746a.getLayoutPosition();
        }

        public boolean b() {
            return this.f6746a.isUpdated();
        }

        public boolean c() {
            return this.f6746a.isRemoved();
        }

        public boolean d() {
            return this.f6746a.isInvalid();
        }

        public r(int i10, int i11) {
            super(i10, i11);
            this.f6747b = new Rect();
            this.f6748c = true;
            this.f6749d = false;
        }

        public r(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6747b = new Rect();
            this.f6748c = true;
            this.f6749d = false;
        }

        public r(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6747b = new Rect();
            this.f6748c = true;
            this.f6749d = false;
        }

        public r(r rVar) {
            super((ViewGroup.LayoutParams) rVar);
            this.f6747b = new Rect();
            this.f6748c = true;
            this.f6749d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        q qVar = this.f6660n;
        if (qVar != null) {
            return qVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + W());
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static abstract class j {
        public abstract void a();

        public abstract void b(int i10, int i11, Object obj);

        public abstract void c(int i10, int i11);

        public abstract void d(int i10, int i11, int i12);

        public abstract void e(int i10, int i11);

        public void f() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static abstract class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f6729a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList f6730b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f6731c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f6732d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f6733e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f6734f = 250;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        interface a {
            void a(g0 g0Var);
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f6735a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f6736b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f6737c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f6738d;

            public b a(g0 g0Var) {
                return b(g0Var, 0);
            }

            public b b(g0 g0Var, int i10) {
                View view = g0Var.itemView;
                this.f6735a = view.getLeft();
                this.f6736b = view.getTop();
                this.f6737c = view.getRight();
                this.f6738d = view.getBottom();
                return this;
            }
        }

        static int e(g0 g0Var) {
            int i10 = g0Var.mFlags;
            int i11 = i10 & 14;
            if (g0Var.isInvalid()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int oldPosition = g0Var.getOldPosition();
                int absoluteAdapterPosition = g0Var.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i11 | 2048;
                }
            }
            return i11;
        }

        public abstract boolean a(g0 g0Var, b bVar, b bVar2);

        public abstract boolean b(g0 g0Var, g0 g0Var2, b bVar, b bVar2);

        public abstract boolean c(g0 g0Var, b bVar, b bVar2);

        public abstract boolean d(g0 g0Var, b bVar, b bVar2);

        public abstract boolean f(g0 g0Var);

        public boolean g(g0 g0Var, List list) {
            return f(g0Var);
        }

        public final void h(g0 g0Var) {
            r(g0Var);
            a aVar = this.f6729a;
            if (aVar != null) {
                aVar.a(g0Var);
            }
        }

        public final void i() {
            if (this.f6730b.size() <= 0) {
                this.f6730b.clear();
            } else {
                android.support.v4.media.session.b.a(this.f6730b.get(0));
                throw null;
            }
        }

        public abstract void j(g0 g0Var);

        public abstract void k();

        public long l() {
            return this.f6731c;
        }

        public long m() {
            return this.f6734f;
        }

        public long n() {
            return this.f6733e;
        }

        public long o() {
            return this.f6732d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public b s(c0 c0Var, g0 g0Var) {
            return q().a(g0Var);
        }

        public b t(c0 c0Var, g0 g0Var, int i10, List list) {
            return q().a(g0Var);
        }

        public abstract void u();

        void v(a aVar) {
            this.f6729a = aVar;
        }

        public void r(g0 g0Var) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public final class x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ArrayList f6757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList f6758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList f6759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f6760d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f6761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f6762f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        w f6763g;

        public x() {
            ArrayList arrayList = new ArrayList();
            this.f6757a = arrayList;
            this.f6758b = null;
            this.f6759c = new ArrayList();
            this.f6760d = Collections.unmodifiableList(arrayList);
            this.f6761e = 2;
            this.f6762f = 2;
        }

        private void B(h hVar) {
            C(hVar, false);
        }

        private void C(h hVar, boolean z10) {
            w wVar = this.f6763g;
            if (wVar != null) {
                wVar.e(hVar, z10);
            }
        }

        private boolean M(g0 g0Var, int i10, int i11, long j10) {
            g0Var.mBindingAdapter = null;
            g0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = g0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z10 = false;
            if (j10 != Long.MAX_VALUE && !this.f6763g.m(itemViewType, nanoTime, j10)) {
                return false;
            }
            if (g0Var.isTmpDetached()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(g0Var.itemView, recyclerView.getChildCount(), g0Var.itemView.getLayoutParams());
                z10 = true;
            }
            RecyclerView.this.f6658m.bindViewHolder(g0Var, i10);
            if (z10) {
                RecyclerView.this.detachViewFromParent(g0Var.itemView);
            }
            this.f6763g.f(g0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(g0Var);
            if (RecyclerView.this.f6651i0.e()) {
                g0Var.mPreLayoutPosition = i11;
            }
            return true;
        }

        private void b(g0 g0Var) {
            if (RecyclerView.this.E0()) {
                View view = g0Var.itemView;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                androidx.recyclerview.widget.u uVar = RecyclerView.this.f6665p0;
                if (uVar == null) {
                    return;
                }
                n0.a aVarN = uVar.n();
                if (aVarN instanceof androidx.recyclerview.widget.u.a) {
                    ((androidx.recyclerview.widget.u.a) aVarN).o(view);
                }
                q0.m0(view, aVarN);
            }
        }

        private void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(g0 g0Var) {
            View view = g0Var.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        private void u() {
            if (this.f6763g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f6658m == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f6763g.b(RecyclerView.this.f6658m);
            }
        }

        void A() {
            for (int i10 = 0; i10 < this.f6759c.size(); i10++) {
                t0.a.a(((g0) this.f6759c.get(i10)).itemView);
            }
            B(RecyclerView.this.f6658m);
        }

        void D(View view) {
            g0 g0VarP0 = RecyclerView.p0(view);
            g0VarP0.mScrapContainer = null;
            g0VarP0.mInChangeScrap = false;
            g0VarP0.clearReturnedFromScrapFlag();
            H(g0VarP0);
        }

        void E() {
            for (int size = this.f6759c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f6759c.clear();
            if (RecyclerView.K0) {
                RecyclerView.this.f6649h0.b();
            }
        }

        void F(int i10) {
            if (RecyclerView.F0) {
                Log.d("RecyclerView", "Recycling cached view at index " + i10);
            }
            g0 g0Var = (g0) this.f6759c.get(i10);
            if (RecyclerView.F0) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + g0Var);
            }
            a(g0Var, true);
            this.f6759c.remove(i10);
        }

        public void G(View view) {
            g0 g0VarP0 = RecyclerView.p0(view);
            if (g0VarP0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (g0VarP0.isScrap()) {
                g0VarP0.unScrap();
            } else if (g0VarP0.wasReturnedFromScrap()) {
                g0VarP0.clearReturnedFromScrapFlag();
            }
            H(g0VarP0);
            if (RecyclerView.this.N == null || g0VarP0.isRecyclable()) {
                return;
            }
            RecyclerView.this.N.j(g0VarP0);
        }

        void H(g0 g0Var) {
            boolean z10;
            boolean z11 = false;
            boolean z12 = true;
            if (g0Var.isScrap() || g0Var.itemView.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(g0Var.isScrap());
                sb2.append(" isAttached:");
                sb2.append(g0Var.itemView.getParent() != null);
                sb2.append(RecyclerView.this.W());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (g0Var.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + g0Var + RecyclerView.this.W());
            }
            if (g0Var.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.W());
            }
            boolean zDoesTransientStatePreventRecycling = g0Var.doesTransientStatePreventRecycling();
            h hVar = RecyclerView.this.f6658m;
            boolean z13 = hVar != null && zDoesTransientStatePreventRecycling && hVar.onFailedToRecycleView(g0Var);
            if (RecyclerView.E0 && this.f6759c.contains(g0Var)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + g0Var + RecyclerView.this.W());
            }
            if (z13 || g0Var.isRecyclable()) {
                if (this.f6762f <= 0 || g0Var.hasAnyOfTheFlags(526)) {
                    z10 = false;
                } else {
                    int size = this.f6759c.size();
                    if (size >= this.f6762f && size > 0) {
                        F(0);
                        size--;
                    }
                    if (RecyclerView.K0 && size > 0 && !RecyclerView.this.f6649h0.d(g0Var.mPosition)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.f6649h0.d(((g0) this.f6759c.get(i10)).mPosition)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f6759c.add(size, g0Var);
                    z10 = true;
                }
                if (z10) {
                    z12 = false;
                } else {
                    a(g0Var, true);
                }
                z11 = z10;
            } else {
                if (RecyclerView.F0) {
                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.W());
                }
                z12 = false;
            }
            RecyclerView.this.f6646g.q(g0Var);
            if (z11 || z12 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            t0.a.a(g0Var.itemView);
            g0Var.mBindingAdapter = null;
            g0Var.mOwnerRecyclerView = null;
        }

        void I(View view) {
            g0 g0VarP0 = RecyclerView.p0(view);
            if (!g0VarP0.hasAnyOfTheFlags(12) && g0VarP0.isUpdated() && !RecyclerView.this.t(g0VarP0)) {
                if (this.f6758b == null) {
                    this.f6758b = new ArrayList();
                }
                g0VarP0.setScrapContainer(this, true);
                this.f6758b.add(g0VarP0);
                return;
            }
            if (!g0VarP0.isInvalid() || g0VarP0.isRemoved() || RecyclerView.this.f6658m.hasStableIds()) {
                g0VarP0.setScrapContainer(this, false);
                this.f6757a.add(g0VarP0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.W());
            }
        }

        void J(w wVar) {
            B(RecyclerView.this.f6658m);
            w wVar2 = this.f6763g;
            if (wVar2 != null) {
                wVar2.d();
            }
            this.f6763g = wVar;
            if (wVar != null && RecyclerView.this.getAdapter() != null) {
                this.f6763g.a();
            }
            u();
        }

        public void L(int i10) {
            this.f6761e = i10;
            P();
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0217  */
        /* JADX WARN: Code duplicated, block: B:103:0x021d A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:105:0x0220  */
        /* JADX WARN: Code duplicated, block: B:18:0x0037 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:19:0x0039  */
        /* JADX WARN: Code duplicated, block: B:21:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0054  */
        /* JADX WARN: Code duplicated, block: B:27:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x005f  */
        /* JADX WARN: Code duplicated, block: B:72:0x0171  */
        /* JADX WARN: Code duplicated, block: B:78:0x019d  */
        /* JADX WARN: Code duplicated, block: B:80:0x01a3  */
        /* JADX WARN: Code duplicated, block: B:88:0x01b6  */
        /* JADX WARN: Code duplicated, block: B:96:0x01f3  */
        /* JADX WARN: Code duplicated, block: B:97:0x0201  */
        /* JADX WARN: Code duplicated, block: B:99:0x0209  */
        g0 N(int i10, boolean z10, long j10) {
            g0 g0VarCreateViewHolder;
            boolean z11;
            g0 g0Var;
            boolean z12;
            boolean zM;
            ViewGroup.LayoutParams layoutParams;
            r rVar;
            int iM;
            RecyclerView recyclerViewC0;
            if (i10 < 0 || i10 >= RecyclerView.this.f6651i0.b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i10 + "(" + i10 + "). Item count:" + RecyclerView.this.f6651i0.b() + RecyclerView.this.W());
            }
            if (RecyclerView.this.f6651i0.e()) {
                g0VarCreateViewHolder = h(i10);
                if (g0VarCreateViewHolder != null) {
                    z11 = true;
                }
                if (g0VarCreateViewHolder == null && (g0VarCreateViewHolder = m(i10, z10)) != null) {
                    if (Q(g0VarCreateViewHolder)) {
                        z11 = true;
                    } else {
                        if (!z10) {
                            g0VarCreateViewHolder.addFlags(4);
                            if (g0VarCreateViewHolder.isScrap()) {
                                RecyclerView.this.removeDetachedView(g0VarCreateViewHolder.itemView, false);
                                g0VarCreateViewHolder.unScrap();
                            } else if (g0VarCreateViewHolder.wasReturnedFromScrap()) {
                                g0VarCreateViewHolder.clearReturnedFromScrapFlag();
                            }
                            H(g0VarCreateViewHolder);
                        }
                        g0VarCreateViewHolder = null;
                    }
                }
                if (g0VarCreateViewHolder == null) {
                    iM = RecyclerView.this.f6642e.m(i10);
                    if (iM >= 0 || iM >= RecyclerView.this.f6658m.getItemCount()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iM + ").state:" + RecyclerView.this.f6651i0.b() + RecyclerView.this.W());
                    }
                    int itemViewType = RecyclerView.this.f6658m.getItemViewType(iM);
                    if (RecyclerView.this.f6658m.hasStableIds() && (g0VarCreateViewHolder = l(RecyclerView.this.f6658m.getItemId(iM), itemViewType, z10)) != null) {
                        g0VarCreateViewHolder.mPosition = iM;
                        z11 = true;
                    }
                    if (g0VarCreateViewHolder == null) {
                        if (RecyclerView.F0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i10 + ") fetching from shared pool");
                        }
                        g0VarCreateViewHolder = i().h(itemViewType);
                        if (g0VarCreateViewHolder != null) {
                            g0VarCreateViewHolder.resetInternal();
                            if (RecyclerView.I0) {
                                r(g0VarCreateViewHolder);
                            }
                        }
                    }
                    if (g0VarCreateViewHolder == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j10 != Long.MAX_VALUE && !this.f6763g.n(itemViewType, nanoTime, j10)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        g0VarCreateViewHolder = recyclerView.f6658m.createViewHolder(recyclerView, itemViewType);
                        if (RecyclerView.K0 && (recyclerViewC0 = RecyclerView.c0(g0VarCreateViewHolder.itemView)) != null) {
                            g0VarCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewC0);
                        }
                        this.f6763g.g(itemViewType, RecyclerView.this.getNanoTime() - nanoTime);
                        if (RecyclerView.F0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                        }
                    }
                }
                g0Var = g0VarCreateViewHolder;
                z12 = z11;
                if (z12 && !RecyclerView.this.f6651i0.e() && g0Var.hasAnyOfTheFlags(8192)) {
                    g0Var.setFlags(0, 8192);
                    if (RecyclerView.this.f6651i0.f6706k) {
                        int iE = n.e(g0Var) | 4096;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.d1(g0Var, recyclerView2.N.t(recyclerView2.f6651i0, g0Var, iE, g0Var.getUnmodifiedPayloads()));
                    }
                }
                if (RecyclerView.this.f6651i0.e() || !g0Var.isBound()) {
                    if (g0Var.isBound() || g0Var.needsUpdate() || g0Var.isInvalid()) {
                        if (!RecyclerView.E0 && g0Var.isRemoved()) {
                            throw new IllegalStateException("Removed holder should be bound and it should come here only in pre-layout. Holder: " + g0Var + RecyclerView.this.W());
                        }
                        zM = M(g0Var, RecyclerView.this.f6642e.m(i10), i10, j10);
                    }
                    layoutParams = g0Var.itemView.getLayoutParams();
                    if (layoutParams == null) {
                        rVar = (r) RecyclerView.this.generateDefaultLayoutParams();
                        g0Var.itemView.setLayoutParams(rVar);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        rVar = (r) layoutParams;
                    } else {
                        rVar = (r) RecyclerView.this.generateLayoutParams(layoutParams);
                        g0Var.itemView.setLayoutParams(rVar);
                    }
                    rVar.f6746a = g0Var;
                    rVar.f6749d = !z12 && zM;
                    return g0Var;
                }
                g0Var.mPreLayoutPosition = i10;
                zM = false;
                layoutParams = g0Var.itemView.getLayoutParams();
                if (layoutParams == null) {
                    rVar = (r) RecyclerView.this.generateDefaultLayoutParams();
                    g0Var.itemView.setLayoutParams(rVar);
                } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                    rVar = (r) RecyclerView.this.generateLayoutParams(layoutParams);
                    g0Var.itemView.setLayoutParams(rVar);
                } else {
                    rVar = (r) layoutParams;
                }
                rVar.f6746a = g0Var;
                rVar.f6749d = !z12 && zM;
                return g0Var;
            }
            g0VarCreateViewHolder = null;
            z11 = false;
            if (g0VarCreateViewHolder == null) {
                if (Q(g0VarCreateViewHolder)) {
                    if (!z10) {
                        g0VarCreateViewHolder.addFlags(4);
                        if (g0VarCreateViewHolder.isScrap()) {
                            RecyclerView.this.removeDetachedView(g0VarCreateViewHolder.itemView, false);
                            g0VarCreateViewHolder.unScrap();
                        } else if (g0VarCreateViewHolder.wasReturnedFromScrap()) {
                            g0VarCreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        H(g0VarCreateViewHolder);
                    }
                    g0VarCreateViewHolder = null;
                } else {
                    z11 = true;
                }
            }
            if (g0VarCreateViewHolder == null) {
                iM = RecyclerView.this.f6642e.m(i10);
                if (iM >= 0) {
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iM + ").state:" + RecyclerView.this.f6651i0.b() + RecyclerView.this.W());
            }
            g0Var = g0VarCreateViewHolder;
            z12 = z11;
            if (z12) {
                g0Var.setFlags(0, 8192);
                if (RecyclerView.this.f6651i0.f6706k) {
                    int iE2 = n.e(g0Var) | 4096;
                    RecyclerView recyclerView3 = RecyclerView.this;
                    RecyclerView.this.d1(g0Var, recyclerView3.N.t(recyclerView3.f6651i0, g0Var, iE2, g0Var.getUnmodifiedPayloads()));
                }
            }
            if (RecyclerView.this.f6651i0.e()) {
                if (g0Var.isBound()) {
                }
                if (!RecyclerView.E0) {
                }
                zM = M(g0Var, RecyclerView.this.f6642e.m(i10), i10, j10);
            } else {
                if (g0Var.isBound()) {
                }
                if (!RecyclerView.E0) {
                }
                zM = M(g0Var, RecyclerView.this.f6642e.m(i10), i10, j10);
            }
            layoutParams = g0Var.itemView.getLayoutParams();
            if (layoutParams == null) {
                rVar = (r) RecyclerView.this.generateDefaultLayoutParams();
                g0Var.itemView.setLayoutParams(rVar);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                rVar = (r) RecyclerView.this.generateLayoutParams(layoutParams);
                g0Var.itemView.setLayoutParams(rVar);
            } else {
                rVar = (r) layoutParams;
            }
            rVar.f6746a = g0Var;
            rVar.f6749d = !z12 && zM;
            return g0Var;
        }

        void O(g0 g0Var) {
            if (g0Var.mInChangeScrap) {
                this.f6758b.remove(g0Var);
            } else {
                this.f6757a.remove(g0Var);
            }
            g0Var.mScrapContainer = null;
            g0Var.mInChangeScrap = false;
            g0Var.clearReturnedFromScrapFlag();
        }

        void P() {
            q qVar = RecyclerView.this.f6660n;
            this.f6762f = this.f6761e + (qVar != null ? qVar.mPrefetchMaxCountObserved : 0);
            for (int size = this.f6759c.size() - 1; size >= 0 && this.f6759c.size() > this.f6762f; size--) {
                F(size);
            }
        }

        boolean Q(g0 g0Var) {
            if (g0Var.isRemoved()) {
                if (!RecyclerView.E0 || RecyclerView.this.f6651i0.e()) {
                    return RecyclerView.this.f6651i0.e();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.W());
            }
            int i10 = g0Var.mPosition;
            if (i10 >= 0 && i10 < RecyclerView.this.f6658m.getItemCount()) {
                if (RecyclerView.this.f6651i0.e() || RecyclerView.this.f6658m.getItemViewType(g0Var.mPosition) == g0Var.getItemViewType()) {
                    return !RecyclerView.this.f6658m.hasStableIds() || g0Var.getItemId() == RecyclerView.this.f6658m.getItemId(g0Var.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + g0Var + RecyclerView.this.W());
        }

        void R(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f6759c.size() - 1; size >= 0; size--) {
                g0 g0Var = (g0) this.f6759c.get(size);
                if (g0Var != null && (i12 = g0Var.mPosition) >= i10 && i12 < i13) {
                    g0Var.addFlags(2);
                    F(size);
                }
            }
        }

        void a(g0 g0Var, boolean z10) {
            RecyclerView.v(g0Var);
            View view = g0Var.itemView;
            androidx.recyclerview.widget.u uVar = RecyclerView.this.f6665p0;
            if (uVar != null) {
                n0.a aVarN = uVar.n();
                q0.m0(view, aVarN instanceof androidx.recyclerview.widget.u.a ? ((androidx.recyclerview.widget.u.a) aVarN).n(view) : null);
            }
            if (z10) {
                g(g0Var);
            }
            g0Var.mBindingAdapter = null;
            g0Var.mOwnerRecyclerView = null;
            i().k(g0Var);
        }

        public void c() {
            this.f6757a.clear();
            E();
        }

        void d() {
            int size = this.f6759c.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((g0) this.f6759c.get(i10)).clearOldPosition();
            }
            int size2 = this.f6757a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((g0) this.f6757a.get(i11)).clearOldPosition();
            }
            ArrayList arrayList = this.f6758b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((g0) this.f6758b.get(i12)).clearOldPosition();
                }
            }
        }

        void e() {
            this.f6757a.clear();
            ArrayList arrayList = this.f6758b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f6651i0.b()) {
                return !RecyclerView.this.f6651i0.e() ? i10 : RecyclerView.this.f6642e.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f6651i0.b() + RecyclerView.this.W());
        }

        void g(g0 g0Var) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f6662o.size() > 0) {
                android.support.v4.media.session.b.a(RecyclerView.this.f6662o.get(0));
                throw null;
            }
            h hVar = RecyclerView.this.f6658m;
            if (hVar != null) {
                hVar.onViewRecycled(g0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f6651i0 != null) {
                recyclerView.f6646g.q(g0Var);
            }
            if (RecyclerView.F0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + g0Var);
            }
        }

        g0 h(int i10) {
            int size;
            int iM;
            ArrayList arrayList = this.f6758b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    g0 g0Var = (g0) this.f6758b.get(i11);
                    if (!g0Var.wasReturnedFromScrap() && g0Var.getLayoutPosition() == i10) {
                        g0Var.addFlags(32);
                        return g0Var;
                    }
                }
                if (RecyclerView.this.f6658m.hasStableIds() && (iM = RecyclerView.this.f6642e.m(i10)) > 0 && iM < RecyclerView.this.f6658m.getItemCount()) {
                    long itemId = RecyclerView.this.f6658m.getItemId(iM);
                    for (int i12 = 0; i12 < size; i12++) {
                        g0 g0Var2 = (g0) this.f6758b.get(i12);
                        if (!g0Var2.wasReturnedFromScrap() && g0Var2.getItemId() == itemId) {
                            g0Var2.addFlags(32);
                            return g0Var2;
                        }
                    }
                }
            }
            return null;
        }

        w i() {
            if (this.f6763g == null) {
                this.f6763g = new w();
                u();
            }
            return this.f6763g;
        }

        int j() {
            return this.f6757a.size();
        }

        public List k() {
            return this.f6760d;
        }

        g0 l(long j10, int i10, boolean z10) {
            for (int size = this.f6757a.size() - 1; size >= 0; size--) {
                g0 g0Var = (g0) this.f6757a.get(size);
                if (g0Var.getItemId() == j10 && !g0Var.wasReturnedFromScrap()) {
                    if (i10 == g0Var.getItemViewType()) {
                        g0Var.addFlags(32);
                        if (g0Var.isRemoved() && !RecyclerView.this.f6651i0.e()) {
                            g0Var.setFlags(2, 14);
                        }
                        return g0Var;
                    }
                    if (!z10) {
                        this.f6757a.remove(size);
                        RecyclerView.this.removeDetachedView(g0Var.itemView, false);
                        D(g0Var.itemView);
                    }
                }
            }
            int size2 = this.f6759c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                g0 g0Var2 = (g0) this.f6759c.get(size2);
                if (g0Var2.getItemId() == j10 && !g0Var2.isAttachedToTransitionOverlay()) {
                    if (i10 == g0Var2.getItemViewType()) {
                        if (!z10) {
                            this.f6759c.remove(size2);
                        }
                        return g0Var2;
                    }
                    if (!z10) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        g0 m(int i10, boolean z10) {
            View viewE;
            int size = this.f6757a.size();
            for (int i11 = 0; i11 < size; i11++) {
                g0 g0Var = (g0) this.f6757a.get(i11);
                if (!g0Var.wasReturnedFromScrap() && g0Var.getLayoutPosition() == i10 && !g0Var.isInvalid() && (RecyclerView.this.f6651i0.f6703h || !g0Var.isRemoved())) {
                    g0Var.addFlags(32);
                    return g0Var;
                }
            }
            if (!z10 && (viewE = RecyclerView.this.f6644f.e(i10)) != null) {
                g0 g0VarP0 = RecyclerView.p0(viewE);
                RecyclerView.this.f6644f.s(viewE);
                int iM = RecyclerView.this.f6644f.m(viewE);
                if (iM != -1) {
                    RecyclerView.this.f6644f.d(iM);
                    I(viewE);
                    g0VarP0.addFlags(8224);
                    return g0VarP0;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + g0VarP0 + RecyclerView.this.W());
            }
            int size2 = this.f6759c.size();
            for (int i12 = 0; i12 < size2; i12++) {
                g0 g0Var2 = (g0) this.f6759c.get(i12);
                if (!g0Var2.isInvalid() && g0Var2.getLayoutPosition() == i10 && !g0Var2.isAttachedToTransitionOverlay()) {
                    if (!z10) {
                        this.f6759c.remove(i12);
                    }
                    if (RecyclerView.F0) {
                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i10 + ") found match in cache: " + g0Var2);
                    }
                    return g0Var2;
                }
            }
            return null;
        }

        View n(int i10) {
            return ((g0) this.f6757a.get(i10)).itemView;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        View p(int i10, boolean z10) {
            return N(i10, z10, Long.MAX_VALUE).itemView;
        }

        void s() {
            int size = this.f6759c.size();
            for (int i10 = 0; i10 < size; i10++) {
                r rVar = (r) ((g0) this.f6759c.get(i10)).itemView.getLayoutParams();
                if (rVar != null) {
                    rVar.f6748c = true;
                }
            }
        }

        void t() {
            int size = this.f6759c.size();
            for (int i10 = 0; i10 < size; i10++) {
                g0 g0Var = (g0) this.f6759c.get(i10);
                if (g0Var != null) {
                    g0Var.addFlags(6);
                    g0Var.addChangePayload(null);
                }
            }
            h hVar = RecyclerView.this.f6658m;
            if (hVar == null || !hVar.hasStableIds()) {
                E();
            }
        }

        void v(int i10, int i11) {
            int size = this.f6759c.size();
            for (int i12 = 0; i12 < size; i12++) {
                g0 g0Var = (g0) this.f6759c.get(i12);
                if (g0Var != null && g0Var.mPosition >= i10) {
                    if (RecyclerView.F0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i12 + " holder " + g0Var + " now at position " + (g0Var.mPosition + i11));
                    }
                    g0Var.offsetPosition(i11, false);
                }
            }
        }

        void w(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f6759c.size();
            for (int i16 = 0; i16 < size; i16++) {
                g0 g0Var = (g0) this.f6759c.get(i16);
                if (g0Var != null && (i15 = g0Var.mPosition) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        g0Var.offsetPosition(i11 - i10, false);
                    } else {
                        g0Var.offsetPosition(i12, false);
                    }
                    if (RecyclerView.F0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i16 + " holder " + g0Var);
                    }
                }
            }
        }

        void x(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f6759c.size() - 1; size >= 0; size--) {
                g0 g0Var = (g0) this.f6759c.get(size);
                if (g0Var != null) {
                    int i13 = g0Var.mPosition;
                    if (i13 >= i12) {
                        if (RecyclerView.F0) {
                            Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + g0Var + " now at position " + (g0Var.mPosition - i11));
                        }
                        g0Var.offsetPosition(-i11, z10);
                    } else if (i13 >= i10) {
                        g0Var.addFlags(8);
                        F(size);
                    }
                }
            }
        }

        void y(h hVar, h hVar2, boolean z10) {
            c();
            C(hVar, true);
            i().j(hVar, hVar2, z10);
            u();
        }

        void z() {
            u();
        }

        void K(e0 e0Var) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static abstract class v {
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        }

        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        }
    }
}
