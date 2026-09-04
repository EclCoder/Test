package rk;

import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements b, uk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    bl.b f51356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f51357b;

    @Override // uk.a
    public boolean a(b bVar) {
        vk.b.c(bVar, "Disposable item is null");
        if (this.f51357b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f51357b) {
                    return false;
                }
                bl.b bVar2 = this.f51356a;
                if (bVar2 != null && bVar2.e(bVar)) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // uk.a
    public boolean b(b bVar) {
        vk.b.c(bVar, "d is null");
        if (!this.f51357b) {
            synchronized (this) {
                try {
                    if (!this.f51357b) {
                        bl.b bVar2 = this.f51356a;
                        if (bVar2 == null) {
                            bVar2 = new bl.b();
                            this.f51356a = bVar2;
                        }
                        bVar2.a(bVar);
                        return true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        bVar.d();
        return false;
    }

    @Override // uk.a
    public boolean c(b bVar) {
        if (!a(bVar)) {
            return false;
        }
        bVar.d();
        return true;
    }

    @Override // rk.b
    public void d() {
        if (this.f51357b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f51357b) {
                    return;
                }
                this.f51357b = true;
                bl.b bVar = this.f51356a;
                this.f51356a = null;
                e(bVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void e(bl.b bVar) {
        if (bVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : bVar.b()) {
            if (obj instanceof b) {
                try {
                    ((b) obj).d();
                } catch (Throwable th2) {
                    sk.a.b(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw bl.a.a((Throwable) arrayList.get(0));
        }
    }

    public boolean f() {
        return this.f51357b;
    }
}
