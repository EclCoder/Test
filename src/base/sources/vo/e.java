package vo;

import co.w;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.api.client.http.HttpStatusCodes;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class e implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f55690a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[][] f55691b = {null, new String[3], new String[8], new String[8], new String[25], new String[8]};

    static {
        b(200, "OK");
        b(201, "Created");
        b(202, "Accepted");
        b(204, "No Content");
        b(301, "Moved Permanently");
        b(302, "Moved Temporarily");
        b(304, "Not Modified");
        b(400, "Bad Request");
        b(401, "Unauthorized");
        b(403, "Forbidden");
        b(404, "Not Found");
        b(500, "Internal Server Error");
        b(PglCryptUtils.LOAD_SO_FAILED, "Not Implemented");
        b(502, "Bad Gateway");
        b(503, "Service Unavailable");
        b(100, lkCBSIFlvmyGX.AbGoK);
        b(307, "Temporary Redirect");
        b(405, "Method Not Allowed");
        b(409, "Conflict");
        b(412, "Precondition Failed");
        b(TTAdConstant.VIDEO_INFO_CODE, "Request Too Long");
        b(TTAdConstant.VIDEO_URL_CODE, "Request-URI Too Long");
        b(TTAdConstant.VIDEO_COVER_URL_CODE, "Unsupported Media Type");
        b(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES, "Multiple Choices");
        b(HttpStatusCodes.STATUS_CODE_SEE_OTHER, "See Other");
        b(Sdk$SDKError.b.MRAID_BRIDGE_ERROR_VALUE, "Use Proxy");
        b(TTAdConstant.AD_ID_IS_NULL_CODE, "Payment Required");
        b(TTAdConstant.LANDING_PAGE_TYPE_CODE, "Not Acceptable");
        b(TTAdConstant.DOWNLOAD_APP_INFO_CODE, "Proxy Authentication Required");
        b(TTAdConstant.DOWNLOAD_URL_CODE, "Request Timeout");
        b(101, "Switching Protocols");
        b(Sdk$SDKError.b.AD_IS_LOADING_VALUE, "Non Authoritative Information");
        b(Sdk$SDKError.b.AD_IS_PLAYING_VALUE, "Reset Content");
        b(Sdk$SDKError.b.AD_ALREADY_FAILED_VALUE, "Partial Content");
        b(PglCryptUtils.BASE64_FAILED, "Gateway Timeout");
        b(PglCryptUtils.ENCRYPT_FAILED, "Http Version Not Supported");
        b(TTAdConstant.IMAGE_LIST_SIZE_CODE, "Gone");
        b(TTAdConstant.IMAGE_CODE, "Length Required");
        b(TTAdConstant.PACKAGE_NAME_CODE, "Requested Range Not Satisfiable");
        b(TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, "Expectation Failed");
        b(102, "Processing");
        b(Sdk$SDKError.b.PLACEMENT_AD_TYPE_MISMATCH_VALUE, "Multi-Status");
        b(HttpStatusCodes.STATUS_CODE_UNPROCESSABLE_ENTITY, "Unprocessable Entity");
        b(419, "Insufficient Space On Resource");
        b(420, "Method Failure");
        b(423, "Locked");
        b(PglCryptUtils.UNKNOWN_ERR, "Insufficient Storage");
        b(424, "Failed Dependency");
    }

    protected e() {
    }

    private static void b(int i10, String str) {
        int i11 = i10 / 100;
        f55691b[i11][i10 - (i11 * 100)] = str;
    }

    @Override // co.w
    public String a(int i10, Locale locale) {
        ip.a.a(i10 >= 100 && i10 < 600, "Unknown category for status code " + i10);
        int i11 = i10 / 100;
        int i12 = i10 - (i11 * 100);
        String[] strArr = f55691b[i11];
        if (strArr.length > i12) {
            return strArr[i12];
        }
        return null;
    }
}
