package com.bytedance.sdk.openadsdk.core.orl.hnj.hnj;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.orl.ta;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    public static Set<ta> hnj(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ta taVarHnj;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(sk.dse, "vendor");
                    String strHn = null;
                    String strHn2 = null;
                    String strHn3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(sk.dse, NotificationCompat.CATEGORY_EVENT))) {
                                            break;
                                        } else {
                                            strHn3 = sk.hn(xmlPullParser, "Tracking");
                                            break;
                                        }
                                        break;
                                    case "JavaScriptResource":
                                        if (!CampaignEx.KEY_OMID.equals(xmlPullParser.getAttributeValue(sk.dse, "apiFramework"))) {
                                            break;
                                        } else {
                                            strHn = sk.hn(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                        break;
                                    case "VerificationParameters":
                                        strHn2 = sk.hn(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(strHn) && (taVarHnj = ta.hnj(strHn, attributeValue, strHn2, strHn3)) != null) {
                            hashSet.add(taVarHnj);
                        }
                    }
                } else {
                    sk.hnj(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
