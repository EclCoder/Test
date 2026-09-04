package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzvp extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzvm zzc;
    public final String zzd;

    public zzvp(zzv zzvVar, Throwable th2, boolean z10, int i10) {
        String string = zzvVar.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 25 + string.length());
        sb2.append("Decoder init failed: [");
        sb2.append(i10);
        sb2.append("], ");
        sb2.append(string);
        String string2 = sb2.toString();
        String str = zzvVar.zzp;
        int iAbs = Math.abs(i10);
        StringBuilder sb3 = new StringBuilder(String.valueOf(iAbs).length() + 60);
        sb3.append(giNWGaNAgVQoO.XTXl);
        sb3.append(iAbs);
        this(string2, th2, str, false, null, sb3.toString(), null);
    }

    final /* synthetic */ zzvp zza(zzvp zzvpVar) {
        return new zzvp(getMessage(), getCause(), this.zza, false, this.zzc, this.zzd, zzvpVar);
    }

    public zzvp(zzv zzvVar, Throwable th2, boolean z10, zzvm zzvmVar) {
        String str = zzvmVar.zza;
        int length = str.length();
        String string = zzvVar.toString();
        StringBuilder sb2 = new StringBuilder(length + 23 + string.length());
        sb2.append("Decoder init failed: ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(string);
        this(sb2.toString(), th2, zzvVar.zzp, false, zzvmVar, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, null);
    }

    private zzvp(String str, Throwable th2, String str2, boolean z10, zzvm zzvmVar, String str3, zzvp zzvpVar) {
        super(str, th2);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzvmVar;
        this.zzd = str3;
    }
}
