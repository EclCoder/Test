package com.google.android.gms.internal.fido;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbd extends zzbe {
    zzbd(String str, String str2, Character ch2) {
        zzbb zzbbVar = new zzbb(str, str2.toCharArray());
        super(zzbbVar, ch2);
        zzam.zzc(zzbbVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzbe, com.google.android.gms.internal.fido.zzbf
    final void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzam.zze(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i15 = ((bArr[i12 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (i14 << 16) | (bArr[i12 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            appendable.append(this.zzb.zza(i15 >>> 18));
            appendable.append(this.zzb.zza((i15 >>> 12) & 63));
            appendable.append(this.zzb.zza((i15 >>> 6) & 63));
            appendable.append(this.zzb.zza(i15 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            zzc(appendable, bArr, i12, i11 - i12);
        }
    }
}
