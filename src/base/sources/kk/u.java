package kk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class u {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final u f43516c = u.c(Collections.EMPTY_LIST);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u f43517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList f43518b;

        public u b() {
            ArrayList arrayList = this.f43518b;
            return arrayList == null ? this.f43517a : u.c(arrayList);
        }

        private b(u uVar) {
            jk.b.b(uVar, "parent");
            this.f43517a = uVar;
            this.f43518b = null;
        }
    }

    u() {
    }

    public static b b() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static u c(List list) {
        jk.b.c(list.size() <= 32, "Invalid size");
        return new e(Collections.unmodifiableList(list));
    }

    public abstract List d();
}
