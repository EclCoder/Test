package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u extends t implements ListenableFuture {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class a extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ListenableFuture f22055a;

        protected a(ListenableFuture listenableFuture) {
            this.f22055a = (ListenableFuture) sc.p.o(listenableFuture);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.t
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final ListenableFuture f() {
            return this.f22055a;
        }
    }

    protected u() {
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        a().addListener(runnable, executor);
    }

    /* JADX INFO: renamed from: g */
    protected abstract ListenableFuture a();
}
