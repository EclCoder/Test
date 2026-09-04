package kl;

import java.io.Serializable;
import kotlin.jvm.internal.s;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f43531a = new k();
    private static final long serialVersionUID = 0;

    private k() {
    }

    private final Object readResolve() {
        return f43531a;
    }

    @Override // kl.j
    public Object fold(Object obj, o operation) {
        s.h(operation, "operation");
        return obj;
    }

    @Override // kl.j
    public j.b get(j.c key) {
        s.h(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kl.j
    public j minusKey(j.c key) {
        s.h(key, "key");
        return this;
    }

    @Override // kl.j
    public j plus(j context) {
        s.h(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
