package androidx.media3.exoplayer.upstream;

import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6110a;

    public a() {
        this(-1);
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public int a(int i10) {
        int i11 = this.f6110a;
        if (i11 == -1) {
            return i10 == 7 ? 6 : 3;
        }
        return i11;
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public long c(b.a aVar) {
        IOException iOException = aVar.f6113c;
        return ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException) || DataSourceException.a(iOException)) ? C.TIME_UNSET : Math.min((aVar.f6114d - 1) * 1000, 5000);
    }

    public a(int i10) {
        this.f6110a = i10;
    }
}
