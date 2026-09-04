package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.googlecode.mp4parser.boxes.microsoft.lIu.trPLwhKZgZ;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhdp implements zzhed {
    private static final Charset zza = Charset.forName(C.UTF8_NAME);
    private final InputStream zzb;

    private zzhdp(InputStream inputStream) {
        this.zzb = inputStream;
    }

    public static zzhdp zza(String str) {
        return new zzhdp(new ByteArrayInputStream(str.getBytes(zza)));
    }

    private static int zzc(zzibg zzibgVar) throws IOException {
        if (!(zzibgVar instanceof zzibk)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!zzibgVar.zzg().zzc()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long jZzc = zzhlm.zzc(zzibgVar.zzg().zzh());
            if (jZzc > 4294967295L || jZzc < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) jZzc;
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x01e5 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x01dd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0114 A[Catch: all -> 0x0033, IllegalStateException -> 0x0036, zzibj -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:3:0x0014, B:4:0x0023, B:6:0x002d, B:13:0x003c, B:15:0x0053, B:17:0x005b, B:19:0x0065, B:21:0x006f, B:23:0x007b, B:25:0x0081, B:27:0x008f, B:29:0x0095, B:31:0x009b, B:33:0x00a1, B:35:0x00a9, B:51:0x00eb, B:56:0x0114, B:69:0x0137, B:71:0x0144, B:73:0x014a, B:75:0x0150, B:80:0x0191, B:93:0x01b5, B:84:0x019d, B:88:0x01a8, B:92:0x01b3, B:94:0x01d3, B:95:0x01dc, B:96:0x01dd, B:97:0x01e4, B:60:0x011f, B:64:0x012a, B:68:0x0135, B:98:0x01e5, B:99:0x01ee, B:100:0x01ef, B:101:0x01f8, B:102:0x01f9, B:103:0x0200, B:104:0x0201, B:105:0x0208, B:106:0x0209, B:109:0x0215, B:110:0x021c, B:111:0x021d, B:112:0x0224, B:113:0x0225, B:114:0x022c, B:115:0x022d, B:116:0x0232), top: B:119:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0117  */
    /* JADX WARN: Code duplicated, block: B:60:0x011f A[Catch: all -> 0x0033, IllegalStateException -> 0x0036, zzibj -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:3:0x0014, B:4:0x0023, B:6:0x002d, B:13:0x003c, B:15:0x0053, B:17:0x005b, B:19:0x0065, B:21:0x006f, B:23:0x007b, B:25:0x0081, B:27:0x008f, B:29:0x0095, B:31:0x009b, B:33:0x00a1, B:35:0x00a9, B:51:0x00eb, B:56:0x0114, B:69:0x0137, B:71:0x0144, B:73:0x014a, B:75:0x0150, B:80:0x0191, B:93:0x01b5, B:84:0x019d, B:88:0x01a8, B:92:0x01b3, B:94:0x01d3, B:95:0x01dc, B:96:0x01dd, B:97:0x01e4, B:60:0x011f, B:64:0x012a, B:68:0x0135, B:98:0x01e5, B:99:0x01ee, B:100:0x01ef, B:101:0x01f8, B:102:0x01f9, B:103:0x0200, B:104:0x0201, B:105:0x0208, B:106:0x0209, B:109:0x0215, B:110:0x021c, B:111:0x021d, B:112:0x0224, B:113:0x0225, B:114:0x022c, B:115:0x022d, B:116:0x0232), top: B:119:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0122  */
    /* JADX WARN: Code duplicated, block: B:64:0x012a A[Catch: all -> 0x0033, IllegalStateException -> 0x0036, zzibj -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:3:0x0014, B:4:0x0023, B:6:0x002d, B:13:0x003c, B:15:0x0053, B:17:0x005b, B:19:0x0065, B:21:0x006f, B:23:0x007b, B:25:0x0081, B:27:0x008f, B:29:0x0095, B:31:0x009b, B:33:0x00a1, B:35:0x00a9, B:51:0x00eb, B:56:0x0114, B:69:0x0137, B:71:0x0144, B:73:0x014a, B:75:0x0150, B:80:0x0191, B:93:0x01b5, B:84:0x019d, B:88:0x01a8, B:92:0x01b3, B:94:0x01d3, B:95:0x01dc, B:96:0x01dd, B:97:0x01e4, B:60:0x011f, B:64:0x012a, B:68:0x0135, B:98:0x01e5, B:99:0x01ee, B:100:0x01ef, B:101:0x01f8, B:102:0x01f9, B:103:0x0200, B:104:0x0201, B:105:0x0208, B:106:0x0209, B:109:0x0215, B:110:0x021c, B:111:0x021d, B:112:0x0224, B:113:0x0225, B:114:0x022c, B:115:0x022d, B:116:0x0232), top: B:119:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x012d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0135 A[Catch: all -> 0x0033, IllegalStateException -> 0x0036, zzibj -> 0x0039, TRY_ENTER, TryCatch #0 {all -> 0x0033, blocks: (B:3:0x0014, B:4:0x0023, B:6:0x002d, B:13:0x003c, B:15:0x0053, B:17:0x005b, B:19:0x0065, B:21:0x006f, B:23:0x007b, B:25:0x0081, B:27:0x008f, B:29:0x0095, B:31:0x009b, B:33:0x00a1, B:35:0x00a9, B:51:0x00eb, B:56:0x0114, B:69:0x0137, B:71:0x0144, B:73:0x014a, B:75:0x0150, B:80:0x0191, B:93:0x01b5, B:84:0x019d, B:88:0x01a8, B:92:0x01b3, B:94:0x01d3, B:95:0x01dc, B:96:0x01dd, B:97:0x01e4, B:60:0x011f, B:64:0x012a, B:68:0x0135, B:98:0x01e5, B:99:0x01ee, B:100:0x01ef, B:101:0x01f8, B:102:0x01f9, B:103:0x0200, B:104:0x0201, B:105:0x0208, B:106:0x0209, B:109:0x0215, B:110:0x021c, B:111:0x021d, B:112:0x0224, B:113:0x0225, B:114:0x022c, B:115:0x022d, B:116:0x0232), top: B:119:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0144 A[Catch: all -> 0x0033, IllegalStateException -> 0x0036, zzibj -> 0x0039, TryCatch #0 {all -> 0x0033, blocks: (B:3:0x0014, B:4:0x0023, B:6:0x002d, B:13:0x003c, B:15:0x0053, B:17:0x005b, B:19:0x0065, B:21:0x006f, B:23:0x007b, B:25:0x0081, B:27:0x008f, B:29:0x0095, B:31:0x009b, B:33:0x00a1, B:35:0x00a9, B:51:0x00eb, B:56:0x0114, B:69:0x0137, B:71:0x0144, B:73:0x014a, B:75:0x0150, B:80:0x0191, B:93:0x01b5, B:84:0x019d, B:88:0x01a8, B:92:0x01b3, B:94:0x01d3, B:95:0x01dc, B:96:0x01dd, B:97:0x01e4, B:60:0x011f, B:64:0x012a, B:68:0x0135, B:98:0x01e5, B:99:0x01ee, B:100:0x01ef, B:101:0x01f8, B:102:0x01f9, B:103:0x0200, B:104:0x0201, B:105:0x0208, B:106:0x0209, B:109:0x0215, B:110:0x021c, B:111:0x021d, B:112:0x0224, B:113:0x0225, B:114:0x022c, B:115:0x022d, B:116:0x0232), top: B:119:0x0014 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzhed
    public final zzhsz zzb() throws IOException {
        int i10;
        String strZzd;
        zzhtm zzhtmVar;
        zzibi zzibiVarZze;
        zzhsp zzhspVar;
        String str = NotificationCompat.CATEGORY_STATUS;
        String str2 = "keyData";
        try {
            try {
                InputStream inputStream = this.zzb;
                int i11 = zzheo.zza;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                while (true) {
                    int i12 = inputStream.read(bArr);
                    InputStream inputStream2 = inputStream;
                    if (i12 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i12);
                    inputStream = inputStream2;
                }
                zzibi zzibiVarZze2 = zzhlm.zzb(new String(byteArrayOutputStream.toByteArray(), zza)).zze();
                if (!zzibiVarZze2.zzc("key")) {
                    throw new zzibj("invalid keyset: no key");
                }
                zzibg zzibgVarZzh = zzibiVarZze2.zzh("key");
                if (!(zzibgVarZzh instanceof zzibf)) {
                    throw new zzibj("invalid keyset: key must be an array");
                }
                zzibf zzibfVarZzf = zzibgVarZzh.zzf();
                if (zzibfVarZzf.zzb() == 0) {
                    throw new zzibj("invalid keyset: key is empty");
                }
                zzhsw zzhswVarZzh = zzhsz.zzh();
                if (zzibiVarZze2.zzc("primaryKeyId")) {
                    zzhswVarZzh.zza(zzc(zzibiVarZze2.zzh("primaryKeyId")));
                }
                int i13 = 0;
                while (i13 < zzibfVarZzf.zzb()) {
                    zzibi zzibiVarZze3 = zzibfVarZzf.zzc(i13).zze();
                    if (!zzibiVarZze3.zzc(str2) || !zzibiVarZze3.zzc(str) || !zzibiVarZze3.zzc("keyId") || !zzibiVarZze3.zzc("outputPrefixType")) {
                        throw new zzibj("invalid key");
                    }
                    zzibg zzibgVarZzh2 = zzibiVarZze3.zzh(str2);
                    if (!(zzibgVarZzh2 instanceof zzibi)) {
                        throw new zzibj("invalid key: keyData must be an object");
                    }
                    zzhsx zzhsxVarZze = zzhsy.zze();
                    String strZzd2 = zzibiVarZze3.zzh(str).zzd();
                    String str3 = str;
                    int iHashCode = strZzd2.hashCode();
                    String str4 = str2;
                    if (iHashCode == -891611359) {
                        if (!strZzd2.equals("ENABLED")) {
                            throw new zzibj("unknown status: ".concat(strZzd2));
                        }
                        i10 = 3;
                        zzhsxVarZze.zze(i10);
                        zzhsxVarZze.zzc(zzc(zzibiVarZze3.zzh("keyId")));
                        strZzd = zzibiVarZze3.zzh("outputPrefixType").zzd();
                        switch (strZzd.hashCode()) {
                            case -2053249079:
                                if (strZzd.equals("LEGACY")) {
                                    zzhtmVar = zzhtm.LEGACY;
                                    zzhsxVarZze.zzd(zzhtmVar);
                                    zzibiVarZze = zzibgVarZzh2.zze();
                                    if (zzibiVarZze.zzc("typeUrl")) {
                                    }
                                    throw new zzibj("invalid keyData");
                                }
                                break;
                            case 80904:
                                if (strZzd.equals("RAW")) {
                                    zzhtmVar = zzhtm.RAW;
                                    zzhsxVarZze.zzd(zzhtmVar);
                                    zzibiVarZze = zzibgVarZzh2.zze();
                                    if (zzibiVarZze.zzc("typeUrl")) {
                                    }
                                    throw new zzibj("invalid keyData");
                                }
                                break;
                            case 2575090:
                                if (strZzd.equals("TINK")) {
                                    zzhtmVar = zzhtm.TINK;
                                    zzhsxVarZze.zzd(zzhtmVar);
                                    zzibiVarZze = zzibgVarZzh2.zze();
                                    if (zzibiVarZze.zzc("typeUrl")) {
                                    }
                                    throw new zzibj("invalid keyData");
                                }
                                break;
                            case 1761684556:
                                if (strZzd.equals("CRUNCHY")) {
                                    zzhtmVar = zzhtm.CRUNCHY;
                                    zzhsxVarZze.zzd(zzhtmVar);
                                    zzibiVarZze = zzibgVarZzh2.zze();
                                    if (zzibiVarZze.zzc("typeUrl")) {
                                    }
                                    throw new zzibj("invalid keyData");
                                }
                                break;
                        }
                        throw new zzibj("unknown output prefix type: ".concat(strZzd));
                    }
                    if (iHashCode == 478389753) {
                        if (!strZzd2.equals("DESTROYED")) {
                            throw new zzibj("unknown status: ".concat(strZzd2));
                        }
                        i10 = 5;
                        zzhsxVarZze.zze(i10);
                        zzhsxVarZze.zzc(zzc(zzibiVarZze3.zzh("keyId")));
                        strZzd = zzibiVarZze3.zzh("outputPrefixType").zzd();
                        switch (strZzd.hashCode()) {
                            case -2053249079:
                                if (strZzd.equals("LEGACY")) {
                                    zzhtmVar = zzhtm.LEGACY;
                                    zzhsxVarZze.zzd(zzhtmVar);
                                    zzibiVarZze = zzibgVarZzh2.zze();
                                    if (zzibiVarZze.zzc("typeUrl")) {
                                    }
                                    throw new zzibj("invalid keyData");
                                }
                                break;
                            case 80904:
                                if (strZzd.equals("RAW")) {
                                    zzhtmVar = zzhtm.RAW;
                                    zzhsxVarZze.zzd(zzhtmVar);
                                    zzibiVarZze = zzibgVarZzh2.zze();
                                    if (zzibiVarZze.zzc("typeUrl")) {
                                    }
                                    throw new zzibj("invalid keyData");
                                }
                                break;
                            case 2575090:
                                if (strZzd.equals("TINK")) {
                                    zzhtmVar = zzhtm.TINK;
                                    zzhsxVarZze.zzd(zzhtmVar);
                                    zzibiVarZze = zzibgVarZzh2.zze();
                                    if (zzibiVarZze.zzc("typeUrl")) {
                                    }
                                    throw new zzibj("invalid keyData");
                                }
                                break;
                            case 1761684556:
                                if (strZzd.equals("CRUNCHY")) {
                                    zzhtmVar = zzhtm.CRUNCHY;
                                    zzhsxVarZze.zzd(zzhtmVar);
                                    zzibiVarZze = zzibgVarZzh2.zze();
                                    if (zzibiVarZze.zzc("typeUrl")) {
                                    }
                                    throw new zzibj("invalid keyData");
                                }
                                break;
                        }
                        throw new zzibj("unknown output prefix type: ".concat(strZzd));
                    }
                    if (iHashCode != 1053567612 || !strZzd2.equals("DISABLED")) {
                        throw new zzibj("unknown status: ".concat(strZzd2));
                    }
                    i10 = 4;
                    zzhsxVarZze.zze(i10);
                    zzhsxVarZze.zzc(zzc(zzibiVarZze3.zzh("keyId")));
                    strZzd = zzibiVarZze3.zzh("outputPrefixType").zzd();
                    switch (strZzd.hashCode()) {
                        case -2053249079:
                            if (strZzd.equals("LEGACY")) {
                                zzhtmVar = zzhtm.LEGACY;
                                zzhsxVarZze.zzd(zzhtmVar);
                                zzibiVarZze = zzibgVarZzh2.zze();
                                if (zzibiVarZze.zzc("typeUrl") || !zzibiVarZze.zzc(AppMeasurementSdk.ConditionalUserProperty.VALUE) || !zzibiVarZze.zzc("keyMaterialType")) {
                                    throw new zzibj("invalid keyData");
                                }
                                byte[] bArrZza = zzhzk.zza(zzibiVarZze.zzh(AppMeasurementSdk.ConditionalUserProperty.VALUE).zzd(), 2);
                                zzhso zzhsoVarZzd = zzhsq.zzd();
                                zzhsoVarZzd.zza(zzibiVarZze.zzh("typeUrl").zzd());
                                zzida zzidaVar = zzida.zza;
                                zzhsoVarZzd.zzb(zzida.zzt(bArrZza, 0, bArrZza.length));
                                String strZzd3 = zzibiVarZze.zzh("keyMaterialType").zzd();
                                switch (strZzd3.hashCode()) {
                                    case -1881281466:
                                        if (!strZzd3.equals("REMOTE")) {
                                            throw new zzibj("unknown key material type: ".concat(strZzd3));
                                        }
                                        zzhspVar = zzhsp.REMOTE;
                                        break;
                                        break;
                                    case -1609477353:
                                        if (!strZzd3.equals("SYMMETRIC")) {
                                            throw new zzibj("unknown key material type: ".concat(strZzd3));
                                        }
                                        zzhspVar = zzhsp.SYMMETRIC;
                                        break;
                                        break;
                                    case 249237018:
                                        if (!strZzd3.equals(trPLwhKZgZ.XJfDlsDKfRUn)) {
                                            throw new zzibj("unknown key material type: ".concat(strZzd3));
                                        }
                                        zzhspVar = zzhsp.ASYMMETRIC_PRIVATE;
                                        break;
                                        break;
                                    case 1534613202:
                                        if (!strZzd3.equals("ASYMMETRIC_PUBLIC")) {
                                            throw new zzibj("unknown key material type: ".concat(strZzd3));
                                        }
                                        zzhspVar = zzhsp.ASYMMETRIC_PUBLIC;
                                        break;
                                        break;
                                    default:
                                        throw new zzibj("unknown key material type: ".concat(strZzd3));
                                }
                                zzhsoVarZzd.zzc(zzhspVar);
                                zzhsxVarZze.zza((zzhsq) zzhsoVarZzd.zzbu());
                                zzhswVarZzh.zzb((zzhsy) zzhsxVarZze.zzbu());
                                i13++;
                                str = str3;
                                str2 = str4;
                            }
                            break;
                        case 80904:
                            if (strZzd.equals("RAW")) {
                                zzhtmVar = zzhtm.RAW;
                                zzhsxVarZze.zzd(zzhtmVar);
                                zzibiVarZze = zzibgVarZzh2.zze();
                                if (zzibiVarZze.zzc("typeUrl")) {
                                }
                                throw new zzibj("invalid keyData");
                            }
                            break;
                        case 2575090:
                            if (strZzd.equals("TINK")) {
                                zzhtmVar = zzhtm.TINK;
                                zzhsxVarZze.zzd(zzhtmVar);
                                zzibiVarZze = zzibgVarZzh2.zze();
                                if (zzibiVarZze.zzc("typeUrl")) {
                                }
                                throw new zzibj("invalid keyData");
                            }
                            break;
                        case 1761684556:
                            if (strZzd.equals("CRUNCHY")) {
                                zzhtmVar = zzhtm.CRUNCHY;
                                zzhsxVarZze.zzd(zzhtmVar);
                                zzibiVarZze = zzibgVarZzh2.zze();
                                if (zzibiVarZze.zzc("typeUrl")) {
                                }
                                throw new zzibj("invalid keyData");
                            }
                            break;
                    }
                    throw new zzibj("unknown output prefix type: ".concat(strZzd));
                }
                zzhsz zzhszVar = (zzhsz) zzhswVarZzh.zzbu();
                this.zzb.close();
                return zzhszVar;
            } catch (Throwable th2) {
                this.zzb.close();
                throw th2;
            }
        } catch (zzibj e10) {
            e = e10;
            throw new IOException(e);
        } catch (IllegalStateException e11) {
            e = e11;
            throw new IOException(e);
        }
    }
}
