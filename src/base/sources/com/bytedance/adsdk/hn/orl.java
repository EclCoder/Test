package com.bytedance.adsdk.hn;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class orl<T> {
    public static Executor hnj = Executors.newCachedThreadPool();
    private final Handler gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Set<dnm<T>> f12042hn;
    private final Set<dnm<Throwable>> qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private volatile bug<T> f12043sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class hnj extends FutureTask<bug<T>> {
        hnj(Callable<bug<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                orl.this.hnj((bug) get());
            } catch (InterruptedException | ExecutionException e10) {
                orl.this.hnj(new bug(e10));
            }
        }
    }

    public orl(Callable<bug<T>> callable) {
        this(callable, false);
    }

    public synchronized orl<T> gjv(dnm<Throwable> dnmVar) {
        this.qor.remove(dnmVar);
        return this;
    }

    public synchronized orl<T> hn(dnm<T> dnmVar) {
        this.f12042hn.remove(dnmVar);
        return this;
    }

    public synchronized orl<T> qor(dnm<Throwable> dnmVar) {
        try {
            bug<T> bugVar = this.f12043sk;
            if (bugVar != null && bugVar.hn() != null) {
                dnmVar.hnj(bugVar.hn());
            }
            this.qor.add(dnmVar);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    orl(Callable<bug<T>> callable, boolean z10) {
        this.f12042hn = new LinkedHashSet(1);
        this.qor = new LinkedHashSet(1);
        this.gjv = new Handler(Looper.getMainLooper());
        this.f12043sk = null;
        if (!z10) {
            hnj.execute(new hnj(callable));
            return;
        }
        try {
            hnj((bug) callable.call());
        } catch (Throwable th2) {
            hnj((bug) new bug<>(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(bug<T> bugVar) {
        if (this.f12043sk == null) {
            this.f12043sk = bugVar;
            hnj();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized orl<T> hnj(dnm<T> dnmVar) {
        try {
            bug<T> bugVar = this.f12043sk;
            if (bugVar != null && bugVar.hnj() != null) {
                dnmVar.hnj(bugVar.hnj());
            }
            this.f12042hn.add(dnmVar);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    private void hnj() {
        this.gjv.post(new Runnable() { // from class: com.bytedance.adsdk.hn.orl.1
            @Override // java.lang.Runnable
            public void run() {
                bug bugVar = orl.this.f12043sk;
                if (bugVar == null) {
                    return;
                }
                if (bugVar.hnj() != null) {
                    orl.this.hnj(bugVar.hnj());
                } else {
                    orl.this.hnj(bugVar.hn());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void hnj(T t10) {
        ArrayList arrayList = new ArrayList(this.f12042hn);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((dnm) obj).hnj(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void hnj(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.qor);
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((dnm) obj).hnj(th2);
        }
    }
}
