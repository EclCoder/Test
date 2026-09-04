package com.google.android.gms.internal.ads;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaub {
    public static zzasn zza(zzata zzataVar) {
        long j10;
        boolean z10;
        long j11;
        long j12;
        long j13;
        long j14;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzataVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jZzb = str != null ? zzb(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z10 = false;
            j11 = 0;
            j12 = 0;
            while (i10 < strArrSplit.length) {
                String strTrim = strArrSplit[i10].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j12 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j11 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z10 = true;
                }
                i10++;
            }
            j10 = 0;
            i10 = 1;
        } else {
            j10 = 0;
            z10 = false;
            j11 = 0;
            j12 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jZzb2 = str3 != null ? zzb(str3) : j10;
        String str4 = (String) map.get("Last-Modified");
        long jZzb3 = str4 != null ? zzb(str4) : j10;
        String str5 = (String) map.get(Command.HTTP_HEADER_ETAG);
        if (i10 != 0) {
            long j15 = (j12 * 1000) + jCurrentTimeMillis;
            j14 = z10 ? j15 : (j11 * 1000) + j15;
            j13 = j15;
        } else {
            j13 = (jZzb <= j10 || jZzb2 < jZzb) ? j10 : (jZzb2 - jZzb) + jCurrentTimeMillis;
            j14 = j13;
        }
        zzasn zzasnVar = new zzasn();
        zzasnVar.zza = zzataVar.zzb;
        zzasnVar.zzb = str5;
        zzasnVar.zzf = j13;
        zzasnVar.zze = j14;
        zzasnVar.zzc = jZzb;
        zzasnVar.zzd = jZzb3;
        zzasnVar.zzg = map;
        zzasnVar.zzh = zzataVar.zzd;
        return zzasnVar;
    }

    public static long zzb(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e10) {
            if (MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(str) || "-1".equals(str)) {
                zzatq.zza("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzatq.zzd(e10, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    static String zzc(long j10) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j10));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
