package com.inmobi.media;

import android.os.Build;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2900d0 {
    public static void a(String str, String str2, AdResponse adResponse, C3348u9 c3348u9) {
        kotlin.jvm.internal.s.h(adResponse, "adResponse");
        if (c3348u9 == null) {
            return;
        }
        try {
            int i10 = 0;
            AdSet adSet = adResponse.getAdSets().get(0);
            String value = adResponse.getRequestId();
            kotlin.jvm.internal.s.h("requestID", "key");
            kotlin.jvm.internal.s.h(value, "value");
            Ph ph2 = c3348u9.f27613a;
            if (ph2 != null) {
                ph2.a("requestID", value);
            }
            String value2 = String.valueOf(adResponse.getPlacementId());
            kotlin.jvm.internal.s.h("placementID", "key");
            kotlin.jvm.internal.s.h(value2, "value");
            Ph ph3 = c3348u9.f27613a;
            if (ph3 != null) {
                ph3.a("placementID", value2);
            }
            String value3 = String.valueOf(str);
            kotlin.jvm.internal.s.h("adType", "key");
            kotlin.jvm.internal.s.h(value3, "value");
            Ph ph4 = c3348u9.f27613a;
            if (ph4 != null) {
                ph4.a("adType", value3);
            }
            String value4 = String.valueOf(str2);
            kotlin.jvm.internal.s.h("placementType", "key");
            kotlin.jvm.internal.s.h(value4, "value");
            Ph ph5 = c3348u9.f27613a;
            if (ph5 != null) {
                ph5.a("placementType", value4);
            }
            String value5 = String.valueOf(A1.f24429a);
            kotlin.jvm.internal.s.h("bundleID", "key");
            kotlin.jvm.internal.s.h(value5, "value");
            Ph ph6 = c3348u9.f27613a;
            if (ph6 != null) {
                ph6.a("bundleID", value5);
            }
            B5.f24500a.getClass();
            String value6 = (String) B5.f24509j.i();
            kotlin.jvm.internal.s.h("deviceOSVersion", "key");
            kotlin.jvm.internal.s.h(value6, "value");
            Ph ph7 = c3348u9.f27613a;
            if (ph7 != null) {
                ph7.a("deviceOSVersion", value6);
            }
            String value7 = B5.o();
            kotlin.jvm.internal.s.h("networkType", "key");
            kotlin.jvm.internal.s.h(value7, "value");
            Ph ph8 = c3348u9.f27613a;
            if (ph8 != null) {
                ph8.a("networkType", value7);
            }
            String value8 = Build.MODEL;
            kotlin.jvm.internal.s.g(value8, "MODEL");
            kotlin.jvm.internal.s.h("deviceModel", "key");
            kotlin.jvm.internal.s.h(value8, "value");
            Ph ph9 = c3348u9.f27613a;
            if (ph9 != null) {
                ph9.a("deviceModel", value8);
            }
            String value9 = String.valueOf(Xi.f26023c);
            kotlin.jvm.internal.s.h("publisherID", "key");
            kotlin.jvm.internal.s.h(value9, "value");
            Ph ph10 = c3348u9.f27613a;
            if (ph10 != null) {
                ph10.a("publisherID", value9);
            }
            kotlin.jvm.internal.s.h("sdkVersion", "key");
            kotlin.jvm.internal.s.h("11.2.0", AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Ph ph11 = c3348u9.f27613a;
            if (ph11 != null) {
                ph11.a("sdkVersion", "11.2.0");
            }
            String value10 = String.valueOf(Yi.f26090b);
            kotlin.jvm.internal.s.h("tpName", "key");
            kotlin.jvm.internal.s.h(value10, "value");
            Ph ph12 = c3348u9.f27613a;
            if (ph12 != null) {
                ph12.a("tpName", value10);
            }
            String value11 = String.valueOf(Yi.f26089a);
            kotlin.jvm.internal.s.h("tpVersion", "key");
            kotlin.jvm.internal.s.h(value11, "value");
            Ph ph13 = c3348u9.f27613a;
            if (ph13 != null) {
                ph13.a("tpVersion", value11);
            }
            kotlin.jvm.internal.s.h("source", "key");
            kotlin.jvm.internal.s.h("sdk_android", AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Ph ph14 = c3348u9.f27613a;
            if (ph14 != null) {
                ph14.a("source", "sdk_android");
            }
            String value12 = Yi.a();
            kotlin.jvm.internal.s.h("mkVersion", "key");
            kotlin.jvm.internal.s.h(value12, "value");
            Ph ph15 = c3348u9.f27613a;
            if (ph15 != null) {
                ph15.a("mkVersion", value12);
            }
            String value13 = Xi.c();
            kotlin.jvm.internal.s.h("webViewUserAgent", "key");
            kotlin.jvm.internal.s.h(value13, "value");
            Ph ph16 = c3348u9.f27613a;
            if (ph16 != null) {
                ph16.a("webViewUserAgent", value13);
            }
            String value14 = String.valueOf(adSet.getIsPod());
            kotlin.jvm.internal.s.h("sdkAdPod", "key");
            kotlin.jvm.internal.s.h(value14, "value");
            Ph ph17 = c3348u9.f27613a;
            if (ph17 != null) {
                ph17.a("sdkAdPod", value14);
            }
            String value15 = String.valueOf(adSet.getLogEnabled());
            kotlin.jvm.internal.s.h("isServerSideLogging", "key");
            kotlin.jvm.internal.s.h(value15, "value");
            Ph ph18 = c3348u9.f27613a;
            if (ph18 != null) {
                ph18.a("isServerSideLogging", value15);
            }
            String value16 = adSet.getTransactionId();
            if (value16 == null) {
                value16 = "Not Set";
            }
            kotlin.jvm.internal.s.h("transactionID", "key");
            kotlin.jvm.internal.s.h(value16, "value");
            Ph ph19 = c3348u9.f27613a;
            if (ph19 != null) {
                ph19.a("transactionID", value16);
            }
            String value17 = a();
            kotlin.jvm.internal.s.h("configData", "key");
            kotlin.jvm.internal.s.h(value17, "value");
            Ph ph20 = c3348u9.f27613a;
            if (ph20 != null) {
                ph20.a("configData", value17);
            }
            if (adSet.getIsPod()) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (adSet.getAds().isEmpty()) {
                    c3348u9.b("AdLogResponseHandler", "no ads. cannot update vitals");
                } else {
                    for (Object obj : adSet.getAds()) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            gl.r.u();
                        }
                        com.inmobi.media.ads.network.common.model.Ad ad2 = (com.inmobi.media.ads.network.common.model.Ad) obj;
                        arrayList.add(i10, ad2.getCreativeId());
                        arrayList2.add(i10, ad2.getImpressionId());
                        i10 = i11;
                    }
                    String value18 = gl.r.l0(arrayList, " , ", null, null, 0, null, null, 62, null);
                    kotlin.jvm.internal.s.h("creativeID", "key");
                    kotlin.jvm.internal.s.h(value18, "value");
                    Ph ph21 = c3348u9.f27613a;
                    if (ph21 != null) {
                        ph21.a("creativeID", value18);
                    }
                    String value19 = gl.r.l0(arrayList2, " , ", null, null, 0, null, null, 62, null);
                    kotlin.jvm.internal.s.h("impressionID", "key");
                    kotlin.jvm.internal.s.h(value19, "value");
                    Ph ph22 = c3348u9.f27613a;
                    if (ph22 != null) {
                        ph22.a("impressionID", value19);
                    }
                }
            } else if (adSet.getAds().isEmpty()) {
                c3348u9.b("AdLogResponseHandler", "no ads. cannot update vitals");
            } else {
                com.inmobi.media.ads.network.common.model.Ad ad3 = adSet.getAds().get(0);
                String value20 = ad3.getCreativeId();
                kotlin.jvm.internal.s.h("creativeID", "key");
                kotlin.jvm.internal.s.h(value20, "value");
                Ph ph23 = c3348u9.f27613a;
                if (ph23 != null) {
                    ph23.a("creativeID", value20);
                }
                String value21 = ad3.getImpressionId();
                kotlin.jvm.internal.s.h("impressionID", "key");
                kotlin.jvm.internal.s.h(value21, "value");
                Ph ph24 = c3348u9.f27613a;
                if (ph24 != null) {
                    ph24.a("impressionID", value21);
                }
            }
        } catch (JSONException e10) {
            c3348u9.a("AdLogResponseHandler", "error while update vitals", e10);
        }
        a(adResponse, c3348u9);
    }

    public static void a(AdResponse adResponse, C3348u9 c3348u9) {
        try {
            boolean logEnabled = adResponse.getAdSets().get(0).getLogEnabled();
            c3348u9.a("AdLogResponseHandler", "server side logger lever - " + logEnabled);
            c3348u9.a(logEnabled);
        } catch (JSONException e10) {
            c3348u9.a("AdLogResponseHandler", "error while setting server-side lever", e10);
            c3348u9.a(false);
        }
    }

    public static String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(RootConfig.class, "clazz");
        C3136m4 c3136m5 = AbstractC2878c4.f26300a;
        jSONObject.put("root", ((RootConfig) c3136m5.a(RootConfig.class)).getLastUpdateTimeStamp());
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        jSONObject.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, ((AdConfig) c3136m5.a(AdConfig.class)).getLastUpdateTimeStamp());
        kotlin.jvm.internal.s.h(TelemetryConfig.class, "clazz");
        jSONObject.put("telemetry", ((TelemetryConfig) c3136m5.a(TelemetryConfig.class)).getLastUpdateTimeStamp());
        kotlin.jvm.internal.s.h(CrashConfig.class, "clazz");
        jSONObject.put("crashReporting", ((CrashConfig) c3136m5.a(CrashConfig.class)).getLastUpdateTimeStamp());
        kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
        jSONObject.put("signals", ((SignalsConfig) c3136m5.a(SignalsConfig.class)).getLastUpdateTimeStamp());
        String string = jSONObject.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }
}
