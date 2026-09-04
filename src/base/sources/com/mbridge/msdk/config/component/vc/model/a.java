package com.mbridge.msdk.config.component.vc.model;

import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f29172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f29173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29174g;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get(c.c(StatisticData.ERROR_CODE_NOT_FOUND));
                if (obj != null) {
                    a(String.valueOf(obj));
                }
                Object obj2 = map.get(c.c("155"));
                if (obj2 != null) {
                    String strValueOf = String.valueOf(obj2);
                    if (!TextUtils.isEmpty(strValueOf)) {
                        try {
                            b(Integer.parseInt(strValueOf));
                        } catch (Throwable th2) {
                            q0.b("RenderViewModel", th2.getMessage());
                        }
                    }
                }
                Object obj3 = map.get(c.c("154"));
                if (obj3 != null) {
                    String strValueOf2 = String.valueOf(obj3);
                    if (!TextUtils.isEmpty(strValueOf2)) {
                        try {
                            c(Integer.parseInt(strValueOf2));
                        } catch (Throwable th3) {
                            q0.b("RenderViewModel", th3.getMessage());
                        }
                    }
                }
                Object obj4 = map.get(c.c("157"));
                if (obj4 != null) {
                    String strValueOf3 = String.valueOf(obj4);
                    if (!TextUtils.isEmpty(strValueOf3)) {
                        try {
                            f(Integer.parseInt(strValueOf3));
                        } catch (Throwable th4) {
                            q0.b("RenderViewModel", th4.getMessage());
                        }
                    }
                }
                Object obj5 = map.get(c.c("158"));
                if (obj5 != null) {
                    String strValueOf4 = String.valueOf(obj5);
                    if (!TextUtils.isEmpty(strValueOf4)) {
                        try {
                            a(Integer.parseInt(strValueOf4));
                        } catch (Throwable th5) {
                            q0.b("RenderViewModel", th5.getMessage());
                        }
                    }
                }
                Object obj6 = map.get(c.c("156"));
                int iG = m0.G(com.mbridge.msdk.foundation.controller.c.n().d());
                if (obj6 != null) {
                    String strValueOf5 = String.valueOf(obj6);
                    try {
                        if (TextUtils.isEmpty(strValueOf5) || strValueOf5.equalsIgnoreCase("null")) {
                            d(iG);
                        } else {
                            d(Integer.parseInt(strValueOf5));
                        }
                    } catch (Throwable th6) {
                        q0.b("RenderViewModel", th6.getMessage());
                        d(iG);
                    }
                } else {
                    d(iG);
                }
                Object obj7 = map.get(c.c("198"));
                if (obj7 != null) {
                    String strValueOf6 = String.valueOf(obj7);
                    if (TextUtils.isEmpty(strValueOf6) || strValueOf6.equalsIgnoreCase("null")) {
                        return;
                    }
                    try {
                        e(Integer.parseInt(strValueOf6));
                    } catch (Throwable th7) {
                        q0.b("RenderViewModel", th7.getMessage());
                    }
                }
            } catch (Exception e10) {
                q0.b("RenderViewModel", e10.getMessage());
            }
        }
    }

    public void b(int i10) {
        this.f29169b = i10;
    }

    public int c() {
        return this.f29169b;
    }

    public int d() {
        return this.f29170c;
    }

    public int e() {
        return this.f29173f;
    }

    public void f(int i10) {
        this.f29171d = i10;
    }

    public int g() {
        return this.f29171d;
    }

    public int b() {
        return this.f29172e;
    }

    public void c(int i10) {
        this.f29170c = i10;
    }

    public void d(int i10) {
        this.f29173f = i10;
    }

    public void e(int i10) {
        this.f29174g = i10;
    }

    public int f() {
        return this.f29174g;
    }

    public String a() {
        return this.f29168a;
    }

    public void a(String str) {
        this.f29168a = str;
    }

    public void a(int i10) {
        this.f29172e = i10;
    }
}
