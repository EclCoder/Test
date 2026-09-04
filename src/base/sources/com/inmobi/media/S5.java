package com.inmobi.media;

import androidx.core.app.NotificationCompat;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class S5 extends De {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S5(String url, String offset) {
        super(url, NotificationCompat.CATEGORY_PROGRESS);
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(offset, "offset");
        this.f25672c = offset;
    }
}
