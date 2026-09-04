package com.mbridge.msdk.config.component.time;

import android.os.Handler;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class TimeCpt extends com.mbridge.msdk.config.component.base.a implements d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Map<String, Object> f29143h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Map<String, Object> f29144i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f29145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f29146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f29147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f29148m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29149a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f29150b;

        public a(boolean z10) {
            this.f29150b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap map = new HashMap();
            String strC = c.c("triggered_count");
            int i10 = this.f29149a;
            this.f29149a = i10 + 1;
            map.put(strC, Integer.valueOf(i10));
            TimeCpt timeCpt = TimeCpt.this;
            timeCpt.a(timeCpt.a("919003", (Map<String, Object>) map));
            if (this.f29150b) {
                TimeCpt timeCpt2 = TimeCpt.this;
                Handler handler = (Handler) timeCpt2.f29143h.get(timeCpt2.f29145j);
                if (handler != null) {
                    handler.postDelayed(this, TimeCpt.this.f29146k);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get(c.c("16"));
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get(c.c("110"));
                if (obj2 instanceof String) {
                    return this.f29145j.equals(String.valueOf(obj2));
                }
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f28523f = "919001";
        if (map == null || map.isEmpty()) {
            return;
        }
        Object obj = map.get(c.c("110"));
        if (obj != null) {
            this.f29145j = String.valueOf(obj);
        }
        Object obj2 = map.get(c.c("152"));
        if (obj2 != null) {
            String strValueOf = String.valueOf(obj2);
            if (!TextUtils.isEmpty(strValueOf)) {
                this.f29146k = ((long) Integer.parseInt(strValueOf)) * 1000;
            }
        }
        Object obj3 = map.get(c.c("153"));
        if (obj3 != null) {
            String strValueOf2 = String.valueOf(obj3);
            if (!TextUtils.isEmpty(strValueOf2)) {
                this.f29147l = Integer.parseInt(strValueOf2);
            }
        }
        Object obj4 = map.get(c.c(StatisticData.ERROR_CODE_NOT_FOUND));
        if (obj4 != null) {
            this.f29148m = String.valueOf(obj4);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void c(Map<String, Object> map) {
        super.c(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        Handler handler;
        Runnable aVar;
        super.d();
        if (this.f29143h.containsKey(this.f29145j)) {
            handler = (Handler) this.f29143h.get(this.f29145j);
        } else {
            handler = new Handler();
            this.f29143h.put(this.f29145j, handler);
        }
        if (this.f29144i.containsKey(this.f29145j)) {
            aVar = (Runnable) this.f29144i.get(this.f29145j);
        } else {
            aVar = new a(this.f29147l == 1);
            this.f29144i.put(this.f29145j, aVar);
        }
        if (handler != null && aVar != null) {
            if (c.c("310").equals(this.f29148m) || c.c("335").equals(this.f29148m)) {
                handler.postDelayed(aVar, this.f29146k);
            } else if (c.c("311").equals(this.f29148m)) {
                handler.removeCallbacks(aVar);
                this.f29143h.remove(this.f29145j);
            } else if (c.c("316").equals(this.f29148m)) {
                handler.removeCallbacks(aVar);
            }
        }
        a("919002", (HashMap<String, Object>) null);
    }
}
