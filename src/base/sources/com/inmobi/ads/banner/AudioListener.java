package com.inmobi.ads.banner;

import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiBanner;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/inmobi/ads/banner/AudioListener;", "", "Lcom/inmobi/ads/InMobiBanner;", "banner", "Lcom/inmobi/ads/AudioStatus;", "audioStatus", "Lfl/g0;", "onAudioStatusChanged", "(Lcom/inmobi/ads/InMobiBanner;Lcom/inmobi/ads/AudioStatus;)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AudioListener {
    void onAudioStatusChanged(InMobiBanner banner, AudioStatus audioStatus);
}
