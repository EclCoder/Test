package va;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c implements qa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f55305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f55306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f55307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f55308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f55309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f55310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f55311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f55312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f55313k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f55314l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f55315m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List list) {
        this.f55303a = j10;
        this.f55304b = j11;
        this.f55305c = j12;
        this.f55306d = z10;
        this.f55307e = j13;
        this.f55308f = j14;
        this.f55309g = j15;
        this.f55310h = j16;
        this.f55314l = hVar;
        this.f55311i = oVar;
        this.f55313k = uri;
        this.f55312j = lVar;
        this.f55315m = list == null ? Collections.EMPTY_LIST : list;
    }

    private static ArrayList b(List list, LinkedList linkedList) {
        qa.c cVar = (qa.c) linkedList.poll();
        int i10 = cVar.f50518a;
        ArrayList arrayList = new ArrayList();
        do {
            int i11 = cVar.f50519b;
            a aVar = (a) list.get(i11);
            List list2 = aVar.f55295c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add((j) list2.get(cVar.f50520c));
                cVar = (qa.c) linkedList.poll();
                if (cVar.f50518a != i10) {
                    break;
                }
            } while (cVar.f50519b == i11);
            arrayList.add(new a(aVar.f55293a, aVar.f55294b, arrayList2, aVar.f55296d, aVar.f55297e, aVar.f55298f));
        } while (cVar.f50518a == i10);
        linkedList.addFirst(cVar);
        return arrayList;
    }

    @Override // qa.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c copy(List list) {
        long j10;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new qa.c(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i10 = 0;
        while (true) {
            int iD = d();
            j10 = C.TIME_UNSET;
            if (i10 >= iD) {
                break;
            }
            if (((qa.c) linkedList.peek()).f50518a != i10) {
                long jE = e(i10);
                if (jE != C.TIME_UNSET) {
                    j11 += jE;
                }
            } else {
                g gVarC = c(i10);
                arrayList.add(new g(gVarC.f55338a, gVarC.f55339b - j11, b(gVarC.f55340c, linkedList), gVarC.f55341d));
            }
            i10++;
        }
        long j12 = this.f55304b;
        if (j12 != C.TIME_UNSET) {
            j10 = j12 - j11;
        }
        return new c(this.f55303a, j10, this.f55305c, this.f55306d, this.f55307e, this.f55308f, this.f55309g, this.f55310h, this.f55314l, this.f55311i, this.f55312j, this.f55313k, arrayList);
    }

    public final g c(int i10) {
        return (g) this.f55315m.get(i10);
    }

    public final int d() {
        return this.f55315m.size();
    }

    public final long e(int i10) {
        long j10;
        long j11;
        if (i10 == this.f55315m.size() - 1) {
            j10 = this.f55304b;
            if (j10 == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            j11 = ((g) this.f55315m.get(i10)).f55339b;
        } else {
            j10 = ((g) this.f55315m.get(i10 + 1)).f55339b;
            j11 = ((g) this.f55315m.get(i10)).f55339b;
        }
        return j10 - j11;
    }

    public final long f(int i10) {
        return r0.H0(e(i10));
    }
}
