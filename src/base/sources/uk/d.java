package uk;

import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d implements rk.b, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List f54715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f54716b;

    @Override // uk.a
    public boolean a(rk.b bVar) {
        vk.b.c(bVar, "Disposable item is null");
        if (this.f54716b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f54716b) {
                    return false;
                }
                List list = this.f54715a;
                if (list != null && list.remove(bVar)) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // uk.a
    public boolean b(rk.b bVar) {
        vk.b.c(bVar, "d is null");
        if (!this.f54716b) {
            synchronized (this) {
                try {
                    if (!this.f54716b) {
                        List linkedList = this.f54715a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f54715a = linkedList;
                        }
                        linkedList.add(bVar);
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
    public boolean c(rk.b bVar) {
        if (!a(bVar)) {
            return false;
        }
        bVar.d();
        return true;
    }

    @Override // rk.b
    public void d() {
        if (this.f54716b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f54716b) {
                    return;
                }
                this.f54716b = true;
                List list = this.f54715a;
                this.f54715a = null;
                e(list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void e(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                ((rk.b) it.next()).d();
            } catch (Throwable th2) {
                sk.a.b(th2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw bl.a.a((Throwable) arrayList.get(0));
        }
    }
}
