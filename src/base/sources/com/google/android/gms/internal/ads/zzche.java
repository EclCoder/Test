package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzche {
    private static final AtomicInteger zza = new AtomicInteger(0);
    private static final AtomicInteger zzb = new AtomicInteger(0);

    public static int zzP() {
        return zza.get();
    }

    public static int zzQ() {
        return zzb.get();
    }

    protected static AtomicInteger zzf() {
        return zza;
    }

    protected static AtomicInteger zzi() {
        return zzb;
    }

    public abstract void zzA(int i10);

    public abstract boolean zzB();

    public abstract int zzC();

    public abstract long zzD();

    public abstract void zzE(boolean z10);

    public abstract void zzF(int i10);

    public abstract void zzG(int i10);

    public abstract long zzH();

    public abstract long zzI();

    public abstract long zzJ();

    public abstract long zzK();

    public abstract int zzL();

    public abstract void zzM(boolean z10);

    public abstract long zzN();

    public abstract long zzO();

    public abstract Integer zzj();

    public abstract void zzn(Integer num);

    public abstract void zzq(Uri[] uriArr, String str);

    public abstract void zzr(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10);

    public abstract void zzs(zzchd zzchdVar);

    public abstract void zzt();

    public abstract void zzu(Surface surface, boolean z10);

    public abstract void zzv(float f10, boolean z10);

    public abstract void zzw();

    public abstract void zzx(long j10);

    public abstract void zzy(int i10);

    public abstract void zzz(int i10);
}
