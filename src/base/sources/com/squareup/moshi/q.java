package com.squareup.moshi;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class q extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f.e f35550c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f35551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f35552b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements f.e {
        a() {
        }

        @Override // com.squareup.moshi.f.e
        public f a(Type type, Set set, r rVar) {
            Class clsG;
            if (!set.isEmpty() || (clsG = u.g(type)) != Map.class) {
                return null;
            }
            Type[] typeArrI = u.i(type, clsG);
            return new q(rVar, typeArrI[0], typeArrI[1]).nullSafe();
        }
    }

    q(r rVar, Type type, Type type2) {
        this.f35551a = rVar.d(type);
        this.f35552b = rVar.d(type2);
    }

    @Override // com.squareup.moshi.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map fromJson(i iVar) {
        p pVar = new p();
        iVar.h();
        while (iVar.q()) {
            iVar.F0();
            Object objFromJson = this.f35551a.fromJson(iVar);
            Object objFromJson2 = this.f35552b.fromJson(iVar);
            Object objPut = pVar.put(objFromJson, objFromJson2);
            if (objPut != null) {
                throw new JsonDataException("Map key '" + objFromJson + "' has multiple values at path " + iVar.w() + ": " + objPut + " and " + objFromJson2);
            }
        }
        iVar.l();
        return pVar;
    }

    @Override // com.squareup.moshi.f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(o oVar, Map map) {
        oVar.h();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() == null) {
                throw new JsonDataException("Map key is null at " + oVar.w());
            }
            oVar.i0();
            this.f35551a.toJson(oVar, entry.getKey());
            this.f35552b.toJson(oVar, entry.getValue());
        }
        oVar.m();
    }

    public String toString() {
        return "JsonAdapter(" + this.f35551a + "=" + this.f35552b + ")";
    }
}
