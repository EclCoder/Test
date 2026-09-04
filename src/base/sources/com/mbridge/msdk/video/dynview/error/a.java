package com.mbridge.msdk.video.dynview.error;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public enum a {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one"),
    f34223g(-5, "view create error"),
    NOT_FOUND_ROOTVIEW(-6, "rootview is null");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34227b;

    a(int i10, String str) {
        this.f34226a = i10;
        this.f34227b = str;
    }

    public int g() {
        return this.f34226a;
    }

    public String h() {
        return this.f34227b;
    }
}
