package com.inmobi.media;

import android.content.SharedPreferences;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.sdk.InMobiSdk;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.a7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2829a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static JSONObject f26171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static JSONObject f26172b;

    public static final void a(JSONObject jSONObject) {
        kotlin.jvm.internal.s.g("a7", "TAG");
        JSONObject jSONObject2 = f26171a;
        Objects.toString(jSONObject);
        Objects.toString(jSONObject2);
        if (jSONObject != null) {
            f26171a = jSONObject;
        }
    }

    public static final JSONObject b() {
        String string;
        int i10;
        JSONObject jSONObject;
        String string2;
        String string3;
        kotlin.jvm.internal.s.g("a7", "TAG");
        SharedPreferences sharedPreferencesA = AbstractC3047ij.a();
        if (sharedPreferencesA != null) {
            try {
                kotlin.jvm.internal.s.g("a7", "TAG");
                string = sharedPreferencesA.getString("IABTCF_TCString", null);
                try {
                    i10 = sharedPreferencesA.getInt("IABTCF_gdprApplies", -1);
                } catch (Exception unused) {
                    i10 = -1;
                }
            } catch (Exception unused2) {
                string = null;
            }
            if (string != null) {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_IAB, string);
                    if (i10 != -1) {
                        jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, String.valueOf(i10));
                    }
                } catch (JSONException unused3) {
                    jSONObject = null;
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject == null) {
                try {
                    kotlin.jvm.internal.s.g("a7", "TAG");
                    string2 = sharedPreferencesA.getString("IABConsent_ConsentString", null);
                    try {
                        string3 = sharedPreferencesA.getString("IABConsent_SubjectToGDPR", null);
                    } catch (Exception unused4) {
                        string3 = null;
                    }
                } catch (Exception unused5) {
                    string2 = null;
                }
                if (string2 != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(InMobiSdk.IM_GDPR_CONSENT_IAB, string2);
                        if (string3 != null) {
                            jSONObject2.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, string3);
                        }
                        jSONObject = jSONObject2;
                    } catch (JSONException unused6) {
                        jSONObject = null;
                    }
                } else {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                return jSONObject;
            }
        }
        JSONObject jSONObject3 = f26172b;
        if (jSONObject3 == null) {
            return f26171a;
        }
        if (f26171a != null) {
            jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = f26172b;
            Iterator<String> itKeys = jSONObject4 != null ? jSONObject4.keys() : null;
            if (itKeys != null) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        JSONObject jSONObject5 = f26172b;
                        jSONObject3.put(next, jSONObject5 != null ? jSONObject5.opt(next) : null);
                    } catch (JSONException unused7) {
                    }
                }
            }
            JSONObject jSONObject6 = f26171a;
            Iterator<String> itKeys2 = jSONObject6 != null ? jSONObject6.keys() : null;
            if (itKeys2 != null) {
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    try {
                        JSONObject jSONObject7 = f26171a;
                        jSONObject3.put(next2, jSONObject7 != null ? jSONObject7.opt(next2) : null);
                    } catch (JSONException unused8) {
                    }
                }
            }
        }
        return jSONObject3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static boolean a() {
        ?? r10;
        JSONObject jSONObjectB = b();
        if (jSONObjectB == null) {
            r10 = -1;
        } else if (jSONObjectB.has(InMobiSdk.IM_GDPR_CONSENT_IAB)) {
            r10 = 1;
        } else if (jSONObjectB.has(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE)) {
            try {
                r10 = jSONObjectB.getBoolean(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE);
            } catch (JSONException unused) {
                r10 = -1;
            }
        } else {
            r10 = -1;
        }
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(RootConfig.class, "clazz");
        boolean zShouldTransmitRequest = ((RootConfig) AbstractC2878c4.f26300a.a(RootConfig.class)).shouldTransmitRequest();
        kotlin.jvm.internal.s.g("a7", "TAG");
        return r10 == 1 || zShouldTransmitRequest;
    }
}
