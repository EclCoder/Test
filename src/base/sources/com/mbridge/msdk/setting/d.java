package com.mbridge.msdk.setting;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f32487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f32488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32489h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32482a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32483b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32484c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32485d = 30;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32486e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f32490i = 0;

    public static d a(String str) {
        Exception e10;
        d dVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            dVar = new d();
            try {
                dVar.b(jSONObject.optString("h_d", com.mbridge.msdk.foundation.same.net.utils.d.h().f30622f));
                dVar.c(jSONObject.optString("t_d", com.mbridge.msdk.foundation.same.net.utils.d.h().f30628k));
                dVar.c(jSONObject.optInt("t_p", com.mbridge.msdk.foundation.same.net.utils.d.h().f30632o));
                dVar.d(jSONObject.optInt("type", 1));
                dVar.b(jSONObject.optInt("d_t", 30));
                dVar.a(jSONObject.optInt("d_a", 0));
                return dVar;
            } catch (Exception e11) {
                e10 = e11;
                e10.printStackTrace();
                return dVar;
            }
        } catch (Exception e12) {
            e10 = e12;
            dVar = null;
        }
    }

    public int b() {
        return this.f32485d;
    }

    public String c() {
        return this.f32487f;
    }

    public String d() {
        return this.f32488g;
    }

    public int e() {
        return this.f32489h;
    }

    public void b(int i10) {
        this.f32485d = i10;
    }

    public void c(String str) {
        this.f32488g = str;
    }

    public void d(int i10) {
        this.f32490i = i10;
    }

    public void b(String str) {
        this.f32487f = str;
    }

    public void c(int i10) {
        this.f32489h = i10;
    }

    public int a() {
        return this.f32484c;
    }

    public void a(int i10) {
        this.f32484c = i10;
    }
}
