package o0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f47953a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final q f47954a;

        a(q qVar) {
            this.f47954a = qVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            p pVarB = this.f47954a.b(i10);
            if (pVarB == null) {
                return null;
            }
            return pVarB.b1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i10) {
            List listC = this.f47954a.c(str, i10);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((p) listC.get(i11)).b1());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            p pVarD = this.f47954a.d(i10);
            if (pVarD == null) {
                return null;
            }
            return pVarD.b1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f47954a.f(i10, i11, bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b extends a {
        b(q qVar) {
            super(qVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f47954a.a(i10, p.c1(accessibilityNodeInfo), str, bundle);
        }
    }

    public q() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f47953a = new b(this);
        } else {
            this.f47953a = new a(this);
        }
    }

    public p b(int i10) {
        return null;
    }

    public List c(String str, int i10) {
        return null;
    }

    public p d(int i10) {
        return null;
    }

    public Object e() {
        return this.f47953a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public q(Object obj) {
        this.f47953a = obj;
    }

    public void a(int i10, p pVar, String str, Bundle bundle) {
    }
}
