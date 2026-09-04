package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class fc extends dkl {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    com.bytedance.sdk.component.adexpress.dynamic.gjv.aq f12534hn;
    String hnj;

    public fc(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar, String str) {
        super(context, dynamicRootView, aqVar);
        this.hnj = str;
        this.f12534hn = aqVar;
        com.bytedance.sdk.component.adexpress.dkl.ta lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }

    private com.bytedance.sdk.component.adexpress.dkl.ta getLottieView() {
        com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar = this.orl;
        if (aqVar == null || aqVar.ta() == null || this.dnm == null || TextUtils.isEmpty(this.hnj)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVarSk = this.orl.ta().sk();
        String strIdl = dklVarSk != null ? dklVarSk.idl() : "";
        if (TextUtils.isEmpty(strIdl)) {
            return null;
        }
        String str = this.hnj + "static/lotties/" + strIdl + ".json";
        com.bytedance.sdk.component.adexpress.dkl.ta taVar = new com.bytedance.sdk.component.adexpress.dkl.ta(this.dnm);
        taVar.setImageLottieTosPath(str);
        taVar.aq();
        return taVar;
    }
}
