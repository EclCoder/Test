package s5;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c implements com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f51476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f51477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InputStream f51478c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f51479b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f51480a;

        a(ContentResolver contentResolver) {
            this.f51480a = contentResolver;
        }

        @Override // s5.d
        public Cursor a(Uri uri) {
            return this.f51480a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f51479b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f51481b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f51482a;

        b(ContentResolver contentResolver) {
            this.f51482a = contentResolver;
        }

        @Override // s5.d
        public Cursor a(Uri uri) {
            return this.f51482a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f51481b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    c(Uri uri, e eVar) {
        this.f51476a = uri;
        this.f51477b = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.c.e(context).l().g(), dVar, com.bumptech.glide.c.e(context).g(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws Throwable {
        InputStream inputStreamD = this.f51477b.d(this.f51476a);
        int iA = inputStreamD != null ? this.f51477b.a(this.f51476a) : -1;
        return iA != -1 ? new g(inputStreamD, iA) : inputStreamD;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f51478c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public r5.a d() {
        return r5.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(h hVar, com.bumptech.glide.load.data.d.a aVar) throws Throwable {
        try {
            InputStream inputStreamH = h();
            this.f51478c = inputStreamH;
            aVar.f(inputStreamH);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.c(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
