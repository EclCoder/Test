package com.bytedance.adsdk.hnj.hn.qor.hnj;

import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class dkl {
    protected int hn(int i10, String str) {
        while (com.bytedance.adsdk.hnj.hn.sk.hnj.hnj(hnj(i10, str))) {
            i10++;
        }
        return i10;
    }

    protected char hnj(int i10, String str) {
        if (i10 >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i10);
    }

    public abstract int hnj(String str, int i10, Deque<com.bytedance.adsdk.hnj.hn.hn.hnj> deque, com.bytedance.adsdk.hnj.hn.qor.hnj hnjVar);
}
