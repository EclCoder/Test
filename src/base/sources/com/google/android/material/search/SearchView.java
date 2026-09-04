package com.google.android.material.search;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n0.k1;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b, gc.b {
    private static final int I = sb.l.E;
    private final int A;
    private boolean B;
    private boolean C;
    private final boolean D;
    private final boolean E;
    private d F;
    private Map G;
    private final ViewTreeObserver.OnTouchModeChangeListener H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final View f20901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ClippableRoundedCornerLayout f20902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final View f20903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final View f20904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final FrameLayout f20905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final FrameLayout f20906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final MaterialToolbar f20907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Toolbar f20908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final TextView f20909i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final TextView f20910j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final LinearLayout f20911k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final EditText f20912l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ImageButton f20913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final View f20914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final TouchObserverFrameLayout f20915o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f20916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final v f20917q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final gc.c f20918r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f20919s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final cc.a f20920t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Set f20921u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private SearchBar f20922v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f20923w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f20924x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f20925y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f20926z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Behavior extends CoordinatorLayout.c {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            if (searchView.x() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ViewTreeObserver.OnTouchModeChangeListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
        public void onTouchModeChanged(boolean z10) {
            EditText editText;
            if (z10 || !SearchView.this.hasWindowFocus() || !SearchView.this.y() || (editText = SearchView.this.f20912l) == null || editText.isFocused()) {
                return;
            }
            final EditText editText2 = SearchView.this.f20912l;
            Objects.requireNonNull(editText2);
            editText2.post(new Runnable() { // from class: com.google.android.material.search.o
                @Override // java.lang.Runnable
                public final void run() {
                    editText2.requestFocus();
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c extends u0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f20929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f20930d;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcel parcel) {
            this(parcel, null);
        }

        @Override // u0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f20929c);
            parcel.writeInt(this.f20930d);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f20929c = parcel.readString();
            this.f20930d = parcel.readInt();
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum d {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        int i11 = I;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f20918r = new gc.c(this);
        this.f20921u = new LinkedHashSet();
        this.f20923w = 16;
        this.F = d.HIDDEN;
        this.H = new a();
        Context context2 = getContext();
        TypedArray typedArrayI = com.google.android.material.internal.z.i(context2, attributeSet, sb.m.T9, i10, i11, new int[0]);
        this.A = typedArrayI.getColor(sb.m.f51910ba, 0);
        int resourceId = typedArrayI.getResourceId(sb.m.f51958ea, -1);
        int resourceId2 = typedArrayI.getResourceId(sb.m.U9, -1);
        String string = typedArrayI.getString(sb.m.V9);
        String string2 = typedArrayI.getString(sb.m.W9);
        String string3 = typedArrayI.getString(sb.m.f51988ga);
        boolean z10 = typedArrayI.getBoolean(sb.m.f52003ha, false);
        this.f20924x = typedArrayI.getBoolean(sb.m.Y9, true);
        this.f20925y = typedArrayI.getBoolean(sb.m.X9, true);
        boolean z11 = typedArrayI.getBoolean(sb.m.f51973fa, false);
        this.f20926z = typedArrayI.getBoolean(sb.m.Z9, true);
        this.f20919s = typedArrayI.getBoolean(sb.m.f51894aa, true);
        this.D = typedArrayI.getBoolean(sb.m.f51942da, true);
        boolean z12 = typedArrayI.getBoolean(sb.m.f51926ca, false);
        this.E = z12;
        typedArrayI.recycle();
        LayoutInflater.from(context2).inflate(sb.i.L, this);
        this.f20916p = true;
        this.f20901a = findViewById(sb.g.f51758f0);
        this.f20902b = (ClippableRoundedCornerLayout) findViewById(sb.g.f51756e0);
        this.f20903c = findViewById(sb.g.W);
        this.f20904d = findViewById(sb.g.f51762h0);
        this.f20905e = (FrameLayout) findViewById(sb.g.f51754d0);
        this.f20906f = (FrameLayout) findViewById(sb.g.f51768k0);
        this.f20907g = (MaterialToolbar) findViewById(sb.g.f51766j0);
        this.f20908h = (Toolbar) findViewById(sb.g.f51750b0);
        this.f20910j = (TextView) findViewById(sb.g.f51748a0);
        this.f20909i = (TextView) findViewById(sb.g.f51760g0);
        this.f20911k = (LinearLayout) findViewById(sb.g.f51764i0);
        this.f20912l = (EditText) findViewById(sb.g.f51752c0);
        this.f20913m = (ImageButton) findViewById(sb.g.X);
        this.f20914n = findViewById(sb.g.Z);
        this.f20915o = (TouchObserverFrameLayout) findViewById(sb.g.Y);
        this.f20917q = new v(context2, this, z12);
        this.f20920t = new cc.a(context2);
        M();
        D();
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        K(resourceId2, string, string2);
        C(z10, z11);
        E();
        G();
        F();
        L();
        setToolbarTouchscreenBlocksFocus(false);
        if (z12) {
            J();
            I(resourceId2, string, string2);
        }
    }

    private void B(d dVar, boolean z10) {
        if (this.F.equals(dVar)) {
            return;
        }
        if (z10) {
            S(dVar);
        }
        this.F = dVar;
        Iterator it = new LinkedHashSet(this.f20921u).iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        R(dVar);
        SearchBar searchBar = this.f20922v;
        if (searchBar == null || dVar != d.HIDDEN) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    private void C(boolean z10, boolean z11) {
        if (z11) {
            this.f20907g.setNavigationIcon((Drawable) null);
            return;
        }
        this.f20907g.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20962a.r();
            }
        });
        if (z10) {
            j.b bVar = new j.b(getContext());
            bVar.d(ac.a.d(this, sb.c.f51614j));
            this.f20907g.setNavigationIcon(bVar);
        }
    }

    private void D() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    private void E() {
        this.f20913m.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.e(this.f20949a, view);
            }
        });
        this.f20912l.addTextChangedListener(new b());
    }

    private void F() {
        this.f20915o.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.l
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.l(this.f20961a, view, motionEvent);
            }
        });
    }

    private void G() {
        this.f20914n.setVisibility(this.D ? 0 : 8);
    }

    private void H() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f20914n.getLayoutParams();
        final int i10 = marginLayoutParams.leftMargin;
        final int i11 = marginLayoutParams.rightMargin;
        q0.w0(this.f20914n, new n0.b0() { // from class: com.google.android.material.search.f
            @Override // n0.b0
            public final k1 a(View view, k1 k1Var) {
                return SearchView.o(marginLayoutParams, i10, i11, view, k1Var);
            }
        });
    }

    private void I(int i10, String str, String str2) {
        if (i10 != -1) {
            androidx.core.widget.i.m(this.f20910j, i10);
        }
        this.f20910j.setText(str);
        this.f20910j.setHint(str2);
    }

    private void J() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f20908h.getLayoutParams();
        layoutParams.gravity = 8388611;
        this.f20908h.setLayoutParams(layoutParams);
        this.f20908h.setVisibility(4);
    }

    private void K(int i10, String str, String str2) {
        if (i10 != -1) {
            androidx.core.widget.i.m(this.f20912l, i10);
        }
        this.f20912l.setText(str);
        this.f20912l.setHint(str2);
        this.f20912l.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.google.android.material.search.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                SearchView.j(this.f20944a, view, z10);
            }
        });
    }

    private void L() {
        O();
        H();
        N();
    }

    private void M() {
        this.f20902b.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.m(view, motionEvent);
            }
        });
    }

    private void N() {
        setUpStatusBarSpacer(getStatusBarHeight());
        q0.w0(this.f20904d, new n0.b0() { // from class: com.google.android.material.search.h
            @Override // n0.b0
            public final k1 a(View view, k1 k1Var) {
                return SearchView.g(this.f20958a, view, k1Var);
            }
        });
    }

    private void O() {
        com.google.android.material.internal.c0.f(this.f20907g, new com.google.android.material.internal.c0.d() { // from class: com.google.android.material.search.g
            @Override // com.google.android.material.internal.c0.d
            public final k1 a(View view, k1 k1Var, com.google.android.material.internal.c0.e eVar) {
                return SearchView.f(this.f20957a, view, k1Var, eVar);
            }
        });
    }

    private void Q(ViewGroup viewGroup, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != this) {
                if (childAt.findViewById(this.f20902b.getId()) != null) {
                    Q((ViewGroup) childAt, z10);
                } else if (z10) {
                    this.G.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                } else {
                    Map map = this.G;
                    if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.G.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    private void R(d dVar) {
        if (this.f20922v == null || !this.f20919s) {
            return;
        }
        if (dVar.equals(d.SHOWN)) {
            this.f20918r.c();
        } else if (dVar.equals(d.HIDDEN)) {
            this.f20918r.f();
        }
    }

    private void S(d dVar) {
        if (dVar == d.SHOWN) {
            setModalForAccessibility(true);
        } else if (dVar == d.HIDDEN) {
            setModalForAccessibility(false);
        }
    }

    private void T() {
        MaterialToolbar materialToolbar = this.f20907g;
        if (materialToolbar == null || w(materialToolbar)) {
            return;
        }
        int defaultNavigationIconResource = getDefaultNavigationIconResource();
        if (this.f20922v == null) {
            this.f20907g.setNavigationIcon(defaultNavigationIconResource);
            return;
        }
        Drawable drawableR = f0.a.r(i.a.b(getContext(), defaultNavigationIconResource).mutate());
        if (this.f20907g.getNavigationIconTint() != null) {
            drawableR.setTint(this.f20907g.getNavigationIconTint().intValue());
        }
        f0.a.m(drawableR, getLayoutDirection());
        this.f20907g.setNavigationIcon(new com.google.android.material.internal.f(this.f20922v.getNavigationIcon(), drawableR));
        U();
    }

    private void U() {
        ImageButton imageButtonD = com.google.android.material.internal.a0.d(this.f20907g);
        if (imageButtonD == null) {
            return;
        }
        int i10 = this.f20902b.getVisibility() == 0 ? 1 : 0;
        Drawable drawableQ = f0.a.q(imageButtonD.getDrawable());
        if (drawableQ instanceof j.b) {
            ((j.b) drawableQ).setProgress(i10);
        }
        if (drawableQ instanceof com.google.android.material.internal.f) {
            ((com.google.android.material.internal.f) drawableQ).a(i10);
        }
    }

    public static /* synthetic */ void e(SearchView searchView, View view) {
        searchView.q();
        searchView.A();
    }

    public static /* synthetic */ k1 f(SearchView searchView, View view, k1 k1Var, com.google.android.material.internal.c0.e eVar) {
        boolean zM = com.google.android.material.internal.c0.m(searchView.f20907g);
        int i10 = zM ? eVar.f20369c : eVar.f20367a;
        int i11 = zM ? eVar.f20367a : eVar.f20369c;
        e0.b bVarG = k1Var.g(k1.s.g() | k1.s.a());
        searchView.f20907g.setPadding(i10 + bVarG.f37000a, eVar.f20368b, i11 + bVarG.f37002c, eVar.f20370d);
        return k1Var;
    }

    public static /* synthetic */ k1 g(SearchView searchView, View view, k1 k1Var) {
        searchView.getClass();
        int i10 = k1Var.g(k1.s.g() | k1.s.a()).f37001b;
        searchView.setUpStatusBarSpacer(i10);
        if (!searchView.C) {
            searchView.setStatusBarSpacerEnabledInternal(i10 > 0);
        }
        return k1Var;
    }

    private Window getActivityWindow() {
        Activity activityA = com.google.android.material.internal.c.a(getContext());
        if (activityA == null) {
            return null;
        }
        return activityA.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f20922v;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(sb.e.f51665a0);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static /* synthetic */ void j(SearchView searchView, View view, boolean z10) {
        if (z10) {
            searchView.getClass();
        } else {
            com.google.android.material.internal.c0.l(view, searchView.B);
        }
    }

    public static /* synthetic */ void k(SearchView searchView) {
        if (searchView.f20912l.requestFocus()) {
            searchView.f20912l.sendAccessibilityEvent(8);
        }
    }

    public static /* synthetic */ boolean l(SearchView searchView, View view, MotionEvent motionEvent) {
        if (!searchView.s()) {
            return false;
        }
        searchView.f20912l.clearFocus();
        return false;
    }

    public static /* synthetic */ boolean m(View view, MotionEvent motionEvent) {
        return true;
    }

    public static /* synthetic */ void n(SearchView searchView) {
        if (searchView.f20912l.requestFocus()) {
            searchView.f20912l.sendAccessibilityEvent(8);
        }
        com.google.android.material.internal.c0.q(searchView.f20912l, searchView.B);
    }

    public static /* synthetic */ k1 o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, View view, k1 k1Var) {
        e0.b bVarG = k1Var.g(k1.s.g() | k1.s.a());
        marginLayoutParams.leftMargin = i10 + bVarG.f37000a;
        marginLayoutParams.rightMargin = i11 + bVarG.f37002c;
        return k1Var;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        this.f20904d.setVisibility(z10 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
        cc.a aVar = this.f20920t;
        if (aVar == null || this.f20903c == null) {
            return;
        }
        this.f20903c.setBackgroundColor(aVar.c(this.A, f10));
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            p(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this.f20905e, false));
        }
    }

    private void setUpStatusBarSpacer(int i10) {
        if (this.f20904d.getLayoutParams().height != i10) {
            this.f20904d.getLayoutParams().height = i10;
            this.f20904d.requestLayout();
        }
    }

    private boolean u() {
        return this.F.equals(d.HIDDEN) || this.F.equals(d.HIDING);
    }

    private boolean w(Toolbar toolbar) {
        return f0.a.q(toolbar.getNavigationIcon()) instanceof j.b;
    }

    void A() {
        if (this.f20926z) {
            z();
        } else {
            if (isInTouchMode()) {
                return;
            }
            this.f20912l.postDelayed(new Runnable() { // from class: com.google.android.material.search.d
                @Override // java.lang.Runnable
                public final void run() {
                    SearchView.k(this.f20952a);
                }
            }, 100L);
        }
    }

    public void P() {
        if (this.F.equals(d.SHOWN) || this.F.equals(d.SHOWING)) {
            return;
        }
        this.f20917q.i0();
    }

    public void V() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f20923w = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // gc.b
    public void a() {
        if (u() || this.f20922v == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f20917q.L();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f20916p) {
            this.f20915o.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    @Override // gc.b
    public void b(androidx.activity.b bVar) {
        SearchBar searchBar;
        if (u() || (searchBar = this.f20922v) == null) {
            return;
        }
        if (!this.E) {
            searchBar.setPlaceholderText(this.f20912l.getText().toString());
        }
        this.f20917q.j0(bVar);
    }

    @Override // gc.b
    public void c(androidx.activity.b bVar) {
        if (u() || this.f20922v == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f20917q.o0(bVar);
    }

    @Override // gc.b
    public void d() {
        if (u()) {
            return;
        }
        androidx.activity.b bVarA0 = this.f20917q.a0();
        if (Build.VERSION.SDK_INT < 34 || this.f20922v == null || bVarA0 == null) {
            r();
        } else {
            this.f20917q.N();
        }
    }

    gc.h getBackHelper() {
        return this.f20917q.O();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        return new Behavior();
    }

    public d getCurrentTransitionState() {
        return this.F;
    }

    protected int getDefaultNavigationIconResource() {
        return sb.f.f51735b;
    }

    public EditText getEditText() {
        return this.f20912l;
    }

    public CharSequence getHint() {
        return this.f20912l.getHint();
    }

    public View getSearchContainer() {
        return this.f20902b;
    }

    public TextView getSearchPrefix() {
        return this.f20909i;
    }

    public CharSequence getSearchPrefixText() {
        return this.f20909i.getText();
    }

    public int getSoftInputMode() {
        return this.f20923w;
    }

    public Editable getText() {
        return this.f20912l.getText();
    }

    public Toolbar getToolbar() {
        return this.f20907g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mc.j.e(this);
        d currentTransitionState = getCurrentTransitionState();
        S(currentTransitionState);
        R(currentTransitionState);
        getViewTreeObserver().addOnTouchModeChangeListener(this.H);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setModalForAccessibility(false);
        this.f20918r.f();
        getViewTreeObserver().removeOnTouchModeChangeListener(this.H);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        V();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        setText(cVar.f20929c);
        setVisible(cVar.f20930d == 0);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        Editable text = getText();
        cVar.f20929c = text == null ? null : text.toString();
        cVar.f20930d = this.f20902b.getVisibility();
        return cVar;
    }

    public void p(View view) {
        this.f20905e.addView(view);
        this.f20905e.setVisibility(0);
    }

    public void q() {
        this.f20912l.setText("");
        this.f20910j.setText("");
    }

    public void r() {
        if (this.F.equals(d.HIDDEN) || this.F.equals(d.HIDING)) {
            return;
        }
        SearchBar searchBar = this.f20922v;
        if (searchBar == null || !searchBar.isAttachedToWindow()) {
            this.f20917q.Z();
            return;
        }
        if (!this.E) {
            this.f20922v.setPlaceholderText(this.f20912l.getText().toString());
        }
        SearchBar searchBar2 = this.f20922v;
        final v vVar = this.f20917q;
        Objects.requireNonNull(vVar);
        searchBar2.post(new Runnable() { // from class: com.google.android.material.search.n
            @Override // java.lang.Runnable
            public final void run() {
                vVar.Z();
            }
        });
    }

    boolean s() {
        return this.f20923w == 48;
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.f20924x = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.f20926z = z10;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setHint(CharSequence charSequence) {
        this.f20912l.setHint(charSequence);
        this.f20910j.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.f20925y = z10;
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            this.G = new HashMap(viewGroup.getChildCount());
        }
        Q(viewGroup, z10);
        if (z10) {
            return;
        }
        this.G = null;
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        this.f20907g.setOnMenuItemClickListener(hVar);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.f20909i.setText(charSequence);
        this.f20909i.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z10) {
        this.C = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    public void setText(CharSequence charSequence) {
        this.f20912l.setText(charSequence);
        this.f20910j.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.f20907g.setTouchscreenBlocksFocus(z10);
    }

    void setTransitionState(d dVar) {
        B(dVar, true);
    }

    public void setUseWindowInsetsController(boolean z10) {
        this.B = z10;
    }

    public void setVisible(boolean z10) {
        boolean z11 = this.f20902b.getVisibility() == 0;
        this.f20902b.setVisibility(z10 ? 0 : 8);
        U();
        B(z10 ? d.SHOWN : d.HIDDEN, z11 != z10);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f20922v = searchBar;
        this.f20917q.g0(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20959a.P();
                }
            });
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new Runnable() { // from class: com.google.android.material.search.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f20960a.P();
                        }
                    });
                    this.f20912l.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        T();
        D();
        R(getCurrentTransitionState());
    }

    public boolean t() {
        return this.f20924x;
    }

    public boolean v() {
        return this.f20925y;
    }

    public boolean x() {
        return this.f20922v != null;
    }

    public boolean y() {
        return this.F.equals(d.SHOWN) || this.F.equals(d.SHOWING);
    }

    public void z() {
        this.f20912l.postDelayed(new Runnable() { // from class: com.google.android.material.search.e
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.n(this.f20953a);
            }
        }, 100L);
    }

    public void setHint(int i10) {
        this.f20912l.setHint(i10);
        this.f20910j.setHint(i10);
    }

    public void setText(int i10) {
        this.f20912l.setText(i10);
        this.f20910j.setText(i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements TextWatcher {
        b() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.f20913m.setVisibility(charSequence.length() > 0 ? 0 : 8);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
