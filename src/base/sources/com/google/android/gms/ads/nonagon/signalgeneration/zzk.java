package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzdzq;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzk extends QueryInfoGenerationCallback {
    private final zzj zza;
    private final zzdzq zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
    private final Boolean zzf;

    public zzk(zzj zzjVar, boolean z10, int i10, Boolean bool, zzdzq zzdzqVar) {
        this.zza = zzjVar;
        this.zzc = z10;
        this.zzd = i10;
        this.zzf = bool;
        this.zzb = zzdzqVar;
    }

    private static long zza() {
        return com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + ((Long) zzbkv.zzh.zze()).longValue();
    }

    private final long zzb() {
        return com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zze;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        Pair pair6 = new Pair("lat_ms", Long.toString(zzb()));
        int i10 = this.zzd;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i10));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        boolean z10 = this.zzc;
        zzv.zze(this.zzb, null, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z10 ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1"));
        this.zza.zzc(z10, new zzl(null, str, zza(), i10));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        Pair pair5 = new Pair("lat_ms", Long.toString(zzb()));
        int i10 = this.zzd;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i10));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        boolean z10 = this.zzc;
        zzv.zze(this.zzb, null, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z10 ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1"));
        this.zza.zzc(z10, new zzl(queryInfo, "", zza(), i10));
    }
}
