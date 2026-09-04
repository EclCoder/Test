package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final f f1222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f1223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f1224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Drawable f1225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final FrameLayout f1226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageView f1227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final FrameLayout f1228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ImageView f1229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f1230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    n0.b f1231j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final DataSetObserver f1232k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f1233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ListPopupWindow f1234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    PopupWindow.OnDismissListener f1235n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f1236o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f1237p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f1238q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1239r;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int[] f1240a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            o0 o0VarU = o0.u(context, attributeSet, f1240a);
            setBackgroundDrawable(o0VarU.g(0));
            o0VarU.x();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f1222a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f1222a.notifyDataSetInvalidated();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.b()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().show();
                n0.b bVar = ActivityChooserView.this.f1231j;
                if (bVar != null) {
                    bVar.j(true);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends View.AccessibilityDelegate {
        c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            o0.p.c1(accessibilityNodeInfo).r0(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends b0 {
        d(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.b0
        public m.e b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.b0
        protected boolean c() {
            ActivityChooserView.this.c();
            return true;
        }

        @Override // androidx.appcompat.widget.b0
        protected boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class f extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1246a = 4;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f1247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f1248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f1249d;

        f() {
        }

        public int a() {
            throw null;
        }

        public androidx.appcompat.widget.d b() {
            return null;
        }

        public ResolveInfo c() {
            throw null;
        }

        public int d() {
            throw null;
        }

        public boolean e() {
            return this.f1247b;
        }

        public void f(androidx.appcompat.widget.d dVar) {
            ActivityChooserView.this.f1222a.b();
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            throw null;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (this.f1247b) {
                throw null;
            }
            throw null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i10) {
            return (this.f1249d && i10 == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(h.g.f39953f, viewGroup, false);
                viewInflate.setId(1);
                ((TextView) viewInflate.findViewById(h.f.S)).setText(ActivityChooserView.this.getContext().getString(h.h.f39971b));
                return viewInflate;
            }
            if (view == null || view.getId() != h.f.f39945x) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(h.g.f39953f, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(h.f.f39943v);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i10);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(h.f.S)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f1247b && i10 == 0 && this.f1248c) {
                view.setActivated(true);
                return view;
            }
            view.setActivated(false);
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        g() {
        }

        private void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f1235n;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f1228g) {
                activityChooserView.a();
                ActivityChooserView.this.f1222a.c();
                ActivityChooserView.this.f1222a.b();
                throw null;
            }
            if (view != activityChooserView.f1226e) {
                throw new IllegalArgumentException();
            }
            activityChooserView.f1236o = false;
            activityChooserView.d(activityChooserView.f1237p);
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            a();
            n0.b bVar = ActivityChooserView.this.f1231j;
            if (bVar != null) {
                bVar.j(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.d(Integer.MAX_VALUE);
                return;
            }
            ActivityChooserView.this.a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (!activityChooserView.f1236o) {
                activityChooserView.f1222a.e();
                ActivityChooserView.this.f1222a.b();
                throw null;
            }
            if (i10 <= 0) {
                return;
            }
            activityChooserView.f1222a.b();
            throw null;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f1228g) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.f1222a.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.f1236o = true;
                activityChooserView2.d(activityChooserView2.f1237p);
            }
            return true;
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1232k = new a();
        this.f1233l = new b();
        this.f1237p = 4;
        int[] iArr = h.j.E;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        n0.q0.k0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        this.f1237p = typedArrayObtainStyledAttributes.getInt(h.j.G, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(h.j.F);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(h.g.f39952e, (ViewGroup) this, true);
        g gVar = new g();
        this.f1223b = gVar;
        View viewFindViewById = findViewById(h.f.f39931j);
        this.f1224c = viewFindViewById;
        this.f1225d = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(h.f.f39939r);
        this.f1228g = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        int i11 = h.f.f39944w;
        this.f1229h = (ImageView) frameLayout.findViewById(i11);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(h.f.f39941t);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.f1226e = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i11);
        this.f1227f = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.f1222a = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.f1230i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(h.d.f39884b));
    }

    public boolean a() {
        if (!b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f1233l);
        return true;
    }

    public boolean b() {
        return getListPopupWindow().a();
    }

    public boolean c() {
        if (b() || !this.f1238q) {
            return false;
        }
        this.f1236o = false;
        d(this.f1237p);
        return true;
    }

    void d(int i10) {
        this.f1222a.b();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    void e() {
        if (this.f1222a.getCount() > 0) {
            this.f1226e.setEnabled(true);
        } else {
            this.f1226e.setEnabled(false);
        }
        int iA = this.f1222a.a();
        int iD = this.f1222a.d();
        if (iA == 1 || (iA > 1 && iD > 0)) {
            this.f1228g.setVisibility(0);
            ResolveInfo resolveInfoC = this.f1222a.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f1229h.setImageDrawable(resolveInfoC.loadIcon(packageManager));
            if (this.f1239r != 0) {
                this.f1228g.setContentDescription(getContext().getString(this.f1239r, resolveInfoC.loadLabel(packageManager)));
            }
        } else {
            this.f1228g.setVisibility(8);
        }
        if (this.f1228g.getVisibility() == 0) {
            this.f1224c.setBackgroundDrawable(this.f1225d);
        } else {
            this.f1224c.setBackgroundDrawable(null);
        }
    }

    public androidx.appcompat.widget.d getDataModel() {
        this.f1222a.b();
        return null;
    }

    ListPopupWindow getListPopupWindow() {
        if (this.f1234m == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f1234m = listPopupWindow;
            listPopupWindow.m(this.f1222a);
            this.f1234m.C(this);
            this.f1234m.I(true);
            this.f1234m.K(this.f1223b);
            this.f1234m.J(this.f1223b);
        }
        return this.f1234m;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1222a.b();
        this.f1238q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1222a.b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1233l);
        }
        if (b()) {
            a();
        }
        this.f1238q = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f1224c.layout(0, 0, i12 - i10, i13 - i11);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        View view = this.f1224c;
        if (this.f1228g.getVisibility() != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824);
        }
        measureChild(view, i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(androidx.appcompat.widget.d dVar) {
        this.f1222a.f(dVar);
        if (b()) {
            a();
            c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i10) {
        this.f1239r = i10;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i10) {
        this.f1227f.setContentDescription(getContext().getString(i10));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f1227f.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i10) {
        this.f1237p = i10;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f1235n = onDismissListener;
    }

    public void setProvider(n0.b bVar) {
        this.f1231j = bVar;
    }
}
