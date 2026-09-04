package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzvd extends zzve {
    private final zzafc zza;
    private final zzadf zzb;

    zzvd(zzafc zzafcVar, zzadf zzadfVar) {
        this.zza = zzafcVar;
        if (zzadfVar == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.zzb = zzadfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzve) {
            zzve zzveVar = (zzve) obj;
            if (this.zza.equals(zzveVar.zzb()) && this.zzb.equals(zzveVar.zzc())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        StringBuilder sb2 = new StringBuilder(length + 53 + string2.length() + 1);
        sb2.append("ProtoSerializer{defaultValue=");
        sb2.append(string);
        sb2.append(", extensionRegistryLite=");
        sb2.append(string2);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzve, com.google.android.gms.internal.measurement.zztv
    public final /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzve
    public final zzafc zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzve
    public final zzadf zzc() {
        return this.zzb;
    }
}
