package androidx.databinding;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import androidx.lifecycle.s;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends androidx.databinding.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f3449r = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f3458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q[] f3461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f3462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.databinding.c f3463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f3464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Choreographer f3465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Choreographer.FrameCallback f3466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Handler f3467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p f3468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b0 f3469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private k f3470n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f3471o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected boolean f3472p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static int f3448q = Build.VERSION.SDK_INT;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final boolean f3450s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final androidx.databinding.d f3451t = new a();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final androidx.databinding.d f3452u = new b();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final androidx.databinding.d f3453v = new c();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final androidx.databinding.d f3454w = new d();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final androidx.databinding.c.a f3455x = new e();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final ReferenceQueue f3456y = new ReferenceQueue();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final View.OnAttachStateChangeListener f3457z = new f();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements androidx.databinding.d {
        a() {
        }

        @Override // androidx.databinding.d
        public q a(p pVar, int i10, ReferenceQueue referenceQueue) {
            return new n(pVar, i10, referenceQueue).f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements androidx.databinding.d {
        b() {
        }

        @Override // androidx.databinding.d
        public q a(p pVar, int i10, ReferenceQueue referenceQueue) {
            return new l(pVar, i10, referenceQueue).e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements androidx.databinding.d {
        c() {
        }

        @Override // androidx.databinding.d
        public q a(p pVar, int i10, ReferenceQueue referenceQueue) {
            return new m(pVar, i10, referenceQueue).e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements androidx.databinding.d {
        d() {
        }

        @Override // androidx.databinding.d
        public q a(p pVar, int i10, ReferenceQueue referenceQueue) {
            return new j(pVar, i10, referenceQueue).g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends androidx.databinding.c.a {
        e() {
        }

        @Override // androidx.databinding.c.a
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2, int i10, Object obj3) {
            android.support.v4.media.session.b.a(obj);
            b(null, (p) obj2, i10, (Void) obj3);
        }

        public void b(androidx.databinding.n nVar, p pVar, int i10, Void r10) {
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                p.this.f3459c = false;
            }
            p.L();
            if (p.this.f3462f.isAttachedToWindow()) {
                p.this.v();
            } else {
                p.this.f3462f.removeOnAttachStateChangeListener(p.f3457z);
                p.this.f3462f.addOnAttachStateChangeListener(p.f3457z);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h implements Choreographer.FrameCallback {
        h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            p.this.f3458b.run();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[][] f3475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[][] f3476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[][] f3477c;

        public i(int i10) {
            this.f3475a = new String[i10][];
            this.f3476b = new int[i10][];
            this.f3477c = new int[i10][];
        }

        public void a(int i10, String[] strArr, int[] iArr, int[] iArr2) {
            this.f3475a[i10] = strArr;
            this.f3476b[i10] = iArr;
            this.f3477c[i10] = iArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class j implements q0, androidx.databinding.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final q f3478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference f3479b = null;

        public j(p pVar, int i10, ReferenceQueue referenceQueue) {
            this.f3478a = new q(pVar, i10, this, referenceQueue);
        }

        private b0 f() {
            WeakReference weakReference = this.f3479b;
            if (weakReference == null) {
                return null;
            }
            return (b0) weakReference.get();
        }

        @Override // androidx.databinding.m
        public void a(b0 b0Var) {
            b0 b0VarF = f();
            k0 k0Var = (k0) this.f3478a.b();
            if (k0Var != null) {
                if (b0VarF != null) {
                    k0Var.o(this);
                }
                if (b0Var != null) {
                    k0Var.j(b0Var, this);
                }
            }
            if (b0Var != null) {
                this.f3479b = new WeakReference(b0Var);
            }
        }

        @Override // androidx.lifecycle.q0
        public void d(Object obj) {
            p pVarA = this.f3478a.a();
            if (pVarA != null) {
                q qVar = this.f3478a;
                pVarA.C(qVar.f3485b, qVar.b(), 0);
            }
        }

        @Override // androidx.databinding.m
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(k0 k0Var) {
            b0 b0VarF = f();
            if (b0VarF != null) {
                k0Var.j(b0VarF, this);
            }
        }

        public q g() {
            return this.f3478a;
        }

        @Override // androidx.databinding.m
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void b(k0 k0Var) {
            k0Var.o(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class k implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference f3480a;

        /* synthetic */ k(p pVar, a aVar) {
            this(pVar);
        }

        @r0(s.a.ON_START)
        public void onStart() {
            p pVar = (p) this.f3480a.get();
            if (pVar != null) {
                pVar.v();
            }
        }

        private k(p pVar) {
            this.f3480a = new WeakReference(pVar);
        }
    }

    protected p(androidx.databinding.f fVar, View view, int i10) {
        this.f3458b = new g();
        this.f3459c = false;
        this.f3460d = false;
        this.f3461e = new q[i10];
        this.f3462f = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f3450s) {
            this.f3465i = Choreographer.getInstance();
            this.f3466j = new h();
        } else {
            this.f3466j = null;
            this.f3467k = new Handler(Looper.myLooper());
        }
    }

    protected static int A(View view, int i10) {
        return view.getContext().getColor(i10);
    }

    protected static p E(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10, Object obj) {
        q(obj);
        return androidx.databinding.g.i(layoutInflater, i10, viewGroup, z10, null);
    }

    private static boolean G(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return false;
        }
        while (i10 < length) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    private static void H(androidx.databinding.f fVar, View view, Object[] objArr, i iVar, SparseIntArray sparseIntArray, boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        boolean z13;
        int iW;
        int id2;
        int i13;
        int iK;
        boolean z14;
        i iVar2 = iVar;
        SparseIntArray sparseIntArray2 = sparseIntArray;
        if (y(view) != null) {
            return;
        }
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        boolean z15 = true;
        if (z10 && str != null && str.startsWith(TtmlNode.TAG_LAYOUT)) {
            int iLastIndexOf = str.lastIndexOf(95);
            if (iLastIndexOf > 0) {
                int i14 = iLastIndexOf + 1;
                if (G(str, i14)) {
                    iK = K(str, i14);
                    if (objArr[iK] == null) {
                        objArr[iK] = view;
                    }
                    if (iVar2 == null) {
                        iK = -1;
                    }
                    z14 = true;
                } else {
                    iK = -1;
                    z14 = false;
                }
            } else {
                iK = -1;
                z14 = false;
            }
            boolean z16 = z14;
            i10 = iK;
            z11 = z16;
        } else if (str == null || !str.startsWith("binding_")) {
            i10 = -1;
            z11 = false;
        } else {
            int iK2 = K(str, f3449r);
            if (objArr[iK2] == null) {
                objArr[iK2] = view;
            }
            if (iVar2 == null) {
                iK2 = -1;
            }
            i10 = iK2;
            z11 = true;
        }
        if (!z11 && (id2 = view.getId()) > 0 && sparseIntArray2 != null && (i13 = sparseIntArray2.get(id2, -1)) >= 0 && objArr[i13] == null) {
            objArr[i13] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i15 = 0;
            int i16 = 0;
            while (i15 < childCount) {
                View childAt = viewGroup.getChildAt(i15);
                if (i10 < 0 || !(childAt.getTag() instanceof String)) {
                    z12 = z15;
                    i11 = i15;
                    i12 = i16;
                    z13 = false;
                } else {
                    String str2 = (String) childAt.getTag();
                    if (!str2.endsWith("_0") || !str2.startsWith(TtmlNode.TAG_LAYOUT) || str2.indexOf(47) <= 0 || (iW = w(str2, i16, iVar2, i10)) < 0) {
                        z12 = z15;
                        i11 = i15;
                        i12 = i16;
                        z13 = false;
                    } else {
                        int i17 = iW + 1;
                        int i18 = iVar2.f3476b[i10][iW];
                        int i19 = iVar2.f3477c[i10][iW];
                        int iX = x(viewGroup, i15);
                        if (iX == i15) {
                            objArr[i18] = androidx.databinding.g.c(fVar, childAt, i19);
                            i11 = i15;
                            z13 = z15;
                            z12 = z13;
                            i12 = i17;
                        } else {
                            int i20 = iX - i15;
                            int i21 = i20 + 1;
                            View[] viewArr = new View[i21];
                            z12 = z15;
                            int i22 = 0;
                            while (i22 < i21) {
                                int i23 = i15;
                                viewArr[i22] = viewGroup.getChildAt(i23 + i22);
                                i22++;
                                i15 = i23;
                            }
                            objArr[i18] = androidx.databinding.g.d(fVar, viewArr, i19);
                            i11 = i15 + i20;
                            i12 = i17;
                            z13 = z12;
                        }
                    }
                }
                if (!z13) {
                    H(fVar, childAt, objArr, iVar2, sparseIntArray2, false);
                }
                i15 = i11 + 1;
                iVar2 = iVar;
                sparseIntArray2 = sparseIntArray;
                i16 = i12;
                z15 = z12;
            }
        }
    }

    protected static Object[] I(androidx.databinding.f fVar, View view, int i10, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        H(fVar, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    private static int K(String str, int i10) {
        int length = str.length();
        int iCharAt = 0;
        while (i10 < length) {
            iCharAt = (iCharAt * 10) + (str.charAt(i10) - '0');
            i10++;
        }
        return iCharAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void L() {
        while (true) {
            Reference referencePoll = f3456y.poll();
            if (referencePoll == null) {
                return;
            }
            if (referencePoll instanceof q) {
                ((q) referencePoll).e();
            }
        }
    }

    protected static float O(Float f10) {
        if (f10 == null) {
            return 0.0f;
        }
        return f10.floatValue();
    }

    protected static int P(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    protected static boolean Q(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private static androidx.databinding.f q(Object obj) {
        if (obj == null) {
            return null;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    private void t() {
        if (this.f3464h) {
            N();
            return;
        }
        if (D()) {
            this.f3464h = true;
            this.f3460d = false;
            androidx.databinding.c cVar = this.f3463g;
            if (cVar != null) {
                cVar.e(this, 1, null);
                if (this.f3460d) {
                    this.f3463g.e(this, 2, null);
                }
            }
            if (!this.f3460d) {
                s();
                androidx.databinding.c cVar2 = this.f3463g;
                if (cVar2 != null) {
                    cVar2.e(this, 3, null);
                }
            }
            this.f3464h = false;
        }
    }

    protected static void u(p pVar) {
        pVar.t();
    }

    private static int w(String str, int i10, i iVar, int i11) {
        CharSequence charSequenceSubSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = iVar.f3475a[i11];
        int length = strArr.length;
        while (i10 < length) {
            if (TextUtils.equals(charSequenceSubSequence, strArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private static int x(ViewGroup viewGroup, int i10) {
        String str = (String) viewGroup.getChildAt(i10).getTag();
        String strSubstring = str.substring(0, str.length() - 1);
        int length = strSubstring.length();
        int childCount = viewGroup.getChildCount();
        for (int i11 = i10 + 1; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(strSubstring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    break;
                }
                if (G(str2, length)) {
                    i10 = i11;
                }
            }
        }
        return i10;
    }

    static p y(View view) {
        if (view != null) {
            return (p) view.getTag(x0.a.f56564a);
        }
        return null;
    }

    public static int z() {
        return f3448q;
    }

    public View B() {
        return this.f3462f;
    }

    protected void C(int i10, Object obj, int i11) {
        if (this.f3471o || this.f3472p || !J(i10, obj, i11)) {
            return;
        }
        N();
    }

    public abstract boolean D();

    public abstract void F();

    protected abstract boolean J(int i10, Object obj, int i11);

    protected void M(int i10, Object obj, androidx.databinding.d dVar) {
        if (obj == null) {
            return;
        }
        q qVarA = this.f3461e[i10];
        if (qVarA == null) {
            qVarA = dVar.a(this, i10, f3456y);
            this.f3461e[i10] = qVarA;
            b0 b0Var = this.f3469m;
            if (b0Var != null) {
                qVarA.c(b0Var);
            }
        }
        qVarA.d(obj);
    }

    protected void N() {
        p pVar = this.f3468l;
        if (pVar != null) {
            pVar.N();
            return;
        }
        b0 b0Var = this.f3469m;
        if (b0Var == null || b0Var.getLifecycle().b().e(s.b.STARTED)) {
            synchronized (this) {
                try {
                    if (this.f3459c) {
                        return;
                    }
                    this.f3459c = true;
                    if (f3450s) {
                        this.f3465i.postFrameCallback(this.f3466j);
                    } else {
                        this.f3467k.post(this.f3458b);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    protected void R(p pVar) {
        if (pVar != null) {
            pVar.f3468l = this;
        }
    }

    public void S(b0 b0Var) {
        if (b0Var instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        b0 b0Var2 = this.f3469m;
        if (b0Var2 == b0Var) {
            return;
        }
        if (b0Var2 != null) {
            b0Var2.getLifecycle().d(this.f3470n);
        }
        this.f3469m = b0Var;
        if (b0Var != null) {
            if (this.f3470n == null) {
                this.f3470n = new k(this, null);
            }
            b0Var.getLifecycle().a(this.f3470n);
        }
        for (q qVar : this.f3461e) {
            if (qVar != null) {
                qVar.c(b0Var);
            }
        }
    }

    protected void T(View view) {
        view.setTag(x0.a.f56564a, this);
    }

    protected boolean U(int i10) {
        q qVar = this.f3461e[i10];
        if (qVar != null) {
            return qVar.e();
        }
        return false;
    }

    protected boolean V(int i10, k0 k0Var) {
        this.f3471o = true;
        try {
            return X(i10, k0Var, f3454w);
        } finally {
            this.f3471o = false;
        }
    }

    protected boolean W(int i10, androidx.databinding.i iVar) {
        return X(i10, iVar, f3451t);
    }

    protected boolean X(int i10, Object obj, androidx.databinding.d dVar) {
        if (obj == null) {
            return U(i10);
        }
        q qVar = this.f3461e[i10];
        if (qVar == null) {
            M(i10, obj, dVar);
            return true;
        }
        if (qVar.b() == obj) {
            return false;
        }
        U(i10);
        M(i10, obj, dVar);
        return true;
    }

    protected abstract void s();

    public void v() {
        p pVar = this.f3468l;
        if (pVar == null) {
            t();
        } else {
            pVar.v();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected p(Object obj, View view, int i10) {
        this((androidx.databinding.f) null, view, i10);
        q(obj);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements View.OnAttachStateChangeListener {
        f() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            p.y(view).f3458b.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class l extends androidx.databinding.k.a implements androidx.databinding.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final q f3481a;

        public l(p pVar, int i10, ReferenceQueue referenceQueue) {
            this.f3481a = new q(pVar, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.m
        public /* bridge */ /* synthetic */ void b(Object obj) {
            android.support.v4.media.session.b.a(obj);
            f(null);
        }

        @Override // androidx.databinding.m
        public /* bridge */ /* synthetic */ void c(Object obj) {
            android.support.v4.media.session.b.a(obj);
            d(null);
        }

        public void d(androidx.databinding.k kVar) {
            kVar.m0(this);
        }

        public q e() {
            return this.f3481a;
        }

        public void f(androidx.databinding.k kVar) {
            kVar.c(this);
        }

        @Override // androidx.databinding.m
        public void a(b0 b0Var) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class m extends androidx.databinding.l.a implements androidx.databinding.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final q f3482a;

        public m(p pVar, int i10, ReferenceQueue referenceQueue) {
            this.f3482a = new q(pVar, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.m
        public /* bridge */ /* synthetic */ void b(Object obj) {
            android.support.v4.media.session.b.a(obj);
            f(null);
        }

        @Override // androidx.databinding.m
        public /* bridge */ /* synthetic */ void c(Object obj) {
            android.support.v4.media.session.b.a(obj);
            d(null);
        }

        public void d(androidx.databinding.l lVar) {
            lVar.b(this);
        }

        public q e() {
            return this.f3482a;
        }

        public void f(androidx.databinding.l lVar) {
            lVar.d(this);
        }

        @Override // androidx.databinding.m
        public void a(b0 b0Var) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class n extends androidx.databinding.i.a implements androidx.databinding.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final q f3483a;

        public n(p pVar, int i10, ReferenceQueue referenceQueue) {
            this.f3483a = new q(pVar, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.i.a
        public void d(androidx.databinding.i iVar, int i10) {
            p pVarA = this.f3483a.a();
            if (pVarA != null && ((androidx.databinding.i) this.f3483a.b()) == iVar) {
                pVarA.C(this.f3483a.f3485b, iVar, i10);
            }
        }

        @Override // androidx.databinding.m
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(androidx.databinding.i iVar) {
            iVar.a(this);
        }

        public q f() {
            return this.f3483a;
        }

        @Override // androidx.databinding.m
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void b(androidx.databinding.i iVar) {
            iVar.e(this);
        }

        @Override // androidx.databinding.m
        public void a(b0 b0Var) {
        }
    }
}
