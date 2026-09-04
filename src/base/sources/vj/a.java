package vj;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.i;
import com.squareup.moshi.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f55649a;

    public a(f fVar) {
        this.f55649a = fVar;
    }

    @Override // com.squareup.moshi.f
    public Object fromJson(i iVar) {
        if (iVar.p0() != i.b.NULL) {
            return this.f55649a.fromJson(iVar);
        }
        throw new JsonDataException("Unexpected null at " + iVar.w());
    }

    @Override // com.squareup.moshi.f
    public void toJson(o oVar, Object obj) {
        if (obj != null) {
            this.f55649a.toJson(oVar, obj);
            return;
        }
        throw new JsonDataException("Unexpected null at " + oVar.w());
    }

    public String toString() {
        return this.f55649a + ".nonNull()";
    }
}
