package pf;

import com.google.api.client.http.HttpStatusCodes;
import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f50032a = {"from_external_app", "from_review", "from_gallery", "from_share_after_edit", "from_trash", "from_internal_viewer"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f50033b = {10, 30, 60, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES, Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE, 1800, 3600, 7200, 18000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f50034c = {"<10s", "10s-30s", "30s-1m", "1m-2m", "2m-5m", "5m-10m", "10m-30m", "30m-1h", "1h-2h", "2h-5h", ">5h"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f50035d = {60, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES, Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE, 1200, 1800, 3600, 7200, 18000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f50036e = {"<1m", "1m-2m", "2m-5m", "5m-10m", "10m-20m", "20m-30m", "30m-1h", "1h-2h", "2h-5h", ">5h"};
}
