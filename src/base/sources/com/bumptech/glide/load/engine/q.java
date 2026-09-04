package com.bumptech.glide.load.engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f11447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0.d f11448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f11449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f11450d;

    public q(Class cls, Class cls2, Class cls3, List list, m0.d dVar) {
        this.f11447a = cls;
        this.f11448b = dVar;
        this.f11449c = (List) m6.k.d(list);
        this.f11450d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private t5.c b(com.bumptech.glide.load.data.e eVar, r5.g gVar, int i10, int i11, i.a aVar, List list) throws GlideException {
        int size = this.f11449c.size();
        t5.c cVarA = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                cVarA = ((i) this.f11449c.get(i12)).a(eVar, i10, i11, gVar, aVar);
            } catch (GlideException e10) {
                list.add(e10);
            }
            if (cVarA != null) {
                break;
            }
        }
        if (cVarA != null) {
            return cVarA;
        }
        throw new GlideException(this.f11450d, new ArrayList(list));
    }

    public t5.c a(com.bumptech.glide.load.data.e eVar, r5.g gVar, int i10, int i11, i.a aVar) {
        List list = (List) m6.k.e((List) this.f11448b.b());
        try {
            return b(eVar, gVar, i10, i11, aVar, list);
        } finally {
            this.f11448b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f11449c.toArray()) + '}';
    }
}
