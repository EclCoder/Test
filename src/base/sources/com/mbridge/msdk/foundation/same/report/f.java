package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URLEncoder;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile f f30711b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile com.mbridge.msdk.tracker.m f30712a;

    public static f a() {
        if (f30711b == null) {
            synchronized (f.class) {
                try {
                    if (f30711b == null) {
                        f30711b = new f();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f30711b;
    }

    public com.mbridge.msdk.tracker.m b() {
        if (this.f30712a == null) {
            this.f30712a = com.mbridge.msdk.foundation.same.report.metrics.d.b().e();
        }
        return this.f30712a;
    }

    public void c() {
        b().a();
    }

    public void a(Context context, String str, String str2, String str3, String str4, int i10) {
        com.mbridge.msdk.tracker.m mVarB = a().b();
        if (mVarB == null) {
            return;
        }
        if (!mVarB.a("2000105")) {
            q0.a("MetricsReportUtil", "reportClickImpException can not track");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.isEmpty(str2)) {
                jSONObject.put("url", "");
            } else {
                jSONObject.put("url", URLEncoder.encode(str2, "utf-8"));
            }
            jSONObject.put("type", i10);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("rid", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("rid_n", str4);
            }
            try {
                long[] jArrE = mVarB.e();
                jSONObject.put("track_time", jArrE[0]);
                jSONObject.put("track_count", jArrE[1]);
                jSONObject.put("session_id", mVarB.d());
            } catch (Exception unused) {
            }
            jSONObject.put("reason", URLEncoder.encode(str, "utf-8"));
            com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e("2000105");
            eVar.a(jSONObject);
            eVar.a(0);
            eVar.b(0);
            eVar.a(c.d());
            mVarB.d(eVar);
        } catch (Exception e10) {
            q0.b("MetricsReportUtil", e10.getMessage());
        }
    }
}
