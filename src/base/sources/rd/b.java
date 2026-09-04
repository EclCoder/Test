package rd;

import jd.l0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class b implements i {
    b() {
    }

    static d b(l0 l0Var) {
        return new d(l0Var.a() + ((long) 3600000), new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // rd.i
    public d a(l0 l0Var, JSONObject jSONObject) {
        return b(l0Var);
    }
}
