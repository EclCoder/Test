package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static m f7453a = new androidx.transition.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadLocal f7454b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static ArrayList f7455c = new ArrayList();

    public static void a(ViewGroup viewGroup) {
        b(viewGroup, null);
    }

    public static void b(ViewGroup viewGroup, m mVar) {
        if (f7455c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f7455c.add(viewGroup);
        if (mVar == null) {
            mVar = f7453a;
        }
        m mVarClone = mVar.clone();
        e(viewGroup, mVarClone);
        j.b(viewGroup, null);
        d(viewGroup, mVarClone);
    }

    static androidx.collection.a c() {
        androidx.collection.a aVar;
        WeakReference weakReference = (WeakReference) f7454b.get();
        if (weakReference != null && (aVar = (androidx.collection.a) weakReference.get()) != null) {
            return aVar;
        }
        androidx.collection.a aVar2 = new androidx.collection.a();
        f7454b.set(new WeakReference(aVar2));
        return aVar2;
    }

    private static void d(ViewGroup viewGroup, m mVar) {
        if (mVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(mVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void e(ViewGroup viewGroup, m mVar) {
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((m) obj).V(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.k(viewGroup, true);
        }
        j.a(viewGroup);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        m f7456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ViewGroup f7457b;

        /* JADX INFO: renamed from: androidx.transition.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0095a extends s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.collection.a f7458a;

            C0095a(androidx.collection.a aVar) {
                this.f7458a = aVar;
            }

            @Override // androidx.transition.m.g
            public void e(m mVar) {
                ((ArrayList) this.f7458a.get(a.this.f7457b)).remove(mVar);
                mVar.X(this);
            }
        }

        a(m mVar, ViewGroup viewGroup) {
            this.f7456a = mVar;
            this.f7457b = viewGroup;
        }

        private void a() {
            this.f7457b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f7457b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!t.f7455c.remove(this.f7457b)) {
                return true;
            }
            androidx.collection.a aVarC = t.c();
            ArrayList arrayList = (ArrayList) aVarC.get(this.f7457b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                aVarC.put(this.f7457b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f7456a);
            this.f7456a.b(new C0095a(aVarC));
            int i10 = 0;
            this.f7456a.k(this.f7457b, false);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((m) obj).Z(this.f7457b);
                }
            }
            this.f7456a.W(this.f7457b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            t.f7455c.remove(this.f7457b);
            ArrayList arrayList = (ArrayList) t.c().get(this.f7457b);
            if (arrayList != null && arrayList.size() > 0) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((m) obj).Z(this.f7457b);
                }
            }
            this.f7456a.l(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
