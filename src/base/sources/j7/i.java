package j7;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import com.facebook.h0;
import fl.g0;
import gl.r;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f42101a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f42102b = "Fledge: " + i.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f42103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f42104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static CustomAudienceManager f42105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static h7.a f42106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f42107g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements OutcomeReceiver {
        a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception error) {
            s.h(error, "error");
            Log.e(i.b(), error.toString());
            h7.a aVarA = i.a();
            if (aVarA == null) {
                s.w("gpsDebugLogger");
                aVarA = null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", error.toString());
            g0 g0Var = g0.f38750a;
            aVarA.b("gps_pa_failed", bundle);
        }

        public void onResult(Object result) {
            s.h(result, "result");
            Log.i(i.b(), "Successfully joined custom audience");
            h7.a aVarA = i.a();
            if (aVarA == null) {
                s.w("gpsDebugLogger");
                aVarA = null;
            }
            aVarA.b("gps_pa_succeed", null);
        }
    }

    private i() {
    }

    public static final /* synthetic */ h7.a a() {
        if (x7.a.c(i.class)) {
            return null;
        }
        try {
            return f42106f;
        } catch (Throwable th2) {
            x7.a.b(th2, i.class);
            return null;
        }
    }

    public static final /* synthetic */ String b() {
        if (x7.a.c(i.class)) {
            return null;
        }
        try {
            return f42102b;
        } catch (Throwable th2) {
            x7.a.b(th2, i.class);
            return null;
        }
    }

    public static final void c() {
        String string;
        if (x7.a.c(i.class)) {
            return;
        }
        try {
            f42104d = true;
            Context contextM = h0.m();
            f42106f = new h7.a(contextM);
            f42107g = "https://www." + h0.w() + "/privacy_sandbox/pa/logic";
            h7.a aVar = null;
            try {
                try {
                    CustomAudienceManager customAudienceManager = CustomAudienceManager.get(contextM);
                    f42105e = customAudienceManager;
                    if (customAudienceManager != null) {
                        f42103c = true;
                    }
                    string = null;
                } catch (Exception e10) {
                    string = e10.toString();
                    Log.w(f42102b, "Failed to get CustomAudienceManager: " + e10);
                }
            } catch (Error e11) {
                string = e11.toString();
                Log.w(f42102b, "Failed to get CustomAudienceManager: " + e11);
            }
            if (f42103c) {
                return;
            }
            h7.a aVar2 = f42106f;
            if (aVar2 == null) {
                s.w("gpsDebugLogger");
            } else {
                aVar = aVar2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", string);
            g0 g0Var = g0.f38750a;
            aVar.b("gps_pa_failed", bundle);
        } catch (Throwable th2) {
            x7.a.b(th2, i.class);
        }
    }

    private final void f(String str, String str2) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            String strG = g(str, str2);
            if (strG == null) {
                return;
            }
            h7.a aVar = null;
            try {
                a aVar2 = new a();
                e.a();
                AdData.Builder builderA = j7.a.a();
                StringBuilder sb2 = new StringBuilder();
                String str3 = f42107g;
                if (str3 == null) {
                    s.w("baseUri");
                    str3 = null;
                }
                sb2.append(str3);
                sb2.append("/ad");
                Uri uri = Uri.parse(sb2.toString());
                s.d(uri, "Uri.parse(this)");
                AdData adDataBuild = builderA.setRenderUri(uri).setMetadata("{'isRealAd': false}").build();
                s.g(adDataBuild, "Builder()\n              …\n                .build()");
                f.a();
                TrustedBiddingData.Builder builderA2 = b.a();
                StringBuilder sb3 = new StringBuilder();
                String str4 = f42107g;
                if (str4 == null) {
                    s.w("baseUri");
                    str4 = null;
                }
                sb3.append(str4);
                sb3.append("?trusted_bidding");
                Uri uri2 = Uri.parse(sb3.toString());
                s.d(uri2, "Uri.parse(this)");
                TrustedBiddingData trustedBiddingDataBuild = builderA2.setTrustedBiddingUri(uri2).setTrustedBiddingKeys(r.e("")).build();
                s.g(trustedBiddingDataBuild, "Builder()\n              …\n                .build()");
                g.a();
                CustomAudience.Builder buyer = c.a().setName(strG).setBuyer(AdTechIdentifier.fromString("facebook.com"));
                StringBuilder sb4 = new StringBuilder();
                String str5 = f42107g;
                if (str5 == null) {
                    s.w("baseUri");
                    str5 = null;
                }
                sb4.append(str5);
                sb4.append("?daily&app_id=");
                sb4.append(str);
                Uri uri3 = Uri.parse(sb4.toString());
                s.d(uri3, "Uri.parse(this)");
                CustomAudience.Builder dailyUpdateUri = buyer.setDailyUpdateUri(uri3);
                StringBuilder sb5 = new StringBuilder();
                String str6 = f42107g;
                if (str6 == null) {
                    s.w("baseUri");
                    str6 = null;
                }
                sb5.append(str6);
                sb5.append("?bidding");
                Uri uri4 = Uri.parse(sb5.toString());
                s.d(uri4, "Uri.parse(this)");
                CustomAudience customAudienceBuild = dailyUpdateUri.setBiddingLogicUri(uri4).setTrustedBiddingData(trustedBiddingDataBuild).setUserBiddingSignals(AdSelectionSignals.fromString("{}")).setAds(r.e(adDataBuild)).build();
                s.g(customAudienceBuild, "Builder()\n              …(listOf(dummyAd)).build()");
                h.a();
                JoinCustomAudienceRequest joinCustomAudienceRequestBuild = d.a().setCustomAudience(customAudienceBuild).build();
                s.g(joinCustomAudienceRequestBuild, "Builder().setCustomAudience(ca).build()");
                CustomAudienceManager customAudienceManager = f42105e;
                if (customAudienceManager != null) {
                    customAudienceManager.joinCustomAudience(joinCustomAudienceRequestBuild, Executors.newSingleThreadExecutor(), aVar2);
                }
            } catch (Error e10) {
                Log.w(f42102b, "Failed to join Custom Audience: " + e10);
                h7.a aVar3 = f42106f;
                if (aVar3 == null) {
                    s.w("gpsDebugLogger");
                } else {
                    aVar = aVar3;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_pa_failed_reason", e10.toString());
                g0 g0Var = g0.f38750a;
                aVar.b("gps_pa_failed", bundle);
            } catch (Exception e11) {
                Log.w(f42102b, "Failed to join Custom Audience: " + e11);
                h7.a aVar4 = f42106f;
                if (aVar4 == null) {
                    s.w("gpsDebugLogger");
                } else {
                    aVar = aVar4;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_pa_failed_reason", e11.toString());
                g0 g0Var2 = g0.f38750a;
                aVar.b("gps_pa_failed", bundle2);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final String g(String str, String str2) {
        if (!x7.a.c(this) && str != null && str2 != null) {
            try {
                if (!s.c(str2, "_removed_") && !bm.r.T(str2, "gps", false, 2, null)) {
                    return str + '@' + str2 + '@' + (System.currentTimeMillis() / ((long) 1000)) + "@1";
                }
                return null;
            } catch (Throwable th2) {
                x7.a.b(th2, this);
            }
        }
        return null;
    }

    public final void d(String str, com.facebook.appevents.d dVar) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (!f42104d) {
                c();
            }
            if (f42103c) {
                String string = null;
                if (dVar != null) {
                    try {
                        JSONObject jSONObjectH = dVar.h();
                        if (jSONObjectH != null) {
                            string = jSONObjectH.getString("_eventName");
                        }
                    } catch (JSONException unused) {
                        Log.w(f42102b, "Failed to get event name from event.");
                    }
                }
                f(str, string);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void e(String str, String str2) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (!f42104d) {
                c();
            }
            if (f42103c) {
                f(str, str2);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }
}
