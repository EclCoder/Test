package qf;

import android.util.Log;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.q0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class m extends n0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f50758m = new AtomicBoolean(false);

    public static /* synthetic */ void t(m mVar, q0 q0Var, Object obj) {
        if (mVar.f50758m.compareAndSet(true, false)) {
            q0Var.d(obj);
        }
    }

    @Override // androidx.lifecycle.k0
    public void j(b0 b0Var, final q0 q0Var) {
        if (h()) {
            Log.w("SingleMediatorLiveEvent", "Multiple observers registered but only one will be notified of changes.");
        }
        super.j(b0Var, new q0() { // from class: qf.l
            @Override // androidx.lifecycle.q0
            public final void d(Object obj) {
                m.t(this.f50756a, q0Var, obj);
            }
        });
    }

    @Override // androidx.lifecycle.p0, androidx.lifecycle.k0
    public void q(Object obj) {
        this.f50758m.set(true);
        super.q(obj);
    }
}
