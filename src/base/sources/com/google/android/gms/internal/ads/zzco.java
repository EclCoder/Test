package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface zzco {
    public static final ByteBuffer zza = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    zzcl zzb(zzcl zzclVar);

    boolean zzc();

    void zzd(ByteBuffer byteBuffer);

    void zze();

    ByteBuffer zzf();

    boolean zzg();

    @Deprecated
    default void zzh() {
        throw new IllegalStateException("AudioProcessor must implement at least one #flush() overload.");
    }

    default void zzi(zzcm zzcmVar) {
        zzh();
    }

    void zzj();

    default long zza(long j10) {
        return j10;
    }
}
