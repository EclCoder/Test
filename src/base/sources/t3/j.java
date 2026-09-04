package t3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l3.k;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f53127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f53128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f53129c;

    public j(List list) {
        this.f53127a = Collections.unmodifiableList(new ArrayList(list));
        this.f53128b = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = (d) list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f53128b;
            jArr[i11] = dVar.f53098b;
            jArr[i11 + 1] = dVar.f53099c;
        }
        long[] jArr2 = this.f53128b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f53129c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // l3.k
    public List getCues(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f53127a.size(); i10++) {
            long[] jArr = this.f53128b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                d dVar = (d) this.f53127a.get(i10);
                v1.a aVar = dVar.f53097a;
                if (aVar.f55062e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: t3.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((d) obj).f53098b, ((d) obj2).f53098b);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((d) arrayList2.get(i12)).f53097a.a().h((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override // l3.k
    public long getEventTime(int i10) {
        w1.a.a(i10 >= 0);
        w1.a.a(i10 < this.f53129c.length);
        return this.f53129c[i10];
    }

    @Override // l3.k
    public int getEventTimeCount() {
        return this.f53129c.length;
    }

    @Override // l3.k
    public int getNextEventTimeIndex(long j10) {
        int iD = c0.d(this.f53129c, j10, false, false);
        if (iD < this.f53129c.length) {
            return iD;
        }
        return -1;
    }
}
