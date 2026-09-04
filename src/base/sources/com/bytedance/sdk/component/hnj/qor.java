package com.bytedance.sdk.component.hnj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class qor<P, R> extends com.bytedance.sdk.component.hnj.hn<P, R> {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private hnj f12906hn;
    private boolean hnj = true;
    private sk qor;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hn {
        qor hnj();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface hnj {
        void hnj(Object obj);

        void hnj(Throwable th2);
    }

    private boolean dkl() {
        if (this.hnj) {
            return true;
        }
        aq.hnj(new IllegalStateException("Jsb async call already finished: " + hnj() + ", hashcode: " + hashCode()));
        return false;
    }

    protected void gjv() {
        this.hnj = false;
        this.qor = null;
    }

    @Override // com.bytedance.sdk.component.hnj.hn
    public /* bridge */ /* synthetic */ String hnj() {
        return super.hnj();
    }

    protected abstract void hnj(P p10, sk skVar);

    protected final void qor() {
        hnj((Throwable) null);
    }

    void sk() {
        gjv();
    }

    protected final void hnj(R r10) {
        if (dkl()) {
            this.f12906hn.hnj(r10);
            gjv();
        }
    }

    protected final void hnj(Throwable th2) {
        if (dkl()) {
            this.f12906hn.hnj(th2);
            gjv();
        }
    }

    void hnj(P p10, sk skVar, hnj hnjVar) {
        this.qor = skVar;
        this.f12906hn = hnjVar;
        hnj(p10, skVar);
    }
}
