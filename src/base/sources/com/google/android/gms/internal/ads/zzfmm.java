package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfmm {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzfnl zzd = new zzfnl();

    public zzfmm(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
    }

    private final void zzi() {
        while (true) {
            LinkedList linkedList = this.zza;
            if (linkedList.isEmpty()) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((zzfmw) linkedList.getFirst()).zzd < this.zzc) {
                return;
            }
            this.zzd.zzc();
            linkedList.remove();
        }
    }

    public final boolean zza(zzfmw zzfmwVar) {
        this.zzd.zza();
        zzi();
        LinkedList linkedList = this.zza;
        if (linkedList.size() == this.zzb) {
            return false;
        }
        linkedList.add(zzfmwVar);
        return true;
    }

    public final zzfmw zzb() {
        zzfnl zzfnlVar = this.zzd;
        zzfnlVar.zza();
        zzi();
        LinkedList linkedList = this.zza;
        if (linkedList.isEmpty()) {
            return null;
        }
        zzfmw zzfmwVar = (zzfmw) linkedList.remove();
        if (zzfmwVar != null) {
            zzfnlVar.zzb();
        }
        return zzfmwVar;
    }

    public final int zzc() {
        zzi();
        return this.zza.size();
    }

    public final long zzd() {
        return this.zzd.zzd();
    }

    public final long zze() {
        return this.zzd.zze();
    }

    public final int zzf() {
        return this.zzd.zzf();
    }

    public final String zzg() {
        return this.zzd.zzh();
    }

    public final zzfnk zzh() {
        return this.zzd.zzg();
    }
}
