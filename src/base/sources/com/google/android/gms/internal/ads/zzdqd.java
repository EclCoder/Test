package com.google.android.gms.internal.ads;

import androidx.collection.u;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdqd {
    public static final zzdqd zza = new zzdqd(new zzdqc());
    private final zzbnc zzb;
    private final zzbmz zzc;
    private final zzbnp zzd;
    private final zzbnm zze;
    private final zzbsk zzf;
    private final u zzg;
    private final u zzh;

    /* synthetic */ zzdqd(zzdqc zzdqcVar, byte[] bArr) {
        this(zzdqcVar);
    }

    public final zzbnc zza() {
        return this.zzb;
    }

    public final zzbmz zzb() {
        return this.zzc;
    }

    public final zzbnp zzc() {
        return this.zzd;
    }

    public final zzbnm zzd() {
        return this.zze;
    }

    public final zzbsk zze() {
        return this.zzf;
    }

    public final zzbni zzf(String str) {
        if (str == null) {
            return null;
        }
        return (zzbni) this.zzg.get(str);
    }

    public final zzbnf zzg(String str) {
        return (zzbnf) this.zzh.get(str);
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        u uVar = this.zzg;
        ArrayList arrayList = new ArrayList(uVar.size());
        for (int i10 = 0; i10 < uVar.size(); i10++) {
            arrayList.add((String) uVar.i(i10));
        }
        return arrayList;
    }

    private zzdqd(zzdqc zzdqcVar) {
        this.zzb = zzdqcVar.zza;
        this.zzc = zzdqcVar.zzb;
        this.zzd = zzdqcVar.zzc;
        this.zzg = new u(zzdqcVar.zzf);
        this.zzh = new u(zzdqcVar.zzg);
        this.zze = zzdqcVar.zzd;
        this.zzf = zzdqcVar.zze;
    }
}
