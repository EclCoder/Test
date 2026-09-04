package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class CarouselLayoutManager extends RecyclerView.q implements yb.a, RecyclerView.b0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f19703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f19704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f19705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f19707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.material.carousel.c f19708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f19709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e f19710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f19712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.material.carousel.b f19713k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final View.OnLayoutChangeListener f19714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f19715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19716n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19717o;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends n {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.n
        public int calculateDxToMakeVisible(View view, int i10) {
            if (CarouselLayoutManager.this.f19709g == null || !CarouselLayoutManager.this.d()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.A(carouselLayoutManager.getPosition(view));
        }

        @Override // androidx.recyclerview.widget.n
        public int calculateDyToMakeVisible(View view, int i10) {
            if (CarouselLayoutManager.this.f19709g == null || CarouselLayoutManager.this.d()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.A(carouselLayoutManager.getPosition(view));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.b0
        public PointF computeScrollVectorForPosition(int i10) {
            return CarouselLayoutManager.this.computeScrollVectorForPosition(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final View f19719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f19720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f19721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final d f19722d;

        b(View view, float f10, float f11, d dVar) {
            this.f19719a = view;
            this.f19720b = f10;
            this.f19721c = f11;
            this.f19722d = dVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends RecyclerView.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Paint f19723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f19724b;

        c() {
            Paint paint = new Paint();
            this.f19723a = paint;
            this.f19724b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        void d(List list) {
            this.f19724b = Collections.unmodifiableList(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            super.onDrawOver(canvas, recyclerView, c0Var);
            this.f19723a.setStrokeWidth(recyclerView.getResources().getDimension(sb.e.E));
            for (e.c cVar : this.f19724b) {
                this.f19723a.setColor(e0.a.c(-65281, -16776961, cVar.f19768c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).d()) {
                    canvas.drawLine(cVar.f19767b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).S(), cVar.f19767b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).O(), this.f19723a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).P(), cVar.f19767b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).Q(), cVar.f19767b, this.f19723a);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final e.c f19725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final e.c f19726b;

        d(e.c cVar, e.c cVar2) {
            m0.g.a(cVar.f19766a <= cVar2.f19766a);
            this.f19725a = cVar;
            this.f19726b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new h());
    }

    private static int B(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        if (i14 < i12) {
            return i12 - i11;
        }
        return i14 > i13 ? i13 - i11 : i10;
    }

    private int C(f fVar) {
        boolean zX = X();
        e eVarH = zX ? fVar.h() : fVar.l();
        return (int) (R() - t((zX ? eVarH.i() : eVarH.b()).f19766a, eVarH.g() / 2.0f));
    }

    private void D(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        f0(xVar);
        if (getChildCount() == 0) {
            w(xVar, this.f19711i - 1);
            v(xVar, c0Var, this.f19711i);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            w(xVar, position - 1);
            v(xVar, c0Var, position2 + 1);
        }
        n0();
    }

    private View E() {
        return getChildAt(X() ? 0 : getChildCount() - 1);
    }

    private View F() {
        return getChildAt(X() ? getChildCount() - 1 : 0);
    }

    private int G() {
        return d() ? a() : b();
    }

    private float H(View view) {
        Rect rect = new Rect();
        super.getDecoratedBoundsWithMargins(view, rect);
        return d() ? rect.centerX() : rect.centerY();
    }

    private int I() {
        int i10;
        int i11;
        if (getChildCount() <= 0) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) getChildAt(0).getLayoutParams();
        if (this.f19713k.f19743a == 0) {
            i10 = ((ViewGroup.MarginLayoutParams) rVar).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) rVar).topMargin;
            i11 = ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }
        return i10 + i11;
    }

    private e J(f fVar) {
        return X() ? fVar.h() : fVar.l();
    }

    private e K(int i10) {
        e eVar;
        Map map = this.f19712j;
        return (map == null || (eVar = (e) map.get(Integer.valueOf(h0.a.b(i10, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.f19709g.g() : eVar;
    }

    private int L() {
        if (getClipToPadding()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingTop() : getPaddingLeft();
    }

    private float M(float f10, d dVar) {
        e.c cVar = dVar.f19725a;
        float f11 = cVar.f19769d;
        e.c cVar2 = dVar.f19726b;
        return tb.b.b(f11, cVar2.f19769d, cVar.f19767b, cVar2.f19767b, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int O() {
        return this.f19713k.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int P() {
        return this.f19713k.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int Q() {
        return this.f19713k.h();
    }

    private int R() {
        return this.f19713k.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int S() {
        return this.f19713k.j();
    }

    private int T() {
        if (getClipToPadding()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingBottom() : getPaddingRight();
    }

    private int U(int i10, e eVar) {
        return X() ? (int) (((G() - eVar.i().f19766a) - (i10 * eVar.g())) - (eVar.g() / 2.0f)) : (int) (((i10 * eVar.g()) - eVar.b().f19766a) + (eVar.g() / 2.0f));
    }

    private int V(int i10, e eVar) {
        int i11 = Integer.MAX_VALUE;
        for (e.c cVar : eVar.f()) {
            float fG = (i10 * eVar.g()) + (eVar.g() / 2.0f);
            int iG = (X() ? (int) ((G() - cVar.f19766a) - fG) : (int) (fG - cVar.f19766a)) - this.f19703a;
            if (Math.abs(i11) > Math.abs(iG)) {
                i11 = iG;
            }
        }
        return i11;
    }

    private static d W(List list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            e.c cVar = (e.c) list.get(i14);
            float f15 = z10 ? cVar.f19767b : cVar.f19766a;
            float fAbs = Math.abs(f15 - f10);
            if (f15 <= f10 && fAbs <= f11) {
                i10 = i14;
                f11 = fAbs;
            }
            if (f15 > f10 && fAbs <= f13) {
                i12 = i14;
                f13 = fAbs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new d((e.c) list.get(i10), (e.c) list.get(i12));
    }

    private boolean Y(float f10, d dVar) {
        float fT = t(f10, M(f10, dVar) / 2.0f);
        if (X()) {
            return fT < 0.0f;
        }
        return fT > ((float) G());
    }

    private boolean Z(float f10, d dVar) {
        float fS = s(f10, M(f10, dVar) / 2.0f);
        if (X()) {
            return fS > ((float) G());
        }
        return fS < 0.0f;
    }

    private void a0() {
        if (this.f19706d && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                Log.d("CarouselLayoutManager", "item position " + getPosition(childAt) + ", center:" + H(childAt) + ", child index:" + i10);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    private b b0(RecyclerView.x xVar, float f10, int i10) {
        View viewO = xVar.o(i10);
        measureChildWithMargins(viewO, 0, 0);
        float fS = s(f10, this.f19710h.g() / 2.0f);
        d dVarW = W(this.f19710h.h(), fS, false);
        return new b(viewO, fS, x(fS, dVarW), dVarW);
    }

    private float c0(View view, float f10, float f11, Rect rect) {
        float fS = s(f10, f11);
        d dVarW = W(this.f19710h.h(), fS, false);
        float fX = x(fS, dVarW);
        super.getDecoratedBoundsWithMargins(view, rect);
        k0(view, fS, dVarW);
        this.f19713k.m(view, rect, f11, fX);
        return fX;
    }

    private int convertFocusDirectionToLayoutDirection(int i10) {
        int orientation = getOrientation();
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 17) {
            if (orientation == 0) {
                return X() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return orientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 66) {
            if (orientation == 0) {
                return X() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i10 == 130) {
            return orientation == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i10);
        return Integer.MIN_VALUE;
    }

    private void d0(RecyclerView.x xVar) {
        View viewO = xVar.o(0);
        measureChildWithMargins(viewO, 0, 0);
        e eVarG = this.f19708f.g(this, viewO);
        if (X()) {
            eVarG = e.p(eVarG, G());
        }
        this.f19709g = f.f(this, eVarG, I(), L(), T(), this.f19708f.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() {
        this.f19709g = null;
        requestLayout();
    }

    private void f0(RecyclerView.x xVar) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float fH = H(childAt);
            if (!Z(fH, W(this.f19710h.h(), fH, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, xVar);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float fH2 = H(childAt2);
            if (!Y(fH2, W(this.f19710h.h(), fH2, true))) {
                return;
            } else {
                removeAndRecycleView(childAt2, xVar);
            }
        }
    }

    private void g0(RecyclerView recyclerView, int i10) {
        if (d()) {
            recyclerView.scrollBy(i10, 0);
        } else {
            recyclerView.scrollBy(0, i10);
        }
    }

    private void i0(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f51979g1);
            h0(typedArrayObtainStyledAttributes.getInt(m.f51994h1, 0));
            setOrientation(typedArrayObtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void k0(View view, float f10, d dVar) {
        if (view instanceof g) {
            e.c cVar = dVar.f19725a;
            float f11 = cVar.f19768c;
            e.c cVar2 = dVar.f19726b;
            float fB = tb.b.b(f11, cVar2.f19768c, cVar.f19766a, cVar2.f19766a, f10);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFE = this.f19713k.e(height, width, tb.b.b(0.0f, height / 2.0f, 0.0f, 1.0f, fB), tb.b.b(0.0f, width / 2.0f, 0.0f, 1.0f, fB));
            float fX = x(f10, dVar);
            RectF rectF = new RectF(fX - (rectFE.width() / 2.0f), fX - (rectFE.height() / 2.0f), fX + (rectFE.width() / 2.0f), (rectFE.height() / 2.0f) + fX);
            RectF rectF2 = new RectF(P(), S(), Q(), O());
            if (this.f19708f.e() == com.google.android.material.carousel.c.a.CONTAINED) {
                this.f19713k.a(rectFE, rectF, rectF2);
            }
            this.f19713k.l(rectFE, rectF, rectF2);
            ((g) view).setMaskRectF(rectFE);
        }
    }

    public static /* synthetic */ void l(final CarouselLayoutManager carouselLayoutManager, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        carouselLayoutManager.getClass();
        if (i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) {
            return;
        }
        view.post(new Runnable() { // from class: yb.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f57473a.e0();
            }
        });
    }

    private void l0(f fVar) {
        int i10 = this.f19705c;
        int i11 = this.f19704b;
        if (i10 <= i11) {
            this.f19710h = J(fVar);
        } else {
            this.f19710h = fVar.j(this.f19703a, i11, i10);
        }
        this.f19707e.d(this.f19710h.h());
    }

    private void m0() {
        int itemCount = getItemCount();
        int i10 = this.f19715m;
        if (itemCount == i10 || this.f19709g == null) {
            return;
        }
        if (this.f19708f.h(this, i10)) {
            e0();
        }
        this.f19715m = itemCount;
    }

    private void n0() {
        if (!this.f19706d || getChildCount() < 1) {
            return;
        }
        int i10 = 0;
        while (i10 < getChildCount() - 1) {
            int position = getPosition(getChildAt(i10));
            int i11 = i10 + 1;
            int position2 = getPosition(getChildAt(i11));
            if (position > position2) {
                a0();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + position + "] and child at index [" + i11 + "] had adapter position [" + position2 + "].");
            }
            i10 = i11;
        }
    }

    private void r(View view, int i10, b bVar) {
        float fG = this.f19710h.g() / 2.0f;
        addView(view, i10);
        measureChildWithMargins(view, 0, 0);
        float f10 = bVar.f19721c;
        this.f19713k.k(view, (int) (f10 - fG), (int) (f10 + fG));
        k0(view, bVar.f19720b, bVar.f19722d);
    }

    private float s(float f10, float f11) {
        return X() ? f10 - f11 : f10 + f11;
    }

    private int scrollBy(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f19709g == null) {
            d0(xVar);
        }
        if (getItemCount() <= J(this.f19709g).n()) {
            return 0;
        }
        int iB = B(i10, this.f19703a, this.f19704b, this.f19705c);
        this.f19703a += iB;
        l0(this.f19709g);
        float fG = this.f19710h.g() / 2.0f;
        float fY = y(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        float f10 = X() ? this.f19710h.i().f19767b : this.f19710h.b().f19767b;
        float f11 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            float fAbs = Math.abs(f10 - c0(childAt, fY, fG, rect));
            if (childAt != null && fAbs < f11) {
                this.f19716n = getPosition(childAt);
                f11 = fAbs;
            }
            fY = s(fY, this.f19710h.g());
        }
        D(xVar, c0Var);
        return iB;
    }

    private float t(float f10, float f11) {
        return X() ? f10 + f11 : f10 - f11;
    }

    private void u(RecyclerView.x xVar, int i10, int i11) {
        if (i10 < 0 || i10 >= getItemCount()) {
            return;
        }
        b bVarB0 = b0(xVar, y(i10), i10);
        r(bVarB0.f19719a, i11, bVarB0);
    }

    private void v(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i10) {
        float fY = y(i10);
        while (i10 < c0Var.b()) {
            float fS = s(fY, this.f19710h.g() / 2.0f);
            d dVarW = W(this.f19710h.h(), fS, false);
            float fX = x(fS, dVarW);
            if (Y(fX, dVarW)) {
                return;
            }
            fY = s(fY, this.f19710h.g());
            if (!Z(fX, dVarW)) {
                View viewO = xVar.o(i10);
                r(viewO, -1, new b(viewO, fS, fX, dVarW));
            }
            i10++;
        }
    }

    private void w(RecyclerView.x xVar, int i10) {
        float fY = y(i10);
        while (i10 >= 0) {
            float fS = s(fY, this.f19710h.g() / 2.0f);
            d dVarW = W(this.f19710h.h(), fS, false);
            float fX = x(fS, dVarW);
            if (Z(fX, dVarW)) {
                return;
            }
            fY = t(fY, this.f19710h.g());
            if (!Y(fX, dVarW)) {
                View viewO = xVar.o(i10);
                r(viewO, 0, new b(viewO, fS, fX, dVarW));
            }
            i10--;
        }
    }

    private float x(float f10, d dVar) {
        e.c cVar = dVar.f19725a;
        float f11 = cVar.f19767b;
        e.c cVar2 = dVar.f19726b;
        float fB = tb.b.b(f11, cVar2.f19767b, cVar.f19766a, cVar2.f19766a, f10);
        if (dVar.f19726b != this.f19710h.d() && dVar.f19725a != this.f19710h.k()) {
            return fB;
        }
        e.c cVar3 = dVar.f19726b;
        return fB + ((f10 - cVar3.f19766a) * (1.0f - cVar3.f19768c));
    }

    private float y(int i10) {
        return s(R() - this.f19703a, this.f19710h.g() * i10);
    }

    private int z(RecyclerView.c0 c0Var, f fVar) {
        boolean zX = X();
        e eVarL = zX ? fVar.l() : fVar.h();
        e.c cVarB = zX ? eVarL.b() : eVarL.i();
        int iB = (int) (((((c0Var.b() - 1) * eVarL.g()) * (zX ? -1.0f : 1.0f)) - (cVarB.f19766a - R())) + (((zX ? -1 : 1) * cVarB.f19769d) / 2.0f));
        return zX ? Math.min(0, iB) : Math.max(0, iB);
    }

    int A(int i10) {
        return (int) (this.f19703a - U(i10, K(i10)));
    }

    int N(int i10, e eVar) {
        return U(i10, eVar) - this.f19703a;
    }

    boolean X() {
        return d() && getLayoutDirection() == 1;
    }

    @Override // yb.a
    public int a() {
        return getWidth();
    }

    @Override // yb.a
    public int b() {
        return getHeight();
    }

    @Override // yb.a
    public int c() {
        return this.f19717o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean canScrollHorizontally() {
        return d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean canScrollVertically() {
        return !d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int computeHorizontalScrollExtent(RecyclerView.c0 c0Var) {
        if (getChildCount() == 0 || this.f19709g == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.f19709g.g().g() / computeHorizontalScrollRange(c0Var)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int computeHorizontalScrollOffset(RecyclerView.c0 c0Var) {
        return this.f19703a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int computeHorizontalScrollRange(RecyclerView.c0 c0Var) {
        return this.f19705c - this.f19704b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0.b
    public PointF computeScrollVectorForPosition(int i10) {
        if (this.f19709g == null) {
            return null;
        }
        int iN = N(i10, K(i10));
        return d() ? new PointF(iN, 0.0f) : new PointF(0.0f, iN);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int computeVerticalScrollExtent(RecyclerView.c0 c0Var) {
        if (getChildCount() == 0 || this.f19709g == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.f19709g.g().g() / computeVerticalScrollRange(c0Var)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int computeVerticalScrollOffset(RecyclerView.c0 c0Var) {
        return this.f19703a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int computeVerticalScrollRange(RecyclerView.c0 c0Var) {
        return this.f19705c - this.f19704b;
    }

    @Override // yb.a
    public boolean d() {
        return this.f19713k.f19743a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r generateDefaultLayoutParams() {
        return new RecyclerView.r(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float fCenterY = rect.centerY();
        if (d()) {
            fCenterY = rect.centerX();
        }
        float fM = M(fCenterY, W(this.f19710h.h(), fCenterY, true));
        float fWidth = d() ? (rect.width() - fM) / 2.0f : 0.0f;
        float fHeight = d() ? 0.0f : (rect.height() - fM) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public int getOrientation() {
        return this.f19713k.f19743a;
    }

    public void h0(int i10) {
        this.f19717o = i10;
        e0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public void j0(com.google.android.material.carousel.c cVar) {
        this.f19708f = cVar;
        e0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void measureChildWithMargins(View view, int i10, int i11) {
        if (!(view instanceof g)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i12 = i10 + rect.left + rect.right;
        int i13 = i11 + rect.top + rect.bottom;
        f fVar = this.f19709g;
        float fG = (fVar == null || this.f19713k.f19743a != 0) ? ((ViewGroup.MarginLayoutParams) rVar).width : fVar.g().g();
        f fVar2 = this.f19709g;
        view.measure(RecyclerView.q.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin + i12, (int) fG, canScrollHorizontally()), RecyclerView.q.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin + i13, (int) ((fVar2 == null || this.f19713k.f19743a != 1) ? ((ViewGroup.MarginLayoutParams) rVar).height : fVar2.g().g()), canScrollVertically()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f19708f.f(recyclerView.getContext());
        e0();
        recyclerView.addOnLayoutChangeListener(this.f19714l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.onDetachedFromWindow(recyclerView, xVar);
        recyclerView.removeOnLayoutChangeListener(this.f19714l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View onFocusSearchFailed(View view, int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        int iConvertFocusDirectionToLayoutDirection;
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            u(xVar, getPosition(getChildAt(0)) - 1, 0);
            return F();
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        u(xVar, getPosition(getChildAt(getChildCount() - 1)) + 1, -1);
        return E();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsAdded(recyclerView, i10, i11);
        m0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onItemsChanged(RecyclerView recyclerView) {
        super.onItemsChanged(recyclerView);
        m0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsRemoved(recyclerView, i10, i11);
        m0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onLayoutChildren(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (c0Var.b() <= 0 || G() <= 0.0f) {
            removeAndRecycleAllViews(xVar);
            this.f19711i = 0;
            return;
        }
        boolean zX = X();
        f fVar = this.f19709g;
        boolean z10 = fVar == null;
        if (z10 || fVar.g().a() != G()) {
            d0(xVar);
        }
        int iC = C(this.f19709g);
        int iZ = z(c0Var, this.f19709g);
        this.f19704b = zX ? iZ : iC;
        if (zX) {
            iZ = iC;
        }
        this.f19705c = iZ;
        if (z10) {
            this.f19703a = iC;
            this.f19712j = this.f19709g.i(getItemCount(), this.f19704b, this.f19705c, X());
            int i10 = this.f19716n;
            if (i10 != -1) {
                this.f19703a = U(i10, K(i10));
            }
        }
        int i11 = this.f19703a;
        this.f19703a = i11 + B(0, i11, this.f19704b, this.f19705c);
        this.f19711i = h0.a.b(this.f19711i, 0, c0Var.b());
        l0(this.f19709g);
        detachAndScrapAttachedViews(xVar);
        D(xVar, c0Var);
        this.f19715m = getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onLayoutCompleted(RecyclerView.c0 c0Var) {
        super.onLayoutCompleted(c0Var);
        if (getChildCount() == 0) {
            this.f19711i = 0;
        } else {
            this.f19711i = getPosition(getChildAt(0));
        }
        n0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int iV;
        if (this.f19709g == null || (iV = V(getPosition(view), K(getPosition(view)))) == 0) {
            return false;
        }
        g0(recyclerView, V(getPosition(view), this.f19709g.j(this.f19703a + B(iV, this.f19703a, this.f19704b, this.f19705c), this.f19704b, this.f19705c)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int scrollHorizontallyBy(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (canScrollHorizontally()) {
            return scrollBy(i10, xVar, c0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void scrollToPosition(int i10) {
        this.f19716n = i10;
        if (this.f19709g == null) {
            return;
        }
        this.f19703a = U(i10, K(i10));
        this.f19711i = h0.a.b(i10, 0, Math.max(0, getItemCount() - 1));
        l0(this.f19709g);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int scrollVerticallyBy(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (canScrollVertically()) {
            return scrollBy(i10, xVar, c0Var);
        }
        return 0;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        assertNotInLayoutOrScroll(null);
        com.google.android.material.carousel.b bVar = this.f19713k;
        if (bVar == null || i10 != bVar.f19743a) {
            this.f19713k = com.google.android.material.carousel.b.c(this, i10);
            e0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i10);
        startSmoothScroll(aVar);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.c cVar) {
        this(cVar, 0);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.c cVar, int i10) {
        this.f19706d = false;
        this.f19707e = new c();
        this.f19711i = 0;
        this.f19714l = new View.OnLayoutChangeListener() { // from class: yb.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager.l(this.f57472a, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f19716n = -1;
        this.f19717o = 0;
        j0(cVar);
        setOrientation(i10);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f19706d = false;
        this.f19707e = new c();
        this.f19711i = 0;
        this.f19714l = new View.OnLayoutChangeListener() { // from class: yb.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                CarouselLayoutManager.l(this.f57472a, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        };
        this.f19716n = -1;
        this.f19717o = 0;
        j0(new h());
        i0(context, attributeSet);
    }
}
