package yn;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f58165a = Logger.getLogger("okio.Okio");

    public static final boolean b(AssertionError assertionError) {
        kotlin.jvm.internal.s.h(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? bm.r.T(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }
}
