package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0016\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\"\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010%\u0082\u00013&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWX¨\u0006Y"}, d2 = {"Lcom/vungle/ads/VungleError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$b;", "loggableReason", "", "errorMessage", "<init>", "(Lcom/vungle/ads/internal/protos/Sdk$SDKError$b;Ljava/lang/String;)V", "getLocalizedMessage", "()Ljava/lang/String;", "logError$vungle_ads_release", "()Lcom/vungle/ads/VungleError;", "logError", "Lfl/g0;", "logErrorNoReturnValue$vungle_ads_release", "()V", "logErrorNoReturnValue", "Lcom/vungle/ads/internal/util/p;", "logEntry", "setLogEntry$vungle_ads_release", "(Lcom/vungle/ads/internal/util/p;)Lcom/vungle/ads/VungleError;", "setLogEntry", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$b;", "Ljava/lang/String;", "getErrorMessage", "code", "I", "getCode", "Lcom/vungle/ads/internal/util/p;", "Lcom/vungle/ads/APIFailedStatusCodeError;", "Lcom/vungle/ads/AdCantPlayWithoutWebView;", "Lcom/vungle/ads/AdExpiredError;", "Lcom/vungle/ads/AdExpiredOnPlayError;", "Lcom/vungle/ads/AdMarkupInvalidError;", "Lcom/vungle/ads/AdMarkupJsonError;", "Lcom/vungle/ads/AdNotLoadedCantPlay;", "Lcom/vungle/ads/AdPayloadError;", "Lcom/vungle/ads/AdResponseEmptyError;", "Lcom/vungle/ads/AdRetryActiveError;", "Lcom/vungle/ads/AdRetryError;", "Lcom/vungle/ads/AssetFailedToDeleteError;", "Lcom/vungle/ads/AssetRequestError;", "Lcom/vungle/ads/AssetWriteError;", "Lcom/vungle/ads/ConcurrentPlaybackUnsupported;", "Lcom/vungle/ads/EmptyBidPayloadError;", "Lcom/vungle/ads/EvaluateJsError;", "Lcom/vungle/ads/GzipEncodeError;", "Lcom/vungle/ads/IndexHtmlError;", "Lcom/vungle/ads/InvalidAdStateError;", "Lcom/vungle/ads/InvalidAppId;", "Lcom/vungle/ads/InvalidAssetUrlError;", "Lcom/vungle/ads/InvalidBannerSizeError;", "Lcom/vungle/ads/InvalidBidPayloadError;", "Lcom/vungle/ads/InvalidCSBDataError;", "Lcom/vungle/ads/InvalidCTAUrl;", "Lcom/vungle/ads/InvalidEndpointError;", "Lcom/vungle/ads/InvalidEventIdError;", "Lcom/vungle/ads/InvalidTemplateURLError;", "Lcom/vungle/ads/JsonEncodeError;", "Lcom/vungle/ads/LinkError;", "Lcom/vungle/ads/MraidTemplateError;", "Lcom/vungle/ads/NativeAssetError;", "Lcom/vungle/ads/NativeVideoPlaybackError;", "Lcom/vungle/ads/NetworkTimeoutError;", "Lcom/vungle/ads/NetworkUnreachable;", "Lcom/vungle/ads/NoSpaceError;", "Lcom/vungle/ads/OmSdkJsError;", "Lcom/vungle/ads/OutOfMemory;", "Lcom/vungle/ads/PlacementAdTypeMismatchError;", "Lcom/vungle/ads/PlacementMismatchError;", "Lcom/vungle/ads/PlacementNotFoundError;", "Lcom/vungle/ads/PrivacyIconFallbackError;", "Lcom/vungle/ads/PrivacyUrlError;", "Lcom/vungle/ads/SdkNotInitialized;", "Lcom/vungle/ads/SdkVersionTooLow;", "Lcom/vungle/ads/TpatError;", "Lcom/vungle/ads/UserAgentError;", "Lcom/vungle/ads/WebViewError;", "Lcom/vungle/ads/WebViewRenderProcessUnresponsive;", "Lcom/vungle/ads/WebViewRenderingProcessGone;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class VungleError extends Exception {
    private final int code;
    private final String errorMessage;
    private com.vungle.ads.internal.util.p logEntry;
    private final Sdk$SDKError.b loggableReason;

    public /* synthetic */ VungleError(Sdk$SDKError.b bVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, str);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.s.c(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.s.f(other, "null cannot be cast to non-null type com.vungle.ads.VungleError");
        VungleError vungleError = (VungleError) other;
        return this.loggableReason == vungleError.loggableReason && kotlin.jvm.internal.s.c(this.errorMessage, vungleError.errorMessage) && kotlin.jvm.internal.s.c(this.logEntry, vungleError.logEntry);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        int iHashCode = ((this.loggableReason.hashCode() * 31) + this.errorMessage.hashCode()) * 31;
        com.vungle.ads.internal.util.p pVar = this.logEntry;
        return iHashCode + (pVar != null ? pVar.hashCode() : 0);
    }

    public final VungleError logError$vungle_ads_release() {
        logErrorNoReturnValue$vungle_ads_release();
        return this;
    }

    public final void logErrorNoReturnValue$vungle_ads_release() {
        g.INSTANCE.logError$vungle_ads_release(this.loggableReason, this.errorMessage, this.logEntry);
    }

    public final VungleError setLogEntry$vungle_ads_release(com.vungle.ads.internal.util.p logEntry) {
        this.logEntry = logEntry;
        return this;
    }

    private VungleError(Sdk$SDKError.b bVar, String str) {
        super(str);
        this.loggableReason = bVar;
        this.errorMessage = str;
        this.code = bVar.getNumber();
    }
}
