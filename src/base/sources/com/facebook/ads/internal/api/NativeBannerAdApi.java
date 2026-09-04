package com.facebook.ads.internal.api;

import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.MediaView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface NativeBannerAdApi {
    void registerViewForInteraction(View view, ImageView imageView);

    void registerViewForInteraction(View view, ImageView imageView, List<View> list);

    void registerViewForInteraction(View view, MediaView mediaView);

    void registerViewForInteraction(View view, MediaView mediaView, List<View> list);
}
