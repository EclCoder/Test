package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18800a;

    public b() {
        this(-1);
    }

    @Override // com.google.android.exoplayer2.upstream.c
    public int a(int i10) {
        int i11 = this.f18800a;
        if (i11 == -1) {
            return i10 == 7 ? 6 : 3;
        }
        return i11;
    }

    @Override // com.google.android.exoplayer2.upstream.c
    public long c(c.C0294c c0294c) {
        IOException iOException = c0294c.f18809c;
        return ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException) || DataSourceException.a(iOException)) ? C.TIME_UNSET : Math.min((c0294c.f18810d - 1) * 1000, 5000);
    }

    @Override // com.google.android.exoplayer2.upstream.c
    public c.b d(c.a aVar, c.C0294c c0294c) {
        if (!e(c0294c.f18809c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new c.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new c.b(2, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        }
        return null;
    }

    protected boolean e(IOException iOException) {
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException)) {
            return false;
        }
        int i10 = ((HttpDataSource$InvalidResponseCodeException) iOException).f18739d;
        return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
    }

    public b(int i10) {
        this.f18800a = i10;
    }
}
