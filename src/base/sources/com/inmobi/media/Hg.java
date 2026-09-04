package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Hg extends AbstractC3130lo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24948a;

    public Hg(int i10) {
        this.f24948a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Hg) && this.f24948a == ((Hg) obj).f24948a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24948a);
    }

    public final String toString() {
        return "PollingVisibilityTrackerConfig(pollingIntervalInMillis=" + this.f24948a + ")";
    }
}
