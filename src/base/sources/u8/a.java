package u8;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static AdError a(int i10, String str) {
        return new AdError(i10, str, "com.google.ads.mediation.pangle");
    }

    public static AdError c(int i10, String str) {
        return new AdError(i10, str, "com.pangle.ads");
    }

    public static boolean d() {
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        return requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1;
    }

    public static AdError b() {
        return new AdError(103, "MobileAds.getRequestConfiguration() indicates the user is a child. Pangle SDK V71 or higher does not support child users.", NpmRNZ.ytKayMR);
    }
}
