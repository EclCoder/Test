package com.facebook;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum l {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    f15535d(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    f15538g(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15546a;

    l(boolean z10) {
        this.f15546a = z10;
    }

    public final boolean g() {
        return this.f15546a;
    }
}
