package com.google.android.gms.internal.ads;

import com.coremedia.iso.boxes.MovieBox;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class zzimc extends zzimf implements zzaup {
    protected final String zza = MovieBox.TYPE;

    public zzimc(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzb(zzimg zzimgVar, ByteBuffer byteBuffer, long j10, zzaum zzaumVar) {
        zzimgVar.zzc();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzimgVar;
        this.zze = zzimgVar.zzc();
        zzimgVar.zzd(zzimgVar.zzc() + j10);
        this.zzf = zzimgVar.zzc();
        this.zzb = zzaumVar;
    }
}
