package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.c {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    static final o f1387n0;
    private Rect A;
    private int[] B;
    private int[] C;
    private final ImageView D;
    private final Drawable E;
    private final int F;
    private final int G;
    private final Intent H;
    private final Intent I;
    private final CharSequence J;
    View.OnFocusChangeListener K;
    private View.OnClickListener L;
    private boolean M;
    private boolean N;
    s0.a O;
    private boolean P;
    private CharSequence Q;
    private boolean R;
    private boolean S;
    private int T;
    private boolean U;
    private CharSequence V;
    private CharSequence W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f1388a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f1389b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    SearchableInfo f1390c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Bundle f1391d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final Runnable f1392e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private Runnable f1393f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final WeakHashMap f1394g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final View.OnClickListener f1395h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    View.OnKeyListener f1396i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f1397j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f1398k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f1399l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private TextWatcher f1400m0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final SearchAutoComplete f1401p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f1402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final View f1403r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final View f1404s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final ImageView f1405t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final ImageView f1406u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final ImageView f1407v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final ImageView f1408w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final View f1409x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private q f1410y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Rect f1411z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f1412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SearchView f1413f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f1414g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Runnable f1415h;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, h.a.f39860m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 >= 600) {
                return PsExtractor.AUDIO_STREAM;
            }
            if (i10 < 640 || i11 < 480) {
                return 160;
            }
            return PsExtractor.AUDIO_STREAM;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f1387n0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f1414g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1414g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1412e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1414g) {
                removeCallbacks(this.f1415h);
                post(this.f1415h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f1413f.X();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1413f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1413f.hasFocus() && getVisibility() == 0) {
                this.f1414g = true;
                if (SearchView.K(getContext())) {
                    b();
                }
            }
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f1414g = false;
                removeCallbacks(this.f1415h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1414g = true;
                    return;
                }
                this.f1414g = false;
                removeCallbacks(this.f1415h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f1413f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1412e = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1415h = new a();
            this.f1412e = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.d0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s0.a aVar = SearchView.this.O;
            if (aVar instanceof j0) {
                aVar.a(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.K;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.z();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1405t) {
                searchView.T();
                return;
            }
            if (view == searchView.f1407v) {
                searchView.P();
                return;
            }
            if (view == searchView.f1406u) {
                searchView.U();
            } else if (view == searchView.f1408w) {
                searchView.Y();
            } else if (view == searchView.f1401p) {
                searchView.F();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1390c0 == null) {
                return false;
            }
            if (searchView.f1401p.isPopupShowing() && SearchView.this.f1401p.getListSelection() != -1) {
                return SearchView.this.V(view, i10, keyEvent);
            }
            if (SearchView.this.f1401p.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.N(0, null, searchView2.f1401p.getText().toString());
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.U();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.Q(i10, 0, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface l {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface m {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface n {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Method f1427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f1428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f1429c;

        o() {
            this.f1427a = null;
            this.f1428b = null;
            this.f1429c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f1427a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f1428b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1429c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1428b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1427a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1429c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class p extends u0.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f1430c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i10) {
                return new p[i10];
            }
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1430c + "}";
        }

        @Override // u0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1430c));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1430c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class q extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f1431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f1432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rect f1433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f1434d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f1435e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1436f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1435e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1432b = new Rect();
            this.f1434d = new Rect();
            this.f1433c = new Rect();
            a(rect, rect2);
            this.f1431a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1432b.set(rect);
            this.f1434d.set(rect);
            Rect rect3 = this.f1434d;
            int i10 = this.f1435e;
            rect3.inset(-i10, -i10);
            this.f1433c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f1436f;
                    if (z11 && !this.f1434d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else if (action != 3) {
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f1436f;
                    this.f1436f = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.f1432b.contains(x10, y10)) {
                this.f1436f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f1433c.contains(x10, y10)) {
                Rect rect = this.f1433c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(this.f1431a.getWidth() / 2, this.f1431a.getHeight() / 2);
            }
            return this.f1431a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f1387n0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1411z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f1392e0 = new b();
        this.f1393f0 = new c();
        this.f1394g0 = new WeakHashMap();
        f fVar = new f();
        this.f1395h0 = fVar;
        this.f1396i0 = new g();
        h hVar = new h();
        this.f1397j0 = hVar;
        i iVar = new i();
        this.f1398k0 = iVar;
        j jVar = new j();
        this.f1399l0 = jVar;
        this.f1400m0 = new a();
        int[] iArr = h.j.f40081p2;
        o0 o0VarV = o0.v(context, attributeSet, iArr, i10, 0);
        n0.q0.k0(this, context, iArr, attributeSet, o0VarV.r(), i10, 0);
        LayoutInflater.from(context).inflate(o0VarV.n(h.j.f40131z2, h.g.f39967t), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(h.f.J);
        this.f1401p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1402q = findViewById(h.f.F);
        View viewFindViewById = findViewById(h.f.I);
        this.f1403r = viewFindViewById;
        View viewFindViewById2 = findViewById(h.f.P);
        this.f1404s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(h.f.D);
        this.f1405t = imageView;
        ImageView imageView2 = (ImageView) findViewById(h.f.G);
        this.f1406u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(h.f.E);
        this.f1407v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(h.f.K);
        this.f1408w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(h.f.H);
        this.D = imageView5;
        n0.q0.p0(viewFindViewById, o0VarV.g(h.j.A2));
        n0.q0.p0(viewFindViewById2, o0VarV.g(h.j.E2));
        int i11 = h.j.D2;
        imageView.setImageDrawable(o0VarV.g(i11));
        imageView2.setImageDrawable(o0VarV.g(h.j.f40121x2));
        imageView3.setImageDrawable(o0VarV.g(h.j.f40106u2));
        imageView4.setImageDrawable(o0VarV.g(h.j.G2));
        imageView5.setImageDrawable(o0VarV.g(i11));
        this.E = o0VarV.g(h.j.C2);
        t0.a(imageView, getResources().getString(h.h.f39984o));
        this.F = o0VarV.n(h.j.F2, h.g.f39966s);
        this.G = o0VarV.n(h.j.f40111v2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1400m0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1396i0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(o0VarV.a(h.j.f40126y2, true));
        int iF = o0VarV.f(h.j.f40091r2, -1);
        if (iF != -1) {
            setMaxWidth(iF);
        }
        this.J = o0VarV.p(h.j.f40116w2);
        this.Q = o0VarV.p(h.j.B2);
        int iK = o0VarV.k(h.j.f40101t2, -1);
        if (iK != -1) {
            setImeOptions(iK);
        }
        int iK2 = o0VarV.k(h.j.f40096s2, -1);
        if (iK2 != -1) {
            setInputType(iK2);
        }
        setFocusable(o0VarV.a(h.j.f40086q2, true));
        o0VarV.x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1409x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        i0(this.M);
        e0();
    }

    private Intent A(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.W);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1391d0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1390c0.getSearchActivity());
        return intent;
    }

    private Intent B(Cursor cursor, int i10, String str) {
        int position;
        String strN;
        try {
            String strN2 = j0.n(cursor, "suggest_intent_action");
            if (strN2 == null) {
                strN2 = this.f1390c0.getSuggestIntentAction();
            }
            if (strN2 == null) {
                strN2 = "android.intent.action.SEARCH";
            }
            String str2 = strN2;
            String strN3 = j0.n(cursor, "suggest_intent_data");
            if (strN3 == null) {
                strN3 = this.f1390c0.getSuggestIntentData();
            }
            if (strN3 != null && (strN = j0.n(cursor, "suggest_intent_data_id")) != null) {
                strN3 = strN3 + "/" + Uri.encode(strN);
            }
            return A(str2, strN3 == null ? null : Uri.parse(strN3), j0.n(cursor, "suggest_intent_extra_data"), j0.n(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e10);
            return null;
        }
    }

    private Intent C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1391d0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void E() {
        this.f1401p.dismissDropDown();
    }

    private void G(View view, Rect rect) {
        view.getLocationInWindow(this.B);
        getLocationInWindow(this.C);
        int[] iArr = this.B;
        int i10 = iArr[1];
        int[] iArr2 = this.C;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence H(CharSequence charSequence) {
        if (!this.M || this.E == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1401p.getTextSize()) * 1.25d);
        this.E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean I() {
        Intent intent;
        SearchableInfo searchableInfo = this.f1390c0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            if (this.f1390c0.getVoiceSearchLaunchWebSearch()) {
                intent = this.H;
            } else {
                intent = this.f1390c0.getVoiceSearchLaunchRecognizer() ? this.I : null;
            }
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE) != null) {
                return true;
            }
        }
        return false;
    }

    static boolean K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean L() {
        return (this.P || this.U) && !J();
    }

    private void M(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    private boolean O(int i10, int i11, String str) {
        Cursor cursorC = this.O.c();
        if (cursorC == null || !cursorC.moveToPosition(i10)) {
            return false;
        }
        M(B(cursorC, i11, str));
        return true;
    }

    private void Z() {
        post(this.f1392e0);
    }

    private void a0(int i10) {
        Editable text = this.f1401p.getText();
        Cursor cursorC = this.O.c();
        if (cursorC == null) {
            return;
        }
        if (!cursorC.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceConvertToString = this.O.convertToString(cursorC);
        if (charSequenceConvertToString != null) {
            setQuery(charSequenceConvertToString);
        } else {
            setQuery(text);
        }
    }

    private void c0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f1401p.getText());
        this.f1407v.setVisibility(!zIsEmpty || (this.M && !this.f1388a0) ? 0 : 8);
        Drawable drawable = this.f1407v.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1401p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(H(queryHint));
    }

    private void f0() {
        this.f1401p.setThreshold(this.f1390c0.getSuggestThreshold());
        this.f1401p.setImeOptions(this.f1390c0.getImeOptions());
        int inputType = this.f1390c0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1390c0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f1401p.setInputType(inputType);
        s0.a aVar = this.O;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f1390c0.getSuggestAuthority() != null) {
            j0 j0Var = new j0(getContext(), this, this.f1390c0, this.f1394g0);
            this.O = j0Var;
            this.f1401p.setAdapter(j0Var);
            ((j0) this.O).w(this.R ? 2 : 1);
        }
    }

    private void g0() {
        this.f1404s.setVisibility((L() && (this.f1406u.getVisibility() == 0 || this.f1408w.getVisibility() == 0)) ? 0 : 8);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(h.d.f39887e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(h.d.f39888f);
    }

    private void h0(boolean z10) {
        this.f1406u.setVisibility((this.P && L() && hasFocus() && (z10 || !this.U)) ? 0 : 8);
    }

    private void i0(boolean z10) {
        this.N = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f1401p.getText());
        this.f1405t.setVisibility(i11);
        h0(!zIsEmpty);
        this.f1402q.setVisibility(z10 ? 8 : 0);
        if (this.D.getDrawable() != null && !this.M) {
            i10 = 0;
        }
        this.D.setVisibility(i10);
        c0();
        j0(zIsEmpty);
        g0();
    }

    private void j0(boolean z10) {
        int i10 = 8;
        if (this.U && !J() && z10) {
            this.f1406u.setVisibility(8);
            i10 = 0;
        }
        this.f1408w.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1401p.setText(charSequence);
        this.f1401p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void F() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f1401p);
            return;
        }
        o oVar = f1387n0;
        oVar.b(this.f1401p);
        oVar.a(this.f1401p);
    }

    public boolean J() {
        return this.N;
    }

    void N(int i10, String str, String str2) {
        getContext().startActivity(A("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void P() {
        if (!TextUtils.isEmpty(this.f1401p.getText())) {
            this.f1401p.setText("");
            this.f1401p.requestFocus();
            this.f1401p.setImeVisibility(true);
        } else if (this.M) {
            clearFocus();
            i0(true);
        }
    }

    boolean Q(int i10, int i11, String str) {
        O(i10, 0, null);
        this.f1401p.setImeVisibility(false);
        E();
        return true;
    }

    boolean R(int i10) {
        a0(i10);
        return true;
    }

    protected void S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void T() {
        i0(false);
        this.f1401p.requestFocus();
        this.f1401p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void U() {
        Editable text = this.f1401p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f1390c0 != null) {
            N(0, null, text.toString());
        }
        this.f1401p.setImeVisibility(false);
        E();
    }

    boolean V(View view, int i10, KeyEvent keyEvent) {
        if (this.f1390c0 != null && this.O != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return Q(this.f1401p.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f1401p.setSelection(i10 == 21 ? 0 : this.f1401p.length());
                this.f1401p.setListSelection(0);
                this.f1401p.clearListSelection();
                this.f1401p.b();
                return true;
            }
            if (i10 == 19) {
                this.f1401p.getListSelection();
                return false;
            }
        }
        return false;
    }

    void W(CharSequence charSequence) {
        Editable text = this.f1401p.getText();
        this.W = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        h0(!zIsEmpty);
        j0(zIsEmpty);
        c0();
        g0();
        this.V = charSequence.toString();
    }

    void X() {
        i0(J());
        Z();
        if (this.f1401p.hasFocus()) {
            F();
        }
    }

    void Y() {
        SearchableInfo searchableInfo = this.f1390c0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(D(this.H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(C(this.I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public void b0(CharSequence charSequence, boolean z10) {
        this.f1401p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1401p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.W = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        U();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.S = true;
        super.clearFocus();
        this.f1401p.clearFocus();
        this.f1401p.setImeVisibility(false);
        this.S = false;
    }

    void d0() {
        int[] iArr = this.f1401p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1403r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1404s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1401p.getImeOptions();
    }

    public int getInputType() {
        return this.f1401p.getInputType();
    }

    public int getMaxWidth() {
        return this.T;
    }

    public CharSequence getQuery() {
        return this.f1401p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1390c0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.J : getContext().getText(this.f1390c0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.G;
    }

    int getSuggestionRowLayout() {
        return this.F;
    }

    public s0.a getSuggestionsAdapter() {
        return this.O;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewCollapsed() {
        b0("", false);
        clearFocus();
        i0(true);
        this.f1401p.setImeOptions(this.f1389b0);
        this.f1388a0 = false;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewExpanded() {
        if (this.f1388a0) {
            return;
        }
        this.f1388a0 = true;
        int imeOptions = this.f1401p.getImeOptions();
        this.f1389b0 = imeOptions;
        this.f1401p.setImeOptions(imeOptions | MediaHttpDownloader.MAXIMUM_CHUNK_SIZE);
        this.f1401p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1392e0);
        post(this.f1393f0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            G(this.f1401p, this.f1411z);
            Rect rect = this.A;
            Rect rect2 = this.f1411z;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            q qVar = this.f1410y;
            if (qVar != null) {
                qVar.a(this.A, this.f1411z);
                return;
            }
            q qVar2 = new q(this.A, this.f1411z, this.f1401p);
            this.f1410y = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        if (J()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.T;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.T;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.T) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        i0(pVar.f1430c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f1430c = J();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.S || !isFocusable()) {
            return false;
        }
        if (J()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f1401p.requestFocus(i10, rect);
        if (zRequestFocus) {
            i0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1391d0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            P();
        } else {
            T();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.M == z10) {
            return;
        }
        this.M = z10;
        i0(z10);
        e0();
    }

    public void setImeOptions(int i10) {
        this.f1401p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f1401p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.T = i10;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.K = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.L = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.Q = charSequence;
        e0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.R = z10;
        s0.a aVar = this.O;
        if (aVar instanceof j0) {
            ((j0) aVar).w(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1390c0 = searchableInfo;
        if (searchableInfo != null) {
            f0();
            e0();
        }
        boolean zI = I();
        this.U = zI;
        if (zI) {
            this.f1401p.setPrivateImeOptions("nm");
        }
        i0(J());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.P = z10;
        i0(J());
    }

    public void setSuggestionsAdapter(s0.a aVar) {
        this.O = aVar;
        this.f1401p.setAdapter(aVar);
    }

    void z() {
        if (this.f1409x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1403r.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = z0.b(this);
            int dimensionPixelSize = this.M ? resources.getDimensionPixelSize(h.d.f39885c) + resources.getDimensionPixelSize(h.d.f39886d) : 0;
            this.f1401p.getDropDownBackground().getPadding(rect);
            this.f1401p.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f1401p.setDropDownWidth((((this.f1409x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.W(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.R(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSuggestionListener(n nVar) {
    }
}
