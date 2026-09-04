package com.apm.insight.runtime;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static File f11006a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f11008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f11009c;

        a(String str) {
            String[] strArrSplit = str.split("\\s+");
            if (strArrSplit.length != 3) {
                com.apm.insight.c.a();
                j.a(new RuntimeException("err ProcessTrack line:".concat(str)), "NPTH_CATCH");
                return;
            }
            this.f11008b = strArrSplit[0];
            this.f11007a = strArrSplit[1];
            try {
                this.f11009c = Long.parseLong(strArrSplit[2]);
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                j.a(new RuntimeException("err ProcessTrack line:".concat(str), th2), "NPTH_CATCH");
            }
        }
    }

    public static File a(long j10) {
        return new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((j10 - (j10 % com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS)) / com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS));
    }

    public static HashMap<String, a> a(long j10, String str) throws Throwable {
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((j10 - (j10 % com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS)) / com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS));
        String[] list = file.list();
        HashMap<String, a> map = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray jSONArrayA = com.apm.insight.l.f.a(file2, length > 1048576 ? length - 524288 : 0L);
                    for (int length2 = jSONArrayA.length() - 1; length2 >= 0; length2--) {
                        String strOptString = jSONArrayA.optString(length2);
                        if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith(str)) {
                            map.put(str2.replace('_', ':').replace(".txt", ""), new a(strOptString));
                            break;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        return map;
    }

    public static void a(String str, String str2) {
        File file;
        try {
            if (f11006a == null) {
                com.apm.insight.e.g();
                String strB = com.apm.insight.l.a.b();
                if (strB == null) {
                    file = null;
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    f11006a = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS)) / com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS) + '/' + strB.replace(':', '_') + ".txt");
                    file = f11006a;
                }
            } else {
                file = f11006a;
            }
            if (file != null) {
                com.apm.insight.l.f.a(file, str + ' ' + str2 + ' ' + System.currentTimeMillis() + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }
}
