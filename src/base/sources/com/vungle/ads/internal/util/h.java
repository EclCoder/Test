package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vungle.ads.LinkError;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.net.URISyntaxException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class h {
    public static final h INSTANCE = new h();
    private static final String TAG = "ExternalRouter";

    private h() {
    }

    private final Intent getIntentFromUrl(String str, boolean z10) {
        Intent uri = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    uri = Intent.parseUri(str, 0);
                }
                if (uri != null && z10) {
                    uri.setFlags(268435456);
                    return uri;
                }
            } catch (URISyntaxException e10) {
                q.Companion.e(TAG, "url format is not correct " + e10.getLocalizedMessage());
            }
        } else if (uri != null) {
            uri.setFlags(268435456);
            return uri;
        }
        return uri;
    }

    static /* synthetic */ Intent getIntentFromUrl$default(h hVar, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return hVar.getIntentFromUrl(str, z10);
    }

    public static /* synthetic */ Intent getIntentFromUrl$vungle_ads_release$default(h hVar, Context context, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return hVar.getIntentFromUrl$vungle_ads_release(context, str);
    }

    public static /* synthetic */ boolean launch$vungle_ads_release$default(h hVar, String str, String str2, Context context, p pVar, com.vungle.ads.internal.ui.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            pVar = null;
        }
        if ((i10 & 16) != 0) {
            cVar = null;
        }
        return hVar.launch$vungle_ads_release(str, str2, context, pVar, cVar);
    }

    public final Intent getIntentFromUrl$vungle_ads_release(Context context, String str) {
        kotlin.jvm.internal.s.h(context, "context");
        return getIntentFromUrl(str, !(context instanceof Activity));
    }

    public final boolean launch$vungle_ads_release(String str, String str2, Context context, p pVar, com.vungle.ads.internal.ui.c cVar) {
        kotlin.jvm.internal.s.h(context, "context");
        if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
            boolean z10 = !(context instanceof Activity);
            try {
                return a.Companion.startWhenForeground(context, getIntentFromUrl(str, z10), getIntentFromUrl(str2, z10), cVar);
            } catch (Exception e10) {
                if (str == null || str.length() == 0) {
                    new LinkError(Sdk$SDKError.b.LINK_COMMAND_OPEN_FAILED, "Fail to open " + str2).setLogEntry$vungle_ads_release(pVar).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    new LinkError(Sdk$SDKError.b.DEEPLINK_OPEN_FAILED, "Fail to open " + str).setLogEntry$vungle_ads_release(pVar).logErrorNoReturnValue$vungle_ads_release();
                }
                q.a aVar = q.Companion;
                aVar.e(TAG, "Error while opening url" + e10.getLocalizedMessage());
                aVar.d(TAG, "Cannot open url " + str2);
            }
        }
        return false;
    }
}
