package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import ca.p;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import ob.p0;
import ob.r0;
import qa.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a implements qa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0291a f18236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b[] f18237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f18238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f18239h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0291a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f18240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f18241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p[] f18242c;

        public C0291a(UUID uuid, byte[] bArr, p[] pVarArr) {
            this.f18240a = uuid;
            this.f18241b = bArr;
            this.f18242c = pVarArr;
        }
    }

    public a(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, C0291a c0291a, b[] bVarArr) {
        this(i10, i11, j11 == 0 ? -9223372036854775807L : r0.U0(j11, 1000000L, j10), j12 != 0 ? r0.U0(j12, 1000000L, j10) : C.TIME_UNSET, i12, z10, c0291a, bVarArr);
    }

    @Override // qa.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a copy(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            c cVar = (c) arrayList.get(i10);
            b bVar2 = this.f18237f[cVar.f50519b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((v0[]) arrayList3.toArray(new v0[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f18252j[cVar.f50520c]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((v0[]) arrayList3.toArray(new v0[0])));
        }
        return new a(this.f18232a, this.f18233b, this.f18238g, this.f18239h, this.f18234c, this.f18235d, this.f18236e, (b[]) arrayList2.toArray(new b[0]));
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f18244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f18245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f18246d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f18247e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f18248f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f18249g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f18250h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f18251i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final v0[] f18252j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f18253k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final String f18254l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f18255m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f18256n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final long[] f18257o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final long f18258p;

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, v0[] v0VarArr, List list, long j11) {
            this(str, str2, i10, str3, j10, str4, i11, i12, i13, i14, str5, v0VarArr, list, r0.V0(list, 1000000L, j10), r0.U0(j11, 1000000L, j10));
        }

        public Uri a(int i10, int i11) {
            ob.a.g(this.f18252j != null);
            ob.a.g(this.f18256n != null);
            ob.a.g(i11 < this.f18256n.size());
            String string = Integer.toString(this.f18252j[i10].f18864h);
            String string2 = ((Long) this.f18256n.get(i11)).toString();
            return p0.e(this.f18254l, this.f18255m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        }

        public b b(v0[] v0VarArr) {
            return new b(this.f18254l, this.f18255m, this.f18243a, this.f18244b, this.f18245c, this.f18246d, this.f18247e, this.f18248f, this.f18249g, this.f18250h, this.f18251i, v0VarArr, this.f18256n, this.f18257o, this.f18258p);
        }

        public long c(int i10) {
            if (i10 == this.f18253k - 1) {
                return this.f18258p;
            }
            long[] jArr = this.f18257o;
            return jArr[i10 + 1] - jArr[i10];
        }

        public int d(long j10) {
            return r0.i(this.f18257o, j10, true, true);
        }

        public long e(int i10) {
            return this.f18257o[i10];
        }

        private b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, v0[] v0VarArr, List list, long[] jArr, long j11) {
            this.f18254l = str;
            this.f18255m = str2;
            this.f18243a = i10;
            this.f18244b = str3;
            this.f18245c = j10;
            this.f18246d = str4;
            this.f18247e = i11;
            this.f18248f = i12;
            this.f18249g = i13;
            this.f18250h = i14;
            this.f18251i = str5;
            this.f18252j = v0VarArr;
            this.f18256n = list;
            this.f18257o = jArr;
            this.f18258p = j11;
            this.f18253k = list.size();
        }
    }

    private a(int i10, int i11, long j10, long j11, int i12, boolean z10, C0291a c0291a, b[] bVarArr) {
        this.f18232a = i10;
        this.f18233b = i11;
        this.f18238g = j10;
        this.f18239h = j11;
        this.f18234c = i12;
        this.f18235d = z10;
        this.f18236e = c0291a;
        this.f18237f = bVarArr;
    }
}
