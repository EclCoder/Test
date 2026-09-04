package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class ParsingLoadable<T> implements Loader.Loadable {
    private volatile long bytesLoaded;
    private final DataSource dataSource;
    public final DataSpec dataSpec;
    private final Parser<? extends T> parser;
    private volatile T result;
    public final int type;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface Parser<T> {
        T parse(Uri uri, InputStream inputStream);
    }

    public ParsingLoadable(DataSource dataSource, Uri uri, int i10, Parser<? extends T> parser) {
        this(dataSource, new DataSpec(uri, 3), i10, parser);
    }

    public static <T> T load(DataSource dataSource, Parser<? extends T> parser, Uri uri) {
        ParsingLoadable parsingLoadable = new ParsingLoadable(dataSource, uri, 0, parser);
        parsingLoadable.load();
        return (T) parsingLoadable.getResult();
    }

    public long bytesLoaded() {
        return this.bytesLoaded;
    }

    public final T getResult() {
        return this.result;
    }

    public ParsingLoadable(DataSource dataSource, DataSpec dataSpec, int i10, Parser<? extends T> parser) {
        this.dataSource = dataSource;
        this.dataSpec = dataSpec;
        this.type = i10;
        this.parser = parser;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Loadable
    public final void load() {
        DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(this.dataSource, this.dataSpec);
        try {
            dataSourceInputStream.open();
            this.result = this.parser.parse(this.dataSource.getUri(), dataSourceInputStream);
        } finally {
            this.bytesLoaded = dataSourceInputStream.bytesRead();
            Util.closeQuietly(dataSourceInputStream);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
    }
}
