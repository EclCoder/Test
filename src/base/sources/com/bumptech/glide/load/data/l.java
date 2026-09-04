package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class l implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final boolean f11259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f11260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f11261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f11262d;

    l(ContentResolver contentResolver, Uri uri, boolean z10) {
        this.f11261c = contentResolver;
        this.f11260b = uri;
        this.f11259a = z10;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f11262d;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public r5.a d() {
        return r5.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, d.a aVar) {
        try {
            Object objF = f(this.f11260b, this.f11261c);
            this.f11262d = objF;
            aVar.f(objF);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.c(e10);
        }
    }

    protected abstract Object f(Uri uri, ContentResolver contentResolver);

    protected AssetFileDescriptor g(Uri uri) {
        return (this.f11259a && s5.b.d(uri) && s5.b.c()) ? s5.b.h(uri, this.f11261c) : this.f11261c.openAssetFileDescriptor(uri, CampaignEx.JSON_KEY_AD_R);
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
