package n4;

import android.os.Bundle;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o4.b f46838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n4.b.C0722b f46839b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(j jVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        Bundle a();
    }

    public g(o4.b impl) {
        s.h(impl, "impl");
        this.f46838a = impl;
    }

    public final Bundle a(String key) {
        s.h(key, "key");
        return this.f46838a.c(key);
    }

    public final b b(String key) {
        s.h(key, "key");
        return this.f46838a.d(key);
    }

    public final void c(String key, b provider) {
        s.h(key, "key");
        s.h(provider, "provider");
        this.f46838a.j(key, provider);
    }

    public final void d(Class clazz) {
        s.h(clazz, "clazz");
        if (!this.f46838a.e()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        n4.b.C0722b c0722b = this.f46839b;
        if (c0722b == null) {
            c0722b = new n4.b.C0722b(this);
        }
        this.f46839b = c0722b;
        try {
            clazz.getDeclaredConstructor(null);
            n4.b.C0722b c0722b2 = this.f46839b;
            if (c0722b2 != null) {
                String name = clazz.getName();
                s.g(name, "getName(...)");
                c0722b2.b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
