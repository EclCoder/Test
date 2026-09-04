package gn;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f39749a = new p();

    private p() {
    }

    public static final String a(String username, String password, Charset charset) {
        kotlin.jvm.internal.s.h(username, "username");
        kotlin.jvm.internal.s.h(password, "password");
        kotlin.jvm.internal.s.h(charset, "charset");
        return "Basic " + xn.h.f56912d.c(username + ':' + password, charset).d();
    }
}
