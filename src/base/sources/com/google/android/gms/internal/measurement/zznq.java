package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zznq extends zzadp implements zzafd {
    private zznq() {
        throw null;
    }

    public final List zza() {
        return Collections.unmodifiableList(((zznr) this.zza).zza());
    }

    public final zznq zzb(String str) {
        zzaY();
        ((zznr) this.zza).zzc("");
        return this;
    }

    public final zznq zzc(String str) {
        zzaY();
        ((zznr) this.zza).zzd("");
        return this;
    }

    /* synthetic */ zznq(byte[] bArr) {
        super(zznr.zzg);
    }
}
