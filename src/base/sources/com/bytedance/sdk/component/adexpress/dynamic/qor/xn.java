package com.bytedance.sdk.component.adexpress.dynamic.qor;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dkl.tu;
import com.bytedance.sdk.component.utils.wu;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class xn implements dse<tu> {
    private com.bytedance.sdk.component.adexpress.dynamic.gjv.ta dkl;
    private com.bytedance.sdk.component.adexpress.dynamic.gjv.dse gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Context f12660hn;
    private tu hnj;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private String f12661sk;

    public xn(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk skVar, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar, String str, com.bytedance.sdk.component.adexpress.dynamic.gjv.ta taVar) {
        this.f12660hn = context;
        this.qor = skVar;
        this.gjv = dseVar;
        this.f12661sk = str;
        this.dkl = taVar;
        sk();
    }

    private void sk() {
        int iPv = this.gjv.pv();
        final com.bytedance.sdk.component.adexpress.dynamic.dkl.hnj dynamicClickListener = this.qor.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable unused) {
        }
        if ("18".equals(this.f12661sk)) {
            Context context = this.f12660hn;
            tu tuVar = new tu(context, com.bytedance.sdk.component.adexpress.qor.hnj.ojm(context), this.dkl);
            this.hnj = tuVar;
            if (tuVar.getWriggleLayout() != null) {
                this.hnj.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.hnj.getTopTextView() != null) {
                if (TextUtils.isEmpty(this.gjv.hkr())) {
                    this.hnj.getTopTextView().setText(wu.hn(this.f12660hn, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    this.hnj.getTopTextView().setText(this.gjv.hkr());
                }
            }
        } else {
            Context context2 = this.f12660hn;
            this.hnj = new tu(context2, com.bytedance.sdk.component.adexpress.qor.hnj.ojm(context2), this.dkl);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.hnj.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.f12660hn, iPv)));
        this.hnj.setLayoutParams(layoutParams);
        this.hnj.setShakeText(this.gjv.eta());
        this.hnj.setClipChildren(false);
        final View wriggleProgressIv = this.hnj.getWriggleProgressIv();
        this.hnj.setOnShakeViewListener(new tu.hnj() { // from class: com.bytedance.sdk.component.adexpress.dynamic.qor.xn.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    /* JADX INFO: renamed from: gjv, reason: merged with bridge method [inline-methods] */
    public tu qor() {
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
