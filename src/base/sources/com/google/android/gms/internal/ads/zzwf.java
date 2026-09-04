package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzwf {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzvm zza() {
        List listZzb = zzb(MimeTypes.AUDIO_RAW, false, false);
        if (listZzb.isEmpty()) {
            return null;
        }
        return (zzvm) listZzb.get(0);
    }

    public static synchronized List zzb(String str, boolean z10, boolean z11) {
        try {
            zzvw zzvwVar = new zzvw(str, z10, z11);
            HashMap map = zzb;
            List list = (List) map.get(zzvwVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListZzh = zzh(zzvwVar, new zzwa(z10, z11, str.equals("video/mv-hevc")));
            if (z10) {
                arrayListZzh.isEmpty();
            }
            if (MimeTypes.AUDIO_RAW.equals(str)) {
                if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayListZzh.size() == 1 && ((zzvm) arrayListZzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListZzh.add(zzvm.zza("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
                }
                zzj(arrayListZzh, zzwb.zza);
            }
            if (Build.VERSION.SDK_INT < 32 && arrayListZzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzvm) arrayListZzh.get(0)).zza)) {
                arrayListZzh.add((zzvm) arrayListZzh.remove(0));
            }
            zzgwm zzgwmVarZzq = zzgwm.zzq(arrayListZzh);
            map.put(zzvwVar, zzgwmVarZzq);
            return zzgwmVarZzq;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static List zzc(zzvv zzvvVar, zzv zzvVar, boolean z10, boolean z11) {
        List listZza = zzvvVar.zza(zzvVar.zzp, z10, z11);
        List listZzd = zzd(zzvvVar, zzvVar, z10, z11);
        int i10 = zzgwm.zzd;
        zzgwj zzgwjVar = new zzgwj();
        zzgwjVar.zzh(listZza);
        zzgwjVar.zzh(listZzd);
        return zzgwjVar.zzi();
    }

    public static List zzd(zzvv zzvvVar, zzv zzvVar, boolean z10, boolean z11) {
        String strZzg = zzg(zzvVar);
        return strZzg == null ? zzgwm.zzi() : zzvvVar.zza(strZzg, z10, z11);
    }

    public static List zze(final Context context, List list, final zzv zzvVar) {
        ArrayList arrayList = new ArrayList(list);
        zzj(arrayList, new zzwe() { // from class: com.google.android.gms.internal.ads.zzwd
            @Override // com.google.android.gms.internal.ads.zzwe
            public final /* synthetic */ int zza(Object obj) {
                int i10 = zzwf.zza;
                return ((zzvm) obj).zzd(context, zzvVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel zzf(int i10, int i11) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i10;
        codecProfileLevel.level = i11;
        return codecProfileLevel;
    }

    public static String zzg(zzv zzvVar) {
        zzdp zzdpVarZzf;
        String str = zzvVar.zzp;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if ("video/dolby-vision".equals(str) && (zzdpVarZzf = zzdq.zzf(zzvVar)) != null && zzdpVarZzf.zzc()) {
            int iZza = zzdpVarZzf.zza();
            if (iZza == 16 || iZza == 256) {
                return MimeTypes.VIDEO_H265;
            }
            if (iZza == 512) {
                return MimeTypes.VIDEO_H264;
            }
            if (iZza == 1024) {
                zzi zziVar = zzvVar.zzF;
                if (zziVar != null && zziVar.zzd == 6 && zziVar.zzc == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return MimeTypes.VIDEO_H265;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0181 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x01a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x0200 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c A[EDGE_INSN: B:38:0x009c->B:62:0x00f4 BREAK  A[LOOP:1: B:23:0x0066->B:27:0x0074]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0122  */
    /* JADX WARN: Code duplicated, block: B:75:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0126  */
    /* JADX WARN: Code duplicated, block: B:79:0x0130 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:127:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x013c A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:127:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0144  */
    /* JADX WARN: Code duplicated, block: B:86:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x0153 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:127:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0158 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:127:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0168 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:127:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x017b  */
    /* JADX WARN: Code duplicated, block: B:99:0x017f A[ADDED_TO_REGION] */
    private static ArrayList zzh(zzvw zzvwVar, zzvy zzvyVar) throws zzvx {
        String str;
        int i10;
        int i11;
        String str2;
        String str3;
        String str4;
        boolean zZzd;
        boolean z10;
        int i12;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        boolean zIsHardwareAccelerated;
        String strZza;
        boolean zIsVendor;
        zzvw zzvwVar2 = zzvwVar;
        zzvy zzvyVar2 = zzvyVar;
        String str5 = "secure-playback";
        String str6 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str7 = zzvwVar2.zza;
            int iZza = zzvyVar2.zza();
            boolean zZzc = zzvyVar2.zzc();
            int i13 = 0;
            while (i13 < iZza) {
                MediaCodecInfo mediaCodecInfoZzb = zzvyVar2.zzb(i13);
                if (Build.VERSION.SDK_INT < 29 || !mediaCodecInfoZzb.isAlias()) {
                    int i14 = iZza;
                    String name = mediaCodecInfoZzb.getName();
                    if (mediaCodecInfoZzb.isEncoder() || (!zZzc && name.endsWith(".secure"))) {
                        str = str6;
                        i10 = i13;
                        i11 = i14;
                    } else {
                        String[] supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= length) {
                                if (!str7.equals("video/dolby-vision")) {
                                    if (!str7.equals("video/mv-hevc")) {
                                        if (!str7.equals(MimeTypes.AUDIO_ALAC) || !"OMX.lge.alac.decoder".equals(name)) {
                                            if (!str7.equals(MimeTypes.AUDIO_FLAC) || !"OMX.lge.flac.decoder".equals(name)) {
                                                if (!str7.equals(MimeTypes.AUDIO_AC3) || !"OMX.lge.ac3.decoder".equals(name)) {
                                                    str2 = null;
                                                    break;
                                                }
                                                str2 = "audio/lg-ac3";
                                                break;
                                            }
                                            str2 = "audio/x-lg-flac";
                                            break;
                                        }
                                        str2 = "audio/x-lg-alac";
                                        break;
                                    }
                                    if (!"c2.qti.mvhevc.decoder".equals(name) && !"c2.qti.mvhevc.decoder.secure".equals(name)) {
                                        str2 = null;
                                        break;
                                    }
                                    str2 = "video/x-mvhevc";
                                    break;
                                }
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if (!"OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str2 = null;
                                        break;
                                    }
                                    str2 = "video/dv_hevc";
                                    break;
                                }
                                str2 = "video/hevcdv";
                                break;
                            }
                            int i16 = i15;
                            str2 = supportedTypes[i16];
                            if (str2.equalsIgnoreCase(str7)) {
                                break;
                            }
                            i15 = i16 + 1;
                        }
                        if (str2 != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str2);
                                boolean zZzd2 = zzvyVar2.zzd(str6, str2, capabilitiesForType);
                                boolean zZze = zzvyVar2.zze(str6, str2, capabilitiesForType);
                                str = str6;
                                if (zzvwVar2.zzc) {
                                    if (zZzd2) {
                                        zZzd = zzvyVar2.zzd(str5, str2, capabilitiesForType);
                                        boolean zZze2 = zzvyVar2.zze(str5, str2, capabilitiesForType);
                                        z10 = zzvwVar2.zzb;
                                        if (z10) {
                                            if (z10) {
                                                if (zZzd) {
                                                    zZzd = true;
                                                }
                                            }
                                            i12 = Build.VERSION.SDK_INT;
                                            str5 = str5;
                                            if (i12 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                codecCapabilities = capabilitiesForType;
                                            } else {
                                                codecCapabilities = capabilitiesForType;
                                                if (zzi(mediaCodecInfoZzb, str7)) {
                                                    zIsHardwareAccelerated = false;
                                                } else {
                                                    zIsHardwareAccelerated = true;
                                                }
                                            }
                                            boolean zZzi = zzi(mediaCodecInfoZzb, str7);
                                            boolean z11 = zIsHardwareAccelerated;
                                            if (i12 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzgss.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZzc) {
                                                boolean z12 = zIsVendor;
                                                i10 = i13;
                                                i11 = i14;
                                                MediaCodecInfo.CodecCapabilities codecCapabilities2 = codecCapabilities;
                                                str3 = str2;
                                                str4 = name;
                                                if (zZzc) {
                                                    continue;
                                                }
                                            } else {
                                                boolean z13 = zIsVendor;
                                                i10 = i13;
                                                i11 = i14;
                                                MediaCodecInfo.CodecCapabilities codecCapabilities3 = codecCapabilities;
                                                str3 = str2;
                                                str4 = name;
                                                if (zZzc) {
                                                    continue;
                                                }
                                            }
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 24 + str3.length() + 1);
                                            sb2.append("Failed to query codec ");
                                            sb2.append(str4);
                                            sb2.append(" (");
                                            sb2.append(str3);
                                            sb2.append(")");
                                            zzeg.zze("MediaCodecUtil", sb2.toString());
                                            throw e;
                                        }
                                        if (z10) {
                                            if (zZzd) {
                                                zZzd = true;
                                            }
                                        }
                                        i12 = Build.VERSION.SDK_INT;
                                        str5 = str5;
                                        if (i12 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            codecCapabilities = capabilitiesForType;
                                        } else {
                                            codecCapabilities = capabilitiesForType;
                                            if (zzi(mediaCodecInfoZzb, str7)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                        }
                                        boolean zZzi2 = zzi(mediaCodecInfoZzb, str7);
                                        boolean z14 = zIsHardwareAccelerated;
                                        if (i12 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzgss.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZzc) {
                                            boolean z15 = zIsVendor;
                                            i10 = i13;
                                            i11 = i14;
                                            MediaCodecInfo.CodecCapabilities codecCapabilities4 = codecCapabilities;
                                            str3 = str2;
                                            str4 = name;
                                            if (zZzc) {
                                                continue;
                                            }
                                        } else {
                                            boolean z16 = zIsVendor;
                                            i10 = i13;
                                            i11 = i14;
                                            MediaCodecInfo.CodecCapabilities codecCapabilities5 = codecCapabilities;
                                            str3 = str2;
                                            str4 = name;
                                            if (zZzc) {
                                                continue;
                                            }
                                        }
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 24 + str3.length() + 1);
                                        sb3.append("Failed to query codec ");
                                        sb3.append(str4);
                                        sb3.append(" (");
                                        sb3.append(str3);
                                        sb3.append(")");
                                        zzeg.zze("MediaCodecUtil", sb3.toString());
                                        throw e;
                                    }
                                } else if (!zZze) {
                                    zZzd = zzvyVar2.zzd(str5, str2, capabilitiesForType);
                                    boolean zZze3 = zzvyVar2.zze(str5, str2, capabilitiesForType);
                                    z10 = zzvwVar2.zzb;
                                    if (z10 || !zZze3) {
                                        if (z10) {
                                            if (zZzd) {
                                                zZzd = true;
                                            }
                                        }
                                        i12 = Build.VERSION.SDK_INT;
                                        str5 = str5;
                                        if (i12 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            codecCapabilities = capabilitiesForType;
                                        } else {
                                            codecCapabilities = capabilitiesForType;
                                            if (zzi(mediaCodecInfoZzb, str7)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                        }
                                        boolean zZzi3 = zzi(mediaCodecInfoZzb, str7);
                                        boolean z17 = zIsHardwareAccelerated;
                                        if (i12 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzgss.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = true;
                                            }
                                        }
                                        if ((zZzc || z10 != zZzd) && (zZzc || z10)) {
                                            boolean z18 = zIsVendor;
                                            i10 = i13;
                                            i11 = i14;
                                            MediaCodecInfo.CodecCapabilities codecCapabilities6 = codecCapabilities;
                                            str3 = str2;
                                            str4 = name;
                                            if (zZzc && zZzd) {
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 7);
                                                sb4.append(str4);
                                                sb4.append(".secure");
                                                arrayList.add(zzvm.zza(sb4.toString(), str7, str3, codecCapabilities6, z17, zZzi3, z18, false, true));
                                                return arrayList;
                                            }
                                        } else {
                                            boolean z19 = zIsVendor;
                                            i10 = i13;
                                            i11 = i14;
                                            str3 = str2;
                                            try {
                                                str4 = name;
                                                try {
                                                    arrayList.add(zzvm.zza(name, str7, str3, codecCapabilities, z17, zZzi3, z19, false, false));
                                                } catch (Exception e10) {
                                                    e = e10;
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                str4 = name;
                                                StringBuilder sb5 = new StringBuilder(String.valueOf(str4).length() + 24 + str3.length() + 1);
                                                sb5.append("Failed to query codec ");
                                                sb5.append(str4);
                                                sb5.append(" (");
                                                sb5.append(str3);
                                                sb5.append(")");
                                                zzeg.zze("MediaCodecUtil", sb5.toString());
                                                throw e;
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                str3 = str2;
                            }
                        } else {
                            str = str6;
                        }
                        i10 = i13;
                        i11 = i14;
                    }
                } else {
                    str5 = str5;
                    str = str6;
                    i11 = iZza;
                    i10 = i13;
                }
                i13 = i10 + 1;
                zzvyVar2 = zzvyVar;
                iZza = i11;
                str5 = str5;
                str6 = str;
                zzvwVar2 = zzvwVar;
            }
            return arrayList;
        } catch (Exception e13) {
            throw new zzvx(e13, null);
        }
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzas.zza(str)) {
            return true;
        }
        String strZza = zzgss.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.") || ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google."))) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }

    private static void zzj(List list, final zzwe zzweVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwc
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i10 = zzwf.zza;
                zzwe zzweVar2 = zzweVar;
                return zzweVar2.zza(obj2) - zzweVar2.zza(obj);
            }
        });
    }
}
