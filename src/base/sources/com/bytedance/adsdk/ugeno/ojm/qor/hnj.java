package com.bytedance.adsdk.ugeno.ojm.qor;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.ojm.gjv.qor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hnj extends qor {

    /* JADX INFO: renamed from: lf, reason: collision with root package name */
    private int f12379lf;

    public hnj(Context context) {
        super(context);
        this.f12379lf = -16777216;
    }

    private String fc(String str) {
        String strOrl = orl(str);
        return TextUtils.isEmpty(strOrl) ? "" : "local://".concat(String.valueOf(strOrl));
    }

    @Override // com.bytedance.adsdk.ugeno.ojm.gjv.qor, com.bytedance.adsdk.ugeno.hn.qor
    public void hn() {
        ((qor) this).hnj = fc(((qor) this).hnj);
        super.hn();
        ((com.bytedance.adsdk.ugeno.ojm.gjv.hnj) this.f12293sk).setColorFilter(this.f12379lf);
        ((com.bytedance.adsdk.ugeno.ojm.gjv.hnj) this.f12293sk).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    @Override // com.bytedance.adsdk.ugeno.ojm.gjv.qor, com.bytedance.adsdk.ugeno.hn.qor
    public void hnj(String str, String str2) {
        super.hnj(str, str2);
        str.getClass();
        if (str.equals("textColor")) {
            this.f12379lf = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str2);
        }
    }

    public abstract String orl(String str);

    @Override // com.bytedance.adsdk.ugeno.ojm.gjv.qor
    protected String qor() {
        return "drawable";
    }
}
