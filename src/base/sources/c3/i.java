package c3;

import t1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class i implements u.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9526a;

    public i(String str) {
        this.f9526a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f9526a;
    }
}
