package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11176a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f11177a = new HashMap();

        a() {
        }

        f b() {
            return new f(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface b {
    }

    f(a aVar) {
        this.f11176a = Collections.unmodifiableMap(new HashMap(aVar.f11177a));
    }

    b a(Class cls) {
        android.support.v4.media.session.b.a(this.f11176a.get(cls));
        return null;
    }

    public boolean b(Class cls) {
        return this.f11176a.containsKey(cls);
    }
}
