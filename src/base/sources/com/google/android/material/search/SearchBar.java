package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.focus.FocusRingDrawable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class SearchBar extends Toolbar {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final int f20873y0 = sb.l.D;
    private final TextView U;
    private final TextView V;
    private final FrameLayout W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final int f20874a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f20875b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final ColorStateList f20876c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final boolean f20877d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final boolean f20878e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final com.google.android.material.search.a f20879f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final Drawable f20880g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final boolean f20881h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final boolean f20882i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private View f20883j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private Integer f20884k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private Drawable f20885l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f20886m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f20887n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private mc.i f20888o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f20889p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f20890q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final boolean f20891r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private final int f20892s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private ActionMenuView f20893t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private ImageButton f20894u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f20895v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f20896w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final AppBarLayout.f f20897x0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AppBarLayout.f {
        a() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.f
        public void a(float f10, int i10, float f11) {
            if (SearchBar.this.f20876c0 != null) {
                SearchBar.this.f20888o0.l0(ColorStateList.valueOf(ac.a.j(SearchBar.this.f20874a0, SearchBar.this.f20876c0.getDefaultColor(), f11)));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b extends u0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f20900c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel) {
            this(parcel, null);
        }

        @Override // u0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f20900c);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f20900c = parcel.readString();
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchBar(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f20873y0;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f20886m0 = -1;
        this.f20897x0 = new a();
        Context context2 = getContext();
        m0(attributeSet);
        this.f20892s0 = getResources().getDimensionPixelSize(sb.e.Z);
        this.f20880g0 = i.a.b(context2, getDefaultNavigationIconResource());
        this.f20879f0 = new com.google.android.material.search.a();
        TypedArray typedArrayI = com.google.android.material.internal.z.i(context2, attributeSet, sb.m.f52257y9, i10, i11, new int[0]);
        mc.p pVarM = mc.p.k(context2, attributeSet, i10, i11).m();
        int color = typedArrayI.getColor(sb.m.E9, 0);
        this.f20874a0 = color;
        this.f20876c0 = jc.c.a(context2, typedArrayI, sb.m.M9);
        float dimension = typedArrayI.getDimension(sb.m.H9, 0.0f);
        this.f20878e0 = typedArrayI.getBoolean(sb.m.F9, true);
        this.f20887n0 = typedArrayI.getBoolean(sb.m.G9, true);
        boolean z10 = typedArrayI.getBoolean(sb.m.K9, false);
        this.f20882i0 = typedArrayI.getBoolean(sb.m.J9, false);
        this.f20881h0 = typedArrayI.getBoolean(sb.m.S9, true);
        int i12 = sb.m.N9;
        if (typedArrayI.hasValue(i12)) {
            this.f20884k0 = Integer.valueOf(typedArrayI.getColor(i12, -1));
        }
        int resourceId = typedArrayI.getResourceId(sb.m.f52272z9, -1);
        String string = typedArrayI.getString(sb.m.B9);
        String string2 = typedArrayI.getString(sb.m.C9);
        float dimension2 = typedArrayI.getDimension(sb.m.Q9, -1.0f);
        int color2 = typedArrayI.getColor(sb.m.P9, 0);
        this.f20889p0 = typedArrayI.getBoolean(sb.m.R9, false);
        this.f20875b0 = typedArrayI.getBoolean(sb.m.L9, false);
        this.f20890q0 = typedArrayI.getDimensionPixelSize(sb.m.A9, -1);
        this.f20891r0 = typedArrayI.getBoolean(sb.m.D9, false);
        this.f20895v0 = typedArrayI.getResourceId(sb.m.O9, -1);
        this.f20896w0 = typedArrayI.getResourceId(sb.m.I9, -1);
        typedArrayI.recycle();
        if (!z10) {
            a0();
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(sb.i.K, this);
        this.f20877d0 = true;
        this.U = (TextView) findViewById(sb.g.U);
        this.V = (TextView) findViewById(sb.g.T);
        this.W = (FrameLayout) findViewById(sb.g.V);
        setElevation(dimension);
        b0(resourceId, string, string2);
        Z(pVarM, color, dimension, dimension2, color2);
    }

    private void V() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists == null || this.f20876c0 == null) {
            return;
        }
        appBarLayoutParentIfExists.c(this.f20897x0);
    }

    private int W(int i10, int i11) {
        return i10 == 0 ? i11 : i10;
    }

    private ActionMenuView X() {
        if (this.f20893t0 == null) {
            this.f20893t0 = com.google.android.material.internal.a0.a(this);
        }
        return this.f20893t0;
    }

    private ImageButton Y() {
        if (this.f20894u0 == null) {
            this.f20894u0 = com.google.android.material.internal.a0.d(this);
        }
        return this.f20894u0;
    }

    private void Z(mc.p pVar, int i10, float f10, float f11, int i11) {
        mc.i iVar = new mc.i(pVar);
        this.f20888o0 = iVar;
        iVar.Y(getContext());
        this.f20888o0.k0(f10);
        if (f11 >= 0.0f) {
            this.f20888o0.w0(f11, i11);
        }
        int iD = ac.a.d(this, h.a.f39867t);
        this.f20888o0.l0(ColorStateList.valueOf(i10));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iD);
        mc.i iVar2 = this.f20888o0;
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateListValueOf, iVar2, iVar2);
        FocusRingDrawable.x(getContext(), rippleDrawable, this.f20888o0);
        setBackground(rippleDrawable);
    }

    private void a0() {
        setNavigationIcon(getNavigationIcon() == null ? this.f20880g0 : getNavigationIcon());
        setNavigationIconDecorative(true);
    }

    private void b0(int i10, String str, String str2) {
        if (i10 != -1) {
            androidx.core.widget.i.m(this.U, i10);
            androidx.core.widget.i.m(this.V, i10);
        }
        setText(str);
        setHint(str2);
        setTextCentered(this.f20889p0);
    }

    private void c0(View view, int i10, int i11, int i12, int i13) {
        if (getLayoutDirection() == 1) {
            view.layout(getMeasuredWidth() - i12, i11, getMeasuredWidth() - i10, i13);
        } else {
            view.layout(i10, i11, i12, i13);
        }
    }

    private void d0() {
        int measuredWidth = (getMeasuredWidth() / 2) - (this.W.getMeasuredWidth() / 2);
        int measuredWidth2 = this.W.getMeasuredWidth() + measuredWidth;
        int measuredHeight = (getMeasuredHeight() / 2) - (this.W.getMeasuredHeight() / 2);
        int measuredHeight2 = this.W.getMeasuredHeight() + measuredHeight;
        boolean z10 = getLayoutDirection() == 1;
        View viewX = X();
        ImageButton imageButtonY = Y();
        int measuredWidth3 = (this.W.getMeasuredWidth() / 2) - (this.U.getMeasuredWidth() / 2);
        int measuredWidth4 = this.U.getMeasuredWidth() + measuredWidth3;
        int i10 = measuredWidth3 + measuredWidth;
        int i11 = measuredWidth4 + measuredWidth;
        View view = z10 ? viewX : imageButtonY;
        if (z10) {
            viewX = imageButtonY;
        }
        int iMax = view != null ? Math.max(view.getRight() - i10, 0) : 0;
        int i12 = i10 + iMax;
        int i13 = i11 + iMax;
        int iMax2 = viewX != null ? Math.max(i13 - viewX.getLeft(), 0) : 0;
        int i14 = i12 - iMax2;
        int i15 = i13 - iMax2;
        int iMax3 = ((iMax - iMax2) + Math.max(Math.max(getPaddingLeft() - i14, getContentInsetLeft() - i14), 0)) - Math.max(Math.max(i15 - (getMeasuredWidth() - getPaddingRight()), i15 - (getMeasuredWidth() - getContentInsetRight())), 0);
        this.W.layout(measuredWidth + iMax3, measuredHeight, measuredWidth2 + iMax3, measuredHeight2);
    }

    private void e0(View view) {
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i10 = measuredWidth2 + measuredWidth;
        int measuredHeight = view.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        c0(view, measuredWidth2, measuredHeight2, i10, measuredHeight2 + measuredHeight);
    }

    private Drawable f0(Drawable drawable) {
        int iD;
        if (!this.f20881h0 || drawable == null) {
            return drawable;
        }
        Integer num = this.f20884k0;
        if (num != null) {
            iD = num.intValue();
        } else {
            iD = ac.a.d(this, drawable == this.f20880g0 ? sb.c.f51616k : sb.c.f51614j);
        }
        Drawable drawableR = f0.a.r(drawable.mutate());
        drawableR.setTint(iD);
        return drawableR;
    }

    private void g0(int i10, int i11) {
        View view = this.f20883j0;
        if (view != null) {
            view.measure(i10, i11);
        }
    }

    private void h0() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.y(this.f20897x0);
        }
    }

    private void i0() {
        if (this.f20878e0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(sb.e.X);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = W(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = W(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = W(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = W(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private void j0() {
        int width;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        int right = 0;
        boolean z10 = getLayoutDirection() == 1;
        ImageButton imageButtonD = com.google.android.material.internal.a0.d(this);
        if (imageButtonD == null || !imageButtonD.isClickable()) {
            width = 0;
        } else {
            width = z10 ? getWidth() - imageButtonD.getLeft() : imageButtonD.getRight();
        }
        ActionMenuView actionMenuViewA = com.google.android.material.internal.a0.a(this);
        if (actionMenuViewA != null) {
            right = z10 ? actionMenuViewA.getRight() : getWidth() - actionMenuViewA.getLeft();
        }
        float f10 = -(z10 ? right : width);
        if (!z10) {
            width = right;
        }
        setHandwritingBoundsOffsets(f10, 0.0f, -width, 0.0f);
    }

    private void k0() {
        if (getLayoutParams() instanceof AppBarLayout.e) {
            AppBarLayout.e eVar = (AppBarLayout.e) getLayoutParams();
            if (this.f20887n0) {
                if (eVar.c() == 0) {
                    eVar.g(53);
                }
            } else if (eVar.c() == 53) {
                eVar.g(0);
            }
        }
    }

    private void setNavigationIconDecorative(boolean z10) {
        ImageButton imageButtonD = com.google.android.material.internal.a0.d(this);
        if (imageButtonD == null) {
            return;
        }
        imageButtonD.setClickable(!z10);
        imageButtonD.setFocusable(!z10);
        Drawable background = imageButtonD.getBackground();
        if (background != null) {
            this.f20885l0 = background;
        }
        imageButtonD.setBackgroundDrawable(z10 ? null : this.f20885l0);
        j0();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f20877d0 && this.f20883j0 == null && !(view instanceof ActionMenuView)) {
            this.f20883j0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i10, layoutParams);
    }

    AppBarLayout getAppBarLayoutParentIfExists() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    public View getCenterView() {
        return this.f20883j0;
    }

    float getCompatElevation() {
        mc.i iVar = this.f20888o0;
        return iVar != null ? iVar.D() : getElevation();
    }

    public float getCornerSize() {
        return this.f20888o0.R();
    }

    protected int getDefaultMarginVerticalResource() {
        return sb.e.Y;
    }

    protected int getDefaultNavigationIconResource() {
        return sb.f.f51737d;
    }

    public int getEndSiblingViewId() {
        return this.f20896w0;
    }

    public CharSequence getHint() {
        return this.U.getHint();
    }

    public int getMaxWidth() {
        return this.f20890q0;
    }

    int getMenuResId() {
        return this.f20886m0;
    }

    TextView getPlaceholderTextView() {
        return this.V;
    }

    public int getStartSiblingViewId() {
        return this.f20895v0;
    }

    public int getStrokeColor() {
        return this.f20888o0.N().getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.f20888o0.P();
    }

    public CharSequence getText() {
        return this.U.getText();
    }

    public boolean getTextCentered() {
        return this.f20889p0;
    }

    public TextView getTextView() {
        return this.U;
    }

    public void l0() {
        this.f20879f0.b(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mc.j.f(this, this.f20888o0);
        i0();
        k0();
        if (this.f20875b0) {
            V();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h0();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f20883j0;
        if (view != null) {
            e0(view);
        }
        j0();
        if (this.U == null || !this.f20889p0) {
            return;
        }
        d0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int i13 = this.f20890q0;
        if (i13 >= 0 && size > i13) {
            i10 = View.MeasureSpec.makeMeasureSpec(i13, mode);
        } else if (this.f20891r0 && size > (i12 = this.f20892s0)) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max(i12, Math.round(size * 0.5f)), mode);
        }
        super.onMeasure(i10, i11);
        g0(i10, i11);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setText(bVar.f20900c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        CharSequence text = getText();
        bVar.f20900c = text == null ? null : text.toString();
        return bVar;
    }

    public void setCenterView(View view) {
        View view2 = this.f20883j0;
        if (view2 != null) {
            removeView(view2);
            this.f20883j0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f20887n0 = z10;
        k0();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        mc.i iVar = this.f20888o0;
        if (iVar != null) {
            iVar.k0(f10);
        }
    }

    public void setEndSiblingViewId(int i10) {
        this.f20896w0 = i10;
    }

    public void setHint(CharSequence charSequence) {
        this.U.setHint(charSequence);
    }

    public void setLiftOnScroll(boolean z10) {
        this.f20875b0 = z10;
        if (z10) {
            V();
        } else {
            h0();
        }
    }

    public void setMaxWidth(int i10) {
        if (this.f20890q0 != i10) {
            this.f20890q0 = i10;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(f0(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.f20882i0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        this.f20879f0.a(z10);
    }

    void setPlaceholderText(String str) {
        this.V.setText(str);
    }

    public void setStartSiblingViewId(int i10) {
        this.f20895v0 = i10;
    }

    public void setStrokeColor(int i10) {
        if (getStrokeColor() != i10) {
            this.f20888o0.y0(ColorStateList.valueOf(i10));
        }
    }

    public void setStrokeWidth(float f10) {
        if (getStrokeWidth() != f10) {
            this.f20888o0.A0(f10);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.U.setText(charSequence);
        this.V.setText(charSequence);
    }

    public void setTextCentered(boolean z10) {
        this.f20889p0 = z10;
        TextView textView = this.U;
        if (textView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (z10) {
            layoutParams.gravity = 1;
            this.U.setGravity(1);
        } else {
            layoutParams.gravity = 0;
            this.U.setGravity(0);
        }
        this.U.setLayoutParams(layoutParams);
        this.V.setLayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void x(int i10) {
        super.x(i10);
        this.f20886m0 = i10;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f20898h;

        public ScrollingViewBehavior() {
            this.f20898h = false;
        }

        private void Y(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.d
        protected boolean T() {
            return true;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean zL = super.l(coordinatorLayout, view, view2);
            if (!this.f20898h && (view2 instanceof AppBarLayout)) {
                this.f20898h = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setTouchscreenBlocksFocus(false);
                Y(appBarLayout);
            }
            return zL;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f20898h = false;
        }
    }

    private void m0(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", CampaignEx.JSON_KEY_TITLE) != null) {
            throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
            throw new UnsupportedOperationException(NpmRNZ.eqhz);
        }
    }

    public void setHint(int i10) {
        this.U.setHint(i10);
    }

    public void setText(int i10) {
        this.U.setText(i10);
        this.V.setText(i10);
    }
}
