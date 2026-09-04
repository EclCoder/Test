package gl;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements Iterable, ul.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tl.a f39330a;

    public h0(tl.a iteratorFactory) {
        kotlin.jvm.internal.s.h(iteratorFactory, "iteratorFactory");
        this.f39330a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new i0((Iterator) this.f39330a.invoke());
    }
}
