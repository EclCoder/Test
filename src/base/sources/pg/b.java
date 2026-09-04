package pg;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50039c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, String dateStr) {
        super(i10);
        s.h(dateStr, "dateStr");
        this.f50039c = dateStr;
    }

    public final String c() {
        return this.f50039c;
    }

    public final void d(String str) {
        s.h(str, "<set-?>");
        this.f50039c = str;
    }
}
