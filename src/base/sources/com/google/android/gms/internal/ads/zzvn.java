package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzvn {
    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int iZzc = zzc(supportedPerformancePoints, g2.c.a(i10, i11, (int) d10));
        boolean z10 = true;
        if (iZzc == 1 && zzvo.zza == null) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 37) {
                z10 = false;
            } else {
                int iZzb = zzb(true);
                if (i12 < 35 ? !(zzb(false) != 2 || iZzb == 1) : iZzb != 1) {
                    z10 = false;
                }
            }
            zzvo.zza = Boolean.valueOf(z10);
            if (zzvo.zza.booleanValue()) {
                return 0;
            }
        }
        return iZzc;
    }

    private static int zzb(boolean z10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            zzt zztVar = new zzt();
            zztVar.zzo(MimeTypes.VIDEO_H264);
            zzv zzvVarZzO = zztVar.zzO();
            if (zzvVarZzO.zzp != null) {
                List listZzc = zzwf.zzc(zzvv.zzb, zzvVarZzO, z10, false);
                for (int i10 = 0; i10 < listZzc.size(); i10++) {
                    if (((zzvm) listZzc.get(i10)).zzd != null && (videoCapabilities = ((zzvm) listZzc.get(i10)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        g2.d.a();
                        return zzc(supportedPerformancePoints, g2.c.a(1280, 720, 60));
                    }
                }
            }
        } catch (zzvx unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (g2.e.a(list.get(i10)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
