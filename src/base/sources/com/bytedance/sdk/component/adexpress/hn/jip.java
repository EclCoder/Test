package com.bytedance.sdk.component.adexpress.hn;

import android.content.Context;
import android.view.View;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class jip implements ta {
    private AtomicBoolean dkl = new AtomicBoolean(false);
    private orl gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.sk.hnj f12684hn;
    private Context hnj;
    private aq qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private ScheduledFuture<?> f12685sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class hnj implements Runnable {
        ta.hnj hnj;
        private int qor;

        public hnj(int i10, ta.hnj hnjVar) {
            this.qor = i10;
            this.hnj = hnjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.qor == 1) {
                jip.this.f12684hn.hnj(true);
                jip.this.hnj(this.hnj, 107, null);
            }
        }
    }

    public jip(Context context, orl orlVar, com.bytedance.sdk.component.adexpress.sk.hnj hnjVar, aq aqVar) {
        this.hnj = context;
        this.gjv = orlVar;
        this.qor = aqVar;
        this.f12684hn = hnjVar;
        hnjVar.hnj(this.qor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor() {
        try {
            ScheduledFuture<?> scheduledFuture = this.f12685sk;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.f12685sk.cancel(false);
            this.f12685sk = null;
        } catch (Throwable unused) {
        }
    }

    public com.bytedance.sdk.component.adexpress.sk.hnj hn() {
        return this.f12684hn;
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ta
    public boolean hnj(final ta.hnj hnjVar) {
        int iDkl = this.gjv.dkl();
        if (iDkl < 0) {
            hnj(hnjVar, 107, "time is ".concat(String.valueOf(iDkl)));
        } else {
            this.f12685sk = com.bytedance.sdk.component.adexpress.gjv.gjv.hnj(new hnj(1, hnjVar), iDkl, TimeUnit.MILLISECONDS);
            this.f12684hn.hnj(new dse() { // from class: com.bytedance.sdk.component.adexpress.hn.jip.1
                @Override // com.bytedance.sdk.component.adexpress.hn.dse
                public void hnj(View view, mjg mjgVar) {
                    fc fcVarHn;
                    jip.this.qor();
                    if (hnjVar.qor() || (fcVarHn = hnjVar.hn()) == null) {
                        return;
                    }
                    fcVarHn.hnj(jip.this.f12684hn, mjgVar);
                    hnjVar.hnj(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.hn.dse
                public void hnj(int i10, String str) {
                    jip.this.hnj(hnjVar, i10, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ta
    public void hnj() {
        this.f12684hn.gjv();
        qor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(ta.hnj hnjVar, int i10, String str) {
        fc fcVarHn;
        if (hnjVar.qor() || this.dkl.get()) {
            return;
        }
        qor();
        this.gjv.sk().hnj(i10, str);
        if (hnjVar.hn(this)) {
            hnjVar.hnj(this);
        } else {
            if (hnjVar.qor() || (fcVarHn = hnjVar.hn()) == null) {
                return;
            }
            hnjVar.hnj(true);
            fcVarHn.a_(i10);
        }
        this.dkl.getAndSet(true);
    }
}
