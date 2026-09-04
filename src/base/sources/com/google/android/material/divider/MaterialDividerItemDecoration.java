package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.z;
import f0.a;
import sb.c;
import sb.e;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class MaterialDividerItemDecoration extends RecyclerView.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f20027i = l.U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f20028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f20035h;

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, c.G, i10);
    }

    private void d(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        int i10;
        int i11;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int i12 = paddingTop + this.f20032e;
        int i13 = height - this.f20033f;
        boolean zM = c0.m(recyclerView);
        int childCount = recyclerView.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = recyclerView.getChildAt(i14);
            if (i(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f20035h);
                int iRound = Math.round(childAt.getTranslationX());
                if (zM) {
                    i11 = this.f20035h.left + iRound;
                    i10 = this.f20029b + i11;
                } else {
                    i10 = iRound + this.f20035h.right;
                    i11 = i10 - this.f20029b;
                }
                this.f20028a.setBounds(i11, i12, i10, i13);
                this.f20028a.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.f20028a.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void e(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        boolean zM = c0.m(recyclerView);
        int i10 = paddingLeft + (zM ? this.f20033f : this.f20032e);
        int i11 = width - (zM ? this.f20032e : this.f20033f);
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            if (i(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f20035h);
                int iRound = this.f20035h.bottom + Math.round(childAt.getTranslationY());
                this.f20028a.setBounds(i10, iRound - this.f20029b, i11, iRound);
                this.f20028a.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.f20028a.draw(canvas);
            }
        }
        canvas.restore();
    }

    private boolean i(RecyclerView recyclerView, View view) {
        int iM0 = recyclerView.m0(view);
        RecyclerView.h adapter = recyclerView.getAdapter();
        return iM0 != -1 && (!(adapter != null && iM0 == adapter.getItemCount() - 1) || this.f20034g) && h(iM0, adapter);
    }

    public void f(int i10) {
        this.f20030c = i10;
        Drawable drawableR = a.r(this.f20028a);
        this.f20028a = drawableR;
        drawableR.setTint(i10);
    }

    public void g(int i10) {
        if (i10 == 0 || i10 == 1) {
            this.f20031d = i10;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i10 + ". It should be either HORIZONTAL or VERTICAL");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        rect.set(0, 0, 0, 0);
        if (i(recyclerView, view)) {
            if (this.f20031d == 1) {
                rect.bottom = this.f20029b;
            } else if (c0.m(recyclerView)) {
                rect.left = this.f20029b;
            } else {
                rect.right = this.f20029b;
            }
        }
    }

    protected boolean h(int i10, RecyclerView.h hVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.f20031d == 1) {
            e(canvas, recyclerView);
        } else {
            d(canvas, recyclerView);
        }
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f20035h = new Rect();
        TypedArray typedArrayI = z.i(context, attributeSet, m.I6, i10, f20027i, new int[0]);
        this.f20030c = jc.c.a(context, typedArrayI, m.J6).getDefaultColor();
        this.f20029b = typedArrayI.getDimensionPixelSize(m.M6, context.getResources().getDimensionPixelSize(e.f51689i0));
        this.f20032e = typedArrayI.getDimensionPixelOffset(m.L6, 0);
        this.f20033f = typedArrayI.getDimensionPixelOffset(m.K6, 0);
        this.f20034g = typedArrayI.getBoolean(m.N6, true);
        typedArrayI.recycle();
        this.f20028a = new ShapeDrawable();
        f(this.f20030c);
        g(i11);
    }
}
