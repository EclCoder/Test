package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.z;
import java.util.List;
import java.util.Set;
import o0.p;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class ChipGroup extends FlowLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f19834k = l.K;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f19837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.material.internal.a f19838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f19839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f19840j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.google.android.material.internal.a.b {
        a() {
        }

        @Override // com.google.android.material.internal.a.b
        public void a(Set set) {
            if (ChipGroup.this.f19837g != null) {
                e eVar = ChipGroup.this.f19837g;
                ChipGroup chipGroup = ChipGroup.this;
                eVar.a(chipGroup, chipGroup.f19838h.j(ChipGroup.this));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements e {
        b(d dVar) {
        }

        @Override // com.google.android.material.chip.ChipGroup.e
        public void a(ChipGroup chipGroup, List list) {
            if (ChipGroup.this.f19838h.l()) {
                ChipGroup.this.getCheckedChipId();
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {
        void a(ChipGroup chipGroup, List list);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class f implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f19843a;

        private f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(View.generateViewId());
                }
                ChipGroup.this.f19838h.e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f19843a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f19838h.n((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f19843a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        /* synthetic */ f(ChipGroup chipGroup, a aVar) {
            this();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sb.c.f51604e);
    }

    private int getVisibleChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof Chip) && h(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private boolean h(int i10) {
        return getChildAt(i10).getVisibility() == 0;
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    int g(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt instanceof Chip) && h(i11)) {
                if (((Chip) childAt) == view) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f19838h.k();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f19838h.j(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f19835e;
    }

    public int getChipSpacingVertical() {
        return this.f19836f;
    }

    public boolean i() {
        return this.f19838h.l();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f19839i;
        if (i10 != -1) {
            this.f19838h.f(i10);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        p.c1(accessibilityNodeInfo).w0(p.g.b(getRowCount(), c() ? getVisibleChipCount() : -1, false, i() ? 1 : 2));
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f19835e != i10) {
            this.f19835e = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f19836f != i10) {
            this.f19836f = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new b(dVar));
        }
    }

    public void setOnCheckedStateChangeListener(e eVar) {
        this.f19837g = eVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f19840j.f19843a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f19838h.p(z10);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        this.f19838h.q(z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f19834k;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a();
        this.f19838h = aVar;
        f fVar = new f(this, null);
        this.f19840j = fVar;
        TypedArray typedArrayI = z.i(getContext(), attributeSet, m.Z1, i10, i11, new int[0]);
        int dimensionPixelOffset = typedArrayI.getDimensionPixelOffset(m.f51902b2, 0);
        setChipSpacingHorizontal(typedArrayI.getDimensionPixelOffset(m.f51918c2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayI.getDimensionPixelOffset(m.f51934d2, dimensionPixelOffset));
        setSingleLine(typedArrayI.getBoolean(m.f51965f2, false));
        setSingleSelection(typedArrayI.getBoolean(m.f51980g2, false));
        setSelectionRequired(typedArrayI.getBoolean(m.f51950e2, false));
        this.f19839i = typedArrayI.getResourceId(m.f51886a2, -1);
        typedArrayI.recycle();
        aVar.o(new a());
        super.setOnHierarchyChangeListener(fVar);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
