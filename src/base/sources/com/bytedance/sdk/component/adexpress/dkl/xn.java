package com.bytedance.sdk.component.adexpress.dkl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class xn extends oj {
    private TextView hnj;

    public xn(Context context, View view, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context, view, i10, i11, i12, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.dkl.oj
    protected void hnj(Context context, View view) {
        addView(view);
        this.hnj = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.dkl.oj
    public void setShakeText(String str) {
        if (this.hnj == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.hnj.setText(str);
            return;
        }
        try {
            this.hnj.setText(com.bytedance.sdk.component.utils.wu.hn(this.hnj.getContext(), "tt_splash_default_click_shake"));
        } catch (Exception e10) {
            e10.getMessage();
        }
    }
}
