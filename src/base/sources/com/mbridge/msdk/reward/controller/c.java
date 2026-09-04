package com.mbridge.msdk.reward.controller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32330b;

    public c(Context context, String str) {
        this.f32329a = context;
        this.f32330b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListC;
        if (this.f32329a == null || TextUtils.isEmpty(this.f32330b)) {
            return;
        }
        try {
            com.mbridge.msdk.reward.report.a.a(this.f32329a, this.f32330b);
            o0.a();
            o0.a(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_RES));
            o0.a(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML));
            com.mbridge.msdk.videocommon.setting.b.b().b(this.f32330b);
            if (s0.a().a("c_d_v_w_i", false) || TextUtils.isEmpty(this.f32330b) || (copyOnWriteArrayListC = com.mbridge.msdk.videocommon.cache.a.a().c(this.f32330b, 1)) == null || copyOnWriteArrayListC.size() <= 0) {
                return;
            }
            com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f32329a, this.f32330b, copyOnWriteArrayListC, 94, (com.mbridge.msdk.videocommon.listener.a) null);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoControllerInitTask", "initRewardVideoController task ", e10);
            }
        }
    }
}
