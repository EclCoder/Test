package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class x extends RecyclerView.t {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final RecyclerView.v mScrollListener = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends RecyclerView.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f7059a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            super.onScrollStateChanged(recyclerView, i10);
            if (i10 == 0 && this.f7059a) {
                this.f7059a = false;
                x.this.snapToTargetExistingView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f7059a = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends n {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.n
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.n, androidx.recyclerview.widget.RecyclerView.b0
        protected void onTargetFound(View view, RecyclerView.c0 c0Var, RecyclerView.b0.a aVar) {
            x xVar = x.this;
            RecyclerView recyclerView = xVar.mRecyclerView;
            if (recyclerView == null) {
                return;
            }
            int[] iArrCalculateDistanceToFinalSnap = xVar.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
            int i10 = iArrCalculateDistanceToFinalSnap[0];
            int i11 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.d(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    private void a() {
        this.mRecyclerView.m1(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    private void b() {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.mRecyclerView.n(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
    }

    private boolean c(RecyclerView.q qVar, int i10, int i11) {
        RecyclerView.b0 b0VarCreateScroller;
        int iFindTargetSnapPosition;
        if (!(qVar instanceof RecyclerView.b0.b) || (b0VarCreateScroller = createScroller(qVar)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(qVar, i10, i11)) == -1) {
            return false;
        }
        b0VarCreateScroller.setTargetPosition(iFindTargetSnapPosition);
        qVar.startSmoothScroll(b0VarCreateScroller);
        return true;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            a();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            b();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    public abstract int[] calculateDistanceToFinalSnap(RecyclerView.q qVar, View view);

    public int[] calculateScrollDistance(int i10, int i11) {
        this.mGravityScroller.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    protected abstract RecyclerView.b0 createScroller(RecyclerView.q qVar);

    @Deprecated
    protected n createSnapScroller(RecyclerView.q qVar) {
        if (qVar instanceof RecyclerView.b0.b) {
            return new b(this.mRecyclerView.getContext());
        }
        return null;
    }

    public abstract View findSnapView(RecyclerView.q qVar);

    public abstract int findTargetSnapPosition(RecyclerView.q qVar, int i10, int i11);

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean onFling(int i10, int i11) {
        RecyclerView.q layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && c(layoutManager, i10, i11);
    }

    void snapToTargetExistingView() {
        RecyclerView.q layoutManager;
        View viewFindSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i10 = iArrCalculateDistanceToFinalSnap[0];
        if (i10 == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.A1(i10, iArrCalculateDistanceToFinalSnap[1]);
    }
}
