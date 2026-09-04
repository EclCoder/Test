package com.mbridge.msdk.dycreator.error;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30018b;

    public a(b bVar) {
        if (bVar != null) {
            this.f30017a = bVar.g();
            this.f30018b = bVar.h();
        }
    }

    public String toString() {
        return "DyError{errorCode=" + this.f30017a + '}';
    }

    public a(int i10, String str) {
        this.f30017a = i10;
        this.f30018b = str;
    }
}
