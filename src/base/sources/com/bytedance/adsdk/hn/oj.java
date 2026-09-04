package com.bytedance.adsdk.hn;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class oj {
    private boolean hnj = false;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Set<Object> f12019hn = new hnj();
    private final Map<String, com.bytedance.adsdk.hn.dkl.gjv> qor = new HashMap();
    private final Comparator<Pair<String, Float>> gjv = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.hn.oj.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = ((Float) pair.second).floatValue();
            float fFloatValue2 = ((Float) pair2.second).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    void hnj(boolean z10) {
        this.hnj = z10;
    }

    public void hnj(String str, float f10) {
        if (this.hnj) {
            com.bytedance.adsdk.hn.dkl.gjv gjvVar = this.qor.get(str);
            if (gjvVar == null) {
                gjvVar = new com.bytedance.adsdk.hn.dkl.gjv();
                this.qor.put(str, gjvVar);
            }
            gjvVar.hnj(f10);
            if (str.equals("__container")) {
                Iterator<Object> it = this.f12019hn.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
