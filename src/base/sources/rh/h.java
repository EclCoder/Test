package rh;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.hecorat.screenrecorder.free.R;
import java.util.ArrayList;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class h extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f51344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        s.h(context, "context");
        this.f51344d = context;
    }

    @Override // rh.g
    protected ng.c c(Cursor cursor, Uri contentUri, String path, String str, String title, long j10) {
        s.h(cursor, "cursor");
        s.h(contentUri, "contentUri");
        s.h(path, "path");
        s.h(title, "title");
        long j11 = cursor.getLong(cursor.getColumnIndexOrThrow("duration"));
        int i10 = cursor.getInt(cursor.getColumnIndexOrThrow("width"));
        int i11 = cursor.getInt(cursor.getColumnIndexOrThrow("height"));
        long j12 = cursor.getLong(cursor.getColumnIndexOrThrow("_size"));
        Uri uriWithAppendedId = ContentUris.withAppendedId(Build.VERSION.SDK_INT >= 29 ? MediaStore.Video.Media.getContentUri(cursor.getString(cursor.getColumnIndexOrThrow("volume_name"))) : contentUri, j10);
        s.g(uriWithAppendedId, "withAppendedId(...)");
        return new ng.d(null, uriWithAppendedId, path, str, title, j11, i10, i11, j12, 0, 0L, 0L, 0L, 0L, 0.0f, null, 0, null, 0, false, 1048065, null);
    }

    @Override // rh.g
    protected String d() {
        String string = this.f51344d.getString(R.string.all_videos);
        s.g(string, "getString(...)");
        return string;
    }

    @Override // rh.g
    protected Uri f() {
        Uri EXTERNAL_CONTENT_URI = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        s.g(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        return EXTERNAL_CONTENT_URI;
    }

    @Override // rh.g
    protected String[] h() {
        return new String[]{"%.mp4"};
    }

    @Override // rh.g
    protected String i() {
        return "_data LIKE ?";
    }

    @Override // rh.g
    protected void l(ArrayList projectionList) {
        s.h(projectionList, "projectionList");
        projectionList.add("duration");
        projectionList.add("width");
        projectionList.add("height");
        projectionList.add("_size");
    }
}
