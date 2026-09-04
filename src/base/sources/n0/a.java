package n0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f46563c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f46564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f46565b;

    /* JADX INFO: renamed from: n0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0716a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f46566a;

        C0716a(a aVar) {
            this.f46566a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f46566a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            o0.q qVarB = this.f46566a.b(view);
            if (qVarB != null) {
                return (AccessibilityNodeProvider) qVarB.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f46566a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            o0.p pVarC1 = o0.p.c1(accessibilityNodeInfo);
            pVarC1.R0(q0.V(view));
            pVarC1.F0(q0.R(view));
            pVarC1.M0(q0.q(view));
            pVarC1.X0(q0.J(view));
            this.f46566a.g(view, pVarC1);
            pVarC1.f(accessibilityNodeInfo.getText(), view);
            List listC = a.c(view);
            for (int i10 = 0; i10 < listC.size(); i10++) {
                pVarC1.b((o0.p.a) listC.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f46566a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f46566a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f46566a.j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f46566a.l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f46566a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(f46563c);
    }

    static List c(View view) {
        List list = (List) view.getTag(b0.c.H);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrT = o0.p.t(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; clickableSpanArrT != null && i10 < clickableSpanArrT.length; i10++) {
                if (clickableSpan.equals(clickableSpanArrT[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(b0.c.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f46564a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public o0.q b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f46564a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new o0.q(accessibilityNodeProvider);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.f46565b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f46564a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, o0.p pVar) {
        this.f46564a.onInitializeAccessibilityNodeInfo(view, pVar.b1());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f46564a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f46564a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) {
        List listC = c(view);
        boolean zPerformAccessibilityAction = false;
        for (int i11 = 0; i11 < listC.size(); i11++) {
            o0.p.a aVar = (o0.p.a) listC.get(i11);
            if (aVar.b() == i10) {
                zPerformAccessibilityAction = aVar.d(view, bundle);
                break;
            }
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f46564a.performAccessibilityAction(view, i10, bundle);
        }
        return (zPerformAccessibilityAction || i10 != b0.c.f8206a || bundle == null) ? zPerformAccessibilityAction : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i10) {
        this.f46564a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f46564a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f46564a = accessibilityDelegate;
        this.f46565b = new C0716a(this);
    }
}
