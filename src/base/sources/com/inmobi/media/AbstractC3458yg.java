package com.inmobi.media;

import android.content.ContentValues;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import r7.pgx.XTkUEXuiK;

/* JADX INFO: renamed from: com.inmobi.media.yg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3458yg {
    public static final ContentValues a(Zf zf2) throws JSONException {
        kotlin.jvm.internal.s.h(zf2, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", zf2.f26142b);
        contentValues.put("url", zf2.f26141a);
        Map map = zf2.f26143c;
        kotlin.jvm.internal.s.h(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        contentValues.put("headers", jSONObject.toString());
        contentValues.put("allow_redirects", String.valueOf(zf2.f26144d));
        contentValues.put("priority", zf2.f26145e);
        contentValues.put("ack_required", String.valueOf(zf2.f26146f));
        contentValues.put("time_created", Long.valueOf(zf2.f26149i));
        contentValues.put("retry_count", Integer.valueOf(zf2.f26147g));
        contentValues.put("owner", zf2.f26148h);
        Long l10 = zf2.f26150j;
        contentValues.put("retryAfter", Long.valueOf(l10 != null ? l10.longValue() : 0L));
        C3331ti c3331ti = zf2.f26151k;
        if (c3331ti != null) {
            String string = new JSONObject().put("plType", c3331ti.f27558a.f27664f).put("plId", c3331ti.f27558a.f27659a).put("adType", c3331ti.f27558a.f27663e).put("markupType", c3331ti.f27559b).put("networkType", B5.g()).put("creativeType", c3331ti.f27563f).put("creativeId", c3331ti.f27564g).put("isRewarded", c3331ti.f27565h).put("adPosition", c3331ti.f27566i).put("metadataBlob", c3331ti.f27561d).put("impressionId", c3331ti.f27560c).toString();
            kotlin.jvm.internal.s.g(string, "toString(...)");
            contentValues.put("telemetry_metadata", string);
        }
        return contentValues;
    }

    public static final Zf a(ContentValues contentValues) throws JSONException {
        boolean z10;
        C3331ti c3331ti;
        kotlin.jvm.internal.s.h(contentValues, "<this>");
        String asString = contentValues.getAsString("id");
        String asString2 = contentValues.getAsString("url");
        JSONObject jSONObject = new JSONObject(contentValues.getAsString("headers"));
        kotlin.jvm.internal.s.h(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.s.g(itKeys, "keys(...)");
        while (true) {
            String str = "";
            if (!itKeys.hasNext()) {
                break;
            }
            String next = itKeys.next();
            String string = jSONObject.getString(next);
            if (string != null) {
                str = string;
            }
            linkedHashMap.put(next, str);
        }
        boolean z11 = Boolean.parseBoolean(contentValues.getAsString("allow_redirects"));
        String asString3 = contentValues.getAsString("priority");
        boolean z12 = Boolean.parseBoolean(contentValues.getAsString("ack_required"));
        Integer asInteger = contentValues.getAsInteger("retry_count");
        int iIntValue = asInteger != null ? asInteger.intValue() : 0;
        String asString4 = contentValues.getAsString("owner");
        if (asString4 == null) {
            asString4 = "unknown";
        }
        String str2 = asString4;
        Long asLong = contentValues.getAsLong("retryAfter");
        Long asLong2 = contentValues.getAsLong("time_created");
        kotlin.jvm.internal.s.e(asString2);
        kotlin.jvm.internal.s.e(asString);
        kotlin.jvm.internal.s.e(asString3);
        kotlin.jvm.internal.s.e(asLong2);
        long jLongValue = asLong2.longValue();
        String json = contentValues.getAsString("telemetry_metadata");
        if (json != null) {
            kotlin.jvm.internal.s.h(json, "json");
            try {
                JSONObject jSONObject2 = new JSONObject(json);
                String mAdType = jSONObject2.getString(XTkUEXuiK.OQifPJ);
                kotlin.jvm.internal.s.g(mAdType, "getString(...)");
                kotlin.jvm.internal.s.h(mAdType, "mAdType");
                String string2 = UUID.randomUUID().toString();
                kotlin.jvm.internal.s.g(string2, "toString(...)");
                z10 = z11;
                try {
                    long j10 = jSONObject2.getLong("plId");
                    try {
                        if (j10 != Long.MIN_VALUE) {
                            C3365v0 c3365v0 = new C3365v0(j10, "", mAdType, null);
                            c3365v0.f27662d = null;
                            c3365v0.f27661c = null;
                            kotlin.jvm.internal.s.h("", "<set-?>");
                            c3365v0.f27666h = "";
                            kotlin.jvm.internal.s.h("activity", "<set-?>");
                            c3365v0.f27667i = "activity";
                            c3365v0.f27665g = string2;
                            c3365v0.f27668j = false;
                            c3365v0.f27669k = null;
                            String string3 = jSONObject2.getString("markupType");
                            kotlin.jvm.internal.s.g(string3, "getString(...)");
                            String string4 = jSONObject2.getString("impressionId");
                            kotlin.jvm.internal.s.g(string4, "getString(...)");
                            String strOptString = jSONObject2.optString("metadataBlob", "");
                            kotlin.jvm.internal.s.g(strOptString, "optString(...)");
                            String string5 = jSONObject2.getString("creativeType");
                            kotlin.jvm.internal.s.g(string5, "getString(...)");
                            String string6 = jSONObject2.getString("creativeId");
                            kotlin.jvm.internal.s.g(string6, "getString(...)");
                            c3331ti = new C3331ti(c3365v0, string3, string4, strOptString, 0, string5, string6, jSONObject2.getBoolean("isRewarded"), jSONObject2.getInt("adPosition"), null, null, null, null);
                        } else {
                            throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
                        }
                    } catch (JSONException unused) {
                        c3331ti = null;
                    }
                } catch (JSONException unused2) {
                }
            } catch (JSONException unused3) {
                z10 = z11;
            }
            c3331ti = null;
        } else {
            z10 = z11;
            c3331ti = null;
        }
        return new Zf(asString2, asString, linkedHashMap, z10, asString3, z12, iIntValue, str2, jLongValue, asLong, c3331ti);
    }
}
