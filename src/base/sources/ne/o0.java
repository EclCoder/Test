package ne;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x0 f47219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0 f47220b;

    public o0(x0 timeProvider, z0 uuidGenerator) {
        kotlin.jvm.internal.s.h(timeProvider, "timeProvider");
        kotlin.jvm.internal.s.h(uuidGenerator, "uuidGenerator");
        this.f47219a = timeProvider;
        this.f47220b = uuidGenerator;
    }

    private final String b() {
        String string = this.f47220b.next().toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        String lowerCase = bm.r.I(string, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.s.g(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final SessionDetails a(SessionDetails sessionDetails) {
        String firstSessionId;
        String strB = b();
        if (sessionDetails == null || (firstSessionId = sessionDetails.getFirstSessionId()) == null) {
            firstSessionId = strB;
        }
        return new SessionDetails(strB, firstSessionId, sessionDetails != null ? sessionDetails.getSessionIndex() + 1 : 0, this.f47219a.a().getUs());
    }
}
