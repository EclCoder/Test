package com.mbridge.msdk.foundation.download.download;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.same.task.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class DownloadTask {
    private b mLoader;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class DownloadTaskHolder {
        public static DownloadTask instance = new DownloadTask();

        private DownloadTaskHolder() {
        }
    }

    public static DownloadTask getInstance() {
        return DownloadTaskHolder.instance;
    }

    private void init() {
        if (c.n().d() != null) {
            this.mLoader = new b(c.n().d());
        }
    }

    public void runTask(a aVar) {
        b bVar = this.mLoader;
        if (bVar != null) {
            bVar.a(aVar);
        }
    }

    private DownloadTask() {
        init();
    }
}
