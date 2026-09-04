package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f19743a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f19744b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f19744b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.b
        public void a(RectF rectF, RectF rectF2, RectF rectF3) {
            float f10 = rectF2.top;
            float f11 = rectF3.top;
            if (f10 < f11 && rectF2.bottom > f11) {
                float f12 = f11 - f10;
                rectF.top += f12;
                rectF3.top += f12;
            }
            float f13 = rectF2.bottom;
            float f14 = rectF3.bottom;
            if (f13 <= f14 || rectF2.top >= f14) {
                return;
            }
            float f15 = f13 - f14;
            rectF.bottom = Math.max(rectF.bottom - f15, rectF.top);
            rectF2.bottom = Math.max(rectF2.bottom - f15, rectF2.top);
        }

        @Override // com.google.android.material.carousel.b
        public RectF e(float f10, float f11, float f12, float f13) {
            return new RectF(0.0f, f12, f11, f10 - f12);
        }

        @Override // com.google.android.material.carousel.b
        int f() {
            return this.f19744b.getHeight();
        }

        @Override // com.google.android.material.carousel.b
        int g() {
            return this.f19744b.getPaddingLeft();
        }

        @Override // com.google.android.material.carousel.b
        int h() {
            return this.f19744b.getWidth() - this.f19744b.getPaddingRight();
        }

        @Override // com.google.android.material.carousel.b
        int i() {
            return j();
        }

        @Override // com.google.android.material.carousel.b
        int j() {
            return 0;
        }

        @Override // com.google.android.material.carousel.b
        public void k(View view, int i10, int i11) {
            int iG = g();
            this.f19744b.layoutDecoratedWithMargins(view, iG, i10, iG + n(view), i11);
        }

        @Override // com.google.android.material.carousel.b
        public void l(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.bottom <= rectF3.top) {
                float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
                rectF.bottom = fFloor;
                rectF.top = Math.min(rectF.top, fFloor);
            }
            if (rectF2.top >= rectF3.bottom) {
                float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
                rectF.top = fCeil;
                rectF.bottom = Math.max(fCeil, rectF.bottom);
            }
        }

        @Override // com.google.android.material.carousel.b
        public void m(View view, Rect rect, float f10, float f11) {
            view.offsetTopAndBottom((int) (f11 - (rect.top + f10)));
        }

        int n(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f19744b.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0305b extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f19745b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0305b(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f19745b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.b
        public void a(RectF rectF, RectF rectF2, RectF rectF3) {
            float f10 = rectF2.left;
            float f11 = rectF3.left;
            if (f10 < f11 && rectF2.right > f11) {
                float f12 = f11 - f10;
                rectF.left += f12;
                rectF2.left += f12;
            }
            float f13 = rectF2.right;
            float f14 = rectF3.right;
            if (f13 <= f14 || rectF2.left >= f14) {
                return;
            }
            float f15 = f13 - f14;
            rectF.right = Math.max(rectF.right - f15, rectF.left);
            rectF2.right = Math.max(rectF2.right - f15, rectF2.left);
        }

        @Override // com.google.android.material.carousel.b
        public RectF e(float f10, float f11, float f12, float f13) {
            return new RectF(f13, 0.0f, f11 - f13, f10);
        }

        @Override // com.google.android.material.carousel.b
        int f() {
            return this.f19745b.getHeight() - this.f19745b.getPaddingBottom();
        }

        @Override // com.google.android.material.carousel.b
        int g() {
            return 0;
        }

        @Override // com.google.android.material.carousel.b
        int h() {
            return this.f19745b.getWidth();
        }

        @Override // com.google.android.material.carousel.b
        int i() {
            return this.f19745b.X() ? h() : g();
        }

        @Override // com.google.android.material.carousel.b
        int j() {
            return this.f19745b.getPaddingTop();
        }

        @Override // com.google.android.material.carousel.b
        public void k(View view, int i10, int i11) {
            int iJ = j();
            this.f19745b.layoutDecoratedWithMargins(view, i10, iJ, i11, iJ + n(view));
        }

        @Override // com.google.android.material.carousel.b
        public void l(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.right <= rectF3.left) {
                float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
                rectF.right = fFloor;
                rectF.left = Math.min(rectF.left, fFloor);
            }
            if (rectF2.left >= rectF3.right) {
                float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
                rectF.left = fCeil;
                rectF.right = Math.max(fCeil, rectF.right);
            }
        }

        @Override // com.google.android.material.carousel.b
        public void m(View view, Rect rect, float f10, float f11) {
            view.offsetLeftAndRight((int) (f11 - (rect.left + f10)));
        }

        int n(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f19745b.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }
    }

    /* synthetic */ b(int i10, a aVar) {
        this(i10);
    }

    private static b b(CarouselLayoutManager carouselLayoutManager) {
        return new C0305b(0, carouselLayoutManager);
    }

    static b c(CarouselLayoutManager carouselLayoutManager, int i10) {
        if (i10 == 0) {
            return b(carouselLayoutManager);
        }
        if (i10 == 1) {
            return d(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static b d(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    abstract void a(RectF rectF, RectF rectF2, RectF rectF3);

    abstract RectF e(float f10, float f11, float f12, float f13);

    abstract int f();

    abstract int g();

    abstract int h();

    abstract int i();

    abstract int j();

    abstract void k(View view, int i10, int i11);

    abstract void l(RectF rectF, RectF rectF2, RectF rectF3);

    abstract void m(View view, Rect rect, float f10, float f11);

    private b(int i10) {
        this.f19743a = i10;
    }
}
