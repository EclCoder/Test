package kl;

import kotlin.jvm.internal.s;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements j.b {
    private final j.c key;

    public a(j.c key) {
        s.h(key, "key");
        this.key = key;
    }

    @Override // kl.j
    public /* bridge */ <R> R fold(R r10, o oVar) {
        return (R) j.b.a.a(this, r10, oVar);
    }

    @Override // kl.j.b, kl.j
    public /* bridge */ <E extends j.b> E get(j.c cVar) {
        return (E) j.b.a.b(this, cVar);
    }

    @Override // kl.j.b
    public j.c getKey() {
        return this.key;
    }

    @Override // kl.j
    public /* bridge */ j minusKey(j.c cVar) {
        return j.b.a.c(this, cVar);
    }

    @Override // kl.j
    public /* bridge */ j plus(j jVar) {
        return j.b.a.d(this, jVar);
    }
}
