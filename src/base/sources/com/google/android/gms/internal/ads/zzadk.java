package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzadk implements zzaeu {
    final /* synthetic */ zzadq zza;
    private zzgwm zzb;
    private zzv zzc;
    private long zzd;
    private long zze;
    private int zzf;

    public zzadk(zzadq zzadqVar, Context context, int i10) {
        Objects.requireNonNull(zzadqVar);
        this.zza = zzadqVar;
        zzfl.zzU(context);
        this.zzb = zzgwm.zzi();
        this.zze = C.TIME_UNSET;
        zzaer zzaerVar = zzaer.zzb;
    }

    private static final void zzy(zzv zzvVar) {
        zzt zztVarZza = zzvVar.zza();
        zztVarZza.zzE(zzadq.zzC(zzvVar.zzF));
        zztVarZza.zzO();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zza() {
        zzadq zzadqVar = this.zza;
        if (zzadqVar.zzt()) {
            zzadqVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzb() {
        zzadq zzadqVar = this.zza;
        if (zzadqVar.zzt()) {
            zzadqVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zzd(zzv zzvVar) {
        return this.zza.zzi(zzvVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzg(boolean z10) {
        this.zze = C.TIME_UNSET;
        this.zza.zzm(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zzh(boolean z10) {
        return this.zza.zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzi() {
        zzadq zzadqVar = this.zza;
        zzadqVar.zzA(this.zze);
        if (zzadqVar.zzy() >= zzadqVar.zzz()) {
            zzadqVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zzj() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final Surface zzk() {
        zzgtj.zzi(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzl(zzadr zzadrVar) {
        this.zza.zzp(zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzm(float f10) {
        this.zza.zzq(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzn(List list) {
        if (this.zzb.equals(list)) {
            return;
        }
        this.zzb = zzgwm.zzq(list);
        zzv zzvVar = this.zzc;
        if (zzvVar != null) {
            zzy(zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzo(long j10) {
        this.zzd = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzp(Surface surface, zzeu zzeuVar) {
        this.zza.zzc(surface, zzeuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzq() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzr(int i10) {
        this.zza.zzr(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzs(int i10, zzv zzvVar, long j10, int i11, List list) {
        zzgtj.zzi(false);
        this.zzb = zzgwm.zzq(list);
        this.zzc = zzvVar;
        zzadq zzadqVar = this.zza;
        zzadqVar.zzA(C.TIME_UNSET);
        zzy(zzvVar);
        long j11 = this.zze;
        long j12 = -4611686018427387904L;
        if (zzadqVar.zzt()) {
            if (j11 != C.TIME_UNSET) {
                j12 = j11 + 1;
            }
        } else if (j11 != C.TIME_UNSET) {
            return;
        }
        long j13 = j12;
        zzadqVar.zzw().zza(j13, new zzadp(j10 + this.zzd, i11, j13));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzt() {
        zzadq zzadqVar = this.zza;
        if (zzadqVar.zzw().zzc() == 0) {
            zzadqVar.zzo();
            return;
        }
        zzfh zzfhVar = new zzfh(10);
        boolean z10 = true;
        while (zzadqVar.zzw().zzc() > 0) {
            zzadp zzadpVar = (zzadp) zzadqVar.zzw().zzd();
            zzadpVar.getClass();
            if (z10) {
                int i10 = zzadpVar.zzb;
                if (i10 == 0 || i10 == 1) {
                    zzadpVar = new zzadp(zzadpVar.zza, 0, zzadpVar.zzc);
                } else {
                    zzadqVar.zzo();
                }
            }
            zzfhVar.zza(zzadpVar.zzc, zzadpVar);
            z10 = false;
        }
        zzadqVar.zzx(zzfhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zzu(long j10, zzaes zzaesVar) {
        int i10;
        zzgtj.zzi(false);
        long j11 = j10 + this.zzd;
        zzadq zzadqVar = this.zza;
        long jZzb = zzadqVar.zzv().zzb(j11);
        if (jZzb == C.TIME_UNSET || jZzb >= zzadqVar.zzu() || (i10 = this.zzf) >= 2) {
            if (zzadqVar.zzs()) {
                throw null;
            }
            return false;
        }
        this.zzf = i10 + 1;
        zzaesVar.zzb();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzv(long j10, long j11) {
        this.zza.zzl(j10 + this.zzd, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzw(boolean z10) {
        zzadq zzadqVar = this.zza;
        if (zzadqVar.zzt()) {
            zzadqVar.zzn(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzx() {
        this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaer zzaerVar, Executor executor) {
    }
}
