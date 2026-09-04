package androidx.databinding;

import androidx.lifecycle.b0;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class q extends WeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f3484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f3485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f3486c;

    public q(p pVar, int i10, m mVar, ReferenceQueue referenceQueue) {
        super(pVar, referenceQueue);
        this.f3485b = i10;
        this.f3484a = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected p a() {
        p pVar = (p) get();
        if (pVar == null) {
            e();
        }
        return pVar;
    }

    public Object b() {
        return this.f3486c;
    }

    public void c(b0 b0Var) {
        this.f3484a.a(b0Var);
    }

    public void d(Object obj) {
        e();
        this.f3486c = obj;
        if (obj != null) {
            this.f3484a.c(obj);
        }
    }

    public boolean e() {
        boolean z10;
        Object obj = this.f3486c;
        if (obj != null) {
            this.f3484a.b(obj);
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3486c = null;
        return z10;
    }
}
