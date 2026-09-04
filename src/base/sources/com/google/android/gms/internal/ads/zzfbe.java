package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfbe implements zzfck {
    private final Context zza;
    private final zzhcg zzb;
    private final zzfky zzc;
    private final VersionInfoParcel zzd;

    zzfbe(Context context, zzhcg zzhcgVar, zzfky zzfkyVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzhcgVar;
        this.zzc = zzfkyVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 53;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0058 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00c1 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00d3 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00f1 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    final /* synthetic */ zzfbf zzc() {
        zzgcg zzgcgVar;
        boolean z10;
        boolean zZze;
        zzgcl zzgclVarZzh;
        zzgch zzgchVarZza;
        try {
            Context context = this.zza;
            boolean zZza = this.zzc.zza();
            zzgcg zzgcgVar2 = new zzgcg();
            zzgcg zzgcgVar3 = new zzgcg();
            boolean zZzc = true;
            if (zZza) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzea)).booleanValue()) {
                    return new zzfbf(true);
                }
            }
            if (!zZza) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdW)).booleanValue()) {
                    zzgcgVar2 = zzgck.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzeh)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                } else if (zZza) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdY)).booleanValue()) {
                        zzgcgVar2 = zzgck.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzeh)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                    }
                }
            } else if (zZza) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdY)).booleanValue()) {
                    zzgcgVar2 = zzgck.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzeh)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzee)).booleanValue()) {
                if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzed)).intValue()) {
                    zzgcl.zzh(context).zzj();
                }
            }
            if (zZza) {
                if (zZza) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdZ)).booleanValue()) {
                        zzgclVarZzh = zzgcl.zzh(context);
                        zzgchVarZza = zzgch.zza(context);
                        if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzed)).intValue()) {
                            zzgcgVar3 = zzgclVarZzh.zzi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzei)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                            zZzc = zzgchVarZza.zzc();
                        }
                        zZze = zzgchVarZza.zze();
                        zzgcgVar = zzgcgVar3;
                        z10 = zZzc;
                    }
                }
                zzgcgVar = zzgcgVar3;
                z10 = true;
                zZze = true;
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdX)).booleanValue()) {
                    zzgclVarZzh = zzgcl.zzh(context);
                    zzgchVarZza = zzgch.zza(context);
                    if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzed)).intValue()) {
                        zzgcgVar3 = zzgclVarZzh.zzi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzei)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                        zZzc = zzgchVarZza.zzc();
                    }
                    zZze = zzgchVarZza.zze();
                    zzgcgVar = zzgcgVar3;
                    z10 = zZzc;
                } else {
                    if (zZza) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdZ)).booleanValue()) {
                            zzgclVarZzh = zzgcl.zzh(context);
                            zzgchVarZza = zzgch.zza(context);
                            if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzed)).intValue()) {
                                zzgcgVar3 = zzgclVarZzh.zzi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzei)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                                zZzc = zzgchVarZza.zzc();
                            }
                            zZze = zzgchVarZza.zze();
                            zzgcgVar = zzgcgVar3;
                            z10 = zZzc;
                        }
                    }
                    zzgcgVar = zzgcgVar3;
                    z10 = true;
                    zZze = true;
                }
            }
            return new zzfbf(zzgcgVar2, zzgcgVar, z10, zZze, zZza);
        } catch (IOException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "PerAppIdSignal");
            return new zzfbf(this.zzc.zza());
        }
    }
}
