package an;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f487b;

        public a(float f10, float f11) {
            super(null);
            this.f486a = f10;
            this.f487b = f11;
        }

        public final float a() {
            return this.f486a;
        }

        public final float b() {
            return this.f487b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f486a, aVar.f486a) == 0 && Float.compare(this.f487b, aVar.f487b) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f486a) * 31) + Float.hashCode(this.f487b);
        }

        public String toString() {
            return "Absolute(x=" + this.f486a + ", y=" + this.f487b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f489b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e min, e max) {
            super(null);
            s.h(min, "min");
            s.h(max, "max");
            this.f488a = min;
            this.f489b = max;
        }

        public final e a() {
            return this.f489b;
        }

        public final e b() {
            return this.f488a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.c(this.f488a, bVar.f488a) && s.c(this.f489b, bVar.f489b);
        }

        public int hashCode() {
            return (this.f488a.hashCode() * 31) + this.f489b.hashCode();
        }

        public String toString() {
            return "Between(min=" + this.f488a + ", max=" + this.f489b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double f490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f491b;

        public c(double d10, double d11) {
            super(null);
            this.f490a = d10;
            this.f491b = d11;
        }

        public final e a(c value) {
            s.h(value, "value");
            return new b(this, value);
        }

        public final double b() {
            return this.f490a;
        }

        public final double c() {
            return this.f491b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Double.compare(this.f490a, cVar.f490a) == 0 && Double.compare(this.f491b, cVar.f491b) == 0;
        }

        public int hashCode() {
            return (Double.hashCode(this.f490a) * 31) + Double.hashCode(this.f491b);
        }

        public String toString() {
            return "Relative(x=" + this.f490a + ", y=" + this.f491b + ")";
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e() {
    }
}
