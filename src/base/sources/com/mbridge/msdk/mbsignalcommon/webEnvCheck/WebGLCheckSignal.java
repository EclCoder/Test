package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import com.mbridge.msdk.foundation.controller.c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class WebGLCheckSignal extends BaseWebGLCheckSignal {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f31674g = 0;

    public void webglState(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            c.n().c(jSONObject.optInt("webgl"));
            c.n().a(jSONObject);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
