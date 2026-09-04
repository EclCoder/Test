package com.bytedance.sdk.openadsdk.core.bug.hn.hnj;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.hn.qor;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends qor<hnj> {
    private int dlk;
    private int hnj;
    private int iwu;

    /* JADX INFO: renamed from: lf, reason: collision with root package name */
    private int f13650lf;
    private com.bytedance.sdk.openadsdk.core.bug.hn pwt;

    /* JADX INFO: renamed from: vk, reason: collision with root package name */
    private int f13651vk;

    /* JADX INFO: renamed from: yo, reason: collision with root package name */
    private float f13652yo;

    public hn(Context context) {
        super(context);
        this.iwu = -1;
        this.dlk = -1;
        hnj(context);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hn() {
        super.hn();
        com.bytedance.adsdk.ugeno.ojm.dkl.hnj hnjVarHnj = ((hnj) this.f12293sk).hnj();
        if (hnjVarHnj != null) {
            this.pwt.hnj(hnjVarHnj);
            ((hnj) this.f12293sk).hnj(hnjVarHnj);
        }
        ((hnj) this.f12293sk).hnj(this.hnj, this.iwu, this.dlk, this.f13651vk, this.f13650lf, this.f13652yo);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    /* JADX INFO: renamed from: qor, reason: merged with bridge method [inline-methods] */
    public hnj hnj() {
        hnj hnjVar = new hnj(this.f12280hn);
        hnjVar.hnj(this);
        return hnjVar;
    }

    private void hnj(Context context) {
        this.pwt = new com.bytedance.sdk.openadsdk.core.bug.hn(context, true);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hnj(String str, String str2) {
        super.hnj(str, str2);
        str.getClass();
        switch (str) {
            case "barWidth":
                this.f13651vk = sq.hn(this.f12280hn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f));
                break;
            case "bottomBackgroundColor":
                if (!TextUtils.isEmpty(str2)) {
                    this.dlk = Color.parseColor(str2);
                    break;
                }
                break;
            case "shadowColor":
            case "shadowOffsetX":
            case "shadowOffsetY":
            case "textAlign":
            case "textColor":
            case "textStyle":
            case "shadowBlur":
            case "textSize":
            case "textDecoration":
            case "fontWeight":
            case "lineHeight":
            case "text":
            case "lines":
            case "ellipsis":
            case "maxLines":
            case "letterSpacing":
                this.pwt.hnj(str, str2);
                break;
            case "topBackgroundColor":
                if (!TextUtils.isEmpty(str2)) {
                    this.iwu = Color.parseColor(str2);
                    break;
                }
                break;
            case "barHeight":
                this.f13650lf = sq.hn(this.f12280hn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f));
                break;
            case "barRadius":
                this.f13652yo = sq.hn(this.f12280hn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f));
                break;
            case "downtime":
                this.hnj = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor, com.bytedance.adsdk.ugeno.gjv
    public void hnj(Canvas canvas) {
        super.hnj(canvas);
    }
}
