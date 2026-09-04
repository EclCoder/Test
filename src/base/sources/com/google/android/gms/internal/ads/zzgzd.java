package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgzd extends zzgzg {
    final char[] zza;

    private zzgzd(zzgzc zzgzcVar) {
        super(zzgzcVar, null);
        this.zza = new char[512];
        zzgtj.zza(zzgzcVar.zzf().length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.zza[i10] = zzgzcVar.zza(i10 >>> 4);
            this.zza[i10 | 256] = zzgzcVar.zza(i10 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzg, com.google.android.gms.internal.ads.zzgzh
    final void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzgtj.zzo(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            char[] cArr = this.zza;
            appendable.append(cArr[i13]);
            appendable.append(cArr[i13 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzg, com.google.android.gms.internal.ads.zzgzh
    final int zzb(byte[] bArr, CharSequence charSequence) throws zzgzf {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 21);
            sb2.append("Invalid input length ");
            sb2.append(length);
            throw new zzgzf(sb2.toString());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            zzgzc zzgzcVar = this.zzb;
            bArr[i11] = (byte) (zzgzcVar.zzc(charSequence.charAt(i10 + 1)) | (zzgzcVar.zzc(charSequence.charAt(i10)) << 4));
            i10 += 2;
            i11++;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final zzgzh zzc(zzgzc zzgzcVar, Character ch2) {
        return new zzgzd(zzgzcVar);
    }

    zzgzd(String str, String str2) {
        this(new zzgzc("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
