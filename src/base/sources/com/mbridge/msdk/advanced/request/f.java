package com.mbridge.msdk.advanced.request;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28274e;

    public void a(String str) {
        this.f28271b = str;
    }

    public int b() {
        return this.f28273d;
    }

    public int c() {
        return this.f28272c;
    }

    public int d() {
        return this.f28270a;
    }

    public String e() {
        return this.f28271b;
    }

    public String toString() {
        return "NativeAdvancedV3ParamsEntity{reqType=" + this.f28270a + ", session_id='" + this.f28271b + "', offset=" + this.f28272c + ", expectWidth=" + this.f28273d + ", expectHeight=" + this.f28274e + '}';
    }

    public int a() {
        return this.f28274e;
    }

    public void b(int i10) {
        this.f28273d = i10;
    }

    public void c(int i10) {
        this.f28272c = i10;
    }

    public void d(int i10) {
        this.f28270a = i10;
    }

    public void a(int i10) {
        this.f28274e = i10;
    }
}
