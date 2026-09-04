package qh;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class k implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f50851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f50852d;

    public k(String id2, String text, long j10, long j11) {
        s.h(id2, "id");
        s.h(text, "text");
        this.f50849a = id2;
        this.f50850b = text;
        this.f50851c = j10;
        this.f50852d = j11;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(k other) {
        s.h(other, "other");
        return s.j(c(), other.c());
    }

    public abstract long b();

    public abstract long c();

    public abstract String d();

    public abstract void e(long j10);

    public abstract void f(long j10);

    public abstract String getId();
}
