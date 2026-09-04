package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class PAGRequest {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Map<String, Object> f13219hn;
    private String hnj;
    private Bundle qor = null;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.qor == null) {
            this.qor = new Bundle();
        }
        this.qor.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.hnj;
    }

    public Map<String, Object> getExtraInfo() {
        return this.f13219hn;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.qor;
    }

    public void setAdString(String str) {
        this.hnj = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.f13219hn = map;
    }
}
