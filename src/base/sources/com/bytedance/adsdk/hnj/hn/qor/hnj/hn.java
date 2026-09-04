package com.bytedance.adsdk.hnj.hn.qor.hnj;

import com.bytedance.adsdk.hnj.hn.hn.hnj.apu;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends dkl {
    @Override // com.bytedance.adsdk.hnj.hn.qor.hnj.dkl
    public int hnj(String str, int i10, Deque<com.bytedance.adsdk.hnj.hn.hn.hnj> deque, com.bytedance.adsdk.hnj.hn.qor.hnj hnjVar) {
        if ('\'' != hnj(i10, str)) {
            return hnjVar.hnj(str, i10, deque);
        }
        int i11 = i10 + 1;
        int length = str.length();
        int i12 = i11;
        while (i12 < length && hnj(i12, str) != '\'') {
            i12++;
        }
        if (hnj(i12, str) != '\'') {
            throw new com.bytedance.adsdk.hnj.hnj.hnj("String expression not surrounded by '", str.substring(i10));
        }
        deque.push(new apu(str.substring(i11, i12)));
        return i12 + 1;
    }
}
