package zg;

import android.graphics.Rect;
import android.view.WindowManager;
import com.hecorat.screenrecorder.free.AzRecorderApp;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WindowManager f58829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f58830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Rect f58831c = new Rect(0, 0, 0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AzRecorderApp f58832d = AzRecorderApp.e();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(b bVar, int i10, int i11, int i12, int i13) {
        Rect rect = bVar.f58831c;
        if (((rect.left != i10) | (rect.top != i11) | (rect.right != i12)) || (rect.bottom != i13)) {
            if (nh.b.l(bVar.f58832d) == 3 && nh.b.i(bVar.f58832d) == i10) {
                bVar.f58831c.set(0, i11, i12 - i10, i13);
            } else {
                bVar.f58831c.set(i10, i11, i12, i13);
            }
            bVar.j(bVar.f58831c);
            wp.a.h(AzRecorderApp.f22504d).g("add bubble to window", new Object[0]);
        }
    }

    public abstract void j(Rect rect);

    protected final Rect k() {
        return this.f58831c;
    }

    public void l() {
        wp.a.h(AzRecorderApp.f22504d).g("show BaseFloatManager", new Object[0]);
        if (this.f58830b == null) {
            wp.a.h(AzRecorderApp.f22504d).g("floatObserver is null", new Object[0]);
            n nVar = new n(this.f58832d);
            this.f58830b = nVar;
            nVar.q(new n.a() { // from class: zg.a
                @Override // zg.n.a
                public final void a(int i10, int i11, int i12, int i13) {
                    b.m(this.f58825a, i10, i11, i12, i13);
                }
            });
            n nVar2 = this.f58830b;
            if (nVar2 != null) {
                nVar2.e();
            }
            wp.a.h(AzRecorderApp.f22504d).g("finish floatObserver?.addOrUpdateView()", new Object[0]);
        }
    }

    public void n() {
        n nVar = this.f58830b;
        if (nVar != null) {
            nVar.q(null);
        }
        n nVar2 = this.f58830b;
        if (nVar2 != null) {
            nVar2.n();
        }
        this.f58830b = null;
        this.f58831c.setEmpty();
    }
}
