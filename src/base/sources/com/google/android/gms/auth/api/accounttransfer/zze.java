package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.internal.auth.zzau;
import com.google.android.gms.internal.auth.zzax;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zze extends zzl {
    final /* synthetic */ zzax zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zze(AccountTransferClient accountTransferClient, int i10, zzax zzaxVar) {
        super(1607, null);
        this.zza = zzaxVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.zzl
    protected final void zza(zzau zzauVar) {
        zzauVar.zzg(new zzd(this, this), this.zza);
    }
}
