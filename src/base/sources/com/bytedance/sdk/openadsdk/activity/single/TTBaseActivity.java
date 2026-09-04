package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.utils.Cdo;
import com.bytedance.sdk.openadsdk.utils.xyo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class TTBaseActivity extends Activity {
    private OnBackInvokedCallback hnj;
    protected boolean ojm = false;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    protected String f13043ta;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj implements OnBackInvokedCallback {
        private final WeakReference<TTBaseActivity> hnj;

        hnj(TTBaseActivity tTBaseActivity) {
            this.hnj = new WeakReference<>(tTBaseActivity);
        }

        public void onBackInvoked() {
            TTBaseActivity tTBaseActivity = this.hnj.get();
            if (tTBaseActivity != null) {
                tTBaseActivity.hn();
            }
        }
    }

    protected void dse() {
        try {
            if (!xyo.hn() || Build.VERSION.SDK_INT < 29) {
                return;
            }
            getWindow().getDecorView().setForceDarkAllowed(false);
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    protected void hn() {
        onBackPressed();
    }

    protected boolean hnj() {
        return false;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (hnj() && Cdo.hnj()) {
            this.hnj = new hnj(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.hnj);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (!Cdo.hnj() || this.hnj == null) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.hnj);
        this.hnj = null;
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (Build.VERSION.SDK_INT < 33) {
            super.onPause();
            return;
        }
        try {
            try {
                super.onPause();
            } catch (Exception unused) {
            }
        } catch (IllegalArgumentException unused2) {
            Field declaredField = Activity.class.getDeclaredField("mCalled");
            declaredField.setAccessible(true);
            declaredField.set(this, Boolean.TRUE);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        if (Build.VERSION.SDK_INT > 28) {
            super.onResume();
            return;
        }
        try {
            super.onResume();
        } catch (IllegalArgumentException e10) {
            apu.hnj("TTBaseActivity", "super.onResume() run fail", e10);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e11) {
                apu.hnj("TTBaseActivity", "onResume set mCalled fail", e11);
            }
        }
    }

    public void qor(boolean z10) {
        this.ojm = z10;
    }
}
