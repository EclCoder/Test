package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.internal.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import mc.w;
import n0.q0;
import o0.p;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class MaterialButtonToggleGroup extends MaterialButtonGroup {
    private static final int B = l.S;
    private Set A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final LinkedHashSet f19622v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f19623w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f19624x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f19625y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f19626z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends n0.a {
        a() {
        }

        @Override // n0.a
        public void g(View view, p pVar) {
            super.g(view, pVar);
            pVar.x0(p.h.a(0, 1, MaterialButtonToggleGroup.this.I(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sb.c.C);
    }

    private void F(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.A);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f19624x && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f19625y || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        M(hashSet);
    }

    private void H(int i10, boolean z10) {
        Iterator it = this.f19622v.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, i10, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int I(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && r(i11)) {
                i10++;
            }
        }
        return -1;
    }

    private void L(int i10, boolean z10) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof MaterialButton) {
            this.f19623w = true;
            ((MaterialButton) viewFindViewById).setChecked(z10);
            this.f19623w = false;
        }
    }

    private void M(Set set) {
        Set set2 = this.A;
        this.A = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = m(i10).getId();
            L(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                H(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    private void N() {
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            m(i10).setA11yClassName(childrenA11yClassName);
        }
    }

    private String getChildrenA11yClassName() {
        return (this.f19624x ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && r(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private boolean r(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    public void E(b bVar) {
        this.f19622v.add(bVar);
    }

    public void G() {
        M(new HashSet());
    }

    public boolean J() {
        return this.f19624x;
    }

    void K(MaterialButton materialButton, boolean z10) {
        if (this.f19623w) {
            return;
        }
        F(materialButton.getId(), z10);
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        F(materialButton.getId(), materialButton.isChecked());
        q0.m0(materialButton, new a());
    }

    public int getCheckedButtonId() {
        if (!this.f19624x || this.A.isEmpty()) {
            return -1;
        }
        return ((Integer) this.A.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = m(i10).getId();
            if (this.A.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f19626z;
        if (i10 != -1) {
            M(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        p.c1(accessibilityNodeInfo).w0(p.g.b(1, getVisibleButtonCount(), false, J() ? 1 : 2));
    }

    @Override // com.google.android.material.button.MaterialButtonGroup
    boolean s() {
        return false;
    }

    public void setSelectionRequired(boolean z10) {
        this.f19625y = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f19624x != z10) {
            this.f19624x = z10;
            G();
        }
        N();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i10) {
        int i11 = B;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f19622v = new LinkedHashSet();
        this.f19623w = false;
        this.A = new HashSet();
        TypedArray typedArrayI = z.i(getContext(), attributeSet, m.J5, i10, i11, new int[0]);
        setSingleSelection(typedArrayI.getBoolean(m.N5, false));
        this.f19626z = typedArrayI.getResourceId(m.L5, -1);
        this.f19625y = typedArrayI.getBoolean(m.M5, false);
        if (this.f19605f == null) {
            this.f19605f = w.c(new mc.a(0.0f));
        }
        setEnabled(typedArrayI.getBoolean(m.K5, true));
        typedArrayI.recycle();
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
