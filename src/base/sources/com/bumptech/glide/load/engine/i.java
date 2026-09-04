package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f11365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f11366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e6.e f11367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m0.d f11368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f11369e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface a {
        t5.c a(t5.c cVar);
    }

    public i(Class cls, Class cls2, Class cls3, List list, e6.e eVar, m0.d dVar) {
        this.f11365a = cls;
        this.f11366b = list;
        this.f11367c = eVar;
        this.f11368d = dVar;
        this.f11369e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private t5.c b(com.bumptech.glide.load.data.e eVar, int i10, int i11, r5.g gVar) {
        List list = (List) m6.k.e((List) this.f11368d.b());
        try {
            return c(eVar, i10, i11, gVar, list);
        } finally {
            this.f11368d.a(list);
        }
    }

    private t5.c c(com.bumptech.glide.load.data.e eVar, int i10, int i11, r5.g gVar, List list) throws GlideException {
        int size = this.f11366b.size();
        t5.c cVarA = null;
        for (int i12 = 0; i12 < size; i12++) {
            r5.i iVar = (r5.i) this.f11366b.get(i12);
            try {
                if (iVar.b(eVar.a(), gVar)) {
                    cVarA = iVar.a(eVar.a(), i10, i11, gVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + iVar, e10);
                }
                list.add(e10);
            }
            if (cVarA != null) {
                break;
            }
        }
        if (cVarA != null) {
            return cVarA;
        }
        throw new GlideException(this.f11369e, new ArrayList(list));
    }

    public t5.c a(com.bumptech.glide.load.data.e eVar, int i10, int i11, r5.g gVar, a aVar) {
        return this.f11367c.a(aVar.a(b(eVar, i10, i11, gVar)), gVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f11365a + ", decoders=" + this.f11366b + ", transcoder=" + this.f11367c + '}';
    }
}
