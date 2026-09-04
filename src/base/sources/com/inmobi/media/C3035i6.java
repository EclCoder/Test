package com.inmobi.media;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.i6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3035i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f26725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26726b;

    public C3035i6(String payload, ArrayList eventIDs) {
        kotlin.jvm.internal.s.h(eventIDs, "eventIDs");
        kotlin.jvm.internal.s.h(payload, "payload");
        this.f26725a = eventIDs;
        this.f26726b = payload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3035i6)) {
            return false;
        }
        C3035i6 c3035i6 = (C3035i6) obj;
        return kotlin.jvm.internal.s.c(this.f26725a, c3035i6.f26725a) && kotlin.jvm.internal.s.c(this.f26726b, c3035i6.f26726b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f26726b.hashCode() + (this.f26725a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "EventPayload(eventIDs=" + this.f26725a + ", payload=" + this.f26726b + ", shouldFlushOnFailure=false)";
    }
}
