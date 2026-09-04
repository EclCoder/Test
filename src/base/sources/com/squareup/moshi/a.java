package com.squareup.moshi;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class a extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f.e f35438c = new C0486a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f35439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f35440b;

    /* JADX INFO: renamed from: com.squareup.moshi.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0486a implements f.e {
        C0486a() {
        }

        @Override // com.squareup.moshi.f.e
        public f a(Type type, Set set, r rVar) {
            Type typeA = u.a(type);
            if (typeA != null && set.isEmpty()) {
                return new a(u.g(typeA), rVar.d(typeA)).nullSafe();
            }
            return null;
        }
    }

    a(Class cls, f fVar) {
        this.f35439a = cls;
        this.f35440b = fVar;
    }

    @Override // com.squareup.moshi.f
    public Object fromJson(i iVar) {
        ArrayList arrayList = new ArrayList();
        iVar.d();
        while (iVar.q()) {
            arrayList.add(this.f35440b.fromJson(iVar));
        }
        iVar.k();
        Object objNewInstance = Array.newInstance((Class<?>) this.f35439a, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // com.squareup.moshi.f
    public void toJson(o oVar, Object obj) {
        oVar.d();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f35440b.toJson(oVar, Array.get(obj, i10));
        }
        oVar.l();
    }

    public String toString() {
        return this.f35440b + ".array()";
    }
}
