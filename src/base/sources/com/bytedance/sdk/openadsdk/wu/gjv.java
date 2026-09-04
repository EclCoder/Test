package com.bytedance.sdk.openadsdk.wu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public enum gjv {
    TYPE_2G("2g"),
    TYPE_3G("3g"),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI("wifi"),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN("unknown");

    private String aq;

    gjv(String str) {
        this.aq = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.aq;
    }
}
