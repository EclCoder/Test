package d8;

import android.os.Bundle;
import com.facebook.internal.e1;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import gl.r;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f36418a = new c();

    private c() {
    }

    private final Bundle a(e8.f fVar, boolean z10) {
        return d(fVar, z10);
    }

    private final Bundle b(e8.j jVar, List list, boolean z10) {
        Bundle bundleD = d(jVar, z10);
        bundleD.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList<>(list));
        return bundleD;
    }

    public static final Bundle c(UUID callId, e8.d shareContent, boolean z10) {
        s.h(callId, "callId");
        s.h(shareContent, "shareContent");
        if (shareContent instanceof e8.f) {
            return f36418a.a((e8.f) shareContent, z10);
        }
        if (!(shareContent instanceof e8.j)) {
            return null;
        }
        e8.j jVar = (e8.j) shareContent;
        List listH = k.h(jVar, callId);
        if (listH == null) {
            listH = r.l();
        }
        return f36418a.b(jVar, listH, z10);
    }

    private final Bundle d(e8.d dVar, boolean z10) {
        Bundle bundle = new Bundle();
        e1.t0(bundle, "com.facebook.platform.extra.LINK", dVar.a());
        e1.s0(bundle, jyeoXJ.FZEV, dVar.e());
        e1.s0(bundle, "com.facebook.platform.extra.REF", dVar.f());
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z10);
        List listC = dVar.c();
        if (listC != null && !listC.isEmpty()) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList<>(listC));
        }
        return bundle;
    }
}
