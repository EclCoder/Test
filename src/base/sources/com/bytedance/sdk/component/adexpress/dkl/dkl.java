package com.bytedance.sdk.component.adexpress.dkl;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends eum {
    private xn hnj;

    public dkl(Context context, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        hnj(context, i10, i11, i12, jSONObject);
    }

    private void hnj(Context context, int i10, int i11, int i12, JSONObject jSONObject) {
        xn xnVar = new xn(context, com.bytedance.sdk.component.adexpress.qor.hnj.qor(context), i10, i11, i12, jSONObject);
        this.hnj = xnVar;
        addView(xnVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.hnj.setLayoutParams(layoutParams);
    }

    public xn getShakeView() {
        return this.hnj;
    }

    public void setShakeText(String str) {
        if (this.hnj == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.hnj.setShakeText("");
        } else {
            this.hnj.setShakeText(str);
        }
    }
}
