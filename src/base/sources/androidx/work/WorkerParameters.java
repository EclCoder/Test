package androidx.work;

import android.net.Network;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UUID f7772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f7773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f7774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f7775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Executor f7777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k5.a f7778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private x f7779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private q f7780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f7781j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f7782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f7783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Network f7784c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f7782a = list;
            this.f7783b = list;
        }
    }

    public WorkerParameters(UUID uuid, e eVar, Collection collection, a aVar, int i10, Executor executor, k5.a aVar2, x xVar, q qVar, h hVar) {
        this.f7772a = uuid;
        this.f7773b = eVar;
        this.f7774c = new HashSet(collection);
        this.f7775d = aVar;
        this.f7776e = i10;
        this.f7777f = executor;
        this.f7778g = aVar2;
        this.f7779h = xVar;
        this.f7780i = qVar;
        this.f7781j = hVar;
    }

    public Executor a() {
        return this.f7777f;
    }

    public h b() {
        return this.f7781j;
    }

    public UUID c() {
        return this.f7772a;
    }

    public e d() {
        return this.f7773b;
    }

    public Network e() {
        return this.f7775d.f7784c;
    }

    public q f() {
        return this.f7780i;
    }

    public int g() {
        return this.f7776e;
    }

    public Set h() {
        return this.f7774c;
    }

    public k5.a i() {
        return this.f7778g;
    }

    public List j() {
        return this.f7775d.f7782a;
    }

    public List k() {
        return this.f7775d.f7783b;
    }

    public x l() {
        return this.f7779h;
    }
}
