package com.inmobi.media;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class X9 extends AbstractC3056j2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25998f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X9(String eventId, String componentType, String eventType, String str) {
        super(eventType, str);
        kotlin.jvm.internal.s.h(eventId, "eventId");
        kotlin.jvm.internal.s.h(componentType, "componentType");
        kotlin.jvm.internal.s.h(eventType, "eventType");
        this.f25997e = eventId;
        this.f25998f = componentType;
    }

    public final String toString() {
        return this.f26767a + "@" + this.f25998f + " ";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public X9(String str, String str2, String str3) {
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        this(string, str, str2, str3);
    }
}
