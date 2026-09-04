package com.squareup.moshi;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
abstract class d extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f.e f35458b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f35459a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements f.e {
        a() {
        }

        @Override // com.squareup.moshi.f.e
        public f a(Type type, Set set, r rVar) {
            Class clsG = u.g(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (clsG == List.class || clsG == Collection.class) {
                return d.b(type, rVar).nullSafe();
            }
            if (clsG == Set.class) {
                return d.d(type, rVar).nullSafe();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends d {
        b(f fVar) {
            super(fVar, null);
        }

        @Override // com.squareup.moshi.d
        Collection c() {
            return new ArrayList();
        }

        @Override // com.squareup.moshi.f
        public /* bridge */ /* synthetic */ Object fromJson(i iVar) {
            return super.a(iVar);
        }

        @Override // com.squareup.moshi.f
        public /* bridge */ /* synthetic */ void toJson(o oVar, Object obj) {
            super.e(oVar, (Collection) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends d {
        c(f fVar) {
            super(fVar, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.squareup.moshi.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Set c() {
            return new LinkedHashSet();
        }

        @Override // com.squareup.moshi.f
        public /* bridge */ /* synthetic */ Object fromJson(i iVar) {
            return super.a(iVar);
        }

        @Override // com.squareup.moshi.f
        public /* bridge */ /* synthetic */ void toJson(o oVar, Object obj) {
            super.e(oVar, (Collection) obj);
        }
    }

    /* synthetic */ d(f fVar, a aVar) {
        this(fVar);
    }

    static f b(Type type, r rVar) {
        return new b(rVar.d(u.c(type, Collection.class)));
    }

    static f d(Type type, r rVar) {
        return new c(rVar.d(u.c(type, Collection.class)));
    }

    public Collection a(i iVar) {
        Collection collectionC = c();
        iVar.d();
        while (iVar.q()) {
            collectionC.add(this.f35459a.fromJson(iVar));
        }
        iVar.k();
        return collectionC;
    }

    abstract Collection c();

    public void e(o oVar, Collection collection) {
        oVar.d();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f35459a.toJson(oVar, it.next());
        }
        oVar.l();
    }

    public String toString() {
        return this.f35459a + ".collection()";
    }

    private d(f fVar) {
        this.f35459a = fVar;
    }
}
