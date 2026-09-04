package uk;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public enum b implements rk.b {
    DISPOSED;

    public static boolean a(AtomicReference atomicReference) {
        rk.b bVar;
        rk.b bVar2 = (rk.b) atomicReference.get();
        b bVar3 = DISPOSED;
        if (bVar2 == bVar3 || (bVar = (rk.b) atomicReference.getAndSet(bVar3)) == bVar3) {
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar.d();
        return true;
    }

    public static boolean b(rk.b bVar) {
        return bVar == DISPOSED;
    }

    public static void g() {
        cl.a.k(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean h(AtomicReference atomicReference, rk.b bVar) {
        vk.b.c(bVar, "d is null");
        if (androidx.lifecycle.b.a(atomicReference, null, bVar)) {
            return true;
        }
        bVar.d();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        g();
        return false;
    }

    public static boolean i(rk.b bVar, rk.b bVar2) {
        if (bVar2 == null) {
            cl.a.k(new NullPointerException("next is null"));
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar2.d();
        g();
        return false;
    }

    @Override // rk.b
    public void d() {
    }
}
