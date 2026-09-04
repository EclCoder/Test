package va;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f55340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f55341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f55342e;

    public g(String str, long j10, List list, List list2) {
        this(str, j10, list, list2, null);
    }

    public int a(int i10) {
        int size = this.f55340c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((a) this.f55340c.get(i11)).f55294b == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g(String str, long j10, List list, List list2, e eVar) {
        this.f55338a = str;
        this.f55339b = j10;
        this.f55340c = Collections.unmodifiableList(list);
        this.f55341d = Collections.unmodifiableList(list2);
        this.f55342e = eVar;
    }
}
