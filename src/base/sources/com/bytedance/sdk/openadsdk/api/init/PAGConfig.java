package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bytedance.sdk.component.dse.qor.qor;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.fc;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.core.gm;
import com.bytedance.sdk.openadsdk.utils.orp;
import w6.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class PAGConfig implements InitConfig {
    private static String dse;
    private String aq;
    private String dkl;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private boolean f13223hn;
    private String hnj;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private String f13224sk;
    private int qor = -1;
    private int gjv = 0;

    public static void debugLog(boolean z10) {
        if (gm.hnj() != null) {
            if (z10) {
                gm.hnj().hn(1);
                gm.hnj().hn();
                return;
            }
            gm.hnj().hn(0);
            qor.hnj(qor.hnj.OFF);
            fc.hn();
            d.a();
            apu.hn();
        }
    }

    public static int getPAConsent() {
        if (orp.ojm("getPAConsent")) {
            return gm.hnj().sk();
        }
        return -1;
    }

    public static void setAppIconId(int i10) {
        if (gm.hnj() != null) {
            gm.hnj().qor(i10);
        }
    }

    public static void setPAConsent(int i10) {
        if (orp.ojm("setPAConsent")) {
            if (i10 == 1 || i10 == 0) {
                gm.hnj().gjv(i10);
            } else {
                gm.hnj().gjv(-2);
            }
        }
    }

    public static void setPackageName(String str) {
        dse = str;
    }

    public static void setUserData(String str) {
        if (gm.hnj() != null) {
            gm.hnj().hn(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAdxId() {
        return this.aq;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.hnj;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.dkl;
    }

    public boolean getDebugLog() {
        return this.f13223hn;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getPA() {
        return this.qor;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        return TextUtils.isEmpty(this.f13224sk) ? dse : this.f13224sk;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.gjv;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gjv(String str) {
        this.aq = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor(String str) {
        this.f13224sk = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(String str) {
        this.hnj = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(int i10) {
        this.gjv = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(String str) {
        this.dkl = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(boolean z10) {
        this.f13223hn = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(int i10) {
        this.qor = i10;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Builder {
        private String dkl;
        private String dse;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private boolean f13225hn;
        private String hnj;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private String[] f13226sk;
        private int qor = -1;
        private int gjv = 0;
        private String aq = "";

        public Builder appId(String str) {
            this.hnj = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.hn(this.hnj);
            pAGConfig.hn(this.gjv);
            pAGConfig.hnj(this.qor);
            pAGConfig.hnj(this.f13225hn);
            pAGConfig.qor(this.dkl);
            pAGConfig.hnj(this.dse);
            pAGConfig.gjv(this.aq);
            return pAGConfig;
        }

        public Builder debugLog(boolean z10) {
            this.f13225hn = z10;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.f13226sk = strArr;
            return this;
        }

        public Builder setAdxId(String str) {
            this.aq = str;
            return this;
        }

        public Builder setPAConsent(int i10) {
            if (i10 == 0 || i10 == 1) {
                this.qor = i10;
                return this;
            }
            this.qor = -2;
            return this;
        }

        public Builder setPackageName(String str) {
            this.dkl = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.dse = str;
            return this;
        }

        public Builder titleBarTheme(int i10) {
            this.gjv = i10;
            return this;
        }

        @Deprecated
        public Builder appIcon(int i10) {
            return this;
        }

        public Builder supportMultiProcess(boolean z10) {
            return this;
        }

        public Builder useTextureView(boolean z10) {
            return this;
        }
    }
}
