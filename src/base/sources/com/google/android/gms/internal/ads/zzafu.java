package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzafu implements zzage {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzaft zzc = new zzaft(zzafr.zza);
    private static final zzaft zzd = new zzaft(zzafq.zza);
    private zzgwm zze;
    private final zzanj zzf = new zzane();

    private final void zzc(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new zzapi());
                break;
            case 1:
                list.add(new zzapl());
                break;
            case 2:
                list.add(new zzapo(0));
                break;
            case 3:
                list.add(new zzahp(0));
                break;
            case 4:
                zzafy zzafyVarZza = zzc.zza(0);
                if (zzafyVarZza == null) {
                    list.add(new zzaig(0));
                } else {
                    list.add(zzafyVarZza);
                }
                break;
            case 5:
                list.add(new zzaij());
                break;
            case 6:
                list.add(new zzakh(this.zzf, 0));
                break;
            case 7:
                list.add(new zzakp(0));
                break;
            case 8:
                zzanj zzanjVar = this.zzf;
                list.add(new zzalr(zzanjVar, 704, null, null, zzgwm.zzi(), null));
                list.add(new zzamc(zzanjVar, 160));
                break;
            case 9:
                list.add(new zzams());
                break;
            case 10:
                list.add(new zzaqs());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzgwm.zzi();
                }
                list.add(new zzard(1, 0, this.zzf, new zzfi(0L), new zzapq(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzarq());
                break;
            case 14:
                list.add(new zzaiq(0));
                break;
            case 15:
                zzafy zzafyVarZza2 = zzd.zza(new Object[0]);
                if (zzafyVarZza2 != null) {
                    list.add(zzafyVarZza2);
                }
                break;
            case 16:
                list.add(new zzaht(0, this.zzf));
                break;
            case 17:
                list.add(new zzanc());
                break;
            case 18:
                list.add(new zzarv());
                break;
            case 19:
                list.add(new zzaib());
                break;
            case 20:
                list.add(new zzaip(0));
                break;
            case 21:
                list.add(new zzaia());
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzage
    public final synchronized zzafy[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    @Override // com.google.android.gms.internal.ads.zzage
    public final synchronized zzafy[] zzb(Uri uri, Map map) {
        ArrayList arrayList;
        int i10;
        int i11;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = null;
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
            }
            if (str != null) {
                String strZzh = zzas.zzh(str);
                switch (strZzh.hashCode()) {
                    case -2123537834:
                        if (strZzh.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                            i10 = 0;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1662384011:
                        if (strZzh.equals("video/mp2p")) {
                            i10 = 10;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1662384007:
                        if (strZzh.equals("video/mp2t")) {
                            i10 = 11;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1662095187:
                        if (strZzh.equals(MimeTypes.VIDEO_WEBM)) {
                            i10 = 6;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1606874997:
                        if (strZzh.equals(MimeTypes.AUDIO_AMR_WB)) {
                            i10 = 3;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1487656890:
                        if (strZzh.equals("image/avif")) {
                            i10 = 21;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1487464693:
                        if (strZzh.equals("image/heic")) {
                            i10 = 20;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1487464690:
                        if (strZzh.equals("image/heif")) {
                            i10 = 20;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1487394660:
                        if (strZzh.equals("image/jpeg")) {
                            i10 = 14;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1487018032:
                        if (strZzh.equals("image/webp")) {
                            i10 = 18;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1248337486:
                        if (strZzh.equals(MimeTypes.APPLICATION_MP4)) {
                            i10 = 8;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1079884372:
                        if (strZzh.equals("video/x-msvideo")) {
                            i10 = 16;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1004728940:
                        if (strZzh.equals(MimeTypes.TEXT_VTT)) {
                            i10 = 13;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -879272239:
                        if (strZzh.equals("image/bmp")) {
                            i10 = 19;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -879258763:
                        if (strZzh.equals("image/png")) {
                            i10 = 17;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -387023398:
                        if (strZzh.equals("audio/x-matroska")) {
                            i10 = 6;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -43467528:
                        if (strZzh.equals(MimeTypes.APPLICATION_WEBM)) {
                            i10 = 6;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 13915911:
                        if (strZzh.equals("video/x-flv")) {
                            i10 = 5;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 187078296:
                        if (strZzh.equals(MimeTypes.AUDIO_AC3)) {
                            i10 = 0;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 187078297:
                        if (strZzh.equals(NhHRaDJCHtCTJR.EIzcGkllW)) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 187078669:
                        if (strZzh.equals("audio/amr")) {
                            i10 = 3;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 187090232:
                        if (strZzh.equals(MimeTypes.AUDIO_MP4)) {
                            i10 = 8;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 187091926:
                        if (strZzh.equals("audio/ogg")) {
                            i10 = 9;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 187099443:
                        if (strZzh.equals("audio/wav")) {
                            i10 = 12;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 1331848029:
                        if (strZzh.equals(MimeTypes.VIDEO_MP4)) {
                            i10 = 8;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 1503095341:
                        if (strZzh.equals(MimeTypes.AUDIO_AMR_NB)) {
                            i10 = 3;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 1504578661:
                        if (strZzh.equals(MimeTypes.AUDIO_E_AC3)) {
                            i10 = 0;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 1504619009:
                        if (strZzh.equals(MimeTypes.AUDIO_FLAC)) {
                            i10 = 4;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 1504824762:
                        if (strZzh.equals("audio/midi")) {
                            i10 = 15;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 1504831518:
                        if (strZzh.equals(MimeTypes.AUDIO_MPEG)) {
                            i10 = 7;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 1505118770:
                        if (strZzh.equals(MimeTypes.AUDIO_WEBM)) {
                            i10 = 6;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 2039520277:
                        if (strZzh.equals("video/x-matroska")) {
                            i10 = 6;
                        } else {
                            i10 = -1;
                        }
                        break;
                    default:
                        i10 = -1;
                        break;
                }
            } else {
                i10 = -1;
            }
            if (i10 != -1) {
                zzc(i10, arrayList);
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                i11 = -1;
            } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                i11 = 0;
            } else if (lastPathSegment.endsWith(".ac4")) {
                i11 = 1;
            } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                i11 = 2;
            } else if (lastPathSegment.endsWith(".amr")) {
                i11 = 3;
            } else if (lastPathSegment.endsWith(".flac")) {
                i11 = 4;
            } else if (lastPathSegment.endsWith(".flv")) {
                i11 = 5;
            } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                i11 = 15;
            } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                i11 = 6;
            } else if (lastPathSegment.endsWith(".mp3")) {
                i11 = 7;
            } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                i11 = 8;
            } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                i11 = 9;
            } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                i11 = 10;
            } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                i11 = 11;
            } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                i11 = 12;
            } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                i11 = 13;
            } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                i11 = 14;
            } else if (lastPathSegment.endsWith(".avi")) {
                i11 = 16;
            } else if (lastPathSegment.endsWith(".png")) {
                i11 = 17;
            } else if (lastPathSegment.endsWith(".webp")) {
                i11 = 18;
            } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
                i11 = 19;
            } else if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
                i11 = 20;
            } else if (lastPathSegment.endsWith(".avif")) {
                i11 = 21;
            } else {
                i11 = -1;
            }
            if (i11 != -1 && i11 != i10) {
                zzc(i11, arrayList);
            }
            int[] iArr = zzb;
            for (int i12 = 0; i12 < 21; i12++) {
                int i13 = iArr[i12];
                if (i13 != i10 && i13 != i11) {
                    zzc(i13, arrayList);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (zzafy[]) arrayList.toArray(new zzafy[0]);
    }
}
