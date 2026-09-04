package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class An extends AbstractC3050im {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24491a;

    public An(long j10) {
        this.f24491a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof An) && this.f24491a == ((An) obj).f24491a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24491a);
    }

    public final String toString() {
        return "VideoSkipped(currentPlaybackTime=" + this.f24491a + ")";
    }
}
