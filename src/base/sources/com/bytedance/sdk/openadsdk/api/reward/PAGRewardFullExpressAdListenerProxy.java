package com.bytedance.sdk.openadsdk.api.reward;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class PAGRewardFullExpressAdListenerProxy implements PAGExpressAdWrapperListener {
    private final PAGExpressAdWrapperListener hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private boolean f13234hn = false;
    private final Handler qor = new Handler(Looper.getMainLooper());

    public PAGRewardFullExpressAdListenerProxy(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.hnj = pAGExpressAdWrapperListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.hnj;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdDismissed() {
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.hnj;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdShow(View view, int i10) {
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.hnj;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onAdShow(view, i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderFail(final View view, final String str, final int i10) {
        hn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy.2
            @Override // java.lang.Runnable
            public void run() {
                PAGRewardFullExpressAdListenerProxy.this.hnj.onRenderFail(view, str, i10);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderSuccess(final View view, final float f10, final float f11) {
        hn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy.3
            @Override // java.lang.Runnable
            public void run() {
                PAGRewardFullExpressAdListenerProxy.this.hnj.onRenderSuccess(view, f10, f11);
            }
        });
    }

    public void triggerUnfinishedFail(final View view) {
        hn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy.4
            @Override // java.lang.Runnable
            public void run() {
                PAGRewardFullExpressAdListenerProxy.this.hnj.onRenderFail(view, BackupConstant.UNFINISHED_FAIL_MSG, BackupConstant.UNFINISHED_FAIL_CODE);
            }
        });
    }

    private void hn(final Runnable runnable) {
        hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy.1
            @Override // java.lang.Runnable
            public void run() {
                if (!PAGRewardFullExpressAdListenerProxy.this.f13234hn && PAGRewardFullExpressAdListenerProxy.this.hnj != null) {
                    PAGRewardFullExpressAdListenerProxy.this.f13234hn = true;
                    runnable.run();
                } else {
                    Log.i("ExpressAdListenerProxy", "onRenderFail or onRenderSuccess has been called before mHasNotified = " + PAGRewardFullExpressAdListenerProxy.this.f13234hn);
                }
            }
        });
    }

    private void hnj(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.qor.post(runnable);
        }
    }
}
