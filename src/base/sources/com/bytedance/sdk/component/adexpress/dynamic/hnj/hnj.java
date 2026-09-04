package com.bytedance.sdk.component.adexpress.dynamic.hnj;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ua;
import com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl;
import com.bytedance.sdk.component.adexpress.dynamic.sk.aq;
import com.bytedance.sdk.component.adexpress.hn.dnm;
import com.bytedance.sdk.component.adexpress.hn.dse;
import com.bytedance.sdk.component.adexpress.hn.gjv;
import com.bytedance.sdk.component.adexpress.hn.mjg;
import com.bytedance.sdk.component.adexpress.hn.orl;
import com.bytedance.sdk.component.adexpress.qor;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.ojm;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements dnm, gjv<DynamicRootView> {
    private AtomicBoolean aq = new AtomicBoolean(false);
    private orl dkl;
    private ScheduledFuture<?> dse;
    private dse gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private aq f12624hn;
    private DynamicRootView hnj;
    private Context qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.hn.aq f12625sk;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.hnj.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class RunnableC0182hnj implements Runnable {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private int f12627hn;

        public RunnableC0182hnj(int i10) {
            this.f12627hn = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f12627hn == 2) {
                hnj.this.hnj.callBackRenderFail(hnj.this.f12624hn instanceof com.bytedance.sdk.component.adexpress.dynamic.sk.dse ? Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE : Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE, null);
            }
        }
    }

    public hnj(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, aq aqVar, orl orlVar, com.bytedance.sdk.component.adexpress.dynamic.dkl.hnj hnjVar) {
        this.qor = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z10, orlVar, hnjVar);
        this.hnj = dynamicRootView;
        this.f12624hn = aqVar;
        this.dkl = orlVar;
        dynamicRootView.setRenderListener(this);
        this.dkl = orlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aq() {
        try {
            ScheduledFuture<?> scheduledFuture = this.dse;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.dse.cancel(false);
            this.dse = null;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dkl() {
        this.dkl.sk().hn(qor());
        JSONObject jSONObjectQor = this.dkl.qor();
        if (com.bytedance.sdk.component.adexpress.hnj.hn.hn.hnj(jSONObjectQor)) {
            this.f12624hn.hnj(new com.bytedance.sdk.component.adexpress.dynamic.dkl.hn() { // from class: com.bytedance.sdk.component.adexpress.dynamic.hnj.hnj.2
                @Override // com.bytedance.sdk.component.adexpress.dynamic.dkl.hn
                public void hnj(final com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
                    hnj.this.aq();
                    hnj.this.dkl.sk().qor(hnj.this.qor());
                    hnj.this.hnj(aqVar);
                    hnj.this.hn(aqVar);
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        hnj.this.qor(aqVar);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.hnj.hnj.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                hnj.this.qor(aqVar);
                            }
                        });
                    }
                    if (hnj.this.hnj == null || aqVar == null) {
                        return;
                    }
                    hnj.this.hnj.setBgColor(aqVar.hnj());
                    hnj.this.hnj.setBgMaterialCenterCalcColor(aqVar.hn());
                }
            });
            this.f12624hn.hnj(this.dkl);
            return;
        }
        int i10 = this.f12624hn instanceof com.bytedance.sdk.component.adexpress.dynamic.sk.dse ? Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE : Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE;
        DynamicRootView dynamicRootView = this.hnj;
        StringBuilder sb2 = new StringBuilder("data null is ");
        sb2.append(jSONObjectQor == null);
        dynamicRootView.callBackRenderFail(i10, sb2.toString());
    }

    private boolean dse() {
        DynamicRootView dynamicRootView = this.hnj;
        return (dynamicRootView == null || dynamicRootView.getChildCount() == 0) ? false : true;
    }

    public DynamicRootView gjv() {
        return this.hnj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        float fDse;
        float fDkl;
        List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> listDnm;
        if (aqVar == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> listDnm2 = aqVar.dnm();
        if (listDnm2 == null || listDnm2.size() <= 0) {
            fDse = 0.0f;
        } else {
            fDse = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar2 : listDnm2) {
                if (aqVar2.dse() > aqVar.dse() - aqVar2.ojm() || (listDnm = aqVar2.dnm()) == null || listDnm.size() <= 0) {
                    fDkl = 0.0f;
                } else {
                    fDkl = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar3 : listDnm) {
                        if (aqVar3.ta().hn().equals("logo-union")) {
                            fDkl = aqVar3.ta().dkl();
                            fDse = (((-fDkl) + aqVar.dse()) - aqVar2.dse()) + aqVar2.ta().sk().yo();
                        }
                    }
                }
                hn(aqVar2);
                if (fDkl <= -15.0f) {
                    aqVar2.dkl(aqVar2.ojm() - fDkl);
                    aqVar2.gjv(aqVar2.dse() + fDkl);
                    for (com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar4 : aqVar2.dnm()) {
                        aqVar4.gjv(aqVar4.dse() - fDkl);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVarBug = aqVar.bug();
        if (aqVarBug == null) {
            return;
        }
        float fDkl2 = aqVar.dkl() - aqVarBug.dkl();
        float fDse2 = aqVar.dse() - aqVarBug.dse();
        aqVar.qor(fDkl2);
        aqVar.gjv(fDse2);
        if (fDse > 0.0f) {
            aqVar.gjv(aqVar.dse() - fDse);
            aqVar.dkl(aqVar.ojm() + fDse);
            for (com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar5 : aqVar.dnm()) {
                aqVar5.gjv(aqVar5.dse() + fDse);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.gjv
    public void hnj(dse dseVar) {
        this.gjv = dseVar;
        int iDkl = this.dkl.dkl();
        if (iDkl < 0) {
            this.hnj.callBackRenderFail(this.f12624hn instanceof com.bytedance.sdk.component.adexpress.dynamic.sk.dse ? Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE : Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE, "time is ".concat(String.valueOf(iDkl)));
            return;
        }
        this.dse = com.bytedance.sdk.component.adexpress.gjv.gjv.hnj(new RunnableC0182hnj(2), iDkl, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() == Looper.myLooper() && this.dkl.ojm() <= 0) {
            dkl();
        } else {
            ojm.hn().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.hnj.hnj.1
                @Override // java.lang.Runnable
                public void run() {
                    hnj.this.dkl();
                }
            }, this.dkl.ojm());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.gjv
    public int qor() {
        return this.f12624hn instanceof com.bytedance.sdk.component.adexpress.dynamic.sk.dse ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        if (aqVar == null) {
            this.hnj.callBackRenderFail(this.f12624hn instanceof com.bytedance.sdk.component.adexpress.dynamic.sk.dse ? Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE : Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE, "layoutUnit is null");
            return;
        }
        this.dkl.sk().gjv(qor());
        try {
            this.hnj.render(aqVar, qor());
        } catch (Exception e10) {
            int i10 = this.f12624hn instanceof com.bytedance.sdk.component.adexpress.dynamic.sk.dse ? 128 : Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE;
            this.hnj.callBackRenderFail(i10, "exception is " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> listDnm;
        if (aqVar == null || (listDnm = aqVar.dnm()) == null || listDnm.size() <= 0) {
            return;
        }
        Collections.sort(listDnm, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.hnj.hnj.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar2, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar3) {
                dkl dklVarSk = aqVar2.ta().sk();
                dkl dklVarSk2 = aqVar3.ta().sk();
                if (dklVarSk == null || dklVarSk2 == null) {
                    return 0;
                }
                return dklVarSk.dl() >= dklVarSk2.dl() ? 1 : -1;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar2 : listDnm) {
            if (aqVar2 != null) {
                hnj(aqVar2);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.gjv
    /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
    public DynamicRootView sk() {
        return gjv();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void hnj(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                hnj(viewGroup.getChildAt(i10));
                i10++;
            }
        }
        if (view instanceof ua) {
            ((ua) view).hn();
        }
    }

    public void hnj(com.bytedance.sdk.component.adexpress.hn.aq aqVar) {
        this.f12625sk = aqVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.dnm
    public void hnj(mjg mjgVar) {
        if (this.aq.get()) {
            return;
        }
        this.aq.set(true);
        if (mjgVar.hn() && dse()) {
            this.hnj.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.gjv.hnj(sk(), mjgVar);
            return;
        }
        this.gjv.hnj(mjgVar.ta(), mjgVar.ojm());
    }

    public void hn() {
        hnj(sk());
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.dnm
    public void hnj(View view, int i10, qor qorVar) {
        com.bytedance.sdk.component.adexpress.hn.aq aqVar = this.f12625sk;
        if (aqVar != null) {
            aqVar.hnj(view, i10, qorVar);
        }
    }
}
