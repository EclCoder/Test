package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MotionLayout f2429a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashSet f2431c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList f2433e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f2430b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f2432d = "ViewTransitionController";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList f2434f = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements androidx.constraintlayout.widget.g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f2435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f2437c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2438d;

        a(s sVar, int i10, boolean z10, int i11) {
            this.f2435a = sVar;
            this.f2436b = i10;
            this.f2437c = z10;
            this.f2438d = i11;
        }
    }

    public t(MotionLayout motionLayout) {
        this.f2429a = motionLayout;
    }

    private void f(s sVar, boolean z10) {
        ConstraintLayout.getSharedValues().a(sVar.h(), new a(sVar, sVar.h(), z10, sVar.g()));
    }

    private void j(s sVar, View... viewArr) {
        int currentState = this.f2429a.getCurrentState();
        if (sVar.f2394e == 2) {
            sVar.c(this, this.f2429a, currentState, null, viewArr);
            return;
        }
        if (currentState != -1) {
            androidx.constraintlayout.widget.c cVarP0 = this.f2429a.p0(currentState);
            if (cVarP0 == null) {
                return;
            }
            sVar.c(this, this.f2429a, currentState, cVarP0, viewArr);
            return;
        }
        Log.w(this.f2432d, "No support for ViewTransition within transition yet. Currently: " + this.f2429a.toString());
    }

    public void a(s sVar) {
        this.f2430b.add(sVar);
        this.f2431c = null;
        if (sVar.i() == 4) {
            f(sVar, true);
        } else if (sVar.i() == 5) {
            f(sVar, false);
        }
    }

    void b(s.b bVar) {
        if (this.f2433e == null) {
            this.f2433e = new ArrayList();
        }
        this.f2433e.add(bVar);
    }

    void c() {
        ArrayList arrayList = this.f2433e;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((s.b) obj).a();
        }
        this.f2433e.removeAll(this.f2434f);
        this.f2434f.clear();
        if (this.f2433e.isEmpty()) {
            this.f2433e = null;
        }
    }

    boolean d(int i10, m mVar) {
        ArrayList arrayList = this.f2430b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            s sVar = (s) obj;
            if (sVar.e() == i10) {
                sVar.f2395f.a(mVar);
                return true;
            }
        }
        return false;
    }

    void e() {
        this.f2429a.invalidate();
    }

    void g(s.b bVar) {
        this.f2434f.add(bVar);
    }

    void h(MotionEvent motionEvent) {
        int currentState = this.f2429a.getCurrentState();
        if (currentState == -1) {
            return;
        }
        int i10 = 0;
        if (this.f2431c == null) {
            this.f2431c = new HashSet();
            ArrayList arrayList = this.f2430b;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                s sVar = (s) obj;
                int childCount = this.f2429a.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f2429a.getChildAt(i12);
                    if (sVar.j(childAt)) {
                        childAt.getId();
                        this.f2431c.add(childAt);
                    }
                }
            }
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList arrayList2 = this.f2433e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f2433e;
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList3.get(i13);
                i13++;
                ((s.b) obj2).d(action, x10, y10);
            }
        }
        if (action == 0 || action == 1) {
            androidx.constraintlayout.widget.c cVarP0 = this.f2429a.p0(currentState);
            ArrayList arrayList4 = this.f2430b;
            int size3 = arrayList4.size();
            while (i10 < size3) {
                int i14 = i10 + 1;
                s sVar2 = (s) arrayList4.get(i10);
                if (sVar2.l(action)) {
                    for (View view : this.f2431c) {
                        if (sVar2.j(view)) {
                            view.getHitRect(rect);
                            if (rect.contains((int) x10, (int) y10)) {
                                sVar2.c(this, this.f2429a, currentState, cVarP0, view);
                            }
                        }
                    }
                }
                i10 = i14;
            }
        }
    }

    void i(int i10, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f2430b;
        int size = arrayList2.size();
        s sVar = null;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            s sVar2 = (s) obj;
            if (sVar2.e() == i10) {
                for (View view : viewArr) {
                    if (sVar2.d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    j(sVar2, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                sVar = sVar2;
            }
        }
        if (sVar == null) {
            Log.e(this.f2432d, " Could not find ViewTransition");
        }
    }
}
