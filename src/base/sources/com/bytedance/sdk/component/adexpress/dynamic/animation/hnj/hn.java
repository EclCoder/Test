package com.bytedance.sdk.component.adexpress.dynamic.animation.hnj;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn implements ua {
    List<gjv> hnj = new ArrayList();

    public hn(View view, List<com.bytedance.sdk.component.adexpress.dynamic.gjv.hnj> list) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.gjv.hnj> it = list.iterator();
        while (it.hasNext()) {
            gjv gjvVarHnj = qor.hnj().hnj(view, it.next());
            if (gjvVarHnj != null) {
                this.hnj.add(gjvVarHnj);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ua
    public void hn() {
        Iterator<gjv> it = this.hnj.iterator();
        while (it.hasNext()) {
            try {
                it.next().hn();
            } catch (Exception unused) {
            }
        }
    }

    public void hnj() {
        Iterator<gjv> it = this.hnj.iterator();
        while (it.hasNext()) {
            try {
                it.next().qor();
            } catch (Exception unused) {
            }
        }
    }
}
