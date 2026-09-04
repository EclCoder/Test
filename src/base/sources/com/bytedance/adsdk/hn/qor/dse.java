package com.bytedance.adsdk.hn.qor;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse<T> {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    T f12045hn;
    T hnj;

    private static boolean hn(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return hn(pair.first, this.hnj) && hn(pair.second, this.f12045hn);
    }

    public int hashCode() {
        T t10 = this.hnj;
        int iHashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.f12045hn;
        return iHashCode ^ (t11 != null ? t11.hashCode() : 0);
    }

    public void hnj(T t10, T t11) {
        this.hnj = t10;
        this.f12045hn = t11;
    }

    public String toString() {
        return "Pair{" + this.hnj + " " + this.f12045hn + "}";
    }
}
