package com.bytedance.adsdk.hnj.hn.qor.hnj;

import com.bytedance.adsdk.hnj.hn.hn.hnj.fc;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse extends dkl {
    private boolean hnj(String str, int i10, Deque<com.bytedance.adsdk.hnj.hn.hn.hnj> deque) {
        if ('-' != hnj(i10, str)) {
            return com.bytedance.adsdk.hnj.hn.sk.hnj.qor(hnj(i10, str));
        }
        if (deque.peek() != null && !com.bytedance.adsdk.hnj.hn.gjv.qor.hnj(deque.peek().hnj())) {
            return false;
        }
        if (com.bytedance.adsdk.hnj.hn.sk.hnj.qor(hnj(i10 + 1, str))) {
            return true;
        }
        throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i10));
    }

    @Override // com.bytedance.adsdk.hnj.hn.qor.hnj.dkl
    public int hnj(String str, int i10, Deque<com.bytedance.adsdk.hnj.hn.hn.hnj> deque, com.bytedance.adsdk.hnj.hn.qor.hnj hnjVar) {
        char cHnj;
        if (!hnj(str, i10, deque)) {
            return hnjVar.hnj(str, i10, deque);
        }
        int i11 = hnj(i10, str) == '-' ? i10 + 1 : i10;
        boolean z10 = false;
        while (true) {
            cHnj = hnj(i11, str);
            if (!com.bytedance.adsdk.hnj.hn.sk.hnj.qor(cHnj) && (z10 || cHnj != '.')) {
                break;
            }
            i11++;
            if (cHnj == '.') {
                z10 = true;
            }
        }
        if (cHnj != '.') {
            deque.push(new fc(str.substring(i10, i11)));
            return i11;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i10, i11));
    }
}
