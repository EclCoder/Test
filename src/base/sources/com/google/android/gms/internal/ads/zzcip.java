package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcip implements zzbpq {
    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchn zzchnVar = (zzchn) obj;
        zzcma zzcmaVarZzh = zzchnVar.zzh();
        if (zzcmaVarZzh == null) {
            try {
                zzcma zzcmaVar = new zzcma(zzchnVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzchnVar.zzw(zzcmaVar);
                zzcmaVarZzh = zzcmaVar;
            } catch (NullPointerException e10) {
                e = e10;
                Throwable th2 = e;
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to parse videoMeta message.", th2);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e11) {
                e = e11;
                Throwable th3 = e;
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to parse videoMeta message.", th3);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th3, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f10 = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f11 = Float.parseFloat((String) map.get("currentTime"));
        int i12 = Integer.parseInt((String) map.get("playbackState"));
        if (i12 < 0 || i12 > 3) {
            i12 = 0;
        }
        String str = (String) map.get("aspectRatio");
        float f12 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(f11).length() + 45 + String.valueOf(f10).length() + 13 + String.valueOf(zEquals).length() + 19 + String.valueOf(i12).length() + 17 + String.valueOf(str).length());
            sb2.append("Video Meta GMSG: currentTime : ");
            sb2.append(f11);
            sb2.append(" , duration : ");
            sb2.append(f10);
            sb2.append(" , isMuted : ");
            sb2.append(zEquals);
            sb2.append(" , playbackState : ");
            sb2.append(i12);
            sb2.append(" , aspectRatio : ");
            sb2.append(str);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2.toString());
        }
        zzcmaVarZzh.zzs(f11, f10, i12, zEquals, f12);
    }
}
