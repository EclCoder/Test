package v1;

import android.os.Bundle;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f55102c = c0.s0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f55103d = c0.s0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55105b;

    public e(String str, int i10) {
        this.f55104a = str;
        this.f55105b = i10;
    }

    public static e a(Bundle bundle) {
        return new e((String) w1.a.e(bundle.getString(f55102c)), bundle.getInt(f55103d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f55102c, this.f55104a);
        bundle.putInt(f55103d, this.f55105b);
        return bundle;
    }
}
