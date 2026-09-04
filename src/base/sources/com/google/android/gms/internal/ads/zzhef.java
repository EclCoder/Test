package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhef {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzhee zza(String str) throws GeneralSecurityException {
        for (zzhee zzheeVar : zza) {
            if (zzheeVar.zza()) {
                return zzheeVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
