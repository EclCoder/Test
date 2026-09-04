package com.bytedance.sdk.openadsdk.p000do.hn;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.as;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq extends hn {
    private int gjv;

    public aq(Integer num, View view, as asVar, sk.hnj hnjVar) {
        super(num, view, asVar, 2000, hnjVar);
        this.gjv = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.p000do.hn.hn
    public boolean bug() {
        int i10 = this.gjv;
        boolean z10 = i10 == 2 || i10 == 0;
        if (z10) {
            this.qor.set(false);
        }
        return !z10 || super.bug();
    }

    @Override // com.bytedance.sdk.openadsdk.p000do.hn.hn
    public int dkl() {
        return 200;
    }

    @Override // com.bytedance.sdk.openadsdk.p000do.hn.hn
    protected void gjv() {
        super.gjv();
    }

    @Override // com.bytedance.sdk.openadsdk.p000do.hn.hn
    protected void hn(int i10) {
        if (ojm()) {
            return;
        }
        if (i10 == 6 || i10 == 5) {
            this.gjv = 0;
            aq();
        }
        if (i10 == 3 || i10 == 2) {
            this.gjv = 2;
            aq();
        }
        if (this.gjv == 1 || i10 != 0) {
            return;
        }
        this.gjv = 1;
        hnj();
    }

    @Override // com.bytedance.sdk.openadsdk.p000do.hn.hn
    public void hnj() {
        if (this.gjv != 1) {
            return;
        }
        super.hnj();
    }

    @Override // com.bytedance.sdk.openadsdk.p000do.hn.hn
    protected boolean qor() {
        return dkl.hnj(this.hnj.get(), this.f14323hn.xf()) && this.gjv == 1;
    }
}
