package pb;

import android.os.Bundle;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class z implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z f49991e = new z(0, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f49992f = r0.y0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f49993g = r0.y0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f49994h = r0.y0(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f49995i = r0.y0(3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final com.google.android.exoplayer2.g.a f49996j = new com.google.android.exoplayer2.g.a() { // from class: pb.y
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return z.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f50000d;

    public z(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public static /* synthetic */ z a(Bundle bundle) {
        return new z(bundle.getInt(f49992f, 0), bundle.getInt(f49993g, 0), bundle.getInt(f49994h, 0), bundle.getFloat(f49995i, 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f49997a == zVar.f49997a && this.f49998b == zVar.f49998b && this.f49999c == zVar.f49999c && this.f50000d == zVar.f50000d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE + this.f49997a) * 31) + this.f49998b) * 31) + this.f49999c) * 31) + Float.floatToRawIntBits(this.f50000d);
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f49992f, this.f49997a);
        bundle.putInt(f49993g, this.f49998b);
        bundle.putInt(f49994h, this.f49999c);
        bundle.putFloat(f49995i, this.f50000d);
        return bundle;
    }

    public z(int i10, int i11, int i12, float f10) {
        this.f49997a = i10;
        this.f49998b = i11;
        this.f49999c = i12;
        this.f50000d = f10;
    }
}
