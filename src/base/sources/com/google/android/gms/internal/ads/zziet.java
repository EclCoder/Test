package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class zziet extends IOException {
    private boolean zza;

    public zziet(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void zza() {
        this.zza = true;
    }

    final boolean zzb() {
        return this.zza;
    }

    public zziet(String str) {
        super(str);
    }

    public zziet(String str, IOException iOException) {
        super("Unable to parse map entry.", iOException);
    }
}
