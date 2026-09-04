package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class D6 extends G6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f24640a;

    public D6(short s10) {
        this.f24640a = s10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D6) && this.f24640a == ((D6) obj).f24640a;
    }

    public final int hashCode() {
        return Short.hashCode(this.f24640a);
    }

    public final String toString() {
        return "Failure(errorCode=" + ((int) this.f24640a) + ")";
    }
}
