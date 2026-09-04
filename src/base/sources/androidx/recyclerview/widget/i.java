package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class i extends w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static TimeInterpolator f6906s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f6907h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f6908i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f6909j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList f6910k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ArrayList f6911l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ArrayList f6912m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ArrayList f6913n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList f6914o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList f6915p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList f6916q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ArrayList f6917r = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f6918a;

        a(ArrayList arrayList) {
            this.f6918a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f6918a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j jVar = (j) obj;
                i.this.S(jVar.f6952a, jVar.f6953b, jVar.f6954c, jVar.f6955d, jVar.f6956e);
            }
            this.f6918a.clear();
            i.this.f6912m.remove(this.f6918a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f6920a;

        b(ArrayList arrayList) {
            this.f6920a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f6920a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                i.this.R((C0080i) obj);
            }
            this.f6920a.clear();
            i.this.f6913n.remove(this.f6920a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f6922a;

        c(ArrayList arrayList) {
            this.f6922a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f6922a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                i.this.Q((RecyclerView.g0) obj);
            }
            this.f6922a.clear();
            i.this.f6911l.remove(this.f6922a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.g0 f6924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f6925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f6926c;

        d(RecyclerView.g0 g0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6924a = g0Var;
            this.f6925b = viewPropertyAnimator;
            this.f6926c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6925b.setListener(null);
            this.f6926c.setAlpha(1.0f);
            i.this.G(this.f6924a);
            i.this.f6916q.remove(this.f6924a);
            i.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.this.H(this.f6924a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.g0 f6928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f6929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f6930c;

        e(RecyclerView.g0 g0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f6928a = g0Var;
            this.f6929b = view;
            this.f6930c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6929b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6930c.setListener(null);
            i.this.A(this.f6928a);
            i.this.f6914o.remove(this.f6928a);
            i.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.this.B(this.f6928a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.g0 f6932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f6934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f6936e;

        f(RecyclerView.g0 g0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f6932a = g0Var;
            this.f6933b = i10;
            this.f6934c = view;
            this.f6935d = i11;
            this.f6936e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f6933b != 0) {
                this.f6934c.setTranslationX(0.0f);
            }
            if (this.f6935d != 0) {
                this.f6934c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6936e.setListener(null);
            i.this.E(this.f6932a);
            i.this.f6915p.remove(this.f6932a);
            i.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.this.F(this.f6932a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0080i f6938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f6939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f6940c;

        g(C0080i c0080i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6938a = c0080i;
            this.f6939b = viewPropertyAnimator;
            this.f6940c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6939b.setListener(null);
            this.f6940c.setAlpha(1.0f);
            this.f6940c.setTranslationX(0.0f);
            this.f6940c.setTranslationY(0.0f);
            i.this.C(this.f6938a.f6946a, true);
            i.this.f6917r.remove(this.f6938a.f6946a);
            i.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.this.D(this.f6938a.f6946a, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0080i f6942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f6943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f6944c;

        h(C0080i c0080i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6942a = c0080i;
            this.f6943b = viewPropertyAnimator;
            this.f6944c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6943b.setListener(null);
            this.f6944c.setAlpha(1.0f);
            this.f6944c.setTranslationX(0.0f);
            this.f6944c.setTranslationY(0.0f);
            i.this.C(this.f6942a.f6947b, false);
            i.this.f6917r.remove(this.f6942a.f6947b);
            i.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.this.D(this.f6942a.f6947b, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.g0 f6952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6955d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6956e;

        j(RecyclerView.g0 g0Var, int i10, int i11, int i12, int i13) {
            this.f6952a = g0Var;
            this.f6953b = i10;
            this.f6954c = i11;
            this.f6955d = i12;
            this.f6956e = i13;
        }
    }

    private void T(RecyclerView.g0 g0Var) {
        View view = g0Var.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f6916q.add(g0Var);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(g0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    private void W(List list, RecyclerView.g0 g0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0080i c0080i = (C0080i) list.get(size);
            if (Y(c0080i, g0Var) && c0080i.f6946a == null && c0080i.f6947b == null) {
                list.remove(c0080i);
            }
        }
    }

    private void X(C0080i c0080i) {
        RecyclerView.g0 g0Var = c0080i.f6946a;
        if (g0Var != null) {
            Y(c0080i, g0Var);
        }
        RecyclerView.g0 g0Var2 = c0080i.f6947b;
        if (g0Var2 != null) {
            Y(c0080i, g0Var2);
        }
    }

    private boolean Y(C0080i c0080i, RecyclerView.g0 g0Var) {
        boolean z10 = false;
        if (c0080i.f6947b == g0Var) {
            c0080i.f6947b = null;
        } else {
            if (c0080i.f6946a != g0Var) {
                return false;
            }
            c0080i.f6946a = null;
            z10 = true;
        }
        g0Var.itemView.setAlpha(1.0f);
        g0Var.itemView.setTranslationX(0.0f);
        g0Var.itemView.setTranslationY(0.0f);
        C(g0Var, z10);
        return true;
    }

    private void Z(RecyclerView.g0 g0Var) {
        if (f6906s == null) {
            f6906s = new ValueAnimator().getInterpolator();
        }
        g0Var.itemView.animate().setInterpolator(f6906s);
        j(g0Var);
    }

    void Q(RecyclerView.g0 g0Var) {
        View view = g0Var.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f6914o.add(g0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(g0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    void R(C0080i c0080i) {
        RecyclerView.g0 g0Var = c0080i.f6946a;
        View view = g0Var == null ? null : g0Var.itemView;
        RecyclerView.g0 g0Var2 = c0080i.f6947b;
        View view2 = g0Var2 != null ? g0Var2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f6917r.add(c0080i.f6946a);
            duration.translationX(c0080i.f6950e - c0080i.f6948c);
            duration.translationY(c0080i.f6951f - c0080i.f6949d);
            duration.alpha(0.0f).setListener(new g(c0080i, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f6917r.add(c0080i.f6947b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(c0080i, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void S(RecyclerView.g0 g0Var, int i10, int i11, int i12, int i13) {
        View view = g0Var.itemView;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f6915p.add(g0Var);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(g0Var, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    void U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.g0) list.get(size)).itemView.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean g(RecyclerView.g0 g0Var, List list) {
        return !list.isEmpty() || super.g(g0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void j(RecyclerView.g0 g0Var) {
        View view = g0Var.itemView;
        view.animate().cancel();
        int size = this.f6909j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f6909j.get(size)).f6952a == g0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(g0Var);
                this.f6909j.remove(size);
            }
        }
        W(this.f6910k, g0Var);
        if (this.f6907h.remove(g0Var)) {
            view.setAlpha(1.0f);
            G(g0Var);
        }
        if (this.f6908i.remove(g0Var)) {
            view.setAlpha(1.0f);
            A(g0Var);
        }
        for (int size2 = this.f6913n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f6913n.get(size2);
            W(arrayList, g0Var);
            if (arrayList.isEmpty()) {
                this.f6913n.remove(size2);
            }
        }
        for (int size3 = this.f6912m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f6912m.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (((j) arrayList2.get(size4)).f6952a == g0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(g0Var);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f6912m.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f6911l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f6911l.get(size5);
            if (arrayList3.remove(g0Var)) {
                view.setAlpha(1.0f);
                A(g0Var);
                if (arrayList3.isEmpty()) {
                    this.f6911l.remove(size5);
                }
            }
        }
        this.f6916q.remove(g0Var);
        this.f6914o.remove(g0Var);
        this.f6917r.remove(g0Var);
        this.f6915p.remove(g0Var);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k() {
        int size = this.f6909j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f6909j.get(size);
            View view = jVar.f6952a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f6952a);
            this.f6909j.remove(size);
        }
        for (int size2 = this.f6907h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.g0) this.f6907h.get(size2));
            this.f6907h.remove(size2);
        }
        int size3 = this.f6908i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.g0 g0Var = (RecyclerView.g0) this.f6908i.get(size3);
            g0Var.itemView.setAlpha(1.0f);
            A(g0Var);
            this.f6908i.remove(size3);
        }
        for (int size4 = this.f6910k.size() - 1; size4 >= 0; size4--) {
            X((C0080i) this.f6910k.get(size4));
        }
        this.f6910k.clear();
        if (p()) {
            for (int size5 = this.f6912m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f6912m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f6952a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f6952a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f6912m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f6911l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f6911l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.g0 g0Var2 = (RecyclerView.g0) arrayList2.get(size8);
                    g0Var2.itemView.setAlpha(1.0f);
                    A(g0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f6911l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f6913n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f6913n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((C0080i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f6913n.remove(arrayList3);
                    }
                }
            }
            U(this.f6916q);
            U(this.f6915p);
            U(this.f6914o);
            U(this.f6917r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean p() {
        return (this.f6908i.isEmpty() && this.f6910k.isEmpty() && this.f6909j.isEmpty() && this.f6907h.isEmpty() && this.f6915p.isEmpty() && this.f6916q.isEmpty() && this.f6914o.isEmpty() && this.f6917r.isEmpty() && this.f6912m.isEmpty() && this.f6911l.isEmpty() && this.f6913n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void u() {
        boolean zIsEmpty = this.f6907h.isEmpty();
        boolean zIsEmpty2 = this.f6909j.isEmpty();
        boolean zIsEmpty3 = this.f6910k.isEmpty();
        boolean zIsEmpty4 = this.f6908i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        ArrayList arrayList = this.f6907h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            T((RecyclerView.g0) obj);
        }
        this.f6907h.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f6909j);
            this.f6912m.add(arrayList2);
            this.f6909j.clear();
            a aVar = new a(arrayList2);
            if (zIsEmpty) {
                aVar.run();
            } else {
                q0.f0(((j) arrayList2.get(0)).f6952a.itemView, aVar, o());
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(this.f6910k);
            this.f6913n.add(arrayList3);
            this.f6910k.clear();
            b bVar = new b(arrayList3);
            if (zIsEmpty) {
                bVar.run();
            } else {
                q0.f0(((C0080i) arrayList3.get(0)).f6946a.itemView, bVar, o());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(this.f6908i);
        this.f6911l.add(arrayList4);
        this.f6908i.clear();
        c cVar = new c(arrayList4);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
        } else {
            q0.f0(((RecyclerView.g0) arrayList4.get(0)).itemView, cVar, (!zIsEmpty ? o() : 0L) + Math.max(!zIsEmpty2 ? n() : 0L, zIsEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.w
    public boolean w(RecyclerView.g0 g0Var) {
        Z(g0Var);
        g0Var.itemView.setAlpha(0.0f);
        this.f6908i.add(g0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.w
    public boolean x(RecyclerView.g0 g0Var, RecyclerView.g0 g0Var2, int i10, int i11, int i12, int i13) {
        if (g0Var == g0Var2) {
            return y(g0Var, i10, i11, i12, i13);
        }
        float translationX = g0Var.itemView.getTranslationX();
        float translationY = g0Var.itemView.getTranslationY();
        float alpha = g0Var.itemView.getAlpha();
        Z(g0Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        g0Var.itemView.setTranslationX(translationX);
        g0Var.itemView.setTranslationY(translationY);
        g0Var.itemView.setAlpha(alpha);
        if (g0Var2 != null) {
            Z(g0Var2);
            g0Var2.itemView.setTranslationX(-i14);
            g0Var2.itemView.setTranslationY(-i15);
            g0Var2.itemView.setAlpha(0.0f);
        }
        this.f6910k.add(new C0080i(g0Var, g0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.w
    public boolean y(RecyclerView.g0 g0Var, int i10, int i11, int i12, int i13) {
        View view = g0Var.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) g0Var.itemView.getTranslationY());
        Z(g0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(g0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f6909j.add(new j(g0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.w
    public boolean z(RecyclerView.g0 g0Var) {
        Z(g0Var);
        this.f6907h.add(g0Var);
        return true;
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$i, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0080i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.g0 f6946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.g0 f6947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6949d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6950e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6951f;

        private C0080i(RecyclerView.g0 g0Var, RecyclerView.g0 g0Var2) {
            this.f6946a = g0Var;
            this.f6947b = g0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f6946a + ", newHolder=" + this.f6947b + ", fromX=" + this.f6948c + ", fromY=" + this.f6949d + ", toX=" + this.f6950e + ", toY=" + this.f6951f + '}';
        }

        C0080i(RecyclerView.g0 g0Var, RecyclerView.g0 g0Var2, int i10, int i11, int i12, int i13) {
            this(g0Var, g0Var2);
            this.f6948c = i10;
            this.f6949d = i11;
            this.f6950e = i12;
            this.f6951f = i13;
        }
    }
}
