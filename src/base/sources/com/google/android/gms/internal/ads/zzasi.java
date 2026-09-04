package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzasi extends zzasj {
    private final byte[] zza;

    public zzasi(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzasj, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.zza;
    }
}
