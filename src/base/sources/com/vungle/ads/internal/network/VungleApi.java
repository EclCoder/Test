package com.vungle.ads.internal.network;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.model.CommonRequestBody;
import gn.e0;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J/\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\nJ/\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u000e\u0010\nJS\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u001a\u0010\u0019J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApi;", "", "", "ua", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "Lcom/vungle/ads/internal/model/f;", TtmlNode.TAG_BODY, "Lcom/vungle/ads/internal/network/a;", "Lcom/vungle/ads/internal/model/g;", "config", "(Ljava/lang/String;Ljava/lang/String;Lcom/vungle/ads/internal/model/f;)Lcom/vungle/ads/internal/network/a;", "Lcom/vungle/ads/internal/model/b;", com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "Ljava/lang/Void;", "ri", "url", "Lcom/vungle/ads/internal/network/d;", "requestType", "", "headers", "Lgn/e0;", "requestBody", "pingTPAT", "(Ljava/lang/String;Ljava/lang/String;Lcom/vungle/ads/internal/network/d;Ljava/util/Map;Lgn/e0;)Lcom/vungle/ads/internal/network/a;", "sendMetrics", "(Ljava/lang/String;Ljava/lang/String;Lgn/e0;)Lcom/vungle/ads/internal/network/a;", "sendErrors", "sendAdMarkup", "(Ljava/lang/String;Lgn/e0;)Lcom/vungle/ads/internal/network/a;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface VungleApi {
    a ads(String ua2, String path, CommonRequestBody body);

    a config(String ua2, String path, CommonRequestBody body);

    a pingTPAT(String ua2, String url, d requestType, Map<String, String> headers, e0 requestBody);

    a ri(String ua2, String path, CommonRequestBody body);

    a sendAdMarkup(String path, e0 requestBody);

    a sendErrors(String ua2, String path, e0 requestBody);

    a sendMetrics(String ua2, String path, e0 requestBody);
}
