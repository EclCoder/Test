package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AssetManager f11236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f11237c;

    public b(AssetManager assetManager, String str) {
        this.f11236b = assetManager;
        this.f11235a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f11237c;
        if (obj == null) {
            return;
        }
        try {
            c(obj);
        } catch (IOException unused) {
        }
    }

    protected abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public r5.a d() {
        return r5.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.h hVar, d.a aVar) {
        try {
            Object objF = f(this.f11236b, this.f11235a);
            this.f11237c = objF;
            aVar.f(objF);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            aVar.c(e10);
        }
    }

    protected abstract Object f(AssetManager assetManager, String str);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
