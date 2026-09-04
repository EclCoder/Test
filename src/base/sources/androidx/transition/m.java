package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Cloneable {
    private static final Animator[] J = new Animator[0];
    private static final int[] K = {2, 1, 3, 4};
    private static final androidx.transition.g L = new a();
    private static ThreadLocal M = new ThreadLocal();
    u F;
    private f G;
    private androidx.collection.a H;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList f7432t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList f7433u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private g[] f7434v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f7413a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f7414b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f7415c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimeInterpolator f7416d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList f7417e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList f7418f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f7419g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f7420h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f7421i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f7422j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList f7423k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList f7424l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList f7425m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList f7426n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ArrayList f7427o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private y f7428p = new y();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private y f7429q = new y();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    v f7430r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int[] f7431s = K;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f7435w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    ArrayList f7436x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Animator[] f7437y = J;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f7438z = 0;
    private boolean A = false;
    boolean B = false;
    private m C = null;
    private ArrayList D = null;
    ArrayList E = new ArrayList();
    private androidx.transition.g I = L;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends androidx.transition.g {
        a() {
        }

        @Override // androidx.transition.g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f7439a;

        b(androidx.collection.a aVar) {
            this.f7439a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f7439a.remove(animator);
            m.this.f7436x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m.this.f7436x.add(animator);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m.this.p();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f7442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f7443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        x f7444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        WindowId f7445d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        m f7446e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Animator f7447f;

        d(View view, String str, m mVar, WindowId windowId, x xVar, Animator animator) {
            this.f7442a = view;
            this.f7443b = str;
            this.f7444c = xVar;
            this.f7445d = windowId;
            this.f7446e = mVar;
            this.f7447f = animator;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class e {
        static ArrayList a(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }

        static ArrayList b(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(obj);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class f {
        public abstract Rect a(m mVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface g {
        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        default void d(m mVar, boolean z10) {
            e(mVar);
        }

        void e(m mVar);

        void f(m mVar);

        default void g(m mVar, boolean z10) {
            b(mVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f7448a = new h() { // from class: androidx.transition.n
            @Override // androidx.transition.m.h
            public final void b(m.g gVar, m mVar, boolean z10) {
                gVar.g(mVar, z10);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f7449b = new h() { // from class: androidx.transition.o
            @Override // androidx.transition.m.h
            public final void b(m.g gVar, m mVar, boolean z10) {
                gVar.d(mVar, z10);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f7450c = new h() { // from class: androidx.transition.p
            @Override // androidx.transition.m.h
            public final void b(m.g gVar, m mVar, boolean z10) {
                gVar.f(mVar);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final h f7451d = new h() { // from class: androidx.transition.q
            @Override // androidx.transition.m.h
            public final void b(m.g gVar, m mVar, boolean z10) {
                gVar.c(mVar);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final h f7452e = new h() { // from class: androidx.transition.r
            @Override // androidx.transition.m.h
            public final void b(m.g gVar, m mVar, boolean z10) {
                gVar.a(mVar);
            }
        };

        void b(g gVar, m mVar, boolean z10);
    }

    private static androidx.collection.a D() {
        androidx.collection.a aVar = (androidx.collection.a) M.get();
        if (aVar != null) {
            return aVar;
        }
        androidx.collection.a aVar2 = new androidx.collection.a();
        M.set(aVar2);
        return aVar2;
    }

    private static boolean N(x xVar, x xVar2, String str) {
        Object obj = xVar.f7464a.get(str);
        Object obj2 = xVar2.f7464a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void O(androidx.collection.a aVar, androidx.collection.a aVar2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) sparseArray.valueAt(i10);
            if (view2 != null && M(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && M(view)) {
                x xVar = (x) aVar.get(view2);
                x xVar2 = (x) aVar2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.f7432t.add(xVar);
                    this.f7433u.add(xVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void P(androidx.collection.a aVar, androidx.collection.a aVar2) {
        x xVar;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.i(size);
            if (view != null && M(view) && (xVar = (x) aVar2.remove(view)) != null && M(xVar.f7465b)) {
                this.f7432t.add((x) aVar.k(size));
                this.f7433u.add(xVar);
            }
        }
    }

    private void Q(androidx.collection.a aVar, androidx.collection.a aVar2, androidx.collection.l lVar, androidx.collection.l lVar2) {
        View view;
        int iL = lVar.l();
        for (int i10 = 0; i10 < iL; i10++) {
            View view2 = (View) lVar.m(i10);
            if (view2 != null && M(view2) && (view = (View) lVar2.e(lVar.h(i10))) != null && M(view)) {
                x xVar = (x) aVar.get(view2);
                x xVar2 = (x) aVar2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.f7432t.add(xVar);
                    this.f7433u.add(xVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void R(androidx.collection.a aVar, androidx.collection.a aVar2, androidx.collection.a aVar3, androidx.collection.a aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) aVar3.m(i10);
            if (view2 != null && M(view2) && (view = (View) aVar4.get(aVar3.i(i10))) != null && M(view)) {
                x xVar = (x) aVar.get(view2);
                x xVar2 = (x) aVar2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.f7432t.add(xVar);
                    this.f7433u.add(xVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void S(y yVar, y yVar2) {
        androidx.collection.a aVar = new androidx.collection.a(yVar.f7467a);
        androidx.collection.a aVar2 = new androidx.collection.a(yVar2.f7467a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f7431s;
            if (i10 >= iArr.length) {
                d(aVar, aVar2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                P(aVar, aVar2);
            } else if (i11 == 2) {
                R(aVar, aVar2, yVar.f7470d, yVar2.f7470d);
            } else if (i11 == 3) {
                O(aVar, aVar2, yVar.f7468b, yVar2.f7468b);
            } else if (i11 == 4) {
                Q(aVar, aVar2, yVar.f7469c, yVar2.f7469c);
            }
            i10++;
        }
    }

    private void T(m mVar, h hVar, boolean z10) {
        m mVar2 = this.C;
        if (mVar2 != null) {
            mVar2.T(mVar, hVar, z10);
        }
        ArrayList arrayList = this.D;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.D.size();
        g[] gVarArr = this.f7434v;
        if (gVarArr == null) {
            gVarArr = new g[size];
        }
        this.f7434v = null;
        g[] gVarArr2 = (g[]) this.D.toArray(gVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            hVar.b(gVarArr2[i10], mVar, z10);
            gVarArr2[i10] = null;
        }
        this.f7434v = gVarArr2;
    }

    private void a0(Animator animator, androidx.collection.a aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            f(animator);
        }
    }

    private void d(androidx.collection.a aVar, androidx.collection.a aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            x xVar = (x) aVar.m(i10);
            if (M(xVar.f7465b)) {
                this.f7432t.add(xVar);
                this.f7433u.add(null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            x xVar2 = (x) aVar2.m(i11);
            if (M(xVar2.f7465b)) {
                this.f7433u.add(xVar2);
                this.f7432t.add(null);
            }
        }
    }

    private static void e(y yVar, View view, x xVar) {
        yVar.f7467a.put(view, xVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (yVar.f7468b.indexOfKey(id2) >= 0) {
                yVar.f7468b.put(id2, null);
            } else {
                yVar.f7468b.put(id2, view);
            }
        }
        String strK = q0.K(view);
        if (strK != null) {
            if (yVar.f7470d.containsKey(strK)) {
                yVar.f7470d.put(strK, null);
            } else {
                yVar.f7470d.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (yVar.f7469c.f(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    yVar.f7469c.i(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) yVar.f7469c.e(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    yVar.f7469c.i(itemIdAtPosition, null);
                }
            }
        }
    }

    private void h(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList arrayList = this.f7421i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList arrayList2 = this.f7422j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f7423k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (((Class) this.f7423k.get(i10)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    x xVar = new x(view);
                    if (z10) {
                        j(xVar);
                    } else {
                        g(xVar);
                    }
                    xVar.f7466c.add(this);
                    i(xVar);
                    if (z10) {
                        e(this.f7428p, view, xVar);
                    } else {
                        e(this.f7429q, view, xVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f7425m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList arrayList5 = this.f7426n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f7427o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (((Class) this.f7427o.get(i11)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                h(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayList s(ArrayList arrayList, Class cls, boolean z10) {
        if (cls != null) {
            return z10 ? e.a(arrayList, cls) : e.b(arrayList, cls);
        }
        return arrayList;
    }

    private ArrayList t(ArrayList arrayList, View view, boolean z10) {
        if (view != null) {
            return z10 ? e.a(arrayList, view) : e.b(arrayList, view);
        }
        return arrayList;
    }

    public androidx.transition.g A() {
        return this.I;
    }

    public u B() {
        return this.F;
    }

    public final m C() {
        v vVar = this.f7430r;
        return vVar != null ? vVar.C() : this;
    }

    public long E() {
        return this.f7414b;
    }

    public List F() {
        return this.f7417e;
    }

    public List G() {
        return this.f7419g;
    }

    public List H() {
        return this.f7420h;
    }

    public List I() {
        return this.f7418f;
    }

    public String[] J() {
        return null;
    }

    public x K(View view, boolean z10) {
        v vVar = this.f7430r;
        if (vVar != null) {
            return vVar.K(view, z10);
        }
        return (x) (z10 ? this.f7428p : this.f7429q).f7467a.get(view);
    }

    public boolean L(x xVar, x xVar2) {
        if (xVar != null && xVar2 != null) {
            String[] strArrJ = J();
            if (strArrJ != null) {
                for (String str : strArrJ) {
                    if (N(xVar, xVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = xVar.f7464a.keySet().iterator();
                while (it.hasNext()) {
                    if (N(xVar, xVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean M(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id2 = view.getId();
        ArrayList arrayList3 = this.f7421i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList arrayList4 = this.f7422j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f7423k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.f7423k.get(i10)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f7424l != null && q0.K(view) != null && this.f7424l.contains(q0.K(view))) {
            return false;
        }
        if ((this.f7417e.size() == 0 && this.f7418f.size() == 0 && (((arrayList = this.f7420h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f7419g) == null || arrayList2.isEmpty()))) || this.f7417e.contains(Integer.valueOf(id2)) || this.f7418f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f7419g;
        if (arrayList6 != null && arrayList6.contains(q0.K(view))) {
            return true;
        }
        if (this.f7420h != null) {
            for (int i11 = 0; i11 < this.f7420h.size(); i11++) {
                if (((Class) this.f7420h.get(i11)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    void U(h hVar, boolean z10) {
        T(this, hVar, z10);
    }

    public void V(View view) {
        if (this.B) {
            return;
        }
        int size = this.f7436x.size();
        Animator[] animatorArr = (Animator[]) this.f7436x.toArray(this.f7437y);
        this.f7437y = J;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.f7437y = animatorArr;
        U(h.f7451d, false);
        this.A = true;
    }

    void W(ViewGroup viewGroup) {
        d dVar;
        this.f7432t = new ArrayList();
        this.f7433u = new ArrayList();
        S(this.f7428p, this.f7429q);
        androidx.collection.a aVarD = D();
        int size = aVarD.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = (Animator) aVarD.i(i10);
            if (animator != null && (dVar = (d) aVarD.get(animator)) != null && dVar.f7442a != null && windowId.equals(dVar.f7445d)) {
                x xVar = dVar.f7444c;
                View view = dVar.f7442a;
                x xVarK = K(view, true);
                x xVarY = y(view, true);
                if (xVarK == null && xVarY == null) {
                    xVarY = (x) this.f7429q.f7467a.get(view);
                }
                if ((xVarK != null || xVarY != null) && dVar.f7446e.L(xVar, xVarY)) {
                    dVar.f7446e.C().getClass();
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        aVarD.remove(animator);
                    }
                }
            }
        }
        o(viewGroup, this.f7428p, this.f7429q, this.f7432t, this.f7433u);
        b0();
    }

    public m X(g gVar) {
        m mVar;
        ArrayList arrayList = this.D;
        if (arrayList != null) {
            if (!arrayList.remove(gVar) && (mVar = this.C) != null) {
                mVar.X(gVar);
            }
            if (this.D.size() == 0) {
                this.D = null;
            }
        }
        return this;
    }

    public m Y(View view) {
        this.f7418f.remove(view);
        return this;
    }

    public void Z(View view) {
        if (this.A) {
            if (!this.B) {
                int size = this.f7436x.size();
                Animator[] animatorArr = (Animator[]) this.f7436x.toArray(this.f7437y);
                this.f7437y = J;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.f7437y = animatorArr;
                U(h.f7452e, false);
            }
            this.A = false;
        }
    }

    public m b(g gVar) {
        if (this.D == null) {
            this.D = new ArrayList();
        }
        this.D.add(gVar);
        return this;
    }

    protected void b0() {
        i0();
        androidx.collection.a aVarD = D();
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Animator animator = (Animator) obj;
            if (aVarD.containsKey(animator)) {
                i0();
                a0(animator, aVarD);
            }
        }
        this.E.clear();
        p();
    }

    public m c(View view) {
        this.f7418f.add(view);
        return this;
    }

    public m c0(long j10) {
        this.f7415c = j10;
        return this;
    }

    protected void cancel() {
        int size = this.f7436x.size();
        Animator[] animatorArr = (Animator[]) this.f7436x.toArray(this.f7437y);
        this.f7437y = J;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.f7437y = animatorArr;
        U(h.f7450c, false);
    }

    public void d0(f fVar) {
        this.G = fVar;
    }

    public m e0(TimeInterpolator timeInterpolator) {
        this.f7416d = timeInterpolator;
        return this;
    }

    protected void f(Animator animator) {
        if (animator == null) {
            p();
            return;
        }
        if (u() >= 0) {
            animator.setDuration(u());
        }
        if (E() >= 0) {
            animator.setStartDelay(E() + animator.getStartDelay());
        }
        if (x() != null) {
            animator.setInterpolator(x());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void f0(androidx.transition.g gVar) {
        if (gVar == null) {
            this.I = L;
        } else {
            this.I = gVar;
        }
    }

    public abstract void g(x xVar);

    public void g0(u uVar) {
        this.F = uVar;
    }

    public m h0(long j10) {
        this.f7414b = j10;
        return this;
    }

    void i(x xVar) {
        String[] strArrB;
        if (this.F == null || xVar.f7464a.isEmpty() || (strArrB = this.F.b()) == null) {
            return;
        }
        for (String str : strArrB) {
            if (!xVar.f7464a.containsKey(str)) {
                this.F.a(xVar);
                return;
            }
        }
    }

    protected void i0() {
        if (this.f7438z == 0) {
            U(h.f7448a, false);
            this.B = false;
        }
        this.f7438z++;
    }

    public abstract void j(x xVar);

    String j0(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f7415c != -1) {
            sb2.append("dur(");
            sb2.append(this.f7415c);
            sb2.append(") ");
        }
        if (this.f7414b != -1) {
            sb2.append("dly(");
            sb2.append(this.f7414b);
            sb2.append(") ");
        }
        if (this.f7416d != null) {
            sb2.append("interp(");
            sb2.append(this.f7416d);
            sb2.append(") ");
        }
        if (this.f7417e.size() > 0 || this.f7418f.size() > 0) {
            sb2.append("tgts(");
            if (this.f7417e.size() > 0) {
                for (int i10 = 0; i10 < this.f7417e.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f7417e.get(i10));
                }
            }
            if (this.f7418f.size() > 0) {
                for (int i11 = 0; i11 < this.f7418f.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f7418f.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    void k(ViewGroup viewGroup, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        androidx.collection.a aVar;
        l(z10);
        if ((this.f7417e.size() > 0 || this.f7418f.size() > 0) && (((arrayList = this.f7419g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f7420h) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f7417e.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f7417e.get(i10)).intValue());
                if (viewFindViewById != null) {
                    x xVar = new x(viewFindViewById);
                    if (z10) {
                        j(xVar);
                    } else {
                        g(xVar);
                    }
                    xVar.f7466c.add(this);
                    i(xVar);
                    if (z10) {
                        e(this.f7428p, viewFindViewById, xVar);
                    } else {
                        e(this.f7429q, viewFindViewById, xVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f7418f.size(); i11++) {
                View view = (View) this.f7418f.get(i11);
                x xVar2 = new x(view);
                if (z10) {
                    j(xVar2);
                } else {
                    g(xVar2);
                }
                xVar2.f7466c.add(this);
                i(xVar2);
                if (z10) {
                    e(this.f7428p, view, xVar2);
                } else {
                    e(this.f7429q, view, xVar2);
                }
            }
        } else {
            h(viewGroup, z10);
        }
        if (z10 || (aVar = this.H) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add((View) this.f7428p.f7470d.remove((String) this.H.i(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f7428p.f7470d.put((String) this.H.m(i13), view2);
            }
        }
    }

    void l(boolean z10) {
        if (z10) {
            this.f7428p.f7467a.clear();
            this.f7428p.f7468b.clear();
            this.f7428p.f7469c.b();
        } else {
            this.f7429q.f7467a.clear();
            this.f7429q.f7468b.clear();
            this.f7429q.f7469c.b();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.E = new ArrayList();
            mVar.f7428p = new y();
            mVar.f7429q = new y();
            mVar.f7432t = null;
            mVar.f7433u = null;
            mVar.C = this;
            mVar.D = null;
            return mVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Animator n(ViewGroup viewGroup, x xVar, x xVar2) {
        return null;
    }

    void o(ViewGroup viewGroup, y yVar, y yVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorN;
        int i10;
        int i11;
        View view;
        x xVar;
        Animator animator;
        x xVar2;
        int i12;
        androidx.collection.a aVarD = D();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        C().getClass();
        long jMin = Long.MAX_VALUE;
        int i13 = 0;
        while (i13 < size) {
            x xVar3 = (x) arrayList.get(i13);
            x xVar4 = (x) arrayList2.get(i13);
            if (xVar3 != null && !xVar3.f7466c.contains(this)) {
                xVar3 = null;
            }
            if (xVar4 != null && !xVar4.f7466c.contains(this)) {
                xVar4 = null;
            }
            if (!(xVar3 == null && xVar4 == null) && ((xVar3 == null || xVar4 == null || L(xVar3, xVar4)) && (animatorN = n(viewGroup, xVar3, xVar4)) != null)) {
                if (xVar4 != null) {
                    view = xVar4.f7465b;
                    String[] strArrJ = J();
                    if (strArrJ != null && strArrJ.length > 0) {
                        xVar2 = new x(view);
                        i10 = size;
                        x xVar5 = (x) yVar2.f7467a.get(view);
                        i11 = i13;
                        if (xVar5 != null) {
                            int i14 = 0;
                            while (i14 < strArrJ.length) {
                                Map map = xVar2.f7464a;
                                String[] strArr = strArrJ;
                                String str = strArr[i14];
                                map.put(str, xVar5.f7464a.get(str));
                                i14++;
                                strArrJ = strArr;
                            }
                        }
                        int size2 = aVarD.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                animator = animatorN;
                                break;
                            }
                            d dVar = (d) aVarD.get((Animator) aVarD.i(i15));
                            if (dVar.f7444c != null && dVar.f7442a == view) {
                                i12 = size2;
                                if (dVar.f7443b.equals(z()) && dVar.f7444c.equals(xVar2)) {
                                    animator = null;
                                    break;
                                }
                            } else {
                                i12 = size2;
                            }
                            i15++;
                            size2 = i12;
                        }
                    } else {
                        i10 = size;
                        i11 = i13;
                        animator = animatorN;
                        xVar2 = null;
                    }
                    animatorN = animator;
                    xVar = xVar2;
                } else {
                    i10 = size;
                    i11 = i13;
                    view = xVar3.f7465b;
                    xVar = null;
                }
                if (animatorN != null) {
                    u uVar = this.F;
                    if (uVar != null) {
                        long jC = uVar.c(viewGroup, this, xVar3, xVar4);
                        sparseIntArray.put(this.E.size(), (int) jC);
                        jMin = Math.min(jC, jMin);
                    }
                    aVarD.put(animatorN, new d(view, z(), this, viewGroup.getWindowId(), xVar, animatorN));
                    this.E.add(animatorN);
                    jMin = jMin;
                }
            } else {
                i10 = size;
                i11 = i13;
            }
            i13 = i11 + 1;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                d dVar2 = (d) aVarD.get((Animator) this.E.get(sparseIntArray.keyAt(i16)));
                dVar2.f7447f.setStartDelay((((long) sparseIntArray.valueAt(i16)) - jMin) + dVar2.f7447f.getStartDelay());
            }
        }
    }

    protected void p() {
        int i10 = this.f7438z - 1;
        this.f7438z = i10;
        if (i10 == 0) {
            U(h.f7449b, false);
            for (int i11 = 0; i11 < this.f7428p.f7469c.l(); i11++) {
                View view = (View) this.f7428p.f7469c.m(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f7429q.f7469c.l(); i12++) {
                View view2 = (View) this.f7429q.f7469c.m(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.B = true;
        }
    }

    public m q(View view, boolean z10) {
        this.f7422j = t(this.f7422j, view, z10);
        return this;
    }

    public m r(Class cls, boolean z10) {
        this.f7423k = s(this.f7423k, cls, z10);
        return this;
    }

    public String toString() {
        return j0("");
    }

    public long u() {
        return this.f7415c;
    }

    public Rect v() {
        f fVar = this.G;
        if (fVar == null) {
            return null;
        }
        return fVar.a(this);
    }

    public f w() {
        return this.G;
    }

    public TimeInterpolator x() {
        return this.f7416d;
    }

    x y(View view, boolean z10) {
        v vVar = this.f7430r;
        if (vVar != null) {
            return vVar.y(view, z10);
        }
        ArrayList arrayList = z10 ? this.f7432t : this.f7433u;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            x xVar = (x) arrayList.get(i10);
            if (xVar == null) {
                return null;
            }
            if (xVar.f7465b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (x) (z10 ? this.f7433u : this.f7432t).get(i10);
        }
        return null;
    }

    public String z() {
        return this.f7413a;
    }
}
