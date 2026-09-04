package kb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class k implements bb.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f43159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f43160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f43161c;

    public k(List list) {
        this.f43159a = Collections.unmodifiableList(new ArrayList(list));
        this.f43160b = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f43160b;
            jArr[i11] = eVar.f43130b;
            jArr[i11 + 1] = eVar.f43131c;
        }
        long[] jArr2 = this.f43160b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f43161c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // bb.i
    public List getCues(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f43159a.size(); i10++) {
            long[] jArr = this.f43160b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = (e) this.f43159a.get(i10);
                bb.b bVar = eVar.f43129a;
                if (bVar.f8745e == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: kb.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((e) obj).f43130b, ((e) obj2).f43130b);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((e) arrayList2.get(i12)).f43129a.b().h((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override // bb.i
    public long getEventTime(int i10) {
        ob.a.a(i10 >= 0);
        ob.a.a(i10 < this.f43161c.length);
        return this.f43161c[i10];
    }

    @Override // bb.i
    public int getEventTimeCount() {
        return this.f43161c.length;
    }

    @Override // bb.i
    public int getNextEventTimeIndex(long j10) {
        int iE = r0.e(this.f43161c, j10, false, false);
        if (iE < this.f43161c.length) {
            return iE;
        }
        return -1;
    }
}
