package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzarb implements zzaqt {
    final /* synthetic */ zzard zza;
    private final zzes zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzarb(zzard zzardVar, int i10) {
        Objects.requireNonNull(zzardVar);
        this.zza = zzardVar;
        this.zzb = new zzes(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:23:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:32:0x0102  */
    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzb(zzet zzetVar) {
        int i10;
        if (zzetVar.zzs() != 2) {
            return;
        }
        zzard zzardVar = this.zza;
        zzfi zzfiVar = (zzfi) zzardVar.zzh().get(0);
        if ((zzetVar.zzs() & 128) != 0) {
            zzetVar.zzk(1);
            int iZzt = zzetVar.zzt();
            int i11 = 3;
            zzetVar.zzk(3);
            zzes zzesVar = this.zzb;
            zzetVar.zzl(zzesVar, 2);
            zzesVar.zzh(3);
            int i12 = 13;
            zzardVar.zzq(zzesVar.zzj(13));
            zzetVar.zzl(zzesVar, 2);
            int i13 = 4;
            zzesVar.zzh(4);
            int i14 = 12;
            zzetVar.zzk(zzesVar.zzj(12));
            SparseArray sparseArray = this.zzc;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.zzd;
            sparseIntArray.clear();
            int iZzd = zzetVar.zzd();
            while (iZzd > 0) {
                int i15 = 5;
                zzetVar.zzl(zzesVar, 5);
                int iZzj = zzesVar.zzj(8);
                zzesVar.zzh(i11);
                int iZzj2 = zzesVar.zzj(i12);
                zzesVar.zzh(i13);
                int iZzj3 = zzesVar.zzj(i14);
                int iZzg = zzetVar.zzg();
                int i16 = iZzg + iZzj3;
                String str = null;
                ArrayList arrayList = null;
                int i17 = -1;
                int iZzs = 0;
                while (zzetVar.zzg() < i16) {
                    int iZzs2 = zzetVar.zzs();
                    int iZzg2 = zzetVar.zzg() + zzetVar.zzs();
                    if (iZzg2 > i16) {
                        break;
                    }
                    if (iZzs2 == i15) {
                        long jZzz = zzetVar.zzz();
                        if (jZzz == 1094921523) {
                            zzardVar = zzardVar;
                            i17 = 129;
                        } else if (jZzz == 1161904947) {
                            zzardVar = zzardVar;
                            zzesVar = zzesVar;
                            iZzd = iZzd;
                            i17 = 135;
                            iZzg2 = iZzg2;
                        } else if (jZzz == 1094921524) {
                            zzardVar = zzardVar;
                            i17 = 172;
                        } else if (jZzz == 1212503619) {
                            i10 = 36;
                            i17 = i10;
                        }
                    } else if (iZzs2 == 106) {
                        zzardVar = zzardVar;
                        i17 = 129;
                    } else if (iZzs2 == 122) {
                        zzardVar = zzardVar;
                        zzesVar = zzesVar;
                        iZzd = iZzd;
                        i17 = 135;
                        iZzg2 = iZzg2;
                    } else {
                        if (iZzs2 == 127) {
                            int iZzs3 = zzetVar.zzs();
                            if (iZzs3 == 21) {
                                zzardVar = zzardVar;
                                i17 = 172;
                            } else if (iZzs3 == 14) {
                                i10 = Sdk$SDKError.b.PRIVACY_URL_ERROR_VALUE;
                            } else if (iZzs3 == 33) {
                                i10 = 139;
                            }
                        } else if (iZzs2 == 123) {
                            i10 = 138;
                        } else if (iZzs2 == 10) {
                            String strTrim = zzetVar.zzK(3, StandardCharsets.UTF_8).trim();
                            iZzs = zzetVar.zzs();
                            str = strTrim;
                        } else if (iZzs2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (zzetVar.zzg() < iZzg2) {
                                int i18 = iZzg2;
                                String strTrim2 = zzetVar.zzK(3, StandardCharsets.UTF_8).trim();
                                int iZzs4 = zzetVar.zzs();
                                int i19 = iZzd;
                                byte[] bArr = new byte[4];
                                zzetVar.zzm(bArr, 0, 4);
                                arrayList2.add(new zzare(strTrim2, iZzs4, bArr));
                                iZzd = i19;
                                iZzg2 = i18;
                                zzesVar = zzesVar;
                                zzardVar = zzardVar;
                            }
                            zzardVar = zzardVar;
                            iZzg2 = iZzg2;
                            zzesVar = zzesVar;
                            iZzd = iZzd;
                            arrayList = arrayList2;
                            i17 = 89;
                        } else {
                            zzardVar = zzardVar;
                            iZzg2 = iZzg2;
                            zzesVar = zzesVar;
                            iZzd = iZzd;
                            if (iZzs2 == 111) {
                                i17 = 257;
                            }
                        }
                        i17 = i10;
                    }
                    zzetVar.zzk(iZzg2 - zzetVar.zzg());
                    iZzd = iZzd;
                    zzesVar = zzesVar;
                    zzardVar = zzardVar;
                    i15 = 5;
                }
                zzard zzardVar2 = zzardVar;
                zzes zzesVar2 = zzesVar;
                int i20 = iZzd;
                zzetVar.zzh(i16);
                zzarf zzarfVar = new zzarf(i17, str, iZzs, arrayList, Arrays.copyOfRange(zzetVar.zzi(), iZzg, i16));
                if (iZzj == 6 || iZzj == 5) {
                    iZzj = zzarfVar.zza;
                }
                iZzd = i20 - (iZzj3 + 5);
                if (!zzardVar2.zzk().get(iZzj2)) {
                    zzari zzariVarZzb = zzardVar2.zzi().zzb(iZzj, zzarfVar);
                    sparseIntArray.put(iZzj2, iZzj2);
                    sparseArray.put(iZzj2, zzariVarZzb);
                }
                i13 = 4;
                zzesVar = zzesVar2;
                zzardVar = zzardVar2;
                i11 = 3;
                i12 = 13;
                i14 = 12;
            }
            zzard zzardVar3 = zzardVar;
            int size = sparseIntArray.size();
            for (int i21 = 0; i21 < size; i21++) {
                int iKeyAt = sparseIntArray.keyAt(i21);
                int iValueAt = sparseIntArray.valueAt(i21);
                zzardVar3.zzk().put(iKeyAt, true);
                zzardVar3.zzl().put(iValueAt, true);
                zzari zzariVar = (zzari) sparseArray.valueAt(i21);
                if (zzariVar != null) {
                    zzariVar.zza(zzfiVar, zzardVar3.zzm(), new zzarh(iZzt, iKeyAt, 8192));
                    zzardVar3.zzj().put(iValueAt, zzariVar);
                }
            }
            zzardVar3.zzj().remove(this.zze);
            zzardVar3.zzo(0);
            if (zzardVar3.zzn() == 0) {
                zzardVar3.zzm().zzv();
                zzardVar3.zzp(true);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zza(zzfi zzfiVar, zzagb zzagbVar, zzarh zzarhVar) {
    }
}
