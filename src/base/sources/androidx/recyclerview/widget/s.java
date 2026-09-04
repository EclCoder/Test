package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import f8.Ygx.FuoITeVPeXAj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final RecyclerView.q f7048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Rect f7050c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class a extends s {
        a(RecyclerView.q qVar) {
            super(qVar, null);
        }

        @Override // androidx.recyclerview.widget.s
        public int d(View view) {
            return this.f7048a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int e(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f7048a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int f(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f7048a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int g(View view) {
            return this.f7048a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int h() {
            return this.f7048a.getWidth();
        }

        @Override // androidx.recyclerview.widget.s
        public int i() {
            return this.f7048a.getWidth() - this.f7048a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.s
        public int j() {
            return this.f7048a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.s
        public int l() {
            return this.f7048a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.s
        public int m() {
            return this.f7048a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.s
        public int n() {
            return this.f7048a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.s
        public int o() {
            return (this.f7048a.getWidth() - this.f7048a.getPaddingLeft()) - this.f7048a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.s
        public int q(View view) {
            this.f7048a.getTransformedBoundingBox(view, true, this.f7050c);
            return this.f7050c.right;
        }

        @Override // androidx.recyclerview.widget.s
        public int r(View view) {
            this.f7048a.getTransformedBoundingBox(view, true, this.f7050c);
            return this.f7050c.left;
        }

        @Override // androidx.recyclerview.widget.s
        public void s(int i10) {
            this.f7048a.offsetChildrenHorizontal(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class b extends s {
        b(RecyclerView.q qVar) {
            super(qVar, null);
        }

        @Override // androidx.recyclerview.widget.s
        public int d(View view) {
            return this.f7048a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int e(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f7048a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int f(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f7048a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int g(View view) {
            return this.f7048a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int h() {
            return this.f7048a.getHeight();
        }

        @Override // androidx.recyclerview.widget.s
        public int i() {
            return this.f7048a.getHeight() - this.f7048a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.s
        public int j() {
            return this.f7048a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.s
        public int l() {
            return this.f7048a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.s
        public int m() {
            return this.f7048a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.s
        public int n() {
            return this.f7048a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.s
        public int o() {
            return (this.f7048a.getHeight() - this.f7048a.getPaddingTop()) - this.f7048a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.s
        public int q(View view) {
            this.f7048a.getTransformedBoundingBox(view, true, this.f7050c);
            return this.f7050c.bottom;
        }

        @Override // androidx.recyclerview.widget.s
        public int r(View view) {
            this.f7048a.getTransformedBoundingBox(view, true, this.f7050c);
            return this.f7050c.top;
        }

        @Override // androidx.recyclerview.widget.s
        public void s(int i10) {
            this.f7048a.offsetChildrenVertical(i10);
        }
    }

    /* synthetic */ s(RecyclerView.q qVar, a aVar) {
        this(qVar);
    }

    public static s a(RecyclerView.q qVar) {
        return new a(qVar);
    }

    public static s c(RecyclerView.q qVar) {
        return new b(qVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public RecyclerView.q k() {
        return this.f7048a;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public int p() {
        if (Integer.MIN_VALUE == this.f7049b) {
            return 0;
        }
        return o() - this.f7049b;
    }

    public abstract int q(View view);

    public abstract int r(View view);

    public abstract void s(int i10);

    public void t() {
        this.f7049b = o();
    }

    private s(RecyclerView.q qVar) {
        this.f7049b = Integer.MIN_VALUE;
        this.f7050c = new Rect();
        this.f7048a = qVar;
    }

    public static s b(RecyclerView.q qVar, int i10) {
        if (i10 == 0) {
            return a(qVar);
        }
        if (i10 == 1) {
            return c(qVar);
        }
        throw new IllegalArgumentException(FuoITeVPeXAj.NAILDWQ);
    }
}
