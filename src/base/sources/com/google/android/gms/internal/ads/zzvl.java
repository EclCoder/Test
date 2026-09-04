package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class zzvl extends zzit {
    public final int zza;

    public zzvl(Throwable th2, zzvm zzvmVar) {
        super("Decoder failed: ".concat(String.valueOf(zzvmVar == null ? null : zzvmVar.zza)), th2);
        boolean z10 = th2 instanceof MediaCodec.CodecException;
        if (z10) {
            ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        this.zza = z10 ? ((MediaCodec.CodecException) th2).getErrorCode() : 0;
    }
}
