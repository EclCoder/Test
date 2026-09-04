package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzag {
    public final Uri zza;
    public final String zzb;
    public final zzad zzc;
    public final zzy zzd;
    public final List zze;
    public final String zzf;
    public final zzgwm zzg;
    public final Object zzh;
    public final long zzi;

    static {
        String str = zzfl.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    /* synthetic */ zzag(Uri uri, String str, zzad zzadVar, zzy zzyVar, List list, String str2, zzgwm zzgwmVar, Object obj, long j10, byte[] bArr) {
        this.zza = uri;
        int i10 = zzas.zza;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzgwmVar;
        int i11 = zzgwm.zzd;
        zzgwj zzgwjVar = new zzgwj();
        if (zzgwmVar.size() > 0) {
            throw null;
        }
        zzgwjVar.zzi();
        this.zzh = null;
        this.zzi = C.TIME_UNSET;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzagVar = (zzag) obj;
        return this.zza.equals(zzagVar.zza) && this.zze.equals(zzagVar.zze) && this.zzg.equals(zzagVar.zzg);
    }

    public final int hashCode() {
        return (int) ((((long) (((((this.zza.hashCode() * 923521) + this.zze.hashCode()) * 961) + this.zzg.hashCode()) * 31)) * 31) + C.TIME_UNSET);
    }
}
