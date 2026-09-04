package com.mbridge.msdk.config.dynamic.baseview.webview.util;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        Object[] array = uri.getQueryParameterNames().toArray();
        if (!TextUtils.isEmpty(scheme) && scheme.equals("js")) {
            return "javascript:" + uri.getQueryParameter(String.valueOf(array[0]));
        }
        if (TextUtils.isEmpty(scheme) || !scheme.equals("mv")) {
            return str;
        }
        return "javascript:window.WindVane." + uri.getHost() + "(" + uri.getQueryParameter(String.valueOf(array[0])) + "," + (array.length > 1 ? uri.getQueryParameter(String.valueOf(array[1])) : "") + ");";
    }
}
