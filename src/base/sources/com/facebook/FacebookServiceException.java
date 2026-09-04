package com.facebook;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \f2\u00020\u0001:\u0001\u000eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/facebook/FacebookServiceException;", "Lcom/facebook/FacebookException;", "Lcom/facebook/x;", "requestError", "", "errorMessage", "<init>", "(Lcom/facebook/x;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "c", "Lcom/facebook/x;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "()Lcom/facebook/x;", "a", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FacebookServiceException extends FacebookException {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final x requestError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(x requestError, String str) {
        super(str);
        kotlin.jvm.internal.s.h(requestError, "requestError");
        this.requestError = requestError;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final x getRequestError() {
        return this.requestError;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public String toString() {
        String str = "{FacebookServiceException: httpResponseCode: " + this.requestError.g() + ", facebookErrorCode: " + this.requestError.b() + ", facebookErrorType: " + this.requestError.e() + ", message: " + this.requestError.c() + "}";
        kotlin.jvm.internal.s.g(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
