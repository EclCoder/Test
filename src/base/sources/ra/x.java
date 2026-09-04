package ra;

import android.os.Bundle;
import com.google.common.collect.c0;
import java.util.ArrayList;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class x implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f51253d = new x(new v[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f51254e = r0.y0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.android.exoplayer2.g.a f51255f = new com.google.android.exoplayer2.g.a() { // from class: ra.w
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return x.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f51257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51258c;

    public x(v... vVarArr) {
        this.f51257b = c0.z(vVarArr);
        this.f51256a = vVarArr.length;
        d();
    }

    public static /* synthetic */ x a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f51254e);
        return parcelableArrayList == null ? new x(new v[0]) : new x((v[]) ob.c.d(v.f51247h, parcelableArrayList).toArray(new v[0]));
    }

    private void d() {
        int i10 = 0;
        while (i10 < this.f51257b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f51257b.size(); i12++) {
                if (((v) this.f51257b.get(i10)).equals(this.f51257b.get(i12))) {
                    ob.u.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public v b(int i10) {
        return (v) this.f51257b.get(i10);
    }

    public int c(v vVar) {
        int iIndexOf = this.f51257b.indexOf(vVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (this.f51256a == xVar.f51256a && this.f51257b.equals(xVar.f51257b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f51258c == 0) {
            this.f51258c = this.f51257b.hashCode();
        }
        return this.f51258c;
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f51254e, ob.c.i(this.f51257b));
        return bundle;
    }
}
