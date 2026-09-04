package ag;

import android.os.Bundle;
import com.facebook.j0;
import com.facebook.p0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.hecorat.screenrecorder.free.models.FBLiveDestination;
import em.k0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends xf.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k0 dispatcher) {
        super(dispatcher);
        kotlin.jvm.internal.s.h(dispatcher, "dispatcher");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xf.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object a(fl.q qVar, kl.f fVar) throws JSONException {
        FBLiveDestination fBLiveDestination = (FBLiveDestination) qVar.d();
        String str = (String) qVar.g();
        com.facebook.a aVarC = nh.p.c(fBLiveDestination);
        Bundle bundle = new Bundle();
        if (fBLiveDestination.getType() == tg.a.WALL_EVERYONE) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, "EVERYONE");
            bundle.putString("privacy", jSONObject.toString());
        }
        bundle.putString("description", str);
        return new j0(aVarC, '/' + fBLiveDestination.getId() + "/live_videos", bundle, p0.POST, null, null, 48, null).k().d();
    }
}
