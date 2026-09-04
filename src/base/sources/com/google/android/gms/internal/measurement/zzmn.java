package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.g0;
import com.google.common.util.concurrent.x;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzmn implements zzmj {
    private final zzkk zza;

    public zzmn(zzkk zzkkVar) {
        p.o(zzkkVar);
        this.zza = zzkkVar;
    }

    private static ListenableFuture zzf(Task task) {
        return x.c(zzlb.zza(task, null), ApiException.class, zzml.zza, g0.a());
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final ListenableFuture zza(String str, String str2) {
        p.o(str);
        p.o("");
        return zzf(this.zza.zzb(str, "", null).continueWith(g0.a(), new Continuation(this) { // from class: com.google.android.gms.internal.measurement.zzmm
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                zzadu zzaduVarZzbd;
                zzjh zzjhVar = (zzjh) task.getResult();
                zzmf zzmfVarZzh = zzmg.zzh();
                zzmfVarZzh.zza(zzjhVar.zza);
                zzmfVarZzh.zzc(zzjhVar.zzc);
                zzmfVarZzh.zzf(zzjhVar.zzf);
                zzmfVarZzh.zzg(zzjhVar.zzg);
                byte[] bArr = zzjhVar.zzb;
                if (bArr != null) {
                    zzmfVarZzh.zzb(zzacr.zzj(bArr, 0, bArr.length));
                }
                for (zzjf zzjfVar : zzjhVar.zzd) {
                    for (zzjo zzjoVar : zzjfVar.zzb) {
                        int i10 = zzjoVar.zzg;
                        if (i10 == 1) {
                            zzmh zzmhVarZzh = zzmi.zzh();
                            zzmhVarZzh.zza(zzjoVar.zza);
                            zzmhVarZzh.zzb(zzjoVar.zza());
                            zzaduVarZzbd = zzmhVarZzh.zzbd();
                        } else if (i10 == 2) {
                            zzmh zzmhVarZzh2 = zzmi.zzh();
                            zzmhVarZzh2.zza(zzjoVar.zza);
                            zzmhVarZzh2.zzc(zzjoVar.zzb());
                            zzaduVarZzbd = zzmhVarZzh2.zzbd();
                        } else if (i10 == 3) {
                            zzmh zzmhVarZzh3 = zzmi.zzh();
                            zzmhVarZzh3.zza(zzjoVar.zza);
                            zzmhVarZzh3.zzd(zzjoVar.zzc());
                            zzaduVarZzbd = zzmhVarZzh3.zzbd();
                        } else if (i10 == 4) {
                            zzmh zzmhVarZzh4 = zzmi.zzh();
                            zzmhVarZzh4.zza(zzjoVar.zza);
                            zzmhVarZzh4.zze(zzjoVar.zzd());
                            zzaduVarZzbd = zzmhVarZzh4.zzbd();
                        } else {
                            if (i10 != 5) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 24);
                                sb2.append("Unrecognized flag type: ");
                                sb2.append(i10);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            zzmh zzmhVarZzh5 = zzmi.zzh();
                            zzmhVarZzh5.zza(zzjoVar.zza);
                            byte[] bArrZze = zzjoVar.zze();
                            zzacr zzacrVar = zzacr.zza;
                            zzmhVarZzh5.zzf(zzacr.zzj(bArrZze, 0, bArrZze.length));
                            zzaduVarZzbd = zzmhVarZzh5.zzbd();
                        }
                        zzmfVarZzh.zzd((zzmi) zzaduVarZzbd);
                    }
                    String[] strArr = zzjfVar.zzc;
                    if (strArr != null) {
                        for (String str3 : strArr) {
                            zzmfVarZzh.zze(str3);
                        }
                    }
                }
                return (zzmg) zzmfVarZzh.zzbd();
            }
        }));
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final ListenableFuture zzb(String str) {
        p.o(str);
        return zzf(this.zza.zzc(str));
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final ListenableFuture zzc(zzme zzmeVar) {
        return zzf(this.zza.zzd(zzmeVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final ListenableFuture zzd() {
        return zzf(this.zza.zze());
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final ListenableFuture zze(zzpm zzpmVar) {
        return zzf(this.zza.zzf(zzpmVar));
    }
}
