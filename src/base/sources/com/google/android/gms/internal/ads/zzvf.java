package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzvf {
    private final HashSet zza;
    private LoudnessCodecController zzb;

    public zzvf() {
        throw null;
    }

    public final void zza(int i10) {
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.zzb = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i10, zzhcn.zza(), new zzvc(this));
        this.zzb = loudnessCodecControllerCreate;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public final void zzb(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            zzgtj.zzi(this.zza.add(mediaCodec));
        }
    }

    public final void zzc(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.zza.remove(mediaCodec) || (loudnessCodecController = this.zzb) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void zzd() {
        this.zza.clear();
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public zzvf(zzve zzveVar) {
        this.zza = new HashSet();
    }
}
