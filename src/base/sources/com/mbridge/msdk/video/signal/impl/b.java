package com.mbridge.msdk.video.signal.impl;

import android.content.res.Configuration;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b implements com.mbridge.msdk.video.signal.b {
    @Override // com.mbridge.msdk.video.signal.b
    public void a(Configuration configuration) {
        q0.a("DefaultJSActivity", "DefaultJSActivity-onConfigurationChanged:" + configuration.orientation);
    }

    @Override // com.mbridge.msdk.video.signal.b
    public void b() {
        q0.a("DefaultJSActivity", "DefaultJSActivity-onDestory");
    }

    @Override // com.mbridge.msdk.video.signal.b
    public void c() {
        q0.a("DefaultJSActivity", "DefaultJSActivity-onStop");
    }

    @Override // com.mbridge.msdk.video.signal.b
    public void d() {
        q0.a("DefaultJSActivity", "DefaultJSActivity-onResume");
    }

    @Override // com.mbridge.msdk.video.signal.b
    public void e() {
        q0.a("DefaultJSActivity", "DefaultJSActivity-onBackPressed");
    }

    @Override // com.mbridge.msdk.video.signal.b
    public void f() {
        q0.a("DefaultJSActivity", "DefaultJSActivity-onRestart");
    }

    @Override // com.mbridge.msdk.video.signal.b
    public void g() {
        q0.a("DefaultJSActivity", "DefaultJSActivity-onPause");
    }

    @Override // com.mbridge.msdk.video.signal.b
    public void h() {
        q0.a("DefaultJSActivity", "DefaultJSActivity-onStart");
    }

    @Override // com.mbridge.msdk.video.signal.b
    public int a() {
        q0.a("DefaultJSActivity", "isSystemResume");
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.b
    public void a(int i10) {
        q0.a("DefaultJSActivity", "setSystemResume,isResume:" + i10);
    }
}
