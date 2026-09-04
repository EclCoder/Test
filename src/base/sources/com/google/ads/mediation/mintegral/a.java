package com.google.ads.mediation.mintegral;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.out.MBConfiguration;
import java.util.ArrayList;
import java.util.List;
import q8.e;
import q8.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f16350a = "a";

    protected static void a(Context context, MBridgeSDK mBridgeSDK) {
        int tagForChildDirectedTreatment = MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment();
        int tagForUnderAgeOfConsent = MobileAds.getRequestConfiguration().getTagForUnderAgeOfConsent();
        if (tagForChildDirectedTreatment == 1 || tagForUnderAgeOfConsent == 1) {
            mBridgeSDK.setCoppaStatus(context, true);
        } else if (tagForChildDirectedTreatment == 0 || tagForUnderAgeOfConsent == 0) {
            mBridgeSDK.setCoppaStatus(context, false);
        }
    }

    public static int b(Context context, float f10) {
        Resources resources = context.getResources();
        if (resources == null) {
            return 0;
        }
        return (int) TypedValue.applyDimension(1, f10 + 0.5f, resources.getDisplayMetrics());
    }

    public static String c() {
        return "17.1.31.0";
    }

    public static List d(RtbSignalData rtbSignalData) {
        ArrayList arrayList = new ArrayList();
        for (MediationConfiguration mediationConfiguration : rtbSignalData.getConfigurations()) {
            String string = mediationConfiguration.getServerParameters().getString("ad_unit_id");
            String string2 = mediationConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                arrayList.add(new j(string, string2));
            }
        }
        return arrayList;
    }

    public static String e() {
        return MBConfiguration.SDK_VERSION;
    }

    public static boolean f(Bundle bundle) {
        return bundle.getBoolean("mute_audio");
    }

    public static AdError g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            AdError adErrorA = e.a(101, "Missing or invalid ad Unit ID configured for this ad source instance in the AdMob or Ad Manager UI.");
            Log.e(f16350a, adErrorA.toString());
            return adErrorA;
        }
        if (!TextUtils.isEmpty(str2)) {
            return null;
        }
        AdError adErrorA2 = e.a(101, "Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.");
        Log.e(f16350a, adErrorA2.toString());
        return adErrorA2;
    }

    public static AdError h(String str, String str2, String str3) {
        AdError adErrorG = g(str, str2);
        if (adErrorG != null) {
            return adErrorG;
        }
        if (!TextUtils.isEmpty(str3)) {
            return null;
        }
        AdError adErrorA = e.a(103, "Missing or invalid Mintegral bidding signal in this ad request.");
        Log.w(f16350a, adErrorA.toString());
        return adErrorA;
    }
}
