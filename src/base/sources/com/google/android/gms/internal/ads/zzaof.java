package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaof implements zzanl {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzet zze = new zzet();

    public static float zzb(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long zzc(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i10 + 2);
        strGroup2.getClass();
        long j11 = j10 + (Long.parseLong(strGroup2) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        String strGroup3 = matcher.group(i10 + 3);
        strGroup3.getClass();
        long j12 = j11 + (Long.parseLong(strGroup3) * 1000);
        String strGroup4 = matcher.group(i10 + 4);
        if (strGroup4 != null) {
            j12 += Long.parseLong(strGroup4);
        }
        return j12 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:46:0x010e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0128  */
    /* JADX WARN: Code duplicated, block: B:63:0x0141  */
    /* JADX WARN: Code duplicated, block: B:66:0x0149  */
    /* JADX WARN: Code duplicated, block: B:82:0x0175  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzanl
    public final void zza(byte[] bArr, int i10, int i11, zzank zzankVar, zzdt zzdtVar) {
        zzet zzetVar;
        String str;
        zzcx zzcxVarZzr;
        zzaof zzaofVar = this;
        zzet zzetVar2 = zzaofVar.zze;
        zzetVar2.zzb(bArr, i10 + i11);
        zzetVar2.zzh(i10);
        Charset charsetZzR = zzetVar2.zzR();
        if (charsetZzR == null) {
            charsetZzR = StandardCharsets.UTF_8;
        }
        while (true) {
            String strZzN = zzetVar2.zzN(charsetZzR);
            if (strZzN == null) {
                return;
            }
            if (strZzN.isEmpty()) {
                zzetVar = zzetVar2;
            } else {
                try {
                    Integer.parseInt(strZzN);
                    zzet zzetVar3 = zzaofVar.zze;
                    String strZzN2 = zzetVar3.zzN(charsetZzR);
                    if (strZzN2 == null) {
                        zzeg.zzc("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = zza.matcher(strZzN2);
                    if (matcher.matches()) {
                        long jZzc = zzc(matcher, 1);
                        long jZzc2 = zzc(matcher, 6);
                        StringBuilder sb2 = zzaofVar.zzc;
                        int i12 = 0;
                        sb2.setLength(0);
                        ArrayList arrayList = zzaofVar.zzd;
                        arrayList.clear();
                        String strZzN3 = zzetVar3.zzN(charsetZzR);
                        while (!TextUtils.isEmpty(strZzN3)) {
                            if (sb2.length() > 0) {
                                sb2.append("<br>");
                            }
                            String strTrim = strZzN3.trim();
                            StringBuilder sb3 = new StringBuilder(strTrim);
                            Matcher matcher2 = zzb.matcher(strTrim);
                            int i13 = i12;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList.add(strGroup);
                                int iStart = matcher2.start() - i13;
                                int length = strGroup.length();
                                sb3.replace(iStart, iStart + length, "");
                                i13 += length;
                                zzetVar2 = zzetVar2;
                            }
                            sb2.append(sb3.toString());
                            strZzN3 = zzetVar3.zzN(charsetZzR);
                            i12 = 0;
                        }
                        zzetVar = zzetVar2;
                        Spanned spannedFromHtml = Html.fromHtml(sb2.toString());
                        int i14 = 0;
                        while (true) {
                            if (i14 < arrayList.size()) {
                                str = (String) arrayList.get(i14);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i14++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzcw zzcwVar = new zzcw();
                        zzcwVar.zza(spannedFromHtml);
                        if (str == null) {
                            zzcxVarZzr = zzcwVar.zzr();
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (!str.equals("{\\an1}")) {
                                        zzcwVar.zzj(1);
                                    } else {
                                        zzcwVar.zzj(0);
                                    }
                                    break;
                                case -685620648:
                                    if (!str.equals("{\\an3}")) {
                                        zzcwVar.zzj(1);
                                    } else {
                                        zzcwVar.zzj(2);
                                    }
                                    break;
                                case -685620617:
                                    if (!str.equals("{\\an4}")) {
                                        zzcwVar.zzj(1);
                                    } else {
                                        zzcwVar.zzj(0);
                                    }
                                    break;
                                case -685620555:
                                    if (!str.equals("{\\an6}")) {
                                        zzcwVar.zzj(1);
                                    } else {
                                        zzcwVar.zzj(2);
                                    }
                                    break;
                                case -685620524:
                                    if (!str.equals("{\\an7}")) {
                                        zzcwVar.zzj(1);
                                    } else {
                                        zzcwVar.zzj(0);
                                    }
                                    break;
                                case -685620462:
                                    if (!str.equals("{\\an9}")) {
                                        zzcwVar.zzj(1);
                                    } else {
                                        zzcwVar.zzj(2);
                                    }
                                    break;
                                default:
                                    zzcwVar.zzj(1);
                                    break;
                            }
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (!str.equals("{\\an1}")) {
                                        zzcwVar.zzg(1);
                                    } else {
                                        zzcwVar.zzg(2);
                                    }
                                    break;
                                case -685620679:
                                    if (!str.equals("{\\an2}")) {
                                        zzcwVar.zzg(1);
                                    } else {
                                        zzcwVar.zzg(2);
                                    }
                                    break;
                                case -685620648:
                                    if (!str.equals("{\\an3}")) {
                                        zzcwVar.zzg(1);
                                    } else {
                                        zzcwVar.zzg(2);
                                    }
                                    break;
                                case -685620524:
                                    if (!str.equals("{\\an7}")) {
                                        zzcwVar.zzg(1);
                                    } else {
                                        zzcwVar.zzg(0);
                                    }
                                    break;
                                case -685620493:
                                    if (!str.equals("{\\an8}")) {
                                        zzcwVar.zzg(1);
                                    } else {
                                        zzcwVar.zzg(0);
                                    }
                                    break;
                                case -685620462:
                                    if (!str.equals("{\\an9}")) {
                                        zzcwVar.zzg(1);
                                    } else {
                                        zzcwVar.zzg(0);
                                    }
                                    break;
                                default:
                                    zzcwVar.zzg(1);
                                    break;
                            }
                            zzcwVar.zzi(zzb(zzcwVar.zzk()));
                            zzcwVar.zzf(zzb(zzcwVar.zzh()), 0);
                            zzcxVarZzr = zzcwVar.zzr();
                        }
                        zzdtVar.zza(new zzand(zzgwm.zzj(zzcxVarZzr), jZzc, jZzc2 - jZzc));
                    } else {
                        zzetVar = zzetVar2;
                        zzeg.zzc("SubripParser", "Skipping invalid timing: ".concat(strZzN2));
                    }
                } catch (NumberFormatException unused) {
                    zzetVar = zzetVar2;
                    zzeg.zzc("SubripParser", "Skipping invalid index: ".concat(strZzN));
                }
            }
            zzaofVar = this;
            zzetVar2 = zzetVar;
        }
    }
}
