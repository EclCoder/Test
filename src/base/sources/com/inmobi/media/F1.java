package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class F1 {
    public static boolean a(Context context, String url, InterfaceC3408wh redirectionValidator, String api, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.s.h(api, "api");
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("AppstoreLinkHandler", "In appStoreLinkHandled");
        }
        kotlin.jvm.internal.s.h(url, "url");
        if (url.length() != 0) {
            Uri uri = Uri.parse(url);
            if (kotlin.jvm.internal.s.c("market", uri.getScheme()) || kotlin.jvm.internal.s.c("play.google.com", uri.getHost()) || kotlin.jvm.internal.s.c("market.android.com", uri.getHost())) {
                Uri uri2 = Uri.parse(url);
                if (context != null) {
                    try {
                        context.getPackageManager().getPackageInfo("com.android.vending", 0);
                        if (!redirectionValidator.c()) {
                            redirectionValidator.a("EX_" + api);
                            return false;
                        }
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW", uri2);
                            intent.setPackage("com.android.vending");
                            intent.addFlags(268435456);
                            context.startActivity(intent);
                            if (interfaceC3322t9 != null) {
                                ((C3348u9) interfaceC3322t9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                            }
                            return true;
                        } catch (IllegalArgumentException e10) {
                            if (interfaceC3322t9 != null) {
                                ((C3348u9) interfaceC3322t9).c("AppstoreLinkHandler", "IllegalArgumentException: Processing appStoreLinkHandling: " + e10.getMessage());
                            }
                            return false;
                        } catch (Exception e11) {
                            if (interfaceC3322t9 != null) {
                                ((C3348u9) interfaceC3322t9).c("AppstoreLinkHandler", "ActivityNotFoundException: Processing appStoreLinkHandling: " + e11.getMessage());
                            }
                            return false;
                        }
                    } catch (PackageManager.NameNotFoundException e12) {
                        e12.printStackTrace();
                    }
                }
                int iA = AbstractC3215p5.a(context, url, redirectionValidator, api, interfaceC3322t9);
                if (iA != 0 && iA != 1) {
                    return false;
                }
                if (interfaceC3322t9 != null) {
                    ((C3348u9) interfaceC3322t9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                }
                return true;
            }
        }
        return false;
    }
}
