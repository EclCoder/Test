package com.mbridge.msdk.mbbanner.common.data;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31207c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f31208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f31209e;

    public b(String str, String str2, int i10, int i11) {
        this.f31205a = str;
        this.f31206b = str2;
        this.f31208d = i10;
        this.f31209e = i11;
    }

    public void a(int i10) {
        this.f31208d = i10;
    }

    public void b(String str) {
        this.f31206b = str;
    }

    public int c() {
        return this.f31208d;
    }

    public String d() {
        return this.f31206b;
    }

    public String a() {
        return this.f31207c;
    }

    public int b() {
        return this.f31209e;
    }

    public void a(String str) {
        this.f31207c = str;
    }
}
