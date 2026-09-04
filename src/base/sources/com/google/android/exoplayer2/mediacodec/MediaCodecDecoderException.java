package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.google.android.exoplayer2.decoder.DecoderException;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class MediaCodecDecoderException extends DecoderException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f17177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17178b;

    public MediaCodecDecoderException(Throwable th2, k kVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoder failed: ");
        sb2.append(kVar == null ? null : kVar.f17293a);
        super(sb2.toString(), th2);
        this.f17177a = kVar;
        this.f17178b = r0.f48425a >= 21 ? a(th2) : null;
    }

    private static String a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }
}
