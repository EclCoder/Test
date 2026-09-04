package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzamj {
    public final boolean zza;
    public final String zzb;
    public final zzahj zzc;
    public final int zzd;
    public final byte[] zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public zzamj(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        int i13 = 1;
        zzgtj.zza((bArr2 == null) ^ (i10 == 0));
        this.zza = z10;
        this.zzb = str;
        this.zzd = i10;
        this.zze = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals(C.CENC_TYPE_cbc1)) {
                        StringBuilder sb2 = new StringBuilder(str.length() + 68);
                        sb2.append("Unsupported protection scheme type '");
                        sb2.append(str);
                        sb2.append("'. Assuming AES-CTR crypto mode.");
                        zzeg.zzc("TrackEncryptionBox", sb2.toString());
                    } else {
                        i13 = 2;
                    }
                    break;
                case 3046671:
                    if (!str.equals(C.CENC_TYPE_cbcs)) {
                        StringBuilder sb3 = new StringBuilder(str.length() + 68);
                        sb3.append("Unsupported protection scheme type '");
                        sb3.append(str);
                        sb3.append("'. Assuming AES-CTR crypto mode.");
                        zzeg.zzc("TrackEncryptionBox", sb3.toString());
                    } else {
                        i13 = 2;
                    }
                    break;
                case 3049879:
                    if (!str.equals(C.CENC_TYPE_cenc)) {
                        StringBuilder sb4 = new StringBuilder(str.length() + 68);
                        sb4.append("Unsupported protection scheme type '");
                        sb4.append(str);
                        sb4.append("'. Assuming AES-CTR crypto mode.");
                        zzeg.zzc("TrackEncryptionBox", sb4.toString());
                    }
                    break;
                case 3049895:
                    if (!str.equals(C.CENC_TYPE_cens)) {
                        StringBuilder sb5 = new StringBuilder(str.length() + 68);
                        sb5.append("Unsupported protection scheme type '");
                        sb5.append(str);
                        sb5.append("'. Assuming AES-CTR crypto mode.");
                        zzeg.zzc("TrackEncryptionBox", sb5.toString());
                    }
                    break;
                default:
                    StringBuilder sb6 = new StringBuilder(str.length() + 68);
                    sb6.append("Unsupported protection scheme type '");
                    sb6.append(str);
                    sb6.append("'. Assuming AES-CTR crypto mode.");
                    zzeg.zzc("TrackEncryptionBox", sb6.toString());
                    break;
            }
        }
        this.zzc = new zzahj(i13, bArr, i11, i12);
    }
}
