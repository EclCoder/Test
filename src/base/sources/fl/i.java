package fl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f38754e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f38755f = j.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38759d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(int i10, int i11, int i12) {
        this.f38756a = i10;
        this.f38757b = i11;
        this.f38758c = i12;
        this.f38759d = b(i10, i11, i12);
    }

    private final int b(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(i other) {
        kotlin.jvm.internal.s.h(other, "other");
        return this.f38759d - other.f38759d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i iVar = obj instanceof i ? (i) obj : null;
        return iVar != null && this.f38759d == iVar.f38759d;
    }

    public int hashCode() {
        return this.f38759d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f38756a);
        sb2.append('.');
        sb2.append(this.f38757b);
        sb2.append('.');
        sb2.append(this.f38758c);
        return sb2.toString();
    }
}
