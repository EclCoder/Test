package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.as;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class orl {
    private boolean aq;
    private final String dkl;
    private eum dse;
    private com.bytedance.sdk.component.ojm.dkl gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private RelativeLayout f13310hn;
    private final as hnj;
    private final Context qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private ImageView f13311sk;

    public orl(Context context, as asVar, String str, boolean z10) {
        this.qor = context;
        this.hnj = asVar;
        this.dkl = str;
        this.aq = z10;
        sk();
    }

    private static RelativeLayout hnj(Context context, boolean z10) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new ojm(context));
        com.bytedance.sdk.component.ojm.dkl.qor qorVar = com.bytedance.sdk.component.ojm.dkl.qor.LANDING_PAGE;
        new com.bytedance.sdk.component.ojm.dkl(context, qorVar);
        com.bytedance.sdk.component.ojm.dkl dklVar = z10 ? new com.bytedance.sdk.component.ojm.dkl(context, com.bytedance.sdk.component.ojm.dkl.qor.PRIVACY) : new com.bytedance.sdk.component.ojm.dkl(context, qorVar);
        dklVar.setId(com.bytedance.sdk.openadsdk.utils.jip.pv);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        layoutParams.addRule(3, com.bytedance.sdk.openadsdk.utils.jip.idl);
        if (z10) {
            relativeLayout.addView(dklVar, layoutParams);
        }
        return relativeLayout;
    }

    private void sk() {
        RelativeLayout relativeLayoutHnj = hnj(this.qor, this.aq);
        this.f13310hn = relativeLayoutHnj;
        this.gjv = (com.bytedance.sdk.component.ojm.dkl) relativeLayoutHnj.findViewById(com.bytedance.sdk.openadsdk.utils.jip.pv);
        eum eumVar = new eum(this.qor, (RelativeLayout) this.f13310hn.findViewById(com.bytedance.sdk.openadsdk.utils.jip.idl), this.hnj, this.gjv, this.dkl, this.aq);
        this.dse = eumVar;
        this.f13311sk = eumVar.qor();
    }

    public View gjv() {
        return this.f13310hn;
    }

    public void hn() {
        eum eumVar = this.dse;
        if (eumVar != null) {
            eumVar.hn();
        }
    }

    public com.bytedance.sdk.component.ojm.dkl qor() {
        return this.gjv;
    }

    public void hn(String str) {
        this.dse.hn(str);
    }

    public void hnj() {
        eum eumVar = this.dse;
        if (eumVar != null) {
            eumVar.hnj();
        }
    }

    public void hnj(WebView webView, com.bytedance.sdk.openadsdk.core.widget.hnj.dkl.hnj hnjVar) {
        eum eumVar = this.dse;
        if (eumVar != null) {
            eumVar.hnj(webView, hnjVar);
        }
    }

    public void hnj(String str) {
        this.dse.hnj(str);
    }

    public void hnj(boolean z10) {
        this.dse.hnj(z10);
    }
}
