package v1;

import android.os.Bundle;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f55106d = c0.s0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f55107e = c0.s0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f55108f = c0.s0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55111c;

    public g(int i10, int i11, int i12) {
        this.f55109a = i10;
        this.f55110b = i11;
        this.f55111c = i12;
    }

    public static g a(Bundle bundle) {
        return new g(bundle.getInt(f55106d), bundle.getInt(f55107e), bundle.getInt(f55108f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f55106d, this.f55109a);
        bundle.putInt(f55107e, this.f55110b);
        bundle.putInt(f55108f, this.f55111c);
        return bundle;
    }
}
