package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzyu implements zzyd {
    private final zzyd zza;
    private final Object zzb;

    private zzyu(zzyd zzydVar, Object obj) {
        zzabr.zza(zzydVar, "log site key");
        this.zza = zzydVar;
        zzabr.zza(obj, "log site qualifier");
        this.zzb = obj;
    }

    static zzyd zza(zzyd zzydVar, Object obj) {
        return new zzyu(zzydVar, obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzyu)) {
            return false;
        }
        zzyu zzyuVar = (zzyu) obj;
        return this.zza.equals(zzyuVar.zza) && this.zzb.equals(zzyuVar.zzb);
    }

    public final int hashCode() {
        Object obj = this.zzb;
        return obj.hashCode() ^ this.zza.hashCode();
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        StringBuilder sb2 = new StringBuilder(length + 47 + string2.length() + 3);
        sb2.append("SpecializedLogSiteKey{ delegate='");
        sb2.append(string);
        sb2.append("', qualifier='");
        sb2.append(string2);
        sb2.append("' }");
        return sb2.toString();
    }
}
