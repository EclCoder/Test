package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zaaq extends zabg {
    final /* synthetic */ zaaw zaa;
    final /* synthetic */ com.google.android.gms.signin.internal.zak zab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zaaq(zaar zaarVar, zabf zabfVar, zaaw zaawVar, com.google.android.gms.signin.internal.zak zakVar) {
        super(zabfVar);
        this.zaa = zaawVar;
        this.zab = zakVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabg
    public final void zaa() {
        zaaw.zar(this.zaa, this.zab);
    }
}
