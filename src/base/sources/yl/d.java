package yl;

import gl.j0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d implements Iterable, ul.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f58087d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f58088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f58089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f58090c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(int i10, int i11, int i12) {
            return new d(i10, i11, i12);
        }

        private a() {
        }
    }

    public d(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f58088a = i10;
        this.f58089b = nl.c.b(i10, i11, i12);
        this.f58090c = i12;
    }

    public final int a() {
        return this.f58088a;
    }

    public final int b() {
        return this.f58089b;
    }

    public final int d() {
        return this.f58090c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f58088a == dVar.f58088a && this.f58089b == dVar.f58089b && this.f58090c == dVar.f58090c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public j0 iterator() {
        return new e(this.f58088a, this.f58089b, this.f58090c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f58088a * 31) + this.f58089b) * 31) + this.f58090c;
    }

    public boolean isEmpty() {
        if (this.f58090c > 0) {
            return this.f58088a > this.f58089b;
        }
        return this.f58088a < this.f58089b;
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f58090c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f58088a);
            sb2.append("..");
            sb2.append(this.f58089b);
            sb2.append(" step ");
            i10 = this.f58090c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f58088a);
            sb2.append(" downTo ");
            sb2.append(this.f58089b);
            sb2.append(" step ");
            i10 = -this.f58090c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
