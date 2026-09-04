package com.inmobi.media;

import android.content.ContentValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.b3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2851b3 {
    public static final ContentValues a(V2 v10) {
        String string;
        kotlin.jvm.internal.s.h(v10, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(v10.f25869a));
        contentValues.put("url", v10.f25870b);
        contentValues.put("pending_attempts", Integer.valueOf(v10.f25874f));
        contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(v10.f25875g));
        contentValues.put("created_ts", Long.valueOf(v10.f25876h));
        contentValues.put("follow_redirect", Boolean.valueOf(v10.f25872d));
        contentValues.put("ping_in_webview", Boolean.valueOf(v10.f25873e));
        Map map = v10.f25871c;
        if (map != null && !map.isEmpty()) {
            try {
                Map map2 = v10.f25871c;
                kotlin.jvm.internal.s.f(map2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                string = new JSONObject(map2).toString();
            } catch (Exception unused) {
                string = "";
            }
            kotlin.jvm.internal.s.e(string);
            contentValues.put("track_extras", string);
        }
        return contentValues;
    }
}
