package com.facebook.login;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum v {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    NATIVE_ONLY(true, true, false, false, false, true, true),
    KATANA_ONLY(false, true, false, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false, false),
    DIALOG_ONLY(false, true, true, false, true, true, true),
    DEVICE_AUTH(false, false, false, true, false, false, false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f15757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f15758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f15759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f15760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f15761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f15762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f15763g;

    v(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f15757a = z10;
        this.f15758b = z11;
        this.f15759c = z12;
        this.f15760d = z13;
        this.f15761e = z14;
        this.f15762f = z15;
        this.f15763g = z16;
    }

    public final boolean g() {
        return this.f15761e;
    }

    public final boolean h() {
        return this.f15760d;
    }

    public final boolean i() {
        return this.f15757a;
    }

    public final boolean j() {
        return this.f15763g;
    }

    public final boolean k() {
        return this.f15758b;
    }

    public final boolean l() {
        return this.f15759c;
    }
}
