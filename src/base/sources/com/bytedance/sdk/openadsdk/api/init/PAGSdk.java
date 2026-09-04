package com.bytedance.sdk.openadsdk.api.init;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.dse.gjv;
import com.bytedance.sdk.component.aq.hn.qor;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.aq.hnj;
import com.bytedance.sdk.openadsdk.common.dkl;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.gm;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ojm;
import com.bytedance.sdk.openadsdk.utils.ua;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class PAGSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface PAGInitCallback {
        void fail(int i10, String str);

        void success();
    }

    static {
        hnj.hnj();
    }

    public static void addPAGInitCallback(PAGInitCallback pAGInitCallback) {
        if (pAGInitCallback != null && fc.gjv() == 0) {
            hnj.hnj.add(pAGInitCallback);
        }
    }

    public static void closeMultiWebViewFileLock() {
        com.bytedance.sdk.openadsdk.xn.hnj.hnj();
    }

    public static void getBiddingToken(final Context context, final PAGBiddingRequest pAGBiddingRequest, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (dkl.hnj()) {
            biddingTokenCallback.onBiddingTokenCollected("");
        } else {
            ua.gjv(new qor("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2
                @Override // java.lang.Runnable
                public void run() {
                    oj.hn(context);
                    hnj.hnj(pAGBiddingRequest, new PAGBidCallback() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2.1
                        @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
                        public void onBiddingTokenCollected(String str) {
                            biddingTokenCallback.onBiddingTokenCollected(str);
                        }

                        @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
                        public void onBiddingTokenFailed(PAGBidError pAGBidError) {
                            biddingTokenCallback.onBiddingTokenCollected("");
                        }
                    });
                    com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hnj(false);
                }
            });
        }
    }

    public static String getSDKVersion() {
        return gm.hnj() != null ? gm.hnj().qor() : "";
    }

    public static void init(final Context context, final PAGConfig pAGConfig, final PAGInitCallback pAGInitCallback) {
        fc.hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.1
            @Override // java.lang.Runnable
            public void run() {
                hnj.hnj(context, pAGConfig, pAGInitCallback);
            }
        });
        fc.dse();
    }

    public static boolean isInitSuccess() {
        return fc.gjv() == 1;
    }

    public static void setAabPackageName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        wu.hnj(str);
        gjv.hnj(str);
    }

    public static void setAdRevenue(JSONObject jSONObject) {
        if (jSONObject != null && oj.gjv().oj() && isInitSuccess()) {
            com.bytedance.sdk.openadsdk.jip.gjv.hnj().hnj(jSONObject);
        }
    }

    private static void setSdkDisable(boolean z10) {
        dkl.hnj(z10);
    }

    public static void getBiddingToken(final Context context, final PAGBiddingRequest pAGBiddingRequest, final PAGBidCallback pAGBidCallback) {
        if (pAGBidCallback == null) {
            return;
        }
        if (dkl.hnj()) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10009, ojm.hnj(10009)));
        } else {
            ua.gjv(new qor("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.3
                @Override // java.lang.Runnable
                public void run() {
                    oj.hn(context);
                    hnj.hnj(pAGBiddingRequest, pAGBidCallback);
                    com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hnj(false);
                }
            });
        }
    }
}
