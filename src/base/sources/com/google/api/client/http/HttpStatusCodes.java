package com.google.api.client.http;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class HttpStatusCodes {
    public static final int STATUS_CODE_ACCEPTED = 202;
    public static final int STATUS_CODE_BAD_GATEWAY = 502;
    public static final int STATUS_CODE_BAD_REQUEST = 400;
    public static final int STATUS_CODE_CONFLICT = 409;
    public static final int STATUS_CODE_CREATED = 201;
    public static final int STATUS_CODE_FORBIDDEN = 403;
    public static final int STATUS_CODE_FOUND = 302;
    public static final int STATUS_CODE_METHOD_NOT_ALLOWED = 405;
    public static final int STATUS_CODE_MOVED_PERMANENTLY = 301;
    public static final int STATUS_CODE_MULTIPLE_CHOICES = 300;
    public static final int STATUS_CODE_NOT_FOUND = 404;
    public static final int STATUS_CODE_NOT_MODIFIED = 304;
    public static final int STATUS_CODE_NO_CONTENT = 204;
    public static final int STATUS_CODE_OK = 200;
    private static final int STATUS_CODE_PERMANENT_REDIRECT = 308;
    public static final int STATUS_CODE_PRECONDITION_FAILED = 412;
    public static final int STATUS_CODE_SEE_OTHER = 303;
    public static final int STATUS_CODE_SERVER_ERROR = 500;
    public static final int STATUS_CODE_SERVICE_UNAVAILABLE = 503;
    public static final int STATUS_CODE_TEMPORARY_REDIRECT = 307;
    public static final int STATUS_CODE_UNAUTHORIZED = 401;
    public static final int STATUS_CODE_UNPROCESSABLE_ENTITY = 422;

    public static boolean isRedirect(int i10) {
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case 301:
            case 302:
            case STATUS_CODE_SEE_OTHER /* 303 */:
                return true;
            default:
                return false;
        }
    }

    public static boolean isSuccess(int i10) {
        return i10 >= 200 && i10 < 300;
    }
}
