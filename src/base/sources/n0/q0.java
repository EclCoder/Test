package n0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakHashMap f46726a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f46727b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f46728c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f46729d = {b0.c.f8207b, b0.c.f8208c, b0.c.f8219n, b0.c.f8230y, b0.c.B, b0.c.C, b0.c.D, b0.c.E, b0.c.F, b0.c.G, b0.c.f8209d, b0.c.f8210e, b0.c.f8211f, b0.c.f8212g, b0.c.f8213h, b0.c.f8214i, b0.c.f8215j, b0.c.f8216k, b0.c.f8217l, b0.c.f8218m, b0.c.f8220o, b0.c.f8221p, b0.c.f8222q, b0.c.f8223r, b0.c.f8224s, b0.c.f8225t, b0.c.f8226u, b0.c.f8227v, b0.c.f8228w, b0.c.f8229x, b0.c.f8231z, b0.c.A};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d0 f46730e = new d0() { // from class: n0.p0
        @Override // n0.d0
        public final d a(d dVar) {
            return q0.a(dVar);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e f46731f = new e();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends f {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // n0.q0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // n0.q0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.f(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // n0.q0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends f {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // n0.q0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // n0.q0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.e(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // n0.q0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends f {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // n0.q0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // n0.q0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.d(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // n0.q0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends f {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // n0.q0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.b(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // n0.q0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.d(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // n0.q0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f46733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f46734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f46735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f46736d;

        f(int i10, Class cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f46735c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract Object c(View view);

        abstract void d(View view, Object obj);

        Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f46733a);
            if (this.f46734b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                q0.l(view);
                view.setTag(this.f46733a, obj);
                q0.W(view, this.f46736d);
            }
        }

        abstract boolean g(Object obj, Object obj2);

        f(int i10, Class cls, int i11, int i12) {
            this.f46733a = i10;
            this.f46734b = cls;
            this.f46736d = i11;
            this.f46735c = i12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return v0.f46757b ? v0.b(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class h {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            k1 f46737a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f46738b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b0 f46739c;

            a(View view, b0 b0Var) {
                this.f46738b = view;
                this.f46739c = b0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                k1 k1VarF = k1.F(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.f46738b);
                    if (k1VarF.equals(this.f46737a)) {
                        return this.f46739c.a(view, k1VarF).D();
                    }
                }
                this.f46737a = k1VarF;
                k1 k1VarA = this.f46739c.a(view, k1VarF);
                if (i10 >= 30) {
                    return k1VarA.D();
                }
                q0.j0(view);
                return k1VarA.D();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(b0.c.U);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static k1 b(View view, k1 k1Var, Rect rect) {
            WindowInsets windowInsetsD = k1Var.D();
            if (windowInsetsD != null) {
                return k1.F(view.computeSystemWindowInsets(windowInsetsD, rect), view);
            }
            rect.setEmpty();
            return k1Var;
        }

        static void c(View view, b0 b0Var) {
            a aVar = b0Var != null ? new a(view, b0Var) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(b0.c.M, aVar);
            }
            if (view.getTag(b0.c.L) != null) {
                return;
            }
            if (aVar != null) {
                view.setOnApplyWindowInsetsListener(aVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(b0.c.U));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class i {
        public static k1 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            k1 k1VarE = k1.E(rootWindowInsets);
            k1VarE.y(k1VarE);
            k1VarE.p(view.getRootView());
            return k1VarE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class j {
        static void a(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class k {
        static int a(View view) {
            return view.getImportantForAutofill();
        }

        static void b(View view, int i10) {
            view.setImportantForAutofill(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class l {
        static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        static void d(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void f(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class m {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        static void c(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class n {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static o1 c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return o1.g(windowInsetsController);
            }
            return null;
        }

        static void d(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static n0.d b(View view, n0.d dVar) {
            ContentInfo contentInfoF = dVar.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? dVar : n0.d.g(contentInfoPerformReceiveContent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ArrayList f46740d = new ArrayList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakHashMap f46741a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray f46742b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference f46743c = null;

        p() {
        }

        static p a(View view) {
            int i10 = b0.c.S;
            p pVar = (p) view.getTag(i10);
            if (pVar != null) {
                return pVar;
            }
            p pVar2 = new p();
            view.setTag(i10, pVar2);
            return pVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f46741a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f46742b == null) {
                this.f46742b = new SparseArray();
            }
            return this.f46742b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(b0.c.T);
            if (arrayList == null || (size = arrayList.size() - 1) < 0) {
                return false;
            }
            android.support.v4.media.session.b.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f46741a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f46740d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f46741a == null) {
                        this.f46741a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f46740d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f46741a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f46741a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f46743c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f46743c = new WeakReference(keyEvent);
            SparseArray sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static int A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.a(view);
        }
        return 0;
    }

    public static void A0(View view, CharSequence charSequence) {
        G0().f(view, charSequence);
    }

    public static int B(View view) {
        return view.getLayoutDirection();
    }

    public static void B0(View view, List list) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.c(view, list);
        }
    }

    public static int C(View view) {
        return view.getMinimumHeight();
    }

    public static void C0(View view, String str) {
        view.setTransitionName(str);
    }

    public static int D(View view) {
        return view.getMinimumWidth();
    }

    public static void D0(View view, float f10) {
        view.setTranslationZ(f10);
    }

    public static String[] E(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(b0.c.O);
    }

    public static void E0(View view, f1.b bVar) {
        f1.e(view, bVar);
    }

    public static int F(View view) {
        return view.getPaddingEnd();
    }

    public static void F0(View view, float f10) {
        view.setZ(f10);
    }

    public static int G(View view) {
        return view.getPaddingStart();
    }

    private static f G0() {
        return new c(b0.c.Q, CharSequence.class, 64, 30);
    }

    public static ViewParent H(View view) {
        return view.getParentForAccessibility();
    }

    public static void H0(View view) {
        view.stopNestedScroll();
    }

    public static k1 I(View view) {
        return i.a(view);
    }

    public static CharSequence J(View view) {
        return (CharSequence) G0().e(view);
    }

    public static String K(View view) {
        return view.getTransitionName();
    }

    public static float L(View view) {
        return view.getTranslationZ();
    }

    public static o1 M(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return e1.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static int N(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float O(View view) {
        return view.getZ();
    }

    public static boolean P(View view) {
        return o(view) != null;
    }

    public static boolean Q(View view) {
        return view.hasTransientState();
    }

    public static boolean R(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean S(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean T(View view) {
        return view.isLaidOut();
    }

    public static boolean U(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static boolean V(View view) {
        Boolean bool = (Boolean) l0().e(view);
        return bool != null && bool.booleanValue();
    }

    static void W(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = q(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(q(view));
                    u0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i10);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(q(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void X(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void Y(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static k1 Z(View view, k1 k1Var) {
        WindowInsets windowInsetsD = k1Var.D();
        if (windowInsetsD != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsD);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsD)) {
                return k1.F(windowInsetsOnApplyWindowInsets, view);
            }
        }
        return k1Var;
    }

    public static void a0(View view, o0.p pVar) {
        view.onInitializeAccessibilityNodeInfo(pVar.b1());
    }

    private static f b() {
        return new d(b0.c.J, Boolean.class, 28);
    }

    private static f b0() {
        return new b(b0.c.K, CharSequence.class, 8, 28);
    }

    public static int c(View view, CharSequence charSequence, o0.s sVar) {
        int iS = s(view, charSequence);
        if (iS != -1) {
            d(view, new o0.p.a(iS, charSequence, sVar));
        }
        return iS;
    }

    public static n0.d c0(View view, n0.d dVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + dVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, dVar);
        }
        c0 c0Var = (c0) view.getTag(b0.c.N);
        if (c0Var == null) {
            return x(view).a(dVar);
        }
        n0.d dVarA = c0Var.a(view, dVar);
        if (dVarA == null) {
            return null;
        }
        return x(view).a(dVarA);
    }

    private static void d(View view, o0.p.a aVar) {
        l(view);
        h0(aVar.b(), view);
        r(view).add(aVar);
        W(view, 0);
    }

    public static void d0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static a1 e(View view) {
        if (f46726a == null) {
            f46726a = new WeakHashMap();
        }
        a1 a1Var = (a1) f46726a.get(view);
        if (a1Var != null) {
            return a1Var;
        }
        a1 a1Var2 = new a1(view);
        f46726a.put(view, a1Var2);
        return a1Var2;
    }

    public static void e0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static boolean f(View view, int i10) {
        return view.canScrollHorizontally(i10);
    }

    public static void f0(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    public static boolean g(View view, int i10) {
        return view.canScrollVertically(i10);
    }

    public static void g0(View view, int i10) {
        h0(i10, view);
        W(view, 0);
    }

    public static k1 h(View view, k1 k1Var, Rect rect) {
        return h.b(view, k1Var, rect);
    }

    private static void h0(int i10, View view) {
        List listR = r(view);
        for (int i11 = 0; i11 < listR.size(); i11++) {
            if (((o0.p.a) listR.get(i11)).b() == i10) {
                listR.remove(i11);
                return;
            }
        }
    }

    public static k1 i(View view, k1 k1Var) {
        WindowInsets windowInsetsD = k1Var.D();
        if (windowInsetsD != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? n.a(view, windowInsetsD) : g.a(view, windowInsetsD);
            if (!windowInsetsA.equals(windowInsetsD)) {
                return k1.F(windowInsetsA, view);
            }
        }
        return k1Var;
    }

    public static void i0(View view, o0.p.a aVar, CharSequence charSequence, o0.s sVar) {
        if (sVar == null && charSequence == null) {
            g0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, sVar));
        }
    }

    static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).b(view, keyEvent);
    }

    public static void j0(View view) {
        view.requestApplyInsets();
    }

    static boolean k(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).f(keyEvent);
    }

    public static void k0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.b(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    static void l(View view) {
        n0.a aVarN = n(view);
        if (aVarN == null) {
            aVarN = new n0.a();
        }
        m0(view, aVarN);
    }

    private static f l0() {
        return new a(b0.c.P, Boolean.class, 28);
    }

    public static int m() {
        return View.generateViewId();
    }

    public static void m0(View view, n0.a aVar) {
        if (aVar == null && (o(view) instanceof n0.a.C0716a)) {
            aVar = new n0.a();
        }
        u0(view);
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static n0.a n(View view) {
        View.AccessibilityDelegate accessibilityDelegateO = o(view);
        if (accessibilityDelegateO == null) {
            return null;
        }
        return accessibilityDelegateO instanceof n0.a.C0716a ? ((n0.a.C0716a) accessibilityDelegateO).f46566a : new n0.a(accessibilityDelegateO);
    }

    public static void n0(View view, boolean z10) {
        b().f(view, Boolean.valueOf(z10));
    }

    private static View.AccessibilityDelegate o(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : p(view);
    }

    public static void o0(View view, CharSequence charSequence) {
        b0().f(view, charSequence);
        if (charSequence != null) {
            f46731f.a(view);
        } else {
            f46731f.d(view);
        }
    }

    private static View.AccessibilityDelegate p(View view) {
        if (f46728c) {
            return null;
        }
        if (f46727b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f46727b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f46728c = true;
                return null;
            }
        }
        try {
            Object obj = f46727b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f46728c = true;
            return null;
        }
    }

    public static void p0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static CharSequence q(View view) {
        return (CharSequence) b0().e(view);
    }

    public static void q0(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    private static List r(View view) {
        int i10 = b0.c.H;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i10, arrayList2);
        return arrayList2;
    }

    public static void r0(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    private static int s(View view, CharSequence charSequence) {
        List listR = r(view);
        for (int i10 = 0; i10 < listR.size(); i10++) {
            if (TextUtils.equals(charSequence, ((o0.p.a) listR.get(i10)).c())) {
                return ((o0.p.a) listR.get(i10)).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f46729d;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < listR.size(); i14++) {
                z10 &= ((o0.p.a) listR.get(i14)).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static void s0(View view, float f10) {
        view.setElevation(f10);
    }

    public static ColorStateList t(View view) {
        return view.getBackgroundTintList();
    }

    public static void t0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    public static PorterDuff.Mode u(View view) {
        return view.getBackgroundTintMode();
    }

    private static void u0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static Display v(View view) {
        return view.getDisplay();
    }

    public static void v0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.b(view, i10);
        }
    }

    public static float w(View view) {
        return view.getElevation();
    }

    public static void w0(View view, b0 b0Var) {
        h.c(view, b0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static d0 x(View view) {
        return view instanceof d0 ? (d0) view : f46730e;
    }

    public static void x0(View view, f0 f0Var) {
        j.a(view, (PointerIcon) (f0Var != null ? f0Var.a() : null));
    }

    public static boolean y(View view) {
        return view.getFitsSystemWindows();
    }

    public static void y0(View view, boolean z10) {
        l0().f(view, Boolean.valueOf(z10));
    }

    public static int z(View view) {
        return view.getImportantForAccessibility();
    }

    public static void z0(View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakHashMap f46732a = new WeakHashMap();

        e() {
        }

        private void b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z10 = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z10) {
                q0.W(view, z10 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f46732a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f46732a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f46732a.entrySet().iterator();
                while (it.hasNext()) {
                    b((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ n0.d a(n0.d dVar) {
        return dVar;
    }
}
