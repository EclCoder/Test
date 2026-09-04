package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import com.inmobi.unifiedId.InMobiUserDataTypes;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.hl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3024hl extends D9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rk f26699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26703f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3024hl(String url, Rk uidMap, String str, int i10, int i11, int i12) {
        super(url);
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(uidMap, "uidMap");
        this.f26699b = uidMap;
        this.f26700c = str;
        this.f26701d = i10;
        this.f26702e = i11;
        this.f26703f = i12;
    }

    public final Te a() {
        String string;
        InMobiUserDataTypes obj;
        InMobiUserDataTypes obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Objects.toString(C2932e7.f26472a);
        String str = (String) AbstractC2891ch.a().get("u-age");
        if (str != null) {
        }
        String string2 = AbstractC2972fl.b().toString();
        kotlin.jvm.internal.s.g(string2, "toString(...)");
        linkedHashMap.put("ufids", string2);
        C3314t1 c3314t1 = Qk.f25565a;
        Boolean bool = c3314t1 != null ? c3314t1.f27500c : null;
        if (bool == null || (string = bool.toString()) == null) {
            string = "true";
        }
        linkedHashMap.put("lat", string);
        linkedHashMap.put("mk-version", Yi.a());
        String str2 = A1.f24429a;
        if (str2 != null) {
        }
        linkedHashMap.put("ua", Xi.c());
        linkedHashMap.put(CampaignEx.JSON_KEY_ST_TS, String.valueOf(System.currentTimeMillis()));
        String str3 = this.f26700c;
        if (str3 != null) {
        }
        InMobiUserDataModel inMobiUserDataModel = C2932e7.f26473b;
        if (inMobiUserDataModel == null || (obj = inMobiUserDataModel.getEmailId()) == null || (obj.getMd5() == null && obj.getSha1() == null && obj.getSha256() == null)) {
            obj = null;
        }
        if (obj != null) {
            kotlin.jvm.internal.s.h(obj, "obj");
        }
        InMobiUserDataModel inMobiUserDataModel2 = C2932e7.f26473b;
        if (inMobiUserDataModel2 == null || (obj2 = inMobiUserDataModel2.getPhoneNumber()) == null || (obj2.getMd5() == null && obj2.getSha1() == null && obj2.getSha256() == null)) {
            obj2 = null;
        }
        if (obj2 != null) {
            kotlin.jvm.internal.s.h(obj2, "obj");
        }
        InMobiUserDataModel inMobiUserDataModel3 = C2932e7.f26473b;
        HashMap<String, String> extras = inMobiUserDataModel3 != null ? inMobiUserDataModel3.getExtras() : null;
        if (extras != null) {
            linkedHashMap.putAll(extras);
        }
        linkedHashMap.putAll(this.f26699b.a());
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        linkedHashMap.putAll(A1.f24433e);
        linkedHashMap.putAll(B5.f24500a.a(false));
        linkedHashMap.putAll(D8.a());
        kotlin.jvm.internal.s.h(linkedHashMap, "<this>");
        JSONObject jSONObjectB = AbstractC2829a7.b();
        if (jSONObjectB != null) {
            String string3 = jSONObjectB.toString();
            kotlin.jvm.internal.s.g(string3, "toString(...)");
            linkedHashMap.put("consentObject", string3);
        }
        String str4 = this.f24643a;
        C2881c7 c2881c7 = new C2881c7(linkedHashMap);
        int i10 = this.f26701d;
        int i11 = this.f26702e;
        yl.f fVar = AbstractC2837af.f26214a;
        Ni ni2 = new Ni(i10, i11 * 1000, 0);
        long j10 = this.f26703f * 1000;
        return new Te(str4, null, new Gk(j10, j10, j10), c2881c7, ni2, 32);
    }
}
