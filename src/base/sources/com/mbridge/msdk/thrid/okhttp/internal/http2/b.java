package com.mbridge.msdk.thrid.okhttp.internal.http2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33258a;

    b(int i10) {
        this.f33258a = i10;
    }

    public static b a(int i10) {
        for (b bVar : values()) {
            if (bVar.f33258a == i10) {
                return bVar;
            }
        }
        return null;
    }
}
