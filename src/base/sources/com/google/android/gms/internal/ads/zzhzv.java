package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhzv implements zzhzy {
    private final zziah zza;

    @Override // com.google.android.gms.internal.ads.zzhzy
    public final Object zza(String str) {
        Iterator it = zzhzz.zza("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
