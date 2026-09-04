package nk;

import gk.b;
import kk.h;
import kk.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b.c f47816a = b.m("opencensus-trace-span-key");

    public static l a(b bVar) {
        l lVar = (l) f47816a.a((b) jk.b.b(bVar, "context"));
        return lVar == null ? h.f43447e : lVar;
    }

    public static b b(b bVar, l lVar) {
        return ((b) jk.b.b(bVar, "context")).t(f47816a, lVar);
    }
}
