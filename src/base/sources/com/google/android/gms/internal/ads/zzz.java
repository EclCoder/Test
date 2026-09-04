package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzz {
    private String zza;
    private Uri zzb;
    private final zzaa zzc = new zzaa();
    private final List zzd;
    private final zzgwm zze;
    private final zzae zzf;
    private final zzai zzg;

    public zzz() {
        zzgwm.zzi();
        this.zzd = Collections.EMPTY_LIST;
        this.zze = zzgwm.zzi();
        this.zzf = new zzae();
        this.zzg = zzai.zza;
    }

    public final zzz zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzz zzb(Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzak zzc() {
        zzag zzagVar;
        Uri uri = this.zzb;
        byte[] bArr = null;
        if (uri != null) {
            zzagVar = new zzag(uri, null, null, null, this.zzd, null, this.zze, null, C.TIME_UNSET, null);
        } else {
            zzagVar = null;
        }
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzak(str, new zzac(this.zzc, null), zzagVar, new zzaf(this.zzf, bArr), zzan.zza, this.zzg, null);
    }
}
