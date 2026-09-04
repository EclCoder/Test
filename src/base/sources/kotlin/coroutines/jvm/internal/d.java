package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends a {
    private final kl.j _context;
    private transient kl.f intercepted;

    public d(kl.f fVar, kl.j jVar) {
        super(fVar);
        this._context = jVar;
    }

    @Override // kl.f
    public kl.j getContext() {
        kl.j jVar = this._context;
        s.e(jVar);
        return jVar;
    }

    public final kl.f intercepted() {
        kl.f fVarG0 = this.intercepted;
        if (fVarG0 == null) {
            kl.g gVar = (kl.g) getContext().get(kl.g.f43529z2);
            if (gVar == null || (fVarG0 = gVar.g0(this)) == null) {
                fVarG0 = this;
            }
            this.intercepted = fVarG0;
        }
        return fVarG0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        kl.f fVar = this.intercepted;
        if (fVar != null && fVar != this) {
            kl.j.b bVar = getContext().get(kl.g.f43529z2);
            s.e(bVar);
            ((kl.g) bVar).d0(fVar);
        }
        this.intercepted = c.f43563a;
    }

    public d(kl.f fVar) {
        this(fVar, fVar != null ? fVar.getContext() : null);
    }
}
