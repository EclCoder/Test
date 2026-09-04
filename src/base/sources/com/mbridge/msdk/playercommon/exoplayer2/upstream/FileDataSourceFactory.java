package com.mbridge.msdk.playercommon.exoplayer2.upstream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class FileDataSourceFactory implements DataSource.Factory {
    private final TransferListener<? super FileDataSource> listener;

    public FileDataSourceFactory() {
        this(null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource.Factory
    public DataSource createDataSource() {
        return new FileDataSource(this.listener);
    }

    public FileDataSourceFactory(TransferListener<? super FileDataSource> transferListener) {
        this.listener = transferListener;
    }
}
