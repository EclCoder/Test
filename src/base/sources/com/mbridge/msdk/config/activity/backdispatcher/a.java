package com.mbridge.msdk.config.activity.backdispatcher;

import android.os.Build;
import android.util.Log;
import android.view.Window;
import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    OnBackInvokedCallback f28516a;

    public void a(Window window, final b bVar) {
        if (Build.VERSION.SDK_INT < 33 || window == null || bVar == null) {
            return;
        }
        try {
            this.f28516a = new OnBackInvokedCallback() { // from class: com.mbridge.msdk.config.activity.backdispatcher.c
                public final void onBackInvoked() {
                    bVar.a();
                }
            };
            window.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f28516a);
        } catch (Throwable unused) {
            Log.e("MBOnBackInvokedCallback", "registerOnBackInvokedCallback error");
        }
    }

    public void a(Window window) {
        if (Build.VERSION.SDK_INT < 33 || window == null) {
            return;
        }
        try {
            window.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f28516a);
            this.f28516a = null;
        } catch (Throwable unused) {
            Log.e("MBOnBackInvokedCallback", "unregisterOnBackInvokedCallback error");
        }
    }
}
