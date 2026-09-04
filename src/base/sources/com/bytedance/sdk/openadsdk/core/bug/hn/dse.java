package com.bytedance.sdk.openadsdk.core.bug.hn;

import android.content.Context;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.uua;
import com.bytedance.sdk.component.adexpress.hn.aq;
import com.bytedance.sdk.component.adexpress.hn.mjg;
import com.bytedance.sdk.component.adexpress.hn.orl;
import com.bytedance.sdk.component.adexpress.hn.ta;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.ojm.fc;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse implements ta {
    private fc dkl;
    private ScheduledFuture<?> gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.bug.dkl.gjv f13629hn;
    private Context hnj;
    private orl qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private AtomicBoolean f13630sk = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class hnj implements Runnable {
        ta.hnj hnj;
        private int qor;

        hnj(int i10, ta.hnj hnjVar) {
            this.qor = i10;
            this.hnj = hnjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.qor == 1) {
                dse.this.f13629hn.hnj(true);
                dse.this.hnj(this.hnj, Sdk$SDKError.b.TPAT_RETRY_FAILED_VALUE, "real time out" + dse.this.qor.dkl());
            }
        }
    }

    public dse(Context context, com.bytedance.sdk.openadsdk.core.bug.dkl.gjv gjvVar, aq aqVar, orl orlVar) {
        this.hnj = context;
        this.f13629hn = gjvVar;
        this.qor = orlVar;
        this.f13629hn.hnj(aqVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ta
    public void hnj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn() {
        try {
            ScheduledFuture<?> scheduledFuture = this.gjv;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.gjv.cancel(false);
            this.gjv = null;
        } catch (Throwable th2) {
            apu.qor("RenderInterceptor", "remove ugen time out task fail", th2.getMessage());
        }
    }

    public void hnj(fc fcVar) {
        this.dkl = fcVar;
        this.f13629hn.hnj(fcVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ta
    public boolean hnj(final ta.hnj hnjVar) {
        int iDkl = this.qor.dkl();
        if (iDkl < 0) {
            hnj(hnjVar, Sdk$SDKError.b.TPAT_RETRY_FAILED_VALUE, "time is ".concat(String.valueOf(iDkl)));
        } else {
            if (!(this.f13629hn instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.dkl)) {
                this.gjv = ua.hnj().schedule(new hnj(1, hnjVar), iDkl, TimeUnit.MILLISECONDS);
            }
            this.f13629hn.hnj(new com.bytedance.sdk.component.adexpress.hn.dse() { // from class: com.bytedance.sdk.openadsdk.core.bug.hn.dse.1
                @Override // com.bytedance.sdk.component.adexpress.hn.dse
                public void hnj(View view, mjg mjgVar) {
                    dse.this.hn();
                    if (hnjVar.qor()) {
                        return;
                    }
                    uua uuaVar = new uua();
                    uuaVar.hnj(0);
                    if (dse.this.f13629hn instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.dkl) {
                        dse.this.qor.sk().dkl();
                    } else {
                        ((com.bytedance.sdk.openadsdk.core.bug.dkl.hnj) dse.this.qor).gm().hnj(uuaVar);
                    }
                    dse.this.qor.sk().ojm();
                    com.bytedance.sdk.component.adexpress.hn.fc fcVarHn = hnjVar.hn();
                    if (fcVarHn == null) {
                        return;
                    }
                    fcVarHn.hnj(dse.this.f13629hn, mjgVar);
                    hnjVar.hnj(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.hn.dse
                public void hnj(int i10, String str) {
                    dse.this.hnj(hnjVar, i10, str);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(ta.hnj hnjVar, int i10, String str) {
        com.bytedance.sdk.component.adexpress.hn.fc fcVarHn;
        if (hnjVar.qor() || this.f13630sk.get()) {
            return;
        }
        hn();
        uua uuaVar = new uua();
        uuaVar.hnj(i10);
        uuaVar.hnj(str);
        ((com.bytedance.sdk.openadsdk.core.bug.dkl.hnj) this.qor).gm().hnj(uuaVar);
        if (hnjVar.hn(this)) {
            hnjVar.hnj(this);
        } else {
            if (hnjVar.qor() || (fcVarHn = hnjVar.hn()) == null) {
                return;
            }
            hnjVar.hnj(true);
            fcVarHn.a_(i10);
        }
        this.f13630sk.getAndSet(true);
    }
}
