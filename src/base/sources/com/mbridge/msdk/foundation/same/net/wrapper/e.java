package com.mbridge.msdk.foundation.same.net.wrapper;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f30646c = "e";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f30647d = "h";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f30648e = "i";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f30649f = "coppa";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f30650g = "d";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f30651h = "e";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f30652i = "a";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f30653j = "f";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f30654k = "g";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.foundation.same.net.model.a> f30655a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f30656b = new LinkedHashMap();

    public void a(String str, String str2) {
        if (str2 == null) {
            q0.b(f30646c, "add() value is null!");
        }
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.f30656b.put(str, str2);
    }

    public String b() {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : this.f30656b.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry.getKey(), C.UTF8_NAME));
                sb2.append("=");
                sb2.append(URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return sb2.toString();
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f30656b.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry.getKey(), C.UTF8_NAME), URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.model.a> entry2 : this.f30655a.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry2.getKey(), C.UTF8_NAME), URLEncoder.encode("FILE_NAME_" + entry2.getValue().d().getName(), C.UTF8_NAME));
            }
        } catch (UnsupportedEncodingException unused) {
        } catch (JSONException e10) {
            q0.b(f30646c, e10.getMessage());
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(28);
        try {
            for (Map.Entry<String, String> entry : this.f30656b.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry.getKey(), C.UTF8_NAME));
                sb2.append('=');
                sb2.append(URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.model.a> entry2 : this.f30655a.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry2.getKey(), C.UTF8_NAME));
                sb2.append('=');
                sb2.append(URLEncoder.encode("FILE_NAME_" + entry2.getValue().d().getName(), C.UTF8_NAME));
            }
        } catch (UnsupportedEncodingException e10) {
            q0.b(f30646c, e10.getMessage());
        }
        return sb2.toString();
    }

    public Map<String, String> a() {
        return this.f30656b;
    }

    public void a(String str) {
        this.f30656b.remove(str);
        this.f30655a.remove(str);
    }
}
