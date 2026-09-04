package com.mbridge.msdk.foundation.same.report;

import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.v;
import com.mbridge.msdk.tracker.w;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class n extends w {
    @Override // com.mbridge.msdk.tracker.w
    protected v<String> a(q qVar) {
        String str;
        try {
            str = new String(qVar.f33823b, com.mbridge.msdk.tracker.network.toolbox.f.a(qVar.f33824c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(qVar.f33823b);
        }
        return v.a(str, com.mbridge.msdk.tracker.network.toolbox.f.a(qVar));
    }
}
