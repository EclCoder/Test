package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.widget.e0;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import mc.o;
import mc.p;
import mc.w;
import mc.x;
import mc.y;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class MaterialButtonGroup extends LinearLayout {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f19598t = l.A;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f19599u = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f19601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f19602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Comparator f19603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer[] f19604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    w f19605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private x f19606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private y f19608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f19610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MaterialButton f19612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e0 f19613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map f19614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Map f19615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f19616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f19617r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List f19618s;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c {
        public static CharSequence a(View view, CharSequence charSequence) {
            if (!TextUtils.isEmpty(charSequence)) {
                return charSequence;
            }
            if (view instanceof MaterialButton) {
                MaterialButton materialButton = (MaterialButton) view;
                if (!TextUtils.isEmpty(materialButton.getText())) {
                    return materialButton.getText();
                }
            }
            return view.getContentDescription();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class d implements MaterialButton.c {
        private d() {
        }

        @Override // com.google.android.material.button.MaterialButton.c
        public void a(MaterialButton materialButton, boolean z10) {
            MaterialButtonGroup.this.invalidate();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonGroup(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f19598t;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f19600a = 0;
        this.f19601b = new ArrayList();
        this.f19602c = new d();
        this.f19603d = new Comparator() { // from class: com.google.android.material.button.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MaterialButtonGroup.b(this.f19639a, (MaterialButton) obj, (MaterialButton) obj2);
            }
        };
        this.f19609j = true;
        this.f19614o = new HashMap();
        this.f19615p = new HashMap();
        this.f19616q = new ArrayList();
        this.f19617r = new ArrayList();
        this.f19618s = new ArrayList();
        Context context2 = getContext();
        TypedArray typedArrayI = z.i(context2, attributeSet, m.f52238x5, i10, i11, new int[0]);
        int i12 = m.A5;
        if (typedArrayI.hasValue(i12)) {
            this.f19608i = y.b(context2, typedArrayI, i12);
        }
        int i13 = m.E5;
        if (typedArrayI.hasValue(i13)) {
            x xVarH = x.h(context2, typedArrayI, i13);
            this.f19606g = xVarH;
            if (xVarH == null) {
                this.f19606g = new x.b(p.h(context2, typedArrayI.getResourceId(i13, 0), typedArrayI.getResourceId(m.F5, 0)).m()).j();
            }
        }
        int i14 = m.B5;
        if (typedArrayI.hasValue(i14)) {
            this.f19605f = w.b(context2, typedArrayI, i14, new mc.a(0.0f));
        }
        this.f19607h = typedArrayI.getDimensionPixelSize(m.f52268z5, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayI.getBoolean(m.f52253y5, true));
        setOverflowMode(typedArrayI.getInt(m.D5, 0));
        this.f19610k = getResources().getDimensionPixelOffset(sb.e.D);
        if (s()) {
            q(context2, typedArrayI);
        }
        typedArrayI.recycle();
    }

    private void A() {
        TreeMap treeMap = new TreeMap(this.f19603d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(m(i10), Integer.valueOf(i10));
        }
        this.f19604e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void C() {
        for (Map.Entry entry : this.f19615p.entrySet()) {
            Button button = (Button) entry.getKey();
            MenuItem menuItem = (MenuItem) entry.getValue();
            if (entry.getKey() instanceof MaterialButton) {
                MaterialButton materialButton = (MaterialButton) button;
                menuItem.setCheckable(materialButton.s());
                menuItem.setChecked(materialButton.isChecked());
            }
            menuItem.setEnabled(button.isEnabled());
        }
    }

    public static /* synthetic */ boolean a(Button button, MenuItem menuItem) {
        button.performClick();
        return true;
    }

    public static /* synthetic */ int b(MaterialButtonGroup materialButtonGroup, MaterialButton materialButton, MaterialButton materialButton2) {
        materialButtonGroup.getClass();
        int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(materialButtonGroup.indexOfChild(materialButton), materialButtonGroup.indexOfChild(materialButton2));
    }

    public static /* synthetic */ void c(MaterialButtonGroup materialButtonGroup, View view) {
        materialButtonGroup.C();
        materialButtonGroup.f19613n.c();
    }

    private MenuItem d(Menu menu, final Button button) {
        if (!(button.getLayoutParams() instanceof b)) {
            return null;
        }
        b bVar = (b) button.getLayoutParams();
        CharSequence charSequenceA = c.a(button, bVar.f19620b);
        Drawable drawable = bVar.f19619a;
        MenuItem menuItemAdd = menu.add(charSequenceA);
        if (drawable != null) {
            int i10 = this.f19610k;
            menuItemAdd.setIcon(new InsetDrawable(drawable, i10, 0, i10, 0));
        }
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.google.android.material.button.h
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return MaterialButtonGroup.a(button, menuItem);
            }
        });
        return menuItemAdd;
    }

    private void e() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            View childAt2 = getChildAt(i10 - 1);
            if ((childAt instanceof MaterialButton) && (childAt2 instanceof MaterialButton)) {
                MaterialButton materialButton = (MaterialButton) childAt;
                MaterialButton materialButton2 = (MaterialButton) childAt2;
                if (this.f19607h <= 0) {
                    iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                    iMin = 0;
                }
            } else {
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsH = h(childAt);
            if (getOrientation() == 0) {
                layoutParamsH.setMarginEnd(0);
                layoutParamsH.setMarginStart(this.f19607h - iMin);
                layoutParamsH.topMargin = 0;
            } else {
                layoutParamsH.bottomMargin = 0;
                layoutParamsH.topMargin = this.f19607h - iMin;
                layoutParamsH.setMarginStart(0);
            }
            childAt.setLayoutParams(layoutParamsH);
        }
        z(firstVisibleChildIndex);
    }

    private void f() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        if (firstVisibleChildIndex == -1 || this.f19608i == null) {
            return;
        }
        if (this.f19600a != 2) {
            g(firstVisibleChildIndex, lastVisibleChildIndex);
            return;
        }
        int i10 = 0;
        while (i10 < this.f19618s.size()) {
            g(((Integer) this.f19618s.get(i10)).intValue(), (i10 == this.f19618s.size() + (-1) ? getChildCount() : ((Integer) this.f19618s.get(i10 + 1)).intValue()) - 1);
            i10++;
        }
    }

    private void g(int i10, int i11) {
        MaterialButton.e eVar;
        if (i10 == i11) {
            m(i10).setWidthChangeDirection(MaterialButton.e.NONE);
            return;
        }
        int iMin = Integer.MAX_VALUE;
        int i12 = i10;
        while (i12 <= i11) {
            if (r(i12)) {
                MaterialButton materialButtonM = m(i12);
                if (i12 == i10) {
                    eVar = MaterialButton.e.END;
                } else {
                    eVar = i12 == i11 ? MaterialButton.e.START : MaterialButton.e.BOTH;
                }
                materialButtonM.setWidthChangeDirection(eVar);
                int iL = l(i12);
                if (i12 != i10 && i12 != i11) {
                    iL /= 2;
                }
                iMin = Math.min(iMin, iL);
            }
            i12++;
        }
        while (i10 <= i11) {
            if (r(i10)) {
                MaterialButton materialButtonM2 = m(i10);
                materialButtonM2.setSizeChange(this.f19608i);
                materialButtonM2.setWidthChangeMax(iMin * 2);
            }
            i10++;
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (r(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (r(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int l(int i10) {
        if (!r(i10) || this.f19608i == null) {
            return 0;
        }
        int iMax = Math.max(0, this.f19608i.c(m(i10).getWidth()));
        MaterialButton materialButtonP = p(i10, true);
        int allowedWidthDecrease = materialButtonP == null ? 0 : materialButtonP.getAllowedWidthDecrease();
        MaterialButton materialButtonN = n(i10, true);
        return Math.min(iMax, allowedWidthDecrease + (materialButtonN != null ? materialButtonN.getAllowedWidthDecrease() : 0));
    }

    private MaterialButton n(int i10, boolean z10) {
        int childCount = getChildCount();
        int i11 = i10 + 1;
        while (true) {
            if (i11 >= childCount) {
                i11 = -1;
                break;
            }
            if (r(i11)) {
                break;
            }
            i11++;
        }
        if (z10 && !this.f19618s.isEmpty()) {
            int i12 = 0;
            while (i12 < this.f19618s.size()) {
                int iIntValue = ((Integer) this.f19618s.get(i12)).intValue();
                int iIntValue2 = i12 == this.f19618s.size() + (-1) ? childCount - 1 : ((Integer) this.f19618s.get(i12 + 1)).intValue() - 1;
                if (i10 >= iIntValue && i10 <= iIntValue2 && (i11 < iIntValue || i11 > iIntValue2)) {
                    return null;
                }
                i12++;
            }
        }
        if (i11 == -1) {
            return null;
        }
        return m(i11);
    }

    private x.b o(boolean z10, boolean z11, int i10) {
        o oVar = this.f19606g;
        if (oVar == null || (!z10 && !z11)) {
            oVar = (o) this.f19601b.get(i10);
        }
        return !(oVar instanceof x) ? new x.b((p) this.f19601b.get(i10)) : ((x) oVar).m();
    }

    private MaterialButton p(int i10, boolean z10) {
        int childCount = getChildCount();
        int i11 = i10 - 1;
        while (true) {
            if (i11 < 0) {
                i11 = -1;
                break;
            }
            if (r(i11)) {
                break;
            }
            i11--;
        }
        if (z10 && !this.f19618s.isEmpty()) {
            int i12 = 0;
            while (i12 < this.f19618s.size()) {
                int iIntValue = ((Integer) this.f19618s.get(i12)).intValue();
                int iIntValue2 = i12 == this.f19618s.size() + (-1) ? childCount : ((Integer) this.f19618s.get(i12 + 1)).intValue();
                if (i10 >= iIntValue && i10 < iIntValue2 && (i11 < iIntValue || i11 >= iIntValue2)) {
                    return null;
                }
                i12++;
            }
        }
        if (i11 == -1) {
            return null;
        }
        return m(i11);
    }

    private boolean r(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    private void t(int i10, int i11) {
        if (this.f19611l) {
            if (this.f19600a != 1) {
                this.f19612m.setVisibility(8);
                return;
            }
            boolean z10 = getOrientation() == 0;
            this.f19616q.clear();
            int size = z10 ? View.MeasureSpec.getSize(i10) : View.MeasureSpec.getSize(i11);
            int iW = w(z10, this.f19612m, i10, i11);
            int iW2 = 0;
            for (int i12 = 0; i12 < getChildCount() - 1; i12++) {
                MaterialButton materialButtonM = m(i12);
                iW2 += w(z10, materialButtonM, i10, i11);
                if (iW2 + iW > size) {
                    this.f19616q.add(materialButtonM);
                }
                if (iW2 > size) {
                    for (int i13 = i12 + 1; i13 < getChildCount() - 1; i13++) {
                        this.f19616q.add(m(i13));
                    }
                    this.f19612m.setVisibility(0);
                    u();
                }
            }
            this.f19612m.setVisibility(8);
            this.f19616q.clear();
            u();
        }
    }

    private void u() {
        if (this.f19616q.equals(this.f19617r)) {
            return;
        }
        for (int i10 = 0; i10 < getChildCount() - 1; i10++) {
            MaterialButton materialButtonM = m(i10);
            if (this.f19615p.containsKey(materialButtonM)) {
                materialButtonM.setVisibility(0);
            }
        }
        this.f19617r.clear();
        this.f19617r.addAll(this.f19616q);
        Menu menuA = this.f19613n.a();
        this.f19614o.clear();
        this.f19615p.clear();
        menuA.clear();
        for (Button button : this.f19617r) {
            MenuItem menuItemD = d(menuA, button);
            if (menuItemD != null) {
                this.f19614o.put(Integer.valueOf(menuItemD.getItemId()), button);
                this.f19615p.put(button, menuItemD);
                button.setVisibility(8);
            }
        }
        C();
    }

    private int v(int i10, int i11) {
        this.f19618s.clear();
        int size = View.MeasureSpec.getSize(i10);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        int iMax = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            if (r(i14)) {
                MaterialButton materialButtonM = m(i14);
                measureChild(materialButtonM, i10, i11);
                int measuredWidth = materialButtonM.getMeasuredWidth();
                int measuredHeight = materialButtonM.getMeasuredHeight();
                if (measuredWidth > 0) {
                    LinearLayout.LayoutParams layoutParamsH = h(materialButtonM);
                    if (i12 + measuredWidth + (arrayList.isEmpty() ? 0 : this.f19607h) > size || arrayList.isEmpty()) {
                        if (!arrayList.isEmpty()) {
                            arrayList2.add(Integer.valueOf(i12));
                        }
                        i13 += iMax + (this.f19618s.isEmpty() ? 0 : this.f19607h);
                        this.f19618s.add(Integer.valueOf(i14));
                        layoutParamsH.setMarginStart(-i12);
                        arrayList.clear();
                        i12 = 0;
                        iMax = 0;
                    }
                    i12 += measuredWidth + (i12 == 0 ? 0 : this.f19607h);
                    iMax = Math.max(iMax, measuredHeight);
                    arrayList.add(Integer.valueOf(i14));
                    layoutParamsH.topMargin += i13;
                    materialButtonM.setLayoutParams(layoutParamsH);
                }
            }
        }
        arrayList2.add(Integer.valueOf(i12));
        int iIntValue = ((Integer) Collections.max(arrayList2)).intValue();
        int i15 = 0;
        for (int i16 = 0; i16 < this.f19618s.size(); i16++) {
            int iIntValue2 = ((Integer) this.f19618s.get(i16)).intValue();
            int iIntValue3 = ((Integer) arrayList2.get(i16)).intValue();
            MaterialButton materialButtonM2 = m(iIntValue2);
            LinearLayout.LayoutParams layoutParamsH2 = h(materialButtonM2);
            int i17 = layoutParamsH2.gravity & 8388615;
            int absoluteGravity = Gravity.getAbsoluteGravity(i17, getLayoutDirection());
            int i18 = iIntValue - iIntValue3;
            if (i17 != 8388611) {
                if (absoluteGravity == 1) {
                    i18 /= 2;
                }
                layoutParamsH2.setMarginStart((layoutParamsH2.getMarginStart() + i18) - i15);
                materialButtonM2.setLayoutParams(layoutParamsH2);
                i15 = i18;
            }
        }
        return i13 + iMax + getPaddingTop() + getPaddingBottom();
    }

    private int w(boolean z10, Button button, int i10, int i11) {
        int i12;
        int i13;
        measureChild(button, i10, i11);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        int measuredWidth = z10 ? button.getMeasuredWidth() : button.getMeasuredHeight();
        if (z10) {
            i12 = layoutParams.leftMargin;
            i13 = layoutParams.rightMargin;
        } else {
            i12 = layoutParams.topMargin;
            i13 = layoutParams.bottomMargin;
        }
        int i14 = i12 + i13;
        if (measuredWidth == 0) {
            measuredWidth = z10 ? button.getMinimumWidth() : button.getMinimumHeight();
        }
        return measuredWidth + i14;
    }

    private void y() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            m(i10).E();
        }
    }

    private void z(int i10) {
        if (getChildCount() == 0 || i10 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParamsH = h(m(i10));
        if (getOrientation() == 1) {
            layoutParamsH.topMargin = 0;
            layoutParamsH.bottomMargin = 0;
        } else {
            layoutParamsH.setMarginEnd(0);
            layoutParamsH.setMarginStart(0);
            layoutParamsH.leftMargin = 0;
            layoutParamsH.rightMargin = 0;
        }
    }

    void B() {
        int iL;
        if (!(this.f19605f == null && this.f19606g == null) && this.f19609j) {
            this.f19609j = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i10 = 0;
            while (i10 < childCount) {
                MaterialButton materialButtonM = m(i10);
                if (materialButtonM.getVisibility() != 8) {
                    boolean z10 = i10 == firstVisibleChildIndex;
                    boolean z11 = i10 == lastVisibleChildIndex;
                    x.b bVarO = o(z10, z11, i10);
                    boolean z12 = getOrientation() == 0;
                    boolean zM = c0.m(this);
                    if (z12) {
                        iL = z10 ? 5 : 0;
                        if (z11) {
                            iL |= 10;
                        }
                        if (zM) {
                            iL = x.l(iL);
                        }
                    } else {
                        iL = z10 ? 3 : 0;
                        if (z11) {
                            iL |= 12;
                        }
                    }
                    x xVarJ = bVarO.m(this.f19605f, ~iL).j();
                    boolean zF = xVarJ.f();
                    x xVarI = xVarJ;
                    if (!zF) {
                        xVarI = xVarJ.i(true);
                    }
                    materialButtonM.setShapeAppearance(xVarI);
                }
                i10++;
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        y();
        this.f19609j = true;
        int iIndexOfChild = indexOfChild(this.f19612m);
        if (iIndexOfChild < 0 || i10 != -1) {
            super.addView(view, i10, layoutParams);
        } else {
            super.addView(view, iIndexOfChild, layoutParams);
        }
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f19602c);
        this.f19601b.add(materialButton.getShapeAppearance());
        materialButton.setEnabled(isEnabled());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        A();
        super.dispatchDraw(canvas);
    }

    public y getButtonSizeChange() {
        return this.f19608i;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f19604e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i11;
    }

    public mc.d getInnerCornerSize() {
        return this.f19605f.e();
    }

    public w getInnerCornerSizeStateList() {
        return this.f19605f;
    }

    public Drawable getOverflowButtonIcon() {
        return this.f19612m.getIcon();
    }

    public int getOverflowMode() {
        return this.f19600a;
    }

    public p getShapeAppearance() {
        x xVar = this.f19606g;
        if (xVar == null) {
            return null;
        }
        return xVar.i(true);
    }

    public int getSpacing() {
        return this.f19607h;
    }

    public x getStateListShapeAppearance() {
        return this.f19606g;
    }

    LinearLayout.LayoutParams h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new b(layoutParams.width, layoutParams.height);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new b((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    MaterialButton m(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            y();
            f();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int iV;
        e();
        if (this.f19600a != 2) {
            iV = 0;
        } else {
            if (getOrientation() == 1) {
                throw new IllegalArgumentException("The wrap overflow mode is not compatible to the vertical orientation.");
            }
            if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("The wrap overflow mode is not compatible with wrap_content layout width.");
            }
            iV = v(i10, i11);
        }
        t(i10, i11);
        B();
        super.onMeasure(i10, i11);
        if (this.f19600a != 2 || iV == getMeasuredHeight()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), iV);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f19601b.remove(iIndexOfChild);
        }
        this.f19609j = true;
        B();
        y();
        e();
    }

    void q(Context context, TypedArray typedArray) {
        Drawable drawable = typedArray.getDrawable(m.C5);
        MaterialButton materialButton = (MaterialButton) LayoutInflater.from(context).inflate(sb.i.f51816o, (ViewGroup) this, false);
        this.f19612m = materialButton;
        materialButton.setTag(f19599u);
        setOverflowButtonIcon(drawable);
        if (this.f19612m.getContentDescription() == null) {
            this.f19612m.setContentDescription(getResources().getString(sb.k.A));
        }
        this.f19612m.setVisibility(8);
        e0 e0Var = new e0(getContext(), this.f19612m, 17, 0, jc.b.k(this, sb.c.A));
        this.f19613n = e0Var;
        e0Var.b(true);
        this.f19612m.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.button.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialButtonGroup.c(this.f19641a, view);
            }
        });
        addView(this.f19612m);
        this.f19611l = true;
    }

    boolean s() {
        return true;
    }

    public void setButtonSizeChange(y yVar) {
        if (this.f19608i != yVar) {
            this.f19608i = yVar;
            f();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            m(i10).setEnabled(z10);
        }
    }

    public void setInnerCornerSize(mc.d dVar) {
        this.f19605f = w.c(dVar);
        this.f19609j = true;
        B();
        invalidate();
    }

    public void setInnerCornerSizeStateList(w wVar) {
        this.f19605f = wVar;
        this.f19609j = true;
        B();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (getOrientation() != i10) {
            this.f19609j = true;
        }
        super.setOrientation(i10);
    }

    public void setOverflowButtonIcon(Drawable drawable) {
        this.f19612m.setIcon(drawable);
    }

    public void setOverflowButtonIconResource(int i10) {
        this.f19612m.setIconResource(i10);
    }

    public void setOverflowMode(int i10) {
        if (this.f19600a != i10) {
            this.f19600a = i10;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(p pVar) {
        this.f19606g = new x.b(pVar).j();
        this.f19609j = true;
        B();
        invalidate();
    }

    public void setSpacing(int i10) {
        this.f19607h = i10;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(x xVar) {
        this.f19606g = xVar;
        this.f19609j = true;
        B();
        invalidate();
    }

    void x(MaterialButton materialButton, int i10) {
        int iIndexOfChild = indexOfChild(materialButton);
        if (iIndexOfChild < 0) {
            return;
        }
        MaterialButton materialButtonP = p(iIndexOfChild, true);
        MaterialButton materialButtonN = n(iIndexOfChild, true);
        if (materialButtonP == null && materialButtonN == null) {
            return;
        }
        if (materialButtonP == null) {
            materialButtonN.setDisplayedWidthDecrease(i10);
        }
        if (materialButtonN == null) {
            materialButtonP.setDisplayedWidthDecrease(i10);
        }
        if (materialButtonP == null || materialButtonN == null) {
            return;
        }
        materialButtonP.setDisplayedWidthDecrease(i10 / 2);
        materialButtonN.setDisplayedWidthDecrease((i10 + 1) / 2);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f19619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f19620b;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f19619a = null;
            this.f19620b = null;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.G5);
            this.f19619a = typedArrayObtainStyledAttributes.getDrawable(m.H5);
            this.f19620b = typedArrayObtainStyledAttributes.getText(m.I5);
            typedArrayObtainStyledAttributes.recycle();
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f19619a = null;
            this.f19620b = null;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f19619a = null;
            this.f19620b = null;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f19619a = null;
            this.f19620b = null;
        }

        public b(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f19619a = null;
            this.f19620b = null;
        }
    }
}
