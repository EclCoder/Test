package io;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class f extends n implements co.k {
    private co.j entity;

    @Override // io.b
    public Object clone() {
        f fVar = (f) super.clone();
        co.j jVar = this.entity;
        if (jVar != null) {
            fVar.entity = (co.j) lo.a.a(jVar);
        }
        return fVar;
    }

    @Override // co.k
    public boolean expectContinue() {
        co.d firstHeader = getFirstHeader("Expect");
        return firstHeader != null && "100-continue".equalsIgnoreCase(firstHeader.getValue());
    }

    @Override // co.k
    public co.j getEntity() {
        return this.entity;
    }

    @Override // co.k
    public void setEntity(co.j jVar) {
        this.entity = jVar;
    }
}
