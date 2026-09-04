package com.vungle.ads.internal.executor;

import com.vungle.ads.internal.util.q;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements Future {
    public static final a Companion = new a(null);
    private static final String TAG = b.class.getSimpleName();
    private final Future<Object> future;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return b.TAG;
        }

        private a() {
        }
    }

    public b(Future<Object> future) {
        this.future = future;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        Future<Object> future = this.future;
        if (future != null) {
            return future.cancel(z10);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        try {
            Future<Object> future = this.future;
            if (future != null) {
                return future.get();
            }
            return null;
        } catch (InterruptedException unused) {
            q.a aVar = q.Companion;
            String TAG2 = TAG;
            s.g(TAG2, "TAG");
            aVar.w(TAG2, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e10) {
            q.a aVar2 = q.Companion;
            String TAG3 = TAG;
            s.g(TAG3, "TAG");
            aVar2.e(TAG3, "error on execution", e10);
            return null;
        }
    }

    public final Future<Object> getFuture() {
        return this.future;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        Future<Object> future = this.future;
        if (future != null) {
            return future.isCancelled();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Future<Object> future = this.future;
        if (future != null) {
            return future.isDone();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit unit) {
        s.h(unit, "unit");
        try {
            Future<Object> future = this.future;
            if (future != null) {
                return future.get(j10, unit);
            }
            return null;
        } catch (InterruptedException unused) {
            q.a aVar = q.Companion;
            String TAG2 = TAG;
            s.g(TAG2, "TAG");
            aVar.w(TAG2, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e10) {
            q.a aVar2 = q.Companion;
            String TAG3 = TAG;
            s.g(TAG3, "TAG");
            aVar2.e(TAG3, "error on execution", e10);
            return null;
        } catch (TimeoutException e11) {
            q.a aVar3 = q.Companion;
            String TAG4 = TAG;
            s.g(TAG4, "TAG");
            aVar3.e(TAG4, "error on timeout", e11);
            s.g(TAG4, "TAG");
            aVar3.w(TAG4, "future.get() Timeout on Thread " + Thread.currentThread().getName());
            return null;
        }
    }
}
