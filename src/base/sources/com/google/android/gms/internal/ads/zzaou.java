package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaou {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzet zzc = new zzet();
    private final StringBuilder zzd = new StringBuilder();

    static void zzb(zzet zzetVar) {
        while (true) {
            for (boolean z10 = true; zzetVar.zzd() > 0 && z10; z10 = false) {
                char c10 = (char) zzetVar.zzi()[zzetVar.zzg()];
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    zzetVar.zzk(1);
                } else {
                    int iZzg = zzetVar.zzg();
                    int iZze = zzetVar.zze();
                    byte[] bArrZzi = zzetVar.zzi();
                    if (iZzg + 2 <= iZze) {
                        int i10 = iZzg + 1;
                        if (bArrZzi[iZzg] == 47) {
                            int i11 = iZzg + 2;
                            if (bArrZzi[i10] == 42) {
                                while (true) {
                                    int i12 = i11 + 1;
                                    if (i12 >= iZze) {
                                        break;
                                    }
                                    if (((char) bArrZzi[i11]) == '*' && ((char) bArrZzi[i12]) == '/') {
                                        iZze = i11 + 2;
                                        i11 = iZze;
                                    } else {
                                        i11 = i12;
                                    }
                                }
                                zzetVar.zzk(iZze - zzetVar.zzg());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    static String zzc(zzet zzetVar, StringBuilder sb2) {
        zzb(zzetVar);
        if (zzetVar.zzd() == 0) {
            return null;
        }
        String strZzd = zzd(zzetVar, sb2);
        if (!strZzd.isEmpty()) {
            return strZzd;
        }
        char cZzs = (char) zzetVar.zzs();
        StringBuilder sb3 = new StringBuilder(String.valueOf(cZzs).length());
        sb3.append(cZzs);
        return sb3.toString();
    }

    private static String zzd(zzet zzetVar, StringBuilder sb2) {
        char c10;
        sb2.setLength(0);
        int iZzg = zzetVar.zzg();
        int iZze = zzetVar.zze();
        loop0: while (true) {
            boolean z10 = false;
            while (true) {
                if (iZzg < iZze && !z10) {
                    c10 = (char) zzetVar.zzi()[iZzg];
                    if ((c10 >= 'A' && c10 <= 'Z') || ((c10 >= 'a' && c10 <= 'z') || ((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                        break;
                    }
                    z10 = true;
                } else {
                    break loop0;
                }
            }
            sb2.append(c10);
            iZzg++;
        }
        zzetVar.zzk(iZzg - zzetVar.zzg());
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:113:0x020f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0217  */
    /* JADX WARN: Code duplicated, block: B:118:0x021f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0227  */
    /* JADX WARN: Code duplicated, block: B:121:0x022c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0235  */
    /* JADX WARN: Code duplicated, block: B:124:0x023a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0242  */
    /* JADX WARN: Code duplicated, block: B:128:0x024a  */
    /* JADX WARN: Code duplicated, block: B:129:0x024f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0257  */
    /* JADX WARN: Code duplicated, block: B:133:0x025f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0264  */
    /* JADX WARN: Code duplicated, block: B:136:0x026c  */
    /* JADX WARN: Code duplicated, block: B:138:0x027c  */
    /* JADX WARN: Code duplicated, block: B:139:0x029e  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:143:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:148:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:150:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:151:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:153:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:169:0x02e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x02e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x003d  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:98:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d4  */
    public final List zza(zzet zzetVar) {
        String strTrim;
        String string;
        Matcher matcher;
        String strGroup;
        int iHashCode;
        boolean z10;
        StringBuilder sb2 = this.zzd;
        int i10 = 0;
        sb2.setLength(0);
        int iZzg = zzetVar.zzg();
        while (!TextUtils.isEmpty(zzetVar.zzN(StandardCharsets.UTF_8))) {
        }
        zzet zzetVar2 = this.zzc;
        zzetVar2.zzb(zzetVar.zzi(), zzetVar.zzg());
        zzetVar2.zzh(iZzg);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzb(zzetVar2);
            if (zzetVar2.zzd() >= 5 && "::cue".equals(zzetVar2.zzK(5, StandardCharsets.UTF_8))) {
                int iZzg2 = zzetVar2.zzg();
                String strZzc = zzc(zzetVar2, sb2);
                if (strZzc == null) {
                    strTrim = null;
                } else if ("{".equals(strZzc)) {
                    zzetVar2.zzh(iZzg2);
                    strTrim = "";
                } else {
                    if ("(".equals(strZzc)) {
                        int iZzg3 = zzetVar2.zzg();
                        int iZze = zzetVar2.zze();
                        int i11 = i10;
                        while (iZzg3 < iZze && i11 == 0) {
                            int i12 = iZzg3 + 1;
                            i11 = ((char) zzetVar2.zzi()[iZzg3]) == ')' ? 1 : i10;
                            iZzg3 = i12;
                        }
                        strTrim = zzetVar2.zzK((iZzg3 - 1) - zzetVar2.zzg(), StandardCharsets.UTF_8).trim();
                    } else {
                        strTrim = null;
                    }
                    if (!")".equals(zzc(zzetVar2, sb2))) {
                        strTrim = null;
                    }
                }
            } else {
                strTrim = null;
            }
            if (strTrim == null || !"{".equals(zzc(zzetVar2, sb2))) {
                break;
            }
            zzaov zzaovVar = new zzaov();
            if (!strTrim.isEmpty()) {
                int iIndexOf = strTrim.indexOf(91);
                if (iIndexOf != -1) {
                    Matcher matcher2 = zza.matcher(strTrim.substring(iIndexOf));
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        zzaovVar.zzd(strGroup2);
                    }
                    strTrim = strTrim.substring(i10, iIndexOf);
                }
                String str = zzfl.zza;
                String[] strArrSplit = strTrim.split("\\.", -1);
                String str2 = strArrSplit[i10];
                int iIndexOf2 = str2.indexOf(35);
                if (iIndexOf2 != -1) {
                    zzaovVar.zzb(str2.substring(i10, iIndexOf2));
                    zzaovVar.zza(str2.substring(iIndexOf2 + 1));
                } else {
                    zzaovVar.zzb(str2);
                }
                int length = strArrSplit.length;
                if (length > 1) {
                    zzaovVar.zzc((String[]) Arrays.copyOfRange(strArrSplit, 1, length));
                }
            }
            int i13 = i10;
            String strZzc2 = null;
            while (i13 == 0) {
                int iZzg4 = zzetVar2.zzg();
                strZzc2 = zzc(zzetVar2, sb2);
                int i14 = (strZzc2 == null || "}".equals(strZzc2)) ? 1 : i10;
                if (i14 == 0) {
                    zzetVar2.zzh(iZzg4);
                    zzb(zzetVar2);
                    String strZzd = zzd(zzetVar2, sb2);
                    if (!strZzd.isEmpty() && ":".equals(zzc(zzetVar2, sb2))) {
                        zzb(zzetVar2);
                        StringBuilder sb3 = new StringBuilder();
                        int i15 = i10;
                        while (true) {
                            if (i15 != 0) {
                                string = sb3.toString();
                                break;
                            }
                            int iZzg5 = zzetVar2.zzg();
                            String strZzc3 = zzc(zzetVar2, sb2);
                            if (strZzc3 == null) {
                                string = null;
                                break;
                            }
                            if ("}".equals(strZzc3) || ";".equals(strZzc3)) {
                                zzetVar2.zzh(iZzg5);
                                i15 = 1;
                            } else {
                                sb3.append(strZzc3);
                            }
                        }
                        if (string != null && !string.isEmpty()) {
                            int iZzg6 = zzetVar2.zzg();
                            String strZzc4 = zzc(zzetVar2, sb2);
                            if (";".equals(strZzc4)) {
                                if (TtmlNode.ATTR_TTS_COLOR.equals(strZzd)) {
                                    zzaovVar.zzn(zzdr.zzb(string));
                                } else if ("background-color".equals(strZzd)) {
                                    zzaovVar.zzq(zzdr.zzb(string));
                                } else if ("ruby-position".equals(strZzd)) {
                                    if ("over".equals(string)) {
                                        zzaovVar.zzw(1);
                                    } else if ("under".equals(string)) {
                                        zzaovVar.zzw(2);
                                    }
                                } else if ("text-combine-upright".equals(strZzd)) {
                                    if ("all".equals(string)) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    zzaovVar.zzy(z10);
                                } else if ("text-decoration".equals(strZzd)) {
                                    if (TtmlNode.UNDERLINE.equals(string)) {
                                        zzaovVar.zzh(true);
                                    }
                                } else if (lkCBSIFlvmyGX.FyqFwhaClNaCb.equals(strZzd)) {
                                    zzaovVar.zzl(string);
                                } else if ("font-weight".equals(strZzd)) {
                                    if (TtmlNode.BOLD.equals(string)) {
                                        zzaovVar.zzi(true);
                                    }
                                } else if ("font-style".equals(strZzd)) {
                                    if (TtmlNode.ITALIC.equals(string)) {
                                        zzaovVar.zzj(true);
                                    }
                                } else if ("font-size".equals(strZzd)) {
                                    matcher = zzb.matcher(zzgss.zza(string));
                                    if (matcher.matches()) {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode == 3592) {
                                                }
                                                throw new IllegalStateException();
                                            }
                                            if (strGroup.equals("em")) {
                                                throw new IllegalStateException();
                                            }
                                            zzaovVar.zzt(2);
                                            String strGroup3 = matcher.group(1);
                                            strGroup3.getClass();
                                            zzaovVar.zzs(Float.parseFloat(strGroup3));
                                        } else {
                                            if (strGroup.equals("%")) {
                                                throw new IllegalStateException();
                                            }
                                            zzaovVar.zzt(3);
                                            String strGroup4 = matcher.group(1);
                                            strGroup4.getClass();
                                            zzaovVar.zzs(Float.parseFloat(strGroup4));
                                        }
                                    } else {
                                        StringBuilder sb4 = new StringBuilder(string.length() + 22);
                                        sb4.append("Invalid font-size: '");
                                        sb4.append(string);
                                        sb4.append("'.");
                                        zzeg.zzc("WebvttCssParser", sb4.toString());
                                    }
                                } else {
                                    continue;
                                }
                            } else if ("}".equals(strZzc4)) {
                                zzetVar2.zzh(iZzg6);
                                if (TtmlNode.ATTR_TTS_COLOR.equals(strZzd)) {
                                    zzaovVar.zzn(zzdr.zzb(string));
                                } else if ("background-color".equals(strZzd)) {
                                    zzaovVar.zzq(zzdr.zzb(string));
                                } else if ("ruby-position".equals(strZzd)) {
                                    if ("over".equals(string)) {
                                        zzaovVar.zzw(1);
                                    } else if ("under".equals(string)) {
                                        zzaovVar.zzw(2);
                                    }
                                } else if ("text-combine-upright".equals(strZzd)) {
                                    if ("all".equals(string) || string.startsWith("digits")) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    zzaovVar.zzy(z10);
                                } else if ("text-decoration".equals(strZzd)) {
                                    if (TtmlNode.UNDERLINE.equals(string)) {
                                        zzaovVar.zzh(true);
                                    }
                                } else if (lkCBSIFlvmyGX.FyqFwhaClNaCb.equals(strZzd)) {
                                    zzaovVar.zzl(string);
                                } else if ("font-weight".equals(strZzd)) {
                                    if (TtmlNode.BOLD.equals(string)) {
                                        zzaovVar.zzi(true);
                                    }
                                } else if ("font-style".equals(strZzd)) {
                                    if (TtmlNode.ITALIC.equals(string)) {
                                        zzaovVar.zzj(true);
                                    }
                                } else if ("font-size".equals(strZzd)) {
                                    matcher = zzb.matcher(zzgss.zza(string));
                                    if (matcher.matches()) {
                                        StringBuilder sb5 = new StringBuilder(string.length() + 22);
                                        sb5.append("Invalid font-size: '");
                                        sb5.append(string);
                                        sb5.append("'.");
                                        zzeg.zzc("WebvttCssParser", sb5.toString());
                                    } else {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode == 3592 || !strGroup.equals("px")) {
                                                    throw new IllegalStateException();
                                                }
                                                zzaovVar.zzt(1);
                                                String strGroup5 = matcher.group(1);
                                                strGroup5.getClass();
                                                zzaovVar.zzs(Float.parseFloat(strGroup5));
                                            } else {
                                                if (strGroup.equals("em")) {
                                                    throw new IllegalStateException();
                                                }
                                                zzaovVar.zzt(2);
                                                String strGroup6 = matcher.group(1);
                                                strGroup6.getClass();
                                                zzaovVar.zzs(Float.parseFloat(strGroup6));
                                            }
                                        } else {
                                            if (strGroup.equals("%")) {
                                                throw new IllegalStateException();
                                            }
                                            zzaovVar.zzt(3);
                                            String strGroup7 = matcher.group(1);
                                            strGroup7.getClass();
                                            zzaovVar.zzs(Float.parseFloat(strGroup7));
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i13 = i14;
                i10 = 0;
            }
            if ("}".equals(strZzc2)) {
                arrayList.add(zzaovVar);
            }
            i10 = 0;
        }
        return arrayList;
    }
}
