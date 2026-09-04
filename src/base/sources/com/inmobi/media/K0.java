package com.inmobi.media;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class K0 implements Ng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L0 f25094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3341u2 f25095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Zh f25097d;

    public K0(L0 l10, AbstractC3341u2 abstractC3341u2, boolean z10, Zh zh2) {
        this.f25094a = l10;
        this.f25095b = abstractC3341u2;
        this.f25096c = z10;
        this.f25097d = zh2;
    }

    @Override // com.inmobi.media.Ng
    public final void a(Object obj) {
        this.f25094a.a((Bitmap) obj, this.f25095b, this.f25096c, this.f25097d);
    }

    @Override // com.inmobi.media.Ng
    public final void onError(Exception exc) {
        this.f25094a.a(exc, this.f25095b);
    }
}
