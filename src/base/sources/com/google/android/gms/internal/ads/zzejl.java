package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzejl extends zzejm {
    private static final SparseArray zzg;
    private final Context zzb;
    private final zzdbw zzc;
    private final TelephonyManager zzd;
    private final zzejd zze;
    private zzbhv.zzq zzf;

    static {
        SparseArray sparseArray = new SparseArray();
        zzg = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbhv.zzaf.zzd.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbhv.zzaf.zzd zzdVar = zzbhv.zzaf.zzd.CONNECTING;
        sparseArray.put(iOrdinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbhv.zzaf.zzd.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbhv.zzaf.zzd zzdVar2 = zzbhv.zzaf.zzd.DISCONNECTED;
        sparseArray.put(iOrdinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbhv.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    zzejl(Context context, zzdbw zzdbwVar, zzejd zzejdVar, zzeiz zzeizVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzeizVar, zzgVar);
        this.zzb = context;
        this.zzc = zzdbwVar;
        this.zze = zzejdVar;
        this.zzd = (TelephonyManager) context.getSystemService("phone");
    }

    static final /* synthetic */ zzbhv.zzaf.zzd zze(Bundle bundle) {
        return (zzbhv.zzaf.zzd) zzg.get(zzfln.zza(zzfln.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbhv.zzaf.zzd.UNSPECIFIED);
    }

    private static final zzbhv.zzq zzg(boolean z10) {
        return z10 ? zzbhv.zzq.ENUM_TRUE : zzbhv.zzq.ENUM_FALSE;
    }

    public final void zza(boolean z10) {
        zzhbw.zzr(this.zzc.zza(new Bundle()), new zzejk(this, z10), zzcfr.zzh);
    }

    final /* synthetic */ zzbhv.zzab zzb(Bundle bundle) {
        zzbhv.zzab.zzb zzbVar;
        zzbhv.zzab.zza zzaVarZzq = zzbhv.zzab.zzq();
        int i10 = bundle.getInt("cnt", -2);
        int i11 = bundle.getInt("gnt", 0);
        if (i10 == -1) {
            this.zzf = zzbhv.zzq.ENUM_TRUE;
        } else {
            this.zzf = zzbhv.zzq.ENUM_FALSE;
            if (i10 == 0) {
                zzaVarZzq.zzc(zzbhv.zzab.zzc.CELL);
            } else if (i10 != 1) {
                zzaVarZzq.zzc(zzbhv.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzaVarZzq.zzc(zzbhv.zzab.zzc.WIFI);
            }
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbhv.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbhv.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbhv.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbhv.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzaVarZzq.zzg(zzbVar);
        }
        return zzaVarZzq.zzbu();
    }

    final /* synthetic */ byte[] zzc(boolean z10, ArrayList arrayList, zzbhv.zzab zzabVar, zzbhv.zzaf.zzd zzdVar) {
        zzbhv.zzaf.zza.C0299zza c0299zzaZzz = zzbhv.zzaf.zza.zzz();
        c0299zzaZzz.zzv(arrayList);
        Context context = this.zzb;
        c0299zzaZzz.zzJ(zzg(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0));
        c0299zzaZzz.zzN(com.google.android.gms.ads.internal.zzt.zzf().zzf(context, this.zzd));
        zzejd zzejdVar = this.zze;
        c0299zzaZzz.zzk(zzejdVar.zzf());
        c0299zzaZzz.zzo(zzejdVar.zzj());
        c0299zzaZzz.zzR(zzejdVar.zzd());
        c0299zzaZzz.zzZ(zzdVar);
        c0299zzaZzz.zzz(zzabVar);
        c0299zzaZzz.zzV(this.zzf);
        c0299zzaZzz.zzg(zzg(z10));
        c0299zzaZzz.zzad(zzejdVar.zzb());
        c0299zzaZzz.zzc(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        c0299zzaZzz.zzF(zzg(Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0));
        return c0299zzaZzz.zzbu().zzaN();
    }

    final /* synthetic */ zzejd zzd() {
        return this.zze;
    }
}
