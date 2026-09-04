package com.squareup.picasso;

import android.net.NetworkInfo;
import gn.d;
import gn.d0;
import gn.f0;
import gn.g0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class NetworkRequestHandler extends RequestHandler {
    private static final String SCHEME_HTTP = "http";
    private static final String SCHEME_HTTPS = "https";
    private final Downloader downloader;
    private final Stats stats;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class ContentLengthException extends IOException {
        ContentLengthException(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class ResponseException extends IOException {
        final int code;
        final int networkPolicy;

        ResponseException(int i10, int i11) {
            super("HTTP " + i10);
            this.code = i10;
            this.networkPolicy = i11;
        }
    }

    NetworkRequestHandler(Downloader downloader, Stats stats) {
        this.downloader = downloader;
        this.stats = stats;
    }

    private static d0 createRequest(Request request, int i10) {
        d dVarA;
        if (i10 == 0) {
            dVarA = null;
        } else if (NetworkPolicy.isOfflineOnly(i10)) {
            dVarA = d.f39531p;
        } else {
            d.a aVar = new d.a();
            if (!NetworkPolicy.shouldReadFromDiskCache(i10)) {
                aVar.k();
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i10)) {
                aVar.l();
            }
            dVarA = aVar.a();
        }
        d0.a aVarV = new d0.a().v(request.uri.toString());
        if (dVarA != null) {
            aVarV.c(dVarA);
        }
        return aVarV.b();
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        String scheme = request.uri.getScheme();
        return SCHEME_HTTP.equals(scheme) || SCHEME_HTTPS.equals(scheme);
    }

    @Override // com.squareup.picasso.RequestHandler
    int getRetryCount() {
        return 2;
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) throws ResponseException, ContentLengthException {
        f0 f0VarLoad = this.downloader.load(createRequest(request, i10));
        g0 g0VarD = f0VarLoad.d();
        if (!f0VarLoad.i0()) {
            g0VarD.close();
            throw new ResponseException(f0VarLoad.m(), request.networkPolicy);
        }
        Picasso.LoadedFrom loadedFrom = f0VarLoad.k() == null ? Picasso.LoadedFrom.NETWORK : Picasso.LoadedFrom.DISK;
        if (loadedFrom == Picasso.LoadedFrom.DISK && g0VarD.contentLength() == 0) {
            g0VarD.close();
            throw new ContentLengthException("Received response with 0 content-length header.");
        }
        if (loadedFrom == Picasso.LoadedFrom.NETWORK && g0VarD.contentLength() > 0) {
            this.stats.dispatchDownloadFinished(g0VarD.contentLength());
        }
        return new RequestHandler.Result(g0VarD.source(), loadedFrom);
    }

    @Override // com.squareup.picasso.RequestHandler
    boolean shouldRetry(boolean z10, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.RequestHandler
    boolean supportsReplay() {
        return true;
    }
}
