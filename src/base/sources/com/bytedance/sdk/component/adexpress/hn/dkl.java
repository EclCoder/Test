package com.bytedance.sdk.component.adexpress.hn;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl implements ta {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private hnj f12679hn;
    private Context hnj;
    private orl qor;

    public dkl(Context context, orl orlVar, hnj hnjVar) {
        this.hnj = context;
        this.f12679hn = hnjVar;
        this.qor = orlVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ta
    public void hnj() {
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ta
    public boolean hnj(final ta.hnj hnjVar) {
        this.qor.sk().dse(0);
        this.f12679hn.hnj(new dse() { // from class: com.bytedance.sdk.component.adexpress.hn.dkl.1
            @Override // com.bytedance.sdk.component.adexpress.hn.dse
            public void hnj(View view, mjg mjgVar) {
                if (hnjVar.qor()) {
                    return;
                }
                fc fcVarHn = hnjVar.hn();
                if (fcVarHn != null) {
                    fcVarHn.hnj(dkl.this.f12679hn, mjgVar);
                }
                hnjVar.hnj(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.hn.dse
            public void hnj(int i10, String str) {
                fc fcVarHn = hnjVar.hn();
                if (fcVarHn != null) {
                    fcVarHn.a_(i10);
                }
            }
        });
        return true;
    }

    public void hnj(qor qorVar) {
        this.f12679hn.hnj(qorVar);
    }
}
