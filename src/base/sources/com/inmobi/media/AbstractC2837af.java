package com.inmobi.media;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.api.client.http.HttpStatusCodes;
import com.inmobi.media.AbstractC2837af;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.af, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2837af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yl.f f26214a = yl.g.m(TTAdConstant.DOWNLOAD_URL_CODE, Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yl.f f26215b = yl.g.m(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES, 500);

    public static final String a(String url, Map map) {
        StringBuilder sb2;
        kotlin.jvm.internal.s.h(url, "url");
        if (map == null) {
            return url;
        }
        String strL0 = gl.r.l0(map.entrySet(), "&", null, null, 0, null, new Function1() { // from class: yh.c7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC2837af.a((Map.Entry) obj);
            }
        }, 30, null);
        if (bm.r.T(url, "?", false, 2, null)) {
            sb2 = new StringBuilder();
            sb2.append("&");
        } else {
            sb2 = new StringBuilder();
            sb2.append("?");
        }
        sb2.append(strL0);
        return url + sb2.toString();
    }

    public static final CharSequence a(Map.Entry entry) throws UnsupportedEncodingException {
        kotlin.jvm.internal.s.h(entry, "<destruct>");
        String str = (String) entry.getKey();
        String str2 = (String) entry.getValue();
        Charset charset = bm.d.f9079b;
        return URLEncoder.encode(str, charset.name()) + "=" + URLEncoder.encode(str2, charset.name());
    }
}
