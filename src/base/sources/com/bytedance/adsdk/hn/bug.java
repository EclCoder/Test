package com.bytedance.adsdk.hn;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class bug<V> {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Throwable f11909hn;
    private final V hnj;

    public bug(V v10) {
        this.hnj = v10;
        this.f11909hn = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bug)) {
            return false;
        }
        bug bugVar = (bug) obj;
        if (hnj() != null && hnj().equals(bugVar.hnj())) {
            return true;
        }
        if (hn() == null || bugVar.hn() == null) {
            return false;
        }
        return hn().toString().equals(hn().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{hnj(), hn()});
    }

    public Throwable hn() {
        return this.f11909hn;
    }

    public V hnj() {
        return this.hnj;
    }

    public bug(Throwable th2) {
        this.f11909hn = th2;
        this.hnj = null;
    }
}
