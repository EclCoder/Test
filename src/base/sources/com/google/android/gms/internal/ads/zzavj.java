package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zzavj implements zzawe {
    public static final /* synthetic */ zzavj zza;
    public static final /* synthetic */ zzavj zzb;
    public static final /* synthetic */ zzavj zzc;
    public static final /* synthetic */ zzavj zzd;
    public static final /* synthetic */ zzavj zze;
    public static final /* synthetic */ zzavj zzf;
    public static final /* synthetic */ zzavj zzg;
    public static final /* synthetic */ zzavj zzh;
    public static final /* synthetic */ zzavj zzi;
    public static final /* synthetic */ zzavj zzj;
    public static final /* synthetic */ zzavj zzk;
    public static final /* synthetic */ zzavj zzl;
    public static final /* synthetic */ zzavj zzm;
    public static final /* synthetic */ zzavj zzn;
    public static final /* synthetic */ zzavj zzo;
    public static final /* synthetic */ zzavj zzp;
    public static final /* synthetic */ zzavj zzq;
    public static final /* synthetic */ zzavj zzr;
    public static final /* synthetic */ zzavj zzs;
    public static final /* synthetic */ zzavj zzt;
    public static final /* synthetic */ zzavj zzu;
    private final /* synthetic */ int zzv;

    static {
        int i10 = (((((~1272469786) & 1097507524) | 723881402) + ((1272469786 & 1078604356) | 746642480)) - (-1830851820)) ^ (1544617505 % 243268139);
        int i11 = (((((~1722060049) & 1087578905) | 70644109) + ((1722060049 & 1625428690) | 673239279)) - 1747544094) ^ (860516127 % 777720504);
        int i12 = (((((~168057522) & 567809569) | 2007585082) + ((168057522 & 1112917761) | 1200484666)) - (-1753249985)) ^ (1761250573 % 1089653714);
        int i13 = (((((~386839851) & 502322088) | 1879579687) + ((386839851 & 1341449096) | 1376723987)) - (-1804183292)) ^ (2118801173 % 1119399015);
        int i14 = (((((~627992393) & 399075139) | 1263590114) + ((627992393 & 1418280193) | 1644468862)) - (-1502362592)) ^ (1449228398 % 989241888);
        int i15 = (((((~1687776787) & 1627592001) | 771768986) + ((1687776787 & 1226806633) | 136094264)) - 1910482017) ^ (992028067 % 180785147);
        int i16 = (((((~1111088131) & 1881672142) | 1222111317) + ((1111088131 & 807995786) | 38123124)) - 1508183881) ^ (1348361729 % 788380902);
        zzu = new zzavj((((((~636453333) & 363983206) | 1075208291) + ((636453333 & 2146013964) | 1783382730)) - (-1139191409)) ^ (1564003050 % 99885196));
        zzt = new zzavj((((((~338346092) & 646267944) | 2030210865) + ((338346092 & 109431182) | 1768591350)) - (-956795148)) ^ (1912163036 % 671068506));
        zzs = new zzavj((((((~1374600938) & 269492393) | 962980710) + ((1374600938 & (-2079309685)) | (-1096234186))) - (-724963331)) ^ (1587992726 % 995234140));
        zzr = new zzavj(i16);
        zzq = new zzavj(i13);
        zzp = new zzavj(i14);
        zzavj zzavjVar = new zzavj(i15);
        int i17 = (((((~406011017) & 1269108768) | 73167649) + ((406011017 & 2074166272) | 872470299)) - 1878158194) ^ (1615935710 % 639806732);
        int i18 = (((((~257675105) & 286888065) | 1680106172) + ((257675105 & 353998857) | 216033710)) - (-2120570644)) ^ (2033505236 % 29777560);
        int i19 = (((((~2137100237) & 243279585) | 1476690352) + ((2137100237 & 1182836297) | 1215531406)) - (-1785612177)) ^ (1251300606 % 959372260);
        int i20 = (((((~1280321648) & 1509448282) | 1074834725) + ((1280321648 & 434689663) | 67544101)) - 1396684682) ^ (1309383303 % 1129033333);
        int i21 = (((((~1635905385) & 436500164) | 1627617040) + ((1635905385 & 1527677388) | 1092341018)) - (-1251599253)) ^ (1253207672 % 570073850);
        int i22 = (((((~2058657199) & 1077280871) | 426331554) + ((2058657199 & 1242960213) | 260153146)) - 1453981149) ^ (711845894 % 404158660);
        int i23 = (((((~2077486715) & 1348527492) | 196553360) + ((2077486715 & 1547749134) | 218380923)) - 1621461405) ^ (1713258270 % 1573363368);
        int i24 = (((((~1194953865) & 541827704) | 1410336387) + ((1194953865 & 676044922) | 221517442)) - 2090845028) ^ (485560280 % 402724286);
        int i25 = (((((~1424268980) & 433259076) | 136627722) + ((1424268980 & 299303110) | 33824130)) - 448747429) ^ (1129566413 % 184803526);
        zzo = zzavjVar;
        zzn = new zzavj(i12);
        zzm = new zzavj(i17);
        zzl = new zzavj(i18);
        zzk = new zzavj(i19);
        zzj = new zzavj(i11);
        zzi = new zzavj(i20);
        zzh = new zzavj(i21);
        zzg = new zzavj(i22);
        zzf = new zzavj(i10);
        zze = new zzavj(i23);
        zzd = new zzavj(i24);
        zzc = new zzavj(i25);
        zzb = new zzavj(1);
        zza = new zzavj(0);
    }

    private /* synthetic */ zzavj(int i10) {
        this.zzv = i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:97:0x01e2 A[Catch: zzawc -> 0x0061, zzavz | zzawb -> 0x00f2, ClassNotFoundException -> 0x01f2, zzawj -> 0x01f6, TryCatch #5 {zzawc -> 0x0061, blocks: (B:5:0x0036, B:9:0x0052, B:11:0x005a, B:16:0x0068, B:18:0x0071, B:32:0x00e3, B:19:0x007a, B:20:0x007f, B:21:0x0080, B:24:0x00a8, B:25:0x00ad, B:29:0x00b6, B:31:0x00be, B:35:0x00eb, B:36:0x00f0, B:37:0x00f1, B:42:0x0101, B:43:0x0111, B:45:0x0117, B:47:0x0125, B:49:0x012c, B:50:0x0133, B:53:0x014c, B:60:0x016b, B:65:0x0189, B:98:0x01e6, B:69:0x0194, B:73:0x019f, B:80:0x01b3, B:84:0x01be, B:88:0x01c9, B:92:0x01d4, B:96:0x01df, B:97:0x01e2, B:104:0x01fe, B:108:0x0215, B:113:0x0238, B:120:0x0266, B:125:0x0287, B:134:0x02af, B:136:0x02c5, B:137:0x02c7, B:139:0x02cc, B:143:0x02dd, B:145:0x02f5, B:146:0x02f8, B:165:0x041a, B:191:0x04c6, B:193:0x04ce, B:197:0x04d8, B:198:0x04de, B:199:0x04e2, B:200:0x04e9, B:213:0x052f, B:217:0x0552, B:221:0x059e, B:225:0x05bb, B:238:0x0606, B:242:0x062c, B:246:0x064f), top: B:251:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzauw zzauwVar;
        long j10;
        zzawd zzawdVar;
        zzawm zzawmVarZza;
        zzauw zzauwVar2;
        int i10 = this.zzv;
        long j11 = 1;
        Class<?> cls = Void.TYPE;
        long j12 = 0;
        int i11 = 0;
        try {
            try {
                try {
                    try {
                        switch (i10) {
                            case 0:
                                zzawd zzawdVar2 = ((zzawh) obj).zzb;
                                zzawdVar2.zzb(zzawm.zzb(zzawdVar2.zzc().zzm() + zzawdVar2.zzc().zzm()));
                                return Optional.empty();
                            case 1:
                                zzawd zzawdVar3 = ((zzawh) obj).zzb;
                                zzawdVar3.zzb(zzawm.zzc(zzawdVar3.zzc().zzq() + zzawdVar3.zzc().zzq()));
                                return Optional.empty();
                            case 2:
                                zzawd zzawdVar4 = ((zzawh) obj).zzb;
                                zzawdVar4.zzb(zzawm.zzd(zzawdVar4.zzc().zzn().zzd(zzawdVar4.zzc().zzn())));
                                return Optional.empty();
                            case 3:
                                zzawh zzawhVar = (zzawh) obj;
                                try {
                                    long jZze = zzawhVar.zzd.zze();
                                    for (long j13 = 0; j13 < jZze; j13++) {
                                        zzawhVar.zzb.zzb(zzawm.zza(null));
                                    }
                                    return Optional.empty();
                                } catch (zzawc unused) {
                                    zzauwVar = zzauw.zza;
                                    return Optional.of(zzauwVar);
                                }
                            case 4:
                                zzawd zzawdVar5 = ((zzawh) obj).zzb;
                                zzawdVar5.zzb(zzawm.zzb(zzawdVar5.zzc().zzm() & zzawdVar5.zzc().zzm()));
                                return Optional.empty();
                            case 5:
                                long[] jArr = {916768482, 1259538933, 805446160, -15648283, -1266372608, 883303887, 6538657, 384868448, 102194872};
                                long j14 = jArr[0];
                                long j15 = jArr[1];
                                long j16 = jArr[2];
                                long j17 = jArr[3];
                                long j18 = jArr[4];
                                long j19 = jArr[5];
                                long j20 = jArr[6];
                                long j21 = jArr[7];
                                long j22 = j20 + (((((~j14) & j15) | j16) + (j18 | (j14 & j17))) - j19);
                                long j23 = j21 % 102194872;
                                zzawd zzawdVar6 = ((zzawh) obj).zzb;
                                zzawdVar6.zzb(zzawm.zzb(zzawdVar6.zzc().zzm() ^ (j22 ^ j23)));
                                return Optional.empty();
                            case 6:
                                zzawd zzawdVar7 = ((zzawh) obj).zzb;
                                zzawdVar7.zzb(zzawm.zzb(zzawdVar7.zzc().zzm() | zzawdVar7.zzc().zzm()));
                                return Optional.empty();
                            case 7:
                                zzawd zzawdVar8 = ((zzawh) obj).zzb;
                                zzawdVar8.zzb(zzawm.zzb(zzawdVar8.zzc().zzm() ^ zzawdVar8.zzc().zzm()));
                                return Optional.empty();
                            case 8:
                                zzawh zzawhVar2 = (zzawh) obj;
                                try {
                                    zzawd zzawdVar9 = zzawhVar2.zzb;
                                    long jZzm = zzawdVar9.zzc().zzm();
                                    zzawa zzawaVar = zzawhVar2.zzc;
                                    zzavv zzavvVar = zzawhVar2.zzd;
                                    zzawaVar.zza(zzavvVar.zzb(), 0L, zzawdVar9.zzb);
                                    zzavvVar.zza(jZzm);
                                    return Optional.empty();
                                } catch (zzavt | zzavu unused2) {
                                    zzauwVar = zzauw.zzr;
                                    return Optional.of(zzauwVar);
                                } catch (zzavy unused3) {
                                    zzauwVar = zzauw.zzB;
                                    return Optional.of(zzauwVar);
                                }
                            case 9:
                                zzawh zzawhVar3 = (zzawh) obj;
                                try {
                                    zzawd zzawdVar10 = zzawhVar3.zzb;
                                    long jZzm2 = zzawdVar10.zzc().zzm();
                                    List listZzo = zzawdVar10.zzc().zzo();
                                    int size = listZzo.size();
                                    Object objZzh = zzawdVar10.zzc().zzh();
                                    Object objZzl = zzawdVar10.zzc().zzl();
                                    if (objZzl instanceof Method) {
                                        Method method = (Method) objZzl;
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        if (parameterTypes.length == size) {
                                            Object[] objArr = new Object[size];
                                            if (objZzh instanceof Constructor) {
                                                Class<?>[] parameterTypes2 = ((Constructor) objZzh).getParameterTypes();
                                                int length = parameterTypes2.length;
                                                Object[] objArr2 = new Object[length];
                                                List listZzo2 = ((zzawm) listZzo.get(0)).zzo();
                                                if (listZzo2.size() == length) {
                                                    int i12 = 0;
                                                    while (i12 < listZzo2.size()) {
                                                        objArr2[i12] = ((zzawm) listZzo2.get(i12)).zzi(parameterTypes2[i12]);
                                                        i12++;
                                                        j12 = j12;
                                                    }
                                                    j10 = j12;
                                                    objArr[0] = objArr2;
                                                }
                                            } else {
                                                j10 = 0;
                                                while (i11 < size) {
                                                    objArr[i11] = ((zzawm) listZzo.get(i11)).zzi(parameterTypes[i11]);
                                                    i11++;
                                                }
                                            }
                                            try {
                                                Object objInvoke = method.invoke(objZzh, objArr);
                                                if (method.getReturnType() == Void.class || method.getReturnType() == cls) {
                                                    zzawdVar = zzawhVar3.zzb;
                                                    zzawmVarZza = zzawm.zza(0);
                                                } else if (jZzm2 != j10) {
                                                    zzawdVar = zzawhVar3.zzb;
                                                    zzawmVarZza = zzawm.zzg(objInvoke);
                                                } else {
                                                    zzawdVar = zzawhVar3.zzb;
                                                    zzawmVarZza = zzawm.zza(objInvoke);
                                                }
                                                zzawdVar.zzb(zzawmVarZza);
                                                return Optional.empty();
                                            } catch (Throwable unused4) {
                                                zzauwVar = zzauw.zzq;
                                                return Optional.of(zzauwVar);
                                            }
                                        }
                                    }
                                    return Optional.of(zzauw.zzp);
                                } catch (zzawj unused5) {
                                    zzauwVar = zzauw.zzp;
                                }
                                break;
                            case 10:
                                int i13 = ((((~2084546560) & 73475461) | 438076064) + ((2084546560 & 611428101) | 2023412224)) - (-1830321789);
                                int i14 = 1073781763 % 1003463633;
                                int i15 = ((((~461273879) & 107429921) | 378966045) + ((461273879 & 283197472) | 1937909388)) - 2133058944;
                                int i16 = 1917305981 % 575705360;
                                zzawh zzawhVar4 = (zzawh) obj;
                                zzawd zzawdVar11 = zzawhVar4.zzb;
                                int intExact = Math.toIntExact(zzawdVar11.zzc().zzm());
                                zzavq zzavqVarZzn = zzawdVar11.zzc().zzn();
                                zzavq zzavqVarZzn2 = zzawdVar11.zzc().zzn();
                                if (zzavqVarZzn.zza.length != (i13 ^ i14)) {
                                    return Optional.of(zzauw.zzH);
                                }
                                int[] iArr = new int[i15 ^ i16];
                                ByteBuffer.wrap(zzavqVarZzn.zza()).asIntBuffer().get(iArr);
                                zzavi zzaviVar = new zzavi(intExact, iArr);
                                int i17 = ((((~1183912267) & 781500673) | 1683555012) + ((1183912267 & 180666625) | 541077750)) - (-1949988574);
                                int i18 = 1527793660 % 245277883;
                                int i19 = ((((~95266356) & 568641509) | 183483904) + ((95266356 & 553669093) | 504469010)) - 874379764;
                                int i20 = 2026478004 % 1659239833;
                                byte[] bArrZza = zzavqVarZzn2.zza();
                                int i21 = (((((~1787189168) & 1360184381) | 611517270) + ((1787189168 & 1426637867) | 612056018)) - 1771476931) ^ (1821115873 % 1010014811);
                                byte[] bArr = new byte[i21];
                                int i22 = 0;
                                while (i22 < bArrZza.length) {
                                    if (i22 % i21 == 0) {
                                        zzaviVar.zza(i22 >>> (i17 ^ i18), bArr);
                                    } else if (i22 == 0) {
                                        i22 = 0;
                                        zzaviVar.zza(i22 >>> (i17 ^ i18), bArr);
                                    }
                                    int i23 = i19 ^ i20;
                                    bArrZza[i22] = (byte) (((bArrZza[i22] ^ bArr[i22 % i21]) << i23) >> i23);
                                    i22++;
                                }
                                zzawhVar4.zzb.zzb(zzawm.zzd(zzavq.zze(bArrZza)));
                                return Optional.empty();
                            case 11:
                                zzawd zzawdVar12 = ((zzawh) obj).zzb;
                                double dZzq = zzawdVar12.zzc().zzq();
                                double dZzq2 = zzawdVar12.zzc().zzq();
                                if (dZzq == 0.0d) {
                                    zzauwVar2 = zzauw.zzF;
                                    return Optional.of(zzauwVar2);
                                }
                                zzawdVar12.zzb(zzawm.zzc(dZzq2 / dZzq));
                                return Optional.empty();
                            case 12:
                                zzawd zzawdVar13 = ((zzawh) obj).zzb;
                                long jZzm3 = zzawdVar13.zzc().zzm();
                                long jZzm4 = zzawdVar13.zzc().zzm();
                                if (jZzm3 == 0) {
                                    zzauwVar2 = zzauw.zzF;
                                    return Optional.of(zzauwVar2);
                                }
                                zzawdVar13.zzb(zzawm.zzb(jZzm4 / jZzm3));
                                return Optional.empty();
                            case 13:
                                try {
                                    ((zzawh) obj).zzb.zzc();
                                    return Optional.empty();
                                } catch (zzawb unused6) {
                                    zzauwVar = zzauw.zzA;
                                    return Optional.of(zzauwVar);
                                }
                            case 14:
                                zzawh zzawhVar5 = (zzawh) obj;
                                long jZzm5 = zzawhVar5.zzb.zzc().zzm();
                                zzawd zzawdVar14 = zzawhVar5.zzb;
                                zzawdVar14.zzb(zzawm.zzj(zzawdVar14.zzd(jZzm5)));
                                return Optional.empty();
                            case 15:
                                zzawh zzawhVar6 = (zzawh) obj;
                                long jZzm6 = zzawhVar6.zzc.zzb().zzb + zzawhVar6.zzb.zzc().zzm();
                                zzawd zzawdVar15 = zzawhVar6.zzb;
                                zzawdVar15.zzb(zzawm.zzj(zzawdVar15.zzd(-jZzm6)));
                                return Optional.empty();
                            case 16:
                                zzawh zzawhVar7 = (zzawh) obj;
                                long jZze2 = zzawhVar7.zzc.zzb().zzb + zzawhVar7.zzd.zze();
                                zzawd zzawdVar16 = zzawhVar7.zzb;
                                zzawdVar16.zzb(zzawm.zzj(zzawdVar16.zzd(-jZze2)));
                                return Optional.empty();
                            case 17:
                                try {
                                    zzawd zzawdVar17 = ((zzawh) obj).zzb;
                                    if (new zzawi(true).compare(zzawdVar17.zzc(), zzawdVar17.zzc()) != 0) {
                                        j11 = 0;
                                    }
                                    zzawdVar17.zzb(zzawm.zzb(j11));
                                    return Optional.empty();
                                } catch (IllegalArgumentException unused7) {
                                    zzauwVar = zzauw.zzd;
                                    return Optional.of(zzauwVar);
                                }
                            case 18:
                                try {
                                    zzawd zzawdVar18 = ((zzawh) obj).zzb;
                                    String strZzc = zzawdVar18.zzc().zzn().zzc();
                                    switch (strZzc.hashCode()) {
                                        case -1325958191:
                                            if (strZzc.equals("double")) {
                                                cls = Double.TYPE;
                                            } else {
                                                cls = Class.forName(strZzc);
                                            }
                                            break;
                                        case 104431:
                                            if (strZzc.equals("int")) {
                                                cls = Integer.TYPE;
                                            } else {
                                                cls = Class.forName(strZzc);
                                            }
                                            break;
                                        case 3039496:
                                            if (strZzc.equals("byte")) {
                                                cls = Byte.TYPE;
                                            } else {
                                                cls = Class.forName(strZzc);
                                            }
                                            break;
                                        case 3052374:
                                            if (strZzc.equals("char")) {
                                                cls = Character.TYPE;
                                            } else {
                                                cls = Class.forName(strZzc);
                                            }
                                            break;
                                        case 3327612:
                                            if (strZzc.equals("long")) {
                                                cls = Long.TYPE;
                                            } else {
                                                cls = Class.forName(strZzc);
                                            }
                                            break;
                                        case 3625364:
                                            if (!strZzc.equals("void")) {
                                                cls = Class.forName(strZzc);
                                            }
                                            break;
                                        case 64711720:
                                            if (strZzc.equals("boolean")) {
                                                cls = Boolean.TYPE;
                                            } else {
                                                cls = Class.forName(strZzc);
                                            }
                                            break;
                                        case 97526364:
                                            if (strZzc.equals("float")) {
                                                cls = Float.TYPE;
                                            } else {
                                                cls = Class.forName(strZzc);
                                            }
                                            break;
                                        case 109413500:
                                            if (strZzc.equals("short")) {
                                                cls = Short.TYPE;
                                            } else {
                                                cls = Class.forName(strZzc);
                                            }
                                            break;
                                        default:
                                            cls = Class.forName(strZzc);
                                            break;
                                    }
                                    zzawdVar18.zzb(zzawm.zza(cls));
                                    return Optional.empty();
                                } catch (zzawj unused8) {
                                    zzauwVar = zzauw.zzl;
                                    return Optional.of(zzauwVar);
                                } catch (ClassNotFoundException unused9) {
                                    zzauwVar = zzauw.zzm;
                                    return Optional.of(zzauwVar);
                                }
                            case 19:
                                try {
                                    zzawd zzawdVar19 = ((zzawh) obj).zzb;
                                    List listZzo3 = zzawdVar19.zzc().zzo();
                                    Class<?>[] clsArr = new Class[listZzo3.size()];
                                    while (i11 < listZzo3.size()) {
                                        Object objZzl2 = ((zzawm) listZzo3.get(i11)).zzl();
                                        if (!(objZzl2 instanceof Class)) {
                                            return Optional.of(zzauw.zzn);
                                        }
                                        clsArr[i11] = (Class) objZzl2;
                                        i11++;
                                    }
                                    String strZzc2 = zzawdVar19.zzc().zzn().zzc();
                                    Object objZzl3 = zzawdVar19.zzc().zzl();
                                    if (!(objZzl3 instanceof Class)) {
                                        return Optional.of(zzauw.zzn);
                                    }
                                    zzawdVar19.zzb(zzawm.zza(((Class) objZzl3).getMethod(strZzc2, clsArr)));
                                    return Optional.empty();
                                } catch (zzawj unused10) {
                                    zzauwVar = zzauw.zzn;
                                    return Optional.of(zzauwVar);
                                } catch (NoSuchMethodException unused11) {
                                    zzauwVar = zzauw.zzo;
                                    return Optional.of(zzauwVar);
                                } catch (SecurityException unused12) {
                                    zzauwVar = zzauw.zzC;
                                    return Optional.of(zzauwVar);
                                }
                            default:
                                int i24 = ((((~306851320) & 2040670728) | 1372152390) + ((306851320 & (-1473639347)) | (-2036492681))) - 244167092;
                                int i25 = 1764892438 % 764851988;
                                zzawd zzawdVar20 = ((zzawh) obj).zzb;
                                long jZzm7 = zzawdVar20.zzc().zzm();
                                zzawm zzawmVarZzc = zzawdVar20.zzc();
                                zzawm zzawmVarZzc2 = zzawdVar20.zzc();
                                int i26 = zzawmVarZzc2.zza;
                                int i27 = (i24 ^ i25) + i26;
                                if (i26 == 0) {
                                    throw null;
                                }
                                if (i27 == 3) {
                                    zzavq zzavqVarZzn3 = zzawmVarZzc2.zzn();
                                    int i28 = ((((~284327308) & 44384696) | 1708231444) + ((284327308 & 1647591593) | 1951966997)) - (-1088446899);
                                    int i29 = 2085308422 % 531900034;
                                    if (jZzm7 < 0) {
                                        jZzm7 += (long) zzavqVarZzn3.zza.length;
                                    }
                                    if (zzawmVarZzc.zza != (i28 ^ i29)) {
                                        throw new zzawj();
                                    }
                                    if (jZzm7 >= 0 && jZzm7 < zzavqVarZzn3.zza.length) {
                                        char cCharAt = zzavqVarZzn3.zzc().charAt((int) jZzm7);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt).length());
                                        sb2.append(cCharAt);
                                        zzawmVarZzc = zzawm.zzd(zzavq.zzf(sb2.toString()));
                                    }
                                } else {
                                    if (i27 != 4) {
                                        throw new zzawj();
                                    }
                                    List listZzo4 = zzawmVarZzc2.zzo();
                                    if (jZzm7 < 0) {
                                        jZzm7 += (long) listZzo4.size();
                                    }
                                    if (jZzm7 >= 0 && jZzm7 < listZzo4.size()) {
                                        zzawmVarZzc = (zzawm) listZzo4.get((int) jZzm7);
                                    }
                                }
                                zzawdVar20.zzb(zzawmVarZzc);
                                return Optional.empty();
                        }
                    } catch (zzavs | zzavu | zzawj unused13) {
                        zzauwVar = zzauw.zzy;
                    }
                } catch (zzawc e10) {
                    throw new AssertionError(zzavo.zza("CEiv6BFfPnitUE+D"), e10);
                }
            } catch (zzawb unused14) {
                zzauwVar = zzauw.zzf;
            }
        } catch (zzavz | zzawb unused15) {
            zzauwVar = zzauw.zzx;
        }
    }
}
