package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.Arrays;
import n0.q0;
import o0.p;
import sb.g;
import sb.i;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.b {
    private final ClockHandView C;
    private final Rect D;
    private final RectF E;
    private final Rect F;
    private final SparseArray G;
    private final n0.a H;
    private final int[] I;
    private final float[] J;
    private final int K;
    private final int L;
    private final int M;
    private final int N;
    private String[] O;
    private float P;
    private final ColorStateList Q;
    private c R;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends n0.a {
        b() {
        }

        @Override // n0.a
        public void g(View view, p pVar) {
            super.g(view, pVar);
            int iIntValue = ((Integer) view.getTag(g.f51781r)).intValue();
            if (iIntValue > 0) {
                pVar.Z0((View) ClockFaceView.this.G.get(iIntValue - 1));
            }
            pVar.x0(p.h.a(0, 1, iIntValue, 1, false, view.isSelected()));
            pVar.v0(true);
            pVar.b(p.a.f47928i);
        }

        @Override // n0.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.j(view, i10, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.D);
            float fCenterX = ClockFaceView.this.D.centerX();
            float fCenterY = ClockFaceView.this.D.centerY();
            ClockFaceView.this.C.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.C.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface c {
        void a();
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sb.c.F);
    }

    private void O() {
        RectF rectFF = this.C.f();
        TextView textViewS = S(rectFF);
        for (int i10 = 0; i10 < this.G.size(); i10++) {
            TextView textView = (TextView) this.G.get(i10);
            if (textView != null) {
                textView.setSelected(textView == textViewS);
                textView.getPaint().setShader(Q(rectFF, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient Q(RectF rectF, TextView textView) {
        textView.getHitRect(this.D);
        this.E.set(this.D);
        textView.getLineBounds(0, this.F);
        RectF rectF2 = this.E;
        Rect rect = this.F;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.E)) {
            return new RadialGradient(rectF.centerX() - this.E.left, rectF.centerY() - this.E.top, rectF.width() * 0.5f, this.I, this.J, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private int R() {
        for (int i10 = 0; i10 < this.G.size(); i10++) {
            TextView textView = (TextView) this.G.valueAt(i10);
            if (textView.isSelected()) {
                return ((Integer) textView.getTag(g.f51781r)).intValue();
            }
        }
        return -1;
    }

    private TextView S(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.G.size(); i10++) {
            TextView textView2 = (TextView) this.G.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.D);
                this.E.set(this.D);
                this.E.union(rectF);
                float fWidth = this.E.width() * this.E.height();
                if (fWidth < f10) {
                    textView = textView2;
                    f10 = fWidth;
                }
            }
        }
        return textView;
    }

    private static float T(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private void Y(int i10) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.G.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.O.length, size); i11++) {
            TextView textView = (TextView) this.G.get(i11);
            if (i11 >= this.O.length) {
                removeView(textView);
                this.G.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(i.f51820s, (ViewGroup) this, false);
                    this.G.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.O[i11]);
                textView.setTag(g.f51781r, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(g.f51771m, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                q0.m0(textView, this.H);
                textView.setTextColor(this.Q);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.O[i11]));
                }
            }
        }
        this.C.s(z10);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void H(int i10) {
        if (i10 != G()) {
            super.H(i10);
            this.C.n(G());
        }
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    protected void J() {
        super.J();
        for (int i10 = 0; i10 < this.G.size(); i10++) {
            ((TextView) this.G.get(i10)).setVisibility(0);
        }
    }

    int P() {
        return this.C.e();
    }

    void U(int i10) {
        this.C.o(i10);
    }

    public void V(float f10) {
        this.C.p(f10);
        O();
    }

    public void W(c cVar) {
        this.R = cVar;
    }

    public void X(String[] strArr, int i10) {
        this.O = strArr;
        Y(i10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f10, boolean z10) {
        if (Math.abs(this.P - f10) > 0.001f) {
            this.P = f10;
            O();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        p.c1(accessibilityNodeInfo).w0(p.g.b(1, this.O.length, false, 1));
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        int length;
        int iR = R();
        if (!isShown() || iR == -1) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (i10 != 66) {
            switch (i10) {
                case 19:
                case 22:
                    length = (iR + 1) % this.O.length;
                    break;
                case 20:
                case 21:
                    String[] strArr = this.O;
                    length = ((iR - 1) + strArr.length) % strArr.length;
                    break;
                case 23:
                    break;
                default:
                    return super.onKeyDown(i10, keyEvent);
            }
            if (length == iR) {
                return super.onKeyDown(i10, keyEvent);
            }
            int i11 = (length / 12) + 1;
            if (i11 != P()) {
                U(i11);
            }
            V((length % 12) * 30.0f);
            return true;
        }
        c cVar = this.R;
        if (cVar != null) {
            cVar.a();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        O();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iT = (int) (this.N / T(this.L / displayMetrics.heightPixels, this.M / displayMetrics.widthPixels, 1.0f));
        if (View.MeasureSpec.getMode(i10) != 0) {
            iT = Math.min(iT, View.MeasureSpec.getSize(i10));
        }
        if (View.MeasureSpec.getMode(i11) != 0) {
            iT = Math.min(iT, View.MeasureSpec.getSize(i11));
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iT, 1073741824);
        int iJ = ((iT / 2) - this.C.j()) - this.K;
        if (iJ != G()) {
            H(iJ);
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.D = new Rect();
        this.E = new RectF();
        this.F = new Rect();
        this.G = new SparseArray();
        this.J = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f52085n2, i10, l.Z);
        Resources resources = getResources();
        ColorStateList colorStateListA = jc.c.a(context, typedArrayObtainStyledAttributes, m.f52115p2);
        this.Q = colorStateListA;
        LayoutInflater.from(context).inflate(i.f51821t, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(g.f51769l);
        this.C = clockHandView;
        this.K = resources.getDimensionPixelSize(sb.e.f51680f0);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.I = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = i.a.a(context, sb.d.f51659l).getDefaultColor();
        ColorStateList colorStateListA2 = jc.c.a(context, typedArrayObtainStyledAttributes, m.f52100o2);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        typedArrayObtainStyledAttributes.recycle();
        setOutlineProvider(new a());
        setFocusable(true);
        setClipToOutline(true);
        this.H = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        X(strArr, 0);
        this.L = resources.getDimensionPixelSize(sb.e.f51721t0);
        this.M = resources.getDimensionPixelSize(sb.e.f51723u0);
        this.N = resources.getDimensionPixelSize(sb.e.f51686h0);
    }
}
