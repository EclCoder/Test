package qh;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class l implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50856d;

    public l(String id2, String text, int i10, int i11) {
        s.h(id2, "id");
        s.h(text, "text");
        this.f50853a = id2;
        this.f50854b = text;
        this.f50855c = i10;
        this.f50856d = i11;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(l other) {
        s.h(other, "other");
        return s.i(this.f50855c, other.f50855c);
    }

    public final int b() {
        return this.f50855c;
    }

    public final int c() {
        return this.f50856d;
    }

    public final String d() {
        return this.f50854b;
    }

    public final void e(int i10) {
        this.f50855c = i10;
    }

    public final void f(int i10) {
        this.f50856d = i10;
    }

    public final String getId() {
        return this.f50853a;
    }
}
