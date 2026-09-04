package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class J0 implements Ng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L0 f25037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Vj f25039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f25040d;

    public J0(L0 l10, boolean z10, Vj vj2, String str) {
        this.f25037a = l10;
        this.f25038b = z10;
        this.f25039c = vj2;
        this.f25040d = str;
    }

    @Override // com.inmobi.media.Ng
    public final void onError(Exception exc) {
        this.f25037a.a(exc, this.f25039c);
    }

    @Override // com.inmobi.media.Ng
    public final void a(String result) {
        kotlin.jvm.internal.s.h(result, "result");
        this.f25037a.a("file saved - " + result + " , isReporting - " + this.f25038b);
        this.f25037a.a(result, this.f25039c, this.f25040d, this.f25038b);
    }
}
