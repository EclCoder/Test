package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzakq {
    public final int zza;
    public final int zzb;
    public final float zzc;

    private zzakq(int i10, int i11, float f10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = f10;
    }

    static /* synthetic */ zzakq zza(int i10) {
        int i11 = i10 >> 13;
        if (i11 == 0) {
            return null;
        }
        return new zzakq(i11, (i10 >> 10) & 7, ((i10 & 511) * ((i10 & 512) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzakq)) {
            return false;
        }
        zzakq zzakqVar = (zzakq) obj;
        return this.zza == zzakqVar.zza && this.zzb == zzakqVar.zzb && Float.compare(this.zzc, zzakqVar.zzc) == 0;
    }

    public final int hashCode() {
        return (((this.zza * 31) + this.zzb) * 31) + Float.hashCode(this.zzc);
    }

    public final String toString() {
        int i10 = this.zza;
        int length = String.valueOf(i10).length();
        int i11 = this.zzb;
        int length2 = String.valueOf(i11).length();
        float f10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 28 + length2 + 7 + String.valueOf(f10).length() + 1);
        sb2.append("GainField{name=");
        sb2.append(i10);
        sb2.append(", originator=");
        sb2.append(i11);
        sb2.append(", gain=");
        sb2.append(f10);
        sb2.append("}");
        return sb2.toString();
    }
}
