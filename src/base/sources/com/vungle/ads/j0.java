package com.vungle.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class j0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final com.vungle.ads.internal.util.p getAdLogEntry(VungleAdType vungleAdType) {
        if (vungleAdType instanceof i) {
            return ((i) vungleAdType).getLogEntry$vungle_ads_release();
        }
        if (vungleAdType instanceof h0) {
            return ((h0) vungleAdType).getLogEntry$vungle_ads_release();
        }
        return null;
    }
}
