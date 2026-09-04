package com.mbridge.msdk.mbnative.service;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.mbnative.controller.d;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NativeController f31565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f31566b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.mbnative.listener.a f31567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f31568d;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.service.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0419a implements Runnable {
        RunnableC0419a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f();
        }
    }

    public a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f31567c.onAdLoadError("current request is loading");
        this.f31567c.b();
    }

    public static void preload(Map<String, Object> map, int i10) {
        q0.c("NativeProvider", "native provider preload");
        new d().a(map, i10);
    }

    public void b(View view, Campaign campaign) {
        q0.c("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f31565a;
        if (nativeController == null) {
            return;
        }
        nativeController.b(campaign, view);
    }

    public String c() {
        NativeController nativeController = this.f31565a;
        return nativeController != null ? nativeController.g() : "";
    }

    public void d() {
        a(0, "");
    }

    public void e() {
        a(1, "");
    }

    public void g() {
        try {
            this.f31565a.i();
        } catch (Exception unused) {
            q0.b("NativeProvider", "release failed");
        }
    }

    public void a(com.mbridge.msdk.mbnative.listener.a aVar) {
        this.f31567c = aVar;
    }

    public a(com.mbridge.msdk.mbnative.listener.a aVar, NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f31567c = aVar;
        this.f31568d = nativeTrackingListener;
    }

    public void a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f31568d = nativeTrackingListener;
    }

    public void a(Context context, Resources resources, Map<String, Object> map) {
        this.f31565a = new NativeController(this.f31567c, this.f31568d, map, context);
    }

    public void b(View view, List<View> list, Campaign campaign) {
        q0.c("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f31565a;
        if (nativeController == null) {
            return;
        }
        nativeController.b(campaign, view, list);
    }

    public void a(String str) {
        a(0, str);
    }

    public void a() {
        try {
            this.f31565a.d();
        } catch (Exception unused) {
            q0.b("NativeProvider", "clear cache failed");
        }
    }

    public String b() {
        NativeController nativeController = this.f31565a;
        if (nativeController != null) {
            return nativeController.e();
        }
        return "";
    }

    public void a(View view, List<View> list, Campaign campaign) {
        NativeController nativeController = this.f31565a;
        if (nativeController == null) {
            return;
        }
        nativeController.a(campaign, view, list);
    }

    public void a(View view, Campaign campaign) {
        q0.c("NativeProvider", "native provider registerView");
        NativeController nativeController = this.f31565a;
        if (nativeController == null) {
            return;
        }
        nativeController.a(campaign, view);
    }

    private void a(int i10, String str) {
        if (this.f31565a != null) {
            com.mbridge.msdk.mbnative.listener.a aVar = this.f31567c;
            if (aVar != null && aVar.a()) {
                if (v0.h()) {
                    f();
                    return;
                } else {
                    this.f31566b.post(new RunnableC0419a());
                    return;
                }
            }
            com.mbridge.msdk.mbnative.listener.a aVar2 = this.f31567c;
            if (aVar2 != null) {
                aVar2.b();
            }
            this.f31565a.a(i10, str);
        }
    }
}
