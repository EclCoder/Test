package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements m.e {
    private static Method G;
    private static Method H;
    private Runnable A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListAdapter f1355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    z f1356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f1366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1367n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f1368o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f1369p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1370q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DataSetObserver f1371r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f1372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Drawable f1373t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private AdapterView.OnItemClickListener f1374u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f1375v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final i f1376w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final h f1377x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final g f1378y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final e f1379z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewS = ListPopupWindow.this.s();
            if (viewS == null || viewS.getWindowToken() == null) {
                return;
            }
            ListPopupWindow.this.show();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListPopupWindow.this.q();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.a()) {
                ListPopupWindow.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.F) != null && popupWindow.isShowing() && x10 >= 0 && x10 < ListPopupWindow.this.F.getWidth() && y10 >= 0 && y10 < ListPopupWindow.this.F.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.B.postDelayed(listPopupWindow.f1376w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
            listPopupWindow2.B.removeCallbacks(listPopupWindow2.f1376w);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z zVar = ListPopupWindow.this.f1356c;
            if (zVar == null || !zVar.isAttachedToWindow() || ListPopupWindow.this.f1356c.getCount() <= ListPopupWindow.this.f1356c.getChildCount()) {
                return;
            }
            int childCount = ListPopupWindow.this.f1356c.getChildCount();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (childCount <= listPopupWindow.f1368o) {
                listPopupWindow.F.setInputMethodMode(2);
                ListPopupWindow.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, h.a.F);
    }

    private void B() {
        View view = this.f1369p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1369p);
            }
        }
    }

    private void N(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.F, z10);
            return;
        }
        Method method = G;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int p() {
        int measuredHeight;
        int i10;
        int iMakeMeasureSpec;
        View view;
        int i11;
        if (this.f1356c == null) {
            Context context = this.f1354a;
            this.A = new a();
            z zVarR = r(context, !this.E);
            this.f1356c = zVarR;
            Drawable drawable = this.f1373t;
            if (drawable != null) {
                zVarR.setSelector(drawable);
            }
            this.f1356c.setAdapter(this.f1355b);
            this.f1356c.setOnItemClickListener(this.f1374u);
            this.f1356c.setFocusable(true);
            this.f1356c.setFocusableInTouchMode(true);
            this.f1356c.setOnItemSelectedListener(new b());
            this.f1356c.setOnScrollListener(this.f1378y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1375v;
            if (onItemSelectedListener != null) {
                this.f1356c.setOnItemSelectedListener(onItemSelectedListener);
            }
            z zVar = this.f1356c;
            View view2 = this.f1369p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f1370q;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(zVar, layoutParams);
                } else if (i12 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f1370q);
                } else {
                    linearLayout.addView(zVar, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f1358e;
                if (i13 >= 0) {
                    i11 = Integer.MIN_VALUE;
                } else {
                    i13 = 0;
                    i11 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i13, i11), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = zVar;
            }
            this.F.setContentView(view);
        } else {
            View view3 = this.f1369p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            int i14 = rect.top;
            i10 = rect.bottom + i14;
            if (!this.f1362i) {
                this.f1360g = -i14;
            }
        } else {
            this.C.setEmpty();
            i10 = 0;
        }
        int iT = t(s(), this.f1360g, this.F.getInputMethodMode() == 2);
        if (this.f1366m || this.f1357d == -1) {
            return iT + i10;
        }
        int i15 = this.f1358e;
        if (i15 == -2) {
            int i16 = this.f1354a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i15 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            int i17 = this.f1354a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f1356c.d(iMakeMeasureSpec, 0, -1, iT - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i10 + this.f1356c.getPaddingTop() + this.f1356c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    private int t(View view, int i10, boolean z10) {
        return c.a(this.F, view, i10, z10);
    }

    public boolean A() {
        return this.E;
    }

    public void C(View view) {
        this.f1372s = view;
    }

    public void D(int i10) {
        this.F.setAnimationStyle(i10);
    }

    public void E(int i10) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            Q(i10);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.f1358e = rect.left + rect.right + i10;
    }

    public void F(int i10) {
        this.f1365l = i10;
    }

    public void G(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void H(int i10) {
        this.F.setInputMethodMode(i10);
    }

    public void I(boolean z10) {
        this.E = z10;
        this.F.setFocusable(z10);
    }

    public void J(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void K(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1374u = onItemClickListener;
    }

    public void L(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f1375v = onItemSelectedListener;
    }

    public void M(boolean z10) {
        this.f1364k = true;
        this.f1363j = z10;
    }

    public void O(int i10) {
        this.f1370q = i10;
    }

    public void P(int i10) {
        z zVar = this.f1356c;
        if (!a() || zVar == null) {
            return;
        }
        zVar.setListSelectionHidden(false);
        zVar.setSelection(i10);
        if (zVar.getChoiceMode() != 0) {
            zVar.setItemChecked(i10, true);
        }
    }

    public void Q(int i10) {
        this.f1358e = i10;
    }

    @Override // m.e
    public boolean a() {
        return this.F.isShowing();
    }

    public void b(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public int c() {
        return this.f1359f;
    }

    @Override // m.e
    public void dismiss() {
        this.F.dismiss();
        B();
        this.F.setContentView(null);
        this.f1356c = null;
        this.B.removeCallbacks(this.f1376w);
    }

    public void e(int i10) {
        this.f1359f = i10;
    }

    public Drawable g() {
        return this.F.getBackground();
    }

    public void i(int i10) {
        this.f1360g = i10;
        this.f1362i = true;
    }

    public int l() {
        if (this.f1362i) {
            return this.f1360g;
        }
        return 0;
    }

    public void m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1371r;
        if (dataSetObserver == null) {
            this.f1371r = new f();
        } else {
            ListAdapter listAdapter2 = this.f1355b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1355b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1371r);
        }
        z zVar = this.f1356c;
        if (zVar != null) {
            zVar.setAdapter(this.f1355b);
        }
    }

    @Override // m.e
    public ListView o() {
        return this.f1356c;
    }

    public void q() {
        z zVar = this.f1356c;
        if (zVar != null) {
            zVar.setListSelectionHidden(true);
            zVar.requestLayout();
        }
    }

    z r(Context context, boolean z10) {
        return new z(context, z10);
    }

    public View s() {
        return this.f1372s;
    }

    @Override // m.e
    public void show() {
        int iP = p();
        boolean z10 = z();
        androidx.core.widget.h.b(this.F, this.f1361h);
        if (this.F.isShowing()) {
            if (s().isAttachedToWindow()) {
                int width = this.f1358e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = s().getWidth();
                }
                int i10 = this.f1357d;
                if (i10 == -1) {
                    if (!z10) {
                        iP = -1;
                    }
                    if (z10) {
                        this.F.setWidth(this.f1358e == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.f1358e == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    iP = i10;
                }
                this.F.setOutsideTouchable((this.f1367n || this.f1366m) ? false : true);
                this.F.update(s(), this.f1359f, this.f1360g, width < 0 ? -1 : width, iP < 0 ? -1 : iP);
                return;
            }
            return;
        }
        int width2 = this.f1358e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = s().getWidth();
        }
        int i11 = this.f1357d;
        if (i11 == -1) {
            iP = -1;
        } else if (i11 != -2) {
            iP = i11;
        }
        this.F.setWidth(width2);
        this.F.setHeight(iP);
        N(true);
        this.F.setOutsideTouchable((this.f1367n || this.f1366m) ? false : true);
        this.F.setTouchInterceptor(this.f1377x);
        if (this.f1364k) {
            androidx.core.widget.h.a(this.F, this.f1363j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = H;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.a(this.F, this.D);
        }
        androidx.core.widget.h.c(this.F, s(), this.f1359f, this.f1360g, this.f1365l);
        this.f1356c.setSelection(-1);
        if (!this.E || this.f1356c.isInTouchMode()) {
            q();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.f1379z);
    }

    public Object u() {
        if (a()) {
            return this.f1356c.getSelectedItem();
        }
        return null;
    }

    public long v() {
        if (a()) {
            return this.f1356c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int w() {
        if (a()) {
            return this.f1356c.getSelectedItemPosition();
        }
        return -1;
    }

    public View x() {
        if (a()) {
            return this.f1356c.getSelectedView();
        }
        return null;
    }

    public int y() {
        return this.f1358e;
    }

    public boolean z() {
        return this.F.getInputMethodMode() == 2;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1357d = -2;
        this.f1358e = -2;
        this.f1361h = 1002;
        this.f1365l = 0;
        this.f1366m = false;
        this.f1367n = false;
        this.f1368o = Integer.MAX_VALUE;
        this.f1370q = 0;
        this.f1376w = new i();
        this.f1377x = new h();
        this.f1378y = new g();
        this.f1379z = new e();
        this.C = new Rect();
        this.f1354a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.j.f40110v1, i10, i11);
        this.f1359f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(h.j.f40115w1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(h.j.f40120x1, 0);
        this.f1360g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1362i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i10, i11);
        this.F = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            z zVar;
            if (i10 == -1 || (zVar = ListPopupWindow.this.f1356c) == null) {
                return;
            }
            zVar.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || ListPopupWindow.this.z() || ListPopupWindow.this.F.getContentView() == null) {
                return;
            }
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            listPopupWindow.B.removeCallbacks(listPopupWindow.f1376w);
            ListPopupWindow.this.f1376w.run();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }
    }
}
