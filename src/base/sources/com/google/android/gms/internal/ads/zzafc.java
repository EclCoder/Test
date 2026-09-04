package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzafc {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzafc(List list, int i10, int i11, int i12, int i13) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a4 A[Catch: ArrayIndexOutOfBoundsException -> 0x01e6, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01e6, blocks: (B:3:0x0004, B:14:0x003f, B:16:0x004a, B:18:0x005a, B:21:0x0066, B:23:0x0092, B:25:0x0098, B:27:0x00ad, B:29:0x00b6, B:31:0x00be, B:33:0x00d3, B:35:0x00e0, B:37:0x00f5, B:39:0x00fb, B:41:0x0110, B:43:0x0116, B:45:0x012b, B:48:0x0134, B:50:0x013d, B:51:0x0140, B:52:0x0145, B:54:0x015b, B:55:0x015e, B:57:0x0167, B:58:0x016a, B:63:0x0177, B:65:0x017d, B:67:0x0182, B:68:0x0185, B:71:0x0190, B:74:0x0197, B:77:0x019e, B:79:0x01a4, B:89:0x01c3, B:93:0x01cb, B:95:0x01dc, B:88:0x01bf, B:61:0x0171), top: B:100:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x002e  */
    /* JADX WARN: Code duplicated, block: B:87:0x01be A[PHI: r1
      0x01be: PHI (r1v7 int) = (r1v6 int), (r1v6 int), (r1v11 int) binds: [B:80:0x01b0, B:81:0x01b2, B:86:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d6  */
    public static zzafc zza(byte[] bArr) throws zzat {
        int i10;
        int i11;
        int i12;
        int iZzc;
        int iZzj;
        int iZzj2;
        try {
            zzes zzesVar = new zzes(bArr, bArr.length);
            int i13 = 1;
            zzesVar.zzo(1);
            int iZzj3 = zzesVar.zzj(3);
            zzesVar.zzh(6);
            boolean zZzi = zzesVar.zzi();
            boolean zZzi2 = zzesVar.zzi();
            int i14 = 12;
            boolean z10 = false;
            if (iZzj3 != 2) {
                if (iZzj3 <= 2) {
                    i10 = -1;
                } else if (true != zZzi) {
                    i10 = 8;
                } else {
                    i10 = 10;
                }
            } else if (!zZzi) {
                zZzi = false;
                iZzj3 = 2;
                if (iZzj3 <= 2) {
                    i10 = -1;
                } else if (true != zZzi) {
                    i10 = 8;
                } else {
                    i10 = 10;
                }
            } else if (true != zZzi2) {
                i10 = 10;
            } else {
                i10 = 12;
            }
            int i15 = 13;
            zzesVar.zzh(13);
            if (zzesVar.zzc() <= 0) {
                return new zzafc(zzgwm.zzj(bArr), i10, -1, -1, -1);
            }
            zzesVar.zzg();
            int iZzj4 = zzesVar.zzj(4);
            if (iZzj4 != 1) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj4).length() + 22);
                sb2.append("Unsupported obu_type: ");
                sb2.append(iZzj4);
                zzeg.zzb("Av1Config", sb2.toString());
                return new zzafc(zzgwm.zzj(bArr), i10, -1, -1, -1);
            }
            if (zzesVar.zzi()) {
                zzeg.zzb("Av1Config", "Unsupported obu_extension_flag");
                return new zzafc(zzgwm.zzj(bArr), i10, -1, -1, -1);
            }
            boolean zZzi3 = zzesVar.zzi();
            zzesVar.zzg();
            if (zZzi3 && zzesVar.zzj(8) > 127) {
                zzeg.zzb("Av1Config", "Excessive obu_size");
                return new zzafc(zzgwm.zzj(bArr), i10, -1, -1, -1);
            }
            int iZzj5 = zzesVar.zzj(3);
            zzesVar.zzg();
            if (zzesVar.zzi()) {
                zzeg.zzb("Av1Config", "Unsupported reduced_still_picture_header");
                return new zzafc(zzgwm.zzj(bArr), i10, -1, -1, -1);
            }
            if (zzesVar.zzi()) {
                zzeg.zzb("Av1Config", "Unsupported timing_info_present_flag");
                return new zzafc(zzgwm.zzj(bArr), i10, -1, -1, -1);
            }
            if (zzesVar.zzi()) {
                zzeg.zzb("Av1Config", "Unsupported initial_display_delay_present_flag");
                return new zzafc(zzgwm.zzj(bArr), i10, -1, -1, -1);
            }
            int iZzj6 = zzesVar.zzj(5);
            int i16 = 0;
            while (i16 <= iZzj6) {
                zzesVar.zzh(i14);
                if (zzesVar.zzj(5) > 7) {
                    zzesVar.zzg();
                }
                i16++;
                i14 = 12;
            }
            int iZzj7 = zzesVar.zzj(4);
            int iZzj8 = zzesVar.zzj(4);
            zzesVar.zzh(iZzj7 + 1);
            zzesVar.zzh(iZzj8 + 1);
            if (zzesVar.zzi()) {
                zzesVar.zzh(7);
            }
            zzesVar.zzh(7);
            boolean zZzi4 = zzesVar.zzi();
            if (zZzi4) {
                zzesVar.zzh(2);
            }
            if (zzesVar.zzi() || zzesVar.zzj(1) > 0) {
                if (!zzesVar.zzi()) {
                    zzesVar.zzh(1);
                }
            }
            if (zZzi4) {
                zzesVar.zzh(3);
            }
            zzesVar.zzh(3);
            boolean zZzi5 = zzesVar.zzi();
            if (iZzj5 != 2) {
                if (iZzj5 == 1) {
                }
                if (zzesVar.zzi()) {
                    int iZzj9 = zzesVar.zzj(8);
                    iZzj = zzesVar.zzj(8);
                    int iZzj10 = zzesVar.zzj(8);
                    if (!z10 || iZzj9 != 1) {
                        i15 = iZzj;
                        iZzj2 = zzesVar.zzj(1);
                    } else if (iZzj != 13) {
                        iZzj9 = 1;
                        i15 = iZzj;
                        iZzj2 = zzesVar.zzj(1);
                    } else if (iZzj10 == 0) {
                        iZzj9 = 1;
                        iZzj2 = 1;
                    } else {
                        iZzj9 = 1;
                        iZzj2 = zzesVar.zzj(1);
                    }
                    int iZzb = zzi.zzb(iZzj9);
                    if (iZzj2 == 1) {
                        i13 = 2;
                    }
                    iZzc = zzi.zzc(i15);
                    i12 = i13;
                    i11 = iZzb;
                } else {
                    i11 = -1;
                    i12 = -1;
                    iZzc = -1;
                }
                return new zzafc(zzgwm.zzj(bArr), i10, i11, i12, iZzc);
            }
            if (zZzi5) {
                zzesVar.zzg();
            }
            if (zzesVar.zzi()) {
                z10 = true;
            }
            if (zzesVar.zzi()) {
                int iZzj11 = zzesVar.zzj(8);
                iZzj = zzesVar.zzj(8);
                int iZzj12 = zzesVar.zzj(8);
                if (!z10) {
                    i15 = iZzj;
                    iZzj2 = zzesVar.zzj(1);
                } else {
                    i15 = iZzj;
                    iZzj2 = zzesVar.zzj(1);
                }
                int iZzb2 = zzi.zzb(iZzj11);
                if (iZzj2 == 1) {
                    i13 = 2;
                }
                iZzc = zzi.zzc(i15);
                i12 = i13;
                i11 = iZzb2;
            } else {
                i11 = -1;
                i12 = -1;
                iZzc = -1;
            }
            return new zzafc(zzgwm.zzj(bArr), i10, i11, i12, iZzc);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzat.zzb("Error parsing AV1 config", e10);
        }
    }
}
