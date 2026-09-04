package com.bumptech.glide.load.data;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e.a f11242b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11243a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements e.a {
        a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e b(Object obj) {
            return new b(obj);
        }
    }

    public synchronized e a(Object obj) {
        e.a aVar;
        try {
            m6.k.e(obj);
            aVar = (e.a) this.f11243a.get(obj.getClass());
            if (aVar == null) {
                for (e.a aVar2 : this.f11243a.values()) {
                    if (aVar2.a().isAssignableFrom(obj.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f11242b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar.b(obj);
    }

    public synchronized void b(e.a aVar) {
        this.f11243a.put(aVar.a(), aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f11244a;

        b(Object obj) {
            this.f11244a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        public Object a() {
            return this.f11244a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }
    }
}
