package com.inmobi.media;

import android.os.Build;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.yl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3463yl {
    public static final D5 a(List list) {
        kotlin.jvm.internal.s.h(list, dOIDCKnIR.LyNqinc);
        return list.size() != 2 ? new D5(0, 0) : new D5(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public static final String a(String url) {
        kotlin.jvm.internal.s.h(url, "url");
        if (Build.VERSION.SDK_INT >= 33) {
            return URLEncoder.encode(url, Charset.defaultCharset());
        }
        return URLEncoder.encode(url);
    }
}
