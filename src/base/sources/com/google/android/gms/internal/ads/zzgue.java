package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgue implements zzgub {
    private static final zzgub zzb = zzgud.zza;
    private final zzgui zza = new zzgui();
    private volatile zzgub zzc;
    private Object zzd;

    zzgue(zzgub zzgubVar) {
        this.zzc = zzgubVar;
    }

    public final String toString() {
        Object string = this.zzc;
        if (string == zzb) {
            String strValueOf = String.valueOf(this.zzd);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(strValueOf);
            sb2.append(">");
            string = sb2.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(strValueOf2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final Object zza() {
        zzgub zzgubVar = this.zzc;
        zzgub zzgubVar2 = zzb;
        if (zzgubVar != zzgubVar2) {
            synchronized (this.zza) {
                try {
                    if (this.zzc != zzgubVar2) {
                        Object objZza = this.zzc.zza();
                        this.zzd = objZza;
                        this.zzc = zzgubVar2;
                        return objZza;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.zzd;
    }
}
