package com.inmobi.ads.controllers;

import androidx.core.app.NotificationCompat;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C3437xk;
import com.inmobi.media.V1;
import com.inmobi.media.Zg;
import com.vungle.ads.internal.ui.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0006\b'\u0018\u0000 92\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\u0003J#\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H&¢\u0006\u0004\b\u001c\u0010\u0003J#\u0010\u001e\u001a\u00020\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u0016J\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010\u0003J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010\fJ\u0017\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104R\u0014\u00108\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/inmobi/ads/controllers/PublisherCallbacks;", "", "<init>", "()V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "Lfl/g0;", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", NotificationCompat.CATEGORY_STATUS, "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "onAdLoadSucceeded", "onAdLoadFailed", "onAdWillDisplay", "onAdDisplayed", "onAdDisplayFailed", "onAdDismissed", "", "params", "onAdClicked", "(Ljava/util/Map;)V", "onAdImpressed", "Lcom/inmobi/media/xk;", "telemetryOnAdImpression", "onAdImpression", "(Lcom/inmobi/media/xk;)V", "onUserLeftApplication", "rewards", "onRewardsUnlocked", "onVideoStarted", "onVideoResumed", "onVideoPaused", "onVideoCompleted", "", "isMuted", "onAudioStateChanged", "(Z)V", "", b.REQUEST_KEY_EXTRA, "onRequestPayloadCreated", "([B)V", "reason", "onRequestPayloadCreationFailed", "Lcom/inmobi/media/V1;", "audioStatusInternal", "onAudioStatusChanged", "(Lcom/inmobi/media/V1;)V", "", "log", "onImraidLog", "(Ljava/lang/String;)V", "", "getType", "()B", "type", "Companion", "com/inmobi/media/Zg", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class PublisherCallbacks {
    public static final Zg Companion = new Zg();
    public static final byte NORMAL_FLOW = 0;
    public static final byte PRELOAD_FLOW = 1;

    public abstract byte getType();

    public abstract void onAdClicked(Map<Object, ? extends Object> params);

    public abstract void onAdDismissed();

    public abstract void onAdDisplayed(AdMetaInfo info);

    public abstract void onAdFetchFailed(InMobiAdRequestStatus status);

    public void onAdFetchSuccessful(AdMetaInfo info) {
        s.h(info, "info");
    }

    public abstract void onAdLoadFailed(InMobiAdRequestStatus status);

    public void onAdLoadSucceeded(AdMetaInfo info) {
        s.h(info, "info");
    }

    public void onAudioStatusChanged(V1 audioStatusInternal) {
        s.h(audioStatusInternal, "audioStatusInternal");
    }

    public void onImraidLog(String log) {
        s.h(log, "log");
    }

    public void onRequestPayloadCreated(byte[] request) {
        s.h(request, "request");
    }

    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus reason) {
        s.h(reason, "reason");
    }

    public void onRewardsUnlocked(Map<Object, ? extends Object> rewards) {
        s.h(rewards, "rewards");
    }

    public abstract void onUserLeftApplication();

    public void onAdDisplayFailed() {
    }

    public void onAdImpressed() {
    }

    public void onAdWillDisplay() {
    }

    public void onVideoCompleted() {
    }

    public void onVideoPaused() {
    }

    public void onVideoResumed() {
    }

    public void onVideoStarted() {
    }

    public void onAdImpression(C3437xk telemetryOnAdImpression) {
    }

    public void onAudioStateChanged(boolean isMuted) {
    }
}
