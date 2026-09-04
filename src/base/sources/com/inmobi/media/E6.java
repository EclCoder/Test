package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class E6 extends G6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaView f24697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bl f24698b;

    public E6(MediaView mediaView, Bl bl2) {
        kotlin.jvm.internal.s.h(mediaView, "mediaView");
        this.f24697a = mediaView;
        this.f24698b = bl2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E6)) {
            return false;
        }
        E6 e10 = (E6) obj;
        return kotlin.jvm.internal.s.c(this.f24697a, e10.f24697a) && kotlin.jvm.internal.s.c(this.f24698b, e10.f24698b);
    }

    public final int hashCode() {
        int iHashCode = this.f24697a.hashCode() * 31;
        Bl bl2 = this.f24698b;
        return iHashCode + (bl2 == null ? 0 : bl2.hashCode());
    }

    public final String toString() {
        return "Success(mediaView=" + this.f24697a + ", vastBeaconData=" + this.f24698b + ")";
    }
}
