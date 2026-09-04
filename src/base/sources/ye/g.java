package ye;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.api.client.http.HttpStatusCodes;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f57517a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f57518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f57519c;

    static {
        int[] iArr = {276, 328, 324, Sdk$SDKError.b.MRAID_UNRECOGNIZED_COMMAND_VALUE, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, TTAdConstant.AD_ID_IS_NULL_CODE, 394, 360, 356, 354, Sdk$SDKError.b.AD_WIN_NOTIFICATION_ERROR_VALUE, 282, 344, 332, 326, HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES, 278, 436, 434, 428, HttpStatusCodes.STATUS_CODE_UNPROCESSABLE_ENTITY, TTAdConstant.LANDING_PAGE_TYPE_CODE, TTAdConstant.IMAGE_LIST_SIZE_CODE, 364, 358, Sdk$SDKError.b.AD_HTML_FAILED_TO_LOAD_VALUE, Sdk$SDKError.b.LINK_COMMAND_OPEN_FAILED_VALUE, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f57518b = iArr;
        f57519c = iArr[47];
    }
}
