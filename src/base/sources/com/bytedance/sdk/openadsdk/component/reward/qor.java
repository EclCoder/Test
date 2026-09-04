package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.utils.ua;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends com.bytedance.sdk.component.aq.hn.qor {
    private final List<? extends com.bytedance.sdk.component.aq.hn.qor> hnj;

    public qor(String str, List<? extends com.bytedance.sdk.component.aq.hn.qor> list) {
        super(str);
        this.hnj = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.aq.hn.qor> list;
        if (com.bytedance.sdk.component.utils.oj.qor(com.bytedance.sdk.openadsdk.core.oj.hnj()) != 0 && (list = this.hnj) != null) {
            Iterator<? extends com.bytedance.sdk.component.aq.hn.qor> it = list.iterator();
            while (it.hasNext()) {
                ua.hnj(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.ojm.hnj().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
