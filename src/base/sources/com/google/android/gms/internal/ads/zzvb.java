package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzvb implements zzvh {
    private final Context zza;

    @Deprecated
    public zzvb() {
        this.zza = null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    @Override // com.google.android.gms.internal.ads.zzvh
    public final zzvj zzc(zzvg zzvgVar) throws Throwable {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || ((context = this.zza) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int iZzf = zzas.zzf(zzvgVar.zzc.zzp);
            zzeg.zzb("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzfl.zzS(iZzf)));
            zzut zzutVar = new zzut(iZzf);
            zzutVar.zza(true);
            return zzutVar.zzb(zzvgVar);
        }
        MediaCodec mediaCodec = null;
        try {
            zzvm zzvmVar = zzvgVar.zza;
            String str = zzvmVar.zza;
            Trace.beginSection("createCodec:".concat(str));
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                Surface surface = zzvgVar.zzd;
                int i11 = 0;
                if (surface == null && zzvmVar.zzh && i10 >= 35) {
                    i11 = 8;
                }
                mediaCodecCreateByCodecName.configure(zzvgVar.zzb, surface, (MediaCrypto) null, i11);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName.start();
                Trace.endSection();
                return new zzwg(mediaCodecCreateByCodecName, zzvgVar.zzf, null);
            } catch (IOException e10) {
                e = e10;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            } catch (RuntimeException e11) {
                e = e11;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (IOException e12) {
            e = e12;
        } catch (RuntimeException e13) {
            e = e13;
        }
    }

    public zzvb(Context context, zzgub zzgubVar, zzgub zzgubVar2) {
        this.zza = context;
    }
}
