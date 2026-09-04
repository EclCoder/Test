package com.bytedance.adsdk.hnj.hn.qor.hnj;

import com.bytedance.adsdk.hnj.hn.hn.hnj.eum;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends dkl {
    @Override // com.bytedance.adsdk.hnj.hn.qor.hnj.dkl
    public int hnj(String str, int i10, Deque<com.bytedance.adsdk.hnj.hn.hn.hnj> deque, com.bytedance.adsdk.hnj.hn.qor.hnj hnjVar) {
        if (',' != hnj(i10, str)) {
            return hnjVar.hnj(str, i10, deque);
        }
        deque.push(new eum(com.bytedance.adsdk.hnj.hn.gjv.gjv.COMMA));
        return i10 + 1;
    }
}
