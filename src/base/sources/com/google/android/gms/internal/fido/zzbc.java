package com.google.android.gms.internal.fido;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbc extends zzbe {
    final char[] zza;

    zzbc(String str, String str2) {
        zzbb zzbbVar = new zzbb("base16()", "0123456789ABCDEF".toCharArray());
        super(zzbbVar, null);
        this.zza = new char[512];
        zzam.zzc(zzbbVar.zzf.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.zza[i10] = zzbbVar.zza(i10 >>> 4);
            this.zza[i10 | 256] = zzbbVar.zza(i10 & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbe, com.google.android.gms.internal.fido.zzbf
    final void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzam.zze(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            appendable.append(this.zza[i13]);
            appendable.append(this.zza[i13 | 256]);
        }
    }
}
