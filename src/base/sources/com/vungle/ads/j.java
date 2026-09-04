package com.vungle.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface j {
    void onAdClicked(i iVar);

    void onAdEnd(i iVar);

    void onAdFailedToLoad(i iVar, VungleError vungleError);

    void onAdFailedToPlay(i iVar, VungleError vungleError);

    void onAdImpression(i iVar);

    void onAdLeftApplication(i iVar);

    void onAdLoaded(i iVar);

    void onAdStart(i iVar);
}
