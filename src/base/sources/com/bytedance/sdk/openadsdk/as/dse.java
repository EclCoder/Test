package com.bytedance.sdk.openadsdk.as;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse implements dkl {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private dkl f13255hn;
    Handler hnj = null;

    dse(dkl dklVar) {
        this.f13255hn = dklVar;
    }

    private Context ojm() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            return (Application) objInvoke.getClass().getMethod("getApplication", null).invoke(objInvoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.as.dkl
    public boolean aq() {
        dkl dklVar = this.f13255hn;
        if (dklVar != null) {
            return dklVar.aq();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.as.dkl
    public JSONObject dkl() {
        dkl dklVar = this.f13255hn;
        if (dklVar != null) {
            return dklVar.dkl();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.as.dkl
    public Map<String, String> dse() {
        dkl dklVar = this.f13255hn;
        return (dklVar == null || dklVar.dse() == null) ? new HashMap() : this.f13255hn.dse();
    }

    @Override // com.bytedance.sdk.openadsdk.as.dkl
    public Handler gjv() {
        dkl dklVar = this.f13255hn;
        if (dklVar != null && dklVar.dse() != null) {
            return this.f13255hn.gjv();
        }
        Handler handler = new Handler(hnj("pag_strategy", -1).getLooper());
        this.hnj = handler;
        return handler;
    }

    @Override // com.bytedance.sdk.openadsdk.as.dkl
    public Context hn() {
        dkl dklVar = this.f13255hn;
        return (dklVar == null || dklVar.hn() == null) ? ojm() : this.f13255hn.hn();
    }

    @Override // com.bytedance.sdk.openadsdk.as.dkl
    public ExecutorService hnj() {
        dkl dklVar = this.f13255hn;
        return (dklVar == null || dklVar.hnj() == null) ? Executors.newCachedThreadPool() : this.f13255hn.hnj();
    }

    @Override // com.bytedance.sdk.openadsdk.as.dkl
    public String qor() {
        dkl dklVar = this.f13255hn;
        return (dklVar == null || TextUtils.isEmpty(dklVar.qor())) ? "null" : this.f13255hn.qor();
    }

    @Override // com.bytedance.sdk.openadsdk.as.dkl
    public String sk() {
        dkl dklVar = this.f13255hn;
        if (dklVar != null) {
            return dklVar.sk();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.as.dkl
    public JSONObject hnj(JSONObject jSONObject) {
        dkl dklVar = this.f13255hn;
        return dklVar != null ? dklVar.hnj(jSONObject) : jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.as.dkl
    public HandlerThread hnj(String str, int i10) {
        HandlerThread handlerThreadHnj;
        dkl dklVar = this.f13255hn;
        if (dklVar != null && (handlerThreadHnj = dklVar.hnj(str, i10)) != null) {
            return handlerThreadHnj;
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        return handlerThread;
    }
}
