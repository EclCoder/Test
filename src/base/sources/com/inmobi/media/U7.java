package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class U7 implements P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W7 f25814a;

    public U7(W7 w10) {
        this.f25814a = w10;
    }

    @Override // com.inmobi.media.P1
    public final void a() {
        this.f25814a.a();
    }

    @Override // com.inmobi.media.P1
    public final void b() {
        W7 w10 = this.f25814a;
        w10.f25928b.setVolume(1.0f);
        T4.a(w10.f25929c, w10.f25927a, new S1(1.0f, false));
        w10.f25931e = false;
    }
}
