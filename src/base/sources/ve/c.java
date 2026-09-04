package ve;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f55418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f55419b;

    public c(a aVar) {
        this.f55418a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f55419b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    private b a(int i10) {
        if (i10 >= this.f55419b.size()) {
            List list = this.f55419b;
            b bVarG = (b) list.get(list.size() - 1);
            for (int size = this.f55419b.size(); size <= i10; size++) {
                a aVar = this.f55418a;
                bVarG = bVarG.g(new b(aVar, new int[]{1, aVar.c((size - 1) + aVar.d())}));
                this.f55419b.add(bVarG);
            }
        }
        return (b) this.f55419b.get(i10);
    }

    public void b(int[] iArr, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i10;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        b bVarA = a(i10);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrD = new b(this.f55418a, iArr2).h(i10, 1).b(bVarA)[1].d();
        int length2 = i10 - iArrD.length;
        for (int i11 = 0; i11 < length2; i11++) {
            iArr[length + i11] = 0;
        }
        System.arraycopy(iArrD, 0, iArr, length + length2, iArrD.length);
    }
}
