package l1;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f43746a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f43747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f43748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f43749d;

        public /* synthetic */ a(List list, long j10, long j11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j10, j11, z10);
        }

        @Override // l1.g
        public g b(q f10) {
            kotlin.jvm.internal.s.h(f10, "f");
            List listC = gl.r.c();
            int size = a().size();
            for (int i10 = 0; i10 < size; i10++) {
                listC.add(((d) a().get(i10)).n(f10));
            }
            return new a(gl.r.a(listC), p.m(this.f43747b, f10), p.m(this.f43748c, f10), this.f43749d, null);
        }

        public final boolean c() {
            return this.f43749d;
        }

        public String toString() {
            return "Corner: vertex=" + ((Object) androidx.collection.g.f(this.f43747b)) + ", center=" + ((Object) androidx.collection.g.f(this.f43748c)) + ", convex=" + this.f43749d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private a(List cubics, long j10, long j11, boolean z10) {
            super(cubics);
            kotlin.jvm.internal.s.h(cubics, "cubics");
            this.f43747b = j10;
            this.f43748c = j11;
            this.f43749d = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List cubics) {
            super(cubics);
            kotlin.jvm.internal.s.h(cubics, "cubics");
        }

        @Override // l1.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b b(q f10) {
            kotlin.jvm.internal.s.h(f10, "f");
            List listC = gl.r.c();
            int size = a().size();
            for (int i10 = 0; i10 < size; i10++) {
                listC.add(((d) a().get(i10)).n(f10));
            }
            return new b(gl.r.a(listC));
        }

        public String toString() {
            return "Edge";
        }
    }

    public g(List cubics) {
        kotlin.jvm.internal.s.h(cubics, "cubics");
        this.f43746a = cubics;
    }

    public final List a() {
        return this.f43746a;
    }

    public abstract g b(q qVar);
}
