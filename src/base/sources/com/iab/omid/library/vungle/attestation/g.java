package com.iab.omid.library.vungle.attestation;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public class g {
    public static boolean a(WebView webView) {
        try {
            if (!x4.g.a("WEB_MESSAGE_LISTENER") || !c.a(com.iab.omid.library.vungle.internal.g.b().a()).b()) {
                return false;
            }
            f.a(webView);
            return true;
        } catch (Exception e10) {
            com.iab.omid.library.vungle.utils.d.a("Error during initialization of AttestationMessageListener", e10);
            return false;
        } catch (NoClassDefFoundError unused) {
            com.iab.omid.library.vungle.utils.d.a("androidx.webkit not available, skipping attestation listener initialization");
            return false;
        }
    }
}
