package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f4299f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f4300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f4301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f4302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4304e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x0 a(ViewGroup container, f0 fragmentManager) {
            kotlin.jvm.internal.s.h(container, "container");
            kotlin.jvm.internal.s.h(fragmentManager, "fragmentManager");
            z0 z0VarF0 = fragmentManager.F0();
            kotlin.jvm.internal.s.g(z0VarF0, "fragmentManager.specialEffectsControllerFactory");
            return b(container, z0VarF0);
        }

        public final x0 b(ViewGroup container, z0 factory) {
            kotlin.jvm.internal.s.h(container, "container");
            kotlin.jvm.internal.s.h(factory, "factory");
            int i10 = i1.b.f40740b;
            Object tag = container.getTag(i10);
            if (tag instanceof x0) {
                return (x0) tag;
            }
            x0 x0VarA = factory.a(container);
            kotlin.jvm.internal.s.g(x0VarA, "factory.createController(container)");
            container.setTag(i10, x0VarA);
            return x0VarA;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final m0 f4305h;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(c.b finalState, c.a lifecycleImpact, m0 fragmentStateManager, j0.f cancellationSignal) {
            kotlin.jvm.internal.s.h(finalState, "finalState");
            kotlin.jvm.internal.s.h(lifecycleImpact, "lifecycleImpact");
            kotlin.jvm.internal.s.h(fragmentStateManager, "fragmentStateManager");
            kotlin.jvm.internal.s.h(cancellationSignal, "cancellationSignal");
            Fragment fragmentK = fragmentStateManager.k();
            kotlin.jvm.internal.s.g(fragmentK, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, fragmentK, cancellationSignal);
            this.f4305h = fragmentStateManager;
        }

        @Override // androidx.fragment.app.x0.c
        public void e() {
            super.e();
            this.f4305h.m();
        }

        @Override // androidx.fragment.app.x0.c
        public void n() {
            if (i() != c.a.ADDING) {
                if (i() == c.a.REMOVING) {
                    Fragment fragmentK = this.f4305h.k();
                    kotlin.jvm.internal.s.g(fragmentK, "fragmentStateManager.fragment");
                    View viewRequireView = fragmentK.requireView();
                    kotlin.jvm.internal.s.g(viewRequireView, "fragment.requireView()");
                    if (f0.N0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragmentK);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragmentK2 = this.f4305h.k();
            kotlin.jvm.internal.s.g(fragmentK2, "fragmentStateManager.fragment");
            View viewFindFocus = fragmentK2.mView.findFocus();
            if (viewFindFocus != null) {
                fragmentK2.setFocusedView(viewFindFocus);
                if (f0.N0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentK2);
                }
            }
            View viewRequireView2 = h().requireView();
            kotlin.jvm.internal.s.g(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                this.f4305h.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragmentK2.getPostOnViewCreatedAlpha());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f4306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f4307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Fragment f4308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f4309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Set f4310e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f4311f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f4312g;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f4317a = new a(null);

            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(View view) {
                    kotlin.jvm.internal.s.h(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i10) {
                    if (i10 == 0) {
                        return b.VISIBLE;
                    }
                    if (i10 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }

                private a() {
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.x0$c$b$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            public /* synthetic */ class C0040b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f4323a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f4323a = iArr;
                }
            }

            public static final b g(int i10) {
                return f4317a.b(i10);
            }

            public final void e(View view) {
                kotlin.jvm.internal.s.h(view, "view");
                int i10 = C0040b.f4323a[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (f0.N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (f0.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (f0.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (f0.N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.x0$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public /* synthetic */ class C0041c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4324a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f4324a = iArr;
            }
        }

        public c(b finalState, a lifecycleImpact, Fragment fragment, j0.f cancellationSignal) {
            kotlin.jvm.internal.s.h(finalState, "finalState");
            kotlin.jvm.internal.s.h(lifecycleImpact, "lifecycleImpact");
            kotlin.jvm.internal.s.h(fragment, "fragment");
            kotlin.jvm.internal.s.h(cancellationSignal, "cancellationSignal");
            this.f4306a = finalState;
            this.f4307b = lifecycleImpact;
            this.f4308c = fragment;
            this.f4309d = new ArrayList();
            this.f4310e = new LinkedHashSet();
            cancellationSignal.b(new j0.f.a() { // from class: androidx.fragment.app.y0
                @Override // j0.f.a
                public final void onCancel() {
                    x0.c.b(this.f4329a);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(c this$0) {
            kotlin.jvm.internal.s.h(this$0, "this$0");
            this$0.d();
        }

        public final void c(Runnable listener) {
            kotlin.jvm.internal.s.h(listener, "listener");
            this.f4309d.add(listener);
        }

        public final void d() {
            if (this.f4311f) {
                return;
            }
            this.f4311f = true;
            if (this.f4310e.isEmpty()) {
                e();
                return;
            }
            Iterator it = gl.r.M0(this.f4310e).iterator();
            while (it.hasNext()) {
                ((j0.f) it.next()).a();
            }
        }

        public void e() {
            if (this.f4312g) {
                return;
            }
            if (f0.N0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4312g = true;
            Iterator it = this.f4309d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void f(j0.f signal) {
            kotlin.jvm.internal.s.h(signal, "signal");
            if (this.f4310e.remove(signal) && this.f4310e.isEmpty()) {
                e();
            }
        }

        public final b g() {
            return this.f4306a;
        }

        public final Fragment h() {
            return this.f4308c;
        }

        public final a i() {
            return this.f4307b;
        }

        public final boolean j() {
            return this.f4311f;
        }

        public final boolean k() {
            return this.f4312g;
        }

        public final void l(j0.f signal) {
            kotlin.jvm.internal.s.h(signal, "signal");
            n();
            this.f4310e.add(signal);
        }

        public final void m(b finalState, a lifecycleImpact) {
            kotlin.jvm.internal.s.h(finalState, "finalState");
            kotlin.jvm.internal.s.h(lifecycleImpact, "lifecycleImpact");
            int i10 = C0041c.f4324a[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.f4306a == b.REMOVED) {
                    if (f0.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4308c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f4307b + " to ADDING.");
                    }
                    this.f4306a = b.VISIBLE;
                    this.f4307b = a.ADDING;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (f0.N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4308c + " mFinalState = " + this.f4306a + " -> REMOVED. mLifecycleImpact  = " + this.f4307b + " to REMOVING.");
                }
                this.f4306a = b.REMOVED;
                this.f4307b = a.REMOVING;
                return;
            }
            if (i10 == 3 && this.f4306a != b.REMOVED) {
                if (f0.N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4308c + " mFinalState = " + this.f4306a + " -> " + finalState + '.');
                }
                this.f4306a = finalState;
            }
        }

        public abstract void n();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f4306a + " lifecycleImpact = " + this.f4307b + " fragment = " + this.f4308c + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4325a;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[c.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4325a = iArr;
        }
    }

    public x0(ViewGroup container) {
        kotlin.jvm.internal.s.h(container, "container");
        this.f4300a = container;
        this.f4301b = new ArrayList();
        this.f4302c = new ArrayList();
    }

    private final void c(c.b bVar, c.a aVar, m0 m0Var) {
        synchronized (this.f4301b) {
            j0.f fVar = new j0.f();
            Fragment fragmentK = m0Var.k();
            kotlin.jvm.internal.s.g(fragmentK, "fragmentStateManager.fragment");
            c cVarL = l(fragmentK);
            if (cVarL != null) {
                cVarL.m(bVar, aVar);
                return;
            }
            final b bVar2 = new b(bVar, aVar, m0Var, fVar);
            this.f4301b.add(bVar2);
            bVar2.c(new Runnable() { // from class: androidx.fragment.app.v0
                @Override // java.lang.Runnable
                public final void run() {
                    x0.d(this.f4289a, bVar2);
                }
            });
            bVar2.c(new Runnable() { // from class: androidx.fragment.app.w0
                @Override // java.lang.Runnable
                public final void run() {
                    x0.e(this.f4292a, bVar2);
                }
            });
            fl.g0 g0Var = fl.g0.f38750a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(x0 this$0, b operation) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        kotlin.jvm.internal.s.h(operation, "$operation");
        if (this$0.f4301b.contains(operation)) {
            c.b bVarG = operation.g();
            View view = operation.h().mView;
            kotlin.jvm.internal.s.g(view, "operation.fragment.mView");
            bVarG.e(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(x0 this$0, b operation) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        kotlin.jvm.internal.s.h(operation, "$operation");
        this$0.f4301b.remove(operation);
        this$0.f4302c.remove(operation);
    }

    private final c l(Fragment fragment) {
        Object next;
        Iterator it = this.f4301b.iterator();
        while (it.hasNext()) {
            next = it.next();
            c cVar = (c) next;
            if (kotlin.jvm.internal.s.c(cVar.h(), fragment) && !cVar.j()) {
                return (c) next;
            }
        }
        next = null;
        return (c) next;
    }

    private final c m(Fragment fragment) {
        Object next;
        Iterator it = this.f4302c.iterator();
        while (it.hasNext()) {
            next = it.next();
            c cVar = (c) next;
            if (kotlin.jvm.internal.s.c(cVar.h(), fragment) && !cVar.j()) {
                return (c) next;
            }
        }
        next = null;
        return (c) next;
    }

    public static final x0 r(ViewGroup viewGroup, f0 f0Var) {
        return f4299f.a(viewGroup, f0Var);
    }

    public static final x0 s(ViewGroup viewGroup, z0 z0Var) {
        return f4299f.b(viewGroup, z0Var);
    }

    private final void u() {
        for (c cVar : this.f4301b) {
            if (cVar.i() == c.a.ADDING) {
                View viewRequireView = cVar.h().requireView();
                kotlin.jvm.internal.s.g(viewRequireView, "fragment.requireView()");
                cVar.m(c.b.f4317a.b(viewRequireView.getVisibility()), c.a.NONE);
            }
        }
    }

    public final void f(c.b finalState, m0 fragmentStateManager) {
        kotlin.jvm.internal.s.h(finalState, "finalState");
        kotlin.jvm.internal.s.h(fragmentStateManager, "fragmentStateManager");
        if (f0.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        c(finalState, c.a.ADDING, fragmentStateManager);
    }

    public final void g(m0 fragmentStateManager) {
        kotlin.jvm.internal.s.h(fragmentStateManager, "fragmentStateManager");
        if (f0.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        c(c.b.GONE, c.a.NONE, fragmentStateManager);
    }

    public final void h(m0 fragmentStateManager) {
        kotlin.jvm.internal.s.h(fragmentStateManager, "fragmentStateManager");
        if (f0.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        c(c.b.REMOVED, c.a.REMOVING, fragmentStateManager);
    }

    public final void i(m0 fragmentStateManager) {
        kotlin.jvm.internal.s.h(fragmentStateManager, "fragmentStateManager");
        if (f0.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        c(c.b.VISIBLE, c.a.NONE, fragmentStateManager);
    }

    public abstract void j(List list, boolean z10);

    public final void k() {
        if (this.f4304e) {
            return;
        }
        if (!n0.q0.S(this.f4300a)) {
            n();
            this.f4303d = false;
            return;
        }
        synchronized (this.f4301b) {
            try {
                if (!this.f4301b.isEmpty()) {
                    List<c> listL0 = gl.r.L0(this.f4302c);
                    this.f4302c.clear();
                    for (c cVar : listL0) {
                        if (f0.N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + cVar);
                        }
                        cVar.d();
                        if (!cVar.k()) {
                            this.f4302c.add(cVar);
                        }
                    }
                    u();
                    List listL1 = gl.r.L0(this.f4301b);
                    this.f4301b.clear();
                    this.f4302c.addAll(listL1);
                    if (f0.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it = listL1.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).n();
                    }
                    j(listL1, this.f4303d);
                    this.f4303d = false;
                    if (f0.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                fl.g0 g0Var = fl.g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n() {
        if (f0.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zS = n0.q0.S(this.f4300a);
        synchronized (this.f4301b) {
            try {
                u();
                Iterator it = this.f4301b.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).n();
                }
                for (c cVar : gl.r.L0(this.f4302c)) {
                    if (f0.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zS ? "" : "Container " + this.f4300a + " is not attached to window. ") + "Cancelling running operation " + cVar);
                    }
                    cVar.d();
                }
                for (c cVar2 : gl.r.L0(this.f4301b)) {
                    if (f0.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zS ? "" : "Container " + this.f4300a + " is not attached to window. ") + "Cancelling pending operation " + cVar2);
                    }
                    cVar2.d();
                }
                fl.g0 g0Var = fl.g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o() {
        if (this.f4304e) {
            if (f0.N0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f4304e = false;
            k();
        }
    }

    public final c.a p(m0 fragmentStateManager) {
        kotlin.jvm.internal.s.h(fragmentStateManager, "fragmentStateManager");
        Fragment fragmentK = fragmentStateManager.k();
        kotlin.jvm.internal.s.g(fragmentK, "fragmentStateManager.fragment");
        c cVarL = l(fragmentK);
        c.a aVarI = cVarL != null ? cVarL.i() : null;
        c cVarM = m(fragmentK);
        c.a aVarI2 = cVarM != null ? cVarM.i() : null;
        int i10 = aVarI == null ? -1 : d.f4325a[aVarI.ordinal()];
        return (i10 == -1 || i10 == 1) ? aVarI2 : aVarI;
    }

    public final ViewGroup q() {
        return this.f4300a;
    }

    public final void t() {
        Object objPrevious;
        synchronized (this.f4301b) {
            try {
                u();
                List list = this.f4301b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    c cVar = (c) objPrevious;
                    c.b.a aVar = c.b.f4317a;
                    View view = cVar.h().mView;
                    kotlin.jvm.internal.s.g(view, "operation.fragment.mView");
                    c.b bVarA = aVar.a(view);
                    c.b bVarG = cVar.g();
                    c.b bVar = c.b.VISIBLE;
                    if (bVarG == bVar && bVarA != bVar) {
                        break;
                    }
                }
                c cVar2 = (c) objPrevious;
                Fragment fragmentH = cVar2 != null ? cVar2.h() : null;
                this.f4304e = fragmentH != null ? fragmentH.isPostponed() : false;
                fl.g0 g0Var = fl.g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void v(boolean z10) {
        this.f4303d = z10;
    }
}
