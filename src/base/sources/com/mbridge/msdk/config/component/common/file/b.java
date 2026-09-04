package com.mbridge.msdk.config.component.common.file;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f28635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f28636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f28637f;

    public String a() {
        return this.f28634c + this.f28632a;
    }

    public void b(String str) {
        this.f28632a = str;
    }

    public void c(String str) {
        this.f28633b = str;
    }

    public String d() {
        return this.f28636e;
    }

    public void e(String str) {
        this.f28636e = str;
    }

    public String toString() {
        return "FileDescription{fileName='" + this.f28632a + "', fileType='" + this.f28633b + "', dirPath='" + this.f28634c + "', unZipDirPath='" + this.f28635d + "', unZipFilePath='" + this.f28636e + "', fileExists=" + this.f28637f + '}';
    }

    public void a(String str) {
        this.f28634c = str;
    }

    public String b() {
        return this.f28633b;
    }

    public String c() {
        return this.f28635d;
    }

    public void d(String str) {
        this.f28635d = str;
    }

    public boolean e() {
        return this.f28637f;
    }

    public void a(boolean z10) {
        this.f28637f = z10;
    }
}
