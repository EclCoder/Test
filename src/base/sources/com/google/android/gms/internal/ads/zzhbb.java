package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhbb extends zzhaz {
    private zzhbb() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final void zza(zzhbc zzhbcVar, Set set, Set set2) {
        synchronized (zzhbcVar) {
            try {
                if (zzhbcVar.seenExceptionsField == null) {
                    zzhbcVar.seenExceptionsField = set2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final int zzb(zzhbc zzhbcVar) {
        int i10;
        synchronized (zzhbcVar) {
            i10 = zzhbcVar.remainingField - 1;
            zzhbcVar.remainingField = i10;
        }
        return i10;
    }

    /* synthetic */ zzhbb(byte[] bArr) {
        super(null);
    }
}
