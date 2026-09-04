package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f5507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5509c;

    public MediaCodecDecoderException(Throwable th2, j jVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoder failed: ");
        sb2.append(jVar == null ? null : jVar.f5617a);
        super(sb2.toString(), th2);
        this.f5507a = jVar;
        int i10 = c0.f55769a;
        String strA = i10 >= 21 ? a(th2) : null;
        this.f5508b = strA;
        this.f5509c = i10 >= 23 ? b(th2) : c0.U(strA);
    }

    private static String a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }

    private static int b(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getErrorCode();
        }
        return 0;
    }
}
