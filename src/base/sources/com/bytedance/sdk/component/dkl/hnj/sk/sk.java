package com.bytedance.sdk.component.dkl.hnj.sk;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class sk implements Comparable<sk>, Runnable {
    private String qor;
    private int hnj = 5;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f12823hn = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public sk(String str) {
        this.qor = str;
    }

    public void hnj(int i10) {
        this.hnj = i10;
    }

    public int hnj() {
        return this.hnj;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
    public int compareTo(sk skVar) {
        if (hnj() < skVar.hnj()) {
            return 1;
        }
        return hnj() >= skVar.hnj() ? -1 : 0;
    }
}
