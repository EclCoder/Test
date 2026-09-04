package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: renamed from: com.inmobi.media.bh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2865bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiNativeViewData f26265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaView f26266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f26267c;

    public C2865bh(InMobiNativeViewData pubView, MediaView mediaView, View view) {
        kotlin.jvm.internal.s.h(pubView, "pubView");
        this.f26265a = pubView;
        this.f26266b = mediaView;
        this.f26267c = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2865bh)) {
            return false;
        }
        C2865bh c2865bh = (C2865bh) obj;
        return kotlin.jvm.internal.s.c(this.f26265a, c2865bh.f26265a) && kotlin.jvm.internal.s.c(this.f26266b, c2865bh.f26266b) && kotlin.jvm.internal.s.c(this.f26267c, c2865bh.f26267c);
    }

    public final int hashCode() {
        int iHashCode = this.f26265a.hashCode() * 31;
        MediaView mediaView = this.f26266b;
        int iHashCode2 = (iHashCode + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        View view = this.f26267c;
        return iHashCode2 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        return "PublisherNativeViewData(pubView=" + this.f26265a + ", mediaView=" + this.f26266b + ", adChoice=" + this.f26267c + ")";
    }
}
