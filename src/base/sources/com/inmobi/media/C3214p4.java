package com.inmobi.media;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.p4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3214p4 extends D9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f27166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27167d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3214p4(String url, String accountId, List configRequestContexts, boolean z10) {
        super(url);
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(accountId, "accountId");
        kotlin.jvm.internal.s.h(configRequestContexts, "configRequestContexts");
        this.f27165b = accountId;
        this.f27166c = configRequestContexts;
        this.f27167d = z10;
    }

    public final Te a() throws JSONException {
        List<C3240q4> list = this.f27166c;
        JSONArray jSONArray = new JSONArray();
        for (C3240q4 c3240q4 : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("n", c3240q4.f27311b.getType());
            jSONObject.put("t", c3240q4.f27311b.getLastUpdateTimeStamp());
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("im-accid", this.f27165b);
        linkedHashMap.put(TtmlNode.TAG_P, string);
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        JSONObject jSONObjectB = AbstractC2829a7.b();
        if (jSONObjectB != null) {
            String string2 = jSONObjectB.toString();
            kotlin.jvm.internal.s.g(string2, "toString(...)");
            linkedHashMap.put("consentObject", string2);
        }
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        linkedHashMap.putAll(A1.f24433e);
        linkedHashMap.putAll(B5.f24500a.a(false));
        linkedHashMap.putAll(D8.a());
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        linkedHashMap.put("u-appsecure", String.valueOf((int) A1.f24434f));
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (this.f27167d) {
            linkedHashMap2.put("rip", "true");
        }
        return new Te(this.f24643a, linkedHashMap2, null, new C2881c7(linkedHashMap), null, 52);
    }
}
