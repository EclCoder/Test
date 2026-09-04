package com.mbridge.msdk.config.activity;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28512a = "ActivityPresenter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.activity.lifecycle.a f28513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f28514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28515d;

    public a(MBRewardVideoActivity mBRewardVideoActivity, ViewGroup viewGroup) {
        this.f28514c = viewGroup;
        a(mBRewardVideoActivity);
        if (mBRewardVideoActivity != null && mBRewardVideoActivity.getIntent() != null) {
            this.f28513b = (com.mbridge.msdk.config.activity.lifecycle.a) mBRewardVideoActivity.getIntent().getSerializableExtra("lifecycleCallbackByActivity");
            int intExtra = mBRewardVideoActivity.getIntent().getIntExtra("156", 1);
            this.f28515d = intExtra;
            mBRewardVideoActivity.setRequestedOrientation(intExtra);
        }
        a("onCreate");
    }

    public void a(String str) {
        if (this.f28513b == null) {
            return;
        }
        str.getClass();
        switch (str) {
            case "onDestroy":
                this.f28513b.f();
                break;
            case "onPause":
                this.f28513b.e();
                break;
            case "onStart":
                this.f28513b.onStart();
                break;
            case "onBackPressed":
                this.f28513b.c();
                break;
            case "onStop":
                this.f28513b.a();
                break;
            case "onCreate":
                this.f28513b.a(this.f28514c);
                break;
            case "onResume":
                this.f28513b.b();
                break;
        }
        q0.b("ActivityPresenter", "life " + str);
    }

    private void a(MBRewardVideoActivity mBRewardVideoActivity) {
        int iA;
        int iA2;
        int iA3;
        if (mBRewardVideoActivity == null || mBRewardVideoActivity.isFinishing() || mBRewardVideoActivity.getIntent() == null) {
            return;
        }
        Intent intent = mBRewardVideoActivity.getIntent();
        if (intent.getIntExtra("154", 0) != 1) {
            return;
        }
        try {
            int intExtra = mBRewardVideoActivity.getIntent().getIntExtra("157", 0);
            int intExtra2 = mBRewardVideoActivity.getIntent().getIntExtra("158", 0);
            int iG = v0.g(mBRewardVideoActivity);
            int iF = v0.f(mBRewardVideoActivity);
            if (intent.getIntExtra("155", 0) == 0 && (iA3 = c.a((Context) mBRewardVideoActivity)) > 0) {
                iF -= iA3;
            }
            if (intExtra <= 0 || intExtra2 <= 0) {
                iA = iG;
                iA2 = iF;
            } else {
                iA = v0.a(mBRewardVideoActivity, intExtra);
                iA2 = v0.a(mBRewardVideoActivity, intExtra2);
            }
            int iMin = Math.min(iA, iG);
            int iMin2 = Math.min(iA2, iF);
            ViewGroup.LayoutParams layoutParams = this.f28514c.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iMin, iMin2);
            } else {
                layoutParams.width = iMin;
                layoutParams.height = iMin2;
            }
            this.f28514c.setLayoutParams(layoutParams);
            this.f28514c.setX((iG - iMin) / 2.0f);
            this.f28514c.setY((iF - iMin2) / 2.0f);
        } catch (Exception e10) {
            q0.b("ActivityPresenter", e10.getMessage());
        }
    }
}
