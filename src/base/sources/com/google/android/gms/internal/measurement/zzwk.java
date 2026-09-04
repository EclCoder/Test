package com.google.android.gms.internal.measurement;

import androidx.collection.u;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzwk extends zzwl {
    static final zzwl zza;
    static final zzwl zzb;

    static {
        zzwl zzwlVarZzb = new zzwk(null, new u(0)).zzb();
        zza = zzwlVarZzb;
        zzwk zzwkVar = new zzwk(zzwlVarZzb, new u(), null);
        boolean z10 = !zzwkVar.zzh();
        Boolean bool = Boolean.TRUE;
        p.w(z10, "Can't mutate after handing to trace");
        p.o(bool);
        zzwj zzwjVar = zzwl.zza;
        p.w(!zzwkVar.zzd(zzwjVar), "Key already present");
        zzwkVar.zzg().put(zzwjVar, bool);
        zzb = zzwkVar.zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private zzwk(zzwl zzwlVar, u uVar) {
        super(null, uVar, 0 == true ? 1 : 0);
    }

    /* synthetic */ zzwk(zzwl zzwlVar, u uVar, byte[] bArr) {
        super(zzwlVar, uVar, null);
    }
}
