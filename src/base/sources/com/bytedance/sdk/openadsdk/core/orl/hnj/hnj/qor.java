package com.bytedance.sdk.openadsdk.core.orl.hnj.hnj;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    public static double hn(XmlPullParser xmlPullParser) {
        String[] strArrSplit = sk.hn(xmlPullParser, "Duration").split(":");
        if (strArrSplit.length != 3) {
            return 0.0d;
        }
        try {
            return (Integer.parseInt(strArrSplit[0].trim()) * 3600) + (Integer.parseInt(strArrSplit[1].trim()) * 60) + Float.parseFloat(strArrSplit[2].trim());
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public static void hnj(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.orl.hnj hnjVar, int i10, double d10) {
        boolean z10 = false;
        while (true) {
            if (xmlPullParser.next() != 3 || !xmlPullParser.getName().equals("Linear")) {
                if (xmlPullParser.getEventType() == 2) {
                    if (z10 && TextUtils.isEmpty(hnjVar.dse())) {
                        sk.hnj(xmlPullParser);
                    }
                    String name = xmlPullParser.getName();
                    name.getClass();
                    switch (name) {
                        case "VideoClicks":
                            hnj(xmlPullParser, hnjVar);
                            break;
                        case "Duration":
                            hnjVar.hnj(hn(xmlPullParser));
                            break;
                        case "MediaFiles":
                            hnj(xmlPullParser, i10, d10, hnjVar);
                            z10 = true;
                            break;
                        case "Icons":
                            com.bytedance.sdk.openadsdk.core.orl.hn hnVarHnj = hnj(xmlPullParser);
                            if (hnVarHnj != null && hnjVar.hn() == null) {
                                hnjVar.hnj(hnVarHnj);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "TrackingEvents":
                            hnj(xmlPullParser, hnjVar.hnj());
                            break;
                        default:
                            sk.hnj(xmlPullParser);
                            break;
                    }
                }
            } else {
                return;
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> qor(XmlPullParser xmlPullParser) {
        return hnj(xmlPullParser, false);
    }

    private static String hnj(XmlPullParser xmlPullParser, int i10, double d10, com.bytedance.sdk.openadsdk.core.orl.hnj hnjVar) {
        double d11 = Double.NEGATIVE_INFINITY;
        String str = null;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                break;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                String str2 = sk.dse;
                String attributeValue = xmlPullParser.getAttributeValue(str2, "type");
                int iHn = sk.hn(xmlPullParser.getAttributeValue(str2, "width"));
                int iHn2 = sk.hn(xmlPullParser.getAttributeValue(str2, "height"));
                int iHn3 = sk.hn(xmlPullParser.getAttributeValue(str2, "bitrate"));
                String strHn = sk.hn(xmlPullParser, "MediaFile");
                if (iHn > 0 && iHn2 > 0 && com.bytedance.sdk.openadsdk.core.orl.qor.gjv.hnj.contains(attributeValue) && !TextUtils.isEmpty(strHn)) {
                    double dHnj = com.bytedance.sdk.openadsdk.core.orl.qor.gjv.hnj(i10, d10, iHn, iHn2, iHn3, attributeValue);
                    if (dHnj > d11) {
                        str = strHn;
                        d11 = dHnj;
                        i11 = iHn;
                        i12 = iHn2;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            hnjVar.gjv(str);
            hnjVar.hnj(i11);
            hnjVar.hn(i12);
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x0108  */
    public static com.bytedance.sdk.openadsdk.core.orl.hn hnj(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        com.bytedance.sdk.openadsdk.core.orl.hn hnVar;
        int i10;
        int i11;
        int i12;
        com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj enumC0231hnj;
        com.bytedance.sdk.openadsdk.core.orl.hn hnVar2 = null;
        while (true) {
            int i13 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("Icons")) {
                return hnVar2;
            }
            xmlPullParser.next();
            int i14 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Icon")) {
                String str = sk.dse;
                int iHn = sk.hn(xmlPullParser.getAttributeValue(str, "width"));
                int iHn2 = sk.hn(xmlPullParser.getAttributeValue(str, "height"));
                if (iHn > 0 && iHn <= 300 && iHn2 > 0 && iHn2 <= 300) {
                    int iHnj = com.bytedance.sdk.openadsdk.core.orl.hn.hnj.hnj(xmlPullParser.getAttributeValue(str, "offset"));
                    int iHnj2 = com.bytedance.sdk.openadsdk.core.orl.hn.hnj.hnj(xmlPullParser.getAttributeValue(str, "duration"));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    sk.hnj hnjVar = null;
                    String strHn = null;
                    while (true) {
                        if (xmlPullParser.next() == i13 && xmlPullParser.getName().equals("Icon")) {
                            if (hnjVar != null && (hnVar2 == null || TextUtils.isEmpty(hnVar2.sk()))) {
                                hnVar2 = new com.bytedance.sdk.openadsdk.core.orl.hn(iHn, iHn2, iHnj, iHnj2, hnjVar.f14129hn, hnjVar.qor, hnjVar.hnj, arrayList, arrayList2, strHn);
                                sk.hnj(xmlPullParser, "Icons", i13);
                            }
                        } else {
                            ArrayList arrayList3 = arrayList;
                            ArrayList arrayList4 = arrayList2;
                            if (xmlPullParser.getEventType() == i14) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                hnVar = hnVar2;
                                i10 = iHnj2;
                                switch (name) {
                                    case "IconViewTracking":
                                        i11 = 3;
                                        i12 = 2;
                                        arrayList4.add(new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(sk.hn(xmlPullParser, "IconViewTracking")).hnj());
                                        break;
                                    case "IFrameResource":
                                        i11 = 3;
                                        i12 = 2;
                                        if (hnjVar == null) {
                                            hnjVar = new sk.hnj(sk.hn(xmlPullParser, "IFrameResource"), com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj.NONE, com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn.IFRAME_RESOURCE);
                                            break;
                                        } else {
                                            sk.hnj(xmlPullParser);
                                            break;
                                        }
                                        break;
                                    case "StaticResource":
                                        i11 = 3;
                                        i12 = 2;
                                        com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj enumC0231hnj2 = com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(sk.dse, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hnj;
                                        String strHn2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.orl.qor.hnj.f14145hn.contains(lowerCase)) ? sk.hn(xmlPullParser, "StaticResource") : null;
                                        if (set.contains(lowerCase)) {
                                            enumC0231hnj = com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj.IMAGE;
                                        } else {
                                            enumC0231hnj = com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj.JAVASCRIPT;
                                        }
                                        hnjVar = new sk.hnj(strHn2, enumC0231hnj, com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn.STATIC_RESOURCE);
                                        break;
                                    case "IconClicks":
                                        while (true) {
                                            i11 = 3;
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("IconClicks")) {
                                                i12 = 2;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("IconClickThrough")) {
                                                    strHn = sk.hn(xmlPullParser, "IconClickThrough");
                                                } else if (xmlPullParser.getName().equals("IconClickTracking")) {
                                                    arrayList3.add(new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(sk.hn(xmlPullParser, "IconClickTracking")).hnj());
                                                }
                                            }
                                        }
                                        break;
                                    case "HTMLResource":
                                        if (hnjVar == null || hnjVar.qor == com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn.IFRAME_RESOURCE) {
                                            hnjVar = new sk.hnj(sk.hn(xmlPullParser, "HTMLResource"), com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj.NONE, com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn.HTML_RESOURCE);
                                            hnVar2 = hnVar;
                                            iHnj2 = i10;
                                            i13 = 3;
                                            i14 = 2;
                                            break;
                                        } else {
                                            i11 = 3;
                                            i12 = 2;
                                            sk.hnj(xmlPullParser);
                                            break;
                                        }
                                        break;
                                    default:
                                        i11 = 3;
                                        i12 = 2;
                                        sk.hnj(xmlPullParser);
                                        break;
                                }
                                arrayList = arrayList3;
                                arrayList2 = arrayList4;
                            } else {
                                hnVar = hnVar2;
                                i10 = iHnj2;
                                i11 = i13;
                                i12 = i14;
                            }
                            i13 = i11;
                            i14 = i12;
                            hnVar2 = hnVar;
                            iHnj2 = i10;
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                        }
                    }
                } else {
                    sk.hnj(xmlPullParser);
                    hnVar2 = hnVar2;
                }
            } else {
                hnVar2 = hnVar2;
            }
        }
    }

    public static void hnj(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.orl.gjv gjvVar) throws XmlPullParserException, IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(sk.dse, NotificationCompat.CATEGORY_EVENT);
                    if (TextUtils.isEmpty(attributeValue)) {
                        sk.hnj(xmlPullParser, "Tracking", 3);
                    } else {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "midpoint":
                                gjvVar.hnj(sk.hn(xmlPullParser, "Tracking"), 0.5f);
                                break;
                            case "thirdQuartile":
                                gjvVar.hnj(sk.hn(xmlPullParser, "Tracking"), 0.75f);
                                break;
                            case "resume":
                                gjvVar.qor(hnj(xmlPullParser, true));
                                break;
                            case "unmute":
                                gjvVar.bug(hnj(xmlPullParser, true));
                                break;
                            case "complete":
                                gjvVar.gjv(qor(xmlPullParser));
                                break;
                            case "mute":
                                gjvVar.dnm(hnj(xmlPullParser, true));
                                break;
                            case "skip":
                                gjvVar.dkl(qor(xmlPullParser));
                                break;
                            case "close":
                                gjvVar.sk(qor(xmlPullParser));
                                break;
                            case "pause":
                                gjvVar.hn(hnj(xmlPullParser, true));
                                break;
                            case "start":
                            case "creativeView":
                                gjvVar.hnj(sk.hn(xmlPullParser, "Tracking"), 0L);
                                break;
                            case "firstQuartile":
                                gjvVar.hnj(sk.hn(xmlPullParser, "Tracking"), 0.25f);
                                break;
                        }
                    }
                } else if (xmlPullParser.getEventType() == 4) {
                    xmlPullParser.nextTag();
                } else {
                    sk.hnj(xmlPullParser);
                }
            }
        }
    }

    private static void hnj(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.orl.hnj hnjVar) {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (name.equals("ClickThrough")) {
                    hnjVar.qor(sk.hn(xmlPullParser, "ClickThrough"));
                } else if (!name.equals("ClickTracking")) {
                    sk.hnj(xmlPullParser);
                } else {
                    hnjVar.hnj().dse(sk.hnj(xmlPullParser, "ClickTracking"));
                }
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> hnj(XmlPullParser xmlPullParser, boolean z10) {
        return sk.hnj(xmlPullParser, "Tracking", z10);
    }
}
