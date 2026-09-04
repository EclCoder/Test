package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaey {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, Sdk$SDKError.b.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, Sdk$SDKError.b.TPAT_ERROR_VALUE, 139, 174, Sdk$SDKError.b.INVALID_BID_PAYLOAD_VALUE, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzv zza(zzet zzetVar, String str, String str2, zzq zzqVar) {
        zzes zzesVar = new zzes();
        zzesVar.zza(zzetVar);
        int i10 = zzc[zzesVar.zzj(2)];
        zzesVar.zzh(8);
        int i11 = zze[zzesVar.zzj(3)];
        if (zzesVar.zzj(1) != 0) {
            i11++;
        }
        int i12 = zzf[zzesVar.zzj(5)] * 1000;
        zzesVar.zzm();
        zzetVar.zzh(zzesVar.zze());
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzo(MimeTypes.AUDIO_AC3);
        zztVar.zzG(i11);
        zztVar.zzH(i10);
        zztVar.zzs(zzqVar);
        zztVar.zze(str2);
        zztVar.zzi(i12);
        zztVar.zzj(i12);
        return zztVar.zzO();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static zzv zzb(zzet zzetVar, String str, String str2, zzq zzqVar) {
        String str3;
        zzes zzesVar = new zzes();
        zzesVar.zza(zzetVar);
        int iZzj = zzesVar.zzj(13) * 1000;
        zzesVar.zzh(3);
        int i10 = zzc[zzesVar.zzj(2)];
        zzesVar.zzh(10);
        int i11 = zze[zzesVar.zzj(3)];
        if (zzesVar.zzj(1) != 0) {
            i11++;
        }
        zzesVar.zzh(3);
        int iZzj2 = zzesVar.zzj(4);
        zzesVar.zzh(1);
        if (iZzj2 > 0) {
            zzesVar.zzh(6);
            if (zzesVar.zzj(1) != 0) {
                i11 += 2;
            }
            zzesVar.zzh(1);
        }
        if (zzesVar.zzc() > 7) {
            zzesVar.zzh(7);
            if (zzesVar.zzj(1) != 0) {
                str3 = MimeTypes.AUDIO_E_AC3_JOC;
            } else {
                str3 = MimeTypes.AUDIO_E_AC3;
            }
        } else {
            str3 = MimeTypes.AUDIO_E_AC3;
        }
        zzesVar.zzm();
        zzetVar.zzh(zzesVar.zze());
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzo(str3);
        zztVar.zzG(i11);
        zztVar.zzH(i10);
        zztVar.zzs(zzqVar);
        zztVar.zze(str2);
        zztVar.zzj(iZzj);
        return zztVar.zzO();
    }

    public static zzaex zzc(zzes zzesVar) {
        int iZzf;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iZzd = zzesVar.zzd();
        zzesVar.zzh(40);
        int iZzj = zzesVar.zzj(5);
        zzesVar.zzf(iZzd);
        int i18 = -1;
        if (iZzj > 10) {
            zzesVar.zzh(16);
            int iZzj2 = zzesVar.zzj(2);
            if (iZzj2 == 0) {
                i18 = 0;
            } else if (iZzj2 == 1) {
                i18 = 1;
            } else if (iZzj2 == 2) {
                i18 = 2;
            }
            zzesVar.zzh(3);
            int iZzj3 = zzesVar.zzj(11) + 1;
            int iZzj4 = zzesVar.zzj(2);
            if (iZzj4 == 3) {
                i10 = zzd[zzesVar.zzj(2)];
                i15 = 6;
                i14 = 3;
            } else {
                int iZzj5 = zzesVar.zzj(2);
                int i19 = zzb[iZzj5];
                i14 = iZzj5;
                i10 = zzc[iZzj4];
                i15 = i19;
            }
            iZzf = iZzj3 + iZzj3;
            int i20 = (iZzf * i10) / (i15 * 32);
            int iZzj6 = zzesVar.zzj(3);
            boolean zZzi = zzesVar.zzi();
            i11 = zze[iZzj6] + (zZzi ? 1 : 0);
            zzesVar.zzh(10);
            if (zzesVar.zzi()) {
                zzesVar.zzh(8);
            }
            if (iZzj6 == 0) {
                zzesVar.zzh(5);
                if (zzesVar.zzi()) {
                    zzesVar.zzh(8);
                }
                i16 = 0;
                iZzj6 = 0;
            } else {
                i16 = iZzj6;
            }
            if (i18 == 1) {
                if (zzesVar.zzi()) {
                    zzesVar.zzh(16);
                }
                i17 = 1;
            } else {
                i17 = i18;
            }
            if (zzesVar.zzi()) {
                if (i16 > 2) {
                    zzesVar.zzh(2);
                }
                if ((i16 & 1) != 0 && i16 > 2) {
                    zzesVar.zzh(6);
                }
                if ((i16 & 4) != 0) {
                    zzesVar.zzh(6);
                }
                if (zZzi && zzesVar.zzi()) {
                    zzesVar.zzh(5);
                }
                if (i17 == 0) {
                    if (zzesVar.zzi()) {
                        zzesVar.zzh(6);
                    }
                    if (i16 == 0 && zzesVar.zzi()) {
                        zzesVar.zzh(6);
                    }
                    if (zzesVar.zzi()) {
                        zzesVar.zzh(6);
                    }
                    int iZzj7 = zzesVar.zzj(2);
                    if (iZzj7 == 1) {
                        zzesVar.zzh(5);
                    } else if (iZzj7 == 2) {
                        zzesVar.zzh(12);
                    } else if (iZzj7 == 3) {
                        int iZzj8 = zzesVar.zzj(5);
                        if (zzesVar.zzi()) {
                            zzesVar.zzh(5);
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(4);
                            }
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(4);
                            }
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(4);
                            }
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(4);
                            }
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(4);
                            }
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(4);
                            }
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(4);
                            }
                            if (zzesVar.zzi()) {
                                if (zzesVar.zzi()) {
                                    zzesVar.zzh(4);
                                }
                                if (zzesVar.zzi()) {
                                    zzesVar.zzh(4);
                                }
                            }
                        }
                        if (zzesVar.zzi()) {
                            zzesVar.zzh(5);
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(7);
                                if (zzesVar.zzi()) {
                                    zzesVar.zzh(8);
                                }
                            }
                        }
                        zzesVar.zzh((iZzj8 + 2) * 8);
                        zzesVar.zzm();
                    }
                    if (i16 < 2) {
                        if (zzesVar.zzi()) {
                            zzesVar.zzh(14);
                        }
                        if (iZzj6 == 0 && zzesVar.zzi()) {
                            zzesVar.zzh(14);
                        }
                    }
                    if (!zzesVar.zzi()) {
                        i17 = 0;
                    } else if (i14 == 0) {
                        zzesVar.zzh(5);
                        i17 = 0;
                        i14 = 0;
                    } else {
                        for (int i21 = 0; i21 < i15; i21++) {
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(5);
                            }
                        }
                        i17 = 0;
                    }
                }
            }
            if (zzesVar.zzi()) {
                zzesVar.zzh(5);
                if (i16 == 2) {
                    zzesVar.zzh(4);
                    i16 = 2;
                }
                if (i16 >= 6) {
                    zzesVar.zzh(2);
                }
                if (zzesVar.zzi()) {
                    zzesVar.zzh(8);
                }
                if (i16 == 0 && zzesVar.zzi()) {
                    zzesVar.zzh(8);
                }
                if (iZzj4 < 3) {
                    zzesVar.zzg();
                }
            }
            if (i17 == 0 && i14 != 3) {
                zzesVar.zzg();
            }
            if (i17 == 2 && (i14 == 3 || zzesVar.zzi())) {
                zzesVar.zzh(6);
            }
            i12 = i15 * 256;
            str = (zzesVar.zzi() && zzesVar.zzj(6) == 1 && zzesVar.zzj(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i13 = i20;
        } else {
            zzesVar.zzh(32);
            int iZzj9 = zzesVar.zzj(2);
            String str2 = iZzj9 == 3 ? null : MimeTypes.AUDIO_AC3;
            int iZzj10 = zzesVar.zzj(6);
            int i22 = zzf[iZzj10 / 2] * 1000;
            iZzf = zzf(iZzj9, iZzj10);
            zzesVar.zzh(8);
            int iZzj11 = zzesVar.zzj(3);
            if ((iZzj11 & 1) != 0 && iZzj11 != 1) {
                zzesVar.zzh(2);
            }
            if ((iZzj11 & 4) != 0) {
                zzesVar.zzh(2);
            }
            if (iZzj11 == 2) {
                zzesVar.zzh(2);
            }
            i10 = iZzj9 < 3 ? zzc[iZzj9] : -1;
            i11 = zze[iZzj11] + (zzesVar.zzi() ? 1 : 0);
            i12 = 1536;
            str = str2;
            i13 = i22;
        }
        return new zzaex(str, i18, i11, i10, iZzf, i12, i13, null);
    }

    public static int zzd(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b10 = bArr[4];
            return zzf((b10 & 192) >> 6, b10 & 63);
        }
        int i10 = bArr[2] & 7;
        int i11 = ((bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i10 << 8)) + 1;
        return i11 + i11;
    }

    public static int zze(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    private static int zzf(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || (i12 = i11 >> 1) >= 19) {
            return -1;
        }
        int i13 = zzc[i10];
        if (i13 == 44100) {
            int i14 = zzg[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = zzf[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }
}
