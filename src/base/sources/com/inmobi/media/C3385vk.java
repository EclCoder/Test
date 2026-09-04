package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.vk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3385vk extends AbstractC3056j2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27742e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3385vk(String eventType, String str, String eventSource) {
        super(eventType, str);
        kotlin.jvm.internal.s.h(eventType, "eventType");
        kotlin.jvm.internal.s.h(eventSource, "eventSource");
        this.f27742e = eventSource;
    }

    public final String toString() {
        return this.f26767a + " ";
    }
}
