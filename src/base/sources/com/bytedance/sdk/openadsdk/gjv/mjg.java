package com.bytedance.sdk.openadsdk.gjv;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.google.api.client.http.HttpStatusCodes;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class mjg {
    private static volatile mjg hnj;
    private Map<String, Object> gjv;
    private hn qor = hn.hnj();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Handler f14378hn = new Handler(com.bytedance.sdk.openadsdk.core.fc.hn().getLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.gjv.mjg.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 100) {
                return true;
            }
            Object obj = message.obj;
            hnj hnjVar = (obj == null || !(obj instanceof hnj)) ? null : (hnj) obj;
            if (hnjVar == null) {
                return true;
            }
            mjg.this.hn(hnjVar);
            return true;
        }
    });

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hn {
        public int hnj = HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public int f14379hn = 6000;

        private hn() {
        }

        public static hn hnj() {
            return new hn();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj implements Serializable, Runnable {
        public String gjv;
        public as qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        public Map<String, Object> f14381sk;
        public final AtomicInteger hnj = new AtomicInteger(0);

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public final AtomicBoolean f14380hn = new AtomicBoolean(false);
        private final long dkl = SystemClock.elapsedRealtime();

        public hnj(as asVar, String str, Map<String, Object> map) {
            this.qor = asVar;
            this.gjv = str;
            this.f14381sk = map;
        }

        public static hnj hnj(as asVar, String str, Map<String, Object> map) {
            return new hnj(asVar, str, map);
        }

        public void hn() {
            this.hnj.incrementAndGet();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.qor == null || TextUtils.isEmpty(this.gjv)) {
                return;
            }
            String str = this.f14380hn.get() ? "dpl_success" : "dpl_failed";
            if (this.f14381sk == null) {
                this.f14381sk = new HashMap();
            }
            as asVar = this.qor;
            if (asVar != null && asVar.vz() == 0) {
                Map<String, Object> map = this.f14381sk;
                as asVar2 = this.qor;
                map.put("auto_click", Boolean.valueOf((asVar2 == null || asVar2.xn()) ? false : true));
            }
            this.f14381sk.put("lifeCycleInit", Boolean.valueOf(com.bytedance.sdk.openadsdk.core.jip.hnj().qor()));
            this.f14381sk.put("duration", Long.valueOf(SystemClock.elapsedRealtime() - this.dkl));
            qor.hnj(this.qor, this.gjv, str, this.f14381sk);
        }

        public hnj hnj(boolean z10) {
            this.f14380hn.set(z10);
            return this;
        }

        public int hnj() {
            return this.hnj.get();
        }
    }

    private mjg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(hnj hnjVar) {
        if (hnjVar == null) {
            return;
        }
        boolean zGjv = com.bytedance.sdk.openadsdk.core.jip.hnj().gjv();
        boolean zHnj = com.bytedance.sdk.openadsdk.core.jip.hnj().hnj(true);
        if (!zGjv && zHnj) {
            hnj(hnjVar);
            return;
        }
        if (hnjVar.f14381sk == null) {
            hnjVar.f14381sk = new HashMap();
        }
        hnjVar.f14381sk.put("is_background", Boolean.valueOf(zGjv));
        hnjVar.f14381sk.put("has_focus", Boolean.valueOf(zHnj));
        qor(hnjVar.hnj(true));
    }

    private void qor(hnj hnjVar) {
        if (hnjVar == null) {
            return;
        }
        this.f14378hn.post(hnjVar);
    }

    public static mjg hnj() {
        if (hnj == null) {
            synchronized (mjg.class) {
                try {
                    if (hnj == null) {
                        hnj = new mjg();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    public mjg hnj(Map<String, Object> map) {
        this.gjv = map;
        return hnj();
    }

    public void hnj(as asVar, String str) {
        Message messageObtainMessage = this.f14378hn.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = hnj.hnj(asVar, str, this.gjv);
        messageObtainMessage.sendToTarget();
    }

    private void hnj(hnj hnjVar) {
        if (hnjVar == null) {
            return;
        }
        hnjVar.hn();
        int iHnj = hnjVar.hnj();
        hn hnVar = this.qor;
        if (iHnj * hnVar.hnj > hnVar.f14379hn) {
            qor(hnjVar.hnj(false));
            return;
        }
        Message messageObtainMessage = this.f14378hn.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = hnjVar;
        this.f14378hn.sendMessageDelayed(messageObtainMessage, this.qor.hnj);
    }
}
