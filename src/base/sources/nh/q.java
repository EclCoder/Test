package nh;

import com.hecorat.screenrecorder.free.models.BitRate;
import com.hecorat.screenrecorder.free.models.EncodeParam;
import com.hecorat.screenrecorder.free.models.FBLiveDestination;
import com.hecorat.screenrecorder.free.models.FrameRate;
import com.hecorat.screenrecorder.free.models.Resolution;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
abstract /* synthetic */ class q {
    public static final EncodeParam a() {
        return new EncodeParam(new Resolution("720p", (int) Math.floor(b.c().c() * 720), 720), new BitRate("3Mbps", 3000000), new FrameRate("30fps", 30));
    }

    public static final List b() {
        FBLiveDestination fBLiveDestinationD;
        ArrayList arrayList = new ArrayList();
        com.facebook.a aVarE = com.facebook.a.f14853l.e();
        if (aVarE == null || (fBLiveDestinationD = p.d()) == null) {
            return null;
        }
        FBLiveDestination fBLiveDestination = new FBLiveDestination(aVarE.q(), "Only Me", aVarE.p(), tg.a.WALL_ONLY_ME);
        arrayList.add(fBLiveDestinationD);
        arrayList.add(fBLiveDestination);
        return arrayList;
    }

    public static final com.facebook.a c(FBLiveDestination destination) {
        kotlin.jvm.internal.s.h(destination, "destination");
        com.facebook.a aVarE = com.facebook.a.f14853l.e();
        if (aVarE == null) {
            return null;
        }
        return destination.getType() == tg.a.PAGE ? new com.facebook.a(destination.getToken(), aVarE.c(), aVarE.q(), aVarE.n(), null, null, com.facebook.l.f15535d, aVarE.i(), null, null, null) : aVarE;
    }

    public static final FBLiveDestination d() {
        com.facebook.a aVarE = com.facebook.a.f14853l.e();
        if (aVarE == null) {
            return null;
        }
        return new FBLiveDestination(aVarE.q(), "My Wall", aVarE.p(), tg.a.WALL_EVERYONE);
    }
}
