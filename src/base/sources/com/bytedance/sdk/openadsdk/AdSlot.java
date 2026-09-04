package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.fc;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Map;
import org.json.JSONObject;
import w6.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class AdSlot {
    public static final int ANCHORED_BANNER = 2;
    public static final int FIX_BANNER = 1;
    public static final int INLINE_BANNER = 3;
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private int apu;
    private String aq;
    private int as;
    private int bug;
    private int dkl;
    private String dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private int f17do;
    private boolean dse;
    private int eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private String f13009fc;
    private float gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f13010hn;
    private String hnj;
    private String jip;
    private boolean mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private String f13011oj;
    private int ojm;
    private boolean orl;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private float f13012sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private String f13013ta;
    private int tgn;
    private boolean tu;
    private String uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private Map<String, Object> f13014vf;
    private int wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private String f13015xn;
    private long xyo;

    public static int getPosition(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return (i10 == 3 || i10 == 4 || i10 == 7 || i10 == 8) ? 5 : 3;
        }
        return 4;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", Sdk$SDKError.b.WEBVIEW_ERROR_VALUE);
            double dOptDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double dOptDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(iOptInt, iOptInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(dOptDouble).floatValue(), Double.valueOf(dOptDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
            builder.setBannerType(jSONObject.optInt("mBannerType"));
        } catch (Exception unused) {
        }
        AdSlot adSlotBuild = builder.build();
        adSlotBuild.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return adSlotBuild;
    }

    public int getAdCount() {
        return this.dkl;
    }

    public String getAdId() {
        return this.jip;
    }

    public int getBannerType() {
        return this.f17do;
    }

    public String getBidAdm() {
        return this.f13009fc;
    }

    public int getCacheScene() {
        return this.tgn;
    }

    public long getCacheTime() {
        return this.xyo;
    }

    public String getCodeId() {
        return this.hnj;
    }

    public String getCreativeId() {
        return this.uua;
    }

    public int getDurationSlotType() {
        return this.as;
    }

    public float getExpressViewAcceptedHeight() {
        return this.f13012sk;
    }

    public float getExpressViewAcceptedWidth() {
        return this.gjv;
    }

    public String getExt() {
        return this.f13011oj;
    }

    public int getImgAcceptedHeight() {
        return this.qor;
    }

    public int getImgAcceptedWidth() {
        return this.f13010hn;
    }

    public int getIsRotateBanner() {
        return this.apu;
    }

    public String getMediaExtra() {
        return this.f13013ta;
    }

    public Map<String, Object> getRequestExtraMap() {
        return this.f13014vf;
    }

    public int getRewardAmount() {
        return this.ojm;
    }

    public String getRewardName() {
        return this.aq;
    }

    public int getRotateOrder() {
        return this.wu;
    }

    public int getRotateTime() {
        return this.eum;
    }

    public String getUserData() {
        return this.f13015xn;
    }

    public String getUserID() {
        return this.dnm;
    }

    public boolean isAutoPlay() {
        return this.orl;
    }

    public boolean isExpressAd() {
        return this.mjg;
    }

    public boolean isPreload() {
        return this.tu;
    }

    public boolean isSupportDeepLink() {
        return this.dse;
    }

    public void setAdCount(int i10) {
        this.dkl = i10;
    }

    public void setCacheScene(int i10) {
        this.tgn = i10;
    }

    public void setCacheTime(long j10) {
        this.xyo = j10;
    }

    public void setDurationSlotType(int i10) {
        this.as = i10;
    }

    public void setExpressViewAccepted(float f10, float f11) {
        this.gjv = f10;
        this.f13012sk = f11;
    }

    public void setIsRotateBanner(int i10) {
        this.apu = i10;
    }

    public void setPreload(boolean z10) {
        this.tu = z10;
    }

    public void setRotateOrder(int i10) {
        this.wu = i10;
    }

    public void setRotateTime(int i10) {
        this.eum = i10;
    }

    public void setUserData(String str) {
        this.f13015xn = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.hnj);
            jSONObject.put("mAdCount", this.dkl);
            jSONObject.put("mIsAutoPlay", this.orl);
            jSONObject.put("mImgAcceptedWidth", this.f13010hn);
            jSONObject.put("mImgAcceptedHeight", this.qor);
            jSONObject.put("mExpressViewAcceptedWidth", this.gjv);
            jSONObject.put("mExpressViewAcceptedHeight", this.f13012sk);
            jSONObject.put("mSupportDeepLink", this.dse);
            jSONObject.put("mRewardName", this.aq);
            jSONObject.put("mRewardAmount", this.ojm);
            jSONObject.put("mMediaExtra", this.f13013ta);
            jSONObject.put("mUserID", this.dnm);
            jSONObject.put("mNativeAdType", this.bug);
            jSONObject.put("mIsExpressAd", this.mjg);
            jSONObject.put("mAdId", this.jip);
            jSONObject.put("mCreativeId", this.uua);
            jSONObject.put("mExt", this.f13011oj);
            jSONObject.put("mBidAdm", this.f13009fc);
            jSONObject.put("mUserData", this.f13015xn);
            jSONObject.put("mDurationSlotType", this.as);
            jSONObject.put("mBannerType", this.f17do);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }

    private AdSlot() {
        this.orl = true;
        this.mjg = false;
        this.apu = 0;
        this.eum = 0;
        this.wu = 0;
        this.f17do = 1;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Builder {
        private String aq;
        private float bug;
        private float dnm;
        private int eum;

        /* JADX INFO: renamed from: fc, reason: collision with root package name */
        private String f13016fc;
        private String hnj;
        private String jip;
        private String mjg;

        /* JADX INFO: renamed from: oj, reason: collision with root package name */
        private String f13018oj;
        private boolean orl;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        private int f13020ta;
        private String uua;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private int f13017hn = 640;
        private int qor = Sdk$SDKError.b.WEBVIEW_ERROR_VALUE;
        private final boolean gjv = true;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private int f13019sk = 1;
        private final String dkl = "";
        private final int dse = 0;
        private String ojm = "defaultUser";

        /* JADX INFO: renamed from: xn, reason: collision with root package name */
        private boolean f13021xn = true;
        private Map<String, Object> apu = null;
        private int wu = 1;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.hnj = this.hnj;
            adSlot.dkl = this.f13019sk;
            adSlot.dse = true;
            adSlot.f13010hn = this.f13017hn;
            adSlot.qor = this.qor;
            float f10 = this.dnm;
            if (f10 <= 0.0f) {
                adSlot.gjv = this.f13017hn;
                adSlot.f13012sk = this.qor;
            } else {
                adSlot.gjv = f10;
                adSlot.f13012sk = this.bug;
            }
            adSlot.aq = "";
            adSlot.ojm = 0;
            adSlot.f13013ta = this.aq;
            adSlot.dnm = this.ojm;
            adSlot.bug = this.f13020ta;
            adSlot.orl = this.f13021xn;
            adSlot.mjg = this.orl;
            adSlot.f13009fc = this.mjg;
            adSlot.jip = this.f13016fc;
            adSlot.uua = this.jip;
            adSlot.f13011oj = this.uua;
            adSlot.f13015xn = this.f13018oj;
            adSlot.f13014vf = this.apu;
            adSlot.as = this.eum;
            adSlot.f17do = this.wu;
            return adSlot;
        }

        public Builder isExpressAd(boolean z10) {
            this.orl = z10;
            return this;
        }

        public Builder setAdCount(int i10) {
            if (i10 <= 0) {
                i10 = 1;
            }
            if (i10 > 20) {
                i10 = 20;
            }
            this.f13019sk = i10;
            return this;
        }

        public Builder setAdId(String str) {
            this.f13016fc = str;
            return this;
        }

        public Builder setBannerType(int i10) {
            this.wu = i10;
            return this;
        }

        public Builder setCodeId(String str) {
            this.hnj = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.jip = str;
            return this;
        }

        public Builder setDurationSlotType(int i10) {
            this.eum = i10;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f10, float f11) {
            this.dnm = f10;
            this.bug = f11;
            return this;
        }

        public Builder setExt(String str) {
            this.uua = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i10, int i11) {
            this.f13017hn = i10;
            this.qor = i11;
            return this;
        }

        public Builder setIsAutoPlay(boolean z10) {
            this.f13021xn = z10;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.aq = str;
            return this;
        }

        public Builder setNativeAdType(int i10) {
            this.f13020ta = i10;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.apu = map;
            return this;
        }

        public Builder setUserData(String str) {
            this.f13018oj = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.ojm = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (fc.qor()) {
                b.a(str);
            }
            this.mjg = str;
            return this;
        }

        public Builder setRewardAmount(int i10) {
            return this;
        }

        public Builder setRewardName(String str) {
            return this;
        }

        public Builder setSupportDeepLink(boolean z10) {
            return this;
        }
    }
}
