package com.vungle.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface c0 extends o {
    @Override // com.vungle.ads.o, com.vungle.ads.j
    /* synthetic */ void onAdClicked(i iVar);

    @Override // com.vungle.ads.o, com.vungle.ads.j
    /* synthetic */ void onAdEnd(i iVar);

    @Override // com.vungle.ads.o, com.vungle.ads.j
    /* synthetic */ void onAdFailedToLoad(i iVar, VungleError vungleError);

    @Override // com.vungle.ads.o, com.vungle.ads.j
    /* synthetic */ void onAdFailedToPlay(i iVar, VungleError vungleError);

    @Override // com.vungle.ads.o, com.vungle.ads.j
    /* synthetic */ void onAdImpression(i iVar);

    @Override // com.vungle.ads.o, com.vungle.ads.j
    /* synthetic */ void onAdLeftApplication(i iVar);

    @Override // com.vungle.ads.o, com.vungle.ads.j
    /* synthetic */ void onAdLoaded(i iVar);

    void onAdRewarded(i iVar);

    @Override // com.vungle.ads.o, com.vungle.ads.j
    /* synthetic */ void onAdStart(i iVar);
}
