package com.inmobi.media;

import com.squareup.picasso.Callback;

/* JADX INFO: renamed from: com.inmobi.media.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3338u implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3390w f27580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ em.q f27581b;

    public C3338u(C3390w c3390w, em.q qVar) {
        this.f27580a = c3390w;
        this.f27581b = qVar;
    }

    @Override // com.squareup.picasso.Callback
    public final void onError(Exception exc) {
        C3348u9 c3348u9 = this.f27580a.f27752d;
        if (c3348u9 != null) {
            c3348u9.a("AdChoiceViewManager", "onError Called " + exc);
        }
        T4.a(this.f27581b, Boolean.FALSE);
    }

    @Override // com.squareup.picasso.Callback
    public final void onSuccess() {
        C3348u9 c3348u9 = this.f27580a.f27752d;
        if (c3348u9 != null) {
            c3348u9.a("AdChoiceViewManager", "onSuccess Called");
        }
        T4.a(this.f27581b, Boolean.TRUE);
    }
}
