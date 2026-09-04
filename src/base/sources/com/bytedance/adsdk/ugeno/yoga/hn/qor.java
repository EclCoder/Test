package com.bytedance.adsdk.ugeno.yoga.hn;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.gjv;
import com.bytedance.adsdk.ugeno.hnj.aq;
import com.bytedance.adsdk.ugeno.hnj.dse;
import com.bytedance.adsdk.ugeno.yoga.dkl;
import com.bytedance.adsdk.ugeno.yoga.dnm;
import com.bytedance.adsdk.ugeno.yoga.mjg;
import com.bytedance.adsdk.ugeno.yoga.ojm;
import com.bytedance.adsdk.ugeno.yoga.orl;
import com.bytedance.adsdk.ugeno.yoga.sk;
import com.bytedance.adsdk.ugeno.yoga.ta;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends ViewGroup implements com.bytedance.adsdk.ugeno.hn.hn, dse {
    private aq gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final ta f12441hn;
    private final Map<View, ta> hnj;
    private gjv qor;

    public qor(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        ta taVarHnj;
        this.f12441hn.hnj((com.bytedance.adsdk.ugeno.yoga.dse) null);
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.hn.hn) {
            throw null;
        }
        super.addView(view, i10, layoutParams);
        if (this.hnj.containsKey(view)) {
            return;
        }
        if (view instanceof qor) {
            taVarHnj = ((qor) view).getYogaNode();
        } else {
            taVarHnj = this.hnj.containsKey(view) ? this.hnj.get(view) : dnm.hnj();
            taVarHnj.hnj(view);
            taVarHnj.hnj((com.bytedance.adsdk.ugeno.yoga.dse) new hn());
        }
        hnj((hnj) view.getLayoutParams(), taVarHnj, view);
        this.hnj.put(view, taVarHnj);
        if (view.getVisibility() == 8) {
            view.setTag(151060224, Integer.valueOf(this.f12441hn.hnj()));
        } else {
            ta taVar = this.f12441hn;
            taVar.hnj(taVarHnj, taVar.hnj());
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof hnj;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        gjv gjvVar = this.qor;
        if (gjvVar != null) {
            gjvVar.hn(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new hnj(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new hnj(layoutParams);
    }

    public float getBorderRadius() {
        return this.gjv.hnj();
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.dse
    public float getRipple() {
        return this.gjv.getRipple();
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.dse
    public float getRubIn() {
        return this.gjv.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.dse
    public float getShine() {
        return this.gjv.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.dse
    public float getStretch() {
        return this.gjv.getStretch();
    }

    public ta getYogaNode() {
        return this.f12441hn;
    }

    public void gjv(View view, int i10) {
        int iHnj;
        view.setVisibility(i10);
        try {
            ta taVar = this.hnj.get(view);
            Object tag = view.getTag(151060224);
            if (i10 != 0) {
                if (i10 != 8 || (iHnj = this.f12441hn.hnj(taVar)) == -1) {
                    return;
                }
                this.f12441hn.hn(iHnj);
                view.setTag(151060224, Integer.valueOf(iHnj));
                hnj(this.f12441hn);
                return;
            }
            if (tag == null || this.f12441hn.hnj(taVar) != -1) {
                return;
            }
            int iIntValue = ((Integer) tag).intValue();
            if (iIntValue < this.f12441hn.hnj()) {
                this.f12441hn.hnj(this.hnj.get(view), iIntValue);
            } else {
                this.f12441hn.hnj(this.hnj.get(view), this.f12441hn.hnj());
            }
            hnj(this.f12441hn);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hn
    public void hn(int i10) {
        ta taVar = this.f12441hn;
        if (taVar != null) {
            hn(taVar, i10);
            requestLayout();
        }
    }

    public ta hnj(View view) {
        return this.hnj.get(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        gjv gjvVar = this.qor;
        if (gjvVar != null) {
            gjvVar.dse();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gjv gjvVar = this.qor;
        if (gjvVar != null) {
            gjvVar.aq();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gjv gjvVar = this.qor;
        if (gjvVar != null) {
            gjvVar.hnj(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        gjv gjvVar = this.qor;
        if (gjvVar != null) {
            gjvVar.dkl();
        }
        if (!(getParent() instanceof qor)) {
            hnj(View.MeasureSpec.makeMeasureSpec(i12 - i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i13 - i11, 1073741824));
        }
        hnj(this.f12441hn, 0.0f, 0.0f);
        gjv gjvVar2 = this.qor;
        if (gjvVar2 != null) {
            gjvVar2.hnj(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (!(getParent() instanceof qor)) {
            hnj(i10, i11);
        }
        gjv gjvVar = this.qor;
        if (gjvVar != null) {
            int[] iArrHnj = gjvVar.hnj(i10, i11);
            setMeasuredDimension(iArrHnj[0], iArrHnj[1]);
        } else {
            setMeasuredDimension(Math.round(this.f12441hn.aq()), Math.round(this.f12441hn.ojm()));
        }
        gjv gjvVar2 = this.qor;
        if (gjvVar2 != null) {
            gjvVar2.sk();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        gjv gjvVar = this.qor;
        if (gjvVar != null) {
            gjvVar.hn(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hn
    public void qor(View view, int i10) {
        gjv(view, i10);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            hnj(getChildAt(i10), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            hnj(getChildAt(i10), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        hnj(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        hnj(getChildAt(i10), false);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        hnj(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            hnj(getChildAt(i12), false);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            hnj(getChildAt(i12), true);
        }
        super.removeViewsInLayout(i10, i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.gjv.hnj(i10);
    }

    public void setBorderRadius(float f10) {
        this.gjv.hnj(f10);
    }

    public void setRipple(float f10) {
        aq aqVar = this.gjv;
        if (aqVar != null) {
            aqVar.hn(f10);
        }
    }

    public void setRubIn(float f10) {
        aq aqVar = this.gjv;
        if (aqVar != null) {
            aqVar.sk(f10);
        }
    }

    public void setShine(float f10) {
        aq aqVar = this.gjv;
        if (aqVar != null) {
            aqVar.qor(f10);
        }
    }

    public void setStretch(float f10) {
        aq aqVar = this.gjv;
        if (aqVar != null) {
            aqVar.gjv(f10);
        }
    }

    public qor(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.gjv = new aq(this);
        ta taVarHnj = dnm.hnj();
        this.f12441hn = taVarHnj;
        this.hnj = new HashMap();
        taVarHnj.hnj(this);
        taVarHnj.hnj((com.bytedance.adsdk.ugeno.yoga.dse) new hn());
        hnj((hnj) generateDefaultLayoutParams(), taVarHnj, this);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hn
    public void hnj(int i10) {
        ta taVar = this.f12441hn;
        if (taVar != null) {
            hnj(taVar, i10);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hn
    public void hn(View view, int i10) {
        ta taVarHnj;
        if (view == null || (taVarHnj = hnj(view)) == null) {
            return;
        }
        hn(taVarHnj, i10);
        view.requestLayout();
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hn
    public void hnj(View view, int i10) {
        ta taVarHnj;
        if (view == null || (taVarHnj = hnj(view)) == null) {
            return;
        }
        hnj(taVarHnj, i10);
        view.requestLayout();
    }

    private void hn(ta taVar, int i10) {
        if (i10 == -1) {
            taVar.dse(100.0f);
        } else if (i10 == -2) {
            taVar.sk();
        } else {
            taVar.dkl(i10);
        }
    }

    private void hnj(ta taVar, int i10) {
        if (i10 == -1) {
            taVar.sk(100.0f);
        } else if (i10 == -2) {
            taVar.gjv();
        } else {
            taVar.gjv(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hn implements com.bytedance.adsdk.ugeno.yoga.dse {
        @Override // com.bytedance.adsdk.ugeno.yoga.dse
        public long hnj(ta taVar, float f10, com.bytedance.adsdk.ugeno.yoga.aq aqVar, float f11, com.bytedance.adsdk.ugeno.yoga.aq aqVar2) {
            View view = (View) taVar.ta();
            if (view == null || (view instanceof qor)) {
                return ojm.hnj(0, 0);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f10, hnj(aqVar)), View.MeasureSpec.makeMeasureSpec((int) f11, hnj(aqVar2)));
            return ojm.hnj(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        private int hnj(com.bytedance.adsdk.ugeno.yoga.aq aqVar) {
            if (aqVar == com.bytedance.adsdk.ugeno.yoga.aq.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return aqVar == com.bytedance.adsdk.ugeno.yoga.aq.EXACTLY ? 1073741824 : 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj extends ViewGroup.LayoutParams {
        private float aq;
        private float bug;
        private float dkl;
        private float dnm;
        private float dse;

        /* JADX INFO: renamed from: fc, reason: collision with root package name */
        private float f12442fc;
        private float gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        SparseArray<String> f12443hn;
        SparseArray<Float> hnj;
        private float jip;
        private float mjg;

        /* JADX INFO: renamed from: oj, reason: collision with root package name */
        private float f12444oj;
        private float ojm;
        private float orl;
        private float qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private float f12445sk;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        private float f12446ta;
        private float uua;

        /* JADX INFO: renamed from: xn, reason: collision with root package name */
        private float f12447xn;

        public hnj(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof hnj) {
                hnj hnjVar = (hnj) layoutParams;
                this.hnj = hnjVar.hnj.clone();
                this.f12443hn = hnjVar.f12443hn.clone();
                return;
            }
            this.hnj = new SparseArray<>();
            this.f12443hn = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.hnj.put(15, Float.valueOf(((ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.hnj.put(16, Float.valueOf(((ViewGroup.LayoutParams) this).height));
            }
        }

        public void aq(float f10) {
            this.mjg = f10;
            this.hnj.put(11, Float.valueOf(f10));
        }

        public void bug(float f10) {
            this.gjv = f10;
            this.hnj.put(18, Float.valueOf(f10));
        }

        public void dkl(float f10) {
            this.bug = f10;
            this.hnj.put(14, Float.valueOf(f10));
        }

        public void dnm(float f10) {
            this.qor = f10;
            this.hnj.put(17, Float.valueOf(f10));
        }

        public void dse(float f10) {
            this.orl = f10;
            this.hnj.put(10, Float.valueOf(f10));
        }

        public void fc(float f10) {
            this.uua = f10;
            this.hnj.put(25, Float.valueOf(f10));
        }

        public void gjv(float f10) {
            this.f12446ta = f10;
            this.hnj.put(8, Float.valueOf(f10));
        }

        public void hn(float f10) {
            this.aq = f10;
            this.hnj.put(6, Float.valueOf(f10));
        }

        public void hnj(float f10) {
            this.dse = f10;
            this.hnj.put(5, Float.valueOf(f10));
        }

        public void jip(float f10) {
            this.f12444oj = f10;
            this.hnj.put(27, Float.valueOf(f10));
        }

        public void mjg(float f10) {
            this.dkl = f10;
            this.hnj.put(20, Float.valueOf(f10));
        }

        public void ojm(float f10) {
            this.f12442fc = f10;
            this.hnj.put(12, Float.valueOf(f10));
        }

        public void orl(float f10) {
            this.f12445sk = f10;
            this.hnj.put(19, Float.valueOf(f10));
        }

        public void qor(float f10) {
            this.ojm = f10;
            this.hnj.put(7, Float.valueOf(f10));
        }

        public void sk(float f10) {
            this.dnm = f10;
            this.hnj.put(9, Float.valueOf(f10));
        }

        public void ta(float f10) {
            this.jip = f10;
            this.hnj.put(13, Float.valueOf(f10));
        }

        public void uua(float f10) {
            this.f12447xn = f10;
            this.hnj.put(28, Float.valueOf(f10));
        }

        public hnj(int i10, int i11) {
            super(i10, i11);
            this.hnj = new SparseArray<>();
            this.f12443hn = new SparseArray<>();
            if (i10 == -2 || i10 == -1 || i10 >= 0) {
                this.hnj.put(15, Float.valueOf(i10));
            }
            if (i11 == -2 || i11 == -1 || i11 >= 0) {
                this.hnj.put(16, Float.valueOf(i11));
            }
        }
    }

    private void hnj(ta taVar) {
        if (taVar.hn() != null) {
            hnj(taVar.hn());
        } else {
            taVar.hnj(Float.NaN, Float.NaN);
        }
    }

    private void hnj(View view, boolean z10) {
        try {
            ta taVar = this.hnj.get(view);
            if (taVar == null) {
                return;
            }
            ta taVarHn = taVar.hn();
            for (int i10 = 0; i10 < taVarHn.hnj(); i10++) {
                if (taVarHn.hnj(i10).equals(taVar)) {
                    taVarHn.hn(i10);
                    break;
                }
            }
            taVar.hnj((Object) null);
            this.hnj.remove(view);
            if (z10) {
                this.f12441hn.hnj(Float.NaN, Float.NaN);
            }
        } catch (Throwable unused) {
        }
    }

    private void hnj(ta taVar, float f10, float f11) {
        View view = (View) taVar.ta();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int iRound = Math.round(taVar.dkl() + f10);
            int iRound2 = Math.round(taVar.dse() + f11);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(taVar.aq()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(taVar.ojm()), 1073741824));
            view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
        }
        int iHnj = taVar.hnj();
        for (int i10 = 0; i10 < iHnj; i10++) {
            if (equals(view)) {
                hnj(taVar.hnj(i10), f10, f11);
            } else if (!(view instanceof qor)) {
                hnj(taVar.hnj(i10), taVar.dkl() + f10, taVar.dse() + f11);
            }
        }
    }

    private void hnj(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == 1073741824) {
            this.f12441hn.dkl(size2);
        }
        if (mode == 1073741824) {
            this.f12441hn.gjv(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.f12441hn.dnm(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.f12441hn.ta(size);
        }
        this.f12441hn.hnj(Float.NaN, Float.NaN);
    }

    protected static void hnj(hnj hnjVar, ta taVar, View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            taVar.hnj(com.bytedance.adsdk.ugeno.yoga.qor.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            if (background.getPadding(rect)) {
                taVar.hn(com.bytedance.adsdk.ugeno.yoga.gjv.LEFT, rect.left);
                taVar.hn(com.bytedance.adsdk.ugeno.yoga.gjv.TOP, rect.top);
                taVar.hn(com.bytedance.adsdk.ugeno.yoga.gjv.RIGHT, rect.right);
                taVar.hn(com.bytedance.adsdk.ugeno.yoga.gjv.BOTTOM, rect.bottom);
            }
        }
        for (int i10 = 0; i10 < hnjVar.hnj.size(); i10++) {
            int iKeyAt = hnjVar.hnj.keyAt(i10);
            float fFloatValue = hnjVar.hnj.valueAt(i10).floatValue();
            if (iKeyAt == 4) {
                taVar.qor(com.bytedance.adsdk.ugeno.yoga.hnj.hnj(Math.round(fFloatValue)));
            } else if (iKeyAt == 0) {
                taVar.hnj(com.bytedance.adsdk.ugeno.yoga.hnj.hnj(Math.round(fFloatValue)));
            } else if (iKeyAt == 9) {
                taVar.hn(com.bytedance.adsdk.ugeno.yoga.hnj.hnj(Math.round(fFloatValue)));
            } else if (iKeyAt == 25) {
                taVar.bug(fFloatValue);
            } else if (iKeyAt == 8) {
                if (fFloatValue < 0.0f) {
                    taVar.qor();
                } else {
                    taVar.qor(fFloatValue);
                }
            } else if (iKeyAt == 1) {
                taVar.hnj(sk.hnj(Math.round(fFloatValue)));
            } else if (iKeyAt == 6) {
                taVar.hnj(fFloatValue);
            } else if (iKeyAt == 7) {
                taVar.hn(fFloatValue);
            } else if (iKeyAt == 16) {
                if (fFloatValue == -1.0f) {
                    taVar.dse(100.0f);
                } else if (fFloatValue == -2.0f) {
                    taVar.sk();
                } else {
                    taVar.dkl(fFloatValue);
                }
            } else if (iKeyAt == 18) {
                taVar.hnj(com.bytedance.adsdk.ugeno.yoga.gjv.LEFT, fFloatValue);
            } else if (iKeyAt == 3) {
                taVar.hnj(dkl.hnj(Math.round(fFloatValue)));
            } else if (iKeyAt == 17) {
                taVar.hnj(com.bytedance.adsdk.ugeno.yoga.gjv.TOP, fFloatValue);
            } else if (iKeyAt == 20) {
                taVar.hnj(com.bytedance.adsdk.ugeno.yoga.gjv.RIGHT, fFloatValue);
            } else if (iKeyAt == 19) {
                taVar.hnj(com.bytedance.adsdk.ugeno.yoga.gjv.BOTTOM, fFloatValue);
            } else if (iKeyAt == 28) {
                taVar.ojm(fFloatValue);
            } else if (iKeyAt == 27) {
                taVar.aq(fFloatValue);
            } else if (iKeyAt == 22) {
                taVar.hn(com.bytedance.adsdk.ugeno.yoga.gjv.LEFT, fFloatValue);
            } else if (iKeyAt == 21) {
                taVar.hn(com.bytedance.adsdk.ugeno.yoga.gjv.TOP, fFloatValue);
            } else if (iKeyAt == 24) {
                taVar.hn(com.bytedance.adsdk.ugeno.yoga.gjv.RIGHT, fFloatValue);
            } else if (iKeyAt == 23) {
                taVar.hn(com.bytedance.adsdk.ugeno.yoga.gjv.BOTTOM, fFloatValue);
            } else if (iKeyAt == 11) {
                taVar.qor(com.bytedance.adsdk.ugeno.yoga.gjv.LEFT, fFloatValue);
            } else if (iKeyAt == 10) {
                taVar.qor(com.bytedance.adsdk.ugeno.yoga.gjv.TOP, fFloatValue);
            } else if (iKeyAt == 13) {
                taVar.qor(com.bytedance.adsdk.ugeno.yoga.gjv.RIGHT, fFloatValue);
            } else if (iKeyAt == 12) {
                taVar.qor(com.bytedance.adsdk.ugeno.yoga.gjv.BOTTOM, fFloatValue);
            } else if (iKeyAt == 14) {
                taVar.hnj(orl.hnj(Math.round(fFloatValue)));
            } else if (iKeyAt == 15) {
                if (fFloatValue == -1.0f) {
                    taVar.sk(100.0f);
                } else if (fFloatValue == -2.0f) {
                    taVar.gjv();
                } else {
                    taVar.gjv(fFloatValue);
                }
            } else if (iKeyAt == 2) {
                taVar.hnj(mjg.hnj(Math.round(fFloatValue)));
            }
        }
    }

    public void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        this.qor = qorVar;
    }
}
