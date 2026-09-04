package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzhbh extends zzhay {
    private List zza;

    zzhbh(zzgwi zzgwiVar, boolean z10) {
        super(zzgwiVar, z10, true);
        List listZzb = zzgwiVar.isEmpty() ? Collections.EMPTY_LIST : zzgxm.zzb(zzgwiVar.size());
        for (int i10 = 0; i10 < zzgwiVar.size(); i10++) {
            listZzb.add(null);
        }
        this.zza = listZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    final void zzA(int i10) {
        super.zzA(i10);
        this.zza = null;
    }

    abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzhay
    final void zzw(int i10, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i10, new zzhbg(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }
}
