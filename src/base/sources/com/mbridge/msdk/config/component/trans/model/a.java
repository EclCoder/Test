package com.mbridge.msdk.config.component.trans.model;

import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29154a;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        Object obj;
        if (map == null || (obj = map.get(c.c("118"))) == null) {
            return;
        }
        a(String.valueOf(obj).replace("'", ""));
    }

    public String a() {
        return this.f29154a;
    }

    public void a(String str) {
        this.f29154a = str;
    }
}
