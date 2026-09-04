package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzard implements zzafy {
    private final int zza;
    private final List zzb;
    private final zzet zzc;
    private final SparseIntArray zzd;
    private final zzarg zze;
    private final zzanj zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzaqz zzj;
    private zzaqy zzk;
    private zzagb zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    static {
        int i10 = zzarc.zza;
    }

    @Deprecated
    public zzard() {
        this(1, 1, zzanj.zza, new zzfi(0L), new zzapq(0), 112800);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) throws EOFException, InterruptedIOException {
        byte[] bArrZzi = this.zzc.zzi();
        zzafp zzafpVar = (zzafp) zzafzVar;
        zzafpVar.zzh(bArrZzi, 0, 940, false);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    zzafpVar.zze(i10, false);
                    return true;
                }
                if (bArrZzi[(i11 * 188) + i10] != 71) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        if (this.zza == 0) {
            zzagbVar = new zzanm(zzagbVar, this.zzf);
        }
        this.zzl = zzagbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) {
        long j10;
        long jZzo = zzafzVar.zzo();
        long j11 = -1;
        if (this.zzn) {
            if (jZzo != -1) {
                zzaqz zzaqzVar = this.zzj;
                if (!zzaqzVar.zza()) {
                    return zzaqzVar.zzb(zzafzVar, zzagyVar, this.zzr);
                }
            }
            if (this.zzo) {
                j10 = 0;
            } else {
                this.zzo = true;
                zzaqz zzaqzVar2 = this.zzj;
                if (zzaqzVar2.zzc() != C.TIME_UNSET) {
                    j10 = 0;
                    zzaqy zzaqyVar = new zzaqy(zzaqzVar2.zzd(), zzaqzVar2.zzc(), jZzo, this.zzr, 112800);
                    this.zzk = zzaqyVar;
                    this.zzl.zzw(zzaqyVar.zza());
                } else {
                    j10 = 0;
                    this.zzl.zzw(new zzaha(zzaqzVar2.zzc(), 0L));
                }
            }
            if (this.zzp) {
                this.zzp = false;
                zze(j10, j10);
                if (zzafzVar.zzn() != j10) {
                    zzagyVar.zza = j10;
                    return 1;
                }
            }
            zzaqy zzaqyVar2 = this.zzk;
            if (zzaqyVar2 != null && zzaqyVar2.zzc()) {
                return zzaqyVar2.zzd(zzafzVar, zzagyVar);
            }
        } else {
            j11 = -1;
        }
        zzet zzetVar = this.zzc;
        byte[] bArrZzi = zzetVar.zzi();
        if (9400 - zzetVar.zzg() < 188) {
            int iZzd = zzetVar.zzd();
            if (iZzd > 0) {
                System.arraycopy(bArrZzi, zzetVar.zzg(), bArrZzi, 0, iZzd);
            }
            zzetVar.zzb(bArrZzi, iZzd);
        }
        while (zzetVar.zzd() < 188) {
            int iZze = zzetVar.zze();
            int iZza = zzafzVar.zza(bArrZzi, iZze, 9400 - iZze);
            if (iZza == -1) {
                int i10 = 0;
                while (true) {
                    SparseArray sparseArray = this.zzg;
                    if (i10 >= sparseArray.size()) {
                        return -1;
                    }
                    zzari zzariVar = (zzari) sparseArray.valueAt(i10);
                    if (zzariVar instanceof zzaqm) {
                        zzaqm zzaqmVar = (zzaqm) zzariVar;
                        if (zzaqmVar.zzd(false)) {
                            zzaqmVar.zzc(new zzet(), 1);
                        }
                    }
                    i10++;
                }
            } else {
                zzetVar.zzf(iZze + iZza);
            }
        }
        int iZzg = zzetVar.zzg();
        int iZze2 = zzetVar.zze();
        int iZza2 = zzarj.zza(zzetVar.zzi(), iZzg, iZze2);
        zzetVar.zzh(iZza2);
        int i11 = iZza2 + 188;
        if (i11 > iZze2) {
            this.zzq += iZza2 - iZzg;
        } else {
            this.zzq = 0;
        }
        int iZze3 = zzetVar.zze();
        if (i11 > iZze3) {
            return 0;
        }
        int iZzB = zzetVar.zzB();
        if ((8388608 & iZzB) != 0) {
            zzetVar.zzh(i11);
            return 0;
        }
        int i12 = (4194304 & iZzB) != 0 ? 1 : 0;
        int i13 = iZzB & 32;
        int i14 = (iZzB >> 8) & 8191;
        zzari zzariVar2 = (iZzB & 16) != 0 ? (zzari) this.zzg.get(i14) : null;
        if (zzariVar2 == null) {
            zzetVar.zzh(i11);
            return 0;
        }
        int i15 = iZzB & 15;
        SparseIntArray sparseIntArray = this.zzd;
        int i16 = sparseIntArray.get(i14, i15 - 1);
        sparseIntArray.put(i14, i15);
        if (i16 == i15) {
            zzetVar.zzh(i11);
            return 0;
        }
        if (i15 != ((i16 + 1) & 15)) {
            zzariVar2.zzb();
        }
        if (i13 != 0) {
            int iZzs = zzetVar.zzs();
            i12 |= (zzetVar.zzs() & 64) != 0 ? 2 : 0;
            zzetVar.zzk(iZzs - 1);
        }
        boolean z10 = this.zzn;
        if (z10 || !this.zzi.get(i14, false)) {
            zzetVar.zzf(i11);
            zzariVar2.zzc(zzetVar, i12);
            zzetVar.zzf(iZze3);
        }
        if (!z10 && this.zzn && jZzo != j11) {
            this.zzp = true;
        }
        zzetVar.zzh(i11);
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        zzaqy zzaqyVar;
        List list = this.zzb;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzfi zzfiVar = (zzfi) list.get(i10);
            if (zzfiVar.zzc() != C.TIME_UNSET) {
                long jZza = zzfiVar.zza();
                if (jZza != C.TIME_UNSET && jZza != 0 && jZza != j11) {
                    zzfiVar.zzd(j11);
                }
            } else {
                zzfiVar.zzd(j11);
            }
        }
        if (j11 != 0 && (zzaqyVar = this.zzk) != null) {
            zzaqyVar.zzb(j11);
        }
        this.zzc.zza(0);
        this.zzd.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.zzg;
            if (i11 >= sparseArray.size()) {
                this.zzq = 0;
                return;
            } else {
                ((zzari) sparseArray.valueAt(i11)).zzb();
                i11++;
            }
        }
    }

    final /* synthetic */ List zzh() {
        return this.zzb;
    }

    final /* synthetic */ zzarg zzi() {
        return this.zze;
    }

    final /* synthetic */ SparseArray zzj() {
        return this.zzg;
    }

    final /* synthetic */ SparseBooleanArray zzk() {
        return this.zzh;
    }

    final /* synthetic */ SparseBooleanArray zzl() {
        return this.zzi;
    }

    final /* synthetic */ zzagb zzm() {
        return this.zzl;
    }

    final /* synthetic */ int zzn() {
        return this.zzm;
    }

    final /* synthetic */ void zzo(int i10) {
        this.zzm = i10;
    }

    final /* synthetic */ void zzp(boolean z10) {
        this.zzn = true;
    }

    final /* synthetic */ void zzq(int i10) {
        this.zzr = i10;
    }

    public zzard(int i10, int i11, zzanj zzanjVar, zzfi zzfiVar, zzarg zzargVar, int i12) {
        this.zze = zzargVar;
        this.zza = i11;
        this.zzf = zzanjVar;
        this.zzb = Collections.singletonList(zzfiVar);
        this.zzc = new zzet(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzaqz(112800);
        this.zzl = zzagb.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArrayZza = zzargVar.zza();
        int size = sparseArrayZza.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.zzg.put(sparseArrayZza.keyAt(i13), (zzari) sparseArrayZza.valueAt(i13));
        }
        this.zzg.put(0, new zzaqu(new zzara(this)));
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }
}
