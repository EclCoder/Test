package com.facebook.ads.internal.bridge.fbsdk;

import com.facebook.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class FBLoginASID {
    public static String getFBLoginASID() {
        try {
            a.c cVar = a.f14853l;
            Object objInvoke = a.class.getDeclaredMethod("getCurrentAccessToken", null).invoke(null, null);
            if (objInvoke != null) {
                return (String) a.class.getDeclaredMethod("getUserId", null).invoke(objInvoke, null);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
