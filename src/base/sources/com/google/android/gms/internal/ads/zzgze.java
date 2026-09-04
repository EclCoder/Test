package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgze extends zzgzg {
    private zzgze(zzgzc zzgzcVar, Character ch2) {
        super(zzgzcVar, ch2);
        zzgtj.zza(zzgzcVar.zzf().length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg, com.google.android.gms.internal.ads.zzgzh
    final void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzgtj.zzo(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i15 = bArr[i12 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i16 = bArr[i12 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            zzgzc zzgzcVar = this.zzb;
            int i17 = (i15 << 8) | (i14 << 16) | i16;
            appendable.append(zzgzcVar.zza(i17 >>> 18));
            appendable.append(zzgzcVar.zza((i17 >>> 12) & 63));
            appendable.append(zzgzcVar.zza((i17 >>> 6) & 63));
            appendable.append(zzgzcVar.zza(i17 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            zze(appendable, bArr, i12, i11 - i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzg, com.google.android.gms.internal.ads.zzgzh
    final int zzb(byte[] bArr, CharSequence charSequence) throws zzgzf {
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgzc zzgzcVar = this.zzb;
        if (!zzgzcVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(length2).length() + 21);
            sb2.append("Invalid input length ");
            sb2.append(length2);
            throw new zzgzf(sb2.toString());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequenceZzg.length()) {
            int i12 = i11 + 1;
            int iZzc = (zzgzcVar.zzc(charSequenceZzg.charAt(i10 + 1)) << 12) | (zzgzcVar.zzc(charSequenceZzg.charAt(i10)) << 18);
            bArr[i11] = (byte) (iZzc >>> 16);
            int i13 = i10 + 2;
            if (i13 < charSequenceZzg.length()) {
                int i14 = i10 + 3;
                int iZzc2 = iZzc | (zzgzcVar.zzc(charSequenceZzg.charAt(i13)) << 6);
                int i15 = i11 + 2;
                bArr[i12] = (byte) ((iZzc2 >>> 8) & 255);
                if (i14 < charSequenceZzg.length()) {
                    i10 += 4;
                    i11 += 3;
                    bArr[i15] = (byte) ((iZzc2 | zzgzcVar.zzc(charSequenceZzg.charAt(i14))) & 255);
                } else {
                    i11 = i15;
                    i10 = i14;
                }
            } else {
                i10 = i13;
                i11 = i12;
            }
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final zzgzh zzc(zzgzc zzgzcVar, Character ch2) {
        return new zzgze(zzgzcVar, ch2);
    }

    zzgze(String str, String str2, Character ch2) {
        this(new zzgzc(str, str2.toCharArray()), ch2);
    }
}
