package lb;

import android.os.Bundle;
import com.google.common.collect.c0;
import java.util.Collections;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f44232c = r0.y0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f44233d = r0.y0(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.android.exoplayer2.g.a f44234e = new com.google.android.exoplayer2.g.a() { // from class: lb.v
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return w.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra.v f44235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f44236b;

    public w(ra.v vVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= vVar.f51248a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f44235a = vVar;
        this.f44236b = c0.x(list);
    }

    public static /* synthetic */ w a(Bundle bundle) {
        return new w((ra.v) ra.v.f51247h.a((Bundle) ob.a.e(bundle.getBundle(f44232c))), com.google.common.primitives.g.c((int[]) ob.a.e(bundle.getIntArray(f44233d))));
    }

    public int b() {
        return this.f44235a.f51250c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f44235a.equals(wVar.f44235a) && this.f44236b.equals(wVar.f44236b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f44235a.hashCode() + (this.f44236b.hashCode() * 31);
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f44232c, this.f44235a.toBundle());
        bundle.putIntArray(f44233d, com.google.common.primitives.g.n(this.f44236b));
        return bundle;
    }
}
