package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.c6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2880c6 {
    public static EnumC2931e6 a(int i10) {
        if (400 <= i10 && 500 > i10) {
            return EnumC2931e6.f26455f;
        }
        if (200 < i10 && 300 > i10) {
            return EnumC2931e6.f26456g;
        }
        EnumC2931e6 enumC2931e6 = (EnumC2931e6) EnumC2931e6.f26452c.get(i10);
        return enumC2931e6 == null ? EnumC2931e6.f26453d : enumC2931e6;
    }
}
