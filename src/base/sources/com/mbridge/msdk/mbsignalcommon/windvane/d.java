package com.mbridge.msdk.mbsignalcommon.windvane;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum d {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML("html", "text/html");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31717b;

    d(String str, String str2) {
        this.f31716a = str;
        this.f31717b = str2;
    }

    public String g() {
        return this.f31717b;
    }

    public String h() {
        return this.f31716a;
    }
}
