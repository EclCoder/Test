package com.mbridge.msdk.dycreator.error;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum b {
    NOT_FOUND_VIEWOPTION(-101, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-102, "context is null"),
    FILE_CREATE_VIEW_FILE(-103, "file create view is null"),
    CAMPAIGNEX_IS_NULL(-104, "Campaign size only one"),
    NOT_FOUND_CAMPAIGN(-105, "campaign is null"),
    NOT_FOUND_DYNAMIC_FILE(-106, "dynamic file is not exits"),
    BIND_DATA_FILE_OR_DIR(-107, "data file or file dir is not exits "),
    NOT_FOUND_DYNAMIC_OPTION(-108, "dynamic_option is not exits");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30029b;

    b(int i10, String str) {
        this.f30028a = i10;
        this.f30029b = str;
    }

    public int g() {
        return this.f30028a;
    }

    public String h() {
        return this.f30029b;
    }
}
