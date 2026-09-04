package to;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f53630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f53631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f53632c;

    public d(b bVar, List list, List list2) {
        this.f53630a = (b) ip.a.h(bVar, "Domain type");
        this.f53631b = Collections.unmodifiableList((List) ip.a.h(list, "Domain suffix rules"));
        this.f53632c = Collections.unmodifiableList(list2 == null ? Collections.EMPTY_LIST : list2);
    }

    public List a() {
        return this.f53632c;
    }

    public List b() {
        return this.f53631b;
    }

    public b c() {
        return this.f53630a;
    }
}
