package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgev implements zzgfa {
    private final byte[] zza;

    public zzgev(byte[] bArr) {
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final /* synthetic */ void zza(Object obj, OutputStream outputStream) throws IOException {
        outputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        try {
            return zzgzm.zza(inputStream);
        } catch (IOException e10) {
            throw new zzgew("Cannot read bytes.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final /* synthetic */ Object zzc() {
        return this.zza;
    }
}
