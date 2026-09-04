package com.mbridge.msdk.mbsignalcommon.base;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c implements a {
    @Override // com.mbridge.msdk.mbsignalcommon.base.a
    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equals("intent")) {
            return false;
        }
        return com.mbridge.msdk.click.c.d(com.mbridge.msdk.foundation.controller.c.n().d(), str);
    }
}
