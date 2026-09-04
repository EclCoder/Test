package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.nyv;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import q6.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class orl {
    private final hnj aq;
    protected boolean dkl;
    protected boolean dse;
    protected boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected final com.bytedance.sdk.openadsdk.core.model.hnj f13532hn;
    protected final Context hnj;
    protected final String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected final AtomicBoolean f13533sk = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        Intent hnj(Context context, as asVar, Activity activity);

        void hnj(Intent intent, Activity activity, as asVar, boolean z10);

        void hnj(as asVar);

        void hnj(boolean z10);
    }

    public orl(Context context, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, String str, hnj hnjVar2) {
        this.hnj = context == null ? com.bytedance.sdk.openadsdk.core.oj.hnj() : context;
        this.f13532hn = hnjVar;
        this.qor = str;
        this.gjv = false;
        this.aq = hnjVar2;
    }

    private void gjv() {
        List<as> listGjv = this.f13532hn.gjv();
        if (listGjv != null) {
            Iterator<as> it = listGjv.iterator();
            while (it.hasNext()) {
                IPBroadcastReceiver.hn(this.hnj, it.next());
            }
        }
    }

    public Map<String, Object> hn() {
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVar = this.f13532hn;
        if (hnjVar == null || hnjVar.dkl() == null) {
            return null;
        }
        return this.f13532hn.dkl().jd();
    }

    public boolean qor() {
        return this.gjv;
    }

    public void hnj() {
        if (this.f13533sk.get()) {
            return;
        }
        this.gjv = true;
    }

    public Object hnj(String str) {
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVar = this.f13532hn;
        if (hnjVar == null || hnjVar.dkl() == null || this.f13532hn.dkl().jd() == null) {
            return null;
        }
        try {
            return this.f13532hn.dkl().jd().get(str);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor(this.qor, th2.getMessage());
            return null;
        }
    }

    public void hnj(Double d10) {
        if (this.dkl) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVar = this.f13532hn;
        if (hnjVar != null && hnjVar.dkl() != null) {
            nyv.hnj(this.f13532hn.dkl(), d10);
        }
        this.dkl = true;
    }

    public void hnj(Double d10, String str, String str2) {
        if (this.dse) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVar = this.f13532hn;
        if (hnjVar != null && hnjVar.dkl() != null) {
            nyv.hnj(this.f13532hn.dkl(), d10, str, str2);
        }
        this.dse = true;
    }

    public void hnj(Activity activity) {
        as asVarDkl;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVar = this.f13532hn;
        if (hnjVar == null || !hnjVar.sk() || (asVarDkl = this.f13532hn.dkl()) == null) {
            return;
        }
        if (a.a()) {
            gjv();
            if (!this.f13533sk.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.gjv.ta.hnj(asVarDkl, "show_ad_fail", this.qor, "repeat_play");
                return;
            }
            if (asVarDkl.pwt() == null && asVarDkl.lx().isEmpty()) {
                com.bytedance.sdk.openadsdk.gjv.ta.hnj(asVarDkl, "show_ad_fail", this.qor, "video_or_image_empty");
                return;
            }
            com.bytedance.sdk.openadsdk.gjv.ta.hnj(asVarDkl, "show_start", this.qor, (String) null);
            Context contextHnj = activity == null ? this.hnj : activity;
            if (contextHnj == null) {
                contextHnj = com.bytedance.sdk.openadsdk.core.oj.hnj();
            }
            Intent intentHnj = this.aq.hnj(contextHnj, asVarDkl, activity);
            if (intentHnj == null) {
                return;
            }
            intentHnj.putExtra("start_show_time", SystemClock.elapsedRealtime());
            boolean zOjm = com.bytedance.sdk.openadsdk.as.sk.ojm();
            intentHnj.putExtra("enable_new_arch", zOjm);
            this.aq.hnj(intentHnj, activity, asVarDkl, zOjm);
            this.aq.hnj(zOjm);
            hnj(contextHnj, intentHnj, asVarDkl, zOjm);
            this.aq.hnj(asVarDkl);
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.ta.hnj(asVarDkl, "show_ad_fail", this.qor, "not_called_on_main_thread");
        throw new IllegalStateException("Cannot be called in a child thread —— " + this.qor + ".show");
    }

    private void hnj(Context context, Intent intent, final as asVar, boolean z10) {
        final boolean z11 = com.bytedance.sdk.openadsdk.as.sk.hnj("start_activity_async", 0) == 1;
        if (z11) {
            com.bytedance.sdk.openadsdk.oj.qor.hnj(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.component.reward.orl.1
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar.hn("start_activity");
                    hnjVar.gjv(orl.this.qor);
                    return hnjVar;
                }
            });
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.utils.hn.hnj(context, intent, new com.bytedance.sdk.component.utils.hn.InterfaceC0195hn() { // from class: com.bytedance.sdk.openadsdk.component.reward.orl.2
            @Override // com.bytedance.sdk.component.utils.hn.InterfaceC0195hn
            public void hnj() {
                if (z11) {
                    orl.this.hnj(jElapsedRealtime);
                }
            }

            @Override // com.bytedance.sdk.component.utils.hn.InterfaceC0195hn
            public void hnj(Throwable th2) {
                com.bytedance.sdk.openadsdk.gjv.ta.hnj(asVar, "show_ad_fail", orl.this.qor, "activity_start_fail");
                if (z11) {
                    com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.component.reward.orl.2.1
                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                            hnjVar.hn("start_activity");
                            hnjVar.gjv(orl.this.qor);
                            return hnjVar;
                        }
                    });
                }
            }
        }, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(long j10) {
        com.bytedance.sdk.openadsdk.oj.qor.hn(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.component.reward.orl.3
            @Override // com.bytedance.sdk.openadsdk.oj.gjv
            public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                hnjVar.hn("start_activity");
                hnjVar.gjv(orl.this.qor);
                return hnjVar;
            }
        });
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        com.bytedance.sdk.openadsdk.jip.gjv.hnj("start_activity_action", false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.component.reward.orl.4
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", jElapsedRealtime);
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj(mDXVAtwcaFMHJ.TDMscUhlycJIZJ).hn(jSONObject.toString());
            }
        });
    }
}
