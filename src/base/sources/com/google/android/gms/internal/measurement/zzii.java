package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzii extends zzadu implements zzafd {
    private static final zzii zzh;
    private static volatile zzafj zzi;
    private zzaee zzb = zzadu.zzcw();
    private zzaee zze = zzadu.zzcw();
    private zzaef zzf = zzadu.zzcy();
    private zzaef zzg = zzadu.zzcy();

    static {
        zzii zziiVar = new zzii();
        zzh = zziiVar;
        zzadu.zzcs(zzii.class, zziiVar);
    }

    private zzii() {
    }

    public static zzih zzj() {
        return (zzih) zzh.zzcn();
    }

    public static zzii zzk() {
        return zzh;
    }

    public final List zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzb.size();
    }

    public final List zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final List zze() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zzf.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", zzhq.class, "zzg", zzik.class});
        }
        if (i11 == 3) {
            return new zzii();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzih(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzi;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzii.class) {
            try {
                zzadqVar = zzi;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzh);
                    zzi = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }

    public final List zzh() {
        return this.zzg;
    }

    public final int zzi() {
        return this.zzg.size();
    }

    final /* synthetic */ void zzl(Iterable iterable) {
        zzaee zzaeeVar = this.zzb;
        if (!zzaeeVar.zza()) {
            this.zzb = zzadu.zzcx(zzaeeVar);
        }
        zzacb.zzcg(iterable, this.zzb);
    }

    final /* synthetic */ void zzm() {
        this.zzb = zzadu.zzcw();
    }

    final /* synthetic */ void zzn(Iterable iterable) {
        zzaee zzaeeVar = this.zze;
        if (!zzaeeVar.zza()) {
            this.zze = zzadu.zzcx(zzaeeVar);
        }
        zzacb.zzcg(iterable, this.zze);
    }

    final /* synthetic */ void zzo() {
        this.zze = zzadu.zzcw();
    }

    final /* synthetic */ void zzp(Iterable iterable) {
        zzaef zzaefVar = this.zzf;
        if (!zzaefVar.zza()) {
            this.zzf = zzadu.zzcz(zzaefVar);
        }
        zzacb.zzcg(iterable, this.zzf);
    }

    final /* synthetic */ void zzq() {
        this.zzf = zzadu.zzcy();
    }

    final /* synthetic */ void zzr(Iterable iterable) {
        zzaef zzaefVar = this.zzg;
        if (!zzaefVar.zza()) {
            this.zzg = zzadu.zzcz(zzaefVar);
        }
        zzacb.zzcg(iterable, this.zzg);
    }

    final /* synthetic */ void zzs() {
        this.zzg = zzadu.zzcy();
    }
}
