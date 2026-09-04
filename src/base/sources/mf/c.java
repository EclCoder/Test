package mf;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import gl.r;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f46225f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f46226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String[] f46228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f46229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f46230e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(List list, List list2);
    }

    public c(Context context) {
        s.h(context, "context");
        this.f46226a = context;
        this.f46230e = new ArrayList();
    }

    private final void c(List list) {
        AssetManager assets = this.f46226a.getResources().getAssets();
        s.g(assets, "getAssets(...)");
        String[] strArr = new String[0];
        try {
            String[] list2 = assets.list("stickers");
            if (list2 == null) {
                list2 = new String[0];
            }
            strArr = list2;
        } catch (IOException e10) {
            com.google.firebase.crashlytics.a.b().d(e10);
        }
        for (String str : strArr) {
            String str2 = "stickers/" + str;
            list.add(new ng.b(null, Uri.parse("file:///android_asset/" + str2), str2, "Stickers", str, 0, true, 33, null));
        }
        this.f46230e.add("Stickers");
    }

    private final ArrayList d(Cursor cursor, Uri uri) {
        String name;
        ArrayList arrayList = new ArrayList();
        cursor.moveToFirst();
        Uri contentUri = uri;
        while (!cursor.isAfterLast()) {
            long j10 = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
            String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
            String string2 = cursor.getString(cursor.getColumnIndexOrThrow(CampaignEx.JSON_KEY_TITLE));
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                name = cursor.getString(cursor.getColumnIndexOrThrow("bucket_display_name"));
                s.e(name);
            } else {
                File parentFile = new File(string).getParentFile();
                if (parentFile == null || (name = parentFile.getName()) == null) {
                    name = "";
                }
            }
            String str = name;
            if (i10 >= 29) {
                contentUri = MediaStore.Images.Media.getContentUri(cursor.getString(cursor.getColumnIndexOrThrow("volume_name")));
            }
            Uri uriWithAppendedId = ContentUris.withAppendedId(contentUri, j10);
            s.g(uriWithAppendedId, "withAppendedId(...)");
            s.e(string);
            s.e(string2);
            arrayList.add(new ng.b(null, uriWithAppendedId, string, str, string2, 0, false, 33, null));
            if (!this.f46230e.contains(str)) {
                this.f46230e.add(str);
            }
            cursor.moveToNext();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final c cVar, Handler handler, final b bVar) {
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(r.o("_id", "_data", CampaignEx.JSON_KEY_TITLE));
        if (Build.VERSION.SDK_INT >= 29) {
            arrayList2.add("volume_name");
            arrayList2.add("bucket_display_name");
        }
        cVar.c(arrayList);
        cVar.f46227b = "_data LIKE ? OR _data LIKE ?";
        cVar.f46228c = new String[]{"%.png", "%.jpg"};
        cVar.f46229d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        try {
            ContentResolver contentResolver = cVar.f46226a.getContentResolver();
            Uri uri = cVar.f46229d;
            s.e(uri);
            Cursor cursorQuery = contentResolver.query(uri, (String[]) arrayList2.toArray(new String[0]), cVar.f46227b, cVar.f46228c, "title ASC");
            if (cursorQuery != null) {
                Cursor cursor = cursorQuery;
                try {
                    Uri uri2 = cVar.f46229d;
                    s.e(uri2);
                    arrayList.addAll(cVar.d(cursor, uri2));
                    ql.b.a(cursor, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ql.b.a(cursor, th2);
                        throw th3;
                    }
                }
            }
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
        handler.post(new Runnable() { // from class: mf.b
            @Override // java.lang.Runnable
            public final void run() {
                c.g(bVar, arrayList, cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(b bVar, ArrayList arrayList, c cVar) {
        bVar.a(arrayList, cVar.f46230e);
    }

    public final void e(final b callback) {
        s.h(callback, "callback");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: mf.a
            @Override // java.lang.Runnable
            public final void run() {
                c.f(this.f46219a, handler, callback);
            }
        });
    }
}
