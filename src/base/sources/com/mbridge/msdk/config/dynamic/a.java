package com.mbridge.msdk.config.dynamic;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    private View a() {
        return null;
    }

    public View a(String str, ViewGroup viewGroup, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (!new File(str).exists()) {
            return null;
        }
        View viewA = c.a().a(str, viewGroup, aVar);
        return viewA != null ? viewA : a();
    }
}
