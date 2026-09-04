package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.gm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2999gm extends AbstractC3050im {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26635a;

    public C2999gm(long j10) {
        this.f26635a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2999gm) && this.f26635a == ((C2999gm) obj).f26635a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26635a);
    }

    public final String toString() {
        return "VideoComplete(duration=" + this.f26635a + ")";
    }
}
