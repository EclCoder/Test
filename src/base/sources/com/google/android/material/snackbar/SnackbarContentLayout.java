package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import gc.j;
import sb.c;
import sb.e;
import sb.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class SnackbarContentLayout extends LinearLayout implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f21198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Button f21199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Button f21200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f21201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21202e;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21201d = j.g(context, c.U, tb.b.f53276b);
    }

    private static void d(View view, int i10, int i11) {
        if (view.isPaddingRelative()) {
            view.setPaddingRelative(view.getPaddingStart(), i10, view.getPaddingEnd(), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean e(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f21198a.getPaddingTop() == i11 && this.f21198a.getPaddingBottom() == i12) {
            return z10;
        }
        d(this.f21198a, i11, i12);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int i10, int i11) {
        this.f21198a.setAlpha(0.0f);
        long j10 = i11;
        long j11 = i10;
        this.f21198a.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f21201d).setStartDelay(j11).start();
        if (this.f21199b.getVisibility() == 0) {
            this.f21199b.setAlpha(0.0f);
            this.f21199b.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f21201d).setStartDelay(j11).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i10, int i11) {
        this.f21198a.setAlpha(1.0f);
        long j10 = i11;
        long j11 = i10;
        this.f21198a.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f21201d).setStartDelay(j11).start();
        if (this.f21199b.getVisibility() == 0) {
            this.f21199b.setAlpha(1.0f);
            this.f21199b.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f21201d).setStartDelay(j11).start();
        }
    }

    void c(float f10) {
        if (f10 != 1.0f) {
            this.f21199b.setTextColor(ac.a.j(ac.a.d(this, c.f51620m), this.f21199b.getCurrentTextColor(), f10));
        }
    }

    public Button getActionView() {
        return this.f21199b;
    }

    public Button getCloseView() {
        return this.f21200c;
    }

    public TextView getMessageView() {
        return this.f21198a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f21198a = (TextView) findViewById(g.f51778p0);
        this.f21199b = (Button) findViewById(g.f51776o0);
        this.f21200c = (Button) findViewById(g.J);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(e.f51706o);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(e.f51703n);
        Layout layout = this.f21198a.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f21202e <= 0 || this.f21199b.getMeasuredWidth() <= this.f21202e) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f21202e = i10;
    }
}
