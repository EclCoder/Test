package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.offline.FilterableManifest;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.ParsingLoadable;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class FilteringManifestParser<T extends FilterableManifest<T, K>, K> implements ParsingLoadable.Parser<T> {
    private final ParsingLoadable.Parser<T> parser;
    private final List<K> trackKeys;

    public FilteringManifestParser(ParsingLoadable.Parser<T> parser, List<K> list) {
        this.parser = parser;
        this.trackKeys = list;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.ParsingLoadable.Parser
    public T parse(Uri uri, InputStream inputStream) {
        T t10 = this.parser.parse(uri, inputStream);
        List<K> list = this.trackKeys;
        return (list == null || list.isEmpty()) ? t10 : (T) t10.copy(this.trackKeys);
    }
}
