package kn;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f43533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f43534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f43535d;

    public a(String name, boolean z10) {
        s.h(name, "name");
        this.f43532a = name;
        this.f43533b = z10;
        this.f43535d = -1L;
    }

    public final boolean a() {
        return this.f43533b;
    }

    public final String b() {
        return this.f43532a;
    }

    public final long c() {
        return this.f43535d;
    }

    public final c d() {
        return this.f43534c;
    }

    public final void e(c queue) {
        s.h(queue, "queue");
        c cVar = this.f43534c;
        if (cVar == queue) {
            return;
        }
        if (cVar != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f43534c = queue;
    }

    public abstract long f();

    public final void g(long j10) {
        this.f43535d = j10;
    }

    public String toString() {
        return this.f43532a;
    }

    public /* synthetic */ a(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
