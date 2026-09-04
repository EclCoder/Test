package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import n0.a1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f1161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f1162j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f1163k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f1164l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f1165m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private LinearLayout f1166n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f1167o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f1168p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1169q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1170r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1171s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1172t;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f1173a;

        a(androidx.appcompat.view.b bVar) {
            this.f1173a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1173a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f1166n == null) {
            LayoutInflater.from(getContext()).inflate(h.g.f39948a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1166n = linearLayout;
            this.f1167o = (TextView) linearLayout.findViewById(h.f.f39926e);
            this.f1168p = (TextView) this.f1166n.findViewById(h.f.f39925d);
            if (this.f1169q != 0) {
                this.f1167o.setTextAppearance(getContext(), this.f1169q);
            }
            if (this.f1170r != 0) {
                this.f1168p.setTextAppearance(getContext(), this.f1170r);
            }
        }
        this.f1167o.setText(this.f1161i);
        this.f1168p.setText(this.f1162j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f1161i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f1162j);
        this.f1168p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f1166n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f1166n.getParent() == null) {
            addView(this.f1166n);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ a1 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f1163k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1162j;
    }

    public CharSequence getTitle() {
        return this.f1161i;
    }

    public void h(androidx.appcompat.view.b bVar) {
        View view = this.f1163k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f1172t, (ViewGroup) this, false);
            this.f1163k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f1163k);
        }
        View viewFindViewById = this.f1163k.findViewById(h.f.f39930i);
        this.f1164l = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
        c cVar = this.f1507d;
        if (cVar != null) {
            cVar.B();
        }
        c cVar2 = new c(getContext());
        this.f1507d = cVar2;
        cVar2.M(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f1507d, this.f1505b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1507d.r(this);
        this.f1506c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f1506c, layoutParams);
    }

    public boolean j() {
        return this.f1171s;
    }

    public void k() {
        removeAllViews();
        this.f1165m = null;
        this.f1506c = null;
        this.f1507d = null;
        View view = this.f1164l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        c cVar = this.f1507d;
        if (cVar != null) {
            return cVar.N();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1507d;
        if (cVar != null) {
            cVar.E();
            this.f1507d.F();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zB = z0.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1163k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1163k.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = androidx.appcompat.widget.a.d(paddingRight, i14, zB);
            paddingRight = androidx.appcompat.widget.a.d(iD + e(this.f1163k, iD, paddingTop, paddingTop2, zB), i15, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f1166n;
        if (linearLayout != null && this.f1165m == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f1166n, iE, paddingTop, paddingTop2, zB);
        }
        View view2 = this.f1165m;
        if (view2 != null) {
            e(view2, iE, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1506c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f1508e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f1163k;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1163k.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1506c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f1506c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f1166n;
        if (linearLayout != null && this.f1165m == null) {
            if (this.f1171s) {
                this.f1166n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f1166n.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f1166n.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f1165m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f1165m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f1508e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i10) {
        this.f1508e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1165m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1165m = view;
        if (view != null && (linearLayout = this.f1166n) != null) {
            removeView(linearLayout);
            this.f1166n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1162j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1161i = charSequence;
        i();
        n0.q0.o0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f1171s) {
            requestLayout();
        }
        this.f1171s = z10;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.f39854g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        o0 o0VarV = o0.v(context, attributeSet, h.j.f40123y, i10, 0);
        setBackground(o0VarV.g(h.j.f40128z));
        this.f1169q = o0VarV.n(h.j.D, 0);
        this.f1170r = o0VarV.n(h.j.C, 0);
        this.f1508e = o0VarV.m(h.j.B, 0);
        this.f1172t = o0VarV.n(h.j.A, h.g.f39951d);
        o0VarV.x();
    }
}
