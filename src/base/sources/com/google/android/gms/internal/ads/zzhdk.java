package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhdk implements zzhed {
    private final InputStream zza;

    private zzhdk(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzhed zza(byte[] bArr) {
        return new zzhdk(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public final zzhsz zzb() throws IOException {
        try {
            return zzhsz.zzg(this.zza, zzido.zza());
        } finally {
            this.zza.close();
        }
    }
}
