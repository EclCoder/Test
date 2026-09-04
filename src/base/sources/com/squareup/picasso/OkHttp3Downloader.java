package com.squareup.picasso;

import android.content.Context;
import gn.b0;
import gn.c;
import gn.d0;
import gn.e;
import gn.f0;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class OkHttp3Downloader implements Downloader {
    private final c cache;
    final e.a client;
    private boolean sharedClient;

    public OkHttp3Downloader(Context context) {
        this(Utils.createDefaultCacheDir(context));
    }

    @Override // com.squareup.picasso.Downloader
    public f0 load(d0 d0Var) {
        return this.client.a(d0Var).execute();
    }

    @Override // com.squareup.picasso.Downloader
    public void shutdown() {
        c cVar;
        if (this.sharedClient || (cVar = this.cache) == null) {
            return;
        }
        try {
            cVar.close();
        } catch (IOException unused) {
        }
    }

    public OkHttp3Downloader(File file) {
        this(file, Utils.calculateDiskCacheSize(file));
    }

    public OkHttp3Downloader(Context context, long j10) {
        this(Utils.createDefaultCacheDir(context), j10);
    }

    public OkHttp3Downloader(File file, long j10) {
        this(new b0.a().d(new c(file, j10)).c());
        this.sharedClient = false;
    }

    public OkHttp3Downloader(b0 b0Var) {
        this.sharedClient = true;
        this.client = b0Var;
        this.cache = b0Var.e();
    }

    public OkHttp3Downloader(e.a aVar) {
        this.sharedClient = true;
        this.client = aVar;
        this.cache = null;
    }
}
