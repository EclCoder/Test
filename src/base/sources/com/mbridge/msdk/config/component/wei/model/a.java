package com.mbridge.msdk.config.component.wei.model;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.config.component.common.file.b;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f29198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AdSession f29199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f29200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f29201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<Map<String, Object>> f29202i;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(String str) {
        this.f29197d = str;
    }

    public void b(String str) {
        this.f29196c = str;
    }

    public String c() {
        return this.f29201h;
    }

    public void d(String str) {
        this.f29194a = str;
    }

    public void e(String str) {
        this.f29198e = str;
    }

    public String f() {
        return this.f29195b;
    }

    public String g() {
        return this.f29194a;
    }

    public String h() {
        return this.f29198e;
    }

    public boolean i() {
        return this.f29200g;
    }

    public AdSession a() {
        return this.f29199f;
    }

    public String b() {
        return this.f29197d;
    }

    public void c(String str) {
        this.f29195b = str;
    }

    public String d() {
        return this.f29196c;
    }

    public List<Map<String, Object>> e() {
        return this.f29202i;
    }

    public void a(List<Map<String, Object>> list) {
        this.f29202i = list;
    }

    public void a(Map<String, Object> map) {
        b bVarA;
        if (map != null) {
            Object obj = map.get(c.c("116"));
            if (obj != null) {
                String strValueOf = String.valueOf(obj);
                if (strValueOf.contains(".zip") && (bVarA = com.mbridge.msdk.config.component.common.file.a.a(strValueOf, 1, null)) != null && bVarA.e()) {
                    c(com.mbridge.msdk.config.component.common.file.a.a(strValueOf, bVarA.d()));
                }
                d(strValueOf);
            }
            Object obj2 = map.get(c.c("125"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.c(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj3 != null) {
                a(String.valueOf(obj3));
            }
            Object obj4 = map.get(c.c("123"));
            if (obj4 != null) {
                e(String.valueOf(obj4));
            }
            Object obj5 = map.get(c.c("127"));
            if (obj5 instanceof List) {
                a((List<Map<String, Object>>) obj5);
            }
        }
    }
}
