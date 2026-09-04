package com.bytedance.sdk.openadsdk.core.bug.hn.gjv;

import android.content.Context;
import com.bytedance.adsdk.ugeno.dse.aq;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class qor extends com.bytedance.adsdk.ugeno.hn.qor<hnj> {
    private int dlk;
    private String hnj;
    private int iwu;

    /* JADX INFO: renamed from: lf, reason: collision with root package name */
    private float f13636lf;

    /* JADX INFO: renamed from: vk, reason: collision with root package name */
    private float f13637vk;

    public qor(Context context) {
        super(context);
        this.hnj = "line";
        this.iwu = com.bytedance.adsdk.ugeno.dse.hnj.hnj("#FFD813");
        this.dlk = com.bytedance.adsdk.ugeno.dse.hnj.hnj("rgba(0, 0, 0, 0.5)");
        this.f13637vk = aq.hnj(this.f12280hn, 1.0f);
    }

    public void dse(int i10) {
        ((hnj) this.f12293sk).setAnimationDuration(i10);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hn() {
        super.hn();
        ((hnj) this.f12293sk).hnj(this.hnj).hnj(this.iwu).hn(this.dlk).hn(this.f13636lf).hnj(this.f13637vk);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    /* JADX INFO: renamed from: qor, reason: merged with bridge method [inline-methods] */
    public hnj hnj() {
        hnj hnjVar = new hnj(this.f12280hn);
        hnjVar.hnj(this);
        return hnjVar;
    }

    public void hnj(int i10) {
        ((hnj) this.f12293sk).setProgress(i10);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hnj(String str, String str2) {
        super.hnj(str, str2);
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -885150488:
                if (str.equals("progressBackgroundColor")) {
                    b10 = 0;
                }
                break;
            case 717567950:
                if (str.equals(NpmRNZ.NtPeviMrAjrx)) {
                    b10 = 1;
                }
                break;
            case 717612807:
                if (str.equals("progressType")) {
                    b10 = 2;
                }
                break;
            case 755159350:
                if (str.equals("progressColor")) {
                    b10 = 3;
                }
                break;
            case 1048459909:
                if (str.equals("barRadius")) {
                    b10 = 4;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.dlk = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str2);
                break;
            case 1:
                this.f13637vk = aq.hnj(this.f12280hn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 1.0f));
                break;
            case 2:
                this.hnj = str2;
                break;
            case 3:
                this.iwu = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str2);
                break;
            case 4:
                if (com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f) <= 0.0f) {
                    this.f13636lf = 0.0f;
                } else {
                    this.f13636lf = aq.hnj(this.f12280hn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f));
                }
                break;
        }
    }
}
