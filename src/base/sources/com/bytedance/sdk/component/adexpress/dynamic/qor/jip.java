package com.bytedance.sdk.component.adexpress.dynamic.qor;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dkl.apu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class jip implements dse {
    private com.bytedance.sdk.component.adexpress.dynamic.gjv.dse gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Context f12654hn;
    private apu hnj;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk qor;

    public jip(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk skVar, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar) {
        this.f12654hn = context;
        this.qor = skVar;
        this.gjv = dseVar;
        gjv();
    }

    private void gjv() {
        this.hnj = new apu(this.f12654hn);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.f12654hn, 120.0f));
        layoutParams.gravity = 17;
        this.hnj.setLayoutParams(layoutParams);
        this.hnj.setClipChildren(false);
        this.hnj.setGuideText(this.gjv.eta());
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk skVar = this.qor;
        if (skVar != null) {
            this.hnj.setOnClickListener((View.OnClickListener) skVar.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public void hn() {
        apu apuVar = this.hnj;
        if (apuVar != null) {
            apuVar.hn();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public void hnj() {
        apu apuVar = this.hnj;
        if (apuVar != null) {
            apuVar.hnj();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public ViewGroup qor() {
        return this.hnj;
    }
}
