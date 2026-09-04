package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.yn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3465yn extends AbstractC3050im {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27962a;

    public C3465yn(long j10) {
        this.f27962a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3465yn) && this.f27962a == ((C3465yn) obj).f27962a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27962a);
    }

    public final String toString() {
        return "VideoResume(currentPlaybackTime=" + this.f27962a + ")";
    }
}
