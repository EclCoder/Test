package com.inmobi.ads.listeners;

import com.inmobi.ads.InMobiNative;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\bJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/inmobi/ads/listeners/VideoEventListener;", "", "<init>", "()V", "Lcom/inmobi/ads/InMobiNative;", "ad", "Lfl/g0;", "onVideoStarted", "(Lcom/inmobi/ads/InMobiNative;)V", "onVideoResumed", "onVideoPaused", "onVideoCompleted", "onVideoSkipped", "inMobiNative", "", "isMuted", "onAudioStateChanged", "(Lcom/inmobi/ads/InMobiNative;Z)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class VideoEventListener {
    public void onAudioStateChanged(InMobiNative inMobiNative, boolean isMuted) {
        s.h(inMobiNative, "inMobiNative");
    }

    public void onVideoCompleted(InMobiNative ad2) {
        s.h(ad2, "ad");
    }

    public void onVideoPaused(InMobiNative ad2) {
        s.h(ad2, "ad");
    }

    public void onVideoResumed(InMobiNative ad2) {
        s.h(ad2, "ad");
    }

    public void onVideoSkipped(InMobiNative ad2) {
        s.h(ad2, "ad");
    }

    public void onVideoStarted(InMobiNative ad2) {
        s.h(ad2, "ad");
    }
}
