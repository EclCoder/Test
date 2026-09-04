package com.mbridge.msdk.config.component.cal.model;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f28541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f28542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f28543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f28545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28546h;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj != null) {
                this.f28539a = String.valueOf(obj);
            }
            Object obj2 = map.get(c.c("106"));
            if (obj2 != null) {
                this.f28540b = String.valueOf(obj2);
            }
            Object obj3 = map.get(c.c("103"));
            if (obj3 instanceof Map) {
                this.f28541c = (Map) obj3;
            } else if (obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                this.f28541c = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3).b();
            }
            Object obj4 = map.get(c.c(StatisticData.ERROR_CODE_IO_ERROR));
            if (obj4 != null) {
                this.f28542d = String.valueOf(obj4);
            }
            Object obj5 = map.get(c.c("102"));
            if (obj5 != null) {
                this.f28543e = String.valueOf(obj5);
            }
            Object obj6 = map.get(c.c("104"));
            if (obj6 instanceof String) {
                this.f28544f = Integer.parseInt(String.valueOf(obj6));
            }
            if (obj6 instanceof Integer) {
                this.f28544f = ((Integer) obj6).intValue();
            }
            Object obj7 = map.get(c.c("115"));
            if (obj7 instanceof String) {
                this.f28545g = String.valueOf(obj7);
            }
            String strValueOf = String.valueOf(map.get(c.c("init_status")));
            if (strValueOf.equalsIgnoreCase(UoyZyZEcGYBpIg.pbGxrRlUsOqC)) {
                a(1);
            } else {
                a(Integer.parseInt(strValueOf));
            }
        }
    }

    public String b() {
        return this.f28539a;
    }

    public String c() {
        return this.f28543e;
    }

    public int d() {
        return this.f28546h;
    }

    public int e() {
        return this.f28544f;
    }

    public Map<String, Object> f() {
        return this.f28541c;
    }

    public String g() {
        return this.f28540b;
    }

    public String a() {
        return this.f28545g;
    }

    public void a(int i10) {
        this.f28546h = i10;
    }
}
