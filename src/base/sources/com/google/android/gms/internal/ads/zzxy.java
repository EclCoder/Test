package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzxy implements zzxi, zzxh {
    private final zzxi[] zza;
    private final boolean[] zzb;
    private zzxh zzf;
    private zzzn zzg;
    private final ArrayList zzd = new ArrayList();
    private final HashMap zze = new HashMap();
    private zzze zzi = new zzwu(zzgwm.zzi(), zzgwm.zzi());
    private final IdentityHashMap zzc = new IdentityHashMap();
    private zzxi[] zzh = new zzxi[0];

    public zzxy(zzwv zzwvVar, long[] jArr, zzxi... zzxiVarArr) {
        this.zza = zzxiVarArr;
        this.zzb = new boolean[zzxiVarArr.length];
        for (int i10 = 0; i10 < zzxiVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.zzb[i10] = true;
                this.zza[i10] = new zzzk(zzxiVarArr[i10], j10);
            }
        }
    }

    public final zzxi zza(int i10) {
        return this.zzb[i10] ? ((zzzk) this.zza[i10]).zza() : this.zza[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzb(zzxh zzxhVar, long j10) {
        this.zzf = zzxhVar;
        ArrayList arrayList = this.zzd;
        zzxi[] zzxiVarArr = this.zza;
        Collections.addAll(arrayList, zzxiVarArr);
        for (zzxi zzxiVar : zzxiVarArr) {
            zzxiVar.zzb(this, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzc() {
        int i10 = 0;
        while (true) {
            zzxi[] zzxiVarArr = this.zza;
            if (i10 >= zzxiVarArr.length) {
                return;
            }
            zzxiVarArr[i10].zzc();
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final zzzn zzd() {
        zzzn zzznVar = this.zzg;
        zzznVar.getClass();
        return zzznVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zze(zzaba[] zzabaVarArr, boolean[] zArr, zzzc[] zzzcVarArr, boolean[] zArr2, long j10) {
        int length;
        int length2 = zzabaVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = zzabaVarArr.length;
            if (i11 >= length) {
                break;
            }
            zzzc zzzcVar = zzzcVarArr[i11];
            Integer num = zzzcVar == null ? null : (Integer) this.zzc.get(zzzcVar);
            iArr[i11] = num == null ? -1 : num.intValue();
            zzaba zzabaVar = zzabaVarArr[i11];
            if (zzabaVar != null) {
                String str = zzabaVar.zza().zzb;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        IdentityHashMap identityHashMap = this.zzc;
        identityHashMap.clear();
        zzxi[] zzxiVarArr = this.zza;
        zzzc[] zzzcVarArr2 = new zzzc[length];
        zzzc[] zzzcVarArr3 = new zzzc[length];
        zzaba[] zzabaVarArr2 = new zzaba[length];
        ArrayList arrayList = new ArrayList(zzxiVarArr.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < zzxiVarArr.length) {
            int i13 = i10;
            while (i13 < zzabaVarArr.length) {
                zzzcVarArr3[i13] = iArr[i13] == i12 ? zzzcVarArr[i13] : null;
                if (iArr2[i13] == i12) {
                    zzaba zzabaVar2 = zzabaVarArr[i13];
                    zzabaVar2.getClass();
                    zzbg zzbgVar = (zzbg) this.zze.get(zzabaVar2.zza());
                    zzbgVar.getClass();
                    zzabaVarArr2[i13] = new zzxx(zzabaVar2, zzbgVar);
                } else {
                    zzabaVarArr2[i13] = null;
                }
                i13++;
                iArr2 = iArr2;
            }
            int[] iArr3 = iArr2;
            ArrayList arrayList2 = arrayList;
            int i14 = i12;
            long jZze = zzxiVarArr[i12].zze(zzabaVarArr2, zArr, zzzcVarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jZze;
            } else if (jZze != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < zzabaVarArr.length; i15++) {
                if (iArr3[i15] == i14) {
                    zzzc zzzcVar2 = zzzcVarArr3[i15];
                    zzzcVar2.getClass();
                    zzzcVarArr2[i15] = zzzcVar2;
                    identityHashMap.put(zzzcVar2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    zzgtj.zzi(zzzcVarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(zzxiVarArr[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            iArr2 = iArr3;
            i10 = 0;
        }
        int i16 = i10;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzzcVarArr2, i16, zzzcVarArr, i16, length);
        this.zzh = (zzxi[]) arrayList3.toArray(new zzxi[i16]);
        this.zzi = new zzwu(arrayList3, zzgxm.zzc(arrayList3, zzxw.zza));
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzf(long j10, boolean z10) {
        for (zzxi zzxiVar : this.zzh) {
            zzxiVar.zzf(j10, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final void zzg(long j10) {
        this.zzi.zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzh() {
        long j10 = -9223372036854775807L;
        for (zzxi zzxiVar : this.zzh) {
            long jZzh = zzxiVar.zzh();
            if (jZzh == C.TIME_UNSET) {
                if (j10 != C.TIME_UNSET && zzxiVar.zzj(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == C.TIME_UNSET) {
                for (zzxi zzxiVar2 : this.zzh) {
                    if (zzxiVar2 == zzxiVar) {
                        break;
                    }
                    if (zzxiVar2.zzj(jZzh) != jZzh) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jZzh;
            } else if (jZzh != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzi() {
        return this.zzi.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzj(long j10) {
        long jZzj = this.zzh[0].zzj(j10);
        int i10 = 1;
        while (true) {
            zzxi[] zzxiVarArr = this.zzh;
            if (i10 >= zzxiVarArr.length) {
                return jZzj;
            }
            if (zzxiVarArr[i10].zzj(jZzj) != jZzj) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzk(long j10, zzni zzniVar) {
        zzxi[] zzxiVarArr = this.zzh;
        return (zzxiVarArr.length > 0 ? zzxiVarArr[0] : this.zza[0]).zzk(j10, zzniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzl() {
        return this.zzi.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzm(zzma zzmaVar) {
        ArrayList arrayList = this.zzd;
        if (arrayList.isEmpty()) {
            return this.zzi.zzm(zzmaVar);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzxi) arrayList.get(i10)).zzm(zzmaVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzn() {
        return this.zzi.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final void zzp(zzxi zzxiVar) {
        ArrayList arrayList = this.zzd;
        arrayList.remove(zzxiVar);
        if (arrayList.isEmpty()) {
            zzxi[] zzxiVarArr = this.zza;
            int i10 = 0;
            for (zzxi zzxiVar2 : zzxiVarArr) {
                i10 += zzxiVar2.zzd().zzb;
            }
            zzbg[] zzbgVarArr = new zzbg[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < zzxiVarArr.length; i12++) {
                zzzn zzznVarZzd = zzxiVarArr[i12].zzd();
                int i13 = zzznVarZzd.zzb;
                int i14 = 0;
                while (i14 < i13) {
                    zzbg zzbgVarZza = zzznVarZzd.zza(i14);
                    int i15 = zzbgVarZza.zza;
                    zzv[] zzvVarArr = new zzv[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        zzv zzvVarZza = zzbgVarZza.zza(i16);
                        zzt zztVarZza = zzvVarZza.zza();
                        String str = zzvVarZza.zza;
                        if (str == null) {
                            str = "";
                        }
                        zzxi[] zzxiVarArr2 = zzxiVarArr;
                        int i17 = i11;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 1 + str.length());
                        sb2.append(i12);
                        sb2.append(":");
                        sb2.append(str);
                        zztVarZza.zza(sb2.toString());
                        String str2 = zzvVarZza.zzn;
                        if (str2 != null) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i12).length() + 1 + str2.length());
                            sb3.append(i12);
                            sb3.append(":");
                            sb3.append(str2);
                            zztVarZza.zzm(sb3.toString());
                        }
                        zzvVarArr[i16] = zztVarZza.zzO();
                        i16++;
                        zzxiVarArr = zzxiVarArr2;
                        i11 = i17;
                    }
                    zzxi[] zzxiVarArr3 = zzxiVarArr;
                    int i18 = i11;
                    String str3 = zzbgVarZza.zzb;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i12).length() + 1 + String.valueOf(str3).length());
                    sb4.append(i12);
                    sb4.append(":");
                    sb4.append(str3);
                    zzbg zzbgVar = new zzbg(sb4.toString(), zzvVarArr);
                    this.zze.put(zzbgVar, zzbgVarZza);
                    i11 = i18 + 1;
                    zzbgVarArr[i18] = zzbgVar;
                    i14++;
                    zzxiVarArr = zzxiVarArr3;
                }
            }
            this.zzg = new zzzn(zzbgVarArr);
            zzxh zzxhVar = this.zzf;
            zzxhVar.getClass();
            zzxhVar.zzp(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final /* bridge */ /* synthetic */ void zzs(zzze zzzeVar) {
        zzxh zzxhVar = this.zzf;
        zzxhVar.getClass();
        zzxhVar.zzs(this);
    }
}
