package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzzl extends zzwy {
    private final zzak zzc;

    private zzzl(zzbf zzbfVar, zzak zzakVar) {
        super(zzbfVar);
        this.zzc = zzakVar;
    }

    public static zzzl zzp(zzbf zzbfVar, zzak zzakVar) {
        return zzbfVar instanceof zzzl ? new zzzl(((zzzl) zzbfVar).zzb, zzakVar) : new zzzl(zzbfVar, zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwy, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i10, zzbe zzbeVar, long j10) {
        this.zzb.zzb(i10, zzbeVar, j10);
        zzak zzakVar = this.zzc;
        zzbeVar.zzd = zzakVar;
        zzag zzagVar = zzakVar.zzb;
        zzbeVar.zzc = null;
        return zzbeVar;
    }
}
