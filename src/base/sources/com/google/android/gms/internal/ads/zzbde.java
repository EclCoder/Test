package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbde {
    private final zzbbs zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzbde(zzbbs zzbbsVar, String str, String str2, Class... clsArr) {
        this.zza = zzbbsVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzbbsVar.zzd().submit(new zzbdd(this));
    }

    private final String zzc(byte[] bArr, String str) {
        return new String(this.zza.zzf().zzb(bArr, str), C.UTF8_NAME);
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    final /* synthetic */ void zzb() {
        try {
            zzbbs zzbbsVar = this.zza;
            Class<?> clsLoadClass = zzbbsVar.zze().loadClass(zzc(zzbbsVar.zzg(), this.zzb));
            if (clsLoadClass != null) {
                this.zzd = clsLoadClass.getMethod(zzc(zzbbsVar.zzg(), this.zzc), this.zze);
            }
        } catch (zzbaw | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } finally {
            this.zzf.countDown();
        }
    }
}
