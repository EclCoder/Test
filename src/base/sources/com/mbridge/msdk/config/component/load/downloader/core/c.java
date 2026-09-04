package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c extends FutureTask<h> implements Comparable<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f28822a;

    c(h hVar) {
        super(hVar, null);
        this.f28822a = hVar;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        h hVar = this.f28822a;
        int i10 = hVar.f28876a;
        h hVar2 = cVar.f28822a;
        int i11 = hVar2.f28876a;
        return i10 == i11 ? hVar.f28877b - hVar2.f28877b : i11 - i10;
    }
}
