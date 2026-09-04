package com.inmobi.media;

import com.squareup.picasso.Picasso;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3312t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3390w f27491a;

    public C3312t(C3390w c3390w) {
        this.f27491a = c3390w;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C3348u9 c3348u9 = this.f27491a.f27752d;
        if (c3348u9 != null) {
            c3348u9.a("AdChoiceViewManager", "invokeOnCancellation Called");
        }
        C3390w c3390w = this.f27491a;
        C3348u9 c3348u10 = c3390w.f27752d;
        if (c3348u10 != null) {
            c3348u10.a("AdChoiceViewManager", "destroy called");
        }
        Picasso picasso = Yf.f26082a;
        Yf.b(c3390w.f27749a).cancelTag(c3390w.f27753e);
        return fl.g0.f38750a;
    }
}
