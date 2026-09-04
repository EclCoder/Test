package com.bykv.vk.openvk.preload.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class l<IN, OUT> extends d<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, a> f11694d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<h> f11695a = new ArrayList();

        public final a a(h hVar) {
            this.f11695a.add(hVar);
            return this;
        }

        public final a a(List<h> list) {
            this.f11695a.addAll(list);
            return this;
        }
    }

    l() {
    }

    final Map<String, a> a() {
        return this.f11694d;
    }

    static boolean a(List<h> list) {
        return !list.isEmpty() && list.get(list.size() - 1).f11682a == f.class;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, a> f11696a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f11697b;

        public final a a(String str) {
            if (this.f11696a.containsKey(str)) {
                throw new IllegalArgumentException("duplicated branch name");
            }
            a aVar = new a();
            this.f11696a.put(str, aVar);
            return aVar;
        }

        public final h a(Class<? extends l> cls) {
            return h.a.a().a(cls).a(this.f11696a).a(this.f11697b).b();
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    protected final void a(Object... objArr) {
        Object obj;
        super.a(objArr);
        if (objArr != null && objArr.length == 1 && (obj = objArr[0]) != null) {
            try {
                this.f11694d = (Map) obj;
                return;
            } catch (ClassCastException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        throw new IllegalStateException("args error");
    }
}
