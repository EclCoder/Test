package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.net.URLDecoder;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class DataSchemeDataSource implements DataSource {
    public static final String SCHEME_DATA = "data";
    private int bytesRead;
    private byte[] data;
    private DataSpec dataSpec;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public void close() {
        this.dataSpec = null;
        this.data = null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public Uri getUri() {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws ParserException {
        this.dataSpec = dataSpec;
        Uri uri = dataSpec.uri;
        String scheme = uri.getScheme();
        if (!SCHEME_DATA.equals(scheme)) {
            throw new ParserException("Unsupported scheme: " + scheme);
        }
        String[] strArrSplit = Util.split(uri.getSchemeSpecificPart(), ",");
        if (strArrSplit.length != 2) {
            throw new ParserException("Unexpected URI format: " + uri);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.data = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw new ParserException("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.data = URLDecoder.decode(str, C.ASCII_NAME).getBytes();
        }
        return this.data.length;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int length = this.data.length - this.bytesRead;
        if (length == 0) {
            return -1;
        }
        int iMin = Math.min(i11, length);
        System.arraycopy(this.data, this.bytesRead, bArr, i10, iMin);
        this.bytesRead += iMin;
        return iMin;
    }
}
