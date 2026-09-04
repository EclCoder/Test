package com.mbridge.msdk.config.activity;

import android.os.Bundle;
import android.view.ViewGroup;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBRewardVideoActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ViewGroup f28511b;

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.mbridge.msdk.config.activity.BaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(i0.a(getApplicationContext(), "mbridge_activity", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
        this.f28511b = viewGroup;
        setContentView(viewGroup);
        this.f28510a = new a(this, this.f28511b);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
