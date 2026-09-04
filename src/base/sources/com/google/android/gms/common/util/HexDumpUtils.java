package com.google.android.gms.common.util;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class HexDumpUtils {
    public static String dump(byte[] bArr, int i10, int i11, boolean z10) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i10 < 0 || i11 <= 0 || i10 + i11 > length) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder((z10 ? 75 : 57) * ((i11 + 15) / 16));
        int i12 = i11;
        int i13 = 0;
        int i14 = 0;
        while (i12 > 0) {
            if (i13 == 0) {
                if (i11 < 65536) {
                    sb2.append(String.format("%04X:", Integer.valueOf(i10)));
                } else {
                    sb2.append(String.format("%08X:", Integer.valueOf(i10)));
                }
                i14 = i10;
            } else if (i13 == 8) {
                sb2.append(" -");
            }
            sb2.append(String.format(" %02X", Integer.valueOf(bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)));
            i12--;
            i13++;
            if (z10 && (i13 == 16 || i12 == 0)) {
                int i15 = 16 - i13;
                if (i15 > 0) {
                    for (int i16 = 0; i16 < i15; i16++) {
                        sb2.append("   ");
                    }
                }
                if (i15 >= 8) {
                    sb2.append("  ");
                }
                sb2.append("  ");
                for (int i17 = 0; i17 < i13; i17++) {
                    char c10 = (char) bArr[i14 + i17];
                    if (c10 < ' ' || c10 > '~') {
                        c10 = '.';
                    }
                    sb2.append(c10);
                }
            }
            if (i13 == 16 || i12 == 0) {
                sb2.append('\n');
                i13 = 0;
            }
            i10++;
        }
        return sb2.toString();
    }
}
