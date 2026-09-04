package com.inmobi.unification.sdk;

import com.inmobi.media.C3090ka;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0087\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/inmobi/unification/sdk/InitializationStatus;", "", "<init>", "()V", "Companion", "com/inmobi/media/ka", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public @interface InitializationStatus {
    public static final C3090ka Companion = C3090ka.f26853a;
    public static final String INVALID_ACCOUNT_ID = "Account id cannot be empty. Please provide a valid account id.";
    public static final String INVALID_SITE_ID = "SiteId cannot be empty. Please provide a valid SiteId.";
    public static final String MISSING_REQUIRED_DEPENDENCIES = "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.";
    public static final String SUCCESS = "Success";
    public static final String UNKNOWN_ERROR = "SDK could not be initialized; an unexpected error was encountered.";
}
