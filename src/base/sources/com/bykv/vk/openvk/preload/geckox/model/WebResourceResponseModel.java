package com.bykv.vk.openvk.preload.geckox.model;

import android.webkit.WebResourceResponse;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class WebResourceResponseModel {
    public static final int ERROR_DEFAULT = -1;
    public static final int ERROR_INTERCEPT = 1;
    public static final int ERROR_NOT_FIND_BY_RESOURCE = 2;
    int errorType;
    WebResourceResponse webResourceResponse;

    public WebResourceResponseModel(int i10, WebResourceResponse webResourceResponse) {
        this.errorType = i10;
        this.webResourceResponse = webResourceResponse;
    }

    public int getMsg() {
        return this.errorType;
    }

    public WebResourceResponse getWebResourceResponse() {
        return this.webResourceResponse;
    }

    public void setMsg(int i10) {
        this.errorType = i10;
    }

    public void setWebResourceResponse(WebResourceResponse webResourceResponse) {
        this.webResourceResponse = webResourceResponse;
    }
}
