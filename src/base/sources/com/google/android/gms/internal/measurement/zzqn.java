package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqn {
    private final boolean zza;
    private final List zzb;
    private final zzacr zzc;
    private final String zzd;
    private final String zze;
    private final List zzf;
    private final List zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final zznf zzk;

    public zzqn(boolean z10, List enabledBackings, zzacr secret, String dirPath, String gmsCoreDirPath, List includeStaticConfigPackages, List excludeStaticConfigPackages, boolean z11, boolean z12, boolean z13, zznf clientFlags) {
        s.h(enabledBackings, "enabledBackings");
        s.h(secret, "secret");
        s.h(dirPath, "dirPath");
        s.h(gmsCoreDirPath, "gmsCoreDirPath");
        s.h(includeStaticConfigPackages, "includeStaticConfigPackages");
        s.h(excludeStaticConfigPackages, "excludeStaticConfigPackages");
        s.h(clientFlags, "clientFlags");
        this.zza = z10;
        this.zzb = enabledBackings;
        this.zzc = secret;
        this.zzd = dirPath;
        this.zze = gmsCoreDirPath;
        this.zzf = includeStaticConfigPackages;
        this.zzg = excludeStaticConfigPackages;
        this.zzh = z11;
        this.zzi = z12;
        this.zzj = z13;
        this.zzk = clientFlags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzqn)) {
            return false;
        }
        zzqn zzqnVar = (zzqn) obj;
        return this.zza == zzqnVar.zza && s.c(this.zzb, zzqnVar.zzb) && s.c(this.zzc, zzqnVar.zzc) && s.c(this.zzd, zzqnVar.zzd) && s.c(this.zze, zzqnVar.zze) && s.c(this.zzf, zzqnVar.zzf) && s.c(this.zzg, zzqnVar.zzg) && this.zzh == zzqnVar.zzh && this.zzi == zzqnVar.zzi && this.zzj == zzqnVar.zzj && s.c(this.zzk, zzqnVar.zzk);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.zza), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, Boolean.valueOf(this.zzh), Boolean.valueOf(this.zzi), Boolean.valueOf(this.zzj));
    }

    public final String toString() {
        boolean z10 = this.zza;
        int length = String.valueOf(z10).length();
        List list = this.zzb;
        int length2 = String.valueOf(list).length();
        zzacr zzacrVar = this.zzc;
        int length3 = String.valueOf(zzacrVar).length();
        String str = this.zzd;
        int length4 = String.valueOf(str).length();
        String str2 = this.zze;
        int length5 = String.valueOf(str2).length();
        List list2 = this.zzf;
        int length6 = String.valueOf(list2).length();
        List list3 = this.zzg;
        int length7 = String.valueOf(list3).length();
        boolean z11 = this.zzh;
        int length8 = String.valueOf(z11).length();
        boolean z12 = this.zzi;
        int length9 = String.valueOf(z12).length();
        boolean z13 = this.zzj;
        int length10 = String.valueOf(z13).length();
        zznf zznfVar = this.zzk;
        StringBuilder sb2 = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(zznfVar).length() + 1);
        sb2.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb2.append(z10);
        sb2.append(", enabledBackings=");
        sb2.append(list);
        sb2.append(", secret=");
        sb2.append(zzacrVar);
        sb2.append(", dirPath=");
        sb2.append(str);
        sb2.append(", gmsCoreDirPath=");
        sb2.append(str2);
        sb2.append(", includeStaticConfigPackages=");
        sb2.append(list2);
        sb2.append(", excludeStaticConfigPackages=");
        sb2.append(list3);
        sb2.append(", hasStorageInfoFromGms=");
        sb2.append(z11);
        sb2.append(", allowEmptySnapshotToken=");
        sb2.append(z12);
        sb2.append(", enableCommitV2Api=");
        sb2.append(z13);
        sb2.append(", clientFlags=");
        sb2.append(zznfVar);
        sb2.append(")");
        return sb2.toString();
    }

    public final zzacr zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final boolean zzd() {
        return this.zzi;
    }

    public final boolean zze() {
        return this.zzj;
    }

    public final zznf zzf() {
        return this.zzk;
    }

    public final int zzg(zzabz androidBacking, String staticPackageName) {
        s.h(androidBacking, "androidBacking");
        s.h(staticPackageName, "staticPackageName");
        if (!this.zzh) {
            return 14;
        }
        s.h(androidBacking, "androidBacking");
        if (!this.zza || !this.zzb.contains(androidBacking)) {
            return 3;
        }
        if (this.zzc.zzb() == 0) {
            return 4;
        }
        List list = this.zzf;
        if (list.isEmpty() || list.contains(staticPackageName)) {
            return this.zzg.contains(staticPackageName) ? 6 : 0;
        }
        return 5;
    }
}
