package com.inmobi.media;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Je {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f25063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f25064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaView f25065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f25066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ne f25067e;

    public Je(ViewGroup parentView, ImageView imageView, MediaView mediaView, List friendlyViews, Ne nativeVisibilitySpec) {
        kotlin.jvm.internal.s.h(parentView, "parentView");
        kotlin.jvm.internal.s.h(friendlyViews, "friendlyViews");
        kotlin.jvm.internal.s.h(nativeVisibilitySpec, "nativeVisibilitySpec");
        this.f25063a = parentView;
        this.f25064b = imageView;
        this.f25065c = mediaView;
        this.f25066d = friendlyViews;
        this.f25067e = nativeVisibilitySpec;
    }
}
