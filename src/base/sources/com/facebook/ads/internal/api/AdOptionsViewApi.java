package com.facebook.ads.internal.api;

import com.facebook.ads.AdClosedListener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface AdOptionsViewApi extends AdComponentViewApiProvider {
    void setIconColor(int i10);

    void setIconSizeDp(int i10);

    void setOnAdClosedListener(AdClosedListener adClosedListener);

    void setSingleIcon(boolean z10);
}
