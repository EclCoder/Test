package com.mbridge.msdk.foundation.tools;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.URL;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class c1 {
    public static String a(String str) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? "" : new URL(str).getHost();
        } catch (Exception e10) {
            q0.b("UriUtil", e10.getMessage());
            return "";
        }
    }

    public static String b(String str) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : new URL(str).getPath();
        } catch (Exception e10) {
            q0.b("UriUtil", e10.getMessage());
            return "";
        }
    }

    public static int c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            if (URLUtil.isValidUrl(str) || e(str)) {
                return Uri.parse(str).getQueryParameterNames().size();
            }
            return 0;
        } catch (Exception e10) {
            q0.b("UriUtil", e10.getMessage());
            return 0;
        }
    }

    public static String d(String str) {
        try {
            Uri uri = Uri.parse(str);
            return uri.getScheme() + "://" + uri.getHost() + uri.getPath();
        } catch (Exception e10) {
            q0.b("UriUtil", e10.getMessage());
            return "";
        }
    }

    public static boolean e(String str) {
        return str != null && str.length() > 5 && str.substring(0, 6).equalsIgnoreCase("tcp://");
    }

    public static String a(String str, String str2) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : Uri.parse(str).getQueryParameter(str2);
        } catch (Exception e10) {
            q0.b(WwUgngZLNA.ADYdcIm, e10.getMessage());
            return "";
        }
    }
}
