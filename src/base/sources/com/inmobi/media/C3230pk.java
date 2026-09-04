package com.inmobi.media;

import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.pk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3230pk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f27272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f27273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f27276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f27277g;

    public C3230pk(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, List priorityEventsList, double d10) {
        kotlin.jvm.internal.s.h(priorityEventsList, "priorityEventsList");
        this.f27271a = z10;
        this.f27272b = z11;
        this.f27273c = z12;
        this.f27274d = z13;
        this.f27275e = z14;
        this.f27276f = priorityEventsList;
        this.f27277g = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3230pk)) {
            return false;
        }
        C3230pk c3230pk = (C3230pk) obj;
        return this.f27271a == c3230pk.f27271a && this.f27272b == c3230pk.f27272b && this.f27273c == c3230pk.f27273c && this.f27274d == c3230pk.f27274d && this.f27275e == c3230pk.f27275e && kotlin.jvm.internal.s.c(this.f27276f, c3230pk.f27276f) && Double.compare(this.f27277g, c3230pk.f27277g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f27277g) + ((this.f27276f.hashCode() + ((Boolean.hashCode(this.f27275e) + ((Boolean.hashCode(this.f27274d) + ((Boolean.hashCode(this.f27273c) + ((Boolean.hashCode(this.f27272b) + (Boolean.hashCode(this.f27271a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TelemetryConfigMetaData(isTelemetryEnabled=" + this.f27271a + ", isImageEnabled=" + this.f27272b + ", isGIFEnabled=" + this.f27273c + ", isVideoEnabled=" + this.f27274d + ", isGeneralEventsDisabled=" + this.f27275e + ", priorityEventsList=" + this.f27276f + ", samplingFactor=" + this.f27277g + ")";
    }
}
