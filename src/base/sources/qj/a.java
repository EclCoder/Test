package qj;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50863b;

    public a(int i10, int i11) {
        this.f50862a = i10;
        this.f50863b = i11;
    }

    public final int a() {
        return this.f50863b;
    }

    public final int b() {
        return this.f50862a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f50862a == aVar.f50862a && this.f50863b == aVar.f50863b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f50862a) * 31) + Integer.hashCode(this.f50863b);
    }

    public String toString() {
        return "Event(data=" + this.f50862a + ", bufferLength=" + this.f50863b + ")";
    }

    public /* synthetic */ a(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i12 & 2) != 0 ? -1 : i11);
    }
}
