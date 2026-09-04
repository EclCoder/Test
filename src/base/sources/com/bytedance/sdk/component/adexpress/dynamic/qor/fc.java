package com.bytedance.sdk.component.adexpress.dynamic.qor;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class fc implements dse<com.bytedance.sdk.component.adexpress.dkl.oj> {
    private int aq;
    private int dkl;
    private int dse;
    private com.bytedance.sdk.component.adexpress.dynamic.gjv.dse gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Context f12630hn;
    private com.bytedance.sdk.component.adexpress.dkl.oj hnj;
    private JSONObject ojm;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private String f12631sk;

    public fc(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk skVar, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar, String str, int i10, int i11, int i12, JSONObject jSONObject) {
        this.f12630hn = context;
        this.qor = skVar;
        this.gjv = dseVar;
        this.f12631sk = str;
        this.dkl = i10;
        this.dse = i11;
        this.aq = i12;
        this.ojm = jSONObject;
        sk();
    }

    private void sk() {
        final com.bytedance.sdk.component.adexpress.dynamic.dkl.hnj dynamicClickListener = this.qor.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.f12631sk)) {
            Context context = this.f12630hn;
            com.bytedance.sdk.component.adexpress.dkl.oj ojVar = new com.bytedance.sdk.component.adexpress.dkl.oj(context, com.bytedance.sdk.component.adexpress.qor.hnj.aq(context), this.dkl, this.dse, this.aq, this.ojm);
            this.hnj = ojVar;
            if (ojVar.getShakeLayout() != null) {
                this.hnj.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.f12630hn;
            this.hnj = new com.bytedance.sdk.component.adexpress.dkl.oj(context2, com.bytedance.sdk.component.adexpress.qor.hnj.dse(context2), this.dkl, this.dse, this.aq, this.ojm);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.hnj.setGravity(17);
        layoutParams.gravity = 17;
        this.hnj.setLayoutParams(layoutParams);
        this.hnj.setTranslationY(com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.f12630hn, this.gjv.idl()));
        this.hnj.setShakeText(this.gjv.eta());
        this.hnj.setClipChildren(false);
        this.hnj.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.dkl.oj.hnj() { // from class: com.bytedance.sdk.component.adexpress.dynamic.qor.fc.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    /* JADX INFO: renamed from: gjv, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.dkl.oj qor() {
        return this.hnj;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public void hn() {
        this.hnj.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public void hnj() {
        this.hnj.hnj();
    }
}
