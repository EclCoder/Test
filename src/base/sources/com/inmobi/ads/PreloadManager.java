package com.inmobi.ads;

import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/inmobi/ads/PreloadManager;", "", "Lfl/g0;", "preload", "()V", TrackLoadSettingsAtom.TYPE, "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PreloadManager {
    void load();

    void preload();
}
