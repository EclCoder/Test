package com.bytedance.sdk.openadsdk.core.orl;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends dse {
    private boolean dkl;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final MediaEvents f14131sk;

    public ojm(AdSession adSession, AdEvents adEvents, View view, MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.f14131sk = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.orl.dse
    public void hn(int i10) {
        if (hnj()) {
            switch (i10) {
                case 0:
                    this.f14131sk.pause();
                    break;
                case 1:
                    this.f14131sk.resume();
                    break;
                case 2:
                case 14:
                    this.f14131sk.skipped();
                    break;
                case 4:
                    this.f14131sk.bufferStart();
                    break;
                case 5:
                    this.f14131sk.bufferFinish();
                    break;
                case 6:
                    this.f14131sk.firstQuartile();
                    break;
                case 7:
                    this.f14131sk.midpoint();
                    break;
                case 8:
                    this.f14131sk.thirdQuartile();
                    break;
                case 9:
                    this.f14131sk.complete();
                    break;
                case 10:
                    this.f14131sk.playerStateChange(PlayerState.FULLSCREEN);
                    break;
                case 11:
                    this.f14131sk.playerStateChange(PlayerState.NORMAL);
                    break;
                case 12:
                    this.f14131sk.volumeChange(this.dkl ? 0.0f : 1.0f);
                    break;
                case 13:
                    this.f14131sk.adUserInteraction(InteractionType.CLICK);
                    break;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.orl.dse
    public void hnj(boolean z10, float f10) {
        if (z10) {
            this.gjv = VastProperties.createVastPropertiesForSkippableMedia(f10, true, Position.STANDALONE);
        } else {
            this.gjv = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        hnj(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.orl.dse
    public void hnj(float f10, boolean z10) {
        if (hnj()) {
            this.f14131sk.start(f10, z10 ? 0.0f : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.orl.dse
    public void hnj(boolean z10) {
        this.dkl = z10;
        hn(12);
    }
}
