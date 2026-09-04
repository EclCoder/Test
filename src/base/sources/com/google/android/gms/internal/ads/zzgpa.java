package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgpa implements zzgox {
    private final zzgqh zza;
    private final long zzb;

    zzgpa(zzgcn zzgcnVar, zzgqh zzgqhVar, long j10) {
        this.zza = zzgqhVar;
        this.zzb = j10;
    }

    private static boolean zzc(zzgfq zzgfqVar) {
        int iZza = zzgfqVar.zzb().zza().zza();
        int iZzb = zzgfqVar.zzb().zza().zzb();
        byte[] versionArray = zzava.zza();
        s.h(versionArray, "versionArray");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        s.g(byteBufferAllocate, "allocate(...)");
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) iZza);
        byteBufferAllocate.putInt(iZzb);
        byte[] bArrArray = byteBufferAllocate.array();
        s.g(bArrArray, "array(...)");
        return Arrays.equals(bArrArray, versionArray);
    }

    @Override // com.google.android.gms.internal.ads.zzgox
    public final boolean zza(zzgfq zzgfqVar) {
        if (zzgfqVar == null || zzgfqVar.equals(zzgfq.zzh())) {
            this.zza.zzb(20202);
            return true;
        }
        if (!zzc(zzgfqVar)) {
            this.zza.zzb(20205);
            return true;
        }
        boolean z10 = zzgfqVar.zzb().zzc() - System.currentTimeMillis() <= this.zzb;
        if (z10) {
            this.zza.zzb(20203);
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgox
    public final boolean zzb(zzgfq zzgfqVar) {
        if (zzgfqVar == null || zzgfqVar.equals(zzgfq.zzh())) {
            this.zza.zzb(20204);
            return false;
        }
        if (zzc(zzgfqVar)) {
            return true;
        }
        this.zza.zzb(20206);
        return false;
    }
}
