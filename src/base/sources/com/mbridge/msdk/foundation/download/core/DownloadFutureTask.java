package com.mbridge.msdk.foundation.download.core;

import com.mbridge.msdk.foundation.download.DownloadPriority;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class DownloadFutureTask extends FutureTask<Downloader> implements Comparable<DownloadFutureTask> {
    private final Downloader downloader;

    DownloadFutureTask(Downloader downloader) {
        super(downloader, null);
        this.downloader = downloader;
    }

    @Override // java.lang.Comparable
    public int compareTo(DownloadFutureTask downloadFutureTask) {
        Downloader downloader = this.downloader;
        DownloadPriority downloadPriority = downloader.downloadPriority;
        Downloader downloader2 = downloadFutureTask.downloader;
        DownloadPriority downloadPriority2 = downloader2.downloadPriority;
        return downloadPriority == downloadPriority2 ? downloader.sequence - downloader2.sequence : downloadPriority2.ordinal() - downloadPriority.ordinal();
    }
}
