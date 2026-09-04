package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhbk extends zzhay {
    private zzhbj zza;

    zzhbk(zzgwi zzgwiVar, boolean z10, Executor executor, Callable callable) {
        super(zzgwiVar, z10, false);
        this.zza = new zzhbi(this, callable, executor);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    final void zzA(int i10) {
        super.zzA(i10);
        if (i10 == 1) {
            this.zza = null;
        }
    }

    final /* synthetic */ void zzD(zzhbj zzhbjVar) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    protected final void zzi() {
        zzhbj zzhbjVar = this.zza;
        if (zzhbjVar != null) {
            zzhbjVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    final void zzx() {
        zzhbj zzhbjVar = this.zza;
        if (zzhbjVar != null) {
            zzhbjVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    final void zzw(int i10, Object obj) {
    }
}
