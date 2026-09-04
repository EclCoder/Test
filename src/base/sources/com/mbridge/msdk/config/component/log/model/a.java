package com.mbridge.msdk.config.component.log.model;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28963a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28964b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28965c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28966d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28967e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28968f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28969g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f28971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f28972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, Object> f28973k;

    public a(Map<String, Object> map) {
        if (map != null) {
            a(map);
        }
    }

    private void a(Map<String, Object> map) {
        if (map != null) {
            if (map.containsKey(c.c("181"))) {
                String strValueOf = String.valueOf(map.get(c.c("181")));
                if (!TextUtils.isEmpty(strValueOf) && !"null".equalsIgnoreCase(strValueOf)) {
                    try {
                        this.f28963a = Integer.parseInt(strValueOf);
                    } catch (Exception e10) {
                        q0.b("LogSenderModel", e10.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("162"))) {
                String strValueOf2 = String.valueOf(map.get(c.c("162")));
                if (!TextUtils.isEmpty(strValueOf2) && !"null".equalsIgnoreCase(strValueOf2)) {
                    try {
                        this.f28964b = Integer.parseInt(strValueOf2);
                    } catch (Exception e11) {
                        q0.b("LogSenderModel", e11.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("182"))) {
                String strValueOf3 = String.valueOf(map.get(c.c("182")));
                if (!TextUtils.isEmpty(strValueOf3) && !"null".equalsIgnoreCase(strValueOf3)) {
                    try {
                        this.f28965c = Integer.parseInt(strValueOf3);
                    } catch (Exception e12) {
                        q0.b("LogSenderModel", e12.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("183"))) {
                String strValueOf4 = String.valueOf(map.get(c.c("183")));
                if (!TextUtils.isEmpty(strValueOf4) && !"null".equalsIgnoreCase(strValueOf4)) {
                    try {
                        this.f28966d = Integer.parseInt(strValueOf4);
                    } catch (Exception e13) {
                        q0.b("LogSenderModel", e13.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("174"))) {
                String strValueOf5 = String.valueOf(map.get(c.c("174")));
                if (!TextUtils.isEmpty(strValueOf5) && !"null".equalsIgnoreCase(strValueOf5)) {
                    try {
                        this.f28967e = Integer.parseInt(strValueOf5);
                    } catch (Exception e14) {
                        q0.b("LogSenderModel", e14.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("184"))) {
                String strValueOf6 = String.valueOf(map.get(c.c("184")));
                if (!TextUtils.isEmpty(strValueOf6) && !"null".equalsIgnoreCase(strValueOf6)) {
                    try {
                        this.f28968f = Integer.parseInt(strValueOf6);
                    } catch (Exception e15) {
                        q0.b("LogSenderModel", e15.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("185"))) {
                String strValueOf7 = String.valueOf(map.get(c.c("185")));
                if (!TextUtils.isEmpty(strValueOf7) && !"null".equalsIgnoreCase(strValueOf7)) {
                    try {
                        this.f28969g = Integer.parseInt(strValueOf7);
                    } catch (Exception e16) {
                        q0.b("LogSenderModel", e16.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("178"))) {
                String strValueOf8 = String.valueOf(map.get(c.c("178")));
                if (!TextUtils.isEmpty(strValueOf8) && !"null".equalsIgnoreCase(strValueOf8)) {
                    try {
                        this.f28970h = Integer.parseInt(strValueOf8);
                    } catch (Exception e17) {
                        q0.b("LogSenderModel", e17.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("180"))) {
                Object obj = map.get(c.c("180"));
                if (obj instanceof Map) {
                    this.f28971i = (Map) obj;
                } else if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    this.f28971i = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b();
                }
            }
            if (map.containsKey(c.c("179"))) {
                Object obj2 = map.get(c.c("179"));
                if (obj2 instanceof Map) {
                    this.f28972j = (Map) obj2;
                } else if (obj2 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    this.f28972j = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj2).b();
                }
            }
            if (map.containsKey(c.c("186"))) {
                Object obj3 = map.get(c.c("186"));
                if (obj3 instanceof Map) {
                    this.f28973k = (Map) obj3;
                } else if (obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    this.f28973k = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3).b();
                }
            }
        }
    }

    public int b() {
        return this.f28964b;
    }

    public String c() {
        Map<String, Object> map = this.f28971i;
        if (map == null || !map.containsKey(c.c("116"))) {
            return "";
        }
        String strValueOf = String.valueOf(this.f28971i.get(c.c("116")));
        return (TextUtils.isEmpty(strValueOf) || "null".equalsIgnoreCase(strValueOf)) ? "" : strValueOf;
    }

    public int d() {
        return this.f28968f;
    }

    public int e() {
        return this.f28970h;
    }

    public int f() {
        Map<String, Object> map = this.f28971i;
        return (map == null || map.isEmpty()) ? 1 : 0;
    }

    public int g() {
        return this.f28967e;
    }

    public Map<String, Object> h() {
        return this.f28973k;
    }

    public String i() {
        Map<String, Object> map = this.f28972j;
        if (map == null || !map.containsKey(c.c("114"))) {
            return "";
        }
        String strValueOf = String.valueOf(this.f28972j.get(c.c("114")));
        return (TextUtils.isEmpty(strValueOf) || "null".equalsIgnoreCase(strValueOf)) ? "" : strValueOf;
    }

    public int j() {
        Map<String, Object> map = this.f28972j;
        if (map == null || !map.containsKey(c.c("172"))) {
            return 9377;
        }
        String strValueOf = String.valueOf(this.f28972j.get(c.c("172")));
        if (TextUtils.isEmpty(strValueOf) || "null".equals(strValueOf)) {
            return 9377;
        }
        try {
            return Integer.parseInt(strValueOf);
        } catch (Exception e10) {
            q0.b("LogSenderModel", e10.getMessage());
            return 9377;
        }
    }

    public int k() {
        return this.f28969g;
    }

    public int a() {
        return this.f28963a;
    }
}
