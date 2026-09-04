package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzata;
import com.google.android.gms.internal.ads.zzate;
import com.google.android.gms.internal.ads.zzatk;
import com.google.android.gms.internal.ads.zzaub;
import com.google.android.gms.internal.ads.zzcfw;
import com.google.api.client.http.HttpMethods;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbk extends zzate {
    private final zzcfw zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbk(String str, Map map, zzcfw zzcfwVar) {
        super(0, str, new zzbj(zzcfwVar));
        this.zza = zzcfwVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzb(str, HttpMethods.GET, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzate
    protected final zzatk zzr(zzata zzataVar) {
        return zzatk.zza(zzataVar, zzaub.zza(zzataVar));
    }

    @Override // com.google.android.gms.internal.ads.zzate
    protected final /* bridge */ /* synthetic */ void zzs(Object obj) {
        zzata zzataVar = (zzata) obj;
        Map map = zzataVar.zzc;
        int i10 = zzataVar.zza;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.zzb;
        zzlVar.zzd(map, i10);
        byte[] bArr = zzataVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj() && bArr != null) {
            zzlVar.zzf(bArr);
        }
        this.zza.zzc(zzataVar);
    }
}
