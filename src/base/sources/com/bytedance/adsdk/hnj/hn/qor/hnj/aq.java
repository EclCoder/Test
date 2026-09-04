package com.bytedance.adsdk.hnj.hn.qor.hnj;

import com.bytedance.adsdk.hnj.hn.hn.hnj.jip;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq extends dkl {
    @Override // com.bytedance.adsdk.hnj.hn.qor.hnj.dkl
    public int hnj(String str, int i10, Deque<com.bytedance.adsdk.hnj.hn.hn.hnj> deque, com.bytedance.adsdk.hnj.hn.qor.hnj hnjVar) {
        if (!com.bytedance.adsdk.hnj.hn.sk.hnj.gjv(hnj(i10, str))) {
            return hnjVar.hnj(str, i10, deque);
        }
        int i11 = i10 + 1;
        String str2 = new String(new char[]{hnj(i10, str), hnj(i11, str)});
        if (com.bytedance.adsdk.hnj.hn.gjv.qor.hnj(str2) != null) {
            deque.push(new jip(com.bytedance.adsdk.hnj.hn.gjv.qor.hnj(str2)));
            return i10 + 2;
        }
        String strValueOf = String.valueOf(hnj(i10, str));
        if (com.bytedance.adsdk.hnj.hn.gjv.qor.hnj(strValueOf) != null) {
            deque.push(new jip(com.bytedance.adsdk.hnj.hn.gjv.qor.hnj(strValueOf)));
            return i11;
        }
        throw new IllegalArgumentException("Unrecognized:" + strValueOf + "examine:" + str.substring(0, i10));
    }
}
