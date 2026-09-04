package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzblp extends zzbmd {
    private final Drawable zza;
    private final Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;
    private final Map zzf;

    public zzblp(Drawable drawable, Uri uri, double d10, int i10, int i11, Map map) {
        this.zza = drawable;
        this.zzb = uri;
        this.zzc = d10;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final IObjectWrapper zzb() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final double zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final int zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final Map zzg() {
        return this.zzf;
    }
}
