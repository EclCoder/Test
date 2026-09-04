package com.bytedance.sdk.openadsdk.core.orl.hnj.hnj;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.googlecode.mp4parser.boxes.microsoft.lIu.trPLwhKZgZ;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hnj {
    public static com.bytedance.sdk.openadsdk.core.orl.qor hnj(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        sk.hnj hnjVar;
        int i10;
        byte b10;
        if (context == null) {
            sk.hnj(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        float f10 = displayMetrics.density;
        int i13 = (int) (i11 / f10);
        int i14 = (int) (i12 / f10);
        float f11 = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.orl.qor qorVar = null;
        while (true) {
            int i15 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("CompanionAds")) {
                return qorVar;
            }
            xmlPullParser.next();
            int i16 = 2;
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                String str = trPLwhKZgZ.yqLSZP;
                if (name.equals(str)) {
                    String str2 = sk.dse;
                    int iHn = sk.hn(xmlPullParser.getAttributeValue(str2, "width"));
                    int iHn2 = sk.hn(xmlPullParser.getAttributeValue(str2, "height"));
                    if (iHn < 300 || iHn2 < 250) {
                        sk.hnj(xmlPullParser);
                        f11 = f11;
                        qorVar = qorVar;
                    } else {
                        sk.hnj hnjVar2 = new sk.hnj();
                        while (true) {
                            if (xmlPullParser.getEventType() != i15 || !xmlPullParser.getName().equals(str)) {
                                iHn2 = iHn2;
                                iHn = iHn;
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == i16) {
                                    String name2 = xmlPullParser.getName();
                                    name2.getClass();
                                    f11 = f11;
                                    qorVar = qorVar;
                                    byte b11 = -1;
                                    switch (name2.hashCode()) {
                                        case -375340334:
                                            if (name2.equals("IFrameResource")) {
                                                b10 = 0;
                                                b11 = b10;
                                                break;
                                            }
                                            break;
                                        case -348198615:
                                            if (name2.equals("CompanionClickThrough")) {
                                                b10 = 1;
                                                b11 = b10;
                                                break;
                                            }
                                            break;
                                        case 611554000:
                                            if (name2.equals("TrackingEvents")) {
                                                b11 = 2;
                                            }
                                            break;
                                        case 676623548:
                                            if (name2.equals("StaticResource")) {
                                                b11 = 3;
                                            }
                                            break;
                                        case 1877773523:
                                            if (name2.equals("CompanionClickTracking")) {
                                                b10 = 4;
                                                b11 = b10;
                                                break;
                                            }
                                            break;
                                        case 1928285401:
                                            if (name2.equals("HTMLResource")) {
                                                b10 = 5;
                                                b11 = b10;
                                                break;
                                            }
                                            break;
                                    }
                                    switch (b11) {
                                        case 0:
                                            sk.hnj hnjVar3 = hnjVar2;
                                            i10 = 2;
                                            Point pointHnj = com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hnj(context, iHn, iHn2, com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn.HTML_RESOURCE);
                                            int i17 = pointHnj.x;
                                            int i18 = pointHnj.y;
                                            com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn hnVar = com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn.IFRAME_RESOURCE;
                                            com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj enumC0231hnj = com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj.NONE;
                                            float fHnj = com.bytedance.sdk.openadsdk.core.orl.qor.hnj(i13, i14, i17, i18, hnVar, enumC0231hnj);
                                            String strHn = sk.hn(xmlPullParser, "IFrameResource");
                                            if (!TextUtils.isEmpty(strHn) && fHnj > hnjVar3.dse && fHnj > f11) {
                                                hnjVar3.dse = fHnj;
                                                hnjVar3.hnj(strHn, enumC0231hnj, hnVar);
                                                hnjVar2 = hnjVar3;
                                                i16 = i10;
                                                iHn = iHn;
                                                iHn2 = iHn2;
                                                f11 = f11;
                                                qorVar = qorVar;
                                                i15 = 3;
                                            } else {
                                                sk.hnj(xmlPullParser, "IFrameResource", 3);
                                                hnjVar2 = hnjVar3;
                                                i15 = 3;
                                                i16 = 2;
                                            }
                                            break;
                                        case 1:
                                            i10 = 2;
                                            hnjVar2.gjv = sk.hn(xmlPullParser, "CompanionClickThrough");
                                            i16 = i10;
                                            iHn = iHn;
                                            iHn2 = iHn2;
                                            f11 = f11;
                                            qorVar = qorVar;
                                            i15 = 3;
                                            break;
                                        case 2:
                                            hnjVar = hnjVar2;
                                            while (true) {
                                                if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                    hnjVar2 = hnjVar;
                                                    iHn2 = iHn2;
                                                    f11 = f11;
                                                    qorVar = qorVar;
                                                    i15 = 3;
                                                    i16 = 2;
                                                    break;
                                                } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                    hnjVar.hn(sk.hn(xmlPullParser, "Tracking"));
                                                }
                                            }
                                            break;
                                        case 3:
                                            hnjVar = hnjVar2;
                                            com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj enumC0231hnj2 = com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj.NONE;
                                            String lowerCase = xmlPullParser.getAttributeValue(sk.dse, "creativeType").toLowerCase();
                                            Set<String> set = com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hnj;
                                            com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj enumC0231hnj3 = set.contains(lowerCase) ? com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj.IMAGE : com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj.JAVASCRIPT;
                                            com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn hnVar2 = com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn.STATIC_RESOURCE;
                                            Point pointHnj2 = com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hnj(context, iHn, iHn2, hnVar2);
                                            float fHnj2 = com.bytedance.sdk.openadsdk.core.orl.qor.hnj(i13, i14, pointHnj2.x, pointHnj2.y, hnVar2, enumC0231hnj3);
                                            String strHn2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.orl.qor.hnj.f14145hn.contains(lowerCase)) ? sk.hn(xmlPullParser, "StaticResource") : null;
                                            if (fHnj2 >= hnjVar.dse && fHnj2 > f11 && !TextUtils.isEmpty(strHn2)) {
                                                hnjVar.dse = fHnj2;
                                                hnjVar.hnj(strHn2, enumC0231hnj3, hnVar2);
                                                hnjVar2 = hnjVar;
                                                iHn2 = iHn2;
                                                f11 = f11;
                                                qorVar = qorVar;
                                                i15 = 3;
                                                i16 = 2;
                                            } else {
                                                sk.hnj(xmlPullParser, "StaticResource", 3);
                                                iHn = iHn;
                                                hnjVar2 = hnjVar;
                                                iHn2 = iHn2;
                                                f11 = f11;
                                                i16 = 2;
                                                i15 = 3;
                                                qorVar = qorVar;
                                            }
                                            break;
                                        case 4:
                                            hnjVar2.hnj(sk.hn(xmlPullParser, "CompanionClickTracking"));
                                            iHn2 = iHn2;
                                            f11 = f11;
                                            qorVar = qorVar;
                                            i15 = 3;
                                            i16 = 2;
                                            break;
                                        case 5:
                                            com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn hnVar3 = com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn.HTML_RESOURCE;
                                            Point pointHnj3 = com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hnj(context, iHn, iHn2, hnVar3);
                                            int i19 = pointHnj3.x;
                                            int i20 = pointHnj3.y;
                                            com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj enumC0231hnj4 = com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj.NONE;
                                            hnjVar = hnjVar2;
                                            float fHnj3 = com.bytedance.sdk.openadsdk.core.orl.qor.hnj(i13, i14, i19, i20, hnVar3, enumC0231hnj4);
                                            String strHn3 = sk.hn(xmlPullParser, "HTMLResource");
                                            if (!TextUtils.isEmpty(strHn3) && fHnj3 > hnjVar.dse && fHnj3 > f11) {
                                                hnjVar.dse = fHnj3;
                                                hnjVar.hnj(strHn3, enumC0231hnj4, hnVar3);
                                                hnjVar2 = hnjVar;
                                                iHn2 = iHn2;
                                                f11 = f11;
                                                qorVar = qorVar;
                                                i15 = 3;
                                                i16 = 2;
                                            } else {
                                                sk.hnj(xmlPullParser, "HTMLResource", 3);
                                                hnjVar2 = hnjVar;
                                                i16 = 2;
                                                i15 = 3;
                                            }
                                            break;
                                        default:
                                            sk.hnj(xmlPullParser);
                                            hnjVar = hnjVar2;
                                            hnjVar2 = hnjVar;
                                            iHn2 = iHn2;
                                            f11 = f11;
                                            qorVar = qorVar;
                                            i15 = 3;
                                            i16 = 2;
                                            break;
                                    }
                                } else {
                                    iHn = iHn;
                                    iHn2 = iHn2;
                                }
                            } else if (!TextUtils.isEmpty(hnjVar2.hnj) && hnjVar2.dse >= f11) {
                                com.bytedance.sdk.openadsdk.core.orl.qor qorVar2 = new com.bytedance.sdk.openadsdk.core.orl.qor(iHn, iHn2, hnjVar2.f14129hn, hnjVar2.qor, hnjVar2.hnj, hnjVar2.f14130sk, hnjVar2.dkl, hnjVar2.gjv);
                                f11 = hnjVar2.dse;
                                qorVar = qorVar2;
                            }
                        }
                    }
                }
            }
            f11 = f11;
            qorVar = qorVar;
        }
    }
}
