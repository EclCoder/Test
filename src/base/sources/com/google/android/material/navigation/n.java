package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.o0;
import com.google.android.material.internal.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class n extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f20651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f20652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f20653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MenuInflater f20654d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class d extends u0.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Bundle f20656c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel, ClassLoader classLoader) {
            this.f20656c = parcel.readBundle(classLoader);
        }

        @Override // u0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f20656c);
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01f5  */
    public n(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        k kVar = new k();
        this.f20653c = kVar;
        Context context2 = getContext();
        int[] iArr = sb.m.K7;
        int i12 = sb.m.f51924c8;
        int i13 = sb.m.f51892a8;
        o0 o0VarJ = z.j(context2, attributeSet, iArr, i10, i11, i12, i13);
        g gVar = new g(context2, getClass(), getMaxItemCount(), e());
        this.f20651a = gVar;
        j jVarC = c(context2);
        this.f20652b = jVarC;
        jVarC.setMinimumHeight(getSuggestedMinimumHeight());
        jVarC.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        kVar.l(jVarC);
        kVar.a(1);
        jVarC.setPresenter(kVar);
        gVar.b(kVar);
        kVar.k(getContext(), gVar);
        int i14 = sb.m.W7;
        if (o0VarJ.s(i14)) {
            jVarC.setIconTintList(o0VarJ.c(i14));
        } else {
            jVarC.setIconTintList(jVarC.e(R.attr.textColorSecondary));
        }
        setItemIconSize(o0VarJ.f(sb.m.V7, getResources().getDimensionPixelSize(sb.e.W0)));
        if (o0VarJ.s(i12)) {
            setItemTextAppearanceInactive(o0VarJ.n(i12, 0));
        }
        if (o0VarJ.s(i13)) {
            setItemTextAppearanceActive(o0VarJ.n(i13, 0));
        }
        int i15 = sb.m.P7;
        if (o0VarJ.s(i15)) {
            setHorizontalItemTextAppearanceInactive(o0VarJ.n(i15, 0));
        }
        int i16 = sb.m.O7;
        if (o0VarJ.s(i16)) {
            setHorizontalItemTextAppearanceActive(o0VarJ.n(i16, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(o0VarJ.a(sb.m.f51908b8, true));
        int i17 = sb.m.f51940d8;
        if (o0VarJ.s(i17)) {
            setItemTextColor(o0VarJ.c(i17));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListG = com.google.android.material.drawable.c.g(background);
        if (background == null || colorStateListG != null) {
            mc.i iVar = new mc.i(mc.p.k(context2, attributeSet, i10, i11).m());
            if (colorStateListG != null) {
                iVar.l0(colorStateListG);
            }
            iVar.Y(context2);
            setBackground(iVar);
        }
        int i18 = sb.m.Y7;
        if (o0VarJ.s(i18)) {
            setItemPaddingTop(o0VarJ.f(i18, 0));
        }
        int i19 = sb.m.X7;
        if (o0VarJ.s(i19)) {
            setItemPaddingBottom(o0VarJ.f(i19, 0));
        }
        int i20 = sb.m.L7;
        if (o0VarJ.s(i20)) {
            setActiveIndicatorLabelPadding(o0VarJ.f(i20, 0));
        }
        int i21 = sb.m.Q7;
        if (o0VarJ.s(i21)) {
            setIconLabelHorizontalSpacing(o0VarJ.f(i21, 0));
        }
        int i22 = sb.m.N7;
        if (o0VarJ.s(i22)) {
            setElevation(o0VarJ.f(i22, 0));
        }
        getBackground().mutate().setTintList(jc.c.b(context2, o0VarJ, sb.m.M7));
        int dimensionPixelSize = -1;
        setLabelVisibilityMode(o0VarJ.l(sb.m.f51986g8, -1));
        setItemIconGravity(o0VarJ.l(sb.m.U7, 0));
        setItemGravity(o0VarJ.l(sb.m.T7, 49));
        int iN = o0VarJ.n(sb.m.S7, 0);
        if (iN != 0) {
            jVarC.setItemBackgroundRes(iN);
        } else {
            setItemRippleColor(jc.c.b(context2, o0VarJ, sb.m.Z7));
        }
        setMeasureBottomPaddingFromLabelBaseline(o0VarJ.a(sb.m.f52001h8, true));
        setLabelFontScalingEnabled(o0VarJ.a(sb.m.f51956e8, false));
        setLabelMaxLines(o0VarJ.l(sb.m.f51971f8, 1));
        int iN2 = o0VarJ.n(sb.m.R7, 0);
        if (iN2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iN2, sb.m.f52240x7);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(sb.m.f52270z7, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize2);
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(sb.m.f52255y7, 0));
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(sb.m.I7, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            int i23 = sb.m.H7;
            String string = typedArrayObtainStyledAttributes.getString(i23);
            if (string == null) {
                dimensionPixelSize = -2;
            } else if (!String.valueOf(-1).equals(string)) {
                if (String.valueOf(-2).equals(string)) {
                    dimensionPixelSize = -2;
                } else {
                    dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i23, -2);
                }
            }
            setItemActiveIndicatorExpandedWidth(dimensionPixelSize);
            setItemActiveIndicatorExpandedHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(sb.m.F7, dimensionPixelSize2));
            setItemActiveIndicatorExpandedMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(sb.m.G7, dimensionPixelOffset));
            int dimensionPixelSize3 = getResources().getDimensionPixelSize(sb.e.Q);
            int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(sb.m.D7, dimensionPixelSize3);
            int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(sb.m.C7, dimensionPixelSize3);
            f(getLayoutDirection() == 1 ? dimensionPixelOffset3 : dimensionPixelOffset2, typedArrayObtainStyledAttributes.getDimensionPixelOffset(sb.m.E7, 0), getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2, typedArrayObtainStyledAttributes.getDimensionPixelOffset(sb.m.B7, 0));
            setItemActiveIndicatorColor(jc.c.a(context2, typedArrayObtainStyledAttributes, sb.m.A7));
            setItemActiveIndicatorShapeAppearance(mc.p.h(context2, typedArrayObtainStyledAttributes.getResourceId(sb.m.J7, 0), 0).m());
            typedArrayObtainStyledAttributes.recycle();
        }
        int i24 = sb.m.f52016i8;
        if (o0VarJ.s(i24)) {
            d(o0VarJ.n(i24, 0));
        }
        o0VarJ.x();
        if (!g()) {
            addView(jVarC);
        }
        gVar.W(new a());
    }

    static /* synthetic */ b a(n nVar) {
        nVar.getClass();
        return null;
    }

    static /* synthetic */ c b(n nVar) {
        nVar.getClass();
        return null;
    }

    private MenuInflater getMenuInflater() {
        if (this.f20654d == null) {
            this.f20654d = new androidx.appcompat.view.g(getContext());
        }
        return this.f20654d;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z10) {
        this.f20652b.setMeasurePaddingFromLabelBaseline(z10);
    }

    protected abstract j c(Context context);

    public void d(int i10) {
        this.f20653c.m(true);
        getMenuInflater().inflate(i10, this.f20651a);
        this.f20653c.m(false);
        this.f20653c.h(true);
    }

    protected boolean e() {
        return false;
    }

    public void f(int i10, int i11, int i12, int i13) {
        this.f20652b.o(i10, i11, i12, i13);
    }

    public boolean g() {
        return false;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f20652b.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f20652b.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f20652b.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f20652b.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f20652b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f20652b.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f20652b.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f20652b.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f20652b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f20652b.getItemActiveIndicatorMarginHorizontal();
    }

    public mc.p getItemActiveIndicatorShapeAppearance() {
        return this.f20652b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f20652b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f20652b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f20652b.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.f20652b.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.f20652b.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.f20652b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f20652b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f20652b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f20652b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f20652b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f20652b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f20652b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f20652b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f20652b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f20651a;
    }

    public androidx.appcompat.view.menu.k getMenuView() {
        return this.f20652b;
    }

    public ViewGroup getMenuViewGroup() {
        return this.f20652b;
    }

    public k getPresenter() {
        return this.f20653c;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f20652b.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.f20652b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mc.j.e(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.a());
        this.f20651a.T(dVar.f20656c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.f20656c = bundle;
        this.f20651a.V(bundle);
        return dVar;
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f20652b.setActiveIndicatorLabelPadding(i10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        mc.j.d(this, f10);
    }

    public void setHorizontalItemTextAppearanceActive(int i10) {
        this.f20652b.setHorizontalItemTextAppearanceActive(i10);
    }

    public void setHorizontalItemTextAppearanceInactive(int i10) {
        this.f20652b.setHorizontalItemTextAppearanceInactive(i10);
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        this.f20652b.setIconLabelHorizontalSpacing(i10);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f20652b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f20652b.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorExpandedHeight(int i10) {
        this.f20652b.setItemActiveIndicatorExpandedHeight(i10);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i10) {
        this.f20652b.setItemActiveIndicatorExpandedMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorExpandedWidth(int i10) {
        this.f20652b.setItemActiveIndicatorExpandedWidth(i10);
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f20652b.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f20652b.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(mc.p pVar) {
        this.f20652b.setItemActiveIndicatorShapeAppearance(pVar);
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f20652b.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f20652b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        this.f20652b.setItemBackgroundRes(i10);
    }

    public void setItemGravity(int i10) {
        if (this.f20652b.getItemGravity() != i10) {
            this.f20652b.setItemGravity(i10);
            this.f20653c.h(false);
        }
    }

    public void setItemIconGravity(int i10) {
        if (this.f20652b.getItemIconGravity() != i10) {
            this.f20652b.setItemIconGravity(i10);
            this.f20653c.h(false);
        }
    }

    public void setItemIconSize(int i10) {
        this.f20652b.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f20652b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i10) {
        this.f20652b.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(int i10) {
        this.f20652b.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f20652b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f20652b.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f20652b.setItemTextAppearanceActiveBoldEnabled(z10);
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f20652b.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f20652b.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.f20652b.setLabelFontScalingEnabled(z10);
    }

    public void setLabelMaxLines(int i10) {
        this.f20652b.setLabelMaxLines(i10);
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f20652b.getLabelVisibilityMode() != i10) {
            this.f20652b.setLabelVisibilityMode(i10);
            this.f20653c.h(false);
        }
    }

    public void setSelectedItemId(int i10) {
        MenuItem menuItemFindItem = this.f20651a.findItem(i10);
        if (menuItemFindItem != null) {
            boolean zP = this.f20651a.P(menuItemFindItem, this.f20653c, 0);
            if (menuItemFindItem.isCheckable()) {
                if (!zP || menuItemFindItem.isChecked()) {
                    this.f20652b.setCheckedItem(menuItemFindItem);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements androidx.appcompat.view.menu.e.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            n.a(n.this);
            n.b(n.this);
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
        }
    }

    public void setOnItemReselectedListener(b bVar) {
    }

    public void setOnItemSelectedListener(c cVar) {
    }
}
