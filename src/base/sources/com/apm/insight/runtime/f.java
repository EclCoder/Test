package com.apm.insight.runtime;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, Long> f10977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10979d;

    public f(Context context) {
        this.f10977b = null;
        this.f10978c = 50;
        this.f10979d = 100;
        this.f10976a = context;
        this.f10977b = b();
        this.f10978c = a.a(this.f10978c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f10979d = a.a(this.f10979d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    private HashMap<String, Long> b() {
        File fileH = com.apm.insight.l.j.h(this.f10976a);
        HashMap<String, Long> map = new HashMap<>();
        map.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray jSONArrayA = com.apm.insight.l.f.a(fileH.getAbsolutePath());
            if (!com.apm.insight.a.a(jSONArrayA)) {
                Long lDecode = Long.decode(jSONArrayA.optString(0, null));
                if (System.currentTimeMillis() - lDecode.longValue() > com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS) {
                    File fileG = com.apm.insight.l.j.g(this.f10976a);
                    fileH.renameTo(new File(fileG, String.valueOf(System.currentTimeMillis())));
                    String[] list = fileG.list();
                    if (list != null && list.length > 5) {
                        Arrays.sort(list);
                        new File(fileG, list[0]).delete();
                        return map;
                    }
                } else {
                    map.put("time", lDecode);
                    for (int i10 = 1; i10 < jSONArrayA.length(); i10++) {
                        String[] strArrSplit = jSONArrayA.optString(i10, "").split(" ");
                        if (strArrSplit.length == 2) {
                            map.put(strArrSplit[0], Long.decode(strArrSplit[1]));
                        }
                    }
                }
            }
        } catch (IOException unused) {
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            j.a(th2, "NPTH_CATCH");
        }
        return map;
    }

    public final void a() throws Throwable {
        HashMap<String, Long> map = this.f10977b;
        Long lRemove = map.remove("time");
        if (lRemove == null) {
            com.apm.insight.c.a();
            j.a(new RuntimeException("err times, no time"), "NPTH_CATCH");
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(lRemove);
        sb2.append('\n');
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(' ');
            sb2.append(entry.getValue());
            sb2.append('\n');
        }
        try {
            com.apm.insight.l.f.a(com.apm.insight.l.j.h(this.f10976a), sb2.toString(), false);
        } catch (IOException unused) {
        }
    }

    public final boolean a(String str) {
        if (str == null) {
            str = "default";
        }
        return com.apm.insight.l.c.AnonymousClass1.a(this.f10977b, str, 1L).longValue() < ((long) this.f10978c) && com.apm.insight.l.c.AnonymousClass1.a(this.f10977b, "all", 1L).longValue() < ((long) this.f10979d);
    }
}
