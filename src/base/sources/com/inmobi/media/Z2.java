package com.inmobi.media;

import android.content.ContentValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3167n9 f26111a;

    public Z2(C3167n9 databaseHelper) {
        kotlin.jvm.internal.s.h(databaseHelper, "databaseHelper");
        this.f26111a = databaseHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(int i10, int i11, kotlin.coroutines.jvm.internal.d dVar) {
        W2 w10;
        if (dVar instanceof W2) {
            w10 = (W2) dVar;
            int i12 = w10.f25923c;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                w10.f25923c = i12 - Integer.MIN_VALUE;
            } else {
                w10 = new W2(this, dVar);
            }
        } else {
            w10 = new W2(this, dVar);
        }
        Object objA = w10.f25921a;
        Object objF = ll.b.f();
        int i13 = w10.f25923c;
        if (i13 == 0) {
            fl.s.b(objA);
            String str = "SELECT * FROM click WHERE ts < " + (System.currentTimeMillis() - ((long) i11)) + " ORDER BY ts ASC LIMIT " + i10;
            C3167n9 c3167n9 = this.f26111a;
            w10.f25923c = 1;
            c3167n9.getClass();
            objA = c3167n9.a(new C3063j9(c3167n9, str, null), w10);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objA);
        }
        Iterable<ContentValues> iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(gl.r.v(iterable, 10));
        for (ContentValues contentValues : iterable) {
            kotlin.jvm.internal.s.h(contentValues, "<this>");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String asString = contentValues.getAsString("track_extras");
            if (asString != null) {
                try {
                    JSONObject jSONObject = new JSONObject(asString);
                    kotlin.jvm.internal.s.h(jSONObject, "<this>");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object obj = jSONObject.get(next);
                        kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type kotlin.String");
                        linkedHashMap2.put(next, (String) obj);
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                } catch (Exception unused) {
                }
            }
            Integer asInteger = contentValues.getAsInteger("id");
            kotlin.jvm.internal.s.g(asInteger, "getAsInteger(...)");
            int iIntValue = asInteger.intValue();
            String asString2 = contentValues.getAsString("url");
            kotlin.jvm.internal.s.g(asString2, "getAsString(...)");
            Boolean asBoolean = contentValues.getAsBoolean("follow_redirect");
            kotlin.jvm.internal.s.g(asBoolean, "getAsBoolean(...)");
            boolean zBooleanValue = asBoolean.booleanValue();
            Boolean asBoolean2 = contentValues.getAsBoolean("ping_in_webview");
            kotlin.jvm.internal.s.g(asBoolean2, "getAsBoolean(...)");
            boolean zBooleanValue2 = asBoolean2.booleanValue();
            Integer asInteger2 = contentValues.getAsInteger("pending_attempts");
            kotlin.jvm.internal.s.g(asInteger2, "getAsInteger(...)");
            int iIntValue2 = asInteger2.intValue();
            Long asLong = contentValues.getAsLong(CampaignEx.JSON_KEY_ST_TS);
            kotlin.jvm.internal.s.g(asLong, "getAsLong(...)");
            long jLongValue = asLong.longValue();
            Long asLong2 = contentValues.getAsLong("created_ts");
            kotlin.jvm.internal.s.g(asLong2, "getAsLong(...)");
            arrayList.add(new V2(iIntValue, asString2, linkedHashMap, zBooleanValue, zBooleanValue2, iIntValue2, jLongValue, asLong2.longValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(kotlin.coroutines.jvm.internal.d dVar) {
        X2 x10;
        if (dVar instanceof X2) {
            x10 = (X2) dVar;
            int i10 = x10.f25994c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                x10.f25994c = i10 - Integer.MIN_VALUE;
            } else {
                x10 = new X2(this, dVar);
            }
        } else {
            x10 = new X2(this, dVar);
        }
        Object objA = x10.f25992a;
        Object objF = ll.b.f();
        int i11 = x10.f25994c;
        if (i11 == 0) {
            fl.s.b(objA);
            C3167n9 c3167n9 = this.f26111a;
            x10.f25994c = 1;
            c3167n9.getClass();
            objA = c3167n9.a(new C2934e9(c3167n9, "SELECT COUNT(*) FROM click", null), x10);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objA);
        }
        return kotlin.coroutines.jvm.internal.b.a(((Number) objA).intValue() != 0);
    }
}
