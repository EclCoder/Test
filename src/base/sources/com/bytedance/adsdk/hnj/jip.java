package com.bytedance.adsdk.hnj;

import android.text.TextUtils;
import o4.Wz.OGoz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class jip {
    public static Object hnj(com.bytedance.adsdk.hnj.hn.hnj.hnj hnjVar) {
        ojm ojmVarHnj;
        if (hnjVar == null || (ojmVarHnj = hnj(hnjVar.hnj())) == null) {
            return null;
        }
        return ojmVarHnj.hnj(null, hnjVar.hn());
    }

    public static ojm hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1919300188:
                if (str.equals("toNumber")) {
                    b10 = 0;
                }
                break;
            case -1776922004:
                if (str.equals("toString")) {
                    b10 = 1;
                }
                break;
            case -1368121510:
                if (str.equals("formatDecimal")) {
                    b10 = 2;
                }
                break;
            case -652088201:
                if (str.equals("modArray")) {
                    b10 = 3;
                }
                break;
            case 3143097:
                if (str.equals("find")) {
                    b10 = 4;
                }
                break;
            case 3530753:
                if (str.equals("size")) {
                    b10 = 5;
                }
                break;
            case 94642797:
                if (str.equals("chunk")) {
                    b10 = 6;
                }
                break;
            case 96955127:
                if (str.equals("exist")) {
                    b10 = 7;
                }
                break;
            case 109648666:
                if (str.equals("split")) {
                    b10 = 8;
                }
                break;
            case 515198113:
                if (str.equals(OGoz.iBuPfRSCUUpyEZ)) {
                    b10 = 9;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    b10 = 10;
                }
                break;
            case 1508134777:
                if (str.equals("encodeUrl")) {
                    b10 = 11;
                }
                break;
            case 2056988195:
                if (str.equals("isDigit")) {
                    b10 = 12;
                }
                break;
        }
        switch (b10) {
            case 0:
                return new orl();
            case 1:
                return new mjg();
            case 2:
                return new dse();
            case 3:
                return new ta();
            case 4:
                return new dkl();
            case 5:
                return new dnm();
            case 6:
                return new hnj();
            case 7:
                return new sk();
            case 8:
                return new bug();
            case 9:
                return new hn();
            case 10:
                return new fc();
            case 11:
                return new gjv();
            case 12:
                return new aq();
            default:
                return null;
        }
    }
}
