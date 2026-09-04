package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.google.api.client.http.HttpMethods;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    public static boolean a(String str) {
        return (str.equals(HttpMethods.GET) || str.equals(HttpMethods.HEAD)) ? false : true;
    }

    public static boolean b(String str) {
        return !str.equals("PROPFIND");
    }

    public static boolean c(String str) {
        return str.equals("PROPFIND");
    }

    public static boolean d(String str) {
        return str.equals(HttpMethods.POST) || str.equals(HttpMethods.PUT) || str.equals(HttpMethods.PATCH) || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
