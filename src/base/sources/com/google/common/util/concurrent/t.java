package com.google.common.util.concurrent;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t extends com.google.common.collect.x implements Future {
    protected t() {
    }

    public boolean cancel(boolean z10) {
        return f().cancel(z10);
    }

    protected abstract Future f();

    @Override // java.util.concurrent.Future
    public Object get() {
        return f().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return f().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return f().isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return f().get(j10, timeUnit);
    }
}
