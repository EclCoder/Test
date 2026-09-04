package com.bytedance.adsdk.hnj.hn.qor.hnj;

import java.util.Deque;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends dkl {
    @Override // com.bytedance.adsdk.hnj.hn.qor.hnj.dkl
    public int hnj(String str, int i10, Deque<com.bytedance.adsdk.hnj.hn.hn.hnj> deque, com.bytedance.adsdk.hnj.hn.qor.hnj hnjVar) {
        com.bytedance.adsdk.hnj.hn.hn.hnj hnjVarPollFirst;
        if (')' != hnj(i10, str)) {
            return hnjVar.hnj(str, i10, deque);
        }
        LinkedList<com.bytedance.adsdk.hnj.hn.hn.hnj> linkedList = new LinkedList();
        while (true) {
            hnjVarPollFirst = deque.pollFirst();
            if (hnjVarPollFirst == null || hnjVarPollFirst.hnj() == com.bytedance.adsdk.hnj.hn.gjv.gjv.LEFT_PAREN || ((hnjVarPollFirst instanceof com.bytedance.adsdk.hnj.hn.hn.hnj.ta) && hnjVarPollFirst.hnj() == com.bytedance.adsdk.hnj.hn.gjv.hn.METHOD && !((com.bytedance.adsdk.hnj.hn.hn.hnj.ta) hnjVarPollFirst).qor())) {
                break;
            }
            linkedList.addFirst(hnjVarPollFirst);
        }
        if (hnjVarPollFirst == null) {
            throw new IllegalArgumentException(str.substring(0, i10));
        }
        if (hnjVarPollFirst.hnj() != com.bytedance.adsdk.hnj.hn.gjv.hn.METHOD) {
            deque.push(com.bytedance.adsdk.hnj.hn.sk.hn.hnj(linkedList, str, i10));
            return i10 + 1;
        }
        com.bytedance.adsdk.hnj.hn.hn.hnj.ta taVar = (com.bytedance.adsdk.hnj.hn.hn.hnj.ta) hnjVarPollFirst;
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (com.bytedance.adsdk.hnj.hn.hn.hnj hnjVar2 : linkedList) {
            if (hnjVar2.hnj() == com.bytedance.adsdk.hnj.hn.gjv.gjv.COMMA) {
                linkedList2.add(com.bytedance.adsdk.hnj.hn.sk.hn.hnj(linkedList3, str, i10));
                linkedList3.clear();
            } else {
                linkedList3.addLast(hnjVar2);
            }
        }
        if (!linkedList3.isEmpty()) {
            linkedList2.add(com.bytedance.adsdk.hnj.hn.sk.hn.hnj(linkedList3, str, i10));
        }
        taVar.hnj((com.bytedance.adsdk.hnj.hn.hn.hnj[]) linkedList2.toArray(new com.bytedance.adsdk.hnj.hn.hn.hnj[linkedList2.size()]));
        taVar.hnj(true);
        int i11 = i10 + 1;
        deque.push(taVar);
        return i11;
    }
}
