package i2;

import com.google.common.collect.l0;
import t1.b0;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f40816d = new v(new b0[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f40817e = c0.s0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.common.collect.c0 f40819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40820c;

    public v(b0... b0VarArr) {
        this.f40819b = com.google.common.collect.c0.z(b0VarArr);
        this.f40818a = b0VarArr.length;
        e();
    }

    private void e() {
        int i10 = 0;
        while (i10 < this.f40819b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f40819b.size(); i12++) {
                if (((b0) this.f40819b.get(i10)).equals(this.f40819b.get(i12))) {
                    w1.n.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public b0 b(int i10) {
        return (b0) this.f40819b.get(i10);
    }

    public com.google.common.collect.c0 c() {
        return com.google.common.collect.c0.x(l0.m(this.f40819b, new sc.g() { // from class: i2.u
            @Override // sc.g
            public final Object apply(Object obj) {
                return Integer.valueOf(((b0) obj).f52574c);
            }
        }));
    }

    public int d(b0 b0Var) {
        int iIndexOf = this.f40819b.indexOf(b0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f40818a == vVar.f40818a && this.f40819b.equals(vVar.f40819b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f40820c == 0) {
            this.f40820c = this.f40819b.hashCode();
        }
        return this.f40820c;
    }
}
