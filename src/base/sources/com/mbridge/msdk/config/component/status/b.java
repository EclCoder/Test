package com.mbridge.msdk.config.component.status;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f29101a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29102b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29103c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29104d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f29105e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Handler f29106f = new Handler();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f29107g = new Runnable() { // from class: com.mbridge.msdk.config.component.status.g
        @Override // java.lang.Runnable
        public final void run() {
            this.f29126a.c();
        }
    };

    public b(Context context) {
        if (context == null) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a();
        b();
    }

    public void b(a aVar) {
        try {
            this.f29101a.remove(aVar);
        } catch (Throwable unused) {
            q0.b("LifecyclePublisher", "remove subscriber error");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        a("LifecycleChanged", "onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        a("LifecycleChanged", "onActivityDestroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f29103c--;
        a("LifecycleChanged", "onActivityPaused");
        if (this.f29103c == 0) {
            this.f29106f.postDelayed(this.f29107g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f29103c++;
        a("LifecycleChanged", "onActivityResumed");
        if (this.f29103c == 1) {
            if (!this.f29104d) {
                this.f29106f.removeCallbacks(this.f29107g);
            } else {
                a("916003", "");
                this.f29104d = false;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f29102b++;
        a("LifecycleChanged", "onActivityStarted");
        if (this.f29102b == 1 && this.f29105e) {
            this.f29105e = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.f29102b--;
        a("LifecycleChanged", "onActivityStopped");
        b();
    }

    public void a(a aVar) {
        try {
            this.f29101a.add(aVar);
        } catch (Throwable unused) {
            q0.b("LifecyclePublisher", "add subscriber error");
        }
    }

    private void b() {
        if (this.f29102b == 0 && this.f29104d) {
            a("916004", "");
            this.f29105e = true;
        }
    }

    private void a(com.mbridge.msdk.config.component.base.b bVar) {
        try {
            Iterator<a> it = this.f29101a.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable unused) {
            q0.b("LifecyclePublisher", "notifySubscriber error");
        }
    }

    private void a(String str, String str2) {
        com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
        bVar.b(str);
        HashMap map = new HashMap();
        map.put(com.mbridge.msdk.config.component.common.util.c.c(StatisticData.ERROR_CODE_NOT_FOUND), str2);
        bVar.a(map);
        a(bVar);
    }

    private void a() {
        if (this.f29103c == 0) {
            this.f29104d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
