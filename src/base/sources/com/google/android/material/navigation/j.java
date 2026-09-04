package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.transition.t;
import androidx.transition.v;
import com.google.android.material.internal.x;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j extends ViewGroup implements androidx.appcompat.view.menu.k {
    private static final int[] W = {R.attr.state_checked};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int[] f20613a0 = {-16842910};
    private boolean A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private mc.p I;
    private boolean J;
    private ColorStateList K;
    private k L;
    private h M;
    private boolean N;
    private boolean O;
    private int P;
    private int Q;
    private boolean R;
    private MenuItem S;
    private int T;
    private boolean U;
    private final Rect V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f20614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View.OnClickListener f20615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m0.d f20616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray f20617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i[] f20620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f20622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorStateList f20623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f20624k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorStateList f20625l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ColorStateList f20626m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f20627n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f20628o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f20629p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f20630q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f20631r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Drawable f20632s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f20633t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f20634u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final SparseArray f20635v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f20636w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f20637x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f20638y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f20639z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            androidx.appcompat.view.menu.g itemData = ((f) view).getItemData();
            boolean zE = j.this.M.e(itemData, j.this.L, 0);
            if (itemData == null || !itemData.isCheckable()) {
                return;
            }
            if (!zE || itemData.isChecked()) {
                j.this.setCheckedItem(itemData);
            }
        }
    }

    public j(Context context) {
        super(context);
        this.f20617d = new SparseArray();
        this.f20621h = -1;
        this.f20622i = -1;
        this.f20635v = new SparseArray();
        this.f20636w = -1;
        this.f20637x = -1;
        this.f20638y = -1;
        this.f20639z = -1;
        this.H = 49;
        this.J = false;
        this.P = 1;
        this.Q = 0;
        this.S = null;
        this.T = 7;
        this.U = false;
        this.V = new Rect();
        this.f20626m = e(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.f20614a = null;
        } else {
            androidx.transition.a aVar = new androidx.transition.a();
            this.f20614a = aVar;
            aVar.u0(0);
            aVar.r(TextView.class, true);
            aVar.c0(gc.j.f(getContext(), sb.c.N, getResources().getInteger(sb.h.f51800b)));
            aVar.e0(gc.j.g(getContext(), sb.c.W, tb.b.f53276b));
            aVar.m0(new x());
        }
        this.f20615b = new a();
        setImportantForAccessibility(1);
    }

    private Drawable f() {
        if (this.I == null || this.K == null) {
            return null;
        }
        mc.i iVar = new mc.i(this.I);
        iVar.l0(this.K);
        return iVar;
    }

    private f g(int i10, androidx.appcompat.view.menu.g gVar, boolean z10, boolean z11) {
        this.L.m(true);
        gVar.setCheckable(true);
        this.L.m(false);
        f newItem = getNewItem();
        newItem.setShifting(z10);
        newItem.setLabelMaxLines(this.P);
        newItem.setIconTintList(this.f20623j);
        newItem.setIconSize(this.f20624k);
        newItem.setTextColor(this.f20626m);
        newItem.setTextAppearanceInactive(this.f20627n);
        newItem.setTextAppearanceActive(this.f20628o);
        newItem.setHorizontalTextAppearanceInactive(this.f20629p);
        newItem.setHorizontalTextAppearanceActive(this.f20630q);
        newItem.setTextAppearanceActiveBoldEnabled(this.f20631r);
        newItem.setTextColor(this.f20625l);
        int i11 = this.f20636w;
        if (i11 != -1) {
            newItem.setItemPaddingTop(i11);
        }
        int i12 = this.f20637x;
        if (i12 != -1) {
            newItem.setItemPaddingBottom(i12);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.N);
        newItem.setLabelFontScalingEnabled(this.O);
        int i13 = this.f20638y;
        if (i13 != -1) {
            newItem.setActiveIndicatorLabelPadding(i13);
        }
        int i14 = this.f20639z;
        if (i14 != -1) {
            newItem.setIconLabelHorizontalSpacing(i14);
        }
        newItem.setActiveIndicatorWidth(this.B);
        newItem.setActiveIndicatorHeight(this.C);
        newItem.setActiveIndicatorExpandedWidth(this.D);
        newItem.setActiveIndicatorExpandedHeight(this.E);
        newItem.setActiveIndicatorMarginHorizontal(this.F);
        newItem.setItemGravity(this.H);
        newItem.setActiveIndicatorExpandedPadding(this.V);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.G);
        newItem.setActiveIndicatorDrawable(f());
        newItem.setActiveIndicatorResizeable(this.J);
        newItem.setActiveIndicatorEnabled(this.A);
        Drawable drawable = this.f20632s;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.f20634u);
        }
        newItem.setItemRippleColor(this.f20633t);
        newItem.setLabelVisibilityMode(this.f20618e);
        newItem.setItemIconGravity(this.f20619f);
        newItem.setOnlyShowWhenExpanded(z11);
        newItem.setExpanded(this.R);
        newItem.c(gVar, 0);
        newItem.setItemPosition(i10);
        int itemId = gVar.getItemId();
        newItem.setOnTouchListener((View.OnTouchListener) this.f20617d.get(itemId));
        newItem.setOnClickListener(this.f20615b);
        int i15 = this.f20621h;
        if (i15 != 0 && itemId == i15) {
            this.f20622i = i10;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.T, this.M.d());
    }

    private f getNewItem() {
        m0.d dVar = this.f20616c;
        f fVar = dVar != null ? (f) dVar.b() : null;
        return fVar == null ? h(getContext()) : fVar;
    }

    private boolean i() {
        h hVar;
        if (this.f20620g == null || (hVar = this.M) == null || hVar.g() != this.f20620g.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.f20620g.length) {
                return true;
            }
            if ((this.M.b(i10) instanceof com.google.android.material.navigation.a) && !(this.f20620g[i10] instanceof d)) {
                return false;
            }
            boolean z10 = this.M.b(i10).hasSubMenu() && !(this.f20620g[i10] instanceof m);
            boolean z11 = (this.M.b(i10).hasSubMenu() || (this.f20620g[i10] instanceof f)) ? false : true;
            if (!(this.M.b(i10) instanceof com.google.android.material.navigation.a) && (z10 || z11)) {
                break;
            }
            i10++;
        }
        return false;
    }

    private boolean k(int i10) {
        return i10 != -1;
    }

    private void l() {
        i[] iVarArr = this.f20620g;
        if (iVarArr == null || this.f20616c == null) {
            return;
        }
        for (i iVar : iVarArr) {
            if (iVar instanceof f) {
                f fVar = (f) iVar;
                this.f20616c.a(fVar);
                fVar.g();
            }
        }
    }

    private void m() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.M.g(); i10++) {
            hashSet.add(Integer.valueOf(this.M.b(i10).getItemId()));
        }
        for (int i11 = 0; i11 < this.f20635v.size(); i11++) {
            int iKeyAt = this.f20635v.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.f20635v.delete(iKeyAt);
            }
        }
    }

    private void setBadgeIfNeeded(f fVar) {
        ub.a aVar;
        int id2 = fVar.getId();
        if (k(id2) && (aVar = (ub.a) this.f20635v.get(id2)) != null) {
            fVar.setBadge(aVar);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(androidx.appcompat.view.menu.e eVar) {
        this.M = new h(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d() {
        f fVarG;
        View viewG;
        d dVar;
        removeAllViews();
        l();
        this.L.m(true);
        this.M.f();
        this.L.m(false);
        int iA = this.M.a();
        if (iA == 0) {
            this.f20621h = 0;
            this.f20622i = 0;
            this.f20620g = null;
            this.f20616c = null;
            return;
        }
        if (this.f20616c == null || this.Q != iA) {
            this.Q = iA;
            this.f20616c = new m0.f(iA);
        }
        m();
        int iG = this.M.g();
        this.f20620g = new i[iG];
        boolean zJ = j(this.f20618e, getCurrentVisibleContentItemCount());
        int size = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < iG; i11++) {
            MenuItem menuItemB = this.M.b(i11);
            boolean z10 = menuItemB instanceof com.google.android.material.navigation.a;
            if (z10) {
                dVar = new d(getContext());
                dVar.setOnlyShowWhenExpanded(true);
                dVar.setDividersEnabled(this.U);
            } else if (menuItemB.hasSubMenu()) {
                if (size > 0) {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                m mVar = new m(getContext());
                int i12 = this.f20630q;
                if (i12 == 0) {
                    i12 = this.f20628o;
                }
                mVar.setTextAppearance(i12);
                mVar.setTextColor(this.f20625l);
                mVar.setOnlyShowWhenExpanded(true);
                mVar.c((androidx.appcompat.view.menu.g) menuItemB, 0);
                size = menuItemB.getSubMenu().size();
                viewG = mVar;
            } else if (size > 0) {
                fVarG = g(i11, (androidx.appcompat.view.menu.g) menuItemB, zJ, true);
                size--;
            } else {
                androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) menuItemB;
                boolean z11 = i10 >= this.T;
                i10++;
                viewG = g(i11, gVar, zJ, z11);
            }
            if (z10) {
                viewG = fVarG;
                viewG = dVar;
            } else {
                viewG = fVarG;
                if (menuItemB.isCheckable() && this.f20622i == -1) {
                    viewG = dVar;
                    this.f20622i = i11;
                } else {
                    viewG = dVar;
                }
            }
            this.f20620g[i11] = viewG;
            addView(viewG);
        }
        int iMin = Math.min(iG - 1, this.f20622i);
        this.f20622i = iMin;
        setCheckedItem(this.f20620g[iMin].getItemData());
    }

    public ColorStateList e(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = i.a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(h.a.f39870w, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = f20613a0;
        return new ColorStateList(new int[][]{iArr, W, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f20638y;
    }

    SparseArray<ub.a> getBadgeDrawables() {
        return this.f20635v;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.R ? this.M.c() : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f20630q;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f20629p;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f20639z;
    }

    public ColorStateList getIconTintList() {
        return this.f20623j;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.K;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.A;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.E;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.G;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.D;
    }

    public int getItemActiveIndicatorHeight() {
        return this.C;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.F;
    }

    public mc.p getItemActiveIndicatorShapeAppearance() {
        return this.I;
    }

    public int getItemActiveIndicatorWidth() {
        return this.B;
    }

    public Drawable getItemBackground() {
        i[] iVarArr = this.f20620g;
        if (iVarArr != null && iVarArr.length > 0) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    return ((f) iVar).getBackground();
                }
            }
        }
        return this.f20632s;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f20634u;
    }

    public int getItemGravity() {
        return this.H;
    }

    public int getItemIconGravity() {
        return this.f20619f;
    }

    public int getItemIconSize() {
        return this.f20624k;
    }

    public int getItemPaddingBottom() {
        return this.f20637x;
    }

    public int getItemPaddingTop() {
        return this.f20636w;
    }

    public ColorStateList getItemRippleColor() {
        return this.f20633t;
    }

    public int getItemTextAppearanceActive() {
        return this.f20628o;
    }

    public int getItemTextAppearanceInactive() {
        return this.f20627n;
    }

    public ColorStateList getItemTextColor() {
        return this.f20625l;
    }

    public int getLabelMaxLines() {
        return this.P;
    }

    public int getLabelVisibilityMode() {
        return this.f20618e;
    }

    protected h getMenu() {
        return this.M;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.O;
    }

    public int getSelectedItemId() {
        return this.f20621h;
    }

    protected int getSelectedItemPosition() {
        return this.f20622i;
    }

    public int getWindowAnimations() {
        return 0;
    }

    protected abstract f h(Context context);

    protected boolean j(int i10, int i11) {
        if (i10 == -1) {
            return i11 > 3;
        }
        return i10 == 0;
    }

    void n(SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            if (this.f20635v.indexOfKey(iKeyAt) < 0) {
                this.f20635v.append(iKeyAt, (ub.a) sparseArray.get(iKeyAt));
            }
        }
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    f fVar = (f) iVar;
                    ub.a aVar = (ub.a) this.f20635v.get(fVar.getId());
                    if (aVar != null) {
                        fVar.setBadge(aVar);
                    }
                }
            }
        }
    }

    public void o(int i10, int i11, int i12, int i13) {
        Rect rect = this.V;
        rect.left = i10;
        rect.top = i11;
        rect.right = i12;
        rect.bottom = i13;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorExpandedPadding(this.V);
                }
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        o0.p.c1(accessibilityNodeInfo).w0(o0.p.g.b(1, getCurrentVisibleContentItemCount(), false, 1));
    }

    void p(int i10) {
        int iG = this.M.g();
        for (int i11 = 0; i11 < iG; i11++) {
            MenuItem menuItemB = this.M.b(i11);
            if (i10 == menuItemB.getItemId()) {
                this.f20621h = i10;
                this.f20622i = i11;
                setCheckedItem(menuItemB);
                return;
            }
        }
    }

    public void q(int i10) {
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).A(i10);
                }
            }
        }
    }

    public void r() {
        v vVar;
        if (this.M == null || this.f20620g == null) {
            return;
        }
        this.L.m(true);
        this.M.f();
        this.L.m(false);
        if (!i()) {
            d();
            return;
        }
        int i10 = this.f20621h;
        int iG = this.M.g();
        for (int i11 = 0; i11 < iG; i11++) {
            MenuItem menuItemB = this.M.b(i11);
            if (menuItemB.isChecked()) {
                setCheckedItem(menuItemB);
                this.f20621h = menuItemB.getItemId();
                this.f20622i = i11;
            }
        }
        if (i10 != this.f20621h && (vVar = this.f20614a) != null) {
            t.b(this, vVar);
        }
        boolean zJ = j(this.f20618e, getCurrentVisibleContentItemCount());
        for (int i12 = 0; i12 < iG; i12++) {
            this.L.m(true);
            this.f20620g[i12].setExpanded(this.R);
            i iVar = this.f20620g[i12];
            if (iVar instanceof f) {
                f fVar = (f) iVar;
                fVar.setLabelVisibilityMode(this.f20618e);
                fVar.setItemIconGravity(this.f20619f);
                fVar.setItemGravity(this.H);
                fVar.setShifting(zJ);
            }
            if (this.M.b(i12) instanceof androidx.appcompat.view.menu.g) {
                this.f20620g[i12].c((androidx.appcompat.view.menu.g) this.M.b(i12), 0);
            }
            this.L.m(false);
        }
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f20638y = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorLabelPadding(i10);
                }
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        if (this.S == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.S;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.S.setChecked(false);
        }
        menuItem.setChecked(true);
        this.S = menuItem;
    }

    public void setCollapsedMaxItemCount(int i10) {
        this.T = i10;
    }

    public void setExpanded(boolean z10) {
        this.R = z10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                iVar.setExpanded(z10);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i10) {
        this.f20630q = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setHorizontalTextAppearanceActive(i10);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i10) {
        this.f20629p = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setHorizontalTextAppearanceInactive(i10);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        this.f20639z = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setIconLabelHorizontalSpacing(i10);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f20623j = colorStateList;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.K = colorStateList;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorDrawable(f());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.A = z10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorEnabled(z10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i10) {
        this.E = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorExpandedHeight(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i10) {
        this.G = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorExpandedMarginHorizontal(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i10) {
        this.D = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorExpandedWidth(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.C = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorHeight(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.F = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorMarginHorizontal(i10);
                }
            }
        }
    }

    protected void setItemActiveIndicatorResizeable(boolean z10) {
        this.J = z10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorResizeable(z10);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(mc.p pVar) {
        this.I = pVar;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorDrawable(f());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.B = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorWidth(i10);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f20632s = drawable;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.f20634u = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemBackground(i10);
                }
            }
        }
    }

    public void setItemGravity(int i10) {
        this.H = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemGravity(i10);
                }
            }
        }
    }

    public void setItemIconGravity(int i10) {
        this.f20619f = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemIconGravity(i10);
                }
            }
        }
    }

    public void setItemIconSize(int i10) {
        this.f20624k = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setIconSize(i10);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i10) {
        this.f20637x = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemPaddingBottom(this.f20637x);
                }
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        this.f20636w = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemPaddingTop(i10);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f20633t = colorStateList;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f20628o = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setTextAppearanceActive(i10);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f20631r = z10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setTextAppearanceActiveBoldEnabled(z10);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f20627n = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setTextAppearanceInactive(i10);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f20625l = colorStateList;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.O = z10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setLabelFontScalingEnabled(z10);
                }
            }
        }
    }

    public void setLabelMaxLines(int i10) {
        this.P = i10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setLabelMaxLines(i10);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f20618e = i10;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z10) {
        this.N = z10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setMeasureBottomPaddingFromLabelBaseline(z10);
                }
            }
        }
    }

    public void setPresenter(k kVar) {
        this.L = kVar;
    }

    public void setSubmenuDividersEnabled(boolean z10) {
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        i[] iVarArr = this.f20620g;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof d) {
                    ((d) iVar).setDividersEnabled(z10);
                }
            }
        }
    }
}
