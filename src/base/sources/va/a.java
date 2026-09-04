package va;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f55295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f55296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f55297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f55298f;

    public a(long j10, int i10, List list, List list2, List list3, List list4) {
        this.f55293a = j10;
        this.f55294b = i10;
        this.f55295c = Collections.unmodifiableList(list);
        this.f55296d = Collections.unmodifiableList(list2);
        this.f55297e = Collections.unmodifiableList(list3);
        this.f55298f = Collections.unmodifiableList(list4);
    }
}
