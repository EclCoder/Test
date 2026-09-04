package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.drm.h;
import com.google.common.collect.c0;
import com.google.common.collect.e0;
import com.google.common.collect.i0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends xa.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f17766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f17767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f17768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f17769k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f17770l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f17771m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f17772n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f17773o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f17774p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h f17775q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f17776r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f17777s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map f17778t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f17779u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f17780v;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends e {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f17781l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f17782m;

        public b(String str, d dVar, long j10, int i10, long j11, h hVar, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, dVar, j10, i10, j11, hVar, str2, str3, j12, j13, z10);
            this.f17781l = z11;
            this.f17782m = z12;
        }

        public b b(long j10, int i10) {
            return new b(this.f17788a, this.f17789b, this.f17790c, i10, j10, this.f17793f, this.f17794g, this.f17795h, this.f17796i, this.f17797j, this.f17798k, this.f17781l, this.f17782m);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0287c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f17783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17785c;

        public C0287c(Uri uri, long j10, int i10) {
            this.f17783a = uri;
            this.f17784b = j10;
            this.f17785c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class e implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f17789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f17790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17791d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f17792e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final h f17793f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f17794g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f17795h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f17796i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f17797j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f17798k;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l10) {
            if (this.f17792e > l10.longValue()) {
                return 1;
            }
            return this.f17792e < l10.longValue() ? -1 : 0;
        }

        private e(String str, d dVar, long j10, int i10, long j11, h hVar, String str2, String str3, long j12, long j13, boolean z10) {
            this.f17788a = str;
            this.f17789b = dVar;
            this.f17790c = j10;
            this.f17791d = i10;
            this.f17792e = j11;
            this.f17793f = hVar;
            this.f17794g = str2;
            this.f17795h = str3;
            this.f17796i = j12;
            this.f17797j = j13;
            this.f17798k = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f17799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f17800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f17801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f17802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f17803e;

        public f(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f17799a = j10;
            this.f17800b = z10;
            this.f17801c = j11;
            this.f17802d = j12;
            this.f17803e = z11;
        }
    }

    public c(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, h hVar, List list2, List list3, f fVar, Map map) {
        super(str, list, z12);
        this.f17762d = i10;
        this.f17766h = j11;
        this.f17765g = z10;
        this.f17767i = z11;
        this.f17768j = i11;
        this.f17769k = j12;
        this.f17770l = i12;
        this.f17771m = j13;
        this.f17772n = j14;
        this.f17773o = z13;
        this.f17774p = z14;
        this.f17775q = hVar;
        this.f17776r = c0.x(list2);
        this.f17777s = c0.x(list3);
        this.f17778t = e0.j(map);
        if (!list3.isEmpty()) {
            b bVar = (b) i0.d(list3);
            this.f17779u = bVar.f17792e + bVar.f17790c;
        } else if (list2.isEmpty()) {
            this.f17779u = 0L;
        } else {
            d dVar = (d) i0.d(list2);
            this.f17779u = dVar.f17792e + dVar.f17790c;
        }
        this.f17763e = j10 != C.TIME_UNSET ? j10 >= 0 ? Math.min(this.f17779u, j10) : Math.max(0L, this.f17779u + j10) : C.TIME_UNSET;
        this.f17764f = j10 >= 0;
        this.f17780v = fVar;
    }

    public c b(long j10, int i10) {
        return new c(this.f17762d, this.f56810a, this.f56811b, this.f17763e, this.f17765g, j10, true, i10, this.f17769k, this.f17770l, this.f17771m, this.f17772n, this.f56812c, this.f17773o, this.f17774p, this.f17775q, this.f17776r, this.f17777s, this.f17780v, this.f17778t);
    }

    public c c() {
        return this.f17773o ? this : new c(this.f17762d, this.f56810a, this.f56811b, this.f17763e, this.f17765g, this.f17766h, this.f17767i, this.f17768j, this.f17769k, this.f17770l, this.f17771m, this.f17772n, this.f56812c, true, this.f17774p, this.f17775q, this.f17776r, this.f17777s, this.f17780v, this.f17778t);
    }

    public long d() {
        return this.f17766h + this.f17779u;
    }

    public boolean e(c cVar) {
        if (cVar != null) {
            long j10 = this.f17769k;
            long j11 = cVar.f17769k;
            if (j10 <= j11) {
                if (j10 < j11) {
                    return false;
                }
                int size = this.f17776r.size() - cVar.f17776r.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.f17777s.size();
                int size3 = cVar.f17777s.size();
                if (size2 <= size3 && (size2 != size3 || !this.f17773o || cVar.f17773o)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends e {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f17786l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final List f17787m;

        public d(String str, long j10, long j11, String str2, String str3) {
            this(str, null, "", 0L, -1, C.TIME_UNSET, null, str2, str3, j10, j11, false, c0.C());
        }

        public d b(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f17787m.size(); i11++) {
                b bVar = (b) this.f17787m.get(i11);
                arrayList.add(bVar.b(j11, i10));
                j11 += bVar.f17790c;
            }
            return new d(this.f17788a, this.f17789b, this.f17786l, this.f17790c, i10, j10, this.f17793f, this.f17794g, this.f17795h, this.f17796i, this.f17797j, this.f17798k, arrayList);
        }

        public d(String str, d dVar, String str2, long j10, int i10, long j11, h hVar, String str3, String str4, long j12, long j13, boolean z10, List list) {
            super(str, dVar, j10, i10, j11, hVar, str3, str4, j12, j13, z10);
            this.f17786l = str2;
            this.f17787m = c0.x(list);
        }
    }

    @Override // qa.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c copy(List list) {
        return this;
    }
}
