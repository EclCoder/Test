package com.vungle.ads;

import android.app.Application;
import android.content.Context;
import com.vungle.ads.internal.model.Placement;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g0 {
    public static final String TAG = "VungleAds";
    public static final a Companion = new a(null);
    private static com.vungle.ads.internal.r vungleInternal = new com.vungle.ads.internal.r();
    private static com.vungle.ads.internal.p initializer = new com.vungle.ads.internal.p();
    public static final com.vungle.ads.fpd.c firstPartyData = new com.vungle.ads.fpd.c();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void deInit(Context context) {
            kotlin.jvm.internal.s.h(context, "context");
            g0.initializer.deInit$vungle_ads_release();
        }

        public final void getBiddingToken(Context context, l callback) {
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(callback, "callback");
            g0.vungleInternal.getAvailableBidTokensAsync(context, callback);
        }

        public final String getSdkVersion() {
            return g0.vungleInternal.getSdkVersion();
        }

        public final void init(Context appContext, String appId, p callback) {
            kotlin.jvm.internal.s.h(appContext, "context");
            kotlin.jvm.internal.s.h(appId, "appId");
            kotlin.jvm.internal.s.h(callback, "callback");
            if (!(appContext instanceof Application)) {
                appContext = appContext.getApplicationContext();
            }
            com.vungle.ads.internal.p pVar = g0.initializer;
            kotlin.jvm.internal.s.g(appContext, "appContext");
            pVar.init(appId, appContext, callback);
        }

        public final boolean isInitialized() {
            return g0.initializer.isInitialized();
        }

        public final boolean isInline(String placementId) {
            kotlin.jvm.internal.s.h(placementId, "placementId");
            Placement placement = com.vungle.ads.internal.e.INSTANCE.getPlacement(placementId);
            if (placement != null) {
                return placement.isInline();
            }
            return false;
        }

        public final void setIntegrationName(String integrationName, String version) {
            kotlin.jvm.internal.s.h(integrationName, "integrationName");
            kotlin.jvm.internal.s.h(version, "version");
            g0.initializer.setIntegrationName(integrationName, version);
        }

        private a() {
        }
    }

    public static final void deInit(Context context) {
        Companion.deInit(context);
    }

    public static final void getBiddingToken(Context context, l lVar) {
        Companion.getBiddingToken(context, lVar);
    }

    public static final String getSdkVersion() {
        return Companion.getSdkVersion();
    }

    public static final void init(Context context, String str, p pVar) {
        Companion.init(context, str, pVar);
    }

    public static final boolean isInitialized() {
        return Companion.isInitialized();
    }

    public static final boolean isInline(String str) {
        return Companion.isInline(str);
    }

    public static final void setIntegrationName(String str, String str2) {
        Companion.setIntegrationName(str, str2);
    }
}
