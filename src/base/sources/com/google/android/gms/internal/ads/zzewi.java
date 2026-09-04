package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzewi implements zzfck {
    private final zzhcg zza;
    private final Context zzb;

    public zzewi(zzhcg zzhcgVar, Context context) {
        this.zza = zzhcgVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzewh
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 13;
    }

    final /* synthetic */ zzewj zzc() {
        int i10;
        int streamMaxVolume;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        float fZzb = com.google.android.gms.ads.internal.zzt.zzi().zzb();
        boolean zZzd = com.google.android.gms.ads.internal.zzt.zzi().zzd();
        if (audioManager == null) {
            return new zzewj(-1, false, false, -1, -1, -1, -1, -1, fZzb, zZzd, true);
        }
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmt)).booleanValue()) {
            int iZzk = com.google.android.gms.ads.internal.zzt.zzf().zzk(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
            i10 = iZzk;
        } else {
            i10 = -1;
            streamMaxVolume = -1;
        }
        return new zzewj(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, i10, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), fZzb, zZzd, false);
    }
}
