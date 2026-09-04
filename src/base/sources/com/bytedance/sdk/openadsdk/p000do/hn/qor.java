package com.bytedance.sdk.openadsdk.p000do.hn;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.as;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends hn {
    private int gjv;

    public qor(Integer num, View view, as asVar, sk.hnj hnjVar) {
        super(num, view, asVar, 1000, hnjVar);
        this.gjv = -1;
        hn(view);
    }

    @Override // com.bytedance.sdk.openadsdk.p000do.hn.hn
    public int dkl() {
        as asVar = this.f14323hn;
        return (asVar != null && asVar.dzo() && this.f14323hn.iz() == 1) ? 1000 : 100;
    }

    @Override // com.bytedance.sdk.openadsdk.p000do.hn.hn
    protected void gjv() {
        super.gjv();
    }

    @Override // com.bytedance.sdk.openadsdk.p000do.hn.hn
    protected void hn(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.p000do.hn.hn
    protected boolean qor() {
        WeakReference<View> weakReference = this.hnj;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        View view = this.hnj.get();
        if (this.gjv == -1) {
            hn(view);
        }
        return dkl.hnj(view, this.gjv == 1, this.f14323hn.xf());
    }

    private void hn(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.gjv = width * height >= 242500 ? 1 : 0;
        }
    }
}
