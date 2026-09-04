package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm {
    private com.bytedance.sdk.openadsdk.core.widget.uua gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected Context f13279hn;
    protected View hnj = sk();
    private com.bytedance.sdk.openadsdk.core.widget.aq qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.dkl.aq f13280sk;

    public dnm(Context context) {
        this.f13279hn = context;
    }

    private View sk() {
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(this.f13279hn);
        skVar.setGravity(1);
        skVar.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.uua uuaVar = new com.bytedance.sdk.openadsdk.core.widget.uua(this.f13279hn);
        this.gjv = uuaVar;
        uuaVar.setId(520093745);
        int iHn = sq.hn(this.f13279hn, 64.0f);
        skVar.addView(this.gjv, new LinearLayout.LayoutParams(iHn, iHn));
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(this.f13279hn);
        this.f13280sk = aqVar;
        aqVar.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(sq.hn(this.f13279hn, 219.0f), -2);
        layoutParams.topMargin = sq.hn(this.f13279hn, 16.0f);
        this.f13280sk.setLayoutParams(layoutParams);
        this.f13280sk.setEllipsize(TextUtils.TruncateAt.END);
        this.f13280sk.setGravity(17);
        this.f13280sk.setMaxWidth(sq.hn(this.f13279hn, 150.0f));
        this.f13280sk.setMaxLines(2);
        this.f13280sk.setTextColor(-1);
        this.f13280sk.setTextSize(1, 16.0f);
        skVar.addView(this.f13280sk);
        this.qor = new com.bytedance.sdk.openadsdk.core.widget.aq(this.f13279hn);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(sq.hn(this.f13279hn, 219.0f), sq.hn(this.f13279hn, 6.0f));
        layoutParams2.topMargin = sq.hn(this.f13279hn, 32.0f);
        skVar.addView(this.qor, layoutParams2);
        return skVar;
    }

    public void gjv() {
        this.hnj = null;
        this.f13279hn = null;
    }

    public com.bytedance.sdk.openadsdk.core.widget.uua hn() {
        return this.gjv;
    }

    public View hnj() {
        return this.hnj;
    }

    public com.bytedance.sdk.openadsdk.core.dkl.aq qor() {
        return this.f13280sk;
    }

    public void hnj(int i10) {
        this.qor.setProgress(i10);
    }
}
