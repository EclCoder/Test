package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class u extends n0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final RecyclerView f7054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f7055e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a extends n0.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final u f7056d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f7057e = new WeakHashMap();

        public a(u uVar) {
            this.f7056d = uVar;
        }

        @Override // n0.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = (n0.a) this.f7057e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // n0.a
        public o0.q b(View view) {
            n0.a aVar = (n0.a) this.f7057e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // n0.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = (n0.a) this.f7057e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // n0.a
        public void g(View view, o0.p pVar) {
            if (this.f7056d.o() || this.f7056d.f7054d.getLayoutManager() == null) {
                super.g(view, pVar);
                return;
            }
            this.f7056d.f7054d.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, pVar);
            n0.a aVar = (n0.a) this.f7057e.get(view);
            if (aVar != null) {
                aVar.g(view, pVar);
            } else {
                super.g(view, pVar);
            }
        }

        @Override // n0.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = (n0.a) this.f7057e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // n0.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = (n0.a) this.f7057e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // n0.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (this.f7056d.o() || this.f7056d.f7054d.getLayoutManager() == null) {
                return super.j(view, i10, bundle);
            }
            n0.a aVar = (n0.a) this.f7057e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.j(view, i10, bundle)) {
                return true;
            }
            return this.f7056d.f7054d.getLayoutManager().performAccessibilityActionForItem(view, i10, bundle);
        }

        @Override // n0.a
        public void l(View view, int i10) {
            n0.a aVar = (n0.a) this.f7057e.get(view);
            if (aVar != null) {
                aVar.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        @Override // n0.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = (n0.a) this.f7057e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        n0.a n(View view) {
            return (n0.a) this.f7057e.remove(view);
        }

        void o(View view) {
            n0.a aVarN = q0.n(view);
            if (aVarN == null || aVarN == this) {
                return;
            }
            this.f7057e.put(view, aVarN);
        }
    }

    public u(RecyclerView recyclerView) {
        this.f7054d = recyclerView;
        n0.a aVarN = n();
        if (aVarN == null || !(aVarN instanceof a)) {
            this.f7055e = new a(this);
        } else {
            this.f7055e = (a) aVarN;
        }
    }

    @Override // n0.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // n0.a
    public void g(View view, o0.p pVar) {
        super.g(view, pVar);
        if (o() || this.f7054d.getLayoutManager() == null) {
            return;
        }
        this.f7054d.getLayoutManager().onInitializeAccessibilityNodeInfo(pVar);
    }

    @Override // n0.a
    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f7054d.getLayoutManager() == null) {
            return false;
        }
        return this.f7054d.getLayoutManager().performAccessibilityAction(i10, bundle);
    }

    public n0.a n() {
        return this.f7055e;
    }

    boolean o() {
        return this.f7054d.w0();
    }
}
