package vh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class b0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f55576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f55577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArrayList f55578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ y.b f55579d;

    b0(y.b bVar, ArrayList arrayList, int i10, ArrayList arrayList2) {
        this.f55579d = bVar;
        this.f55576a = arrayList;
        this.f55577b = i10;
        this.f55578c = arrayList2;
    }

    @Override // vh.h
    public void a(List list, boolean z10) {
        if (y.this.isAdded()) {
            int[] iArr = new int[this.f55576a.size()];
            for (int i10 = 0; i10 < this.f55576a.size(); i10++) {
                iArr[i10] = e0.f(this.f55578c, (String) this.f55576a.get(i10)) ? -1 : 0;
            }
            y.this.onRequestPermissionsResult(this.f55577b, (String[]) this.f55576a.toArray(new String[0]), iArr);
        }
    }

    @Override // vh.h
    public void b(List list, boolean z10) {
        if (z10 && y.this.isAdded()) {
            int[] iArr = new int[this.f55576a.size()];
            Arrays.fill(iArr, 0);
            y.this.onRequestPermissionsResult(this.f55577b, (String[]) this.f55576a.toArray(new String[0]), iArr);
        }
    }
}
