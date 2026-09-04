package bm;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum q {
    IGNORE_CASE(2, 0, 2, null),
    MULTILINE(8, 0, 2, null),
    LITERAL(16, 0, 2, null),
    UNIX_LINES(1, 0, 2, null),
    COMMENTS(4, 0, 2, null),
    DOT_MATCHES_ALL(32, 0, 2, null),
    CANON_EQ(128, 0, 2, null);


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ ml.a f9160k = ml.b.a(d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9162b;

    q(int i10, int i11) {
        this.f9161a = i10;
        this.f9162b = i11;
    }

    public int g() {
        return this.f9161a;
    }

    /* synthetic */ q(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i12 & 2) != 0 ? i10 : i11);
    }
}
