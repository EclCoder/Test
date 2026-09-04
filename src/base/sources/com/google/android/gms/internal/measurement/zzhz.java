package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhz extends zzadp implements zzafd {
    private zzhz() {
        throw null;
    }

    public final List zza() {
        return Collections.unmodifiableList(((zzib) this.zza).zza());
    }

    public final int zzb() {
        return ((zzib) this.zza).zzb();
    }

    public final zzid zzc(int i10) {
        return ((zzib) this.zza).zzc(i10);
    }

    public final zzhz zzd(int i10, zzic zzicVar) {
        zzaY();
        ((zzib) this.zza).zzk(i10, (zzid) zzicVar.zzbd());
        return this;
    }

    public final zzhz zze(zzic zzicVar) {
        zzaY();
        ((zzib) this.zza).zzl((zzid) zzicVar.zzbd());
        return this;
    }

    public final zzhz zzf(Iterable iterable) {
        zzaY();
        ((zzib) this.zza).zzm(iterable);
        return this;
    }

    public final zzhz zzg() {
        zzaY();
        ((zzib) this.zza).zzn();
        return this;
    }

    public final String zzh() {
        return ((zzib) this.zza).zze();
    }

    public final zzhz zzi(String str) {
        zzaY();
        ((zzib) this.zza).zzo(str);
        return this;
    }

    public final zzhz zzj(String str) {
        zzaY();
        ((zzib) this.zza).zzp(str);
        return this;
    }

    /* synthetic */ zzhz(byte[] bArr) {
        super(zzib.zzi);
    }
}
