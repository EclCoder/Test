package bb;

import android.os.Bundle;
import com.google.common.collect.c0;
import java.util.ArrayList;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f8775c = new f(c0.C(), 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f8776d = r0.y0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f8777e = r0.y0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.android.exoplayer2.g.a f8778f = new com.google.android.exoplayer2.g.a() { // from class: bb.e
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return f.c(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f8779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8780b;

    public f(List list, long j10) {
        this.f8779a = c0.x(list);
        this.f8780b = j10;
    }

    private static c0 b(List list) {
        c0.a aVarR = c0.r();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((b) list.get(i10)).f8744d == null) {
                aVarR.a((b) list.get(i10));
            }
        }
        return aVarR.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f c(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f8776d);
        return new f(parcelableArrayList == null ? c0.C() : ob.c.d(b.J, parcelableArrayList), bundle.getLong(f8777e));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f8776d, ob.c.i(b(this.f8779a)));
        bundle.putLong(f8777e, this.f8780b);
        return bundle;
    }
}
