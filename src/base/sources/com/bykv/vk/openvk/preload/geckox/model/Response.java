package com.bykv.vk.openvk.preload.geckox.model;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class Response {
    public ComponentModel data;
    public int status;

    public Response fromJson(String str) {
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(NotificationCompat.CATEGORY_STATUS)) {
                this.status = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
            }
            if (jSONObject.has(DataSchemeDataSource.SCHEME_DATA) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA)) != null) {
                ComponentModel componentModel = new ComponentModel();
                this.data = componentModel;
                componentModel.fromJson(jSONObjectOptJSONObject);
            }
        } catch (Throwable unused) {
        }
        return this;
    }
}
