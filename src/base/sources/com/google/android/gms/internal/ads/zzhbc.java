package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzhbc extends zzhap.zzf {
    private static final zzhaz zzbq;
    private static final zzhce zzbr = new zzhce(zzhbc.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th2;
        zzhaz zzhbbVar;
        byte[] bArr = null;
        try {
            zzhbbVar = new zzhba(bArr);
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            zzhbbVar = new zzhbb(bArr);
        }
        zzbq = zzhbbVar;
        if (th2 != null) {
            zzbr.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    zzhbc(int i10) {
        this.remainingField = i10;
    }

    final Set zzB() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(setNewSetFromMap);
        zzbq.zza(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.seenExceptionsField;
        Objects.requireNonNull(set2);
        return set2;
    }

    final int zzC() {
        return zzbq.zzb(this);
    }

    abstract void zzf(Set set);
}
