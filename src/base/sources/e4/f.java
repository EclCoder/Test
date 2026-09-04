package e4;

import java.util.List;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f37119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37120b;

    private f(List list, int i10) {
        this.f37119a = list;
        this.f37120b = i10;
        if (list.isEmpty() && i10 == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i10 >= 0 && i10 < size) {
                return;
            }
        }
        throw new IllegalArgumentException(("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '" + i10 + "', bounds = '" + gl.r.m(list) + "'.").toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f37120b == fVar.f37120b && s.c(this.f37119a, fVar.f37119a);
    }

    public int hashCode() {
        return (this.f37120b * 31) + this.f37119a.hashCode();
    }

    public String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f37120b + ", mergedHistory=" + this.f37119a + ')';
    }

    public f() {
        this(gl.r.l(), -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(g currentInfo, List backInfo, List forwardInfo) {
        s.h(currentInfo, "currentInfo");
        s.h(backInfo, "backInfo");
        s.h(forwardInfo, "forwardInfo");
        List listC = gl.r.c();
        List list = listC;
        gl.r.z(list, backInfo);
        list.add(currentInfo);
        gl.r.z(list, forwardInfo);
        this(gl.r.a(listC), backInfo.size());
    }
}
