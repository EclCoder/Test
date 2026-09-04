package com.bytedance.sdk.openadsdk.p000do.hnj;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.sdk.component.aq.hn.qor;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.ua;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final as f14327hn;
    private int hnj = qor.f14332hn;
    private final AtomicBoolean qor = new AtomicBoolean(false);
    private final AtomicBoolean gjv = new AtomicBoolean(true);

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final AtomicInteger f14328sk = new AtomicInteger(0);
    private long dkl = 0;
    private long dse = 0;
    private final Runnable aq = new Runnable() { // from class: com.bytedance.sdk.openadsdk.do.hnj.hn.3
        @Override // java.lang.Runnable
        public void run() {
            hn.this.gjv();
        }
    };

    public hn(as asVar) {
        this.f14327hn = asVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dkl() {
        if (this.f14328sk.get() != 1 || this.dkl == 0) {
            return;
        }
        Handler handlerHnj = hnj.hnj();
        if (handlerHnj != null) {
            handlerHnj.removeCallbacks(this.aq);
        }
        this.dse += SystemClock.elapsedRealtime() - this.dkl;
        this.dkl = 0L;
        this.f14328sk.set(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gjv() {
        if (this.qor.compareAndSet(false, true)) {
            hn();
            final long jElapsedRealtime = this.dse + (SystemClock.elapsedRealtime() - this.dkl);
            this.dse = jElapsedRealtime;
            ua.hn(new qor("ev_tracker") { // from class: com.bytedance.sdk.openadsdk.do.hnj.hn.1
                @Override // java.lang.Runnable
                public void run() {
                    String strHnj = orp.hnj(hn.this.f14327hn);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("ev_wait_time_server", hn.this.f14327hn.vv() * 1000);
                        jSONObject.put("ev_wait_time_client", jElapsedRealtime);
                    } catch (JSONException e10) {
                        apu.qor("EvTracker", e10.getMessage());
                    }
                    com.bytedance.sdk.openadsdk.gjv.qor.hn(hn.this.f14327hn, strHnj, hn.this.f14327hn.uy(), jSONObject);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sk() {
        if (this.f14328sk.get() == 2) {
            this.dkl = SystemClock.elapsedRealtime();
            Handler handlerHnj = hnj.hnj();
            if (handlerHnj != null) {
                handlerHnj.postDelayed(this.aq, ((long) this.hnj) - this.dse);
            }
            this.f14328sk.set(1);
        }
    }

    public void hn() {
        this.f14328sk.set(3);
        Handler handlerHnj = hnj.hnj();
        if (handlerHnj != null) {
            handlerHnj.removeCallbacks(this.aq);
        }
    }

    public void hnj() {
        if (this.f14328sk.get() != 0) {
            return;
        }
        this.hnj = this.f14327hn.vv() * 1000;
        this.f14328sk.set(1);
        this.dkl = SystemClock.elapsedRealtime();
        Handler handlerHnj = hnj.hnj();
        if (handlerHnj != null) {
            handlerHnj.postDelayed(this.aq, this.hnj);
        }
    }

    public boolean qor() {
        return this.f14328sk.get() == 3;
    }

    public void hnj(final int i10) {
        Handler handlerHnj;
        if (this.f14328sk.get() == 3 || (handlerHnj = hnj.hnj()) == null) {
            return;
        }
        handlerHnj.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.do.hnj.hn.2
            @Override // java.lang.Runnable
            public void run() {
                if (i10 == 4 && hn.this.gjv.get()) {
                    hn.this.sk();
                    return;
                }
                int i11 = i10;
                if (i11 == 8) {
                    hn.this.dkl();
                } else if (i11 == 5) {
                    hn.this.gjv();
                }
            }
        });
    }

    public void hnj(boolean z10) {
        this.gjv.set(z10);
    }
}
