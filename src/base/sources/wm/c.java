package wm;

import java.util.Collections;
import java.util.Map;
import net.openid.appauth.ClientAuthentication;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c implements ClientAuthentication {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f56371a = new c();

    private c() {
    }

    @Override // net.openid.appauth.ClientAuthentication
    public Map a(String str) {
        return null;
    }

    @Override // net.openid.appauth.ClientAuthentication
    public Map b(String str) {
        return Collections.singletonMap("client_id", str);
    }
}
