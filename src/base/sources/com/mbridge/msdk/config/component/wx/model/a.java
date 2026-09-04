package com.mbridge.msdk.config.component.wx.model;

import android.content.Context;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f29209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f29213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f29214f;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("145"));
            if (obj != null) {
                e(String.valueOf(obj));
            }
            Object obj2 = map.get(c.c("147"));
            if (obj2 != null) {
                c(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.c("148"));
            if (obj3 != null) {
                d(String.valueOf(obj3));
            }
            Object obj4 = map.get(c.c("193"));
            if (obj4 != null) {
                a(String.valueOf(obj4));
            }
            Object obj5 = map.get(c.c("146"));
            if (obj5 != null) {
                b(String.valueOf(obj5));
            }
        }
    }

    public Context b() {
        return this.f29209a;
    }

    public String c() {
        return this.f29211c;
    }

    public String d() {
        return this.f29212d;
    }

    public String e() {
        return this.f29210b;
    }

    public void b(String str) {
        this.f29214f = str;
    }

    public void c(String str) {
        this.f29211c = str;
    }

    public void d(String str) {
        this.f29212d = str;
    }

    public void e(String str) {
        this.f29210b = str;
    }

    public void a(Context context) {
        this.f29209a = context;
    }

    public String a() {
        return this.f29213e;
    }

    public void a(String str) {
        this.f29213e = str;
    }
}
