package com.mbridge.msdk.activity;

import android.os.Build;
import android.os.Bundle;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBCommonActivity extends DomainMBCommonActivity {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f28098e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28099d = false;

    @Override // android.app.Activity
    public void finish() {
        BrowserView browserView = this.browserView;
        if (browserView != null) {
            browserView.setListener(null);
            this.browserView.destroy();
        }
        BrowserView browserViewRemove = b.f31054a.remove(this.f28085a);
        if (browserViewRemove != null) {
            browserViewRemove.setListener(null);
            browserViewRemove.destroy();
        }
        this.f28099d = true;
        super.finish();
    }

    @Override // com.mbridge.msdk.activity.DomainMBCommonActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.f28099d) {
            return;
        }
        BrowserView browserView = this.browserView;
        if (browserView != null) {
            browserView.setListener(null);
            this.browserView.destroy();
        }
        BrowserView browserViewRemove = b.f31054a.remove(this.f28085a);
        if (browserViewRemove != null) {
            browserViewRemove.setListener(null);
            browserViewRemove.destroy();
        }
    }
}
