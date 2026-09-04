package com.inmobi.sdk;

import com.inmobi.media.Zi;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/inmobi/sdk/SdkInitializationListener;", "", "Ljava/lang/Error;", "Lkotlin/Error;", "error", "Lfl/g0;", "onInitializationComplete", "(Ljava/lang/Error;)V", "Companion", "com/inmobi/media/Zi", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SdkInitializationListener {
    public static final Zi Companion = Zi.f26153a;
    public static final String INVALID_ACCOUNT_ID = "Account id cannot be empty. Please provide a valid account id.";
    public static final String INVALID_SITE_ID = "SiteId cannot be empty. Please provide a valid SiteId.";
    public static final String MISSING_CONTEXT = "Context cannot be null. Please provide a valid context object.";
    public static final String MISSING_REQUIRED_DEPENDENCIES = "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.";
    public static final String MISSING_WEBVIEW_DEPENDENCY = "SDK could not be initialized; Required WebView dependency could not be found.";
    public static final String UNKNOWN_ERROR = "SDK could not be initialized; an unexpected error was encountered.";

    void onInitializationComplete(Error error);
}
