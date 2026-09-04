package com.bytedance.sdk.openadsdk.core.bug.qor;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.uua;
import com.bytedance.sdk.openadsdk.core.ojm.fc;
import com.bytedance.sdk.openadsdk.core.ua;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private com.bytedance.sdk.openadsdk.core.bug.qor.hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Context f13695hn;
    private qor hnj;
    private as qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final boolean f13696sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        public static qor hnj(Context context, as asVar, boolean z10) {
            if (uua.hnj(asVar, z10)) {
                return new gjv(context, asVar, z10);
            }
            return null;
        }
    }

    public hn(Context context, as asVar) {
        this(context, asVar, false);
    }

    public void gjv() {
        qor qorVar = this.hnj;
        if (qorVar != null) {
            qorVar.qor();
        }
    }

    public void hn() {
        qor qorVar = this.hnj;
        if (qorVar != null) {
            qorVar.hn();
        }
    }

    public void hnj(fc fcVar) {
        qor qorVarHnj = hnj.hnj(this.f13695hn, this.qor, this.f13696sk);
        this.hnj = qorVarHnj;
        if (qorVarHnj != null) {
            qorVarHnj.hnj();
            this.hnj.hnj(fcVar);
        }
    }

    public View qor() {
        qor qorVar = this.hnj;
        if (qorVar != null) {
            return qorVar.gjv();
        }
        return null;
    }

    public hn(Context context, as asVar, boolean z10) {
        this.f13695hn = context;
        this.qor = asVar;
        this.f13696sk = z10;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.bug.qor.hnj hnjVar) {
        this.gjv = hnjVar;
        qor qorVar = this.hnj;
        if (qorVar != null) {
            qorVar.hnj(hnjVar);
        }
    }

    public void hnj(int i10) {
        ua uaVarSk;
        qor qorVar = this.hnj;
        if (!(qorVar instanceof gjv) || (uaVarSk = ((gjv) qorVar).sk()) == null || uaVarSk.hnj() == null) {
            return;
        }
        uaVarSk.hnj().hnj(i10);
    }

    public qor hnj() {
        return this.hnj;
    }
}
