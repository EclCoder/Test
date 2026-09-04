package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class DataChunk extends Chunk {
    private static final int READ_GRANULARITY = 16384;
    private byte[] data;
    private int limit;
    private volatile boolean loadCanceled;

    public DataChunk(DataSource dataSource, DataSpec dataSpec, int i10, Format format, int i11, Object obj, byte[] bArr) {
        super(dataSource, dataSpec, i10, format, i11, obj, C.TIME_UNSET, C.TIME_UNSET);
        this.data = bArr;
    }

    private void maybeExpandData() {
        byte[] bArr = this.data;
        if (bArr == null) {
            this.data = new byte[READ_GRANULARITY];
        } else if (bArr.length < this.limit + READ_GRANULARITY) {
            this.data = Arrays.copyOf(bArr, bArr.length + READ_GRANULARITY);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.chunk.Chunk
    public long bytesLoaded() {
        return this.limit;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    protected abstract void consume(byte[] bArr, int i10);

    public byte[] getDataHolder() {
        return this.data;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Loadable
    public final void load() {
        try {
            this.dataSource.open(this.dataSpec);
            int i10 = 0;
            this.limit = 0;
            while (i10 != -1 && !this.loadCanceled) {
                maybeExpandData();
                i10 = this.dataSource.read(this.data, this.limit, READ_GRANULARITY);
                if (i10 != -1) {
                    this.limit += i10;
                }
            }
            if (!this.loadCanceled) {
                consume(this.data, this.limit);
            }
        } finally {
            Util.closeQuietly(this.dataSource);
        }
    }
}
