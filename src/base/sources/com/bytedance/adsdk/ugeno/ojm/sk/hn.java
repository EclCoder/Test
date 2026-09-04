package com.bytedance.adsdk.ugeno.ojm.sk;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.adsdk.ugeno.hn.qor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends qor<hnj> {
    private float dlk;
    private int hnj;
    private int iwu;

    /* JADX INFO: renamed from: lf, reason: collision with root package name */
    private float f12381lf;

    /* JADX INFO: renamed from: vk, reason: collision with root package name */
    private float f12382vk;

    /* JADX INFO: renamed from: yo, reason: collision with root package name */
    private static final int f12380yo = Color.parseColor("#FFC642");
    private static final int pwt = Color.parseColor("#e3e3e4");

    public hn(Context context) {
        super(context);
        this.hnj = f12380yo;
        this.iwu = pwt;
        this.dlk = 4.0f;
        this.f12382vk = 20.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hn() {
        super.hn();
        if (pty()) {
            ((hnj) this.f12293sk).hnj(this.dlk, this.hnj, this.iwu, this.f12382vk, (int) this.f12381lf);
        } else {
            ((hnj) this.f12293sk).hnj(this.dlk, this.hnj, this.iwu, this.f12382vk, 5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    /* JADX INFO: renamed from: qor, reason: merged with bridge method [inline-methods] */
    public hnj hnj() {
        hnj hnjVar = new hnj(this.f12280hn);
        hnjVar.hnj(this);
        return hnjVar;
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hnj(String str, String str2) {
        super.hnj(str, str2);
        str.getClass();
        switch (str) {
            case "highLightColor":
            case "highlightColor":
                this.hnj = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str2);
                break;
            case "lowLightColor":
            case "lowlightColor":
                this.iwu = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str2, pwt);
                break;
            case "gap":
                this.f12381lf = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                break;
            case "size":
                this.f12382vk = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 20.0f);
                break;
            case "score":
                this.dlk = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 4.0f);
                break;
        }
    }
}
