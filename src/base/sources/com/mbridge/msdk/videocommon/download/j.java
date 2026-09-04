package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicBoolean f35129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f35130b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final j f35131a = new j();
    }

    public static j a() {
        return b.f35131a;
    }

    public boolean b(int i10) {
        if (MBridgeConstans.DEBUG) {
            q0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i10 + ", key: REWARD_VIDEO_REFACTOR_FOR_LOAD");
        }
        if (i10 != 94 && i10 != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f35129a;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f35129a = new AtomicBoolean(s0.a().a("r_v_r_f_l", false));
        } catch (Exception e10) {
            this.f35129a = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e10.getMessage());
            }
        }
        return this.f35129a.get();
    }

    private j() {
    }

    public boolean a(int i10) {
        if (MBridgeConstans.DEBUG) {
            q0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i10 + ", key: REWARD_VIDEO_REFACTOR_FOR_CAMPAIGN_REQUEST");
        }
        if (i10 != 94 && i10 != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f35130b;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f35130b = new AtomicBoolean(s0.a().a("r_v_r_f_c_r", false));
        } catch (Exception e10) {
            this.f35130b = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e10.getMessage());
            }
        }
        return this.f35130b.get();
    }
}
