package com.facebook;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/facebook/FacebookSdkNotInitializedException;", "Lcom/facebook/FacebookException;", "<init>", "()V", "", PglCryptUtils.KEY_MESSAGE, "(Ljava/lang/String;)V", "c", "a", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FacebookSdkNotInitializedException extends FacebookException {
    public static final long serialVersionUID = 1;

    public FacebookSdkNotInitializedException() {
    }

    public FacebookSdkNotInitializedException(String str) {
        super(str);
    }
}
