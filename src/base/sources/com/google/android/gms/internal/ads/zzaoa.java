package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaoa {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzaoa(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = i15;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static zzaoa zza(String str) {
        zzgtj.zza(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i10 >= length) {
                if (i12 == -1 || i13 == -1 || i15 == -1) {
                    return null;
                }
                return new zzaoa(i11, i12, i13, i14, i15, length);
            }
            String strZza = zzgss.zza(strArrSplit[i10].trim());
            switch (strZza.hashCode()) {
                case 100571:
                    if (strZza.equals(TtmlNode.END)) {
                        i13 = i10;
                    }
                    break;
                case 3556653:
                    if (strZza.equals("text")) {
                        i15 = i10;
                    }
                    break;
                case 102749521:
                    if (strZza.equals("layer")) {
                        i11 = i10;
                    }
                    break;
                case 109757538:
                    if (strZza.equals("start")) {
                        i12 = i10;
                    }
                    break;
                case 109780401:
                    if (strZza.equals(TtmlNode.TAG_STYLE)) {
                        i14 = i10;
                    }
                    break;
            }
            i10++;
        }
    }
}
