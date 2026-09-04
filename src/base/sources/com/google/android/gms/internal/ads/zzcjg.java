package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcjg extends zzcja implements zzin {
    private static final AtomicInteger zzo = new AtomicInteger(0);
    private String zzd;
    private final zzchm zze;
    private boolean zzf;
    private final zzcjf zzg;
    private final zzcij zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcjg(zzchn zzchnVar, zzchm zzchmVar) {
        super(zzchnVar);
        this.zze = zzchmVar;
        this.zzg = new zzcjf();
        this.zzh = new zzcij();
        this.zzk = new Object();
        this.zzl = (String) zzgth.zzd(zzchnVar != null ? zzchnVar.zzn() : null).zza("");
        this.zzm = zzchnVar != null ? zzchnVar.zzp() : 0;
        zzo.incrementAndGet();
    }

    public static int zzr() {
        return zzo.get();
    }

    protected static final String zzv(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzg(str)));
    }

    private final void zzx() {
        int iZza = (int) this.zzg.zza();
        int iZza2 = (int) this.zzh.zza(this.zzi);
        int iPosition = this.zzi.position();
        int iRound = Math.round(iZza2 * (iPosition / iZza));
        int iZzP = zzche.zzP();
        int iZzQ = zzche.zzQ();
        String str = this.zzd;
        zzn(str, zzv(str), iPosition, iZza, iRound, iZza2, iRound > 0, iZzP, iZzQ);
    }

    @Override // com.google.android.gms.internal.ads.zzcja, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzo.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzin
    public final void zzb(zzhp zzhpVar, zzht zzhtVar, boolean z10) {
        if (zzhpVar instanceof zzia) {
            this.zzg.zzb((zzia) zzhpVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // com.google.android.gms.internal.ads.zzcja
    public final boolean zze(String str) {
        String str2;
        String str3;
        Clock clock;
        this.zzd = str;
        String str4 = "error";
        String strZzv = zzv(str);
        try {
            zzhw zzhwVar = new zzhw();
            zzhwVar.zzb(this.zzb);
            zzchm zzchmVar = this.zze;
            zzhwVar.zzc(zzchmVar.zzd);
            zzhwVar.zzd(zzchmVar.zze);
            zzhwVar.zze(true);
            zzhwVar.zzf(this);
            zzhp zzhpVarZza = zzhwVar.zza();
            if (zzchmVar.zzi) {
                zzhpVarZza = new zzcih(this.zza, zzhpVarZza, this.zzl, this.zzm, null, null);
            }
            zzhpVarZza.zzb(new zzht(Uri.parse(str), 0L, -1L, null));
            zzchn zzchnVar = (zzchn) this.zzc.get();
            if (zzchnVar != null) {
                zzchnVar.zzt(strZzv, this);
            }
            Clock clockZzk = com.google.android.gms.ads.internal.zzt.zzk();
            long jCurrentTimeMillis = clockZzk.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzam)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzal)).longValue();
            this.zzi = ByteBuffer.allocate(zzchmVar.zzc);
            byte[] bArr = new byte[8192];
            long j10 = jCurrentTimeMillis;
            while (true) {
                str2 = str4;
                try {
                    int iZza = zzhpVarZza.zza(bArr, 0, Math.min(this.zzi.remaining(), 8192));
                    if (iZza == -1) {
                        this.zzn = true;
                        zzp(str, strZzv, (int) this.zzh.zza(this.zzi));
                        break;
                    }
                    synchronized (this.zzk) {
                        clock = clockZzk;
                        try {
                            if (!this.zzf) {
                                this.zzi.put(bArr, 0, iZza);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (this.zzi.remaining() <= 0) {
                        zzx();
                        break;
                    }
                    str3 = this.zzf;
                    try {
                        if (str3 != 0) {
                            int iLimit = this.zzi.limit();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iLimit).length() + 24);
                            sb2.append("Precache abort at ");
                            sb2.append(iLimit);
                            sb2.append(" bytes");
                            throw new IOException(sb2.toString());
                        }
                        long jCurrentTimeMillis2 = clock.currentTimeMillis();
                        if (jCurrentTimeMillis2 - j10 >= jLongValue) {
                            zzx();
                            j10 = jCurrentTimeMillis2;
                        }
                        if (jCurrentTimeMillis2 - jCurrentTimeMillis > 1000 * jLongValue2) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(jLongValue2).length() + 29);
                            sb3.append("Timeout exceeded. Limit: ");
                            sb3.append(jLongValue2);
                            sb3.append(" sec");
                            throw new IOException(sb3.toString());
                        }
                        str4 = str2;
                        clockZzk = clock;
                        jCurrentTimeMillis = jCurrentTimeMillis;
                    } catch (Exception e10) {
                        e = e10;
                        String canonicalName = e.getClass().getCanonicalName();
                        String message = e.getMessage();
                        StringBuilder sb4 = new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length());
                        sb4.append(canonicalName);
                        sb4.append(":");
                        sb4.append(message);
                        String string = sb4.toString();
                        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 34 + string.length());
                        sb5.append("Failed to preload url ");
                        sb5.append(str);
                        sb5.append(" Exception: ");
                        sb5.append(string);
                        String string2 = sb5.toString();
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(string2);
                        zzq(str, strZzv, str3, string);
                        return false;
                    }
                } catch (Exception e11) {
                    e = e11;
                    str3 = str2;
                    String canonicalName2 = e.getClass().getCanonicalName();
                    String message2 = e.getMessage();
                    StringBuilder sb6 = new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length());
                    sb6.append(canonicalName2);
                    sb6.append(":");
                    sb6.append(message2);
                    String string3 = sb6.toString();
                    StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 34 + string3.length());
                    sb7.append("Failed to preload url ");
                    sb7.append(str);
                    sb7.append(" Exception: ");
                    sb7.append(string3);
                    String string4 = sb7.toString();
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(string4);
                    zzq(str, strZzv, str3, string3);
                    return false;
                }
            }
            return true;
        } catch (Exception e12) {
            e = e12;
            str2 = str4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final void zzl() {
        this.zzf = true;
    }

    public final String zzs() {
        return this.zzd;
    }

    public final boolean zzt() {
        return this.zzn;
    }

    public final ByteBuffer zzu() {
        synchronized (this.zzk) {
            try {
                ByteBuffer byteBuffer = this.zzi;
                if (byteBuffer != null && !this.zzj) {
                    byteBuffer.flip();
                    this.zzj = true;
                }
                this.zzf = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzin
    public final void zza(zzhp zzhpVar, zzht zzhtVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzin
    public final void zzd(zzhp zzhpVar, zzht zzhtVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzin
    public final void zzc(zzhp zzhpVar, zzht zzhtVar, boolean z10, int i10) {
    }
}
