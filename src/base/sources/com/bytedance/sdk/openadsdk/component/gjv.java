package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdTransActivity;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.hqh;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.nyv;
import com.bytedance.sdk.openadsdk.utils.tgn;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends PAGAppOpenAd {
    private boolean aq;
    private final boolean dse;
    private com.bytedance.sdk.openadsdk.hnj.gjv.hn gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final as f13354hn;
    private final Context hnj;
    private boolean ojm;
    private final AdSlot qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final AtomicBoolean f13355sk = new AtomicBoolean(false);
    private final String dkl = tgn.hnj();

    public gjv(Context context, as asVar, boolean z10, AdSlot adSlot) {
        this.hnj = context;
        this.f13354hn = asVar;
        this.dse = z10;
        this.qor = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        as asVar = this.f13354hn;
        if (asVar == null || asVar.jd() == null) {
            return null;
        }
        try {
            return this.f13354hn.jd().get(str);
        } catch (Throwable th2) {
            apu.qor("TTAppOpenAdImpl", th2.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        as asVar = this.f13354hn;
        if (asVar != null) {
            return asVar.jd();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public boolean isReady() {
        return this.f13354hn != null && System.currentTimeMillis() / 1000 <= this.f13354hn.jpm();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.ojm) {
            return;
        }
        nyv.hnj(this.f13354hn, d10, str, str2);
        this.ojm = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionCallback(PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback) {
        this.gjv = new sk(pAGAppOpenAdInteractionCallback);
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionListener(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.gjv = new sk(pAGAppOpenAdInteractionListener);
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void show(Activity activity) {
        int rotation;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (this.f13355sk.getAndSet(true)) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
        IPBroadcastReceiver.hn(this.hnj, this.f13354hn);
        Context contextHnj = activity != null ? activity : this.hnj;
        if (contextHnj == null) {
            contextHnj = oj.hnj();
        }
        try {
            rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        } catch (Exception unused) {
            rotation = 0;
        }
        Intent intent = this.f13354hn.pty() ? new Intent(contextHnj, (Class<?>) TTAppOpenAdTransActivity.class) : new Intent(contextHnj, (Class<?>) TTAppOpenAdActivity.class);
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("ad_source", this.dse ? 1 : 2);
        boolean zOjm = com.bytedance.sdk.openadsdk.as.sk.ojm();
        intent.putExtra("enable_new_arch", zOjm);
        hqh.hnj().sk();
        intent.putExtra("meta_index", hqh.hnj().hnj(this.f13354hn));
        if (zOjm) {
            intent.putExtra("single_process_listener_key", this.dkl);
            hqh.hnj().hnj(this.dkl, this.gjv);
        } else {
            hqh.hnj().hnj(this.gjv);
        }
        this.gjv = null;
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        AdSlot adSlot = this.qor;
        if (adSlot != null) {
            long cacheTime = adSlot.getCacheTime();
            if (cacheTime == 0 && this.f13354hn.aip() != null) {
                cacheTime = this.f13354hn.aip().getCacheTime();
            }
            intent.putExtra("cache_time", cacheTime);
        }
        com.bytedance.sdk.component.utils.hn.hnj(contextHnj, intent, new com.bytedance.sdk.component.utils.hn.InterfaceC0195hn() { // from class: com.bytedance.sdk.openadsdk.component.gjv.1
            @Override // com.bytedance.sdk.component.utils.hn.InterfaceC0195hn
            public void hnj() {
            }

            @Override // com.bytedance.sdk.component.utils.hn.InterfaceC0195hn
            public void hnj(Throwable th2) {
            }
        });
        fc.hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.gjv.2
            @Override // java.lang.Runnable
            public void run() {
                if (gjv.this.qor != null) {
                    try {
                        if (gjv.this.f13354hn == null || as.dkl(gjv.this.f13354hn) || gjv.this.f13354hn.era()) {
                            return;
                        }
                        dkl.hnj(gjv.this.hnj).hnj(Integer.parseInt(gjv.this.qor.getCodeId()), gjv.this.f13354hn.jp());
                    } catch (Throwable unused2) {
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.aq) {
            return;
        }
        nyv.hnj(this.f13354hn, d10);
        this.aq = true;
    }
}
