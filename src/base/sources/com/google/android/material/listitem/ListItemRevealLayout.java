package com.google.android.material.listitem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.o0;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.z;
import java.lang.ref.WeakReference;
import sb.e;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class ListItemRevealLayout extends ViewGroup implements ec.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f20470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f20471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f20472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f20475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f20476j;

    public ListItemRevealLayout(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, l.f51881y);
    }

    private int a() {
        WeakReference weakReference = this.f20472f;
        if (weakReference == null || weakReference.get() == null) {
            return getParent() instanceof View ? ((View) getParent()).getMeasuredWidth() : this.f20467a;
        }
        return ((View) this.f20472f.get()).getMeasuredWidth();
    }

    private Integer b() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt(i10).getVisibility() != 8) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    private Integer c() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount).getVisibility() != 8) {
                return Integer.valueOf(childCount);
            }
        }
        return null;
    }

    private View d() {
        if (!(getParent() instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof ec.b) {
                return childAt;
            }
        }
        return null;
    }

    private void e(int i10) {
        Integer numB = b.a(this) == (getLayoutDirection() == 1) ? b() : c();
        if (numB != null) {
            int paddingStart = getPaddingStart() + getPaddingEnd();
            int i11 = this.f20469c;
            int i12 = this.f20467a;
            float fMax = Math.max(0.0f, Math.min(1.0f, (i11 - i12) / (i10 - i12)));
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() != 8 && i13 != numB.intValue()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(tb.b.c(Math.max(this.f20470d[i13], this.f20473g), this.f20473g, fMax), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f20471e[i13], 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    paddingStart += marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + this.f20473g;
                    if (childAt instanceof MaterialButton) {
                        MaterialButton materialButton = (MaterialButton) childAt;
                        if (materialButton.getIcon() != null) {
                            materialButton.getIcon().setAlpha(tb.b.c(255, 0, fMax));
                        }
                    }
                }
            }
            View childAt2 = getChildAt(numB.intValue());
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
            childAt2.measure(View.MeasureSpec.makeMeasureSpec(tb.b.c(this.f20470d[numB.intValue()], ((i10 - paddingStart) - marginLayoutParams2.rightMargin) - marginLayoutParams2.leftMargin, fMax) + Math.max(this.f20469c - i10, 0), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f20471e[numB.intValue()], 1073741824));
            if (childAt2 instanceof MaterialButton) {
                MaterialButton materialButton2 = (MaterialButton) childAt2;
                if (materialButton2.getIcon() != null) {
                    materialButton2.getIcon().setAlpha(255);
                }
            }
        }
        setMeasuredDimension(this.f20469c, this.f20468b);
    }

    private void f(int i10) {
        int i11 = this.f20467a;
        int iB = (int) tb.b.b(0.0f, 255.0f, i11 / 4.0f, i11 / 2.0f, this.f20469c);
        float f10 = this.f20469c / this.f20467a;
        int paddingLeft = (int) (getPaddingLeft() * f10);
        int paddingRight = (int) (getPaddingRight() * f10);
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                int iMax = Math.max(this.f20473g, (int) (this.f20470d[i13] * f10));
                childAt.measure(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f20471e[i13], 1073741824));
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                i12 += iMax + ((int) (marginLayoutParams.leftMargin * f10)) + ((int) (marginLayoutParams.rightMargin * f10));
                if (childAt instanceof MaterialButton) {
                    MaterialButton materialButton = (MaterialButton) childAt;
                    if (materialButton.getIcon() != null) {
                        materialButton.getIcon().setAlpha(iB);
                    }
                }
            }
        }
        setMeasuredDimension(Math.max(this.f20469c, i12 + paddingLeft + paddingRight), this.f20468b);
    }

    private void h(int i10) {
        this.f20470d = new int[i10];
        this.f20471e = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                this.f20470d[i11] = childAt.getMeasuredWidth();
                this.f20471e[i11] = childAt.getMeasuredHeight();
                if (((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).height == -1) {
                    this.f20471e[i11] = this.f20468b;
                }
            }
        }
    }

    private boolean i(int i10, int i11, int i12) {
        int mode;
        if (i12 == -1) {
            return true;
        }
        return (i10 == i11 || (mode = View.MeasureSpec.getMode(i11)) == 0 || (mode == 1073741824 && View.MeasureSpec.getSize(i11) == i12)) ? false : true;
    }

    void g(int i10, int i11) {
        int i12;
        int i13;
        int childCount = getChildCount();
        int i14 = 0;
        int measuredWidth = 0;
        int iMax = 0;
        int iCombineMeasuredStates = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                i12 = i10;
                i13 = i11;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                i12 = i10;
                i13 = i11;
                measureChildWithMargins(childAt, i12, measuredWidth, i13, 0);
                measuredWidth += childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
            i14++;
            i10 = i12;
            i11 = i13;
        }
        int i15 = i10;
        int i16 = i11;
        int iMax2 = Math.max(measuredWidth + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth());
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i16, 0) & 16777215;
        this.f20467a = View.resolveSizeAndState(iMax2, i15, 0);
        this.f20468b = View.resolveSizeAndState(iResolveSizeAndState, i16, iCombineMeasuredStates << 16);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // ec.a
    public int getIntrinsicWidth() {
        int i10 = this.f20467a;
        if (i10 != -1) {
            return i10;
        }
        return 0;
    }

    public int getMinChildWidth() {
        return this.f20473g;
    }

    @Override // ec.a
    public int getPrimaryActionSwipeMode() {
        return this.f20476j;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = this.f20469c;
        int i16 = this.f20467a;
        float f10 = i15 >= i16 ? 1.0f : i15 / i16;
        int paddingLeft = (int) (getPaddingLeft() * f10);
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        int i17 = 1;
        if (getLayoutDirection() == 1) {
            i14 = childCount - 1;
            i17 = -1;
        } else {
            i14 = 0;
        }
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt((i17 * i18) + i14);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i19 = marginLayoutParams.topMargin + paddingTop;
                int i20 = (int) (marginLayoutParams.leftMargin * f10);
                int i21 = (int) (marginLayoutParams.rightMargin * f10);
                int i22 = paddingLeft + i20;
                childAt.layout(i22, i19, i22 + measuredWidth, measuredHeight + i19);
                paddingLeft += i20 + measuredWidth + i21;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int childCount = getChildCount();
        if (i(this.f20475i, i11, this.f20468b) || i(this.f20474h, i10, this.f20467a)) {
            this.f20475i = i11;
            this.f20474h = i10;
            g(i10, i11);
            h(childCount);
        }
        WeakReference weakReference = this.f20472f;
        if (weakReference == null || weakReference.get() == null) {
            this.f20472f = new WeakReference(d());
        }
        int swipeMaxOvershoot = this.f20472f.get() != null ? ((ec.b) this.f20472f.get()).getSwipeMaxOvershoot() : 0;
        int iA = a();
        setVisibility(this.f20469c == 0 ? 4 : 0);
        int i12 = this.f20469c;
        if (i12 == 0) {
            setMeasuredDimension(0, this.f20468b);
            return;
        }
        if (childCount == 0) {
            setMeasuredDimension(i12, this.f20468b);
            return;
        }
        if (this.f20476j != 0) {
            int i13 = this.f20467a;
            if (i12 > swipeMaxOvershoot + i13 && iA > i13) {
                e(iA);
                return;
            }
        }
        f(childCount);
    }

    public void setMinChildWidth(int i10) {
        if (this.f20473g == i10) {
            return;
        }
        this.f20473g = i10;
        requestLayout();
    }

    public void setPrimaryActionSwipeMode(int i10) {
        this.f20476j = i10;
    }

    @Override // ec.a
    public void setRevealedWidth(int i10) {
        int iMax = Math.max(0, i10);
        if (this.f20469c == iMax) {
            return;
        }
        this.f20469c = iMax;
        requestLayout();
    }

    public ListItemRevealLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f20467a = -1;
        this.f20468b = -1;
        this.f20469c = 0;
        this.f20474h = -1;
        this.f20475i = -1;
        Context context2 = getContext();
        setClipToPadding(false);
        o0 o0VarJ = z.j(context2, attributeSet, m.f52207v4, i10, i11, new int[0]);
        this.f20473g = o0VarJ.f(m.f52222w4, getResources().getDimensionPixelSize(e.K));
        this.f20476j = o0VarJ.k(m.f52237x4, 0);
        o0VarJ.x();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
