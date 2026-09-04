package am;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f420a;

    @Override // am.g
    public Iterator iterator() {
        g gVar = (g) this.f420a.getAndSet(null);
        if (gVar != null) {
            return gVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }

    public a(g gVar) {
        kotlin.jvm.internal.s.h(gVar, CIdIVqKnNZ.lMvWfhj);
        this.f420a = new AtomicReference(gVar);
    }
}
