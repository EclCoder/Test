package com.arthenica.ffmpegkit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f11103b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f11104c = 255;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11105a;

    public m(int i10) {
        this.f11105a = i10;
    }

    public static boolean b(m mVar) {
        return mVar != null && mVar.a() == f11104c;
    }

    public static boolean c(m mVar) {
        return mVar != null && mVar.a() == f11103b;
    }

    public int a() {
        return this.f11105a;
    }

    public String toString() {
        return String.valueOf(this.f11105a);
    }
}
