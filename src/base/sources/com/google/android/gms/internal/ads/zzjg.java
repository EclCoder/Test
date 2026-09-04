package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzjg implements zzly {
    public static final zzgwm zza = zzgwm.zzn("file", "content", DataSchemeDataSource.SCHEME_DATA, "android.resource", RawResourceDataSource.RAW_RESOURCE_SCHEME, "asset");
    private final zzbe zzb;
    private final zzbd zzc;
    private final zzabr zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final long zzk;
    private final long zzl;
    private final long zzm;
    private final zzgwp zzn;
    private final ConcurrentHashMap zzo;
    private long zzp;

    public zzjg() {
        zzabr zzabrVar = new zzabr(true, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        zzgwp zzgwpVarZza = zzgwp.zza();
        zzq(1000, 0, "bufferForPlaybackMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        zzq(1000, 0, "bufferForPlaybackForLocalPlaybackMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        zzq(2000, 0, "bufferForPlaybackAfterRebufferMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        zzq(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        zzq(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 1000, "minBufferMs", "bufferForPlaybackMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        zzq(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        zzq(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, "maxBufferMs", "minBufferMs");
        zzq(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        zzq(0, 0, "backBufferDurationMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        this.zzb = new zzbe();
        this.zzc = new zzbd();
        this.zzd = zzabrVar;
        this.zze = zzfl.zzs(50000L);
        this.zzf = zzfl.zzs(1000L);
        this.zzg = zzfl.zzs(50000L);
        this.zzh = zzfl.zzs(50000L);
        this.zzi = zzfl.zzs(1000L);
        this.zzj = zzfl.zzs(1000L);
        this.zzk = zzfl.zzs(2000L);
        this.zzl = zzfl.zzs(1000L);
        this.zzm = zzfl.zzs(0L);
        this.zzo = new ConcurrentHashMap();
        this.zzn = zzgwp.zzc(zzgwpVarZza);
        this.zzp = -1L;
    }

    private final int zzm(zzqf zzqfVar) {
        Integer num = (Integer) this.zzn.get(zzqfVar.zzb);
        if (num == null || num.intValue() == -1) {
            return -1;
        }
        return num.intValue();
    }

    private final void zzn(zzqf zzqfVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzjf zzjfVar = (zzjf) concurrentHashMap.get(zzqfVar);
        if (zzjfVar != null) {
            int i10 = zzjfVar.zza - 1;
            zzjfVar.zza = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(zzqfVar);
                zzo();
            }
        }
    }

    private final void zzo() {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        if (concurrentHashMap.isEmpty()) {
            this.zzd.zze();
            return;
        }
        zzabr zzabrVar = this.zzd;
        Iterator it = concurrentHashMap.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((zzjf) it.next()).zzc;
        }
        zzabrVar.zzf(i10);
    }

    private final boolean zzp(zzlx zzlxVar) {
        zzbf zzbfVar = zzlxVar.zzb;
        zzag zzagVar = zzbfVar.zzb(zzbfVar.zzo(zzlxVar.zzc.zza, this.zzc).zzc, this.zzb, 0L).zzd.zzb;
        if (zzagVar == null) {
            return false;
        }
        String scheme = zzagVar.zza.getScheme();
        return TextUtils.isEmpty(scheme) || zza.contains(scheme);
    }

    private static void zzq(int i10, int i11, String str, String str2) {
        zzgtj.zzh(i10 >= i11, "%s cannot be less than %s", str, str2);
    }

    private final int zzr(zzqf zzqfVar) {
        zzjf zzjfVar = (zzjf) this.zzo.get(zzqfVar);
        zzjfVar.getClass();
        return zzjfVar.zzc() * C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }

    private final int zzs(zzqf zzqfVar) {
        zzjf zzjfVar = (zzjf) this.zzo.get(zzqfVar);
        zzjfVar.getClass();
        return zzjfVar.zzc;
    }

    private static final boolean zzt(boolean z10) {
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zza(zzqf zzqfVar) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.zzp;
        zzgtj.zzj(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzp = id2;
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzjf zzjfVar = (zzjf) concurrentHashMap.get(zzqfVar);
        if (zzjfVar == null) {
            concurrentHashMap.put(zzqfVar, new zzjf());
        } else {
            zzjfVar.zza++;
        }
        zzjf zzjfVar2 = (zzjf) concurrentHashMap.get(zzqfVar);
        zzjfVar2.getClass();
        int iZzm = zzm(zzqfVar);
        if (iZzm == -1) {
            iZzm = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        zzjfVar2.zzc = iZzm;
        zzjfVar2.zzb = false;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zzb(zzlx zzlxVar, zzzn zzznVar, zzaba[] zzabaVarArr) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzqf zzqfVar = zzlxVar.zza;
        int iZzm = zzm(zzqfVar);
        zzjf zzjfVar = (zzjf) concurrentHashMap.get(zzqfVar);
        zzjfVar.getClass();
        if (iZzm == -1) {
            boolean zZzp = zzp(zzlxVar);
            int length = zzabaVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = C.DEFAULT_VIDEO_BUFFER_SIZE;
                if (i10 < length) {
                    zzaba zzabaVar = zzabaVarArr[i10];
                    if (zzabaVar != null) {
                        switch (zzabaVar.zza().zzc) {
                            case -1:
                            case 1:
                                break;
                            case 0:
                                i12 = 144310272;
                                break;
                            case 2:
                                i12 = !zZzp ? 131072000 : 19660800;
                                break;
                            case 3:
                            case 5:
                            default:
                                i12 = 131072;
                                break;
                            case 4:
                                i12 = 26214400;
                                break;
                        }
                        i11 += i12;
                    }
                    i10++;
                } else {
                    String str = zzfl.zza;
                    iZzm = Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, Math.min(i11, 210239488));
                }
            }
        }
        zzjfVar.zzc = iZzm;
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zzc(zzqf zzqfVar) {
        zzn(zzqfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zzd(zzqf zzqfVar) {
        zzn(zzqfVar);
        if (this.zzo.isEmpty()) {
            this.zzp = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final zzabl zze(zzqf zzqfVar) {
        return new zzje(this, zzqfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final long zzf(zzqf zzqfVar) {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final boolean zzg(zzqf zzqfVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final boolean zzh(zzlx zzlxVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzqf zzqfVar = zzlxVar.zza;
        zzjf zzjfVar = (zzjf) concurrentHashMap.get(zzqfVar);
        zzjfVar.getClass();
        int iZzr = zzr(zzqfVar);
        int iZzs = zzs(zzqfVar);
        boolean z10 = false;
        if (zzqfVar.equals(zzqf.zza)) {
            return iZzr < iZzs;
        }
        boolean zZzp = zzp(zzlxVar);
        long jMin = zZzp ? this.zzf : this.zze;
        long j10 = zZzp ? this.zzh : this.zzg;
        float f10 = zzlxVar.zzf;
        if (f10 > 1.0f) {
            jMin = Math.min(zzfl.zzx(jMin, f10), j10);
        }
        long j11 = zzlxVar.zze;
        if (j11 < Math.max(jMin, 500000L)) {
            boolean zZzt = zzt(zZzp);
            Runtime runtime = Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            boolean z11 = runtime.totalMemory() < jMaxMemory || runtime.freeMemory() + ((long) this.zzd.zzh()) >= jMaxMemory / 25;
            if (!zZzt ? iZzr < iZzs : !(!z11 && iZzr >= iZzs)) {
                z10 = true;
            }
            zzjfVar.zzb = z10;
            if (!z10 && zZzt && !z11) {
                zzeg.zzb("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!zzjfVar.zzb && j11 < 500000) {
                zzeg.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j10 || iZzr >= iZzs) {
            zzjfVar.zzb = false;
        }
        return zzjfVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final boolean zzi(zzlx zzlxVar) {
        long jMin;
        boolean z10;
        boolean z11 = zzlxVar.zzg;
        long j10 = zzlxVar.zze;
        float f10 = zzlxVar.zzf;
        boolean zZzp = zzp(zzlxVar);
        long jZzy = zzfl.zzy(j10, f10);
        if (z11) {
            if (zZzp) {
                jMin = this.zzl;
                z10 = true;
            } else {
                jMin = this.zzk;
                z10 = false;
            }
        } else if (zZzp) {
            jMin = this.zzj;
            z10 = true;
        } else {
            jMin = this.zzi;
            z10 = false;
        }
        long j11 = zzlxVar.zzh;
        if (j11 != C.TIME_UNSET) {
            jMin = Math.min(j11 / 2, jMin);
        }
        if (jMin <= 0 || jZzy >= jMin) {
            return true;
        }
        if (!zzt(z10)) {
            zzqf zzqfVar = zzlxVar.zza;
            if (zzr(zzqfVar) >= zzs(zzqfVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final boolean zzj(zzqf zzqfVar, zzbf zzbfVar, zzxk zzxkVar, long j10) {
        Iterator it = this.zzo.values().iterator();
        while (it.hasNext()) {
            if (((zzjf) it.next()).zzb) {
                return false;
            }
        }
        return true;
    }

    final /* synthetic */ zzabr zzk() {
        return this.zzd;
    }

    final /* synthetic */ ConcurrentHashMap zzl() {
        return this.zzo;
    }
}
