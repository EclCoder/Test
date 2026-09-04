package com.mbridge.msdk.mbbid.common.net;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f31375a = "c";

    public c(String str, String str2) {
        this.unitId = str2;
        this.placementId = str;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        if (200 != iOptInt) {
            a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        BidResponsedEx bidResponsedEx = BidResponsedEx.parseBidResponsedEx(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), this.unitId);
        if (bidResponsedEx != null) {
            a(bidResponsedEx);
        } else {
            a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
        }
    }

    public abstract void a(int i10, String str);

    public abstract void a(BidResponsedEx bidResponsedEx);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f31375a, "errorCode = " + aVar.f30579a);
        a(aVar.f30579a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.f30577b) == null) {
            return;
        }
        a(aVar.f30600b, eVar.f30578c);
    }
}
