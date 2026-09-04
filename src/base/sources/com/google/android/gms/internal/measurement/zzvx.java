package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzvx extends ThreadLocal {
    zzvx() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        zzwq zzwqVar = new zzwq(zzrn.zza(Thread.currentThread()));
        Thread threadCurrentThread = Thread.currentThread();
        synchronized (zzvy.zze) {
            zzvy.zze.put(threadCurrentThread, zzwqVar);
        }
        return zzwqVar;
    }
}
