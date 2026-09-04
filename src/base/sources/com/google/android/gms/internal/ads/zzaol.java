package com.google.android.gms.internal.ads;

import android.text.Layout;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaol implements zzanl {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzaoj zzh = new zzaoj(30.0f, 1, 1);

    public zzaol() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static String[] zzc(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzfl.zza;
        return strTrim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:119:0x0288  */
    /* JADX WARN: Code duplicated, block: B:128:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:186:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0126 A[Catch: zzanh -> 0x018f, TryCatch #3 {zzanh -> 0x018f, blocks: (B:35:0x00af, B:37:0x00cb, B:40:0x00e1, B:42:0x00e7, B:44:0x00ed, B:53:0x0105, B:62:0x0120, B:64:0x0126, B:65:0x012f, B:66:0x0130, B:67:0x014d, B:57:0x0111, B:61:0x011d, B:68:0x014e, B:69:0x014f, B:70:0x016c, B:39:0x00d4, B:71:0x016d, B:72:0x018e), top: B:177:0x00af }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static zzaoo zzd(XmlPullParser xmlPullParser, zzaoo zzaooVar) {
        Matcher matcher;
        String strGroup;
        int attributeCount = xmlPullParser.getAttributeCount();
        zzaoo zzaooVarZze = zzaooVar;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_STYLE)) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzg(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                        continue;
                    }
                    break;
                case -1289044182:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_EXTENT)) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzM(attributeValue);
                    } else {
                        continue;
                    }
                    break;
                case -1224696685:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_FAMILY)) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzi(attributeValue);
                    } else {
                        continue;
                    }
                    break;
                case -1065511464:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzz(zzf(attributeValue));
                    } else {
                        continue;
                    }
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzK(attributeValue);
                    } else {
                        continue;
                    }
                    break;
                case -879295043:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                        String strZza = zzgss.zza(attributeValue);
                        switch (strZza.hashCode()) {
                            case -1461280213:
                                if (strZza.equals(TtmlNode.NO_UNDERLINE)) {
                                    zzaooVarZze = zze(zzaooVarZze);
                                    zzaooVarZze.zze(false);
                                }
                                break;
                            case -1026963764:
                                if (strZza.equals(TtmlNode.UNDERLINE)) {
                                    zzaooVarZze = zze(zzaooVarZze);
                                    zzaooVarZze.zze(true);
                                }
                                break;
                            case 913457136:
                                if (strZza.equals(TtmlNode.NO_LINETHROUGH)) {
                                    zzaooVarZze = zze(zzaooVarZze);
                                    zzaooVarZze.zzc(false);
                                }
                                break;
                            case 1679736913:
                                if (strZza.equals(TtmlNode.LINETHROUGH)) {
                                    zzaooVarZze = zze(zzaooVarZze);
                                    zzaooVarZze.zzc(true);
                                }
                                break;
                        }
                    }
                    break;
                case -734428249:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzf(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id") && TtmlNode.TAG_STYLE.equals(xmlPullParser.getName())) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzs(attributeValue);
                    }
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        String strZza2 = zzgss.zza(attributeValue);
                        switch (strZza2.hashCode()) {
                            case -618561360:
                                if (strZza2.equals("baseContainer")) {
                                    zzaooVarZze = zze(zzaooVarZze);
                                    zzaooVarZze.zzu(2);
                                }
                                break;
                            case -410956671:
                                if (strZza2.equals("container")) {
                                    zzaooVarZze = zze(zzaooVarZze);
                                    zzaooVarZze.zzu(1);
                                }
                                break;
                            case -250518009:
                                if (strZza2.equals("delimiter")) {
                                    zzaooVarZze = zze(zzaooVarZze);
                                    zzaooVarZze.zzu(4);
                                }
                                break;
                            case -136074796:
                                if (strZza2.equals("textContainer")) {
                                    zzaooVarZze = zze(zzaooVarZze);
                                    zzaooVarZze.zzu(3);
                                }
                                break;
                            case 3016401:
                                if (strZza2.equals("base")) {
                                    zzaooVarZze = zze(zzaooVarZze);
                                    zzaooVarZze.zzu(2);
                                }
                                break;
                            case 3556653:
                                if (strZza2.equals("text")) {
                                    zzaooVarZze = zze(zzaooVarZze);
                                    zzaooVarZze.zzu(3);
                                }
                                break;
                        }
                    }
                    break;
                case 94842723:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_COLOR)) {
                        zzaooVarZze = zze(zzaooVarZze);
                        try {
                            zzaooVarZze.zzk(zzdr.zza(attributeValue));
                        } catch (IllegalArgumentException unused) {
                            zzeg.zzc("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                        }
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        zzaoo zzaooVarZze2 = zze(zzaooVarZze);
                        Matcher matcher2 = zza.matcher(attributeValue);
                        float fMin = Float.MAX_VALUE;
                        if (matcher2.matches()) {
                            try {
                                String strGroup2 = matcher2.group(1);
                                if (strGroup2 == null) {
                                    throw null;
                                }
                                fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup2)));
                            } catch (NumberFormatException e10) {
                                zzeg.zzd("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e10);
                            }
                        } else {
                            zzeg.zzc("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                        }
                        zzaooVarZze2.zzp(fMin);
                        zzaooVarZze = zzaooVarZze2;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        String strZza3 = zzgss.zza(attributeValue);
                        int iHashCode = strZza3.hashCode();
                        if (iHashCode == 96673) {
                            if (strZza3.equals("all")) {
                                zzaooVarZze = zze(zzaooVarZze);
                                zzaooVarZze.zzD(true);
                            }
                        } else if (iHashCode == 3387192 && strZza3.equals(DevicePublicKeyStringDef.NONE)) {
                            zzaooVarZze = zze(zzaooVarZze);
                            zzaooVarZze.zzD(false);
                        }
                        break;
                    }
                    break;
                case 365601008:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_SIZE)) {
                        try {
                            zzaooVarZze = zze(zzaooVarZze);
                            String str = zzfl.zza;
                            String[] strArrSplit = attributeValue.split("\\s+", -1);
                            int length = strArrSplit.length;
                            if (length == 1) {
                                matcher = zze.matcher(attributeValue);
                            } else {
                                if (length != 2) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 41);
                                    sb2.append("Invalid number of entries for fontSize: ");
                                    sb2.append(length);
                                    sb2.append(".");
                                    throw new zzanh(sb2.toString());
                                }
                                matcher = zze.matcher(strArrSplit[1]);
                                zzeg.zzc("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                            }
                            if (!matcher.matches()) {
                                StringBuilder sb3 = new StringBuilder(attributeValue.length() + 36);
                                sb3.append("Invalid expression for fontSize: '");
                                sb3.append(attributeValue);
                                sb3.append("'.");
                                throw new zzanh(sb3.toString());
                            }
                            String strGroup3 = matcher.group(3);
                            if (strGroup3 == null) {
                                throw null;
                            }
                            int iHashCode2 = strGroup3.hashCode();
                            if (iHashCode2 == 37) {
                                if (!strGroup3.equals("%")) {
                                    StringBuilder sb4 = new StringBuilder(strGroup3.length() + 30);
                                    sb4.append("Invalid unit for fontSize: '");
                                    sb4.append(strGroup3);
                                    sb4.append("'.");
                                    throw new zzanh(sb4.toString());
                                }
                                zzaooVarZze.zzH(3);
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                zzaooVarZze.zzG(Float.parseFloat(strGroup));
                            } else if (iHashCode2 == 3240) {
                                if (!strGroup3.equals("em")) {
                                    StringBuilder sb5 = new StringBuilder(strGroup3.length() + 30);
                                    sb5.append("Invalid unit for fontSize: '");
                                    sb5.append(strGroup3);
                                    sb5.append("'.");
                                    throw new zzanh(sb5.toString());
                                }
                                zzaooVarZze.zzH(2);
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                zzaooVarZze.zzG(Float.parseFloat(strGroup));
                            } else {
                                if (iHashCode2 != 3592 || !strGroup3.equals("px")) {
                                    StringBuilder sb6 = new StringBuilder(strGroup3.length() + 30);
                                    sb6.append("Invalid unit for fontSize: '");
                                    sb6.append(strGroup3);
                                    sb6.append("'.");
                                    throw new zzanh(sb6.toString());
                                }
                                zzaooVarZze.zzH(1);
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                zzaooVarZze.zzG(Float.parseFloat(strGroup));
                            }
                        } catch (zzanh unused2) {
                            zzeg.zzc("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        }
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzF(zzaoh.zza(attributeValue));
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        String strZza4 = zzgss.zza(attributeValue);
                        int iHashCode3 = strZza4.hashCode();
                        if (iHashCode3 != -1392885889) {
                            if (iHashCode3 == 92734940 && strZza4.equals("after")) {
                                zzaooVarZze = zze(zzaooVarZze);
                                zzaooVarZze.zzw(2);
                            }
                        } else if (strZza4.equals("before")) {
                            zzaooVarZze = zze(zzaooVarZze);
                            zzaooVarZze.zzw(1);
                        }
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                        zzaooVarZze = zze(zzaooVarZze);
                        try {
                            zzaooVarZze.zzn(zzdr.zza(attributeValue));
                        } catch (IllegalArgumentException unused3) {
                            zzeg.zzc("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                        }
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzB(zzf(attributeValue));
                    }
                    break;
            }
        }
        return zzaooVarZze;
    }

    private static zzaoo zze(zzaoo zzaooVar) {
        return zzaooVar == null ? new zzaoo() : zzaooVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static Layout.Alignment zzf(String str) {
        String strZza = zzgss.zza(str);
        switch (strZza.hashCode()) {
            case -1364013995:
                if (strZza.equals(TtmlNode.CENTER)) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!strZza.equals(TtmlNode.END)) {
                    return null;
                }
                break;
            case 3317767:
                if (!strZza.equals(TtmlNode.LEFT)) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!strZza.equals(TtmlNode.RIGHT)) {
                    return null;
                }
                break;
            case 109757538:
                if (!strZza.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    private static long zzg(String str, zzaoj zzaojVar) throws zzanh {
        double d10;
        double d11;
        Matcher matcher = zzc.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j10 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j11 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d12 = j10 + j11;
            double d13 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d14 = 0.0d;
            double d15 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d16 = d12 + d13;
            String strGroup5 = matcher.group(5);
            double d17 = strGroup5 != null ? Long.parseLong(strGroup5) / zzaojVar.zza : 0.0d;
            double d18 = d16 + d15;
            String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d14 = (Long.parseLong(strGroup6) / ((double) zzaojVar.zzb)) / ((double) zzaojVar.zza);
            }
            return (long) ((d18 + d17 + d14) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new zzanh("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d19 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        int iHashCode = strGroup8.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode == 115) {
                            strGroup8.equals("s");
                        } else if (iHashCode == 116 && strGroup8.equals("t")) {
                            d10 = zzaojVar.zzc;
                            d19 /= d10;
                        }
                    } else if (strGroup8.equals("ms")) {
                        d10 = 1000.0d;
                        d19 /= d10;
                    }
                } else if (strGroup8.equals("m")) {
                    d11 = 60.0d;
                    d19 *= d11;
                }
            } else if (strGroup8.equals("h")) {
                d11 = 3600.0d;
                d19 *= d11;
            }
        } else if (strGroup8.equals("f")) {
            d10 = zzaojVar.zza;
            d19 /= d10;
        }
        return (long) (d19 * 1000000.0d);
    }

    @Override // com.google.android.gms.internal.ads.zzanl
    public final void zza(byte[] bArr, int i10, int i11, zzank zzankVar, zzdt zzdtVar) {
        zzanf.zza(zzb(bArr, i10, i11), zzankVar, zzdtVar);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x030c A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x0167, B:85:0x01c2, B:88:0x01d6, B:90:0x01dc, B:92:0x01e4, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:100:0x0204, B:102:0x020a, B:104:0x0212, B:106:0x021a, B:108:0x0220, B:110:0x0226, B:112:0x022c, B:114:0x0234, B:117:0x023d, B:379:0x0703, B:119:0x026b, B:121:0x0271, B:123:0x027a, B:125:0x0289, B:127:0x0296, B:129:0x02ac, B:131:0x02b2, B:268:0x0537, B:134:0x02bd, B:137:0x02c9, B:252:0x04e7, B:140:0x02e7, B:142:0x02ef, B:144:0x02f7, B:146:0x02ff, B:151:0x030c, B:154:0x0325, B:156:0x032b, B:158:0x0338, B:179:0x03a0, B:181:0x03a6, B:183:0x03ac, B:185:0x03b4, B:187:0x03ba, B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:214:0x0455, B:216:0x045d, B:230:0x0498, B:232:0x04a2, B:250:0x04da, B:195:0x03eb, B:196:0x03ec, B:197:0x03ed, B:198:0x03fa, B:201:0x0402, B:204:0x0410, B:206:0x0416, B:208:0x0421, B:209:0x0435, B:210:0x0436, B:211:0x0437, B:212:0x0444, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:163:0x034e, B:166:0x0358, B:169:0x0361, B:171:0x0367, B:173:0x0372, B:174:0x0384, B:175:0x0385, B:176:0x0386, B:177:0x038e, B:255:0x04fa, B:257:0x0507, B:259:0x0512, B:261:0x0518, B:263:0x0524, B:273:0x0551, B:275:0x0574, B:317:0x0626, B:280:0x059b, B:283:0x05a4, B:354:0x0695, B:294:0x05c6, B:300:0x05e0, B:306:0x05f6, B:310:0x060a, B:314:0x061e, B:320:0x0637, B:324:0x0643, B:328:0x064c, B:336:0x065e, B:339:0x0667, B:343:0x0672, B:345:0x067e, B:347:0x0683, B:70:0x0174, B:72:0x0180, B:75:0x0189, B:77:0x018f, B:79:0x019a, B:80:0x01a6, B:81:0x01a7, B:82:0x01a8, B:41:0x010b, B:43:0x0117, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:52:0x0134, B:59:0x0149, B:66:0x015f, B:62:0x0156, B:65:0x015e, B:358:0x06b6, B:360:0x06c3, B:363:0x06c7, B:365:0x06d1, B:367:0x06db, B:371:0x06e3, B:369:0x06e0, B:374:0x06f8, B:378:0x0700, B:384:0x071f), top: B:409:0x0008, inners: #1, #2, #3, #10, #13 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0322  */
    /* JADX WARN: Code duplicated, block: B:156:0x032b A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, NumberFormatException -> 0x0343, TryCatch #3 {NumberFormatException -> 0x0343, blocks: (B:154:0x0325, B:156:0x032b, B:158:0x0338, B:159:0x0341, B:160:0x0342), top: B:395:0x0325, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0338 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, NumberFormatException -> 0x0343, TryCatch #3 {NumberFormatException -> 0x0343, blocks: (B:154:0x0325, B:156:0x032b, B:158:0x0338, B:159:0x0341, B:160:0x0342), top: B:395:0x0325, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x034e A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x0167, B:85:0x01c2, B:88:0x01d6, B:90:0x01dc, B:92:0x01e4, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:100:0x0204, B:102:0x020a, B:104:0x0212, B:106:0x021a, B:108:0x0220, B:110:0x0226, B:112:0x022c, B:114:0x0234, B:117:0x023d, B:379:0x0703, B:119:0x026b, B:121:0x0271, B:123:0x027a, B:125:0x0289, B:127:0x0296, B:129:0x02ac, B:131:0x02b2, B:268:0x0537, B:134:0x02bd, B:137:0x02c9, B:252:0x04e7, B:140:0x02e7, B:142:0x02ef, B:144:0x02f7, B:146:0x02ff, B:151:0x030c, B:154:0x0325, B:156:0x032b, B:158:0x0338, B:179:0x03a0, B:181:0x03a6, B:183:0x03ac, B:185:0x03b4, B:187:0x03ba, B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:214:0x0455, B:216:0x045d, B:230:0x0498, B:232:0x04a2, B:250:0x04da, B:195:0x03eb, B:196:0x03ec, B:197:0x03ed, B:198:0x03fa, B:201:0x0402, B:204:0x0410, B:206:0x0416, B:208:0x0421, B:209:0x0435, B:210:0x0436, B:211:0x0437, B:212:0x0444, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:163:0x034e, B:166:0x0358, B:169:0x0361, B:171:0x0367, B:173:0x0372, B:174:0x0384, B:175:0x0385, B:176:0x0386, B:177:0x038e, B:255:0x04fa, B:257:0x0507, B:259:0x0512, B:261:0x0518, B:263:0x0524, B:273:0x0551, B:275:0x0574, B:317:0x0626, B:280:0x059b, B:283:0x05a4, B:354:0x0695, B:294:0x05c6, B:300:0x05e0, B:306:0x05f6, B:310:0x060a, B:314:0x061e, B:320:0x0637, B:324:0x0643, B:328:0x064c, B:336:0x065e, B:339:0x0667, B:343:0x0672, B:345:0x067e, B:347:0x0683, B:70:0x0174, B:72:0x0180, B:75:0x0189, B:77:0x018f, B:79:0x019a, B:80:0x01a6, B:81:0x01a7, B:82:0x01a8, B:41:0x010b, B:43:0x0117, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:52:0x0134, B:59:0x0149, B:66:0x015f, B:62:0x0156, B:65:0x015e, B:358:0x06b6, B:360:0x06c3, B:363:0x06c7, B:365:0x06d1, B:367:0x06db, B:371:0x06e3, B:369:0x06e0, B:374:0x06f8, B:378:0x0700, B:384:0x071f), top: B:409:0x0008, inners: #1, #2, #3, #10, #13 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0356 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x0358 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x0167, B:85:0x01c2, B:88:0x01d6, B:90:0x01dc, B:92:0x01e4, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:100:0x0204, B:102:0x020a, B:104:0x0212, B:106:0x021a, B:108:0x0220, B:110:0x0226, B:112:0x022c, B:114:0x0234, B:117:0x023d, B:379:0x0703, B:119:0x026b, B:121:0x0271, B:123:0x027a, B:125:0x0289, B:127:0x0296, B:129:0x02ac, B:131:0x02b2, B:268:0x0537, B:134:0x02bd, B:137:0x02c9, B:252:0x04e7, B:140:0x02e7, B:142:0x02ef, B:144:0x02f7, B:146:0x02ff, B:151:0x030c, B:154:0x0325, B:156:0x032b, B:158:0x0338, B:179:0x03a0, B:181:0x03a6, B:183:0x03ac, B:185:0x03b4, B:187:0x03ba, B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:214:0x0455, B:216:0x045d, B:230:0x0498, B:232:0x04a2, B:250:0x04da, B:195:0x03eb, B:196:0x03ec, B:197:0x03ed, B:198:0x03fa, B:201:0x0402, B:204:0x0410, B:206:0x0416, B:208:0x0421, B:209:0x0435, B:210:0x0436, B:211:0x0437, B:212:0x0444, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:163:0x034e, B:166:0x0358, B:169:0x0361, B:171:0x0367, B:173:0x0372, B:174:0x0384, B:175:0x0385, B:176:0x0386, B:177:0x038e, B:255:0x04fa, B:257:0x0507, B:259:0x0512, B:261:0x0518, B:263:0x0524, B:273:0x0551, B:275:0x0574, B:317:0x0626, B:280:0x059b, B:283:0x05a4, B:354:0x0695, B:294:0x05c6, B:300:0x05e0, B:306:0x05f6, B:310:0x060a, B:314:0x061e, B:320:0x0637, B:324:0x0643, B:328:0x064c, B:336:0x065e, B:339:0x0667, B:343:0x0672, B:345:0x067e, B:347:0x0683, B:70:0x0174, B:72:0x0180, B:75:0x0189, B:77:0x018f, B:79:0x019a, B:80:0x01a6, B:81:0x01a7, B:82:0x01a8, B:41:0x010b, B:43:0x0117, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:52:0x0134, B:59:0x0149, B:66:0x015f, B:62:0x0156, B:65:0x015e, B:358:0x06b6, B:360:0x06c3, B:363:0x06c7, B:365:0x06d1, B:367:0x06db, B:371:0x06e3, B:369:0x06e0, B:374:0x06f8, B:378:0x0700, B:384:0x071f), top: B:409:0x0008, inners: #1, #2, #3, #10, #13 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0360  */
    /* JADX WARN: Code duplicated, block: B:171:0x0367 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, NumberFormatException -> 0x0386, TryCatch #1 {NumberFormatException -> 0x0386, blocks: (B:169:0x0361, B:171:0x0367, B:173:0x0372, B:174:0x0384, B:175:0x0385), top: B:393:0x0361, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0372 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, NumberFormatException -> 0x0386, TryCatch #1 {NumberFormatException -> 0x0386, blocks: (B:169:0x0361, B:171:0x0367, B:173:0x0372, B:174:0x0384, B:175:0x0385), top: B:393:0x0361, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x038e A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x0167, B:85:0x01c2, B:88:0x01d6, B:90:0x01dc, B:92:0x01e4, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:100:0x0204, B:102:0x020a, B:104:0x0212, B:106:0x021a, B:108:0x0220, B:110:0x0226, B:112:0x022c, B:114:0x0234, B:117:0x023d, B:379:0x0703, B:119:0x026b, B:121:0x0271, B:123:0x027a, B:125:0x0289, B:127:0x0296, B:129:0x02ac, B:131:0x02b2, B:268:0x0537, B:134:0x02bd, B:137:0x02c9, B:252:0x04e7, B:140:0x02e7, B:142:0x02ef, B:144:0x02f7, B:146:0x02ff, B:151:0x030c, B:154:0x0325, B:156:0x032b, B:158:0x0338, B:179:0x03a0, B:181:0x03a6, B:183:0x03ac, B:185:0x03b4, B:187:0x03ba, B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:214:0x0455, B:216:0x045d, B:230:0x0498, B:232:0x04a2, B:250:0x04da, B:195:0x03eb, B:196:0x03ec, B:197:0x03ed, B:198:0x03fa, B:201:0x0402, B:204:0x0410, B:206:0x0416, B:208:0x0421, B:209:0x0435, B:210:0x0436, B:211:0x0437, B:212:0x0444, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:163:0x034e, B:166:0x0358, B:169:0x0361, B:171:0x0367, B:173:0x0372, B:174:0x0384, B:175:0x0385, B:176:0x0386, B:177:0x038e, B:255:0x04fa, B:257:0x0507, B:259:0x0512, B:261:0x0518, B:263:0x0524, B:273:0x0551, B:275:0x0574, B:317:0x0626, B:280:0x059b, B:283:0x05a4, B:354:0x0695, B:294:0x05c6, B:300:0x05e0, B:306:0x05f6, B:310:0x060a, B:314:0x061e, B:320:0x0637, B:324:0x0643, B:328:0x064c, B:336:0x065e, B:339:0x0667, B:343:0x0672, B:345:0x067e, B:347:0x0683, B:70:0x0174, B:72:0x0180, B:75:0x0189, B:77:0x018f, B:79:0x019a, B:80:0x01a6, B:81:0x01a7, B:82:0x01a8, B:41:0x010b, B:43:0x0117, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:52:0x0134, B:59:0x0149, B:66:0x015f, B:62:0x0156, B:65:0x015e, B:358:0x06b6, B:360:0x06c3, B:363:0x06c7, B:365:0x06d1, B:367:0x06db, B:371:0x06e3, B:369:0x06e0, B:374:0x06f8, B:378:0x0700, B:384:0x071f), top: B:409:0x0008, inners: #1, #2, #3, #10, #13 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x0396  */
    /* JADX WARN: Code duplicated, block: B:187:0x03ba A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x0167, B:85:0x01c2, B:88:0x01d6, B:90:0x01dc, B:92:0x01e4, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:100:0x0204, B:102:0x020a, B:104:0x0212, B:106:0x021a, B:108:0x0220, B:110:0x0226, B:112:0x022c, B:114:0x0234, B:117:0x023d, B:379:0x0703, B:119:0x026b, B:121:0x0271, B:123:0x027a, B:125:0x0289, B:127:0x0296, B:129:0x02ac, B:131:0x02b2, B:268:0x0537, B:134:0x02bd, B:137:0x02c9, B:252:0x04e7, B:140:0x02e7, B:142:0x02ef, B:144:0x02f7, B:146:0x02ff, B:151:0x030c, B:154:0x0325, B:156:0x032b, B:158:0x0338, B:179:0x03a0, B:181:0x03a6, B:183:0x03ac, B:185:0x03b4, B:187:0x03ba, B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:214:0x0455, B:216:0x045d, B:230:0x0498, B:232:0x04a2, B:250:0x04da, B:195:0x03eb, B:196:0x03ec, B:197:0x03ed, B:198:0x03fa, B:201:0x0402, B:204:0x0410, B:206:0x0416, B:208:0x0421, B:209:0x0435, B:210:0x0436, B:211:0x0437, B:212:0x0444, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:163:0x034e, B:166:0x0358, B:169:0x0361, B:171:0x0367, B:173:0x0372, B:174:0x0384, B:175:0x0385, B:176:0x0386, B:177:0x038e, B:255:0x04fa, B:257:0x0507, B:259:0x0512, B:261:0x0518, B:263:0x0524, B:273:0x0551, B:275:0x0574, B:317:0x0626, B:280:0x059b, B:283:0x05a4, B:354:0x0695, B:294:0x05c6, B:300:0x05e0, B:306:0x05f6, B:310:0x060a, B:314:0x061e, B:320:0x0637, B:324:0x0643, B:328:0x064c, B:336:0x065e, B:339:0x0667, B:343:0x0672, B:345:0x067e, B:347:0x0683, B:70:0x0174, B:72:0x0180, B:75:0x0189, B:77:0x018f, B:79:0x019a, B:80:0x01a6, B:81:0x01a7, B:82:0x01a8, B:41:0x010b, B:43:0x0117, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:52:0x0134, B:59:0x0149, B:66:0x015f, B:62:0x0156, B:65:0x015e, B:358:0x06b6, B:360:0x06c3, B:363:0x06c7, B:365:0x06d1, B:367:0x06db, B:371:0x06e3, B:369:0x06e0, B:374:0x06f8, B:378:0x0700, B:384:0x071f), top: B:409:0x0008, inners: #1, #2, #3, #10, #13 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:192:0x03d3 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, NumberFormatException -> 0x03ed, TryCatch #13 {NumberFormatException -> 0x03ed, blocks: (B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:195:0x03eb, B:196:0x03ec), top: B:408:0x03cd, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x03e0 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, NumberFormatException -> 0x03ed, TryCatch #13 {NumberFormatException -> 0x03ed, blocks: (B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:195:0x03eb, B:196:0x03ec), top: B:408:0x03cd, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x03fa A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x0167, B:85:0x01c2, B:88:0x01d6, B:90:0x01dc, B:92:0x01e4, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:100:0x0204, B:102:0x020a, B:104:0x0212, B:106:0x021a, B:108:0x0220, B:110:0x0226, B:112:0x022c, B:114:0x0234, B:117:0x023d, B:379:0x0703, B:119:0x026b, B:121:0x0271, B:123:0x027a, B:125:0x0289, B:127:0x0296, B:129:0x02ac, B:131:0x02b2, B:268:0x0537, B:134:0x02bd, B:137:0x02c9, B:252:0x04e7, B:140:0x02e7, B:142:0x02ef, B:144:0x02f7, B:146:0x02ff, B:151:0x030c, B:154:0x0325, B:156:0x032b, B:158:0x0338, B:179:0x03a0, B:181:0x03a6, B:183:0x03ac, B:185:0x03b4, B:187:0x03ba, B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:214:0x0455, B:216:0x045d, B:230:0x0498, B:232:0x04a2, B:250:0x04da, B:195:0x03eb, B:196:0x03ec, B:197:0x03ed, B:198:0x03fa, B:201:0x0402, B:204:0x0410, B:206:0x0416, B:208:0x0421, B:209:0x0435, B:210:0x0436, B:211:0x0437, B:212:0x0444, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:163:0x034e, B:166:0x0358, B:169:0x0361, B:171:0x0367, B:173:0x0372, B:174:0x0384, B:175:0x0385, B:176:0x0386, B:177:0x038e, B:255:0x04fa, B:257:0x0507, B:259:0x0512, B:261:0x0518, B:263:0x0524, B:273:0x0551, B:275:0x0574, B:317:0x0626, B:280:0x059b, B:283:0x05a4, B:354:0x0695, B:294:0x05c6, B:300:0x05e0, B:306:0x05f6, B:310:0x060a, B:314:0x061e, B:320:0x0637, B:324:0x0643, B:328:0x064c, B:336:0x065e, B:339:0x0667, B:343:0x0672, B:345:0x067e, B:347:0x0683, B:70:0x0174, B:72:0x0180, B:75:0x0189, B:77:0x018f, B:79:0x019a, B:80:0x01a6, B:81:0x01a7, B:82:0x01a8, B:41:0x010b, B:43:0x0117, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:52:0x0134, B:59:0x0149, B:66:0x015f, B:62:0x0156, B:65:0x015e, B:358:0x06b6, B:360:0x06c3, B:363:0x06c7, B:365:0x06d1, B:367:0x06db, B:371:0x06e3, B:369:0x06e0, B:374:0x06f8, B:378:0x0700, B:384:0x071f), top: B:409:0x0008, inners: #1, #2, #3, #10, #13 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x0400 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:201:0x0402 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x0167, B:85:0x01c2, B:88:0x01d6, B:90:0x01dc, B:92:0x01e4, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:100:0x0204, B:102:0x020a, B:104:0x0212, B:106:0x021a, B:108:0x0220, B:110:0x0226, B:112:0x022c, B:114:0x0234, B:117:0x023d, B:379:0x0703, B:119:0x026b, B:121:0x0271, B:123:0x027a, B:125:0x0289, B:127:0x0296, B:129:0x02ac, B:131:0x02b2, B:268:0x0537, B:134:0x02bd, B:137:0x02c9, B:252:0x04e7, B:140:0x02e7, B:142:0x02ef, B:144:0x02f7, B:146:0x02ff, B:151:0x030c, B:154:0x0325, B:156:0x032b, B:158:0x0338, B:179:0x03a0, B:181:0x03a6, B:183:0x03ac, B:185:0x03b4, B:187:0x03ba, B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:214:0x0455, B:216:0x045d, B:230:0x0498, B:232:0x04a2, B:250:0x04da, B:195:0x03eb, B:196:0x03ec, B:197:0x03ed, B:198:0x03fa, B:201:0x0402, B:204:0x0410, B:206:0x0416, B:208:0x0421, B:209:0x0435, B:210:0x0436, B:211:0x0437, B:212:0x0444, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:163:0x034e, B:166:0x0358, B:169:0x0361, B:171:0x0367, B:173:0x0372, B:174:0x0384, B:175:0x0385, B:176:0x0386, B:177:0x038e, B:255:0x04fa, B:257:0x0507, B:259:0x0512, B:261:0x0518, B:263:0x0524, B:273:0x0551, B:275:0x0574, B:317:0x0626, B:280:0x059b, B:283:0x05a4, B:354:0x0695, B:294:0x05c6, B:300:0x05e0, B:306:0x05f6, B:310:0x060a, B:314:0x061e, B:320:0x0637, B:324:0x0643, B:328:0x064c, B:336:0x065e, B:339:0x0667, B:343:0x0672, B:345:0x067e, B:347:0x0683, B:70:0x0174, B:72:0x0180, B:75:0x0189, B:77:0x018f, B:79:0x019a, B:80:0x01a6, B:81:0x01a7, B:82:0x01a8, B:41:0x010b, B:43:0x0117, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:52:0x0134, B:59:0x0149, B:66:0x015f, B:62:0x0156, B:65:0x015e, B:358:0x06b6, B:360:0x06c3, B:363:0x06c7, B:365:0x06d1, B:367:0x06db, B:371:0x06e3, B:369:0x06e0, B:374:0x06f8, B:378:0x0700, B:384:0x071f), top: B:409:0x0008, inners: #1, #2, #3, #10, #13 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x040f  */
    /* JADX WARN: Code duplicated, block: B:206:0x0416 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, NumberFormatException -> 0x0437, TryCatch #10 {NumberFormatException -> 0x0437, blocks: (B:204:0x0410, B:206:0x0416, B:208:0x0421, B:209:0x0435, B:210:0x0436), top: B:403:0x0410, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x0421 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, NumberFormatException -> 0x0437, TryCatch #10 {NumberFormatException -> 0x0437, blocks: (B:204:0x0410, B:206:0x0416, B:208:0x0421, B:209:0x0435, B:210:0x0436), top: B:403:0x0410, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:212:0x0444 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x0167, B:85:0x01c2, B:88:0x01d6, B:90:0x01dc, B:92:0x01e4, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:100:0x0204, B:102:0x020a, B:104:0x0212, B:106:0x021a, B:108:0x0220, B:110:0x0226, B:112:0x022c, B:114:0x0234, B:117:0x023d, B:379:0x0703, B:119:0x026b, B:121:0x0271, B:123:0x027a, B:125:0x0289, B:127:0x0296, B:129:0x02ac, B:131:0x02b2, B:268:0x0537, B:134:0x02bd, B:137:0x02c9, B:252:0x04e7, B:140:0x02e7, B:142:0x02ef, B:144:0x02f7, B:146:0x02ff, B:151:0x030c, B:154:0x0325, B:156:0x032b, B:158:0x0338, B:179:0x03a0, B:181:0x03a6, B:183:0x03ac, B:185:0x03b4, B:187:0x03ba, B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:214:0x0455, B:216:0x045d, B:230:0x0498, B:232:0x04a2, B:250:0x04da, B:195:0x03eb, B:196:0x03ec, B:197:0x03ed, B:198:0x03fa, B:201:0x0402, B:204:0x0410, B:206:0x0416, B:208:0x0421, B:209:0x0435, B:210:0x0436, B:211:0x0437, B:212:0x0444, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:163:0x034e, B:166:0x0358, B:169:0x0361, B:171:0x0367, B:173:0x0372, B:174:0x0384, B:175:0x0385, B:176:0x0386, B:177:0x038e, B:255:0x04fa, B:257:0x0507, B:259:0x0512, B:261:0x0518, B:263:0x0524, B:273:0x0551, B:275:0x0574, B:317:0x0626, B:280:0x059b, B:283:0x05a4, B:354:0x0695, B:294:0x05c6, B:300:0x05e0, B:306:0x05f6, B:310:0x060a, B:314:0x061e, B:320:0x0637, B:324:0x0643, B:328:0x064c, B:336:0x065e, B:339:0x0667, B:343:0x0672, B:345:0x067e, B:347:0x0683, B:70:0x0174, B:72:0x0180, B:75:0x0189, B:77:0x018f, B:79:0x019a, B:80:0x01a6, B:81:0x01a7, B:82:0x01a8, B:41:0x010b, B:43:0x0117, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:52:0x0134, B:59:0x0149, B:66:0x015f, B:62:0x0156, B:65:0x015e, B:358:0x06b6, B:360:0x06c3, B:363:0x06c7, B:365:0x06d1, B:367:0x06db, B:371:0x06e3, B:369:0x06e0, B:374:0x06f8, B:378:0x0700, B:384:0x071f), top: B:409:0x0008, inners: #1, #2, #3, #10, #13 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x0451  */
    /* JADX WARN: Code duplicated, block: B:216:0x045d A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x0167, B:85:0x01c2, B:88:0x01d6, B:90:0x01dc, B:92:0x01e4, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:100:0x0204, B:102:0x020a, B:104:0x0212, B:106:0x021a, B:108:0x0220, B:110:0x0226, B:112:0x022c, B:114:0x0234, B:117:0x023d, B:379:0x0703, B:119:0x026b, B:121:0x0271, B:123:0x027a, B:125:0x0289, B:127:0x0296, B:129:0x02ac, B:131:0x02b2, B:268:0x0537, B:134:0x02bd, B:137:0x02c9, B:252:0x04e7, B:140:0x02e7, B:142:0x02ef, B:144:0x02f7, B:146:0x02ff, B:151:0x030c, B:154:0x0325, B:156:0x032b, B:158:0x0338, B:179:0x03a0, B:181:0x03a6, B:183:0x03ac, B:185:0x03b4, B:187:0x03ba, B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:214:0x0455, B:216:0x045d, B:230:0x0498, B:232:0x04a2, B:250:0x04da, B:195:0x03eb, B:196:0x03ec, B:197:0x03ed, B:198:0x03fa, B:201:0x0402, B:204:0x0410, B:206:0x0416, B:208:0x0421, B:209:0x0435, B:210:0x0436, B:211:0x0437, B:212:0x0444, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:163:0x034e, B:166:0x0358, B:169:0x0361, B:171:0x0367, B:173:0x0372, B:174:0x0384, B:175:0x0385, B:176:0x0386, B:177:0x038e, B:255:0x04fa, B:257:0x0507, B:259:0x0512, B:261:0x0518, B:263:0x0524, B:273:0x0551, B:275:0x0574, B:317:0x0626, B:280:0x059b, B:283:0x05a4, B:354:0x0695, B:294:0x05c6, B:300:0x05e0, B:306:0x05f6, B:310:0x060a, B:314:0x061e, B:320:0x0637, B:324:0x0643, B:328:0x064c, B:336:0x065e, B:339:0x0667, B:343:0x0672, B:345:0x067e, B:347:0x0683, B:70:0x0174, B:72:0x0180, B:75:0x0189, B:77:0x018f, B:79:0x019a, B:80:0x01a6, B:81:0x01a7, B:82:0x01a8, B:41:0x010b, B:43:0x0117, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:52:0x0134, B:59:0x0149, B:66:0x015f, B:62:0x0156, B:65:0x015e, B:358:0x06b6, B:360:0x06c3, B:363:0x06c7, B:365:0x06d1, B:367:0x06db, B:371:0x06e3, B:369:0x06e0, B:374:0x06f8, B:378:0x0700, B:384:0x071f), top: B:409:0x0008, inners: #1, #2, #3, #10, #13 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x046a  */
    /* JADX WARN: Code duplicated, block: B:225:0x047f  */
    /* JADX WARN: Code duplicated, block: B:227:0x0487  */
    /* JADX WARN: Code duplicated, block: B:228:0x0491  */
    /* JADX WARN: Code duplicated, block: B:232:0x04a2 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x0167, B:85:0x01c2, B:88:0x01d6, B:90:0x01dc, B:92:0x01e4, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:100:0x0204, B:102:0x020a, B:104:0x0212, B:106:0x021a, B:108:0x0220, B:110:0x0226, B:112:0x022c, B:114:0x0234, B:117:0x023d, B:379:0x0703, B:119:0x026b, B:121:0x0271, B:123:0x027a, B:125:0x0289, B:127:0x0296, B:129:0x02ac, B:131:0x02b2, B:268:0x0537, B:134:0x02bd, B:137:0x02c9, B:252:0x04e7, B:140:0x02e7, B:142:0x02ef, B:144:0x02f7, B:146:0x02ff, B:151:0x030c, B:154:0x0325, B:156:0x032b, B:158:0x0338, B:179:0x03a0, B:181:0x03a6, B:183:0x03ac, B:185:0x03b4, B:187:0x03ba, B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:214:0x0455, B:216:0x045d, B:230:0x0498, B:232:0x04a2, B:250:0x04da, B:195:0x03eb, B:196:0x03ec, B:197:0x03ed, B:198:0x03fa, B:201:0x0402, B:204:0x0410, B:206:0x0416, B:208:0x0421, B:209:0x0435, B:210:0x0436, B:211:0x0437, B:212:0x0444, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:163:0x034e, B:166:0x0358, B:169:0x0361, B:171:0x0367, B:173:0x0372, B:174:0x0384, B:175:0x0385, B:176:0x0386, B:177:0x038e, B:255:0x04fa, B:257:0x0507, B:259:0x0512, B:261:0x0518, B:263:0x0524, B:273:0x0551, B:275:0x0574, B:317:0x0626, B:280:0x059b, B:283:0x05a4, B:354:0x0695, B:294:0x05c6, B:300:0x05e0, B:306:0x05f6, B:310:0x060a, B:314:0x061e, B:320:0x0637, B:324:0x0643, B:328:0x064c, B:336:0x065e, B:339:0x0667, B:343:0x0672, B:345:0x067e, B:347:0x0683, B:70:0x0174, B:72:0x0180, B:75:0x0189, B:77:0x018f, B:79:0x019a, B:80:0x01a6, B:81:0x01a7, B:82:0x01a8, B:41:0x010b, B:43:0x0117, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:52:0x0134, B:59:0x0149, B:66:0x015f, B:62:0x0156, B:65:0x015e, B:358:0x06b6, B:360:0x06c3, B:363:0x06c7, B:365:0x06d1, B:367:0x06db, B:371:0x06e3, B:369:0x06e0, B:374:0x06f8, B:378:0x0700, B:384:0x071f), top: B:409:0x0008, inners: #1, #2, #3, #10, #13 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:237:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:243:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:246:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:248:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:249:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:271:0x0543 A[LOOP:1: B:121:0x0271->B:271:0x0543, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:415:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x0341 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x03ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x03eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x0436 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x0435 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x053d A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:276:0x0580. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v64, types: [com.google.android.gms.internal.ads.zzaom, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.google.android.gms.internal.ads.zzaok] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24 */
    /* JADX WARN: Type inference failed for: r17v25 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r47v1, types: [com.google.android.gms.internal.ads.zzaoo, java.lang.Throwable] */
    public final zzang zzb(byte[] bArr, int i10, int i11) {
        String str;
        String str2;
        HashMap map;
        ArrayDeque arrayDeque;
        zzaoj zzaojVar;
        ?? r17;
        ?? zzaokVar;
        zzaoj zzaojVar2;
        zzaoi zzaoiVar;
        zzaoi zzaoiVar2;
        long j10;
        Object obj;
        String str3;
        String str4;
        String strZzc;
        String str5;
        String strZzL;
        String str6;
        HashMap map2;
        String str7;
        float f10;
        float f11;
        ?? zzaomVar;
        String strZzc2;
        float f12;
        float f13;
        String strZzc3;
        int i12;
        float f14;
        String strZzc4;
        int i13;
        String strZza;
        int iHashCode;
        String strZza2;
        int iHashCode2;
        Matcher matcher;
        Matcher matcher2;
        String strGroup;
        int i14;
        String strGroup2;
        String strGroup3;
        float f15;
        String strGroup4;
        String strZzc5;
        zzaoo zzaooVar;
        Matcher matcher3;
        Matcher matcher4;
        String strGroup5;
        int i15;
        String strGroup6;
        String strGroup7;
        float f16;
        String strGroup8;
        zzaoo zzaooVar2;
        String str8;
        float f17;
        boolean z10;
        String str9 = "";
        String str10 = "http://www.w3.org/ns/ttml#parameter";
        String str11 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser xmlPullParserNewPullParser = this.zzi.newPullParser();
            HashMap map3 = new HashMap();
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            map4.put("", new zzaom("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj2 = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            zzaoj zzaojVar3 = zzh;
            zzaop zzaopVar = null;
            ?? r18 = 0;
            zzaoj zzaojVar4 = zzaojVar3;
            int i16 = 0;
            int i17 = 15;
            while (eventType != 1) {
                zzaoi zzaoiVar3 = (zzaoi) arrayDeque2.peek();
                ?? r47 = obj2;
                if (i16 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    str = str9;
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str10, "frameRate");
                            int i18 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            zzaopVar = zzaopVar;
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str10, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                String str12 = zzfl.zza;
                                String[] strArrSplit = attributeValue2.split(" ", -1);
                                zzgtj.zzb(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f17 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
                            } else {
                                f17 = 1.0f;
                            }
                            int i19 = zzaojVar3.zzb;
                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str10, "subFrameRate");
                            if (attributeValue3 != null) {
                                i19 = Integer.parseInt(attributeValue3);
                            }
                            int i20 = zzaojVar3.zzc;
                            zzaojVar = zzaojVar3;
                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str10, "tickRate");
                            if (attributeValue4 != null) {
                                i20 = Integer.parseInt(attributeValue4);
                            }
                            zzaojVar4 = new zzaoj(i18 * f17, i19, i20);
                            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str10, "cellResolution");
                            if (attributeValue5 == null) {
                                str2 = str10;
                                zzaojVar4 = zzaojVar4;
                                i17 = 15;
                            } else {
                                Matcher matcher5 = zzg.matcher(attributeValue5);
                                if (matcher5.matches()) {
                                    try {
                                        String strGroup9 = matcher5.group(1);
                                        if (strGroup9 == null) {
                                            throw r47;
                                        }
                                        int i21 = Integer.parseInt(strGroup9);
                                        str2 = str10;
                                        try {
                                            String strGroup10 = matcher5.group(2);
                                            if (strGroup10 == null) {
                                                throw r47;
                                            }
                                            int i22 = Integer.parseInt(strGroup10);
                                            try {
                                                if (i21 != 0) {
                                                    if (i22 != 0) {
                                                        z10 = true;
                                                    } else {
                                                        i22 = 0;
                                                        z10 = false;
                                                    }
                                                    zzgtj.zzg(z10, "Invalid cell resolution %s %s", i21, i22);
                                                    i17 = i22;
                                                } else {
                                                    z10 = false;
                                                }
                                                zzgtj.zzg(z10, "Invalid cell resolution %s %s", i21, i22);
                                                i17 = i22;
                                            } catch (NumberFormatException unused) {
                                                zzeg.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                                i17 = 15;
                                            }
                                        } catch (NumberFormatException unused2) {
                                            zzaojVar4 = zzaojVar4;
                                        }
                                    } catch (NumberFormatException unused3) {
                                        str2 = str10;
                                    }
                                    zzaojVar4 = zzaojVar4;
                                    zzeg.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    i17 = 15;
                                } else {
                                    zzeg.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    str2 = str10;
                                    zzaojVar4 = zzaojVar4;
                                    i17 = 15;
                                }
                            }
                            String strZzc6 = zzft.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                            if (strZzc6 == null) {
                                zzaokVar = r47;
                            } else {
                                Matcher matcher6 = zzf.matcher(strZzc6);
                                if (matcher6.matches()) {
                                    try {
                                        String strGroup11 = matcher6.group(1);
                                        if (strGroup11 == null) {
                                            throw r47;
                                        }
                                        int i23 = Integer.parseInt(strGroup11);
                                        String strGroup12 = matcher6.group(2);
                                        if (strGroup12 == null) {
                                            throw r47;
                                        }
                                        zzaokVar = new zzaok(i23, Integer.parseInt(strGroup12));
                                    } catch (NumberFormatException unused4) {
                                        zzeg.zzc("TtmlParser", "Ignoring malformed tts extent: ".concat(strZzc6));
                                        zzaokVar = r47;
                                    }
                                } else {
                                    zzeg.zzc("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strZzc6));
                                }
                                zzaokVar = r47;
                            }
                        } else {
                            str2 = str10;
                            arrayDeque2 = arrayDeque2;
                            zzaojVar = zzaojVar3;
                            zzaopVar = zzaopVar;
                            i16 = i16;
                            zzaokVar = r18;
                        }
                        zzaoj zzaojVar5 = zzaojVar4;
                        r18 = zzaokVar;
                        i17 = i17;
                        boolean zEquals = name.equals(TtmlNode.TAG_TT);
                        String str13 = "image";
                        String str14 = TtmlNode.TAG_METADATA;
                        String str15 = TtmlNode.TAG_REGION;
                        String str16 = TtmlNode.TAG_HEAD;
                        zzaojVar4 = zzaojVar5;
                        if (zEquals || name.equals(TtmlNode.TAG_HEAD) || name.equals(TtmlNode.TAG_BODY) || name.equals(TtmlNode.TAG_DIV) || name.equals(TtmlNode.TAG_P) || name.equals(TtmlNode.TAG_SPAN) || name.equals(TtmlNode.TAG_BR) || name.equals(TtmlNode.TAG_STYLE) || name.equals(TtmlNode.TAG_STYLING) || name.equals(TtmlNode.TAG_LAYOUT) || name.equals(TtmlNode.TAG_REGION) || name.equals(TtmlNode.TAG_METADATA) || name.equals("image") || name.equals(DataSchemeDataSource.SCHEME_DATA) || name.equals("information")) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                while (true) {
                                    xmlPullParserNewPullParser.next();
                                    if (zzft.zzb(xmlPullParserNewPullParser, TtmlNode.TAG_STYLE)) {
                                        String strZzc7 = zzft.zzc(xmlPullParserNewPullParser, TtmlNode.TAG_STYLE);
                                        zzaoo zzaooVarZzd = zzd(xmlPullParserNewPullParser, new zzaoo());
                                        if (strZzc7 != null) {
                                            String[] strArrZzc = zzc(strZzc7);
                                            int i24 = 0;
                                            for (int length = strArrZzc.length; i24 < length; length = length) {
                                                zzaooVarZzd.zzr((zzaoo) map3.get(strArrZzc[i24]));
                                                i24++;
                                            }
                                        }
                                        String strZzt = zzaooVarZzd.zzt();
                                        if (strZzt != null) {
                                            map3.put(strZzt, zzaooVarZzd);
                                        }
                                        map = map5;
                                        str3 = str14;
                                        str4 = str15;
                                    } else {
                                        str11 = str11;
                                        str16 = str16;
                                        if (zzft.zzb(xmlPullParserNewPullParser, str15)) {
                                            str4 = str15;
                                            HashMap map6 = map5;
                                            String strZzc8 = zzft.zzc(xmlPullParserNewPullParser, "id");
                                            if (strZzc8 == null) {
                                                zzaomVar = r47;
                                                str6 = str13;
                                                map2 = map4;
                                                str7 = str14;
                                            } else {
                                                String strZzc9 = zzft.zzc(xmlPullParserNewPullParser, "origin");
                                                if (strZzc9 == null) {
                                                    str5 = strZzc9;
                                                    String strZzc10 = zzft.zzc(xmlPullParserNewPullParser, TtmlNode.TAG_STYLE);
                                                    if (strZzc10 != null && (zzaooVar2 = (zzaoo) map3.get(strZzc10)) != null) {
                                                        strZzL = zzaooVar2.zzL();
                                                    }
                                                    if (strZzL != null) {
                                                        str6 = str13;
                                                        matcher3 = zzb.matcher(strZzL);
                                                        str7 = str14;
                                                        matcher4 = zzf.matcher(strZzL);
                                                        if (matcher3.matches()) {
                                                            map2 = map4;
                                                            try {
                                                                strGroup7 = matcher3.group(1);
                                                                if (strGroup7 != null) {
                                                                    throw r47;
                                                                }
                                                                f16 = Float.parseFloat(strGroup7) / 100.0f;
                                                                strGroup8 = matcher3.group(2);
                                                                if (strGroup8 != null) {
                                                                    throw r47;
                                                                }
                                                                f10 = Float.parseFloat(strGroup8) / 100.0f;
                                                                f11 = f16;
                                                            } catch (NumberFormatException unused5) {
                                                                zzeg.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(strZzL));
                                                            }
                                                        } else {
                                                            map2 = map4;
                                                            if (matcher4.matches()) {
                                                                zzeg.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZzL));
                                                            } else if (r18 == 0) {
                                                                zzeg.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZzL));
                                                            } else {
                                                                try {
                                                                    strGroup5 = matcher4.group(1);
                                                                    if (strGroup5 != null) {
                                                                        throw r47;
                                                                    }
                                                                    i15 = Integer.parseInt(strGroup5);
                                                                    strGroup6 = matcher4.group(2);
                                                                    if (strGroup6 != null) {
                                                                        throw r47;
                                                                    }
                                                                    int i25 = Integer.parseInt(strGroup6);
                                                                    float f18 = i15 / r18.zza;
                                                                    f10 = i25 / r18.zzb;
                                                                    f11 = f18;
                                                                } catch (NumberFormatException unused6) {
                                                                    zzeg.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(strZzL));
                                                                }
                                                            }
                                                            zzaomVar = r47;
                                                        }
                                                    } else {
                                                        str6 = str13;
                                                        map2 = map4;
                                                        str7 = str14;
                                                        f10 = 0.0f;
                                                        f11 = 0.0f;
                                                    }
                                                    strZzc2 = zzft.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                    if (strZzc2 == null && (strZzc5 = zzft.zzc(xmlPullParserNewPullParser, TtmlNode.TAG_STYLE)) != null && (zzaooVar = (zzaoo) map3.get(strZzc5)) != null) {
                                                        strZzc2 = zzaooVar.zzN();
                                                    }
                                                    if (strZzc2 != null) {
                                                        matcher = zzb.matcher(strZzc2);
                                                        matcher2 = zzf.matcher(strZzc2);
                                                        if (matcher.matches()) {
                                                            try {
                                                                strGroup3 = matcher.group(1);
                                                                if (strGroup3 != null) {
                                                                    throw r47;
                                                                }
                                                                f15 = Float.parseFloat(strGroup3) / 100.0f;
                                                                strGroup4 = matcher.group(2);
                                                                if (strGroup4 != null) {
                                                                    throw r47;
                                                                }
                                                                f12 = f15;
                                                                f13 = Float.parseFloat(strGroup4) / 100.0f;
                                                            } catch (NumberFormatException unused7) {
                                                                zzeg.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strZzL)));
                                                                zzaomVar = r47;
                                                            }
                                                        } else {
                                                            if (matcher2.matches()) {
                                                                zzeg.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strZzL)));
                                                            } else if (r18 == 0) {
                                                                zzeg.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strZzL)));
                                                            } else {
                                                                try {
                                                                    strGroup = matcher2.group(1);
                                                                    if (strGroup != null) {
                                                                        throw r47;
                                                                    }
                                                                    i14 = Integer.parseInt(strGroup);
                                                                    strGroup2 = matcher2.group(2);
                                                                    if (strGroup2 != null) {
                                                                        throw r47;
                                                                    }
                                                                    int i26 = Integer.parseInt(strGroup2);
                                                                    float f19 = i14 / r18.zza;
                                                                    f13 = i26 / r18.zzb;
                                                                    f12 = f19;
                                                                } catch (NumberFormatException unused8) {
                                                                    zzeg.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strZzL)));
                                                                    zzaomVar = r47;
                                                                }
                                                            }
                                                            zzaomVar = r47;
                                                        }
                                                    } else {
                                                        f12 = 1.0f;
                                                        f13 = 1.0f;
                                                    }
                                                    strZzc3 = zzft.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                    if (strZzc3 != null) {
                                                        strZza2 = zzgss.zza(strZzc3);
                                                        iHashCode2 = strZza2.hashCode();
                                                        if (iHashCode2 != -1364013995) {
                                                            if (iHashCode2 != 92734940 && strZza2.equals("after")) {
                                                                f14 = f10 + f13;
                                                                i12 = 2;
                                                            } else {
                                                                i12 = 0;
                                                                f14 = f10;
                                                            }
                                                        } else if (strZza2.equals(TtmlNode.CENTER)) {
                                                            f14 = f10 + (f13 / 2.0f);
                                                            i12 = 1;
                                                        } else {
                                                            i12 = 0;
                                                            f14 = f10;
                                                        }
                                                    } else {
                                                        i12 = 0;
                                                        f14 = f10;
                                                    }
                                                    float f20 = 1.0f / i17;
                                                    strZzc4 = zzft.zzc(xmlPullParserNewPullParser, "writingMode");
                                                    if (strZzc4 != null) {
                                                        strZza = zzgss.zza(strZzc4);
                                                        iHashCode = strZza.hashCode();
                                                        if (iHashCode != 3694) {
                                                            if (iHashCode != 3553396) {
                                                                if (iHashCode == 3553576 && strZza.equals("tbrl")) {
                                                                    i13 = 1;
                                                                }
                                                            } else if (strZza.equals("tblr")) {
                                                                i13 = 2;
                                                            }
                                                            i13 = Integer.MIN_VALUE;
                                                        } else if (strZza.equals("tb")) {
                                                            i13 = 2;
                                                        } else {
                                                            i13 = Integer.MIN_VALUE;
                                                        }
                                                    } else {
                                                        i13 = Integer.MIN_VALUE;
                                                    }
                                                    zzaomVar = new zzaom(strZzc8, f11, f14, 0, i12, f12, f13, 1, f20, i13);
                                                } else {
                                                    str5 = strZzc9;
                                                }
                                                strZzL = str5;
                                                if (strZzL != null) {
                                                    str6 = str13;
                                                    matcher3 = zzb.matcher(strZzL);
                                                    str7 = str14;
                                                    matcher4 = zzf.matcher(strZzL);
                                                    if (matcher3.matches()) {
                                                        map2 = map4;
                                                        strGroup7 = matcher3.group(1);
                                                        if (strGroup7 != null) {
                                                            throw r47;
                                                        }
                                                        f16 = Float.parseFloat(strGroup7) / 100.0f;
                                                        strGroup8 = matcher3.group(2);
                                                        if (strGroup8 != null) {
                                                            throw r47;
                                                        }
                                                        f10 = Float.parseFloat(strGroup8) / 100.0f;
                                                        f11 = f16;
                                                    } else {
                                                        map2 = map4;
                                                        if (matcher4.matches()) {
                                                            zzeg.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZzL));
                                                        } else if (r18 == 0) {
                                                            zzeg.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZzL));
                                                        } else {
                                                            strGroup5 = matcher4.group(1);
                                                            if (strGroup5 != null) {
                                                                throw r47;
                                                            }
                                                            i15 = Integer.parseInt(strGroup5);
                                                            strGroup6 = matcher4.group(2);
                                                            if (strGroup6 != null) {
                                                                throw r47;
                                                            }
                                                            int i27 = Integer.parseInt(strGroup6);
                                                            float f110 = i15 / r18.zza;
                                                            f10 = i27 / r18.zzb;
                                                            f11 = f110;
                                                        }
                                                        zzaomVar = r47;
                                                    }
                                                } else {
                                                    str6 = str13;
                                                    map2 = map4;
                                                    str7 = str14;
                                                    f10 = 0.0f;
                                                    f11 = 0.0f;
                                                }
                                                strZzc2 = zzft.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                if (strZzc2 == null) {
                                                    strZzc2 = zzaooVar.zzN();
                                                }
                                                if (strZzc2 != null) {
                                                    matcher = zzb.matcher(strZzc2);
                                                    matcher2 = zzf.matcher(strZzc2);
                                                    if (matcher.matches()) {
                                                        strGroup3 = matcher.group(1);
                                                        if (strGroup3 != null) {
                                                            throw r47;
                                                        }
                                                        f15 = Float.parseFloat(strGroup3) / 100.0f;
                                                        strGroup4 = matcher.group(2);
                                                        if (strGroup4 != null) {
                                                            throw r47;
                                                        }
                                                        f12 = f15;
                                                        f13 = Float.parseFloat(strGroup4) / 100.0f;
                                                    } else {
                                                        if (matcher2.matches()) {
                                                            zzeg.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strZzL)));
                                                        } else if (r18 == 0) {
                                                            zzeg.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strZzL)));
                                                        } else {
                                                            strGroup = matcher2.group(1);
                                                            if (strGroup != null) {
                                                                throw r47;
                                                            }
                                                            i14 = Integer.parseInt(strGroup);
                                                            strGroup2 = matcher2.group(2);
                                                            if (strGroup2 != null) {
                                                                throw r47;
                                                            }
                                                            int i28 = Integer.parseInt(strGroup2);
                                                            float f111 = i14 / r18.zza;
                                                            f13 = i28 / r18.zzb;
                                                            f12 = f111;
                                                        }
                                                        zzaomVar = r47;
                                                    }
                                                } else {
                                                    f12 = 1.0f;
                                                    f13 = 1.0f;
                                                }
                                                strZzc3 = zzft.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                if (strZzc3 != null) {
                                                    strZza2 = zzgss.zza(strZzc3);
                                                    iHashCode2 = strZza2.hashCode();
                                                    if (iHashCode2 != -1364013995) {
                                                        if (iHashCode2 != 92734940) {
                                                            i12 = 0;
                                                            f14 = f10;
                                                        } else {
                                                            f14 = f10 + f13;
                                                            i12 = 2;
                                                        }
                                                    } else if (strZza2.equals(TtmlNode.CENTER)) {
                                                        f14 = f10 + (f13 / 2.0f);
                                                        i12 = 1;
                                                    } else {
                                                        i12 = 0;
                                                        f14 = f10;
                                                    }
                                                } else {
                                                    i12 = 0;
                                                    f14 = f10;
                                                }
                                                float f21 = 1.0f / i17;
                                                strZzc4 = zzft.zzc(xmlPullParserNewPullParser, "writingMode");
                                                if (strZzc4 != null) {
                                                    strZza = zzgss.zza(strZzc4);
                                                    iHashCode = strZza.hashCode();
                                                    if (iHashCode != 3694) {
                                                        if (iHashCode != 3553396) {
                                                            if (iHashCode == 3553576) {
                                                                i13 = 1;
                                                            }
                                                        } else if (strZza.equals("tblr")) {
                                                            i13 = 2;
                                                        }
                                                        i13 = Integer.MIN_VALUE;
                                                    } else if (strZza.equals("tb")) {
                                                        i13 = 2;
                                                    } else {
                                                        i13 = Integer.MIN_VALUE;
                                                    }
                                                } else {
                                                    i13 = Integer.MIN_VALUE;
                                                }
                                                zzaomVar = new zzaom(strZzc8, f11, f14, 0, i12, f12, f13, 1, f21, i13);
                                            }
                                            if (zzaomVar != 0) {
                                                map4 = map2;
                                                map4.put(zzaomVar.zza, zzaomVar);
                                            } else {
                                                map4 = map2;
                                            }
                                            str8 = str16;
                                            map = map6;
                                            str13 = str6;
                                            str3 = str7;
                                        } else {
                                            String str17 = str13;
                                            HashMap map7 = map5;
                                            str3 = str14;
                                            str4 = str15;
                                            if (zzft.zzb(xmlPullParserNewPullParser, str3)) {
                                                while (true) {
                                                    xmlPullParserNewPullParser.next();
                                                    str13 = str17;
                                                    if (!zzft.zzb(xmlPullParserNewPullParser, str13) || (strZzc = zzft.zzc(xmlPullParserNewPullParser, "id")) == null) {
                                                        map = map7;
                                                    } else {
                                                        map = map7;
                                                        map.put(strZzc, xmlPullParserNewPullParser.nextText());
                                                    }
                                                    if (!zzft.zza(xmlPullParserNewPullParser, str3)) {
                                                        str17 = str13;
                                                        map7 = map;
                                                    }
                                                }
                                            } else {
                                                map = map7;
                                                str13 = str17;
                                            }
                                        }
                                        if (zzft.zza(xmlPullParserNewPullParser, str8)) {
                                            zzaojVar2 = zzaojVar4;
                                            arrayDeque = arrayDeque2;
                                        } else {
                                            str14 = str3;
                                            map5 = map;
                                            str15 = str4;
                                            str16 = str8;
                                            str11 = str11;
                                        }
                                    }
                                    str8 = str16;
                                    if (zzft.zza(xmlPullParserNewPullParser, str8)) {
                                        zzaojVar2 = zzaojVar4;
                                        arrayDeque = arrayDeque2;
                                    } else {
                                        str14 = str3;
                                        map5 = map;
                                        str15 = str4;
                                        str16 = str8;
                                        str11 = str11;
                                    }
                                }
                            } else {
                                str11 = str11;
                                map = map5;
                                Object obj3 = TtmlNode.TAG_REGION;
                                try {
                                    int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                    zzaoo zzaooVarZzd2 = zzd(xmlPullParserNewPullParser, r47);
                                    int i29 = 0;
                                    String str18 = str;
                                    long jZzg = C.TIME_UNSET;
                                    long jZzg2 = C.TIME_UNSET;
                                    long jZzg3 = C.TIME_UNSET;
                                    String[] strArr = null;
                                    String strSubstring = null;
                                    while (i29 < attributeCount) {
                                        String attributeName = xmlPullParserNewPullParser.getAttributeName(i29);
                                        String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i29);
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                zzaojVar2 = zzaojVar4;
                                                obj = obj3;
                                                if (attributeName.equals(obj) && map4.containsKey(attributeValue6)) {
                                                    str18 = attributeValue6;
                                                }
                                                try {
                                                    i29++;
                                                    obj3 = obj;
                                                    zzaojVar4 = zzaojVar2;
                                                } catch (zzanh e10) {
                                                    e = e10;
                                                    arrayDeque = arrayDeque2;
                                                    zzeg.zzd("TtmlParser", "Suppressing parser error", e);
                                                    zzaojVar4 = zzaojVar2;
                                                    i16 = 1;
                                                    xmlPullParserNewPullParser.next();
                                                    eventType = xmlPullParserNewPullParser.getEventType();
                                                    arrayDeque2 = arrayDeque;
                                                    map5 = map;
                                                    str9 = str;
                                                    zzaojVar3 = zzaojVar;
                                                    str10 = str2;
                                                    str11 = str11;
                                                    obj2 = null;
                                                    r18 = r18;
                                                }
                                                break;
                                            case 99841:
                                                zzaojVar2 = zzaojVar4;
                                                if (attributeName.equals("dur")) {
                                                    jZzg3 = zzg(attributeValue6, zzaojVar2);
                                                }
                                                obj = obj3;
                                                i29++;
                                                obj3 = obj;
                                                zzaojVar4 = zzaojVar2;
                                                break;
                                            case 100571:
                                                zzaojVar2 = zzaojVar4;
                                                if (attributeName.equals(TtmlNode.END)) {
                                                    jZzg = zzg(attributeValue6, zzaojVar2);
                                                }
                                                obj = obj3;
                                                i29++;
                                                obj3 = obj;
                                                zzaojVar4 = zzaojVar2;
                                                break;
                                            case 93616297:
                                                if (attributeName.equals("begin")) {
                                                    zzaojVar2 = zzaojVar4;
                                                    jZzg2 = zzg(attributeValue6, zzaojVar2);
                                                } else {
                                                    zzaojVar2 = zzaojVar4;
                                                }
                                                obj = obj3;
                                                i29++;
                                                obj3 = obj;
                                                zzaojVar4 = zzaojVar2;
                                                break;
                                            case 109780401:
                                                if (attributeName.equals(TtmlNode.TAG_STYLE)) {
                                                    String[] strArrZzc2 = zzc(attributeValue6);
                                                    if (strArrZzc2.length > 0) {
                                                        strArr = strArrZzc2;
                                                    }
                                                }
                                                zzaojVar2 = zzaojVar4;
                                                obj = obj3;
                                                i29++;
                                                obj3 = obj;
                                                zzaojVar4 = zzaojVar2;
                                                break;
                                            case 1292595405:
                                                if (attributeName.equals("backgroundImage")) {
                                                    try {
                                                        if (attributeValue6.startsWith("#")) {
                                                            strSubstring = attributeValue6.substring(1);
                                                        }
                                                    } catch (zzanh e11) {
                                                        e = e11;
                                                        zzaojVar2 = zzaojVar4;
                                                        arrayDeque = arrayDeque2;
                                                        zzeg.zzd("TtmlParser", "Suppressing parser error", e);
                                                        zzaojVar4 = zzaojVar2;
                                                        i16 = 1;
                                                        xmlPullParserNewPullParser.next();
                                                        eventType = xmlPullParserNewPullParser.getEventType();
                                                        arrayDeque2 = arrayDeque;
                                                        map5 = map;
                                                        str9 = str;
                                                        zzaojVar3 = zzaojVar;
                                                        str10 = str2;
                                                        str11 = str11;
                                                        obj2 = null;
                                                        r18 = r18;
                                                    }
                                                }
                                                zzaojVar2 = zzaojVar4;
                                                obj = obj3;
                                                i29++;
                                                obj3 = obj;
                                                zzaojVar4 = zzaojVar2;
                                                break;
                                            default:
                                                zzaojVar2 = zzaojVar4;
                                                obj = obj3;
                                                i29++;
                                                obj3 = obj;
                                                zzaojVar4 = zzaojVar2;
                                                break;
                                        }
                                    }
                                    zzaojVar2 = zzaojVar4;
                                    if (zzaoiVar3 != null) {
                                        zzaoiVar = zzaoiVar3;
                                        long j11 = zzaoiVar.zzd;
                                        if (j11 == C.TIME_UNSET) {
                                            zzaoiVar2 = zzaoiVar;
                                        } else {
                                            jZzg2 = jZzg2 != C.TIME_UNSET ? jZzg2 + j11 : -9223372036854775807L;
                                            if (jZzg != C.TIME_UNSET) {
                                                jZzg += j11;
                                                zzaoiVar2 = zzaoiVar;
                                            } else {
                                                zzaoiVar2 = zzaoiVar;
                                                jZzg = -9223372036854775807L;
                                            }
                                        }
                                    } else {
                                        zzaoiVar = zzaoiVar3;
                                        zzaoiVar2 = null;
                                    }
                                    if (jZzg != C.TIME_UNSET) {
                                        j10 = jZzg;
                                    } else {
                                        if (jZzg3 != C.TIME_UNSET) {
                                            jZzg = jZzg2 + jZzg3;
                                        } else {
                                            if (zzaoiVar2 != null) {
                                                jZzg = zzaoiVar2.zze;
                                                if (jZzg != C.TIME_UNSET) {
                                                }
                                            }
                                            j10 = -9223372036854775807L;
                                        }
                                        j10 = jZzg;
                                    }
                                    zzaoi zzaoiVarZzb = zzaoi.zzb(xmlPullParserNewPullParser.getName(), jZzg2, j10, zzaooVarZzd2, strArr, str18, strSubstring, zzaoiVar2);
                                    arrayDeque = arrayDeque2;
                                    try {
                                        arrayDeque.push(zzaoiVarZzb);
                                        if (zzaoiVar != null) {
                                            zzaoiVar.zzd(zzaoiVarZzb);
                                        }
                                    } catch (zzanh e12) {
                                        e = e12;
                                        zzeg.zzd("TtmlParser", "Suppressing parser error", e);
                                        zzaojVar4 = zzaojVar2;
                                        i16 = 1;
                                    }
                                } catch (zzanh e13) {
                                    e = e13;
                                }
                            }
                            zzaojVar4 = zzaojVar2;
                            r17 = r18;
                            i17 = i17;
                        } else {
                            String name2 = xmlPullParserNewPullParser.getName();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 26);
                            sb2.append(str11);
                            sb2.append(name2);
                            zzeg.zzb("TtmlParser", sb2.toString());
                            str11 = str11;
                            map = map5;
                            arrayDeque = arrayDeque2;
                        }
                        i16 = 1;
                    } else {
                        str2 = str10;
                        str11 = str11;
                        arrayDeque = arrayDeque2;
                        zzaojVar = zzaojVar3;
                        zzaopVar = zzaopVar;
                        i16 = i16;
                        map = map5;
                        if (eventType != 4) {
                            if (eventType == 3) {
                                if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                                    zzaoi zzaoiVar4 = (zzaoi) arrayDeque.peek();
                                    if (zzaoiVar4 == null) {
                                        r17 = r18;
                                        throw null;
                                    }
                                    r17 = r18;
                                    zzaopVar = new zzaop(zzaoiVar4, map3, map4, map);
                                } else {
                                    r17 = r18;
                                    zzaopVar = zzaopVar;
                                }
                                arrayDeque.pop();
                                r18 = r18;
                            }
                            i16 = i16;
                        } else {
                            if (zzaoiVar3 == null) {
                                throw null;
                            }
                            zzaoiVar3.zzd(zzaoi.zza(xmlPullParserNewPullParser.getText()));
                            r17 = r18;
                        }
                    }
                    r17 = r18;
                    r17 = r18;
                    zzaopVar = zzaopVar;
                    r18 = r17;
                    i16 = i16;
                } else {
                    str = str9;
                    str2 = str10;
                    str11 = str11;
                    map = map5;
                    arrayDeque = arrayDeque2;
                    zzaojVar = zzaojVar3;
                    zzaopVar = zzaopVar;
                    i16 = i16;
                    if (eventType == 2) {
                        i16++;
                    } else {
                        if (eventType == 3) {
                            r17 = r18;
                            i16--;
                        }
                        r17 = r18;
                        r17 = r18;
                        zzaopVar = zzaopVar;
                        r18 = r17;
                        i16 = i16;
                    }
                    zzaopVar = zzaopVar;
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                arrayDeque2 = arrayDeque;
                map5 = map;
                str9 = str;
                zzaojVar3 = zzaojVar;
                str10 = str2;
                str11 = str11;
                obj2 = null;
                r18 = r18;
            }
            zzaop zzaopVar2 = zzaopVar;
            if (zzaopVar2 != null) {
                return zzaopVar2;
            }
            throw null;
        } catch (IOException e14) {
            throw new IllegalStateException("Unexpected error when reading input.", e14);
        } catch (XmlPullParserException e15) {
            throw new IllegalStateException("Unable to decode source", e15);
        }
    }
}
