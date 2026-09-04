package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.openadsdk.oj.hn;
import com.bytedance.sdk.openadsdk.oj.hn.hnj;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class BusMonitorDependWrapper implements hn {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Handler f13028hn;
    private hn hnj;

    public BusMonitorDependWrapper(hn hnVar) {
        this.hnj = hnVar;
    }

    public static Context getReflectContext() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            return (Application) objInvoke.getClass().getMethod("getApplication", null).invoke(objInvoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.oj.hn
    public Context getContext() {
        hn hnVar = this.hnj;
        return (hnVar == null || hnVar.getContext() == null) ? getReflectContext() : this.hnj.getContext();
    }

    @Override // com.bytedance.sdk.openadsdk.oj.hn
    public Handler getHandler() {
        hn hnVar = this.hnj;
        if (hnVar != null && hnVar.getHandler() != null) {
            return this.hnj.getHandler();
        }
        if (this.f13028hn == null) {
            this.f13028hn = new Handler(getSafeHandlerThread("pag_monitor", 0).getLooper());
        }
        return this.f13028hn;
    }

    @Override // com.bytedance.sdk.openadsdk.oj.hn
    public int getOnceLogCount() {
        hn hnVar = this.hnj;
        if (hnVar != null) {
            return hnVar.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.oj.hn
    public int getOnceLogInterval() {
        hn hnVar = this.hnj;
        if (hnVar != null) {
            return hnVar.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.oj.hn
    public HandlerThread getSafeHandlerThread(String str, int i10) {
        HandlerThread safeHandlerThread;
        hn hnVar = this.hnj;
        if (hnVar != null && (safeHandlerThread = hnVar.getSafeHandlerThread(str, i10)) != null) {
            return safeHandlerThread;
        }
        HandlerThread handlerThread = new HandlerThread("pag_monitor");
        handlerThread.start();
        return handlerThread;
    }

    @Override // com.bytedance.sdk.openadsdk.oj.hn
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        hn hnVar = this.hnj;
        if (hnVar == null || (uploadIntervalTime = hnVar.getUploadIntervalTime()) < 3600000) {
            return 86400000;
        }
        return uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.oj.hn
    public boolean isMonitorOpen() {
        hn hnVar = this.hnj;
        if (hnVar != null) {
            return hnVar.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.oj.hn
    public void onMonitorUpload(List<hnj> list) {
        hn hnVar = this.hnj;
        if (hnVar != null) {
            hnVar.onMonitorUpload(list);
        }
    }
}
