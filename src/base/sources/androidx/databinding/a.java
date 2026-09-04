package androidx.databinding;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient o f3437a;

    @Override // androidx.databinding.i
    public void a(i.a aVar) {
        synchronized (this) {
            try {
                if (this.f3437a == null) {
                    this.f3437a = new o();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f3437a.b(aVar);
    }

    @Override // androidx.databinding.i
    public void e(i.a aVar) {
        synchronized (this) {
            try {
                o oVar = this.f3437a;
                if (oVar == null) {
                    return;
                }
                oVar.j(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g() {
        synchronized (this) {
            try {
                o oVar = this.f3437a;
                if (oVar == null) {
                    return;
                }
                oVar.e(this, 0, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(int i10) {
        synchronized (this) {
            try {
                o oVar = this.f3437a;
                if (oVar == null) {
                    return;
                }
                oVar.e(this, i10, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
