package com.google.android.material.overflow;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.o0;
import androidx.appcompat.widget.t0;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonGroup;
import com.google.android.material.internal.z;
import com.google.android.material.overflow.OverflowLinearLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import jc.b;
import sb.c;
import sb.e;
import sb.i;
import sb.k;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class OverflowLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f20687d = l.C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaterialButton f20688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f20690c;

    /* JADX WARN: Illegal instructions before constructor call */
    public OverflowLinearLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f20687d;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f20689b = false;
        this.f20690c = new LinkedHashSet();
        Context context2 = getContext();
        o0 o0VarJ = z.j(context2, attributeSet, m.f52047k9, i10, i11, new int[0]);
        Drawable drawableG = o0VarJ.g(m.f52062l9);
        o0VarJ.x();
        MaterialButton materialButton = (MaterialButton) LayoutInflater.from(context2).inflate(i.f51819r, (ViewGroup) this, false);
        this.f20688a = materialButton;
        t0.a(materialButton, getResources().getString(k.f51848t));
        setOverflowButtonIcon(drawableG);
        if (materialButton.getContentDescription() == null) {
            materialButton.setContentDescription(context2.getString(k.f51847s));
        }
        final e0 e0Var = new e0(getContext(), materialButton, 17, 0, b.k(this, c.f51603d0));
        final int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(e.W);
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: hc.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f40324a.h(e0Var, dimensionPixelOffset);
            }
        });
    }

    public static /* synthetic */ boolean a(View view, MenuItem menuItem, MenuItem menuItem2) {
        view.performClick();
        if (menuItem.isCheckable()) {
            menuItem.setChecked(!menuItem.isChecked());
        }
        return true;
    }

    private int f(boolean z10, View view, int i10, int i11) {
        int measuredHeight;
        int i12;
        int minimumHeight;
        int i13;
        measureChild(view, i10, i11);
        a aVar = (a) view.getLayoutParams();
        if (z10) {
            measuredHeight = view.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar).leftMargin;
            i12 = ((LinearLayout.LayoutParams) aVar).rightMargin;
        } else {
            measuredHeight = view.getMeasuredHeight() + ((LinearLayout.LayoutParams) aVar).topMargin;
            i12 = ((LinearLayout.LayoutParams) aVar).bottomMargin;
        }
        int i14 = measuredHeight + i12;
        if (i14 != 0) {
            return i14;
        }
        if (z10) {
            minimumHeight = view.getMinimumWidth() + ((LinearLayout.LayoutParams) aVar).leftMargin;
            i13 = ((LinearLayout.LayoutParams) aVar).rightMargin;
        } else {
            minimumHeight = view.getMinimumHeight() + ((LinearLayout.LayoutParams) aVar).topMargin;
            i13 = ((LinearLayout.LayoutParams) aVar).bottomMargin;
        }
        return minimumHeight + i13;
    }

    private int g(boolean z10, View view, int i10, int i11) {
        int measuredHeight;
        int i12;
        measureChild(view, i10, i11);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (z10) {
            measuredHeight = view.getMeasuredWidth() + layoutParams.leftMargin;
            i12 = layoutParams.rightMargin;
        } else {
            measuredHeight = view.getMeasuredHeight() + layoutParams.topMargin;
            i12 = layoutParams.bottomMargin;
        }
        return measuredHeight + i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(e0 e0Var, int i10) {
        int i11;
        e0Var.a().clear();
        e0Var.b(true);
        for (final View view : this.f20690c) {
            a aVar = (a) view.getLayoutParams();
            final MenuItem menuItemAdd = e0Var.a().add(MaterialButtonGroup.c.a(view, aVar.f20692b));
            Drawable drawable = aVar.f20691a;
            if (drawable != null) {
                i11 = i10;
                menuItemAdd.setIcon(new InsetDrawable(drawable, i11, 0, i10, 0));
            } else {
                i11 = i10;
            }
            if (view instanceof MaterialButton) {
                MaterialButton materialButton = (MaterialButton) view;
                menuItemAdd.setCheckable(materialButton.s());
                menuItemAdd.setChecked(materialButton.isChecked());
            }
            menuItemAdd.setEnabled(view.isEnabled());
            menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: hc.b
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return OverflowLinearLayout.a(view, menuItemAdd, menuItem);
                }
            });
            i10 = i11;
        }
        e0Var.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return getOrientation() == 0 ? new a(-2, -2) : new a(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a(layoutParams);
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new a((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public Drawable getOverflowButtonIcon() {
        return this.f20688a.getIcon();
    }

    public Set<View> getOverflowedViews() {
        return this.f20690c;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        boolean z10 = getOrientation() == 0;
        int childCount = this.f20689b ? getChildCount() - 1 : getChildCount();
        int size = z10 ? View.MeasureSpec.getSize(i10) : View.MeasureSpec.getSize(i11);
        int iG = g(z10, this.f20688a, i10, i11);
        this.f20688a.setVisibility(8);
        this.f20690c.clear();
        int iF = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            childAt.setVisibility(0);
            iF += f(z10, childAt, i10, i11);
            if (iF + iG > size) {
                this.f20690c.add(childAt);
            }
            if (iF > size) {
                for (int i13 = i12 + 1; i13 < childCount; i13++) {
                    this.f20690c.add(getChildAt(i13));
                }
                Iterator it = this.f20690c.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setVisibility(8);
                }
                if (!this.f20689b) {
                    addView(this.f20688a);
                    this.f20689b = true;
                }
                this.f20688a.setVisibility(0);
                super.onMeasure(i10, i11);
            }
        }
        this.f20688a.setVisibility(8);
        this.f20690c.clear();
        super.onMeasure(i10, i11);
    }

    public void setOverflowButtonIcon(Drawable drawable) {
        this.f20688a.setIcon(drawable);
    }

    public void setOverflowButtonIconResource(int i10) {
        this.f20688a.setIconResource(i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f20691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f20692b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f20691a = null;
            this.f20692b = null;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f52077m9);
            this.f20691a = typedArrayObtainStyledAttributes.getDrawable(m.f52092n9);
            this.f20692b = typedArrayObtainStyledAttributes.getText(m.f52107o9);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(int i10, int i11) {
            super(i10, i11);
            this.f20691a = null;
            this.f20692b = null;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f20691a = null;
            this.f20692b = null;
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f20691a = null;
            this.f20692b = null;
        }

        public a(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f20691a = null;
            this.f20692b = null;
        }
    }
}
