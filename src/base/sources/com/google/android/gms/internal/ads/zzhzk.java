package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhzk {
    private static final Charset zza = Charset.forName(C.UTF8_NAME);

    public static byte[] zza(String str, int i10) {
        byte[] bytes = str.getBytes(zza);
        int length = bytes.length;
        zzhzj zzhzjVar = new zzhzj(2, new byte[(length * 3) / 4]);
        if (!zzhzjVar.zza(bytes, 0, length, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i11 = zzhzjVar.zzb;
        byte[] bArr = zzhzjVar.zza;
        if (i11 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return bArr2;
    }
}
