package com.bytedance.sdk.component.adexpress.dynamic.qor;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta {
    public static dse hnj(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk skVar, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar, com.bytedance.sdk.component.adexpress.dynamic.gjv.ta taVar, com.bytedance.sdk.component.adexpress.hn.orl orlVar) {
        String str = null;
        if (context == null || skVar == null || dseVar == null) {
            return null;
        }
        String strXad = dseVar.xad();
        String strM10do = orlVar.m10do();
        strXad.getClass();
        switch (strXad) {
            case "0":
                return new sk(context, skVar, dseVar);
            case "1":
                return new qor(context, skVar, dseVar);
            case "2":
                return new hn(context, skVar, dseVar);
            case "5":
                return dseVar.dzo() == 1 ? new uua(context, skVar, dseVar, dseVar.qb()) : new jip(context, skVar, dseVar);
            case "6":
            case "11":
                return new mjg(context, skVar, dseVar);
            case "7":
            case "14":
                return new bug(context, skVar, dseVar);
            case "8":
                return new orl(context, skVar, dseVar);
            case "9":
            case "16":
                return new fc(context, skVar, dseVar, strXad, taVar.hnj(), taVar.hn(), taVar.gjv(), taVar.dse());
            case "10":
                return new gjv(context, skVar, dseVar);
            case "12":
                return new jip(context, skVar, dseVar);
            case "13":
                return new uua(context, skVar, dseVar);
            case "17":
            case "18":
                return new xn(context, skVar, dseVar, strXad, taVar);
            case "20":
                if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
                    return new dnm(context, skVar, dseVar, strM10do + "static/lotties/glass-swipe/glass-swipe.json", "20");
                }
                if (!TextUtils.isEmpty(strM10do)) {
                    str = strM10do + "brush_mask.json";
                }
                return new dnm(context, skVar, dseVar, str, "20");
            case "22":
                if (!com.bytedance.sdk.component.adexpress.gjv.hn()) {
                    return new oj(context, skVar, dseVar);
                }
                return new dnm(context, skVar, dseVar, strM10do + "static/lotties/202327swiper-up-star/index.json", "22");
            case "23":
                if (!com.bytedance.sdk.component.adexpress.gjv.hn()) {
                    return null;
                }
                return new dnm(context, skVar, dseVar, strM10do + "static/lotties/202327swiper-up-star/click.json", "23");
            case "24":
                if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
                    return new hnj(context, skVar, dseVar);
                }
                if (!TextUtils.isEmpty(strM10do)) {
                    str = strM10do + "swiper_up_star.json";
                }
                return new dnm(context, skVar, dseVar, str, "24");
            case "25":
                if (!com.bytedance.sdk.component.adexpress.gjv.hn()) {
                    return null;
                }
                return new dnm(context, skVar, dseVar, strM10do + "static/lotties/gesture-slide.json", "25");
            case "29":
                return new dkl(context, skVar, dseVar, taVar.hnj(), taVar.hn(), taVar.gjv(), taVar.dse());
            default:
                return null;
        }
    }
}
