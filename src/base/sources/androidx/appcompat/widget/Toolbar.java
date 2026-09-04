package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements n0.p {
    private ColorStateList A;
    private boolean B;
    private boolean C;
    private final ArrayList D;
    private final ArrayList E;
    private final int[] F;
    final n0.s G;
    private ArrayList H;
    h I;
    private final ActionMenuView.e J;
    private s0 K;
    private androidx.appcompat.widget.c L;
    private f M;
    private androidx.appcompat.view.menu.j.a N;
    androidx.appcompat.view.menu.e.a O;
    private boolean P;
    private OnBackInvokedCallback Q;
    private OnBackInvokedDispatcher R;
    private boolean S;
    private final Runnable T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ActionMenuView f1464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f1465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f1466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageButton f1467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f1468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f1469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f1470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ImageButton f1471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    View f1472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Context f1473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1474k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1476m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f1477n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1478o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1479p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1480q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1481r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1482s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private h0 f1483t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f1484u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f1485v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f1486w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f1487x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CharSequence f1488y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ColorStateList f1489z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.G.h(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.I;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.Q();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements androidx.appcompat.view.menu.e.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            androidx.appcompat.view.menu.e.a aVar = Toolbar.this.O;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.f1464a.H()) {
                Toolbar.this.G.i(eVar);
            }
            androidx.appcompat.view.menu.e.a aVar = Toolbar.this.O;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.r0
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.P);
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.G.f(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.T);
        post(this.T);
    }

    private boolean O() {
        if (!this.P) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List list, int i10) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iB = n0.m.b(i10, getLayoutDirection());
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f1497b == 0 && P(childAt) && p(gVar.f697a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f1497b == 0 && P(childAt2) && p(gVar2.f697a) == iB) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        g gVarGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            gVarGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        }
        gVarGenerateLayoutParams.f1497b = 1;
        if (!z10 || this.f1472i == null) {
            addView(view, gVarGenerateLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateLayoutParams);
            this.E.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void h() {
        if (this.f1483t == null) {
            this.f1483t = new h0();
        }
    }

    private void i() {
        if (this.f1468e == null) {
            this.f1468e = new AppCompatImageView(getContext());
        }
    }

    private void j() {
        k();
        if (this.f1464a.L() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f1464a.getMenu();
            if (this.M == null) {
                this.M = new f();
            }
            this.f1464a.setExpandedActionViewsExclusive(true);
            eVar.c(this.M, this.f1473j);
            R();
        }
    }

    private void k() {
        if (this.f1464a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1464a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1474k);
            this.f1464a.setOnMenuItemClickListener(this.J);
            this.f1464a.M(this.N, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f697a = (this.f1477n & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE) | 8388613;
            this.f1464a.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f1464a, false);
        }
    }

    private void l() {
        if (this.f1467d == null) {
            this.f1467d = new AppCompatImageButton(getContext(), null, h.a.O);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f697a = (this.f1477n & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE) | 8388611;
            this.f1467d.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    private int p(int i10) {
        int layoutDirection = getLayoutDirection();
        int iB = n0.m.b(i10, layoutDirection) & 7;
        if (iB == 1 || iB == 3 || iB == 5) {
            return iB;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int iR = r(gVar.f697a);
        if (iR == 48) {
            return getPaddingTop() - i11;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    private int r(int i10) {
        int i11 = i10 & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f1486w & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = (View) list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, i14);
            int iMax3 = Math.max(0, -i13);
            int iMax4 = Math.max(0, -i14);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i12++;
            i11 = iMax4;
            i10 = iMax3;
        }
        return measuredWidth;
    }

    private boolean z(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f1464a;
        return actionMenuView != null && actionMenuView.G();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f1464a;
        return actionMenuView != null && actionMenuView.H();
    }

    void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f1497b != 2 && childAt != this.f1464a) {
                removeViewAt(childCount);
                this.E.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.f1483t.g(i10, i11);
    }

    public void K(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.c cVar) {
        if (eVar == null && this.f1464a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarL = this.f1464a.L();
        if (eVarL == eVar) {
            return;
        }
        if (eVarL != null) {
            eVarL.R(this.L);
            eVarL.R(this.M);
        }
        if (this.M == null) {
            this.M = new f();
        }
        cVar.J(true);
        if (eVar != null) {
            eVar.c(cVar, this.f1473j);
            eVar.c(this.M, this.f1473j);
        } else {
            cVar.k(this.f1473j, null);
            this.M.k(this.f1473j, null);
            cVar.h(true);
            this.M.h(true);
        }
        this.f1464a.setPopupTheme(this.f1474k);
        this.f1464a.setPresenter(cVar);
        this.L = cVar;
        R();
    }

    public void L(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.N = aVar;
        this.O = aVar2;
        ActionMenuView actionMenuView = this.f1464a;
        if (actionMenuView != null) {
            actionMenuView.M(aVar, aVar2);
        }
    }

    public void M(Context context, int i10) {
        this.f1476m = i10;
        TextView textView = this.f1466c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f1475l = i10;
        TextView textView = this.f1465b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f1464a;
        return actionMenuView != null && actionMenuView.N();
    }

    void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z10 = v() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.S;
            if (z10 && this.R == null) {
                if (this.Q == null) {
                    this.Q = e.b(new Runnable() { // from class: androidx.appcompat.widget.p0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f1670a.e();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.Q);
                this.R = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.R) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.Q);
            this.R = null;
        }
    }

    void a() {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            addView((View) this.E.get(size));
        }
        this.E.clear();
    }

    @Override // n0.p
    public void addMenuProvider(n0.u uVar) {
        this.G.c(uVar);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1464a) != null && actionMenuView.I();
    }

    public void e() {
        f fVar = this.M;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.f1495b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1464a;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    void g() {
        if (this.f1471h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, h.a.O);
            this.f1471h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1469f);
            this.f1471h.setContentDescription(this.f1470g);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f697a = (this.f1477n & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE) | 8388611;
            gVarGenerateDefaultLayoutParams.f1497b = 2;
            this.f1471h.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f1471h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1471h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1471h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        h0 h0Var = this.f1483t;
        if (h0Var != null) {
            return h0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1485v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        h0 h0Var = this.f1483t;
        if (h0Var != null) {
            return h0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        h0 h0Var = this.f1483t;
        if (h0Var != null) {
            return h0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        h0 h0Var = this.f1483t;
        if (h0Var != null) {
            return h0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1484u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarL;
        ActionMenuView actionMenuView = this.f1464a;
        return (actionMenuView == null || (eVarL = actionMenuView.L()) == null || !eVarL.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1485v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1484u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1468e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1468e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1464a.getMenu();
    }

    View getNavButtonView() {
        return this.f1467d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1467d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1467d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.L;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1464a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1473j;
    }

    public int getPopupTheme() {
        return this.f1474k;
    }

    public CharSequence getSubtitle() {
        return this.f1488y;
    }

    final TextView getSubtitleTextView() {
        return this.f1466c;
    }

    public CharSequence getTitle() {
        return this.f1487x;
    }

    public int getTitleMarginBottom() {
        return this.f1482s;
    }

    public int getTitleMarginEnd() {
        return this.f1480q;
    }

    public int getTitleMarginStart() {
        return this.f1479p;
    }

    public int getTitleMarginTop() {
        return this.f1481r;
    }

    final TextView getTitleTextView() {
        return this.f1465b;
    }

    public t getWrapper() {
        if (this.K == null) {
            this.K = new s0(this, true);
        }
        return this.K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof androidx.appcompat.app.a.C0009a) {
            return new g((androidx.appcompat.app.a.C0009a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        R();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0280  */
    /* JADX WARN: Code duplicated, block: B:102:0x0283  */
    /* JADX WARN: Code duplicated, block: B:105:0x0297 A[LOOP:0: B:104:0x0295->B:105:0x0297, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b5 A[LOOP:1: B:107:0x02b3->B:108:0x02b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x02df  */
    /* JADX WARN: Code duplicated, block: B:114:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ec A[LOOP:2: B:116:0x02ea->B:117:0x02ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0133  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:58:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:72:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Code duplicated, block: B:88:0x0215  */
    /* JADX WARN: Code duplicated, block: B:90:0x021e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0220  */
    /* JADX WARN: Code duplicated, block: B:93:0x0224  */
    /* JADX WARN: Code duplicated, block: B:96:0x0238  */
    /* JADX WARN: Code duplicated, block: B:97:0x025b  */
    /* JADX WARN: Code duplicated, block: B:99:0x025e  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iC;
        int iD;
        int iMax;
        int iMin;
        boolean zP;
        boolean zP2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        g gVar;
        g gVar2;
        int i14;
        boolean z11;
        int i15;
        int i16;
        int paddingTop;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int iMax2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int size;
        int iC2;
        int i29;
        int size2;
        int i30;
        int i31;
        int i32;
        int size3;
        boolean z12 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i33 = width - paddingRight;
        int[] iArr = this.F;
        iArr[1] = 0;
        iArr[0] = 0;
        int iC3 = n0.q0.C(this);
        int iMin2 = iC3 >= 0 ? Math.min(iC3, i13 - i11) : 0;
        if (P(this.f1467d)) {
            if (z12) {
                iD = D(this.f1467d, i33, iArr, iMin2);
                iC = paddingLeft;
            } else {
                iC = C(this.f1467d, paddingLeft, iArr, iMin2);
            }
            if (P(this.f1471h)) {
                if (z12) {
                    iD = D(this.f1471h, iD, iArr, iMin2);
                } else {
                    iC = C(this.f1471h, iC, iArr, iMin2);
                }
            }
            if (P(this.f1464a)) {
                if (z12) {
                    iC = C(this.f1464a, iC, iArr, iMin2);
                } else {
                    iD = D(this.f1464a, iD, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iC);
            iArr[1] = Math.max(0, currentContentInsetRight - (i33 - iD));
            iMax = Math.max(iC, currentContentInsetLeft);
            iMin = Math.min(iD, i33 - currentContentInsetRight);
            if (P(this.f1472i)) {
                if (z12) {
                    iMin = D(this.f1472i, iMin, iArr, iMin2);
                } else {
                    iMax = C(this.f1472i, iMax, iArr, iMin2);
                }
            }
            if (P(this.f1468e)) {
                if (z12) {
                    iMin = D(this.f1468e, iMin, iArr, iMin2);
                } else {
                    iMax = C(this.f1468e, iMax, iArr, iMin2);
                }
            }
            zP = P(this.f1465b);
            zP2 = P(this.f1466c);
            if (zP) {
                g gVar3 = (g) this.f1465b.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.f1465b.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            if (zP2) {
                g gVar4 = (g) this.f1466c.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) gVar4).topMargin + this.f1466c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin;
            }
            if (!zP || zP2) {
                if (zP) {
                    textView = this.f1465b;
                } else {
                    textView = this.f1466c;
                }
                if (zP2) {
                    textView2 = this.f1466c;
                } else {
                    textView2 = this.f1465b;
                }
                gVar = (g) textView.getLayoutParams();
                gVar2 = (g) textView2.getLayoutParams();
                i14 = measuredHeight;
                z11 = (!zP && this.f1465b.getMeasuredWidth() > 0) || (zP2 && this.f1466c.getMeasuredWidth() > 0);
                i15 = this.f1486w & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
                i16 = iMax;
                if (i15 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f1481r;
                } else if (i15 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                    i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                    i25 = this.f1481r;
                    if (iMax2 < i24 + i25) {
                        iMax2 = i24 + i25;
                    } else {
                        i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                        i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                        i28 = this.f1482s;
                        if (i26 < i27 + i28) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f1482s) - i14;
                }
                if (z12) {
                    if (z11) {
                        i21 = this.f1479p;
                    } else {
                        i21 = 0;
                    }
                    int i34 = i21 - iArr[1];
                    iMin -= Math.max(0, i34);
                    iArr[1] = Math.max(0, -i34);
                    if (zP) {
                        g gVar5 = (g) this.f1465b.getLayoutParams();
                        int measuredWidth = iMin - this.f1465b.getMeasuredWidth();
                        int measuredHeight2 = this.f1465b.getMeasuredHeight() + paddingTop;
                        this.f1465b.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i22 = measuredWidth - this.f1480q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                    } else {
                        i22 = iMin;
                    }
                    if (zP2) {
                        int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1466c.getLayoutParams())).topMargin;
                        this.f1466c.layout(iMin - this.f1466c.getMeasuredWidth(), i35, iMin, this.f1466c.getMeasuredHeight() + i35);
                        i23 = iMin - this.f1480q;
                    } else {
                        i23 = iMin;
                    }
                    if (z11) {
                        iMin = Math.min(i22, i23);
                    }
                    iMax = i16;
                    i18 = 0;
                } else {
                    if (z11) {
                        i17 = this.f1479p;
                    } else {
                        i17 = 0;
                    }
                    i18 = 0;
                    int i36 = i17 - iArr[0];
                    iMax = i16 + Math.max(0, i36);
                    iArr[0] = Math.max(0, -i36);
                    if (zP) {
                        g gVar6 = (g) this.f1465b.getLayoutParams();
                        int measuredWidth2 = this.f1465b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f1465b.getMeasuredHeight() + paddingTop;
                        this.f1465b.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i19 = measuredWidth2 + this.f1480q;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                    } else {
                        i19 = iMax;
                    }
                    if (zP2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1466c.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.f1466c.getMeasuredWidth() + iMax;
                        this.f1466c.layout(iMax, i37, measuredWidth3, this.f1466c.getMeasuredHeight() + i37);
                        i20 = measuredWidth3 + this.f1480q;
                    } else {
                        i20 = iMax;
                    }
                    if (z11) {
                        iMax = Math.max(i19, i20);
                    }
                }
            } else {
                i18 = 0;
            }
            b(this.D, 3);
            size = this.D.size();
            iC2 = iMax;
            for (i29 = i18; i29 < size; i29++) {
                iC2 = C((View) this.D.get(i29), iC2, iArr, iMin2);
            }
            b(this.D, 5);
            size2 = this.D.size();
            for (i30 = i18; i30 < size2; i30++) {
                iMin = D((View) this.D.get(i30), iMin, iArr, iMin2);
            }
            b(this.D, 1);
            int iU = u(this.D, iArr);
            i31 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iU / 2);
            i32 = iU + i31;
            if (i31 >= iC2) {
                if (i32 > iMin) {
                    iC2 = i31 - (i32 - iMin);
                } else {
                    iC2 = i31;
                }
            }
            size3 = this.D.size();
            while (i18 < size3) {
                iC2 = C((View) this.D.get(i18), iC2, iArr, iMin2);
                i18++;
            }
            this.D.clear();
        }
        iC = paddingLeft;
        iD = i33;
        if (P(this.f1471h)) {
            if (z12) {
                iD = D(this.f1471h, iD, iArr, iMin2);
            } else {
                iC = C(this.f1471h, iC, iArr, iMin2);
            }
        }
        if (P(this.f1464a)) {
            if (z12) {
                iC = C(this.f1464a, iC, iArr, iMin2);
            } else {
                iD = D(this.f1464a, iD, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iC);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i33 - iD));
        iMax = Math.max(iC, currentContentInsetLeft2);
        iMin = Math.min(iD, i33 - currentContentInsetRight2);
        if (P(this.f1472i)) {
            if (z12) {
                iMin = D(this.f1472i, iMin, iArr, iMin2);
            } else {
                iMax = C(this.f1472i, iMax, iArr, iMin2);
            }
        }
        if (P(this.f1468e)) {
            if (z12) {
                iMin = D(this.f1468e, iMin, iArr, iMin2);
            } else {
                iMax = C(this.f1468e, iMax, iArr, iMin2);
            }
        }
        zP = P(this.f1465b);
        zP2 = P(this.f1466c);
        if (zP) {
            g gVar7 = (g) this.f1465b.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) gVar7).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar7).topMargin + this.f1465b.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (zP2) {
            g gVar8 = (g) this.f1466c.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) gVar8).topMargin + this.f1466c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar8).bottomMargin;
        }
        if (zP) {
            if (zP) {
                textView = this.f1465b;
            } else {
                textView = this.f1466c;
            }
            if (zP2) {
                textView2 = this.f1466c;
            } else {
                textView2 = this.f1465b;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i14 = measuredHeight;
            if (zP) {
            }
            i15 = this.f1486w & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f1481r;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i25 = this.f1481r;
                if (iMax2 < i24 + i25) {
                    iMax2 = i24 + i25;
                } else {
                    i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i28 = this.f1482s;
                    if (i26 < i27 + i28) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f1482s) - i14;
            }
            if (z12) {
                if (z11) {
                    i21 = this.f1479p;
                } else {
                    i21 = 0;
                }
                int i38 = i21 - iArr[1];
                iMin -= Math.max(0, i38);
                iArr[1] = Math.max(0, -i38);
                if (zP) {
                    g gVar9 = (g) this.f1465b.getLayoutParams();
                    int measuredWidth4 = iMin - this.f1465b.getMeasuredWidth();
                    int measuredHeight4 = this.f1465b.getMeasuredHeight() + paddingTop;
                    this.f1465b.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i22 = measuredWidth4 - this.f1480q;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) gVar9).bottomMargin;
                } else {
                    i22 = iMin;
                }
                if (zP2) {
                    int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1466c.getLayoutParams())).topMargin;
                    this.f1466c.layout(iMin - this.f1466c.getMeasuredWidth(), i39, iMin, this.f1466c.getMeasuredHeight() + i39);
                    i23 = iMin - this.f1480q;
                } else {
                    i23 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i22, i23);
                }
                iMax = i16;
                i18 = 0;
            } else {
                if (z11) {
                    i17 = this.f1479p;
                } else {
                    i17 = 0;
                }
                i18 = 0;
                int i310 = i17 - iArr[0];
                iMax = i16 + Math.max(0, i310);
                iArr[0] = Math.max(0, -i310);
                if (zP) {
                    g gVar10 = (g) this.f1465b.getLayoutParams();
                    int measuredWidth5 = this.f1465b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f1465b.getMeasuredHeight() + paddingTop;
                    this.f1465b.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i19 = measuredWidth5 + this.f1480q;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) gVar10).bottomMargin;
                } else {
                    i19 = iMax;
                }
                if (zP2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1466c.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.f1466c.getMeasuredWidth() + iMax;
                    this.f1466c.layout(iMax, i311, measuredWidth6, this.f1466c.getMeasuredHeight() + i311);
                    i20 = measuredWidth6 + this.f1480q;
                } else {
                    i20 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i19, i20);
                }
            }
        } else {
            if (zP) {
                textView = this.f1465b;
            } else {
                textView = this.f1466c;
            }
            if (zP2) {
                textView2 = this.f1466c;
            } else {
                textView2 = this.f1465b;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i14 = measuredHeight;
            if (zP) {
            }
            i15 = this.f1486w & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f1481r;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i25 = this.f1481r;
                if (iMax2 < i24 + i25) {
                    iMax2 = i24 + i25;
                } else {
                    i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i28 = this.f1482s;
                    if (i26 < i27 + i28) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f1482s) - i14;
            }
            if (z12) {
                if (z11) {
                    i21 = this.f1479p;
                } else {
                    i21 = 0;
                }
                int i312 = i21 - iArr[1];
                iMin -= Math.max(0, i312);
                iArr[1] = Math.max(0, -i312);
                if (zP) {
                    g gVar11 = (g) this.f1465b.getLayoutParams();
                    int measuredWidth7 = iMin - this.f1465b.getMeasuredWidth();
                    int measuredHeight6 = this.f1465b.getMeasuredHeight() + paddingTop;
                    this.f1465b.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i22 = measuredWidth7 - this.f1480q;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) gVar11).bottomMargin;
                } else {
                    i22 = iMin;
                }
                if (zP2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1466c.getLayoutParams())).topMargin;
                    this.f1466c.layout(iMin - this.f1466c.getMeasuredWidth(), i313, iMin, this.f1466c.getMeasuredHeight() + i313);
                    i23 = iMin - this.f1480q;
                } else {
                    i23 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i22, i23);
                }
                iMax = i16;
                i18 = 0;
            } else {
                if (z11) {
                    i17 = this.f1479p;
                } else {
                    i17 = 0;
                }
                i18 = 0;
                int i314 = i17 - iArr[0];
                iMax = i16 + Math.max(0, i314);
                iArr[0] = Math.max(0, -i314);
                if (zP) {
                    g gVar12 = (g) this.f1465b.getLayoutParams();
                    int measuredWidth8 = this.f1465b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f1465b.getMeasuredHeight() + paddingTop;
                    this.f1465b.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i19 = measuredWidth8 + this.f1480q;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) gVar12).bottomMargin;
                } else {
                    i19 = iMax;
                }
                if (zP2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1466c.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.f1466c.getMeasuredWidth() + iMax;
                    this.f1466c.layout(iMax, i315, measuredWidth9, this.f1466c.getMeasuredHeight() + i315);
                    i20 = measuredWidth9 + this.f1480q;
                } else {
                    i20 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i19, i20);
                }
            }
        }
        b(this.D, 3);
        size = this.D.size();
        iC2 = iMax;
        while (i29 < size) {
            iC2 = C((View) this.D.get(i29), iC2, iArr, iMin2);
        }
        b(this.D, 5);
        size2 = this.D.size();
        while (i30 < size2) {
            iMin = D((View) this.D.get(i30), iMin, iArr, iMin2);
        }
        b(this.D, 1);
        int iU2 = u(this.D, iArr);
        i31 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iU2 / 2);
        i32 = iU2 + i31;
        if (i31 >= iC2) {
            if (i32 > iMin) {
                iC2 = i31 - (i32 - iMin);
            } else {
                iC2 = i31;
            }
        }
        size3 = this.D.size();
        while (i18 < size3) {
            iC2 = C((View) this.D.get(i18), iC2, iArr, iMin2);
            i18++;
        }
        this.D.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.F;
        boolean zB = z0.b(this);
        int i12 = !zB ? 1 : 0;
        if (P(this.f1467d)) {
            F(this.f1467d, i10, 0, i11, 0, this.f1478o);
            measuredWidth = this.f1467d.getMeasuredWidth() + s(this.f1467d);
            iMax = Math.max(0, this.f1467d.getMeasuredHeight() + t(this.f1467d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1467d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (P(this.f1471h)) {
            F(this.f1471h, i10, 0, i11, 0, this.f1478o);
            measuredWidth = this.f1471h.getMeasuredWidth() + s(this.f1471h);
            iMax = Math.max(iMax, this.f1471h.getMeasuredHeight() + t(this.f1471h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1471h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (P(this.f1464a)) {
            F(this.f1464a, i10, iMax3, i11, 0, this.f1478o);
            measuredWidth2 = this.f1464a.getMeasuredWidth() + s(this.f1464a);
            iMax = Math.max(iMax, this.f1464a.getMeasuredHeight() + t(this.f1464a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1464a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (P(this.f1472i)) {
            iArr = iArr2;
            iMax4 += E(this.f1472i, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f1472i.getMeasuredHeight() + t(this.f1472i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1472i.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (P(this.f1468e)) {
            iMax4 += E(this.f1468e, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f1468e.getMeasuredHeight() + t(this.f1468e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1468e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).f1497b == 0 && P(childAt)) {
                iMax4 += E(childAt, i10, iMax4, i11, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i14 = iMax4;
        int i15 = this.f1481r + this.f1482s;
        int i16 = this.f1479p + this.f1480q;
        if (P(this.f1465b)) {
            E(this.f1465b, i10, i14 + i16, i11, i15, iArr);
            int measuredWidth3 = this.f1465b.getMeasuredWidth() + s(this.f1465b);
            int measuredHeight2 = this.f1465b.getMeasuredHeight() + t(this.f1465b);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1465b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (P(this.f1466c)) {
            iMax2 = Math.max(iMax2, E(this.f1466c, i10, i14 + i16, i11, i15 + measuredHeight, iArr));
            measuredHeight += this.f1466c.getMeasuredHeight() + t(this.f1466c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1466c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i14 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), O() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f1464a;
        androidx.appcompat.view.menu.e eVarL = actionMenuView != null ? actionMenuView.L() : null;
        int i10 = iVar.f1498c;
        if (i10 != 0 && this.M != null && eVarL != null && (menuItemFindItem = eVarL.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f1499d) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.f1483t.f(i10 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.M;
        if (fVar != null && (gVar = fVar.f1495b) != null) {
            iVar.f1498c = gVar.getItemId();
        }
        iVar.f1499d = B();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    @Override // n0.p
    public void removeMenuProvider(n0.u uVar) {
        this.G.j(uVar);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.S != z10) {
            this.S = z10;
            R();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(i.a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.P = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1485v) {
            this.f1485v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1484u) {
            this.f1484u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(i.a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(i.a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1467d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.I = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1464a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1474k != i10) {
            this.f1474k = i10;
            if (i10 == 0) {
                this.f1473j = getContext();
            } else {
                this.f1473j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f1482s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1480q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1479p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1481r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean v() {
        f fVar = this.M;
        return (fVar == null || fVar.f1495b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1464a;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        G();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class g extends androidx.appcompat.app.a.C0009a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1497b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1497b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f1497b = 0;
            this.f697a = 8388627;
        }

        public g(g gVar) {
            super((androidx.appcompat.app.a.C0009a) gVar);
            this.f1497b = 0;
            this.f1497b = gVar.f1497b;
        }

        public g(androidx.appcompat.app.a.C0009a c0009a) {
            super(c0009a);
            this.f1497b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1497b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1497b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1486w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new n0.s(new Runnable() { // from class: androidx.appcompat.widget.q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f1692a.y();
            }
        });
        this.H = new ArrayList();
        this.J = new a();
        this.T = new b();
        Context context2 = getContext();
        int[] iArr = h.j.f40102t3;
        o0 o0VarV = o0.v(context2, attributeSet, iArr, i10, 0);
        n0.q0.k0(this, context, iArr, attributeSet, o0VarV.r(), i10, 0);
        this.f1475l = o0VarV.n(h.j.V3, 0);
        this.f1476m = o0VarV.n(h.j.M3, 0);
        this.f1486w = o0VarV.l(h.j.f40107u3, this.f1486w);
        this.f1477n = o0VarV.l(h.j.f40112v3, 48);
        int iE = o0VarV.e(h.j.P3, 0);
        int i11 = h.j.U3;
        iE = o0VarV.s(i11) ? o0VarV.e(i11, iE) : iE;
        this.f1482s = iE;
        this.f1481r = iE;
        this.f1480q = iE;
        this.f1479p = iE;
        int iE2 = o0VarV.e(h.j.S3, -1);
        if (iE2 >= 0) {
            this.f1479p = iE2;
        }
        int iE3 = o0VarV.e(h.j.R3, -1);
        if (iE3 >= 0) {
            this.f1480q = iE3;
        }
        int iE4 = o0VarV.e(h.j.T3, -1);
        if (iE4 >= 0) {
            this.f1481r = iE4;
        }
        int iE5 = o0VarV.e(h.j.Q3, -1);
        if (iE5 >= 0) {
            this.f1482s = iE5;
        }
        this.f1478o = o0VarV.f(h.j.G3, -1);
        int iE6 = o0VarV.e(h.j.C3, Integer.MIN_VALUE);
        int iE7 = o0VarV.e(h.j.f40127y3, Integer.MIN_VALUE);
        int iF = o0VarV.f(h.j.A3, 0);
        int iF2 = o0VarV.f(h.j.B3, 0);
        h();
        this.f1483t.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.f1483t.g(iE6, iE7);
        }
        this.f1484u = o0VarV.e(h.j.D3, Integer.MIN_VALUE);
        this.f1485v = o0VarV.e(h.j.f40132z3, Integer.MIN_VALUE);
        this.f1469f = o0VarV.g(h.j.f40122x3);
        this.f1470g = o0VarV.p(h.j.f40117w3);
        CharSequence charSequenceP = o0VarV.p(h.j.O3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = o0VarV.p(h.j.L3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f1473j = getContext();
        setPopupTheme(o0VarV.n(h.j.K3, 0));
        Drawable drawableG = o0VarV.g(h.j.J3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = o0VarV.p(h.j.I3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = o0VarV.g(h.j.E3);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = o0VarV.p(h.j.F3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        int i12 = h.j.W3;
        if (o0VarV.s(i12)) {
            setTitleTextColor(o0VarV.c(i12));
        }
        int i13 = h.j.N3;
        if (o0VarV.s(i13)) {
            setSubtitleTextColor(o0VarV.c(i13));
        }
        int i14 = h.j.H3;
        if (o0VarV.s(i14)) {
            x(o0VarV.n(i14, 0));
        }
        o0VarV.x();
    }

    @Override // n0.p
    public void addMenuProvider(n0.u uVar, androidx.lifecycle.b0 b0Var, androidx.lifecycle.s.b bVar) {
        this.G.e(uVar, b0Var, bVar);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1471h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1471h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f1471h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f1469f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f1468e)) {
                c(this.f1468e, true);
            }
        } else {
            ImageView imageView = this.f1468e;
            if (imageView != null && z(imageView)) {
                removeView(this.f1468e);
                this.E.remove(this.f1468e);
            }
        }
        ImageView imageView2 = this.f1468e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1468e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1467d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            t0.a(this.f1467d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f1467d)) {
                c(this.f1467d, true);
            }
        } else {
            ImageButton imageButton = this.f1467d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f1467d);
                this.E.remove(this.f1467d);
            }
        }
        ImageButton imageButton2 = this.f1467d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1466c;
            if (textView != null && z(textView)) {
                removeView(this.f1466c);
                this.E.remove(this.f1466c);
            }
        } else {
            if (this.f1466c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1466c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1466c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1476m;
                if (i10 != 0) {
                    this.f1466c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1466c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1466c)) {
                c(this.f1466c, true);
            }
        }
        TextView textView2 = this.f1466c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1488y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f1466c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1465b;
            if (textView != null && z(textView)) {
                removeView(this.f1465b);
                this.E.remove(this.f1465b);
            }
        } else {
            if (this.f1465b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1465b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1465b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1475l;
                if (i10 != 0) {
                    this.f1465b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1489z;
                if (colorStateList != null) {
                    this.f1465b.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1465b)) {
                c(this.f1465b, true);
            }
        }
        TextView textView2 = this.f1465b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1487x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1489z = colorStateList;
        TextView textView = this.f1465b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class i extends u0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f1499d;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1498c = parcel.readInt();
            this.f1499d = parcel.readInt() != 0;
        }

        @Override // u0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1498c);
            parcel.writeInt(this.f1499d ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class f implements androidx.appcompat.view.menu.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.appcompat.view.menu.e f1494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.g f1495b;

        f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1471h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1471h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1471h);
            }
            Toolbar.this.f1472i = gVar.getActionView();
            this.f1495b = gVar;
            ViewParent parent2 = Toolbar.this.f1472i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1472i);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f697a = (toolbar4.f1477n & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE) | 8388611;
                gVarGenerateDefaultLayoutParams.f1497b = 2;
                toolbar4.f1472i.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1472i);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f1472i;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewExpanded();
            }
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean f(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public Parcelable g() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.j
        public void h(boolean z10) {
            if (this.f1495b != null) {
                androidx.appcompat.view.menu.e eVar = this.f1494a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f1494a.getItem(i10) == this.f1495b) {
                            return;
                        }
                    }
                }
                j(this.f1494a, this.f1495b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean i() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean j(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f1472i;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1472i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1471h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1472i = null;
            toolbar3.a();
            this.f1495b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void k(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f1494a;
            if (eVar2 != null && (gVar = this.f1495b) != null) {
                eVar2.f(gVar);
            }
            this.f1494a = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public void e(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.j
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }
    }
}
