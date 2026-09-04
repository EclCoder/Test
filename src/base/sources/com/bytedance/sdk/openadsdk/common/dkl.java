package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl {
    private static boolean hnj = false;

    public static void hnj(boolean z10) {
        hnj = z10;
    }

    public static ISDKTypeFactory hnj(PAGLoadListener pAGLoadListener) {
        if (hnj) {
            if (pAGLoadListener != null) {
                pAGLoadListener.onError(-1, PAGErrorCode.LOAD_SDK_DISABLE_MSG);
            }
            return null;
        }
        ISDKTypeFactory sdkTypeFactory = SDKTypeConfig.getSdkTypeFactory();
        if (sdkTypeFactory != null) {
            return sdkTypeFactory;
        }
        if (pAGLoadListener != null) {
            pAGLoadListener.onError(5000, PAGErrorCode.LOAD_FACTORY_NULL_MSG);
        }
        return null;
    }

    public static boolean hnj() {
        return hnj;
    }
}
