package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f53268a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f53269b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f53270c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f53271d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f53272e = false;

    /* JADX INFO: renamed from: tb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0811a implements f1.e.p {
        C0811a() {
        }

        @Override // f1.e.p
        public void a(f1.e eVar, boolean z10, float f10, float f11) {
            eVar.i(this);
            a.this.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void a();

        void b();
    }

    private void f() {
        Iterator it = this.f53270c.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b();
        }
        this.f53272e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        int i10 = this.f53271d - 1;
        this.f53271d = i10;
        if (i10 == 0) {
            f();
        }
    }

    public void b(Animator animator) {
        this.f53268a.add(animator);
    }

    public void c(f1.e eVar) {
        this.f53269b.add(eVar);
    }

    public void d(c cVar) {
        this.f53270c.add(cVar);
    }

    public void e() {
        ArrayList arrayList = new ArrayList(this.f53268a);
        this.f53268a.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Animator) obj).end();
        }
        ArrayList arrayList2 = new ArrayList(this.f53269b);
        this.f53269b.clear();
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            f1.e eVar = (f1.e) obj2;
            if (eVar instanceof f1.h) {
                f1.h hVar = (f1.h) eVar;
                if (hVar.t()) {
                    hVar.y();
                } else {
                    hVar.c();
                }
            } else {
                eVar.c();
            }
        }
        this.f53270c.clear();
        this.f53271d = 0;
        this.f53272e = false;
    }

    public void h() {
        if (this.f53272e) {
            return;
        }
        this.f53272e = true;
        Iterator it = this.f53270c.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a();
        }
        this.f53271d = this.f53269b.size();
        if (!this.f53268a.isEmpty()) {
            this.f53271d++;
        }
        if (this.f53271d == 0) {
            f();
            return;
        }
        C0811a c0811a = new C0811a();
        for (f1.e eVar : this.f53269b) {
            eVar.b(c0811a);
            eVar.p();
        }
        if (this.f53268a.isEmpty()) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        tb.c.a(animatorSet, new ArrayList(this.f53268a));
        animatorSet.addListener(new b());
        animatorSet.start();
    }
}
