package com.mbridge.msdk.out;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface Adapter {
    boolean init(Object... objArr);

    boolean loadAd(AdapterListener adapterListener);

    void registerView(Campaign campaign, View view);

    void registerView(Campaign campaign, View view, List<View> list);

    void unregisterView(Campaign campaign, View view);

    void unregisterView(Campaign campaign, View view, List<View> list);
}
