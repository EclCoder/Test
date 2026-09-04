package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzsy implements zzsx {
    protected abstract zzsx zzb();

    protected Uri zzf(Uri uri) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final OutputStream zzj(Uri uri) {
        return zzb().zzj(zzf(uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void zzk(Uri uri) throws zzsk {
        zzb().zzk(zzf(uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void zzl(Uri uri, Uri uri2) throws zzsk {
        zzb().zzl(zzf(uri), zzf(uri2));
    }
}
