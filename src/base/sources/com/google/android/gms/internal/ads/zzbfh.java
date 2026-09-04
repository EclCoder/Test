package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbfh {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final boolean zza(zzbfg zzbfgVar) {
        synchronized (this.zzb) {
            try {
                return this.zzc.contains(zzbfgVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzb(zzbfg zzbfgVar) {
        synchronized (this.zzb) {
            try {
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    zzbfg zzbfgVar2 = (zzbfg) it.next();
                    if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzc()) {
                        if (!com.google.android.gms.ads.internal.zzt.zzh().zzo().zze() && !zzbfgVar.equals(zzbfgVar2) && zzbfgVar2.zzc().equals(zzbfgVar.zzc())) {
                            it.remove();
                            return true;
                        }
                    } else if (!zzbfgVar.equals(zzbfgVar2) && zzbfgVar2.zzb().equals(zzbfgVar.zzb())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc(zzbfg zzbfgVar) {
        synchronized (this.zzb) {
            try {
                List list = this.zzc;
                if (list.size() >= 10) {
                    int size = list.size();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 30);
                    sb2.append("Queue is full, current size = ");
                    sb2.append(size);
                    String string = sb2.toString();
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
                    list.remove(0);
                }
                int i11 = this.zza;
                this.zza = i11 + 1;
                zzbfgVar.zzk(i11);
                zzbfgVar.zzh();
                list.add(zzbfgVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
