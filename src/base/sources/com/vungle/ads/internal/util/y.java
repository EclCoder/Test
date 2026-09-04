package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class y {
    public static final y INSTANCE = new y();
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());
    private static Executor uiExecutor;

    private y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runOnUiThread$lambda-0, reason: not valid java name */
    public static final void m180runOnUiThread$lambda0(tl.a tmp0) {
        kotlin.jvm.internal.s.h(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runOnUiThread$lambda-1, reason: not valid java name */
    public static final void m181runOnUiThread$lambda1(tl.a tmp0) {
        kotlin.jvm.internal.s.h(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final Executor getUiExecutor$vungle_ads_release() {
        return uiExecutor;
    }

    public final boolean isMainThread() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return mainLooper.isCurrentThread();
    }

    public final void runOnUiThread(final tl.a block) {
        kotlin.jvm.internal.s.h(block, "block");
        if (isMainThread()) {
            block.invoke();
            return;
        }
        Executor executor = uiExecutor;
        if (executor == null) {
            UI_HANDLER.post(new Runnable() { // from class: com.vungle.ads.internal.util.x
                @Override // java.lang.Runnable
                public final void run() {
                    y.m181runOnUiThread$lambda1(block);
                }
            });
        } else if (executor != null) {
            executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.w
                @Override // java.lang.Runnable
                public final void run() {
                    y.m180runOnUiThread$lambda0(block);
                }
            });
        }
    }

    public final void setUiExecutor$vungle_ads_release(Executor executor) {
        uiExecutor = executor;
    }

    public static /* synthetic */ void getUiExecutor$vungle_ads_release$annotations() {
    }
}
