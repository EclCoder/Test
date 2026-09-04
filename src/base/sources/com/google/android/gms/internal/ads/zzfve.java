package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfve extends ContentObserver {
    private final Handler zza;
    private final Context zzb;
    private final AudioManager zzc;
    private final AtomicReference zzd;
    private final AtomicBoolean zze;
    private final ExecutorService zzf;
    private final zzfvq zzg;

    public zzfve(Handler handler, Context context, zzfva zzfvaVar, zzfvq zzfvqVar) {
        super(handler);
        this.zzd = new AtomicReference(Float.valueOf(-1.0f));
        this.zze = new AtomicBoolean(false);
        this.zzf = Executors.newSingleThreadExecutor();
        this.zza = handler;
        this.zzb = context;
        this.zzc = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.zzg = zzfvqVar;
    }

    private final void zzh() {
        this.zzf.submit(new zzfvd(this));
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        if (this.zze.getAndSet(true)) {
            return;
        }
        zzh();
    }

    public final void zza() {
        zzh();
        this.zzb.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzb() {
        this.zzb.getContentResolver().unregisterContentObserver(this);
    }

    final /* synthetic */ float zzc() {
        AudioManager audioManager = this.zzc;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f10 = 0.0f;
        if (streamMaxVolume > 0) {
            if (streamVolume <= 0) {
                return 0.0f;
            }
            f10 = streamVolume / streamMaxVolume;
            if (f10 > 1.0f) {
                return 1.0f;
            }
        }
        return f10;
    }

    final /* synthetic */ Handler zzd() {
        return this.zza;
    }

    final /* synthetic */ AtomicReference zze() {
        return this.zzd;
    }

    final /* synthetic */ AtomicBoolean zzf() {
        return this.zze;
    }

    final /* synthetic */ zzfvq zzg() {
        return this.zzg;
    }
}
