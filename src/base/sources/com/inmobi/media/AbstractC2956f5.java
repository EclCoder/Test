package com.inmobi.media;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: renamed from: com.inmobi.media.f5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2956f5 {
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    public static void a(Context context, androidx.browser.customtabs.d customTabsIntent, Uri uri, C2840ai c2840ai, C2988gb c2988gb, InterfaceC3408wh redirectionValidator, String api) {
        int iA;
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(customTabsIntent, "customTabsIntent");
        kotlin.jvm.internal.s.h(uri, "uri");
        kotlin.jvm.internal.s.h(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.s.h(api, "api");
        String strA = AbstractC3085k5.a(context);
        try {
            try {
                if (strA == null) {
                    kotlin.jvm.internal.s.g("i5", "access$getLOG_TAG$cp(...)");
                    if (c2840ai != null) {
                        String url = uri.toString();
                        kotlin.jvm.internal.s.g(url, "toString(...)");
                        kotlin.jvm.internal.s.h(url, "url");
                        kotlin.jvm.internal.s.h(api, "api");
                        c2840ai.f26222a.getLandingPageHandler().a(url, api, c2988gb);
                        return;
                    }
                    return;
                }
                customTabsIntent.f1834a.setFlags(268435456);
                customTabsIntent.f1834a.setPackage(strA);
                customTabsIntent.a(context, uri);
                if (c2988gb != null) {
                    c2988gb.f26602f = "IN_NATIVE";
                }
                if (c2840ai != null) {
                    K2.a(c2840ai, Ua.LPStartSuccess, c2988gb);
                }
            } catch (Exception unused) {
                String string = uri.toString();
                kotlin.jvm.internal.s.g(string, "toString(...)");
                iA = B3.a(context, string, redirectionValidator, api);
                if (c2988gb != null) {
                    c2988gb.f26602f = "EX_NATIVE";
                }
                if (iA != 0 || iA == 1) {
                    if (c2840ai != null) {
                        K2.a(c2840ai, Ua.LPStartSuccess, c2988gb);
                    }
                } else if (c2840ai != null) {
                    Ua landingPageFunnelState = Ua.LPBrowserOpenFailed;
                    Integer numValueOf = Integer.valueOf(iA);
                    kotlin.jvm.internal.s.h(landingPageFunnelState, "landingPageFunnelState");
                    c2840ai.f26222a.getLandingPageHandler().a(landingPageFunnelState, c2988gb, numValueOf);
                }
            }
        } catch (Exception unused2) {
            iA = 9;
            if (c2988gb != null) {
                c2988gb.f26602f = "EX_NATIVE";
            }
            if (iA != 0) {
            }
            if (c2840ai != null) {
                K2.a(c2840ai, Ua.LPStartSuccess, c2988gb);
            }
        }
    }
}
