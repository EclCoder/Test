package com.bytedance.sdk.component.embedapplog;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class PangleEncryptConstant {
    public static final int DECRYPT = 2;
    public static final int ENCRYPT = 1;
    public static final int REASON_BASE64 = 3;
    public static final int REASON_CRYPT = 2;
    public static final int REASON_GZIP = 1;
    public static final int REASON_PARAMS_ERROR = 4;
    public static final int REASON_SO_LOAD_FAIL = 6;
    public static final int UNKNOWN = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    public enum CryptDataScene {
        UNKNOWN(0),
        SETTINGS(1),
        GET_ADS(2),
        APP_LOG(3),
        STATS_LOG(4),
        REWARD_VERIFY(5),
        DISLIKE(6),
        BIDDING_TOKEN(7),
        DUAL_EVENT(8),
        STRATEGY(9),
        REGISTER_STATUS(10),
        COMPLIANCE_STATUS(11);

        private final int value;

        CryptDataScene(int i10) {
            this.value = i10;
        }

        public int value() {
            return this.value;
        }
    }
}
