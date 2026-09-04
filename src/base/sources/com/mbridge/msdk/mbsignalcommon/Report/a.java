package com.mbridge.msdk.mbsignalcommon.Report;

import android.content.Context;
import android.util.Base64;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.n;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f31579c = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f31580a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f31581b = 1;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.Report.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    private static final class C0421a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f31582a = new a();
    }

    public static a a() {
        return C0421a.f31582a;
    }

    public void a(Object obj, String str, JSONArray jSONArray, int i10) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4;
        JSONObject jSONObjectOptJSONObject5;
        JSONObject jSONObjectOptJSONObject6;
        JSONObject jSONObjectOptJSONObject7;
        JSONObject jSONObjectOptJSONObject8;
        JSONObject jSONObjectOptJSONObject9;
        JSONObject jSONObjectOptJSONObject10;
        JSONObject jSONObjectOptJSONObject11;
        int i11;
        String str2 = mTFeqtajA.OCAhSRgKgvaon;
        try {
            if (jSONArray == null) {
                a(this.f31581b, str2, obj);
                return;
            }
            int length = jSONArray.length();
            if (length == 0) {
                a(this.f31581b, str2, obj);
                return;
            }
            int i12 = 0;
            if ("reportMessageR".equalsIgnoreCase(str)) {
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    i11 = length - 1;
                    if (i12 >= i11) {
                        break;
                    }
                    JSONObject jSONObjectOptJSONObject12 = jSONArray.optJSONObject(i12);
                    if (jSONObjectOptJSONObject12 != null) {
                        stringBuffer.append(jSONObjectOptJSONObject12.optString("key"));
                        stringBuffer.append("=");
                        stringBuffer.append(jSONObjectOptJSONObject12.opt(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        stringBuffer.append("&");
                    }
                    i12++;
                }
                JSONObject jSONObjectOptJSONObject13 = jSONArray.optJSONObject(i11);
                if (jSONObjectOptJSONObject13 != null) {
                    stringBuffer.append(jSONObjectOptJSONObject13.optString("key"));
                    stringBuffer.append("=");
                    stringBuffer.append(jSONObjectOptJSONObject13.opt(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                }
                a(stringBuffer.toString());
            } else if ("reportMessageD".equalsIgnoreCase(str)) {
                a((length <= 0 || (jSONObjectOptJSONObject11 = jSONArray.optJSONObject(0)) == null) ? "" : jSONObjectOptJSONObject11.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE), (length <= 1 || (jSONObjectOptJSONObject10 = jSONArray.optJSONObject(1)) == null) ? -1 : jSONObjectOptJSONObject10.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE), (length <= 2 || (jSONObjectOptJSONObject9 = jSONArray.optJSONObject(2)) == null) ? -1 : jSONObjectOptJSONObject9.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE), (length <= 3 || (jSONObjectOptJSONObject8 = jSONArray.optJSONObject(3)) == null) ? -1 : jSONObjectOptJSONObject8.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE), (length <= 4 || (jSONObjectOptJSONObject7 = jSONArray.optJSONObject(4)) == null) ? -1 : jSONObjectOptJSONObject7.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE), (length <= 5 || (jSONObjectOptJSONObject6 = jSONArray.optJSONObject(5)) == null) ? "" : jSONObjectOptJSONObject6.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE), (length <= 6 || (jSONObjectOptJSONObject5 = jSONArray.optJSONObject(6)) == null) ? "" : jSONObjectOptJSONObject5.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE), (length <= 7 || (jSONObjectOptJSONObject4 = jSONArray.optJSONObject(7)) == null) ? -1 : jSONObjectOptJSONObject4.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE), (length <= 8 || (jSONObjectOptJSONObject3 = jSONArray.optJSONObject(8)) == null) ? "" : jSONObjectOptJSONObject3.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE), (length <= 9 || (jSONObjectOptJSONObject2 = jSONArray.optJSONObject(9)) == null) ? -1 : jSONObjectOptJSONObject2.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE), (length <= 10 || (jSONObjectOptJSONObject = jSONArray.optJSONObject(10)) == null) ? "" : jSONObjectOptJSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            }
            a(this.f31580a, "called reporter success", obj);
        } catch (Throwable th2) {
            q0.a(f31579c, th2.getMessage());
            a(this.f31581b, "exception: " + th2.getMessage(), obj);
        }
    }

    public void a(String str) {
        d.b().e(str);
    }

    public void a(String str, int i10, int i11, int i12, int i13, String str2, String str3, int i14, String str4, int i15, String str5) {
        try {
            Context contextD = c.n().d();
            if (contextD != null) {
                n.a(g.a(contextD)).a(new com.mbridge.msdk.foundation.entity.n(str, i10, i11, i12, i13, str2, str3, i14, str4, i15, str5));
            }
        } catch (Throwable th2) {
            q0.a(f31579c, th2.getMessage());
        }
    }

    public void a(int i10, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e10) {
            q0.a(f31579c, e10.getMessage());
        } catch (Throwable th2) {
            q0.a(f31579c, th2.getMessage());
        }
    }
}
