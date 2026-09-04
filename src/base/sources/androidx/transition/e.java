package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.r0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e extends r0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends m.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f7369a;

        a(Rect rect) {
            this.f7369a = rect;
        }

        @Override // androidx.transition.m.f
        public Rect a(m mVar) {
            return this.f7369a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f7374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f7375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f7376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f7377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f7378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f7379f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f7374a = obj;
            this.f7375b = arrayList;
            this.f7376c = obj2;
            this.f7377d = arrayList2;
            this.f7378e = obj3;
            this.f7379f = arrayList3;
        }

        @Override // androidx.transition.s, androidx.transition.m.g
        public void b(m mVar) {
            Object obj = this.f7374a;
            if (obj != null) {
                e.this.x(obj, this.f7375b, null);
            }
            Object obj2 = this.f7376c;
            if (obj2 != null) {
                e.this.x(obj2, this.f7377d, null);
            }
            Object obj3 = this.f7378e;
            if (obj3 != null) {
                e.this.x(obj3, this.f7379f, null);
            }
        }

        @Override // androidx.transition.m.g
        public void e(m mVar) {
            mVar.X(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0094e extends m.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f7383a;

        C0094e(Rect rect) {
            this.f7383a = rect;
        }

        @Override // androidx.transition.m.f
        public Rect a(m mVar) {
            Rect rect = this.f7383a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f7383a;
        }
    }

    public static /* synthetic */ void v(Runnable runnable, m mVar, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            mVar.cancel();
            runnable2.run();
        }
    }

    private static boolean w(m mVar) {
        return (r0.i(mVar.F()) && r0.i(mVar.G()) && r0.i(mVar.H())) ? false : true;
    }

    @Override // androidx.fragment.app.r0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((m) obj).c(view);
        }
    }

    @Override // androidx.fragment.app.r0
    public void b(Object obj, ArrayList arrayList) {
        m mVar = (m) obj;
        if (mVar == null) {
            return;
        }
        int i10 = 0;
        if (mVar instanceof v) {
            v vVar = (v) mVar;
            int iP0 = vVar.p0();
            while (i10 < iP0) {
                b(vVar.o0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (w(mVar) || !r0.i(mVar.I())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            mVar.c((View) arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.r0
    public void c(ViewGroup viewGroup, Object obj) {
        t.b(viewGroup, (m) obj);
    }

    @Override // androidx.fragment.app.r0
    public boolean e(Object obj) {
        return obj instanceof m;
    }

    @Override // androidx.fragment.app.r0
    public Object f(Object obj) {
        if (obj != null) {
            return ((m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.r0
    public Object j(Object obj, Object obj2, Object obj3) {
        m mVarU0 = (m) obj;
        m mVar = (m) obj2;
        m mVar2 = (m) obj3;
        if (mVarU0 != null && mVar != null) {
            mVarU0 = new v().m0(mVarU0).m0(mVar).u0(1);
        } else if (mVarU0 == null) {
            mVarU0 = mVar != null ? mVar : null;
        }
        if (mVar2 == null) {
            return mVarU0;
        }
        v vVar = new v();
        if (mVarU0 != null) {
            vVar.m0(mVarU0);
        }
        vVar.m0(mVar2);
        return vVar;
    }

    @Override // androidx.fragment.app.r0
    public Object k(Object obj, Object obj2, Object obj3) {
        v vVar = new v();
        if (obj != null) {
            vVar.m0((m) obj);
        }
        if (obj2 != null) {
            vVar.m0((m) obj2);
        }
        if (obj3 != null) {
            vVar.m0((m) obj3);
        }
        return vVar;
    }

    @Override // androidx.fragment.app.r0
    public void m(Object obj, View view, ArrayList arrayList) {
        ((m) obj).b(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.r0
    public void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((m) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.r0
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((m) obj).d0(new C0094e(rect));
        }
    }

    @Override // androidx.fragment.app.r0
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((m) obj).d0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.r0
    public void q(Fragment fragment, Object obj, j0.f fVar, Runnable runnable) {
        y(fragment, obj, fVar, null, runnable);
    }

    @Override // androidx.fragment.app.r0
    public void s(Object obj, View view, ArrayList arrayList) {
        v vVar = (v) obj;
        List listI = vVar.I();
        listI.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            r0.d(listI, (View) arrayList.get(i10));
        }
        listI.add(view);
        arrayList.add(view);
        b(vVar, arrayList);
    }

    @Override // androidx.fragment.app.r0
    public void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        v vVar = (v) obj;
        if (vVar != null) {
            vVar.I().clear();
            vVar.I().addAll(arrayList2);
            x(vVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.r0
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        v vVar = new v();
        vVar.m0((m) obj);
        return vVar;
    }

    public void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        m mVar = (m) obj;
        int i10 = 0;
        if (mVar instanceof v) {
            v vVar = (v) mVar;
            int iP0 = vVar.p0();
            while (i10 < iP0) {
                x(vVar.o0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (w(mVar)) {
            return;
        }
        List listI = mVar.I();
        if (listI.size() == arrayList.size() && listI.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                mVar.c((View) arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                mVar.Y((View) arrayList.get(size2));
            }
        }
    }

    public void y(Fragment fragment, Object obj, j0.f fVar, final Runnable runnable, final Runnable runnable2) {
        final m mVar = (m) obj;
        fVar.b(new j0.f.a() { // from class: androidx.transition.d
            @Override // j0.f.a
            public final void onCancel() {
                e.v(runnable, mVar, runnable2);
            }
        });
        mVar.b(new d(runnable2));
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements m.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f7371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f7372b;

        b(View view, ArrayList arrayList) {
            this.f7371a = view;
            this.f7372b = arrayList;
        }

        @Override // androidx.transition.m.g
        public void b(m mVar) {
            mVar.X(this);
            mVar.b(this);
        }

        @Override // androidx.transition.m.g
        public void e(m mVar) {
            mVar.X(this);
            this.f7371a.setVisibility(8);
            int size = this.f7372b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f7372b.get(i10)).setVisibility(0);
            }
        }

        @Override // androidx.transition.m.g
        public void a(m mVar) {
        }

        @Override // androidx.transition.m.g
        public void c(m mVar) {
        }

        @Override // androidx.transition.m.g
        public void f(m mVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements m.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f7381a;

        d(Runnable runnable) {
            this.f7381a = runnable;
        }

        @Override // androidx.transition.m.g
        public void e(m mVar) {
            this.f7381a.run();
        }

        @Override // androidx.transition.m.g
        public void a(m mVar) {
        }

        @Override // androidx.transition.m.g
        public void b(m mVar) {
        }

        @Override // androidx.transition.m.g
        public void c(m mVar) {
        }

        @Override // androidx.transition.m.g
        public void f(m mVar) {
        }
    }
}
