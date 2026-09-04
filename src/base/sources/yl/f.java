package yl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f58095e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f58096f = new f(1, 0);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            return f.f58096f;
        }

        private a() {
        }
    }

    public f(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // yl.d
    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (isEmpty() && ((f) obj).isEmpty()) {
            return true;
        }
        f fVar = (f) obj;
        return a() == fVar.a() && b() == fVar.b();
    }

    public boolean h(int i10) {
        return a() <= i10 && i10 <= b();
    }

    @Override // yl.d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + b();
    }

    @Override // yl.d
    public boolean isEmpty() {
        return a() > b();
    }

    public Integer k() {
        return Integer.valueOf(b());
    }

    public Integer m() {
        return Integer.valueOf(a());
    }

    @Override // yl.d
    public String toString() {
        return a() + ".." + b();
    }
}
