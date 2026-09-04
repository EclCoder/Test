package com.bytedance.sdk.openadsdk.hn;

import com.bytedance.sdk.component.utils.dse;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hnj {
    protected boolean hnj = false;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final ExecutorService f14502hn = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.hn.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class CallableC0246hnj implements Callable<Void> {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final File f14503hn;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public Void call() {
            hnj.this.hn(this.f14503hn);
            return null;
        }

        private CallableC0246hnj(File file) {
            this.f14503hn = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(File file) {
        if (!this.hnj) {
            try {
                dse.hn(file);
            } catch (Throwable unused) {
            }
            hnj(dse.hnj(file.getParentFile()));
        } else {
            List<File> listHnj = dse.hnj(file);
            listHnj.toString();
            hnj(listHnj);
        }
    }

    protected abstract void hnj(List<File> list);

    protected abstract boolean hnj(long j10, int i10);

    protected abstract boolean hnj(File file, long j10, int i10);

    public void hnj(File file) {
        this.f14502hn.submit(new CallableC0246hnj(file));
    }

    long hn(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }
}
