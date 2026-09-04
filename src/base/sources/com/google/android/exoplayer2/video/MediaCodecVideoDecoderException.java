package com.google.android.exoplayer2.video;

import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18930d;

    public MediaCodecVideoDecoderException(Throwable th2, k kVar, Surface surface) {
        super(th2, kVar);
        this.f18929c = System.identityHashCode(surface);
        this.f18930d = surface == null || surface.isValid();
    }
}
