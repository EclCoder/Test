package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.dynview.listener.h;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f34175b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, SoftReference<View>> f34176a = new HashMap();

    private b() {
    }

    public static b a() {
        b bVar;
        if (f34175b != null) {
            return f34175b;
        }
        synchronized (b.class) {
            try {
                if (f34175b == null) {
                    f34175b = new b();
                }
                bVar = f34175b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public void a(Context context, List<CampaignEx> list, h hVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.ui.a(context, list, hVar, map);
    }

    public void a(c cVar, h hVar) {
        new com.mbridge.msdk.video.dynview.ui.a(cVar, hVar, new HashMap());
    }

    public void a(c cVar, h hVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.ui.a(cVar, hVar, map);
    }
}
