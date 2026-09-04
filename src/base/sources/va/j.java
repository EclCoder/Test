package va;

import android.net.Uri;
import com.google.android.exoplayer2.v0;
import com.google.common.collect.c0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f55353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f55354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f55355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f55356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f55357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f55358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f55359h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c extends j {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Uri f55361i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f55362j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f55363k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final i f55364l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final m f55365m;

        public c(long j10, v0 v0Var, List list, k.e eVar, List list2, List list3, List list4, String str, long j11) {
            super(j10, v0Var, list, eVar, list2, list3, list4);
            this.f55361i = Uri.parse(((va.b) list.get(0)).f55299a);
            i iVarC = eVar.c();
            this.f55364l = iVarC;
            this.f55363k = str;
            this.f55362j = j11;
            this.f55365m = iVarC != null ? null : new m(new i(null, 0L, j11));
        }

        @Override // va.j
        public String j() {
            return this.f55363k;
        }

        @Override // va.j
        public ua.e k() {
            return this.f55365m;
        }

        @Override // va.j
        public i l() {
            return this.f55364l;
        }
    }

    public static j n(long j10, v0 v0Var, List list, k kVar, List list2, List list3, List list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j10, v0Var, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j10, v0Var, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String j();

    public abstract ua.e k();

    public abstract i l();

    public i m() {
        return this.f55359h;
    }

    private j(long j10, v0 v0Var, List list, k kVar, List list2, List list3, List list4) {
        ob.a.a(!list.isEmpty());
        this.f55352a = j10;
        this.f55353b = v0Var;
        this.f55354c = c0.x(list);
        this.f55356e = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f55357f = list3;
        this.f55358g = list4;
        this.f55359h = kVar.a(this);
        this.f55355d = kVar.b();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b extends j implements ua.e {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final k.a f55360i;

        public b(long j10, v0 v0Var, List list, k.a aVar, List list2, List list3, List list4) {
            super(j10, v0Var, list, aVar, list2, list3, list4);
            this.f55360i = aVar;
        }

        @Override // ua.e
        public long a(long j10, long j11) {
            return this.f55360i.h(j10, j11);
        }

        @Override // ua.e
        public long b(long j10, long j11) {
            return this.f55360i.d(j10, j11);
        }

        @Override // ua.e
        public long c(long j10, long j11) {
            return this.f55360i.f(j10, j11);
        }

        @Override // ua.e
        public i d(long j10) {
            return this.f55360i.k(this, j10);
        }

        @Override // ua.e
        public long e(long j10, long j11) {
            return this.f55360i.i(j10, j11);
        }

        @Override // ua.e
        public long f(long j10) {
            return this.f55360i.g(j10);
        }

        @Override // ua.e
        public boolean g() {
            return this.f55360i.l();
        }

        @Override // ua.e
        public long getTimeUs(long j10) {
            return this.f55360i.j(j10);
        }

        @Override // ua.e
        public long h() {
            return this.f55360i.e();
        }

        @Override // ua.e
        public long i(long j10, long j11) {
            return this.f55360i.c(j10, j11);
        }

        @Override // va.j
        public String j() {
            return null;
        }

        @Override // va.j
        public i l() {
            return null;
        }

        @Override // va.j
        public ua.e k() {
            return this;
        }
    }
}
