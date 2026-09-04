package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6121e;

    public MediaCodecVideoDecoderException(Throwable th2, j jVar, Surface surface) {
        super(th2, jVar);
        this.f6120d = System.identityHashCode(surface);
        this.f6121e = surface == null || surface.isValid();
    }
}
