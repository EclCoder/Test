package com.bytedance.sdk.component.adexpress.dynamic.hnj;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Cdo;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.apu;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.as;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bug;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dnm;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dse;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.eum;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fc;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gm;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hqh;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jip;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mjg;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nyv;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.oj;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ojm;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pty;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qor;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ta;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tgn;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tu;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.uua;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vf;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wu;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xyo;
import com.bytedance.sdk.component.adexpress.dynamic.gjv.aq;
import com.bytedance.sdk.component.adexpress.gjv;
import com.bytedance.sdk.component.adexpress.hn.orl;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    public static sk hnj(Context context, DynamicRootView dynamicRootView, aq aqVar) {
        orl renderRequest;
        if (context == null || dynamicRootView == null || aqVar == null || aqVar.ta() == null) {
            return null;
        }
        switch (aqVar.ta().hnj()) {
            case -1:
                return new nyv(context, dynamicRootView, aqVar);
            case 0:
                return new tu(context, dynamicRootView, aqVar);
            case 1:
                return new dnm(context, dynamicRootView, aqVar);
            case 2:
                return new dse(context, dynamicRootView, aqVar);
            case 3:
                return new ojm(context, dynamicRootView, aqVar);
            case 4:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.orl(context, dynamicRootView, aqVar);
            case 5:
                return new mjg(context, dynamicRootView, aqVar);
            case 6:
            case 9:
            case 17:
                return new dkl(context, dynamicRootView, aqVar);
            case 7:
                return new gm(context, dynamicRootView, aqVar);
            case 8:
                return new oj(context, dynamicRootView, aqVar);
            case 10:
                return new jip(context, dynamicRootView, aqVar);
            case 11:
                return new Cdo(context, dynamicRootView, aqVar);
            case 12:
                return new ta(context, dynamicRootView, aqVar);
            case 13:
                return new tgn(context, dynamicRootView, aqVar);
            case 14:
                return new xyo(context, dynamicRootView, aqVar);
            case 15:
                return gjv.hn() ? new vf(context, dynamicRootView, aqVar) : new hqh(context, dynamicRootView, aqVar);
            case 16:
                return new dnm(context, dynamicRootView, aqVar);
            case 18:
                return new as(context, dynamicRootView, aqVar);
            case 19:
                return new wu(context, dynamicRootView, aqVar);
            case 20:
                return new apu(context, dynamicRootView, aqVar);
            case 21:
                return new eum(context, dynamicRootView, aqVar);
            case 22:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.aq(context, dynamicRootView, aqVar);
            case 23:
                return new uua(context, dynamicRootView, aqVar);
            case 24:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gjv(context, dynamicRootView, aqVar);
            case 25:
                return new bug(context, dynamicRootView, aqVar);
            case 26:
                return "vertical".equals(aqVar.ta().sk().vh()) ? new pty(context, dynamicRootView, aqVar) : new qor(context, dynamicRootView, aqVar);
            case 27:
                return new hqh(context, dynamicRootView, aqVar);
            case 28:
                if (!gjv.hn() || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
                    return null;
                }
                return new fc(context, dynamicRootView, aqVar, renderRequest.m10do());
            default:
                return null;
        }
    }
}
