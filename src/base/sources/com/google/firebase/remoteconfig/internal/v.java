package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v {
    /* JADX WARN: Code duplicated, block: B:41:0x007e A[Catch: IOException -> 0x0013, XmlPullParserException -> 0x0016, TryCatch #2 {IOException -> 0x0013, XmlPullParserException -> 0x0016, blocks: (B:3:0x0007, B:5:0x000d, B:11:0x0019, B:16:0x002b, B:42:0x0083, B:19:0x0033, B:23:0x0043, B:24:0x0047, B:30:0x0055, B:41:0x007e, B:35:0x0064, B:37:0x006c, B:38:0x0071, B:40:0x0079), top: B:47:0x0007 }] */
    public static Map a(Context context, int i10) {
        HashMap map = new HashMap();
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                Log.e("FirebaseRemoteConfig", "Could not find the resources of the current context while trying to set defaults from an XML.");
                return map;
            }
            XmlResourceParser xml = resources.getXml(i10);
            String name = null;
            String text = null;
            String text2 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    name = xml.getName();
                } else if (eventType == 3) {
                    if (xml.getName().equals("entry")) {
                        if (text == null || text2 == null) {
                            Log.w("FirebaseRemoteConfig", "An entry in the defaults XML has an invalid key and/or value tag.");
                        } else {
                            map.put(text, text2);
                        }
                        text = null;
                        text2 = null;
                    }
                    name = null;
                } else if (eventType == 4 && name != null) {
                    int iHashCode = name.hashCode();
                    if (iHashCode != 106079) {
                        if (iHashCode == 111972721 && name.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                            text2 = xml.getText();
                        } else {
                            Log.w("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                        }
                    } else if (name.equals("key")) {
                        text = xml.getText();
                    } else {
                        Log.w("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                    }
                }
            }
            return map;
        } catch (IOException e10) {
            e = e10;
            Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e);
            return map;
        } catch (XmlPullParserException e11) {
            e = e11;
            Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e);
            return map;
        }
    }
}
