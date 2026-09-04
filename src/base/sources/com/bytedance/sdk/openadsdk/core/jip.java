package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class jip {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private boolean f13777hn;
    private final com.bytedance.sdk.openadsdk.utils.hnj hnj = new com.bytedance.sdk.openadsdk.utils.hnj();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj {
        private static final jip hnj = new jip();
    }

    public static jip hnj() {
        return hnj.hnj;
    }

    public boolean gjv() {
        return this.hnj.hnj();
    }

    public void hn() {
        try {
            Context contextHnj = oj.hnj();
            if (contextHnj instanceof Application) {
                ((Application) contextHnj).registerActivityLifecycleCallbacks(this.hnj);
                this.f13777hn = true;
            } else {
                if (contextHnj == null || contextHnj.getApplicationContext() == null) {
                    return;
                }
                ((Application) contextHnj.getApplicationContext()).registerActivityLifecycleCallbacks(this.hnj);
                this.f13777hn = true;
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th2);
        }
    }

    public boolean qor() {
        return this.f13777hn;
    }

    public com.bytedance.sdk.openadsdk.utils.hnj sk() {
        return this.hnj;
    }

    public boolean hnj(boolean z10) {
        return this.hnj.hnj(z10);
    }
}
