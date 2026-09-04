package bg;

import android.text.TextUtils;
import em.k0;
import fl.g0;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends xf.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sf.e f8870b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sf.e preferenceStorage, k0 dispatcher) {
        super(dispatcher);
        kotlin.jvm.internal.s.h(preferenceStorage, "preferenceStorage");
        kotlin.jvm.internal.s.h(dispatcher, "dispatcher");
        this.f8870b = preferenceStorage;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xf.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object a(g0 g0Var, kl.f fVar) {
        String strF = this.f8870b.F();
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        try {
            return net.openid.appauth.c.l(strF);
        } catch (JSONException e10) {
            wp.a.e(e10);
            return null;
        }
    }
}
