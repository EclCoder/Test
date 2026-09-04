package com.bytedance.sdk.openadsdk.core.orl.hnj;

import com.google.api.client.http.HttpStatusCodes;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public enum hnj {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(HttpStatusCodes.STATUS_CODE_SEE_OTHER),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE),
    UNDEFINED_ERROR(900);

    private final int aq;

    hnj(int i10) {
        this.aq = i10;
    }

    public String hnj() {
        return String.valueOf(this.aq);
    }
}
