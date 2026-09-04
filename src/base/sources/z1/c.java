package z1;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.net.URLDecoder;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f58534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f58535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f58536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f58537h;

    public c() {
        super(false);
    }

    @Override // androidx.media3.datasource.a
    public long a(g gVar) throws ParserException, DataSourceException {
        f(gVar);
        this.f58534e = gVar;
        Uri uriNormalizeScheme = gVar.f58544a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        w1.a.b(DataSchemeDataSource.SCHEME_DATA.equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrU0 = c0.U0(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrU0.length != 2) {
            throw ParserException.b("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrU0[1];
        if (strArrU0[0].contains(";base64")) {
            try {
                this.f58535f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw ParserException.b("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f58535f = c0.n0(URLDecoder.decode(str, sc.e.f52292a.name()));
        }
        long j10 = gVar.f58550g;
        byte[] bArr = this.f58535f;
        if (j10 > bArr.length) {
            this.f58535f = null;
            throw new DataSourceException(2008);
        }
        int i10 = (int) j10;
        this.f58536g = i10;
        int length = bArr.length - i10;
        this.f58537h = length;
        long j11 = gVar.f58551h;
        if (j11 != -1) {
            this.f58537h = (int) Math.min(length, j11);
        }
        g(gVar);
        long j12 = gVar.f58551h;
        return j12 != -1 ? j12 : this.f58537h;
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        if (this.f58535f != null) {
            this.f58535f = null;
            e();
        }
        this.f58534e = null;
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        g gVar = this.f58534e;
        if (gVar != null) {
            return gVar.f58544a;
        }
        return null;
    }

    @Override // t1.g
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f58537h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(c0.h(this.f58535f), this.f58536g, bArr, i10, iMin);
        this.f58536g += iMin;
        this.f58537h -= iMin;
        d(iMin);
        return iMin;
    }
}
