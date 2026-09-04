package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f30717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30718b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, String> f30719a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30720b;

        public b(String str) {
            this.f30720b = str;
        }

        public l a() {
            return new l(this);
        }
    }

    private void a(Map<String, String> map, JSONObject jSONObject) {
        if (map == null || map.isEmpty() || jSONObject == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, a(map.get(str)));
            }
        } catch (Exception e10) {
            q0.b("SameCommonReporter", e10.getMessage());
        }
    }

    public void b(String str) {
        if (TextUtils.isEmpty(this.f30718b)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", this.f30718b);
            a(this.f30717a, jSONObject);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            q0.b("SameCommonReporter", th2.getMessage());
        }
    }

    private l(b bVar) {
        this.f30718b = bVar.f30720b;
        this.f30717a = bVar.f30719a;
    }

    private String a(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (Exception unused) {
            return str;
        }
    }
}
