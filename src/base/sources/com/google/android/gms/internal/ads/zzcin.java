package com.google.android.gms.internal.ads;

import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcin extends zzaul {
    static final zzcin zzb = new zzcin();

    zzcin() {
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final zzaup zza(String str, byte[] bArr, String str2) {
        if (MovieBox.TYPE.equals(str)) {
            return new zzaur();
        }
        return MovieHeaderBox.TYPE.equals(str) ? new zzaus() : new zzaut(str);
    }
}
