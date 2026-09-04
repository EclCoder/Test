package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class PglSSConfig {
    public static final int COLLECT_MODE_DEFAULT = 0;
    public static final int COLLECT_MODE_ML_MINIMIZE = 1;
    public static final String CUSTOMINFO_KEY_ALLOWED_FIELDS = "fields_allowed";
    public static final String CUSTOMINFO_KEY_CHECKCLAZZ = "check_clz";
    public static final String CUSTOMINFO_KEY_IPV6 = "key_ipv6";
    public static final String CUSTOMINFO_KEY_SEC_CONFIG_STR = "sec_config";
    public static final String CUSTOMINFO_KEY_TARGET_IDC = "target-idc";
    public static final String CUSTOMINFO_KEY_TRANSFER_HOST = "key_transfer_host";
    public static final int OVREGION_TYPE_SG = 2;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f35376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f35378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PglSSCallBack f35379f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f35381b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35382c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f35383d;

        public PglSSConfig build() {
            if (TextUtils.isEmpty(this.f35380a)) {
                return null;
            }
            return new PglSSConfig(this.f35380a, this.f35381b, this.f35382c, this.f35383d);
        }

        public Builder setAdsdkVersion(String str) {
            this.f35383d = str;
            return this;
        }

        public Builder setAppId(String str) {
            this.f35380a = str;
            return this;
        }

        public Builder setCollectMode(int i10) {
            this.f35382c = i10;
            return this;
        }

        public Builder setOVRegionType(int i10) {
            this.f35381b = i10;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAdSdkVersion() {
        return this.f35377d;
    }

    public String getAppId() {
        return this.f35374a;
    }

    public PglSSCallBack getCallBack() {
        return this.f35379f;
    }

    public int getCollectMode() {
        return this.f35376c;
    }

    public Map<String, Object> getCustomInfo() {
        return this.f35378e;
    }

    public int getOVRegionType() {
        return this.f35375b;
    }

    public void setCallBack(PglSSCallBack pglSSCallBack) {
        this.f35379f = pglSSCallBack;
    }

    public void setCustomInfo(Map<String, Object> map) {
        this.f35378e = map;
    }

    private PglSSConfig(String str, int i10, int i11, String str2) {
        this.f35374a = str;
        this.f35375b = i10;
        this.f35376c = i11;
        this.f35377d = str2;
    }
}
