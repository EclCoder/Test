package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapc {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(map2);
    }

    public static zzaow zza(zzet zzetVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String strZzN = zzetVar.zzN(charset);
        if (strZzN != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzN);
            if (matcher.matches()) {
                return zzd(null, matcher, zzetVar, list);
            }
            String strZzN2 = zzetVar.zzN(charset);
            if (strZzN2 != null) {
                Matcher matcher2 = pattern.matcher(strZzN2);
                if (matcher2.matches()) {
                    return zzd(strZzN.trim(), matcher2, zzetVar, list);
                }
            }
        }
        return null;
    }

    static zzcw zzb(String str) {
        zzapb zzapbVar = new zzapb();
        zze(str, zzapbVar);
        return zzapbVar.zza();
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01b8  */
    static SpannedString zzc(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            int length = i10 + 1;
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, length);
                int iIndexOf2 = str2.indexOf(32, length);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(length, iIndexOf);
                    int iHashCode = strSubstring.hashCode();
                    if (iHashCode != 3309) {
                        if (iHashCode != 3464) {
                            if (iHashCode != 96708) {
                                if (iHashCode == 3374865 && strSubstring.equals("nbsp")) {
                                    spannableStringBuilder.append(' ');
                                } else {
                                    StringBuilder sb2 = new StringBuilder(strSubstring.length() + 33);
                                    sb2.append("ignoring unsupported entity: '&");
                                    sb2.append(strSubstring);
                                    sb2.append(";'");
                                    zzeg.zzc("WebvttCueParser", sb2.toString());
                                }
                            } else if (strSubstring.equals("amp")) {
                                spannableStringBuilder.append('&');
                            } else {
                                StringBuilder sb3 = new StringBuilder(strSubstring.length() + 33);
                                sb3.append("ignoring unsupported entity: '&");
                                sb3.append(strSubstring);
                                sb3.append(";'");
                                zzeg.zzc("WebvttCueParser", sb3.toString());
                            }
                        } else if (strSubstring.equals("lt")) {
                            spannableStringBuilder.append('<');
                        } else {
                            StringBuilder sb4 = new StringBuilder(strSubstring.length() + 33);
                            sb4.append("ignoring unsupported entity: '&");
                            sb4.append(strSubstring);
                            sb4.append(";'");
                            zzeg.zzc("WebvttCueParser", sb4.toString());
                        }
                    } else if (strSubstring.equals("gt")) {
                        spannableStringBuilder.append('>');
                    } else {
                        StringBuilder sb5 = new StringBuilder(strSubstring.length() + 33);
                        sb5.append("ignoring unsupported entity: '&");
                        sb5.append(strSubstring);
                        sb5.append(";'");
                        zzeg.zzc("WebvttCueParser", sb5.toString());
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (length < str2.length()) {
                char cCharAt2 = str2.charAt(length);
                int iIndexOf3 = str2.indexOf(62, length);
                length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                int i11 = length - 2;
                boolean z10 = str2.charAt(i11) == '/';
                int i12 = i10 + (cCharAt2 == '/' ? 2 : 1);
                if (!z10) {
                    i11 = length - 1;
                }
                String strSubstring2 = str2.substring(i12, i11);
                if (!strSubstring2.trim().isEmpty()) {
                    String strTrim = strSubstring2.trim();
                    zzgtj.zza(true ^ strTrim.isEmpty());
                    String str3 = zzfl.zza;
                    String str4 = strTrim.split("[ \\.]", 2)[0];
                    int iHashCode2 = str4.hashCode();
                    if (iHashCode2 == 98 ? str4.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B) : !(iHashCode2 == 99 ? !str4.equals("c") : iHashCode2 == 105 ? !str4.equals("i") : iHashCode2 == 3650 ? !str4.equals("rt") : iHashCode2 == 3314158 ? !str4.equals("lang") : iHashCode2 == 3511770 ? !str4.equals("ruby") : iHashCode2 == 117 ? !str4.equals("u") : iHashCode2 != 118 || !str4.equals("v"))) {
                        if (cCharAt2 == '/') {
                            while (!arrayDeque.isEmpty()) {
                                zzaoz zzaozVar = (zzaoz) arrayDeque.pop();
                                zzf(str, zzaozVar, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new zzaoy(zzaozVar, spannableStringBuilder.length(), null));
                                }
                                if (zzaozVar.zza.equals(str4)) {
                                    break;
                                }
                            }
                        } else if (!z10) {
                            arrayDeque.push(zzaoz.zza(strSubstring2, spannableStringBuilder.length()));
                        }
                    }
                }
            }
            i10 = length;
        }
        while (!arrayDeque.isEmpty()) {
            zzf(str, (zzaoz) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzf(str, zzaoz.zzb(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static zzaow zzd(String str, Matcher matcher, zzet zzetVar, List list) {
        zzapb zzapbVar = new zzapb();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            zzapbVar.zza = zzape.zza(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            zzapbVar.zzb = zzape.zza(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zze(strGroup3, zzapbVar);
            StringBuilder sb2 = new StringBuilder();
            String strZzN = zzetVar.zzN(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strZzN)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strZzN.trim());
                strZzN = zzetVar.zzN(StandardCharsets.UTF_8);
            }
            zzapbVar.zzc = zzc(str, sb2.toString(), list);
            return new zzaow(zzapbVar.zza().zzr(), zzapbVar.zza, zzapbVar.zzb);
        } catch (IllegalArgumentException unused) {
            zzeg.zzc("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0081 A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00cf A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0132  */
    /* JADX WARN: Code duplicated, block: B:75:0x013a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0144  */
    /* JADX WARN: Code duplicated, block: B:79:0x0146 A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x018e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0190 A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    private static void zze(String str, zzapb zzapbVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring) {
                            case "center":
                            case "middle":
                                i13 = 1;
                                break;
                            case "end":
                                i13 = 2;
                                break;
                            case "start":
                                i13 = 0;
                                break;
                            default:
                                zzeg.zzc("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                i13 = Integer.MIN_VALUE;
                                break;
                        }
                        zzapbVar.zzg = i13;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        zzapbVar.zze = zzape.zzb(strGroup2);
                        zzapbVar.zzf = 0;
                    } else {
                        zzapbVar.zze = Integer.parseInt(strGroup2);
                        zzapbVar.zzf = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                        case "middle":
                            if (!strGroup2.equals(TtmlNode.CENTER)) {
                                zzeg.zzc("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            }
                            i10 = 2;
                            break;
                        case "end":
                            i10 = 3;
                            break;
                        case "left":
                            i10 = 4;
                            break;
                        case "right":
                            i10 = 5;
                            break;
                        case "start":
                            i10 = 1;
                            break;
                        default:
                            zzeg.zzc("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                    }
                    zzapbVar.zzd = i10;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2) {
                            case "line-left":
                                i12 = 0;
                                break;
                            case "center":
                                i12 = 1;
                                break;
                            case "line-right":
                                i12 = 2;
                                break;
                            case "middle":
                                i12 = 1;
                                break;
                            case "end":
                                i12 = 2;
                                break;
                            case "start":
                                i12 = 0;
                                break;
                            default:
                                zzeg.zzc("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                i12 = Integer.MIN_VALUE;
                                break;
                        }
                        zzapbVar.zzi = i12;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    zzapbVar.zzh = zzape.zzb(strGroup2);
                } else if ("size".equals(strGroup)) {
                    zzapbVar.zzj = zzape.zzb(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            i11 = 1;
                        } else {
                            zzeg.zzc("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i11 = Integer.MIN_VALUE;
                        }
                    } else if (strGroup2.equals("lr")) {
                        i11 = 2;
                    } else {
                        zzeg.zzc("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                        i11 = Integer.MIN_VALUE;
                    }
                    zzapbVar.zzk = i11;
                } else {
                    StringBuilder sb2 = new StringBuilder(strGroup.length() + 21 + strGroup2.length());
                    sb2.append("Unknown cue setting ");
                    sb2.append(strGroup);
                    sb2.append(":");
                    sb2.append(strGroup2);
                    zzeg.zzc("WebvttCueParser", sb2.toString());
                }
            } catch (NumberFormatException unused) {
                zzeg.zzc("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    private static void zzf(String str, zzaoz zzaozVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i10 = zzaozVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzaozVar.zza;
        int iHashCode = str2.hashCode();
        int i11 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int iZzg = zzg(list2, str, zzaozVar);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        Collections.sort(arrayList, zzaoy.zza);
                        int i12 = i10;
                        int i13 = 0;
                        int length2 = 0;
                        while (i13 < arrayList.size()) {
                            if ("rt".equals(((zzaoy) arrayList.get(i13)).zzc().zza)) {
                                zzaoy zzaoyVar = (zzaoy) arrayList.get(i13);
                                int iZzg2 = zzg(list2, str, zzaoyVar.zzc());
                                if (iZzg2 == i11) {
                                    iZzg2 = iZzg != i11 ? iZzg : 1;
                                }
                                int i14 = zzaoyVar.zzc().zzb - length2;
                                int iZzd = zzaoyVar.zzd() - length2;
                                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i14, iZzd);
                                spannableStringBuilder.delete(i14, iZzd);
                                spannableStringBuilder.setSpan(new zzdc(charSequenceSubSequence.toString(), iZzg2), i12, i14, 33);
                                length2 += charSequenceSubSequence.length();
                                i12 = i14;
                            }
                            i13++;
                            i11 = -1;
                        }
                    } else if (iHashCode != 98) {
                        if (iHashCode == 99) {
                            if (!str2.equals("c")) {
                                return;
                            }
                            for (String str3 : zzaozVar.zzd) {
                                Map map = zzc;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i10, length, 33);
                                } else {
                                    Map map2 = zzd;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i10, length, 33);
                                    }
                                }
                            }
                        } else if (iHashCode != 117) {
                            if (iHashCode != 118 || !str2.equals("v")) {
                                return;
                            } else {
                                spannableStringBuilder.setSpan(new zzdf(zzaozVar.zzc), i10, length, 33);
                            }
                        } else if (!str2.equals("u")) {
                            return;
                        } else {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                        }
                    } else if (!str2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                        return;
                    } else {
                        spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                    }
                } else if (!str2.equals("lang")) {
                    return;
                }
            } else if (!str2.equals("i")) {
                return;
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
            }
        } else if (!str2.equals("")) {
            return;
        }
        List listZzh = zzh(list2, str, zzaozVar);
        for (int i15 = 0; i15 < listZzh.size(); i15++) {
            zzaov zzaovVar = ((zzapa) listZzh.get(i15)).zzb;
            if (zzaovVar != null) {
                if (zzaovVar.zzf() != -1) {
                    zzdd.zza(spannableStringBuilder, new StyleSpan(zzaovVar.zzf()), i10, length, 33);
                }
                if (zzaovVar.zzg()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                }
                if (zzaovVar.zzo()) {
                    zzdd.zza(spannableStringBuilder, new ForegroundColorSpan(zzaovVar.zzm()), i10, length, 33);
                }
                if (zzaovVar.zzr()) {
                    zzdd.zza(spannableStringBuilder, new BackgroundColorSpan(zzaovVar.zzp()), i10, length, 33);
                }
                if (zzaovVar.zzk() != null) {
                    zzdd.zza(spannableStringBuilder, new TypefaceSpan(zzaovVar.zzk()), i10, length, 33);
                }
                int iZzu = zzaovVar.zzu();
                if (iZzu == 1) {
                    zzdd.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzaovVar.zzv(), true), i10, length, 33);
                } else if (iZzu == 2) {
                    zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzaovVar.zzv()), i10, length, 33);
                } else if (iZzu == 3) {
                    zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzaovVar.zzv() / 100.0f), i10, length, 33);
                }
                if (zzaovVar.zzz()) {
                    spannableStringBuilder.setSpan(new zzdb(), i10, length, 33);
                }
            }
        }
    }

    private static int zzg(List list, String str, zzaoz zzaozVar) {
        List listZzh = zzh(list, str, zzaozVar);
        for (int i10 = 0; i10 < listZzh.size(); i10++) {
            zzaov zzaovVar = ((zzapa) listZzh.get(i10)).zzb;
            if (zzaovVar.zzx() != -1) {
                return zzaovVar.zzx();
            }
        }
        return -1;
    }

    private static List zzh(List list, String str, zzaoz zzaozVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzaov zzaovVar = (zzaov) list.get(i10);
            int iZze = zzaovVar.zze(str, zzaozVar.zza, zzaozVar.zzd, zzaozVar.zzc);
            if (iZze > 0) {
                arrayList.add(new zzapa(iZze, zzaovVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
