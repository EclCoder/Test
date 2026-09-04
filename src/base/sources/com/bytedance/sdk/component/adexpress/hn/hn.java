package com.bytedance.sdk.component.adexpress.hn;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn implements ta {
    private int dkl;
    private aq gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.hnj.hnj f12681hn;
    private Context hnj;
    private ThemeStatusBroadcastReceiver qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private orl f12682sk;

    public hn(Context context, orl orlVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.dynamic.sk.aq aqVar, aq aqVar2, com.bytedance.sdk.component.adexpress.dynamic.dkl.hnj hnjVar, com.bytedance.sdk.component.adexpress.dynamic.hnj.hnj hnjVar2) {
        this.hnj = context;
        this.f12682sk = orlVar;
        this.qor = themeStatusBroadcastReceiver;
        this.gjv = aqVar2;
        if (hnjVar2 != null) {
            this.f12681hn = hnjVar2;
        } else {
            this.f12681hn = new com.bytedance.sdk.component.adexpress.dynamic.hnj.hnj(context, themeStatusBroadcastReceiver, z10, aqVar, orlVar, hnjVar);
        }
        this.f12681hn.hnj(this.gjv);
        if (aqVar instanceof com.bytedance.sdk.component.adexpress.dynamic.sk.dse) {
            this.dkl = 3;
        } else {
            this.dkl = 2;
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.gjv hn() {
        com.bytedance.sdk.component.adexpress.dynamic.hnj.hnj hnjVar = this.f12681hn;
        if (hnjVar != null) {
            return hnjVar.gjv();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ta
    public boolean hnj(final ta.hnj hnjVar) {
        this.f12682sk.sk().hnj(this.dkl);
        this.f12681hn.hnj(new dse() { // from class: com.bytedance.sdk.component.adexpress.hn.hn.1
            @Override // com.bytedance.sdk.component.adexpress.hn.dse
            public void hnj(View view, mjg mjgVar) {
                if (hnjVar.qor()) {
                    return;
                }
                hn.this.f12682sk.sk().sk(hn.this.dkl);
                hn.this.f12682sk.sk().dkl(hn.this.dkl);
                hn.this.f12682sk.sk().ojm();
                fc fcVarHn = hnjVar.hn();
                if (fcVarHn == null) {
                    return;
                }
                fcVarHn.hnj(hn.this.f12681hn, mjgVar);
                hnjVar.hnj(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.hn.dse
            public void hnj(int i10, String str) {
                hn.this.f12682sk.sk().hnj(hn.this.dkl, i10, str, hnjVar.hn(hn.this));
                if (hnjVar.hn(hn.this)) {
                    hnjVar.hnj(hn.this);
                    return;
                }
                fc fcVarHn = hnjVar.hn();
                if (fcVarHn == null) {
                    return;
                }
                fcVarHn.a_(i10);
            }
        });
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ta
    public void hnj() {
        com.bytedance.sdk.component.adexpress.dynamic.hnj.hnj hnjVar = this.f12681hn;
        if (hnjVar != null) {
            hnjVar.hn();
        }
    }
}
