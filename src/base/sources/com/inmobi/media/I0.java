package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class I0 implements Ng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L0 f24972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24973b;

    public I0(L0 l10, boolean z10) {
        this.f24972a = l10;
        this.f24973b = z10;
    }

    @Override // com.inmobi.media.Ng
    public final void a(Object obj) {
        ((Boolean) obj).getClass();
        this.f24972a.a("result pushed to queue");
        if (this.f24973b) {
            L0 l10 = this.f24972a;
            l10.a("session end - cleanup");
            l10.f25159g = null;
            l10.f25158f.clear();
            l10.f25155c.set(false);
            l10.f25156d.set(false);
        }
    }

    @Override // com.inmobi.media.Ng
    public final void onError(Exception exc) {
        this.f24972a.a("error in pushing to queue", exc);
    }
}
