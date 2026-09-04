package nb;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.net.URLDecoder;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.exoplayer2.upstream.a f46974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f46975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f46976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f46977h;

    public i() {
        super(false);
    }

    @Override // nb.j
    public void close() {
        if (this.f46975f != null) {
            this.f46975f = null;
            j();
        }
        this.f46974e = null;
    }

    @Override // nb.j
    public Uri getUri() {
        com.google.android.exoplayer2.upstream.a aVar = this.f46974e;
        if (aVar != null) {
            return aVar.f18779a;
        }
        return null;
    }

    @Override // nb.j
    public long h(com.google.android.exoplayer2.upstream.a aVar) throws DataSourceException, ParserException {
        k(aVar);
        this.f46974e = aVar;
        Uri uriNormalizeScheme = aVar.f18779a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        ob.a.b(DataSchemeDataSource.SCHEME_DATA.equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrY0 = r0.Y0(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrY0.length != 2) {
            throw ParserException.b("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrY0[1];
        if (strArrY0[0].contains(";base64")) {
            try {
                this.f46975f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw ParserException.b("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f46975f = r0.q0(URLDecoder.decode(str, sc.e.f52292a.name()));
        }
        long j10 = aVar.f18785g;
        byte[] bArr = this.f46975f;
        if (j10 > bArr.length) {
            this.f46975f = null;
            throw new DataSourceException(2008);
        }
        int i10 = (int) j10;
        this.f46976g = i10;
        int length = bArr.length - i10;
        this.f46977h = length;
        long j11 = aVar.f18786h;
        if (j11 != -1) {
            this.f46977h = (int) Math.min(length, j11);
        }
        l(aVar);
        long j12 = aVar.f18786h;
        return j12 != -1 ? j12 : this.f46977h;
    }

    @Override // nb.h
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f46977h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(r0.j(this.f46975f), this.f46976g, bArr, i10, iMin);
        this.f46976g += iMin;
        this.f46977h -= iMin;
        i(iMin);
        return iMin;
    }
}
