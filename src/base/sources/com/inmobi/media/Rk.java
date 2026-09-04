package com.inmobi.media;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Rk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2832aa f25647a;

    public Rk(C2832aa mConfigIncludeIdMaskMap) {
        kotlin.jvm.internal.s.h(mConfigIncludeIdMaskMap, "mConfigIncludeIdMaskMap");
        this.f25647a = mConfigIncludeIdMaskMap;
    }

    public final HashMap a() {
        C3314t1 c3314t1;
        String str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            if (this.f25647a.a() && (c3314t1 = Qk.f25565a) != null && (str = c3314t1.f27499b) != null) {
                kotlin.jvm.internal.s.e(str);
                map2.put("GPID", str);
            }
        } catch (Exception unused) {
            kotlin.jvm.internal.s.g(Rk.class.getSimpleName(), "getSimpleName(...)");
        }
        String string = new JSONObject(map2).toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        map.put("u-id-map", string);
        return map;
    }
}
