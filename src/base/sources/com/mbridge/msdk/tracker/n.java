package com.mbridge.msdk.tracker;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class n implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, a> f33757a = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f33758a;

        public a(boolean z10) {
            this.f33758a = z10;
        }

        public boolean a() {
            return this.f33758a;
        }
    }

    @Override // com.mbridge.msdk.tracker.f
    public boolean a(e eVar) {
        a aVar;
        if (eVar != null && !TextUtils.isEmpty(eVar.g())) {
            try {
                String strG = eVar.g();
                if (this.f33757a.containsKey(strG)) {
                    aVar = this.f33757a.get(strG);
                } else {
                    a aVar2 = new a(com.mbridge.msdk.foundation.same.report.c.a(strG));
                    this.f33757a.put(strG, aVar2);
                    aVar = aVar2;
                }
                return aVar != null && aVar.a();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("TrackManager", "apply", e10);
                }
            }
        }
        return false;
    }
}
