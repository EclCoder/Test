package com.bytedance.adsdk.hnj.hn.qor.hnj;

import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends dkl {
    @Override // com.bytedance.adsdk.hnj.hn.qor.hnj.dkl
    public int hnj(String str, int i10, Deque<com.bytedance.adsdk.hnj.hn.hn.hnj> deque, com.bytedance.adsdk.hnj.hn.qor.hnj hnjVar) {
        char cHnj;
        int i11 = i10;
        while (true) {
            cHnj = hnj(i11, str);
            if (!com.bytedance.adsdk.hnj.hn.sk.hnj.hn(cHnj) && !com.bytedance.adsdk.hnj.hn.sk.hnj.qor(cHnj)) {
                break;
            }
            i11++;
        }
        if (cHnj != '(') {
            return hnjVar.hnj(str, i10, deque);
        }
        deque.push(new com.bytedance.adsdk.hnj.hn.hn.hnj.ta(str.substring(i10, i11)));
        return i11 + 1;
    }
}
