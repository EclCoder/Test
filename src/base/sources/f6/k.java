package f6;

import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.r0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class k implements j, a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f38258a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.s f38259b;

    k(androidx.lifecycle.s sVar) {
        this.f38259b = sVar;
        sVar.a(this);
    }

    @Override // f6.j
    public void b(l lVar) {
        this.f38258a.remove(lVar);
    }

    @Override // f6.j
    public void d(l lVar) {
        this.f38258a.add(lVar);
        if (this.f38259b.b() == androidx.lifecycle.s.b.DESTROYED) {
            lVar.onDestroy();
        } else if (this.f38259b.b().e(androidx.lifecycle.s.b.STARTED)) {
            lVar.onStart();
        } else {
            lVar.onStop();
        }
    }

    @r0(androidx.lifecycle.s.a.ON_DESTROY)
    public void onDestroy(b0 b0Var) {
        Iterator it = m6.l.j(this.f38258a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onDestroy();
        }
        b0Var.getLifecycle().d(this);
    }

    @r0(androidx.lifecycle.s.a.ON_START)
    public void onStart(b0 b0Var) {
        Iterator it = m6.l.j(this.f38258a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStart();
        }
    }

    @r0(androidx.lifecycle.s.a.ON_STOP)
    public void onStop(b0 b0Var) {
        Iterator it = m6.l.j(this.f38258a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStop();
        }
    }
}
