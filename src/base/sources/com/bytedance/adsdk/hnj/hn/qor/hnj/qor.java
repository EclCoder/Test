package com.bytedance.adsdk.hnj.hn.qor.hnj;

import com.bytedance.adsdk.hnj.hn.hn.hnj.wu;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends dkl {
    @Override // com.bytedance.adsdk.hnj.hn.qor.hnj.dkl
    public int hnj(String str, int i10, Deque<com.bytedance.adsdk.hnj.hn.hn.hnj> deque, com.bytedance.adsdk.hnj.hn.qor.hnj hnjVar) {
        char cHnj = hnj(i10, str);
        return (com.bytedance.adsdk.hnj.hn.sk.hnj.hn(cHnj) || cHnj == '$') ? hnj(str, i10, deque) : hnjVar.hnj(str, i10, deque);
    }

    private int hnj(String str, int i10, Deque<com.bytedance.adsdk.hnj.hn.hn.hnj> deque) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = i12 + i10;
            char cHnj = hnj(i11, str);
            if (!com.bytedance.adsdk.hnj.hn.sk.hnj.hn(cHnj) && !com.bytedance.adsdk.hnj.hn.sk.hnj.qor(cHnj) && '.' != cHnj && '[' != cHnj && ']' != cHnj && '_' != cHnj && '$' != cHnj) {
                break;
            }
            i12++;
        }
        String strSubstring = str.substring(i10, i11);
        if (com.bytedance.adsdk.hnj.hn.gjv.hnj.hnj(strSubstring) != null) {
            deque.push(new com.bytedance.adsdk.hnj.hn.hn.hnj.dse(strSubstring));
            return i11;
        }
        deque.push(new wu(strSubstring));
        return i11;
    }
}
