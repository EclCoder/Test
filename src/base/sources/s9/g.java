package s9;

import com.google.android.exoplayer2.v0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f51536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f51537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f51539e;

    public g(String str, v0 v0Var, v0 v0Var2, int i10, int i11) {
        ob.a.a(i10 == 0 || i11 == 0);
        this.f51535a = ob.a.d(str);
        this.f51536b = (v0) ob.a.e(v0Var);
        this.f51537c = (v0) ob.a.e(v0Var2);
        this.f51538d = i10;
        this.f51539e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f51538d == gVar.f51538d && this.f51539e == gVar.f51539e && this.f51535a.equals(gVar.f51535a) && this.f51536b.equals(gVar.f51536b) && this.f51537c.equals(gVar.f51537c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f51538d) * 31) + this.f51539e) * 31) + this.f51535a.hashCode()) * 31) + this.f51536b.hashCode()) * 31) + this.f51537c.hashCode();
    }
}
