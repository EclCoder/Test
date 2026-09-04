package com.mbridge.msdk.timer;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: com.mbridge.msdk.timer.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class C0462b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static b f33702a = new b();
    }

    public static b getInstance() {
        return C0462b.f33702a;
    }

    public void addInterstitialList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().a(str, str2);
        } catch (Exception e10) {
            q0.b("TimerController", "addInterstitialList error:" + e10.getMessage());
        }
    }

    public void addRewardList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().b(str, str2);
        } catch (Exception e10) {
            q0.b("TimerController", "addRewardList error:" + e10.getMessage());
        }
    }

    public void start() {
        g gVarF = h.b().f(c.n().b());
        if (gVarF == null) {
            gVarF = h.b().a();
        }
        int iH = gVarF.h();
        if (iH > 0) {
            com.mbridge.msdk.timer.a.a().b(iH * 1000);
        }
    }

    private b() {
    }
}
