package com.google.android.gms.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzw {
    private final zzp zza;
    private final boolean zzb;
    private final zzu zzc;

    private zzw(zzu zzuVar, boolean z10, zzp zzpVar, int i10) {
        this.zzc = zzuVar;
        this.zzb = z10;
        this.zza = zzpVar;
    }

    public static zzw zza(zzp zzpVar) {
        return new zzw(new zzu(zzpVar), false, zzo.zza, Integer.MAX_VALUE);
    }

    public final zzw zzb() {
        return new zzw(this.zzc, true, this.zza, Integer.MAX_VALUE);
    }

    public final Iterable zzc(CharSequence charSequence) {
        return new zzt(this, charSequence);
    }

    public final List zzd(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itZza = this.zzc.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZza.hasNext()) {
            arrayList.add((String) itZza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    final /* synthetic */ Iterator zze(CharSequence charSequence) {
        return this.zzc.zza(this, charSequence);
    }

    final /* synthetic */ zzp zzf() {
        return this.zza;
    }

    final /* synthetic */ boolean zzg() {
        return this.zzb;
    }
}
