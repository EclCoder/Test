package com.iab.omid.library.vungle.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class j {
    private static Map<String, String> a(Uri uri) {
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            map.put(str, uri.getQueryParameter(str));
        }
        return map;
    }

    public static void b(Uri uri) {
        String str;
        try {
            String queryParameter = uri.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter)) {
                str = "OmidNativeUrlHandler failed to handle url [" + uri.toString() + "] as 'method' not available";
            } else {
                if (queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) {
                    a(a(uri));
                    return;
                }
                str = "Unknown method in OmidNativeUrlHandler.handle :" + queryParameter;
            }
            com.iab.omid.library.vungle.utils.d.b(str);
        } catch (Exception e10) {
            com.iab.omid.library.vungle.utils.d.a("OmidNativeUrlHandler failed to handle url [" + uri.toString() + "]", e10);
        }
    }

    private static void a(Map<String, String> map) {
        try {
            com.iab.omid.library.vungle.attestation.e.a(g.b().a().getApplicationContext(), map.get("mechanism"), new com.iab.omid.library.vungle.attestation.a(map));
        } catch (Exception e10) {
            com.iab.omid.library.vungle.utils.d.a("Error processing attestation request in OmidNativeUrlHandler", e10);
        }
    }
}
