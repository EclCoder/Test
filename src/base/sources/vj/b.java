package vj;

import com.squareup.moshi.f;
import com.squareup.moshi.i;
import com.squareup.moshi.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f55650a;

    public b(f fVar) {
        this.f55650a = fVar;
    }

    @Override // com.squareup.moshi.f
    public Object fromJson(i iVar) {
        return iVar.p0() == i.b.NULL ? iVar.g0() : this.f55650a.fromJson(iVar);
    }

    @Override // com.squareup.moshi.f
    public void toJson(o oVar, Object obj) {
        if (obj == null) {
            oVar.c0();
        } else {
            this.f55650a.toJson(oVar, obj);
        }
    }

    public String toString() {
        return this.f55650a + ".nullSafe()";
    }
}
