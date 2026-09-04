package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.tracker.network.c0;
import com.mbridge.msdk.tracker.network.q;
import f8.Ygx.FuoITeVPeXAj;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class f {
    public static com.mbridge.msdk.tracker.network.b.a a(q qVar) {
        long j10;
        boolean z10;
        long j11;
        long j12;
        long j13;
        long j14;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = qVar.f33824c;
        if (map == null) {
            return null;
        }
        String str = map.get(FuoITeVPeXAj.LWyYPHHzDRIFSEk);
        long jB = str != null ? b(str) : 0L;
        String str2 = map.get("Cache-Control");
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
                        j11 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j12 = Long.parseLong(strTrim.substring(23));
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
        String str3 = map.get("Expires");
        long jB2 = str3 != null ? b(str3) : j10;
        String str4 = map.get("Last-Modified");
        long jB3 = str4 != null ? b(str4) : j10;
        String str5 = map.get(Command.HTTP_HEADER_ETAG);
        if (i10 != 0) {
            j14 = jCurrentTimeMillis + (j11 * 1000);
            j13 = z10 ? j14 : j14 + (j12 * 1000);
        } else {
            j13 = (jB <= j10 || jB2 < jB) ? j10 : jCurrentTimeMillis + (jB2 - jB);
            j14 = j13;
        }
        com.mbridge.msdk.tracker.network.b.a aVar = new com.mbridge.msdk.tracker.network.b.a();
        aVar.f33759a = qVar.f33823b;
        aVar.f33760b = str5;
        aVar.f33764f = j14;
        aVar.f33763e = j13;
        aVar.f33761c = jB;
        aVar.f33762d = jB3;
        aVar.f33765g = map;
        aVar.f33766h = qVar.f33825d;
        return aVar;
    }

    public static long b(String str) {
        try {
            Date date = a("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str);
            if (date != null) {
                return date.getTime();
            }
            return 0L;
        } catch (ParseException e10) {
            if (MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(str) || "-1".equals(str)) {
                c0.d("Unable to parse dateStr: %s, falling back to 0", str);
            } else {
                c0.a(e10, "Unable to parse dateStr: %s, falling back to 0", str);
            }
            return 0L;
        }
    }

    static String a(long j10) {
        return a("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j10));
    }

    private static SimpleDateFormat a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static String a(Map<String, String> map, String str) {
        String str2;
        if (map != null && (str2 = map.get("Content-Type")) != null) {
            String[] strArrSplit = str2.split(";", 0);
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                String[] strArrSplit2 = strArrSplit[i10].trim().split("=", 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                    return strArrSplit2[1];
                }
            }
        }
        return str;
    }

    public static String a(Map<String, String> map) {
        return a(map, "ISO-8859-1");
    }

    static List<com.mbridge.msdk.tracker.network.g> a(List<com.mbridge.msdk.tracker.network.g> list, com.mbridge.msdk.tracker.network.b.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<com.mbridge.msdk.tracker.network.g> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<com.mbridge.msdk.tracker.network.g> list2 = aVar.f33766h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (com.mbridge.msdk.tracker.network.g gVar : aVar.f33766h) {
                    if (!treeSet.contains(gVar.a())) {
                        arrayList.add(gVar);
                    }
                }
            }
        } else if (!aVar.f33765g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.f33765g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new com.mbridge.msdk.tracker.network.g(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    static Map<String, String> a(com.mbridge.msdk.tracker.network.b.a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        String str = aVar.f33760b;
        if (str != null) {
            map.put("If-None-Match", str);
        }
        long j10 = aVar.f33762d;
        if (j10 > 0) {
            map.put("If-Modified-Since", a(j10));
        }
        return map;
    }
}
