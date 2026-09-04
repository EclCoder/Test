package nm;

import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: nm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0734a {
    }

    static /* synthetic */ void b(a aVar, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        aVar.f(obj);
    }

    static /* synthetic */ boolean g(a aVar, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return aVar.c(obj);
    }

    boolean c(Object obj);

    boolean d();

    Object e(Object obj, kl.f fVar);

    void f(Object obj);

    static /* synthetic */ Object a(a aVar, Object obj, kl.f fVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException(KPtaxpyICj.srmVsdJZbETPH);
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return aVar.e(obj, fVar);
    }
}
