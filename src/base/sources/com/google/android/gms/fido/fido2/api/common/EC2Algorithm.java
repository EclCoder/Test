package com.google.android.gms.fido.fido2.api.common;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum EC2Algorithm implements Algorithm {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ES384(-35),
    ES512(-36);

    private final int zzb;

    EC2Algorithm(int i10) {
        this.zzb = i10;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.Algorithm
    public int getAlgoValue() {
        return this.zzb;
    }
}
