package com.mbridge.msdk.setting;

import f8.Ygx.FuoITeVPeXAj;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f32382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f32383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32384g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32378a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32379b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32380c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32381d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32385h = 0;

    public static a a(String str) {
        Exception e10;
        a aVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar = new a();
            try {
                aVar.b(jSONObject.optString("http_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().f30625h));
                aVar.c(jSONObject.optString("tcp_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().f30629l));
                aVar.e(jSONObject.optInt("tcp_port", com.mbridge.msdk.foundation.same.net.utils.d.h().f30633p));
                aVar.f(jSONObject.optInt("type", 0));
                aVar.a(jSONObject.optInt(FuoITeVPeXAj.clTYVBv, 1));
                aVar.c(jSONObject.optInt("duration", 0));
                aVar.b(jSONObject.optInt("disable", 0));
                aVar.d(jSONObject.optInt("e_t_l", 0));
                return aVar;
            } catch (Exception e11) {
                e10 = e11;
                e10.printStackTrace();
                return aVar;
            }
        } catch (Exception e12) {
            e10 = e12;
            aVar = null;
        }
    }

    public int b() {
        return this.f32379b;
    }

    public int c() {
        return this.f32380c;
    }

    public int d() {
        return this.f32381d;
    }

    public String e() {
        return this.f32382e;
    }

    public String f() {
        return this.f32383f;
    }

    public int g() {
        return this.f32384g;
    }

    public int h() {
        return this.f32385h;
    }

    public void b(int i10) {
        this.f32379b = i10;
    }

    public void c(int i10) {
        this.f32380c = i10;
    }

    public void d(int i10) {
        this.f32381d = i10;
    }

    public void e(int i10) {
        this.f32384g = i10;
    }

    public void f(int i10) {
        this.f32385h = i10;
    }

    public void b(String str) {
        this.f32382e = str;
    }

    public void c(String str) {
        this.f32383f = str;
    }

    public int a() {
        return this.f32378a;
    }

    public void a(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        this.f32378a = i10;
    }
}
