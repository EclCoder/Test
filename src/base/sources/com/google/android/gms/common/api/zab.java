package com.google.android.gms.common.api;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zab implements PendingResult.StatusListener {
    final /* synthetic */ Batch zaa;

    zab(Batch batch) {
        this.zaa = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        synchronized (this.zaa.zai) {
            try {
                if (this.zaa.isCanceled()) {
                    return;
                }
                if (status.isCanceled()) {
                    this.zaa.zag = true;
                } else if (!status.isSuccess()) {
                    this.zaa.zaf = true;
                }
                this.zaa.zae--;
                Batch batch = this.zaa;
                if (batch.zae == 0) {
                    if (batch.zag) {
                        super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                    } else {
                        Status status2 = batch.zaf ? new Status(13) : Status.RESULT_SUCCESS;
                        Batch batch2 = this.zaa;
                        batch2.setResult(new BatchResult(status2, batch2.zah));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
