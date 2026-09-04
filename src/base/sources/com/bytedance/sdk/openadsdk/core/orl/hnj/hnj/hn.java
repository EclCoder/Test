package com.bytedance.sdk.openadsdk.core.orl.hnj.hnj;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    public static com.bytedance.sdk.openadsdk.core.orl.hnj hnj(Context context, XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list, int i10, double d10) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, sk.dse, "InLine");
        com.bytedance.sdk.openadsdk.core.orl.hnj hnjVar = new com.bytedance.sdk.openadsdk.core.orl.hnj();
        while (true) {
            if (xmlPullParser.next() == 3 && "InLine".equals(xmlPullParser.getName())) {
                hnjVar.hnj().ta(list);
                return hnjVar;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                switch (name) {
                    case "AdVerifications":
                        hnjVar.hnj(gjv.hnj(xmlPullParser));
                        context = context;
                        break;
                    case "Creatives":
                        if (TextUtils.isEmpty(hnjVar.dse()) || hnjVar.qor() == null) {
                            while (xmlPullParser.next() != 3) {
                                if (xmlPullParser.getEventType() == 2) {
                                    if ("Creative".equals(xmlPullParser.getName())) {
                                        hnj(context, xmlPullParser, hnjVar, i10, d10);
                                    } else {
                                        sk.hnj(xmlPullParser);
                                    }
                                }
                            }
                        } else {
                            sk.hnj(xmlPullParser);
                        }
                        context = context;
                        xmlPullParser = xmlPullParser;
                        i10 = i10;
                        d10 = d10;
                        break;
                    case "Description":
                        hnjVar.hn(sk.hn(xmlPullParser, name));
                        break;
                    case "Error":
                        list.addAll(sk.hnj(xmlPullParser, name));
                        break;
                    case "Extensions":
                        while (true) {
                            if (xmlPullParser.getEventType() == 3 && "Extensions".equals(xmlPullParser.getName())) {
                                context = context;
                                xmlPullParser = xmlPullParser;
                                i10 = i10;
                                d10 = d10;
                                break;
                            } else {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                    hnjVar.hnj(gjv.hnj(xmlPullParser));
                                }
                            }
                        }
                        break;
                    case "AdTitle":
                        hnjVar.hnj(sk.hn(xmlPullParser, name));
                        break;
                    case "Impression":
                        hnjVar.hnj().hnj(sk.hnj(xmlPullParser, name));
                        break;
                    default:
                        sk.hnj(xmlPullParser);
                        context = context;
                        xmlPullParser = xmlPullParser;
                        i10 = i10;
                        d10 = d10;
                        break;
                }
            }
        }
    }

    public static void hnj(Context context, XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.orl.hnj hnjVar, int i10, double d10) {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(hnjVar.dse())) {
                    qor.hnj(xmlPullParser, hnjVar, i10, d10);
                } else if ("CompanionAds".equals(xmlPullParser.getName()) && hnjVar.qor() == null) {
                    hnjVar.hnj(hnj.hnj(context, xmlPullParser));
                } else {
                    sk.hnj(xmlPullParser);
                }
            }
        }
    }
}
