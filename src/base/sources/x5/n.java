package x5;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface n {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r5.e f56701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f56702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d f56703c;

        public a(r5.e eVar, com.bumptech.glide.load.data.d dVar) {
            this(eVar, Collections.EMPTY_LIST, dVar);
        }

        public a(r5.e eVar, List list, com.bumptech.glide.load.data.d dVar) {
            this.f56701a = (r5.e) m6.k.e(eVar);
            this.f56702b = (List) m6.k.e(list);
            this.f56703c = (com.bumptech.glide.load.data.d) m6.k.e(dVar);
        }
    }

    boolean a(Object obj);

    a b(Object obj, int i10, int i11, r5.g gVar);
}
