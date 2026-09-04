package xa;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements qa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f56811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f56812c;

    protected d(String str, List list, boolean z10) {
        this.f56810a = str;
        this.f56811b = Collections.unmodifiableList(list);
        this.f56812c = z10;
    }
}
